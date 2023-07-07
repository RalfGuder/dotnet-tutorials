package net.arriba;

import jakarta.jws.WebMethod;
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
}
