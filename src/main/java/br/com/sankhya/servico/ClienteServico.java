package br.com.sankhya.servico;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.ValidationException;

import br.com.sankhya.dao.ClienteDao;
import br.com.sankhya.dao.DaoFactory;
import br.com.sankhya.dao.Transaction;
import br.com.sankhya.dominio.Cliente;

public class ClienteServico {
	private ClienteDao dao;

	public ClienteServico() {
		dao = DaoFactory.criarClienteDao();
	}

	public void validar(Cliente x) throws ValidationException {
		List<String> erros = new ArrayList<>();

		if (x.getNome() == null) {
			erros.add("Por favor preencher o campo nome");
		}
		if (x.getEmail() == null) {
			erros.add("Por favor preencher o campo do e-mail");
		}
		if (x.getTelefone() == null) {
			erros.add("Por favor preencher o campo do numero");
		}

		if (x.getCpf() == null) {
			erros.add("Por favor preencher o campo do CPF");
		}

		if (x.getNascimento() == null) {
			erros.add("Por favor preencher o campo de Nascimento");
		}

		if (x.getRendaMensal() == null) {
			erros.add("Por favor preencher o campo de nascimento");
		}
	}

	public void inserir(Cliente x) throws ServicoException {
		try {
			Cliente aux = dao.buscaNomeExato(x.getNome());
			if (aux != null) {
				throw new ServicoException("Já existe um artista com esse nome!", 1);
			}

			Transaction.begin();
			dao.inserirAtualizar(x);
			Transaction.commit();
		} catch (RuntimeException e) {
			if (Transaction.isActive()) {
				Transaction.rollback();
			}
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void atualizar(Cliente x) throws ServicoException {
		try {
			Cliente aux = dao.buscaNomeExatoDiferente(x.getCodCliente(), x.getNome());
			if (aux != null) {
				throw new ServicoException("Já existe um artista com esse nome!", 1);
			}

			Transaction.begin();
			dao.inserirAtualizar(x);
			Transaction.commit();
		} catch (RuntimeException e) {
			if (Transaction.isActive()) {
				Transaction.rollback();
			}
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void excluir(Cliente x) throws ServicoException {
		try {
			x = dao.buscar(x.getCodCliente());
			if (!x.getContratos().isEmpty()) {
				throw new ServicoException("Exclusão não permitida: este artista possui participações!", 2);
			}

			Transaction.begin();
			dao.excluir(x);
			Transaction.commit();
		} catch (RuntimeException e) {
			if (Transaction.isActive()) {
				Transaction.rollback();
			}
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public Cliente buscar(int cod) {
		return dao.buscar(cod);
	}

	public List<Cliente> buscarTodos() {
		return dao.buscarTodos();
	}

	public List<Cliente> buscarTodosOrdenadosPorNome() {
		return dao.buscarTodosOrdenadosPorNome();
	}

	public List<Cliente> buscarPorNome(String trecho) {
		return dao.buscarPorNome(trecho);
	}

}
