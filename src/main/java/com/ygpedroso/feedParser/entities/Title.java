package com.ygpedroso.feedParser.entities;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(strict = false)
public class Title {

    @Text(required = false)
    public String value;

    @Attribute(name = "type", required = false)
    public String type;
}
