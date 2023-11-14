package net.arriba;

import com.sun.xml.ws.api.message.*;
import jakarta.annotation.Resource;
import jakarta.jws.WebService;
import jakarta.xml.ws.Endpoint;
import jakarta.xml.ws.WebServiceContext;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import localhost._4434.tender.*;

@WebService(endpointInterface = "localhost._4434.tender.TenderCreationPort", targetNamespace = TenderCreation.NAMESPACE)
public class TenderCreation implements TenderCreationPort{

  @Resource
  WebServiceContext context;

  private static final String SESSION_ID = "5085182de37b3495267d22c12fdb7aed";
  static final String NAMESPACE = "http://localhost:4434/tender";
  private static final QName MYHEADER = new QName(NAMESPACE, "SessionHeader");

  @Override
  public TenderCreationStatus authenticate(String username, String password, String language) {
    System.out.println("Username: " + username);
    if(username != null && username.equals("s-lierka")) {
      TenderCreationStatus xx = new TenderCreationStatus();
      xx.setCode(0);
      xx.setCodeText("");
      xx.setMessage("OK");
      xx.setSessionId(SESSION_ID);
      return xx;
    }
    throw new WebServiceException();
  }
  
  public static void main(String[] args) {
    String url = ( args.length > 0 ) ? args[0] : NAMESPACE;
    Endpoint.publish( url, new TenderCreation());
  }

  @Override
  public TenderCreationStatus createTender(TenderCreationObject tenderCreationObject) {
    
    Object xx = getUsername();
    
    if(tenderCreationObject != null && tenderCreationObject.getSessionId().equals(SESSION_ID)) {
      return new TenderCreationStatus();
    }
   throw new WebServiceException();
  }
  
  private String getUsername()
  {
    MessageContext mc = context.getMessageContext();
    Map headers = (Map)mc.get("com.sun.xml.ws.api.message.HeaderList");
    List Users = (List)headers.get("PHPSESSID");
    return Users.get(0).toString();
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
