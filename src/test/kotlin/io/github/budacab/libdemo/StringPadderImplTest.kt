package io.github.budacab.libdemo

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestTemplate

class StringPadderImplTest {
    private val stringPadder = StringPadderFactory.createStringPadder()

    @Test
    fun padLeft() {
        assertThat(stringPadder.padLeft("thegreatapi.com", 20))
                .isEqualTo("     thegreatapi.com");
    }

    @Test
    fun padLeftWithZeros() {
        assertThat(stringPadder.padLeft("thegreatapi.com", 20, '0'))
                .isEqualTo("00000thegreatapi.com");
    }

    @Test
    fun padRight() {
        assertThat(stringPadder.padRight("thegreatapi.com", 20))
                .isEqualTo("thegreatapi.com     ");
    }

    @Test
    fun padRightWithZeros() {
        assertThat(stringPadder.padRight("thegreatapi.com", 20, '0'))
                .isEqualTo("thegreatapi.com00000");
    }

    @Test
    fun padLeftWithInvalidTotalLength() {
        assertThat(stringPadder.padLeft("thegreatapi.com", 3))
                .isEqualTo("thegreatapi.com");
    }

    @Test
    fun padLeftWithZerosInvalidTotalLength() {
        assertThat(stringPadder.padLeft("thegreatapi.com", 3, '0'))
                .isEqualTo("thegreatapi.com");
    }

    @Test
    fun padRightInvalidTotalLength() {
        assertThat(stringPadder.padRight("thegreatapi.com", 3))
                .isEqualTo("thegreatapi.com");
    }

    @Test
    fun padRightWithZerosInvalidTotalLength() {
        assertThat(stringPadder.padRight("thegreatapi.com", 3, '0'))
                .isEqualTo("thegreatapi.com");
    }
}