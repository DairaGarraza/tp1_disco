package ar.edu.unlam.pb2.tp1;

import org.junit.Assert;
import org.junit.Test;

public class DiscoTest {
	
	@Test
	public void testQueCompruebaRadios() {
		
		Double radioInterior = 5.0;
		Double radioExterior = 10.0;
		Disco miDisco = new Disco(radioInterior,radioExterior);
		
		Double valorObtenido = null;
		if(radioExterior >= radioInterior) {
			valorObtenido = radioExterior - radioInterior;
		}
		
		if(valorObtenido > 0) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
	}
	
	
	@Test
	public void testParaComprobarPerimetroInterior() {
		
		Double radioInterior = 5.0;
		Double radioExterior = 10.0;
		Disco miDisco = new Disco(radioInterior,radioExterior);
		
		Double valorObtenido = miDisco.perimetroInterior();
		
		if(valorObtenido > 0) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	
	@Test
	public void testParaComprobarPerimetroExterior() {
		
		Double radioInterior = 5.0;
		Double radioExterior = 10.0;
		Disco miDisco = new Disco(radioInterior,radioExterior);
		
		Double valorObtenido = miDisco.perimetroExterior();
		
		if(valorObtenido > 0) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	
	@Test
	public void testParaComprobarSuperficie() {
		
		Double radioInterior = 5.0;
		Double radioExterior = 10.0;
		Disco miDisco = new Disco(radioInterior,radioExterior);
		
		Double valorObtenido = miDisco.superficie();
		
		if(valorObtenido > 0) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}
