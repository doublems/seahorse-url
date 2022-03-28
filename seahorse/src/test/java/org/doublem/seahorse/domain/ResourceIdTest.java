package org.doublem.seahorse.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResourceIdTest {

    @Test
    public void translate_decimal_to_base62() throws Exception {

        ResourceId resourceId = ResourceId.builder().build();

        int testDecimalNumber = 1000;
        String expected = "g8";

        String result = resourceId.translate(testDecimalNumber);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void translate_base62_to_decimal() throws Exception {

        ResourceId resourceId = ResourceId.builder().build();

        String testBase62Number = "g8";
        int expected = 1000;

        int result = resourceId.translate(testBase62Number);
        assertThat(result).isEqualTo(expected);
    }
}
