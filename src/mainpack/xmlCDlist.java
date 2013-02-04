package mainpack;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class xmlCDlist extends CDlist {
  public int documentParse(String Path)
  {
	  try
      {
          File xmlFile = new File(Path);
          DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
          DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
          Document document = documentBuilder.parse(xmlFile);
          document.getDocumentElement().normalize();
          String nodename=document.getDocumentElement().getNodeName();     
          if  (!nodename.equalsIgnoreCase("CATALOG")) return -1;
          System.out.println(nodename);
          NodeList nodeList = document.getElementsByTagName(document.getDocumentElement().getChildNodes().item(1).getNodeName());
          System.out.println("--------------------");
          for(int tmp = 0; tmp < nodeList.getLength(); tmp++)
          {
              Node node = nodeList.item(tmp);
              
              if(node.getNodeType() == Node.ELEMENT_NODE)
              {   
                  Element element = (Element)node;
                  String xArtist=element.getElementsByTagName("ARTIST").item(0).getChildNodes().item(0).getNodeValue();
                  String xTitle=element.getElementsByTagName("TITLE").item(0).getChildNodes().item(0).getNodeValue();
                  String xCountry=element.getElementsByTagName("COUNTRY").item(0).getChildNodes().item(0).getNodeValue();
                  String xCompany=element.getElementsByTagName("COMPANY").item(0).getChildNodes().item(0).getNodeValue();
                  String xPriceS= element.getElementsByTagName("PRICE").item(0).getChildNodes().item(0).getNodeValue();
                  String xYearS=element.getElementsByTagName("YEAR").item(0).getChildNodes().item(0).getNodeValue();
                  int xYear=Integer.parseInt(xYearS);
                  float xPrice=Float.parseFloat(xPriceS);
                  soldCD newCD=new soldCD(xTitle, xArtist,xCountry,xCompany, xYear,xPrice);
                  add(newCD);
               }
              
          }
      }
      catch (Exception e)
      {
          System.out.println(e.getLocalizedMessage());
          e.printStackTrace();
          return -1;
      }
	  return 0;
  }
}
