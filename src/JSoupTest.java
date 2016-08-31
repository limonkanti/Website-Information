import java.io.IOException;  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  
import org.jsoup.nodes.Element;  
import org.jsoup.select.Elements;  

public class JSoupTest 
{

    public static void main(String[] args) throws IOException
    {
        

        int i=0;
        Document doc=Jsoup.connect("http://www.javatpoint.com").get();
        String title=doc.title();
        System.out.println("Tile is:\t"+title);
        Elements links = doc.select("a[href]");  
        for(Element e:links)
        {
            
            System.out.println("Tile is:\t"+e.attr("href"));
        }
   
        
        
     
    }
    
}
