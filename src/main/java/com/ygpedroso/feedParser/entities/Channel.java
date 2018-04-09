package com.ygpedroso.feedParser.entities;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

import java.util.Date;
import java.util.List;

@NamespaceList({
        @Namespace(reference = "http://www.w3.org/2005/Atom", prefix = "atom"),
        @Namespace(reference = "http://purl.org/rss/1.0/modules/syndication/", prefix = "sy"),
})
@Root(strict = false)
public class Channel {
    @ElementList(entry = "link", inline = true, required = false)
    public List<Link> links;

    @ElementList(entry = "item", inline = true)
    public List<Item> items;

    @Element
    String title;

    @Element
    String language;

    @Element(name = "description", required = false)
    String description;

    @Element(name = "pubDate", required = false)
    Date pubDate;

    @Element(name = "lastBuildDate", required = false)
    Date lastBuildDate;

    @Element(name = "managingEditor", required = false)
    String managingEditor;

    @Element(name = "generator", required = false)
    String generator;

    @Element(name = "docs", required = false)
    String docs;

    @Element(name = "updatePeriod", required = false)
    String updatePeriod;

    @Element(name = "updateFrequency", required = false)
    String updateFrequency;

    @Element(name = "copyright", required = false)
    String copyright;

    @Element(name = "ttl", required = false)
    String ttl;

    @Element(name = "image", required = false)
    Image image;
}
