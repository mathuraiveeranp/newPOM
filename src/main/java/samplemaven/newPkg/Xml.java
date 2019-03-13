package samplemaven.newPkg;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Xml {

	public static String userDir;

	public static List<String> testcasesList;
	public static Map<String, String> parameters;

	public Map<String, String> readParameters() {
		parameters = new HashMap<String, String>();
		parameters.put("browser", "chrome");
		parameters.put("url", "http://leaftaps.com/opentaps");
		return parameters;

	}

	public List<String> createTestcaseSuite() {

		testcasesList = new ArrayList<String>();
		testcasesList.add("samplemaven.testcases.TC001_Login");
		testcasesList.add("samplemaven.testcases.TC001_Login2");
		return testcasesList;	
	}

	public void createXML() {

		try {
			String filePath = userDir+"\\testng1.xml";
			System.out.println("filePath: "+filePath);
			
			File file = new File(filePath);

			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

			Document document = documentBuilder.newDocument();

			Element root = document.createElement("suite");
			document.appendChild(root);
			Attr attribute1 = document.createAttribute("name");
			attribute1.setValue("Suite");
			root.setAttributeNode(attribute1);

			Comment comment = document.createComment("DOCTYPE suite SYSTEM \"http://testng.org/testng-1.0.dtd");
			root.getParentNode().insertBefore(comment, root);

				for(Entry<String, String> eachEntry :parameters.entrySet()) {

					String paraName, paraValue;

					if (eachEntry.getKey().equalsIgnoreCase("browser")||eachEntry.getKey().equalsIgnoreCase("url")) {
						if(!eachEntry.getValue().equals(null)){
							paraName = eachEntry.getKey();
							paraValue = eachEntry.getValue();

							Element para = document.createElement("parameter");
							root.appendChild(para);
							Attr name = document.createAttribute("name");
							name.setValue(paraName);
							para.setAttributeNode(name);
							Attr value = document.createAttribute("value");
							value.setValue(paraValue);
							para.setAttributeNode(value);
						}
					}
				}

			Element child1 = document.createElement("test");
			root.appendChild(child1);
			Attr attribute2 = document.createAttribute("name");
			attribute2.setValue("Test");
			child1.setAttributeNode(attribute2);

			Element child2 = document.createElement("classes");
			child1.appendChild(child2);

			for(int i = 0; i < testcasesList.size(); i++)
			{
				Element child3 = document.createElement("class");
				child2.appendChild(child3);
				Attr attribute3 = document.createAttribute("name");
				attribute3.setValue(testcasesList.get(i));
				child3.setAttributeNode(attribute3);
			}


			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);

			StreamResult streamResult = new StreamResult(file);
			//StreamResult streamResult = new StreamResult(System.out);

			transformer.transform(domSource, streamResult);

			System.out.println("Done");


		}catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		} 

	}

	public static void main(String[] args) {

		Xml xml = new Xml();
		userDir = args[0];
		System.out.println("userDir: "+userDir);
		xml.readParameters();
		xml.createTestcaseSuite();
		xml.createXML();


	}

}
