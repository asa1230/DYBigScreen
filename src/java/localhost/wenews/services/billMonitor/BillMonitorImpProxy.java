package localhost.wenews.services.billMonitor;

public class BillMonitorImpProxy implements localhost.wenews.services.billMonitor.BillMonitorImp {
  private String _endpoint = null;
  private localhost.wenews.services.billMonitor.BillMonitorImp billMonitorImp = null;
  
  public BillMonitorImpProxy() {
    _initBillMonitorImpProxy();
  }
  
  public BillMonitorImpProxy(String endpoint) {
    _endpoint = endpoint;
    _initBillMonitorImpProxy();
  }
  
  private void _initBillMonitorImpProxy() {
    try {
      billMonitorImp = (new localhost.wenews.services.billMonitor.BillMonitorImpServiceLocator()).getbillMonitor();
      if (billMonitorImp != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)billMonitorImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)billMonitorImp)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (billMonitorImp != null)
      ((javax.xml.rpc.Stub)billMonitorImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.wenews.services.billMonitor.BillMonitorImp getBillMonitorImp() {
    if (billMonitorImp == null)
      _initBillMonitorImpProxy();
    return billMonitorImp;
  }
  
  public java.lang.String getBill(java.lang.String name) throws java.rmi.RemoteException{
    if (billMonitorImp == null)
      _initBillMonitorImpProxy();
    return billMonitorImp.getBill(name);
  }
  
  
}