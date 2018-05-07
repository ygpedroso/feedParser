package com.ygpedroso.feedParser.entities;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class Thumbnail {

    @Attribute(name = "height", required = false)
    public String height;

    @Attribute(name = "width", required = false)
    public String width;

    @Attribute(name = "type", required = false)
    public String type;

    @Attribute(name = "url", required = false)
    public String url;
}
