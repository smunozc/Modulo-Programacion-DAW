package U8_T1_SAX_DOM.Recorrido_SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class RecorridoSAX extends DefaultHandler {
    public RecorridoSAX() {
        super();
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.print("Comienzo del parseado del documento xml" + '\n');
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.print('\n' + "Fin del parseado del documento xml");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        //Abro etiqueta
        System.out.print("<" + qName);
        //Recorro atributos (si los tuviera)
        if (attributes != null){
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.print(" " + attributes.getQName(i) + "=\"" + attributes.getValue(i) + "\"");
            }
        }
        //Cierro etiqueta
        System.out.print(">");
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        System.out.print("</" + qName + ">");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        String content = new String(ch,start,length);
        System.out.print(content);
    }
}
