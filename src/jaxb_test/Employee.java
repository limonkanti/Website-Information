
package jaxb_test;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Employee 
{
    private String name;
    private int id;
    public Employee(){}
    public Employee(int id,String name)
    {
        super();
        this.id=id;
        this.name=name;
        
    }
    @XmlAttribute

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @XmlElement

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
