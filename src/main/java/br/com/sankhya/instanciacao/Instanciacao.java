/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 26/06/2019 
 * Objetivo sucinto do programa: Classe para realizar testes do programa
 * Referência ao enunciado/origem do exercício: Projeto de Pacotes Turísticos
 */

package br.com.sankhya.instanciacao;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sankhya.dominio.Cliente;
import br.com.sankhya.dominio.Contrato;
import br.com.sankhya.dominio.Hotel;
import br.com.sankhya.dominio.Item;
import br.com.sankhya.dominio.Pacote;
import br.com.sankhya.dominio.Passeio;
import br.com.sankhya.servico.ClienteServico;
import br.com.sankhya.servico.ContratoServico;
import br.com.sankhya.servico.HotelServico;
import br.com.sankhya.servico.ItemServico;
import br.com.sankhya.servico.PacoteServico;
import br.com.sankhya.servico.PasseioServico;
import br.com.sankhya.servico.ServicoException;

@WebServlet("/Instanciacao")
public class Instanciacao extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {

			Cliente cliente1 = new Cliente(null,"Ilton","ilton@gmail.com","32234013","023303200329",sdf.parse("11/12/2001"),new BigDecimal("10.00"));
			Cliente cliente2 = new Cliente(null,"Fabio","Lucio@gmail.com","32325023","094678200329",sdf.parse("11/12/2002"),new BigDecimal("50.00"));
			
			Hotel hotel1 = new Hotel(null,"Hotel xian chan","Taokey", new BigDecimal("300.00"));
			Hotel hotel2 = new Hotel(null,"Hotel chain vain","Laikan", new BigDecimal("100.00"));

			Passeio passeio1 = new Passeio(null,"Volta no park", new BigDecimal("100.00"),"Havai");
			Passeio passeio2 = new Passeio(null,"Andar 100km", new BigDecimal("50.00"),"Dubai");
			
			Pacote pacote1 = new Pacote(null,"Toperson",30,hotel1);
			Pacote pacote2 = new Pacote(null,"Loperson",60,hotel2);
			
			Item item1 = new Item(null,30,pacote1,passeio1);
			Item item2 = new Item(null,90,pacote2,passeio2);
			
			Contrato contrato1 = new Contrato(null,sdf.parse("14/03/2019"),cliente1, pacote1);
			Contrato contrato2 = new Contrato(null,sdf.parse("14/03/2018"),cliente2, pacote2);
	
			ClienteServico clienteServico = new ClienteServico();
			ContratoServico contratoServico = new ContratoServico();
			HotelServico hotelServico = new HotelServico();
			ItemServico itemServico = new ItemServico();
			PacoteServico pacoteServico = new PacoteServico();
			PasseioServico passeioServico = new PasseioServico();
			
			clienteServico.inserirAtualizar(cliente1);
			clienteServico.inserirAtualizar(cliente2);
			
			
			response.getWriter().append("\nBanco de dados persistido");
			
			} catch(ParseException e) {
				response.getWriter().append("Erro ao instanciar data. Instância não criada");
			} catch (ServicoException e) {
				response.getWriter().append("Erro! " + e.getMessage());
			}	
	}
}