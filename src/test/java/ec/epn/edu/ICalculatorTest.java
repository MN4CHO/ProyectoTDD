package ec.epn.edu;

import ec.epn.edu.calculator.ICalculator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ICalculatorTest {

    @Test
    void given_two_numbers_when_addition_them_then_OK () {
        // No se pupede instanciar a una interfaz, por lo tanto se declara una interfaz
        // pero se instancia a una clase que implementa la interfaz
        // Llamamos a mockito
        ICalculator c = Mockito.mock(ICalculator.class);
        // Configuramos el comportamiento del mock
        Mockito.when(c.addition(2, 4)).thenReturn(6);
        assertEquals(6, c.addition(2, 4));
    }
}