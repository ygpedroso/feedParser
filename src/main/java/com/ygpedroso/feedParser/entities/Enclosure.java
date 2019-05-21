package com.ygpedroso.feedParser.entities;


import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class Enclosure {
    @Attribute(required = false)
    public String url;

    @Attribute(required = false)
    public String type;

    @Attribute(required = false)
    public String length;
}
