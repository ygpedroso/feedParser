package com.ygpedroso.feedParser.entities;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class Image {

    @Element(name = "title", required = false)
    String title;

    @Element(name = "url", required = false)
    String url;

    @Element(name = "link", required = false)
    String link;

    @Element(name = "width", required = false)
    String width;

    @Element(name = "height", required = false)
    String height;

    @Element(name = "description", required = false, data = true)
    String description;
}
