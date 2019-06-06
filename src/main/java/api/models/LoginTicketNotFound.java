package alfresco.s.api.login.models;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exception" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="callstack" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "status",
        "message",
        "exception",
        "callstack",
        "server",
        "time"
})
@XmlRootElement(name = "response")
public class LoginTicketNotFound {

    @XmlElement(required = true)
    protected LoginTicketNotFound.Status status;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    protected Object exception;
    @XmlElement(required = true)
    protected Object callstack;
    @XmlElement(required = true)
    protected String server;
    @XmlElement(required = true)
    protected String time;

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link LoginTicketNotFound.Status }
     *
     */
    public LoginTicketNotFound.Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link LoginTicketNotFound.Status }
     *
     */
    public void setStatus(LoginTicketNotFound.Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the exception property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getException() {
        return exception;
    }

    /**
     * Sets the value of the exception property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setException(Object value) {
        this.exception = value;
    }

    /**
     * Gets the value of the callstack property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getCallstack() {
        return callstack;
    }

    /**
     * Sets the value of the callstack property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setCallstack(Object value) {
        this.callstack = value;
    }

    /**
     * Gets the value of the server property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServer(String value) {
        this.server = value;
    }

    /**
     * Gets the value of the time property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTime(String value) {
        this.time = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "code",
            "name",
            "description"
    })
    public static class Status {

        protected int code;
        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String description;

        /**
         * Gets the value of the code property.
         *
         */
        public int getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         *
         */
        public void setCode(int value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the description property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDescription(String value) {
            this.description = value;
        }

    }

    //---------------------------------------------------
    /**
     * This object contains factory methods for each
     * Java content interface and Java element interface
     * generated in the pojo package.
     * <p>An ObjectFactory allows you to programatically
     * construct new instances of the Java representation
     * for XML content. The Java representation of XML
     * content can consist of schema derived interfaces
     * and classes representing the binding of schema
     * type definitions, element declarations and model
     * groups.  Factory methods for each of these are
     * provided in this class.
     *
     */
    @XmlRegistry
    public class ObjectFactory {


        /**
         * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pojo
         *
         */
        public ObjectFactory() {
        }

        /**
         * Create an instance of {@link LoginTicketNotFound }
         *
         */
        public LoginTicketNotFound createResponse() {
            return new LoginTicketNotFound();
        }

        /**
         * Create an instance of {@link LoginTicketNotFound.Status }
         *
         */
        public LoginTicketNotFound.Status createResponseStatus() {
            return new LoginTicketNotFound.Status();
        }

    }
}
