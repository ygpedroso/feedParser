package com.ygpedroso.feedParser.entities;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(strict = false)
public class Link {
    @Attribute(required = false)
    public String href;

    @Attribute(required = false)
    public String rel;

    @Attribute(name = "type", required = false)
    public String type;

    @Text(required = false)
    public String value;
}
