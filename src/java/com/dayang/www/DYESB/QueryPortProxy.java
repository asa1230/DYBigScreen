package com.dayang.www.DYESB;

public class QueryPortProxy implements com.dayang.www.DYESB.QueryPort {
  private String _endpoint = null;
  private com.dayang.www.DYESB.QueryPort queryPort = null;
  
  public QueryPortProxy() {
    _initQueryPortProxy();
  }
  
  public QueryPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initQueryPortProxy();
  }
  
  private void _initQueryPortProxy() {
    try {
      queryPort = (new com.dayang.www.DYESB.QueryServiceLocator()).getQueryService();
      if (queryPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)queryPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)queryPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (queryPort != null)
      ((javax.xml.rpc.Stub)queryPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.dayang.www.DYESB.QueryPort getQueryPort() {
    if (queryPort == null)
      _initQueryPortProxy();
    return queryPort;
  }
  
  public MREML_pkq.MREML query(MREML_pkq.MREML queryInput) throws java.rmi.RemoteException{
    if (queryPort == null)
      _initQueryPortProxy();
    return queryPort.query(queryInput);
  }
  
  
}