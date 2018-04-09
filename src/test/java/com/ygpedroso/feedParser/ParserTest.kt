package com.ygpedroso.feedParser

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.simpleframework.xml.core.Persister
import org.simpleframework.xml.stream.InputNode
import org.simpleframework.xml.transform.RegistryMatcher
import java.io.File
import java.io.InputStream
import java.io.Reader
import java.lang.reflect.Field

@RunWith(MockitoJUnitRunner::class)
class ParserTest {

    var parser: Parser? = null
    private var typeField: Field? = null

    @Mock
    lateinit var inputStream: InputStream

    @Mock
    lateinit var inputNode: InputNode

    @Mock
    lateinit var reader: Reader

    @Mock
    lateinit var file: File

    @Mock
    lateinit var registryMatcher: RegistryMatcher

    @Mock
    lateinit var serializer: Persister

    @Before
    fun setUp() {
        typeField = Parser::class.java.getDeclaredField("type")
        typeField!!.isAccessible = true
    }

    @Test
    fun shouldHaveCorrectFieldTypeIfParserIsInitializedWithInputStream() {
        parser = Parser(inputStream)
        Assert.assertEquals(typeField!!.get(parser), Parser.Type.INPUT_STREAM)
    }

    @Test
    fun shouldHaveCorrectFieldTypeIfParserIsInitializedWithInputNode() {
        parser = Parser(inputNode)
        Assert.assertEquals(typeField!!.get(parser), Parser.Type.INPUT_NODE)
    }

    @Test
    fun shouldHaveCorrectFieldTypeIfParserIsInitializedWithReader() {
        parser = Parser(reader)
        Assert.assertEquals(typeField!!.get(parser), Parser.Type.READER)
    }

    @Test
    fun shouldHaveCorrectFieldTypeIfParserIsInitializedWithString() {
        parser = Parser("Hello Parser")
        Assert.assertEquals(typeField!!.get(parser), Parser.Type.STRING)
    }

    @Test
    fun shouldHaveCorrectFieldTypeIfParserIsInitializedWithFile() {
        parser = Parser(file)
        Assert.assertEquals(typeField!!.get(parser), Parser.Type.FILE)
    }

}
