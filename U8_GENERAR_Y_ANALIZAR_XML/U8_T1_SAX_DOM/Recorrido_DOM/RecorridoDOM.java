package U8_T1_SAX_DOM.Recorrido_DOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

public class RecorridoDOM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Numero de nodos hijos

        numNodosHijos();

        System.out.println("==================================================");

        //mostrar el XML

        mostrarXMLDom();

        System.out.println("==================================================");

        //Mostrar los elementos pasados como parametro a la funcion

        System.out.println("¿Que etiqueta estás buscando?: ");
        String etq = sc.nextLine();

        try{

            //Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("./src/U8_T1_SAX_DOM/Documento.xml"));

            Element e1 = doc.createElement(etq);
            mostrarContenidoEtiqueta(e1);

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void numNodosHijos() {
        try{

            //Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("./src/U8_T1_SAX_DOM/Documento.xml"));

            Element root = doc.getDocumentElement();
            NodeList nl = root.getChildNodes();

            //Imprimir por pantalla
            System.out.println("Información de los nodos:" + '\n' + "Numero de nodos hijos: " + nl.getLength() + ".");
            for (int i = 0; i < nl.getLength() ; i++) {
                System.out.println("-------------------------------------");
                System.out.println("Tipo de nodo " + i + ": " + nl.item(i).getNodeType());
            }

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void mostrarXMLDom() {
        try{

            //Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("./src/U8_T1_SAX_DOM/Documento.xml"));

            Element root = doc.getDocumentElement();
            NodeList nl = root.getChildNodes();

            //Imprimir por pantalla
            for (int i = 0; i < nl.getLength() ; i++) {
                NodeList nl2 = nl.item(i).getChildNodes();
                Scanner sc = new Scanner(System.in);

                if (!nl.item(i).getNodeName().equals("#text")){
                    System.out.println("Nodo " + i + ":" + '\n' + "<" + nl.item(i).getNodeName() + ">");
                    System.out.println("¿Mostrar contenido completo del nodo? si/no: ");
                    String respuesta = sc.nextLine();

                    if (respuesta.equals("si")){
                        for (int j = 0; j < nl2.getLength() ; j++) {
                            if (!nl2.item(j).getNodeName().equals("#text")){
                                System.out.println("<" + nl2.item(j).getNodeName() + ">" + nl2.item(j).getTextContent() +
                                        "</" + nl2.item(j).getNodeName() + ">");
                            }
                        }
                    }
                    System.out.println("</" + nl.item(i).getNodeName() + ">");
                    System.out.println("-------------------------------------");
                }

            }

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void mostrarContenidoEtiqueta(Element e){
        try{

            //Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("./src/U8_T1_SAX_DOM/Documento.xml"));

            NodeList nl = doc.getElementsByTagName(e.getTagName());

            //Imprimir por pantalla
            if (nl.getLength() == 0){
                System.out.println("No hay ninguna ocurrencia de esta etiqueta.");
            } else {
                for (int i = 0; i < nl.getLength() ; i++) {
                    Element el = (Element) nl.item(i);

                    if (!el.getTagName().equals("#text")){
                        System.out.println("Nombre etiqueta: " + el.getTagName() + ", ID: " + el.getAttribute("id"));
                    }

                    if (nl.item(i).hasChildNodes()){
                        NodeList nl2 = nl.item(i).getChildNodes();

                        for (int j = 0; j < nl2.getLength() ; j++) {
                            if (!nl2.item(j).getNodeName().equals("#text")){
                                System.out.println("<" + nl2.item(j).getNodeName() + ">" + nl2.item(j).getTextContent() +
                                        "</" + nl2.item(j).getNodeName() + ">");
                            }
                        }
                    } else {
                        System.out.println("Este nodo no tiene ningun hijo.");
                    }
                    System.out.println("-------------------------------------");
                }
            }


        }catch (Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }

}
