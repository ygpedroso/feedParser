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

    @ElementList(entry = "item", inline = true, required = false)
    public List<Item> items;

    @Element(required = false)
    public String title;

    @Element(required = false)
    public String language;

    @Element(name = "description", required = false)
    public String description;

    @Element(name = "pubDate", required = false)
    public Date pubDate;

    @Element(name = "lastBuildDate", required = false)
    public Date lastBuildDate;

    @Element(name = "managingEditor", required = false)
    public String managingEditor;

    @Element(name = "generator", required = false)
    public String generator;

    @Element(name = "docs", required = false)
    public String docs;

    @Element(name = "updatePeriod", required = false)
    public String updatePeriod;

    @Element(name = "updateFrequency", required = false)
    public String updateFrequency;

    @Element(name = "copyright", required = false)
    public String copyright;

    @Element(name = "ttl", required = false)
    public String ttl;

    @Element(name = "image", required = false)
    public Image image;
}
