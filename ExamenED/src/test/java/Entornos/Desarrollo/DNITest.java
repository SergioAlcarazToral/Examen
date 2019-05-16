package Entornos.Desarrollo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DNITest {
	
	private static final boolean FORMATO_CORRECTO = true;
	private static final boolean FORMATO_INCORRECTO = false;
	private static final String LETRA_DNI_CORRECTA = "T";
	DNI dni = new DNI("00000000T");
	
	@Test
	public void verificarFormatoCorrecto() {
		assertEquals(FORMATO_CORRECTO, dni.comprovarDNI());
	}
	@Test
	public void verificarFormatoIncorrecto() {
		assertEquals(FORMATO_INCORRECTO, dni.comprovarDNI());
	}
	@Test
	public void verificarGeneracionLetraCorrecta() {
		assertEquals(LETRA_DNI_CORRECTA, dni.generacionLetra(00000000));
	}
	@Test
	public void verificarGeneracionLetraIncorrecta(){
		assertEquals(LETRA_DNI_CORRECTA,dni.generacionLetra(00000005));
	}

	
	
	

}
