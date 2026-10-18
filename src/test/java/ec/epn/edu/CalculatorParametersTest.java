package ec.epn.edu;

import ec.epn.edu.calculator.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

// En Junit 4 se usaba @RunWith(Parameterized.class), en Junit 5 se usa @ParameterizedTest en el codigo
class CalculatorParametersTest {
    /*
    Asi se hace en Junit 4, en Junit 5 se usa @ParameterizedTest y @CsvSource o @MethodSource
    private int a, b , expected;
    public static  Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{1, 2, 3});
        objects.add(new Object[]{2, 3, 5});
        objects.add(new Object[]{3, 4, 7});
        objects.add(new Object[]{4, 5, 9});
        return objects;
    }
    public CalculatorParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    void given_two_numbers_when_addition_them_then_return_sum() {
       Calculator c = new Calculator();
       int actual = c.addition(a, b);
       assertEquals(expected, actual);
    }
    */
    // Usando @CsvSource para pasar los parámetros a la prueba, cada línea es un conjunto de parámetros


    /* Metodo que provee exactamente los mismos pares de datos que el profesor
    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(2, 4, 6),
                Arguments.of(1, 8, 9),
                Arguments.of(2, 5, 7),
                Arguments.of(7, 3, 10),
                Arguments.of(22, 4, 26),
                Arguments.of(12, 14, 26)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    ahi va el metodo de prueba, que recibe los parámetros a, b y expected
    */
    @ParameterizedTest
    @CsvSource({
            "2, 4, 6",
            "1, 8, 9",
            "2, 5, 7",
            "7, 3, 10",
            "22, 4, 26",
            "12, 14, 26"
    })

    // Aqui no debe ir el @Test porque en Juit 5 se usa @ParameterizedTest para indicar
    // que es una prueba parametrizada
    void given_parameters_when_addition_then_ok(int a, int b, int expected) {
        Calculator c = new Calculator();
        int actual = c.addition(a, b);
        assertEquals(expected, actual);
    }
}