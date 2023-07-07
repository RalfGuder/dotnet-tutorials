package net.arriba;

public class TenderCreationServiceMain {
  public static void main(String[] args) {
    System.setProperty("http.proxyHost", "proxy.dmzprz.zdi.svc"); 
    System.setProperty("http.proxyPort", "80"); 
    System.setProperty("http.proxyUserName", "RalfGuder"); 
    System.setProperty("http.proxyPassword", "SuTBw20!!"); 
    System.setProperty("https.proxyHost", "proxy.dmzprz.zdi.svc"); 
    System.setProperty("https.proxyPort", "80"); 
    System.setProperty("https.proxyUserName", "RalfGuder"); 
    System.setProperty("https.proxyPassword", "SuTBw20!!"); 
    System.setProperty("jdk.http.auth.tunneling.disabledSchemes", "false"); 
    System.setProperty("jdk.http.auth.proxying.disabledSchemes", "false"); 


    TenderCreationServiceImpl service = new TenderCreationServiceImpl();
    TenderCreationService tenderCreationService = service.getTenderCreationServiceImplPort();
    tenderCreationService.getFederalStates();
  }
}
