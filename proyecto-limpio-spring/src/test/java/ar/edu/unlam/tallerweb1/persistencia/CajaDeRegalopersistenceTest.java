package ar.edu.unlam.tallerweb1.persistencia;

import javax.transaction.Transactional;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.CajaDeRegalo;
import static org.assertj.core.api.Assertions.*;


public class CajaDeRegalopersistenceTest extends SpringTest{

	@Test @Transactional @Rollback
	public void guardarunaCajaDeRegaloTest() {
		CajaDeRegalo cajita = new CajaDeRegalo();
		cajita.setNombre("CAJA");
		cajita.setDescripcion("Una Caja genial!");
		cajita.setPrecio(1200.0);
		
		session().save(cajita);
		
		assertThat(session().get(CajaDeRegalo.class, cajita.getId())).isNotNull();
		
	}
}
