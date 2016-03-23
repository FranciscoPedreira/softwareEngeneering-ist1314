
package pt.chequerefeicao.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ValorInvalido", targetNamespace = "urn:pt:chequerefeicao:ws")
public class ValorInvalido_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ValorInvalido faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ValorInvalido_Exception(String message, ValorInvalido faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ValorInvalido_Exception(String message, ValorInvalido faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: pt.chequerefeicao.ws.ValorInvalido
     */
    public ValorInvalido getFaultInfo() {
        return faultInfo;
    }

}
