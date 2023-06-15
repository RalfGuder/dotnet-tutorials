package de.gudchensoft.ws.server;

import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;
import jakarta.jws.soap.SOAPBinding.Use;

@WebService(endpointInterface = "de.gudchensoft.ws.server.Server")
public class ServerImpl implements Server{

  @Override
  public String hallo(String wer) {
    return "Hallo " + wer;
  }

  @Override
  public String getTokenValue(Object user, String hex) {
    // TODO Auto-generated method stub
    return null;
  }

}
