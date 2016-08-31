package Get_URL_Info;

import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class jsoup_project extends JFrame implements ActionListener {

    JLabel l;
    JTextField tf;
    JLabel title;
    JTextField tf_title;
    JLabel link;
    JTextField tf_link;
    
    JLabel image;
    JTextField tf_image;
    
    JButton b;
    
    

    jsoup_project() {
        super("Project on a Get URL Info");
        l = new JLabel("Enter URL:");
        l.setBounds(10, 10, 70, 40);;
        tf = new JTextField();
        tf.setBounds(90, 10, 180, 40);

        title = new JLabel("Get Title:");
        title.setBounds(10, 60, 70, 40);;
        tf_title = new JTextField();
        tf_title.setBounds(90, 60, 180, 40);

        link = new JLabel("Get Link:");
        link.setBounds(10, 110, 70, 40);;
        tf_link = new JTextField();
        tf_link.setBounds(90, 110, 180, 40);
        
        image = new JLabel("Get Image:");
        image.setBounds(10, 160, 70, 40);;
        tf_image = new JTextField();
        tf_image.setBounds(90, 160, 180, 40);

        b = new JButton("Get Info");
        b.setBounds(280, 10, 80, 40);
        b.addActionListener(this);
        add(l);
        add(tf);
        add(title);
        add(tf_title);
        add(link);
        add(tf_link);
        
        add(image);
        add(tf_image);
        add(b);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String url = tf.getText();
        try {
            Document doc = Jsoup.connect(url).get();
            String title = doc.title();
            tf_title.setText(title);
            Elements links =doc.select("a[href]");
            for (Element link : links) {
                String lin=link.attr("href");
                String lin_text=link.text();
               tf_link.setText(lin+"\t"+lin_text);
            }
            
            Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");  
            for (Element image : images) {
               // JOptionPane.showMessageDialog(null,  image.attr("src"));
                
              tf_image.setText(image.attr("src"));
               
            }  

        } catch (Exception e1) {

        }

    }

    public static void main(String[] args) {
        new jsoup_project();
    }
}
