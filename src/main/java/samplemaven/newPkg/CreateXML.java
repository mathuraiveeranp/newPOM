package samplemaven.newPkg;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class CreateXML {

	public static void main(String[] args) {
	
	//public void create() {
		
		System.out.println("Bat");

		try {
			
			List<String> testcasesList = new ArrayList<String>();
			testcasesList.add("Sample.example.ReadPDFContent");
			testcasesList.add("Sample.example.Example");

			File file = new File("C:\\Users\\mathuraiveeranp\\Desktop\\testng.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(TestngXML.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();			

			TestngXML suite = new TestngXML();
			suite.name="Suite";

			suite.test = new Test();
			suite.test.name="Test";

			suite.test.classes = new Classes();

			suite.test.classes.Class = new Class[testcasesList.size()];

			List<Class> numberofClassTagArray = new ArrayList<Class>();

			for(int i = 0; i < testcasesList.size(); i++)
			{
				Class classObject = new Class();

				numberofClassTagArray.add(classObject);

			}

			for(int i=0;i<numberofClassTagArray.size();i++){

				numberofClassTagArray.get(i).name = testcasesList.get(i);
			}

			for(int i=0;i<numberofClassTagArray.size();i++){

				suite.test.classes.Class[i] = numberofClassTagArray.get(i);
			}
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(suite, file);
			jaxbMarshaller.marshal(suite, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}



	}

}
