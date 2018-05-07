package com.ygpedroso.feedParser.entities;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class Image {

    @Element(name = "title", required = false)
    public String title;

    @Element(name = "url", required = false)
    public String url;

    @Element(name = "link", required = false)
    public String link;

    @Element(name = "width", required = false)
    public String width;

    @Element(name = "height", required = false)
    public String height;

    @Element(name = "description", required = false, data = true)
    public String description;
}
