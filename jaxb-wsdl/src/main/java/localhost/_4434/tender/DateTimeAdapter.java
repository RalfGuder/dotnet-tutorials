package localhost._4434.tender;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class DateTimeAdapter extends XmlAdapter<String, DateTime>{

  @Override
  public DateTime unmarshal(String v) throws Exception {
    return new DateTime(v);
  }

  @Override
  public String marshal(DateTime v) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

}
