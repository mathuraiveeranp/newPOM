package samplemaven.newPkg;

import javax.rmi.CORBA.ClassDesc;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="suite")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestngXML {
	
	@XmlAttribute(name="name")
    String name;
	
	 @XmlElementRef(name="test")
	 Test test;
	    
}


@XmlRootElement(name="test")
@XmlAccessorType(XmlAccessType.FIELD)
class Test {
	
	@XmlAttribute(name="name")
    String name;
	
	 @XmlElementRef(name="classes")
	 Classes classes;
	    
}

@XmlRootElement(name="classes")
@XmlAccessorType(XmlAccessType.FIELD)
class Classes {
	
	 @XmlElementRef(name="class")
	 Class[] Class;
	    
}

@XmlRootElement(name="class")
@XmlAccessorType(XmlAccessType.FIELD)
class Class {
	
	@XmlAttribute(name="name")
    String name;
	    
}

