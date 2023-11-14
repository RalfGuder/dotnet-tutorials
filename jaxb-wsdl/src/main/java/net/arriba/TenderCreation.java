package net.arriba;

import com.sun.xml.ws.api.message.Header;
import com.sun.xml.ws.api.message.HeaderList;
import jakarta.annotation.Resource;
import jakarta.jws.WebService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.xml.ws.Endpoint;
import jakarta.xml.ws.WebServiceContext;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.http.HTTPException;
import java.io.IOException;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import localhost._4434.tender.ArrayOfCompanyReturn;
import localhost._4434.tender.ArrayOfDateConfigReturn;
import localhost._4434.tender.ArrayOfPublicProcurementLaw;
import localhost._4434.tender.ArrayOfRegulationDetail;
import localhost._4434.tender.ArrayOfSpecificsPublicProcurementLaw;
import localhost._4434.tender.ArrayOfStatusResultData;
import localhost._4434.tender.ArrayOfTenderConfigFederalStates;
import localhost._4434.tender.ArrayOfTenderConfigFormsets;
import localhost._4434.tender.ArrayOfTenderRegulation;
import localhost._4434.tender.ArrayOfUnclassifiedKeyValue;
import localhost._4434.tender.ArrayOfVobagVergabeBez;
import localhost._4434.tender.ExportSearchValues;
import localhost._4434.tender.InfosForContentXml;
import localhost._4434.tender.PublicProcurementLaw;
import localhost._4434.tender.RegulationDetail;
import localhost._4434.tender.SuccessfulBidderParams;
import localhost._4434.tender.SuccessfulBidderSearchParams;
import localhost._4434.tender.TenderCreationObject;
import localhost._4434.tender.TenderCreationPort;
import localhost._4434.tender.TenderCreationStatus;
import localhost._4434.tender.TenderRegulation;

@WebService(endpointInterface = "localhost._4434.tender.TenderCreationPort",
    targetNamespace = TenderCreation.NAMESPACE)
public class TenderCreation implements TenderCreationPort {

  @Resource
  WebServiceContext context;

  private static final String SESSION_ID = "5085182de37b3495267d22c12fdb7aed";
  static final String NAMESPACE = "http://localhost:4434/tender";
  private static final QName MYHEADER = new QName(NAMESPACE, "SessionHeader");

  @Override
  public TenderCreationStatus authenticate(String username, String password, String language) {
    System.out.println("Username: " + username);
    if (username != null && username.equals("s-lierka")) {
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
    String url = (args.length > 0) ? args[0] : NAMESPACE;
    Endpoint.publish(url, new TenderCreation());
  }

  @Override
  public TenderCreationStatus createTender(TenderCreationObject tenderCreationObject) {

    if (tenderCreationObject != null && checkSessionId(tenderCreationObject.getSessionId())) {
      return new TenderCreationStatus();
    }
    throw new HTTPException(HttpServletResponse.SC_UNAUTHORIZED);
  }

  private boolean checkSessionId(String sessionId) {
    return getSeesionId().equals(sessionId);

  }

  private String getSeesionId() {
    MessageContext mc = context.getMessageContext();
    HeaderList headers = (HeaderList) mc.get("com.sun.xml.ws.api.message.HeaderList");
    Header header = headers.get(MYHEADER, false);
    if (header == null)
      return "";
    XMLStreamReader reader;
    try {
      reader = header.readHeader();
      while (reader.hasNext()) {
        if (reader.next() == XMLStreamConstants.START_ELEMENT
            && reader.getLocalName().equals("PHPSESSID")) {
          return reader.getElementText();
        }
      }
    } catch (XMLStreamException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return "";
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
    System.out.println("getPublicProcurementLaw(sessionId:" + sessionId + ")");
    if (checkSessionId(sessionId)) {
      ArrayOfPublicProcurementLaw result = new ArrayOfPublicProcurementLaw();
      result.add(new PublicProcurementLaw("Bauleistungen1", "VOB/Aed", "387", false));
      result.add(new PublicProcurementLaw("Vergabe- und Vertragsordnung für Bauleistungen (VOB)", "VOB/EU", "390", true));
      result.add(new PublicProcurementLaw("ABCD - Vergabe- und Vertragsordnung. für Leistungen", "VOL/A", "47", false));
      result.add(new PublicProcurementLaw("Vergabe- und Vertragsordnung. für Leistungen (VOL)", "VOL/EU", "437", true));
      result.add(new PublicProcurementLaw("Vergabe- und Vertragsordnung. für frei. Leistungen", "LHO", "169", false));
      result.add(new PublicProcurementLaw("Vergabe- und Vertragsordnung. für frei. Leistungen (VgV)", "VgV", "484", true));
      result.add(new PublicProcurementLaw("Unterschwellenvergabeordnung (UVgO)", "UVgO", "604", false));
      return result;
    } 
    throw new HTTPException(HttpServletResponse.SC_UNAUTHORIZED);
  }

  @Override
  public ArrayOfTenderRegulation getTenderRegulations(int vvId, String sessionId) {
    System.out.println("getTenderRegulations(vvId:" + vvId + ", sessionId:" + sessionId + ")");
    if (checkSessionId(sessionId)) {
      ArrayOfTenderRegulation result = new ArrayOfTenderRegulation();
      result.add(new TenderRegulation("Öffentliche Ausschreibung", 200,  true));
      return result;
    } 
    throw new HTTPException(HttpServletResponse.SC_UNAUTHORIZED);
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
    System.out.println("getTenderRegulationDetails(virtualVaId:" + virtualVaId + ", sessionId" + sessionId + ")");
    if (checkSessionId(sessionId)) {
      ArrayOfRegulationDetail result = new ArrayOfRegulationDetail();
      result.add(new RegulationDetail(839, "Planung und Ausführung",  true));
      return result;
    } 
    throw new HTTPException(HttpServletResponse.SC_UNAUTHORIZED);
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
