package com.ygpedroso.feedParser

import com.ygpedroso.feedParser.Parser.Type.*
import com.ygpedroso.feedParser.entities.Rss
import com.ygpedroso.feedParser.transformers.DateTransformer
import org.simpleframework.xml.core.Persister
import org.simpleframework.xml.stream.InputNode
import org.simpleframework.xml.transform.RegistryMatcher
import java.io.File
import java.io.InputStream
import java.io.Reader
import java.util.*

class Parser {
    private var feed: Any
    private var type: Type
    private val registryMatcher: RegistryMatcher = RegistryMatcher()
    private var serializer: Persister

    enum class Type {
        INPUT_STREAM, FILE, READER,
        STRING, INPUT_NODE
    }

    init {
        registryMatcher.bind(Date::class.java, DateTransformer())
        serializer = Persister(registryMatcher)
    }

    constructor(inputStream: InputStream) {
        feed = inputStream
        type = INPUT_STREAM
    }

    constructor(file: File) {
        feed = file
        type = FILE
    }

    constructor(reader: Reader) {
        feed = reader
        type = READER
    }

    constructor(string: String) {
        feed = string
        type = STRING
    }

    constructor(inputNode: InputNode) {
        feed = inputNode
        type = INPUT_NODE
    }

    fun getRss(): Rss {
        return when (type) {
            INPUT_STREAM -> serializer.read(Rss::class.java, feed as InputStream, false)
            FILE -> serializer.read(Rss::class.java, feed as File, false)
            READER -> serializer.read(Rss::class.java, feed as Reader, false)
            STRING -> serializer.read(Rss::class.java, feed as String, false)
            INPUT_NODE -> serializer.read(Rss::class.java, feed as InputNode, false)
        }
    }
}
