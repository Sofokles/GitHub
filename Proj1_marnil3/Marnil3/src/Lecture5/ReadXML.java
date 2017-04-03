package Lecture5;
import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class ReadXML {
public static void main(String[] args) {

	try {
		File XmlFile = new File("opencim3sub.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(XmlFile);
		// normalize CIM XML file
		doc.getDocumentElement().normalize();//g�r s� att vi kan finna errors..?
		NodeList subList1 = doc.getElementsByTagName("cim:Substation"); //lista med substations, �r detta d� en lista med objekt..?
		// � read other required CIM objects
		NodeList subList2 = doc.getElementsByTagName("cim:VoltageLevel");
		NodeList subList3 = doc.getElementsByTagName("cim:SynchronousMachine");
		// � cycle through each list to extract required dat
		int t1 = subList1.getLength();
		int t2 = subList2.getLength();
		int t3 = subList3.getLength();
		System.out.println("Print:" + t1 + t2 + t3);
		for (int i = 0; i < subList1.getLength(); i++) {
			// � use extractNode method
			Node theNode = subList1.item(i);			
			extractNode (theNode);
			}
		for (int i = 0; i < subList2.getLength(); i++) {
			// � use extractNode method
			Node theNode = subList2.item(i);			
			extractNode (theNode);
			}
		for (int i = 0; i < subList3.getLength(); i++) {
			// � use extractNode method
			Node theNode = subList3.item(i);			
			extractNode (theNode);
			}
		}
	catch(Exception e){
		e.printStackTrace();
	}
}
public static void extractNode (Node node){
// � remember to convert node to element in order to search for the data inside it.
	Element element = (Element) node;
	
	element.getElementsByTagName("cim:IdentifiedObject.name");//.item(0).getTextContent;
	
	//System.out.println(element.getElementsByTagName("cim:IdentifiedObject.name"));
	System.out.println(element.getAttribute("rdf:ID"));
	System.out.println(element.getElementsByTagName("cim:IdentifiedObject.name").item(0).getTextContent());
	//can be used to read specific attribute of XML node.
}
}