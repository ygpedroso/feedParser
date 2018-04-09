package com.ygpedroso.feedParser.utils

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.Assert.assertEquals

@RunWith(JUnit4::class)
class ConstantsTest {

    @Test
    @Throws(Exception::class)
    fun readMethodShouldReturnValidDate() {
        assertEquals(Constants.RFC_822_DATE_STANDARD, "EEE, dd MMM yyyy HH:mm:ss Z")
    }

}