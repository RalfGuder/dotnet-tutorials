package net.arriba;

import jakarta.jws.WebService;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;


@WebService(name = "TenderCreationService", 
  targetNamespace = "https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin", 
  wsdlLocation = "http://localhost:4434/tender?wsdl")
public class TenderCreationServiceImpl extends Service {

  private final static URL COUNTRYSERVICEIMPLSERVICE_WSDL_LOCATION;
  private final static WebServiceException COUNTRYSERVICEIMPLSERVICE_EXCEPTION;
  private final static QName COUNTRYSERVICEIMPLSERVICE_QNAME = 
    new QName("https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin", "TenderCreationService");

  static {
      URL url = null;
      WebServiceException e = null;
      try {
          url = new URL("http://localhost:4434/tender?wsdl");
      } catch (MalformedURLException ex) {
          e = new WebServiceException(ex);
      }
      COUNTRYSERVICEIMPLSERVICE_WSDL_LOCATION = url;
      COUNTRYSERVICEIMPLSERVICE_EXCEPTION = e;
  }

  public TenderCreationServiceImpl() {
      super(__getWsdlLocation(), COUNTRYSERVICEIMPLSERVICE_QNAME);
  }

  // other constructors 

  @WebEndpoint(name = "TenderCreationServiceImplPort")
  public TenderCreationService getTenderCreationServiceImplPort() {
      return super.getPort(new QName("https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin", "TenderCreationPort"), 
          TenderCreationService.class);
  }

  private static URL __getWsdlLocation() {
      if (COUNTRYSERVICEIMPLSERVICE_EXCEPTION != null) {
          throw COUNTRYSERVICEIMPLSERVICE_EXCEPTION;
      }
      return COUNTRYSERVICEIMPLSERVICE_WSDL_LOCATION;
  }

  public static void main(String[] args) {
    TenderCreationServiceImpl service = new TenderCreationServiceImpl();
    TenderCreationService tenderCreationService = service.getTenderCreationServiceImplPort();
    tenderCreationService.authenticate("liertka", "kkk", "de");
    
  }
}