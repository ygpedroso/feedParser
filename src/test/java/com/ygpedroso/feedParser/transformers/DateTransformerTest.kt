package com.ygpedroso.feedParser.transformers

import com.ygpedroso.feedParser.utils.Constants
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.text.SimpleDateFormat

@RunWith(JUnit4::class)
class DateTransformerTest {

    private val dateTransformer = DateTransformer()

    private val stringDate = "Fri, 05 Dec 2014 01:53:09 +0000"
    private val date = SimpleDateFormat(Constants.RFC_822_DATE_STANDARD).parse(stringDate)

    @Test
    @Throws(Exception::class)
    fun readMethodShouldReturnValidDate() {
        assertEquals(dateTransformer.read(stringDate), date)
    }

    @Test
    @Throws(Exception::class)
    fun writeMethodShouldReturnValidString() {
        dateTransformer.write(date)
    }
}