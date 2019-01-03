package com.dayang.www.DYESB;

public class GetItemDetailPortProxy implements com.dayang.www.DYESB.GetItemDetailPort {
  private String _endpoint = null;
  private com.dayang.www.DYESB.GetItemDetailPort getItemDetailPort = null;
  
  public GetItemDetailPortProxy() {
    _initGetItemDetailPortProxy();
  }
  
  public GetItemDetailPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetItemDetailPortProxy();
  }
  
  private void _initGetItemDetailPortProxy() {
    try {
      getItemDetailPort = (new com.dayang.www.DYESB.GetItemDetailServiceLocator()).getGetItemDetailService();
      if (getItemDetailPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getItemDetailPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getItemDetailPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getItemDetailPort != null)
      ((javax.xml.rpc.Stub)getItemDetailPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.dayang.www.DYESB.GetItemDetailPort getGetItemDetailPort() {
    if (getItemDetailPort == null)
      _initGetItemDetailPortProxy();
    return getItemDetailPort;
  }
  
  public MREML_pkg.MREML getItemDetail(MREML_pkg.MREML getItemDetailInput) throws java.rmi.RemoteException{
    if (getItemDetailPort == null)
      _initGetItemDetailPortProxy();
    return getItemDetailPort.getItemDetail(getItemDetailInput);
  }
  
  public com.dayang.www.ESB.schema.Monitor._0_1.GetServiceInfoResponseType getServiceInfo(com.dayang.www.ESB.schema.Monitor._0_1.GetServiceInfoRequestType getServiceInfoRequest) throws java.rmi.RemoteException{
    if (getItemDetailPort == null)
      _initGetItemDetailPortProxy();
    return getItemDetailPort.getServiceInfo(getServiceInfoRequest);
  }
  
  
}