package Entornos.Desarrollo;

public class DNI {

	String DNI;

	public DNI(String dNI) {
		super();
		DNI = dNI;
	}

	public String generacionLetra(int numDNI) {
		int resultado =  numDNI % 23;
		System.out.println("El resultado de la operacion es " + resultado);
		
		String[] letra = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
				"H", "L", "C", "K", "E" };
		
		System.out.println("Su letra de DNI es la " + letra[resultado]);
		
		return letra[resultado];
	}

	public boolean comprovarDNI() {
		if (DNI.length() != 9) {
			return false;
		} else {
			return true;
		}
	}

	public String getDNI(String DNI) {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}
}
