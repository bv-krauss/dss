//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.18 at 02:49:06 PM CET 
//


package eu.europa.esig.dss.jaxb.diagnostic;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.validation.RevocationOriginType;

public class Adapter5
    extends XmlAdapter<String, RevocationOriginType>
{


    public RevocationOriginType unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationOriginTypeParser.parse(value));
    }

    public String marshal(RevocationOriginType value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationOriginTypeParser.print(value));
    }

}
