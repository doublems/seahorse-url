package org.doublem.seahorse.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Base62Test {

    @Test
    public void Base62executeTest_decimal_to_base62() throws Exception {

        int testDecimalNumber = 1000;
        String expected = "g8";

        String result = Base62.execute(testDecimalNumber);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void Base62executeTest_base62_to_decimal() throws Exception {

        String testBase62Number = "g8";
        int expected = 1000;

        int result = Base62.execute(testBase62Number);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void Base62executeTest_base62_to_decimal_fail() throws Exception {

        String testBase62Number = "!!";

        Throwable exception = assertThrows(RuntimeException.class, () -> {
            Base62.execute(testBase62Number);
        });

        assertEquals(CustomError.NO_BASE62_CODE.toString(), exception.getMessage());
    }
}