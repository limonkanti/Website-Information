
package jaxb_test;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;


public class XMLToObject 
{
     public static void main(String[] args) throws Exception
     {
         File file=new File("employee.xml");
          JAXBContext context=JAXBContext.newInstance(Employee.class);
          Unmarshaller u=context.createUnmarshaller();
          Employee e=(Employee) u.unmarshal(file);
          System.out.println(e.getId()+"\t"+e.getName());
     }
    
    
}
