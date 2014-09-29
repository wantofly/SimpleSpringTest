package com.cginfo.test.simplespring.jaxbclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class MainJaxb {
	
	public final static String classpath = "com.cginfo.test.simplespring.jaxbclass";
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		
		Address addr = new Address();
		
		addr.setCity("SH");
		addr.setBDate(new Date());
		
		JAXBContext jc = JAXBContext.newInstance( classpath );
		
		Unmarshaller u = jc.createUnmarshaller();
		
		InputStream is = MainJaxb.class.getResourceAsStream("addr.xml"); 
//		InputStream is = MainJaxb.class.getResourceAsStream("/com/cginfo/test/simplespring/jaxbclass/addr.xml");
		@SuppressWarnings("unchecked")
		JAXBElement<Address> jb = (JAXBElement<Address>) u.unmarshal( is );
		addr = (Address) jb.getValue();
//		addr = (Address)u.unmarshal( is ); //wrong
		System.out.println(addr.getCity());
		System.out.println(addr.getBDate());
		System.out.println("=============");
		Marshaller m = jc.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		JAXBElement<Address> addrInfoElement = (new ObjectFactory()).createAddress(addr);
		m.marshal(addrInfoElement, System.out );
		
		//@XmlRootElement add to generated class.
//		m.marshal( addr, System.out ); //
	}
}
