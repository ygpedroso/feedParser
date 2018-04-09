package com.ygpedroso.feedParser.transformers

import com.ygpedroso.feedParser.utils.Constants
import org.simpleframework.xml.transform.Transform
import java.text.SimpleDateFormat
import java.util.*

class DateTransformer: Transform<Date> {
    var formatter = SimpleDateFormat(Constants.RFC_822_DATE_STANDARD)

    override fun write(value: Date?): String {
        return formatter.format(value)
    }

    override fun read(value: String?): Date {
        return formatter.parse(value)
    }
}
