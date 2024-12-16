package problema2;

public class Principal {
	  public static void main(String[] args) {
		Cliente cliente = new Cliente(26,false,false);
		AsignarCuenta(cliente);
	
	  }

	  public static void AsignarCuenta(Cliente cliente) {
        try {
            if (cliente == null) {
                throw new IllegalArgumentException("El cliente no puede ser nulo.");
            }

            if (cliente.getEdad() < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa.");
            }

            if (!cliente.isMayorEdad() && cliente.isEstudiante() && !cliente.isDesplazado()) {
                cliente.setCuenta("Cuenta Confort");
            } else if (cliente.getEdad() < 25 && cliente.isEstudiante() && cliente.isDesplazado()) {
                cliente.setCuenta("Cuenta Vamos que tú puedes");
            } else if (cliente.isMayorEdad() && !(cliente.getEdad() > 25) && !cliente.isEstudiante() && !cliente.isDesplazado()) {
                cliente.setCuenta("Cuenta Ahorra ahora que puedes");
            } else if (cliente.isMayorEdad() && !cliente.isEstudiante() && cliente.isDesplazado()) {
                cliente.setCuenta("Cuenta Saltando del Nido");
            } else if (cliente.getEdad() > 25 && !cliente.isEstudiante() && !cliente.isDesplazado()) {
                cliente.setCuenta("Cuenta Independízate que va siendo hora");
            } else if (cliente.getEdad() > 25 && !cliente.isEstudiante() && cliente.isDesplazado()) {
                cliente.setCuenta("Cuenta Bienvenido a la Vida Adulta");
            } else {
                System.out.println("No se ha encontrado Cuenta para usted.");
                return;
            }

            System.out.println("Se le ofrece: " + cliente.getCuenta());
        } catch (Exception e) {
            System.out.println("Error al asignar la cuenta: " + e.getMessage());
        }
    }