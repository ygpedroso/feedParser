package com.ygpedroso.feedParser.entities;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(strict = false)
public class Guid {

    @Text()
    String value;

    @Attribute(name = "isPermaLink", required = false)
    Boolean isPermaLink;

}
