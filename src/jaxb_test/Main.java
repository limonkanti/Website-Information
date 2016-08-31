
package jaxb_test;

import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;


public class Main
{
    
    public static void main(String[] args) throws Exception
    {
       Employee e=new Employee(1,"Limon Kanti Dey");
        JAXBContext context=JAXBContext.newInstance(Employee.class);
        Marshaller ob=context.createMarshaller();
        ob.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        ob.marshal(e, new FileOutputStream("employee.xml"));
    }
}
