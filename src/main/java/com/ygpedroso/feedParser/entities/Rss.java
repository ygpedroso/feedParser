package com.ygpedroso.feedParser.entities;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class Rss {

    @Attribute(required = false)
    public String version;

    @Element(required = false)
    public Channel channel;
}
