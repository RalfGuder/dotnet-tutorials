package net.arriba;

import https.test_arriba_net_de.dispatcher.TenderCreationObject;
import https.test_arriba_net_de.dispatcher.TenderCreationStatus;
import jakarta.jws.WebService;
import jakarta.xml.ws.Endpoint;

@WebService(endpointInterface = "net.arriba.TenderCreationService",targetNamespace = "https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin")
public class TenderCreation implements TenderCreationService{

  @Override
  public Object getFederalStates() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public TenderCreationStatus authenticate(String username, String password, String language) {
    System.out.println("Username: " + username);
    TenderCreationStatus xx = new TenderCreationStatus();
    xx.setCode(0);
    xx.setCodeText("");
    xx.setMessage("ok");
    xx.setSessionId("swd33");
    return xx;
  }
  
  public static void main(String[] args) {
    String url = ( args.length > 0 ) ? args[0] : "http://localhost:4434/tender";
    Endpoint.publish( url, new TenderCreation());
  }

  @Override
  public TenderCreationStatus createTender(TenderCreationObject TenderCreationObject) {
    // TODO Auto-generated method stub
    return null;
  }

}
