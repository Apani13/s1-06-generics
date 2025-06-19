package level02;

import level02.exercise2.util.GenericMethods;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GenericMethodsTest {

    @Test
    void givenMixedTypes_whenPrintArgsCalled_thenNoExceptionThrown() {
        assertDoesNotThrow( () ->
                GenericMethods.printArgs("No sé", 2, 3.14, false)
        );
    }
}
