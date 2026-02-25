import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.suma(2, 3));
    }

    @Test
    public void testResta() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.resta(4, 3));
    }

    @Test
    public void testMultiplicacio() {
        Calculadora calc = new Calculadora();
        assertEquals(20, calc.multiplicacio(4, 5));
    }

    @Test
    public void testDivisioPerZero() {
        Calculadora calc = new Calculadora();

        // Usamos assertThrows y le pasamos el tipo de excepción esperada
        // y una expresión lambda "()->" con el código que debería fallar
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divisio(10, 0);
        });
    }
}