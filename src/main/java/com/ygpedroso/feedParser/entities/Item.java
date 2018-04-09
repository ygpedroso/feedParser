package com.ygpedroso.feedParser.entities;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

import java.util.*;

@NamespaceList({
        @Namespace(reference = "http://purl.org/rss/1.0/modules/slash/", prefix = "slash"),
        @Namespace(reference = "http://wellformedweb.org/CommentAPI/", prefix = "wfw"),
        @Namespace(reference = "http://purl.org/dc/elements/1.1/", prefix = "dc"),
        @Namespace(reference = "http://purl.org/rss/1.0/modules/content/", prefix = "content"),
        @Namespace(reference = "http://search.yahoo.com/mrss/", prefix = "media"),
})
@Root(name = "item", strict = false)
public class Item {

    @ElementList(entry = "title", inline = true, data = true)
    List<Title> titles;

    @Element(name = "link")
    String link;

    @Element(name = "url", required = false)
    String url;

    @ElementList(entry = "description", inline = true, data = true)
    List<String> descriptions;

    @Element(name = "encoded", data = true, required = false)
    String encoded;

    @Element(name = "author", required = false)
    String author;

    @Element(name = "creator", required = false, data = true)
    String creator;

    @ElementList(entry = "category", inline = true, required = false)
    List<String> categories;

    @ElementList(entry = "comments", inline = true, required = false)
    List<String> comments;

    @Element(name = "commentRss", required = false)
    String commentRss;

    @Element(name = "enclosure", required = false)
    Enclosure enclosure;

    @Element(name = "guid", required = false)
    Guid guid;

    @Element(name = "pubDate", required = false)
    Date pubDate;

    @Element(name = "source", required = false)
    String source;

    @ElementList(entry = "content", inline = true, required = false)
    List<Content> contents;

    @Element(name = "thumbnail", required = false)
    Thumbnail thumbnail;
}
