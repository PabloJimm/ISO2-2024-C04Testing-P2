package problema2;

public class Cliente {
	private int edad; 
	private boolean mayorEdad;
	private boolean estudiante; //Se considerara el false de esta variable como "trabajando".
	private boolean desplazado;
	private String Cuenta;

	 // Constructor
    public Cliente(int edad, boolean estudiante, boolean desplazado) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edad;
        this.mayorEdad = edad >= 18;
        this.estudiante = estudiante;
        this.desplazado = desplazado;
    }

    // Getters y Setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        this.mayorEdad = edad >= 18; // Recalcular si es mayor de edad al cambiar la edad.
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }

    public boolean isEstudiante() {
        return estudiante;
    }
    public void setCuenta(String cuenta) {
    	this.Cuenta= cuenta;
    }
    public String getCuenta() {
    	return Cuenta;
    }

    public void setEstudiante(boolean estudiante) {
        this.estudiante = estudiante;
    }

    public boolean isDesplazado() {
        return desplazado;
    }

    public void setDesplazado(boolean desplazado) {
        this.desplazado = desplazado;
    }
}
