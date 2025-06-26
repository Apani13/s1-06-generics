package level01;

import level01.exercise1and2.util.NoGenericMethods;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NoGenericMethodsTest {

    @Test
    void givenThreeArgs_whenPrintArgsCalled_thenOutputContainsNumberedLines() {
        assertThrows(NullPointerException.class,
                () -> new NoGenericMethods(null, 3, 'c'));
    }
}

