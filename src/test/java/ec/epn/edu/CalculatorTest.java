package ec.epn.edu;

import ec.epn.edu.calculator.Calculator;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c = null;

    // En Junit 4 se usaba @BeforeClass, en Junit 5 se usa @BeforeAll
    // Se ejecuta una sola vez antes de todas las pruebas (@test) para inicializar el objeto Calculator
    @BeforeAll
    static void setUpClase() {
        System.out.println("Before all tests");
    }

    //Se ejecuta antes de cada prueba (@test) para inicializar el objeto Calculator
    // En Junit 4 se usaba @Before, en Junit 5 se usa @BeforeEach
    @BeforeEach
    void setUp() {
        c = new Calculator();
    }

    @Test
    void given_two_positive_numbers_when_addition_them_then_return_sum() {
        assertEquals(5, c.addition(2, 3));
    }

    @Test
    void given_two_numbers_when_subtract_them_then_return_difference() {
        assertEquals(2, c.subtraction(5, 3));
    }

    // En Junit 4 se usaba @Test(expected = ArithmeticException.class) para que la prueba pase
    // si se lanza la excepción, en Junit 5 se usa assertThrows
    // si no sale una excepción, la prueba falla
    @Test
    void given_two_numbers_when_division_them_then_return_quotient() {
        assertThrows(ArithmeticException.class, () -> c.division(5, 0));
    }

    // En Junit 4 se usaba @Test(timeout = 50), en Junit 5 se usa @Timeout
    // si la prueba tarda más de 50 milisegundos, la prueba falla
    @Test
    @Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
    void given_two_numbers_when_multiply_them_then_return_product() {
        assertEquals(6, c.multiplication(2, 3));
    }

    // En Junit 4 se usaba @After, en Junit 5 se usa @AfterEach
    // Se ejecuta después de cada prueba (@test) para limpiar el objeto Calculator
    @AfterEach
    void tearDown() {
        c.setAns(0);
    }

    // En Junit 4 se usaba @AfterClass, en Junit 5 se usa @AfterAll
    // Se ejecuta una sola vez después de todas las pruebas (@test) para limpiar el objeto Calculator
    @AfterAll
    static void tearDownClass() {
        System.out.println("After all tests");
    }
}