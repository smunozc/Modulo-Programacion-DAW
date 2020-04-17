package U8_T3_Uso_Stax;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.*;
import java.io.FileInputStream;

public class mostrarStax {
    public static void main(String[] args) {
        try{

            //Parsear XML con stax
            XMLInputFactory xif = XMLInputFactory.newInstance();
            XMLEventReader xer = xif.createXMLEventReader(new FileInputStream("./src/U8_T3_Uso_Stax/Documento.xml"));

            //Recorrer el fichero XML con Stax
            while (xer.hasNext()){
                //Se obtiene el siguiente elemento que se va a tratar
                XMLEvent xmlEvent = xer.nextEvent();

                if (xmlEvent.isStartElement()){

                    StartElement startTag = xmlEvent.asStartElement();

                    //Imprimir por pantalla las etiquetas de inicio y maquetarlas
                    String tagName = startTag.getName().getLocalPart();
                    switch (tagName){
                        case "personas":
                            System.out.print("<" + startTag.getName().getLocalPart() + ">" + "\n");
                            break;
                        case "persona":
                            Attribute id = startTag.getAttributeByName(new QName("id"));
                            System.out.print("\t");
                            System.out.print("<" + startTag.getName().getLocalPart());
                            System.out.print(" " + id.getName() + "=\"" + id.getValue() + "\"" + ">" + "\n");
                            break;
                        case "nombre":
                            System.out.print("\t\t");
                            System.out.print("<" + startTag.getName().getLocalPart() + ">");
                            break;
                        case "apellido":
                            System.out.print("\t\t");
                            System.out.print("<" + startTag.getName().getLocalPart() + ">");
                            break;
                        case "edad":
                            System.out.print("\t\t");
                            System.out.print("<" + startTag.getName().getLocalPart() + ">");
                            break;
                        case "empleo":
                            System.out.print("\t\t");
                            System.out.print("<" + startTag.getName().getLocalPart() + ">");
                            break;
                    }

                } else if (xmlEvent.isEndElement()){

                    EndElement endTag = xmlEvent.asEndElement();
                    if (endTag.getName().getLocalPart().equals("persona")){
                        System.out.println("\t" + "<\\" + endTag.getName().getLocalPart() + ">");
                    } else {
                        System.out.println("<\\" + endTag.getName().getLocalPart() + ">");
                    }

                } else if (xmlEvent.isStartDocument()){
                    System.out.println("Se ha iniciado el parseado del XML.");
                } else if (xmlEvent.isEndDocument()){
                    System.out.println("Se ha termiado el parseado del XML.");
                } else if (xmlEvent.isCharacters()){

                    Characters texto = xmlEvent.asCharacters();
                    if (!texto.getData().contains("\n")){
                        System.out.print(texto.getData());
                    }

                }
            }

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
