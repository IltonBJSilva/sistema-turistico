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

@WebServlet("/Instanciacao")
public class Instanciacao extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			Cliente cliente1 = new Cliente(null,"Ilton","ilton@gmail.com","32234013","023303200329",sdf.parse("11/12/2001"),new BigDecimal("10.00"));
			Cliente cliente2 = new Cliente(null,"Fabio","Lucio@gmail.com","32325023","094678200329",sdf.parse("11/12/2002"),new BigDecimal("50.00"));
			
			Hotel hotel1 = new Hotel(null,"Hotel xian chan","Taokey", new BigDecimal("300.00"));
			Hotel hotel2 = new Hotel(null,"Hotel chain vain","Laikan", new BigDecimal("100.00"));

			Pacote pacote1 = new Pacote(null,"Toperson",30,hotel1);
			Pacote pacote2 = new Pacote(null,"Loperson",60,hotel2);

			Contrato contrato1 = new Contrato(null,sdf.parse("14/03/2019"),cliente1, pacote1);
			Contrato contrato2 = new Contrato(null,sdf.parse("14/03/2018"),cliente2, pacote2);
			
			Passeio passeio1 = new Passeio(null,"Volta no park", new BigDecimal("100.00"),"Havai");
			Passeio passeio2 = new Passeio(null,"Andar 100km", new BigDecimal("50.00"),"Dubai");

			Item item1 = new Item(null,30,pacote1,passeio1);
			Item item2 = new Item(null,90,pacote2,passeio2);
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("sistema-turistico");
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			
			em.persist(cliente1);
			em.persist(cliente2);
			
			em.persist(hotel1);
			em.persist(hotel2);

			em.persist(pacote1);
			em.persist(pacote2);

			em.persist(contrato1);
			em.persist(contrato2);
			
			em.persist(passeio1);
			em.persist(passeio2);

			em.persist(item1);
			em.persist(item2);
			
			em.getTransaction().commit();
			
			response.getWriter().append("Dados persistidos");

			em.close();
			emf.close();
			
			} catch(ParseException e) {
				response.getWriter().append("Erro ao instanciar data. Instância não criada");
			}
	}

}
