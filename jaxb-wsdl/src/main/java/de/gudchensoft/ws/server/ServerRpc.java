package de.gudchensoft.ws.server;

import jakarta.jws.*;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;
import jakarta.jws.soap.SOAPBinding.Use;

@WebService(name = "TenderCreation")
@SOAPBinding(style = Style.RPC, use = Use.ENCODED)
public interface ServerRpc {
  public String hallo( @WebParam( name = "wer" ) String wer );
  
  @WebMethod(operationName = "_getTokenVal")
  @WebResult(name = "return")
  public String getTokenValue(@WebParam(name = "Vobag_user") Object user, @WebParam(name = "hex") String hex);
}
