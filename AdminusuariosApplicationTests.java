package com.reto.adminusuarios;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import com.reto.adminusuarios.*;
import com.reto.adminusuarios.entity.Clientes;
import com.reto.adminusuarios.repository.RepositoryCustomers;
import com.reto.adminusuarios.repository.RepositoryGetNewId;

@SpringBootTest
class AdminusuariosApplicationTests {


	@Autowired
	@Qualifier("CustomersRepository")
	
	private RepositoryCustomers repositoryCustomers;
	
	
	@Autowired
	@Qualifier("getNewIdRepository")
	
	private RepositoryGetNewId repositoryGetNewId;
	
	
	
	@Test
	public void crearEstudiante() {
		//String id = repositoryGetNewId.getId().getId();
		Clientes c = new Clientes();
		c.setIDSTUDENT("11111111111111111111");
		c.setNAME("PruebaTestNovatec");
		c.setAGE("32");
		c.setPROGRAMA("Ingenieria");
	    repositoryCustomers.save(c);
	    assertNotNull(repositoryCustomers.findById("11111111111111111111").get());
	}
	@Test
	public void ActualizarColaborador() {
		//String id = repositoryGetNewId.getId().getId();
		Clientes c = new Clientes();
		c.setIDSTUDENT("11111111111111111111");
		c.setNAME("PruebaTest1");
		c.setAGE("32");
		c.setPROGRAMA("Medicina");
	    repositoryCustomers.save(c);
		Clientes c2 = repositoryCustomers.findById("11111111111111111111").get();
		c2.setIDSTUDENT("21111111111111111111");
		c2.setNAME("PruebaTest1");
		c2.setAGE("32");
		c2.setPROGRAMA("Java");
	    repositoryCustomers.save(c2);
	    assertNotNull(repositoryCustomers.findById("21111111111111111111").get());
	}
	
	
	@Test
	public void ListarColaboradores() {
		//String id = repositoryGetNewId.getId().getId();
		Clientes c = new Clientes();
		c.setIDSTUDENT("11111111111111111111");
		c.setNAME("PruebaTest1");
		c.setAGE("32");
		c.setPROGRAMA("Java");
	    repositoryCustomers.save(c);
		Clientes c2 = new Clientes();
		c2.setIDSTUDENT("21111111111111111111");
		c2.setNAME("PruebaTest1");
		c2.setAGE("32");
		c2.setPROGRAMA("Java");
	    repositoryCustomers.save(c2);
	    assertNotNull(repositoryCustomers.findAll());
	}
	
	@Test
	public void EliminarColaboradores() {
		//String id = repositoryGetNewId.getId().getId();
	
		Clientes c = new Clientes();
		c.setIDSTUDENT("11111111111111111111");
		c.setNAME("PruebaTest1");
		c.setAGE("32");
		c.setPROGRAMA("Java");
	    repositoryCustomers.save(c);
	    
	    assertNotNull(repositoryCustomers.findById("11111111111111111111").get());
	    //repositoryCustomers.deleteByIDC("11111111111111111111");

	}

}
