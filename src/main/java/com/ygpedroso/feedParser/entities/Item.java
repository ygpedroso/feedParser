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
    public List<Title> titles;

    @Element(name = "link")
    public String link;

    @Element(name = "url", required = false)
    public String url;

    @ElementList(entry = "description", inline = true, data = true)
    public List<String> descriptions;

    @Element(name = "encoded", data = true, required = false)
    public String encoded;

    @Element(name = "author", required = false)
    public String author;

    @Element(name = "creator", required = false, data = true)
    public String creator;

    @ElementList(entry = "category", inline = true, required = false)
    public List<String> categories;

    @ElementList(entry = "comments", inline = true, required = false)
    public List<String> comments;

    @Element(name = "commentRss", required = false)
    public String commentRss;

    @Element(name = "enclosure", required = false)
    public Enclosure enclosure;

    @Element(name = "guid", required = false)
    public Guid guid;

    @Element(name = "pubDate", required = false)
    public Date pubDate;

    @Element(name = "source", required = false)
    public String source;

    @ElementList(entry = "content", inline = true, required = false)
    public List<Content> contents;

    @Element(name = "thumbnail", required = false)
    public Thumbnail thumbnail;
}
