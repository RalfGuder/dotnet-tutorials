package net.arriba;

import https.test_arriba_net_de.dispatcher.TenderCreationObject;
import https.test_arriba_net_de.dispatcher.TenderCreationStatus;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;
import jakarta.jws.soap.SOAPBinding.Use;

@WebService(serviceName = "TenderCreationService", portName = "TenderCreationPort", targetNamespace =  "https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin")
@SOAPBinding(style =Style.RPC, use = Use.ENCODED)

public interface TenderCreationService {
     
  @WebMethod(action = "https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin#getFederalStates")
  @WebResult(partName = "result")
  Object getFederalStates();
  
  @WebMethod(action = "https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin#authenticate")
  @WebResult(partName = "result")
  TenderCreationStatus authenticate(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "language") String language);
  
  @WebMethod(action = "https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin#createTender")
  @WebResult(partName = "result")
  TenderCreationStatus createTender(@WebParam(name = "TenderCreationObject") TenderCreationObject TenderCreationObject);
}
