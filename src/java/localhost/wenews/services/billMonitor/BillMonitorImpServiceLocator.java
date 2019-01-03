/**
 * BillMonitorImpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.wenews.services.billMonitor;

public class BillMonitorImpServiceLocator extends org.apache.axis.client.Service implements localhost.wenews.services.billMonitor.BillMonitorImpService {

    public BillMonitorImpServiceLocator() {
    }


    public BillMonitorImpServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BillMonitorImpServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for billMonitor
	private java.lang.String billMonitor_address="therealaddressisdefinedbysomewhereelse";

    public java.lang.String getbillMonitorAddress() {
    	System.out.println("地址"+billMonitor_address);
        return billMonitor_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String billMonitorWSDDServiceName = "billMonitor";

    public java.lang.String getbillMonitorWSDDServiceName() {
        return billMonitorWSDDServiceName;
    }

    public void setbillMonitorWSDDServiceName(java.lang.String name) {
        billMonitorWSDDServiceName = name;
    }

    public localhost.wenews.services.billMonitor.BillMonitorImp getbillMonitor() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(billMonitor_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getbillMonitor(endpoint);
    }

    public localhost.wenews.services.billMonitor.BillMonitorImp getbillMonitor(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.wenews.services.billMonitor.BillMonitorSoapBindingStub _stub = new localhost.wenews.services.billMonitor.BillMonitorSoapBindingStub(portAddress, this);
            _stub.setPortName(getbillMonitorWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setbillMonitorEndpointAddress(java.lang.String address) {
        billMonitor_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.wenews.services.billMonitor.BillMonitorImp.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.wenews.services.billMonitor.BillMonitorSoapBindingStub _stub = new localhost.wenews.services.billMonitor.BillMonitorSoapBindingStub(new java.net.URL(billMonitor_address), this);
                _stub.setPortName(getbillMonitorWSDDServiceName());
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
        if ("billMonitor".equals(inputPortName)) {
            return getbillMonitor();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost/wenews/services/billMonitor", "BillMonitorImpService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost/wenews/services/billMonitor", "billMonitor"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("billMonitor".equals(portName)) {
            setbillMonitorEndpointAddress(address);
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
