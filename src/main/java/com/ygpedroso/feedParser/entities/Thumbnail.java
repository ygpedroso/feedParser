package com.ygpedroso.feedParser.entities;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class Thumbnail {

    @Attribute(name = "height", required = false)
    String height;

    @Attribute(name = "width", required = false)
    String width;

    @Attribute(name = "type", required = false)
    String type;

    @Attribute(name = "url", required = false)
    String url;
}
