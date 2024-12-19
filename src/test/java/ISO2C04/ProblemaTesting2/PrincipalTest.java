package ISO2C04.ProblemaTesting2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class PrincipalTest {

    @Test
    public void testAsignarCuentaConfort() {
        Cliente cliente = new Cliente(17, true, false);
        Principal.AsignarCuenta(cliente);
        assertEquals("Cuenta Confort", cliente.getCuenta());
    }

    @Test
    public void testAsignarCuentaVamosQueTuPuedes() {
        Cliente cliente = new Cliente(20, true, true);
        Principal.AsignarCuenta(cliente);
        assertEquals("Cuenta Vamos que tú puedes", cliente.getCuenta());
    }

    @Test
    public void testAsignarCuentaAhorraAhoraQuePuedes() {
        Cliente cliente = new Cliente(22, false, false);
        Principal.AsignarCuenta(cliente);
        assertEquals("Cuenta Ahorra ahora que puedes", cliente.getCuenta());
    }

    @Test
    public void testAsignarCuentaSaltandoDelNido() {
        Cliente cliente = new Cliente(18, false, true);
        Principal.AsignarCuenta(cliente);
        assertEquals("Cuenta Saltando del Nido", cliente.getCuenta());
    }

    @Test
    public void testAsignarCuentaIndependizate() {
        Cliente cliente = new Cliente(28, false, false);
        Principal.AsignarCuenta(cliente);
        assertEquals("Cuenta Independízate que va siendo hora", cliente.getCuenta());
    }

    @Test
    public void testAsignarCuentaBienvenidoALaVidaAdulta() {
        Cliente cliente = new Cliente(35, false, true);
        Principal.AsignarCuenta(cliente);
        assertEquals("Cuenta Bienvenido a la Vida Adulta", cliente.getCuenta());
    }

    @Test
    public void testSinCuentaAsignada() {
        Cliente cliente = new Cliente(15, false, false);
        Principal.AsignarCuenta(cliente);
        assertNull(cliente.getCuenta());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClienteNulo() {
    	Cliente cliente = null;
        Principal.AsignarCuenta(cliente);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEdadNegativa() {
        Cliente cliente = new Cliente(-5, true, false);
        Principal.AsignarCuenta(cliente);
    }
}
