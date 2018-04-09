package com.ygpedroso.feedParser.entities;


import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class Enclosure {
    @Attribute
    public String url;

    @Attribute
    public String type;

    @Attribute(required = false)
    public String length;
}
