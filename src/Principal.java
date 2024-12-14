package problema2;

public class Principal {
	  public static void main(String[] args) {
		Cliente cliente = new Cliente(26,false,false);
		AsignarCuenta(cliente);
	  }

	public static void AsignarCuenta(Cliente cliente) {
		if (!cliente.isMayorEdad() && cliente.isEstudiante() && !cliente.isDesplazado()) {
			cliente.setCuenta("Cuenta Confort");
		} else if (cliente.getEdad() < 25 && cliente.isEstudiante() && cliente.isDesplazado()) {
			cliente.setCuenta("Cuenta Vamos que tú puedes");
		} else if (cliente.isMayorEdad() && !(cliente.getEdad() > 25) && !cliente.isEstudiante() && !cliente.isDesplazado()) {
			//Para esta cuenta se deberia añadir la condicion de no superar los 25 para que haya una diferencia clara con "Independízate que va siendo hora")
			cliente.setCuenta("Cuenta Ahorra ahora que puedes");
		} else if (cliente.isMayorEdad() && !cliente.isEstudiante() && cliente.isDesplazado()) {
			cliente.setCuenta("Cuenta Saltando del Nido");
		} else if (cliente.getEdad() > 25  && !cliente.isEstudiante() && !cliente.isDesplazado()) {
			cliente.setCuenta("Cuenta Independízate que va siendo hora");
		} else if (cliente.getEdad() > 25 && !cliente.isEstudiante() && cliente.isDesplazado()) {
			cliente.setCuenta("Cuenta Bienvenido a la Vida Adulta");
		} else {
			System.out.println("No se ha encontrado Cuenta para usted.");
		}
		System.out.println("Se le ofrece: " + cliente.getCuenta());
	}
}
