package net.arriba;

import https.test_arriba_net_de.dispatcher.ArrayOfCompanyReturn;
import https.test_arriba_net_de.dispatcher.ArrayOfDateConfigReturn;
import https.test_arriba_net_de.dispatcher.ArrayOfPublicProcurementLaw;
import https.test_arriba_net_de.dispatcher.ArrayOfRegulationDetail;
import https.test_arriba_net_de.dispatcher.ArrayOfSpecificsPublicProcurementLaw;
import https.test_arriba_net_de.dispatcher.ArrayOfStatusResultData;
import https.test_arriba_net_de.dispatcher.ArrayOfTenderConfigFederalStates;
import https.test_arriba_net_de.dispatcher.ArrayOfTenderConfigFormsets;
import https.test_arriba_net_de.dispatcher.ArrayOfTenderRegulation;
import https.test_arriba_net_de.dispatcher.ArrayOfUnclassifiedKeyValue;
import https.test_arriba_net_de.dispatcher.ArrayOfVobagVergabeBez;
import https.test_arriba_net_de.dispatcher.ExportSearchValues;
import https.test_arriba_net_de.dispatcher.InfosForContentXml;
import https.test_arriba_net_de.dispatcher.SuccessfulBidderParams;
import https.test_arriba_net_de.dispatcher.SuccessfulBidderSearchParams;
import https.test_arriba_net_de.dispatcher.TenderCreationObject;
import https.test_arriba_net_de.dispatcher.TenderCreationPort;
import https.test_arriba_net_de.dispatcher.TenderCreationStatus;
import jakarta.jws.WebService;
import jakarta.xml.ws.Endpoint;
import jakarta.xml.ws.WebEndpoint;
import javax.xml.namespace.QName;

@WebService(endpointInterface = "https.test_arriba_net_de.dispatcher.TenderCreationService",targetNamespace = "https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin")
public class TenderCreationServer implements TenderCreationPort{

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
  
  @WebEndpoint(name = "TenderCreationPort")
  public TenderCreationPort getTenderCreationPort() {
    return this;
}
  public static void main(String[] args) {
    String url = ( args.length > 0 ) ? args[0] : "http://localhost:4434/tender";
    Endpoint.publish( url, new TenderCreationServer());
  }

  @Override
  public TenderCreationStatus createTender(TenderCreationObject TenderCreationObject) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getTokenVal(Object vobagUser, String hex) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayOfUnclassifiedKeyValue getVergabeordnungMapping() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayOfUnclassifiedKeyValue showExportStatusValues() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SuccessfulBidderParams getSuccessfulCompany(SuccessfulBidderSearchParams params) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public TenderCreationStatus updateSuccessfulCompany(SuccessfulBidderParams params) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayOfStatusResultData getTenderExport(ExportSearchValues params) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayOfCompanyReturn bidderSearch(String namePart, String sessionId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public TenderCreationStatus checkTenderNumber(String nameAward, String namePrj,
      String sessionId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean releaseTNW(String token, int agLvId) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public String crypt(String stream, String token) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean finalFirmApprove(String token, int agLvId) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean inviteBidders(String token, int agLvId) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void setVobagUser(Object vobagUser, String token) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public boolean setLvId(int agLvId, int projektId, String token) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public String openingAction(int agLvId, Object token, Object addPaperBidders,
      Object finishOpening, Object vobagUser) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayOfDateConfigReturn getDatesConfig(int virtualVaId, String sessionId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayOfPublicProcurementLaw getPublicProcurementLaw(String sessionId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayOfTenderRegulation getTenderRegulations(int vvId, String sessionId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayOfSpecificsPublicProcurementLaw getSpecificPublicProcurementLaw(int vvId,
      String sessionId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayOfVobagVergabeBez getTenderLabelTemplates(String area) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayOfTenderConfigFormsets getFormsatzIds(int virtualVaId, boolean lots,
      String sessionId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayOfRegulationDetail getTenderRegulationDetails(int virtualVaId, String sessionId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayOfTenderConfigFederalStates getFederalStates() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public InfosForContentXml getTnwAddFilesData(String token) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public InfosForContentXml getOfferDocInfos(String token) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void generateTokenSession(Object vobagUser) {
    // TODO Auto-generated method stub
    
  }

}
