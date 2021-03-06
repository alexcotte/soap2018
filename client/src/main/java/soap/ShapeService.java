
package soap;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ShapeService", targetNamespace = "http://soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ShapeService {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "helloWord", targetNamespace = "http://soap/", className = "soap.HelloWord")
    @ResponseWrapper(localName = "helloWordResponse", targetNamespace = "http://soap/", className = "soap.HelloWordResponse")
    @Action(input = "http://soap/ShapeService/helloWordRequest", output = "http://soap/ShapeService/helloWordResponse")
    public String helloWord();

}
