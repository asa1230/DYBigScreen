/**
 * GetItemDetailServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dayang.www.DYESB;

public class GetItemDetailServiceLocator extends org.apache.axis.client.Service implements com.dayang.www.DYESB.GetItemDetailService {

    public GetItemDetailServiceLocator() {
    }


    public GetItemDetailServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetItemDetailServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetItemDetailService
    private java.lang.String GetItemDetailService_address = "http://172.16.36.156:8080/mamwebservice/services/GetItemDetailService";

    public java.lang.String getGetItemDetailServiceAddress() {
        return GetItemDetailService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetItemDetailServiceWSDDServiceName = "GetItemDetailService";

    public java.lang.String getGetItemDetailServiceWSDDServiceName() {
        return GetItemDetailServiceWSDDServiceName;
    }

    public void setGetItemDetailServiceWSDDServiceName(java.lang.String name) {
        GetItemDetailServiceWSDDServiceName = name;
    }

    public com.dayang.www.DYESB.GetItemDetailPort getGetItemDetailService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetItemDetailService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetItemDetailService(endpoint);
    }

    public com.dayang.www.DYESB.GetItemDetailPort getGetItemDetailService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.dayang.www.DYESB.GetItemDetailServiceSoapBindingStub _stub = new com.dayang.www.DYESB.GetItemDetailServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGetItemDetailServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetItemDetailServiceEndpointAddress(java.lang.String address) {
        GetItemDetailService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.dayang.www.DYESB.GetItemDetailPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.dayang.www.DYESB.GetItemDetailServiceSoapBindingStub _stub = new com.dayang.www.DYESB.GetItemDetailServiceSoapBindingStub(new java.net.URL(GetItemDetailService_address), this);
                _stub.setPortName(getGetItemDetailServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GetItemDetailService".equals(inputPortName)) {
            return getGetItemDetailService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.dayang.com/DYESB", "GetItemDetailService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.dayang.com/DYESB", "GetItemDetailService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetItemDetailService".equals(portName)) {
            setGetItemDetailServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
