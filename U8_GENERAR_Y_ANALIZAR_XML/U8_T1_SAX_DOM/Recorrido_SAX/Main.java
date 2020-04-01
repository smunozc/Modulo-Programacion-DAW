package U8_T1_SAX_DOM.Recorrido_SAX;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        try{
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser sp = spf.newSAXParser();
            DefaultHandler personaSAX = new RecorridoSAX();
            sp.parse(new File("./src/U8_T1_SAX_DOM/Documento.xml"),personaSAX);
        } catch (Exception e){
            System.out.println("Error: " + e.getCause() + ", " + e.getMessage());
        }

    }
}
