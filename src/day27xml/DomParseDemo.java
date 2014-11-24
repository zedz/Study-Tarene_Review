package day27xml;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class DomParseDemo {
	public static void main(String[] args) {
		try {
			SAXReader reader = new SAXReader();
			FileInputStream in = new FileInputStream(new File("emp.xml"));
			Document doc = reader.read(in);
			
			Element root = doc.getRootElement();
			
			List<Element> elements = root.elements();
			List<Emp> emps = new ArrayList<Emp>();
			for(Element e:elements){
				Emp emp = new Emp();
				emp.name = e.element("name").getText();
				emp.age = Integer.parseInt(e.element("age").getText());
				emp.gender = e.element("gender").getText();
				emp.salary = Integer.parseInt(e.element("salary").getText());
				
				emps.add(emp);
			}
			
			for(Emp emp:emps){
				System.out.println(emp);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
