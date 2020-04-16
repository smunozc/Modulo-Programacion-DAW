package U8_T2_Modificando_DOM;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class ModificarDOM {

    public static void main(String[] args) {
        try {

            //Carga el contenido del XML en la estructura DOM.
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("./src/U8_T2_Modificando_DOM/Documento.xml"));

            Node root = doc.getDocumentElement();
            Text saltoLinea = doc.createTextNode("\n");
            NodeList nl = root.getChildNodes();

            /*Añadir antes de cada nodo hijo de tipo etiqueta
            (en el ejemplo los nodos hijos eran <persona>
            el siguiente comentario <!-- COMENTARIO AÑADIDO DESDE DOM -->*/
            for (int i = 0; i < nl.getLength() ; i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE){
                    Comment comentario = doc.createComment("Comentario añadido desde DOM");
                    Element persona = (Element) nl.item(i);
                    root.insertBefore(comentario,persona);
                    i+=1;
                }
            }

            //Añadir un nueva etiqueta hija (en el ejemplo una nueva persona) como último hijo
            //Crear nuevo elemento persona
            Element nuevaPersona = doc.createElement("persona");
            nuevaPersona.setAttribute("id","6");
            //Crear etiquetas hijas
            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Falete");
            Element apellido = doc.createElement("apellido");
            apellido.setTextContent("Muñoz");
            Element edad = doc.createElement("edad");
            edad.setTextContent("35");
            //Añadir etiquetas hijas
            nuevaPersona.appendChild(nombre);
            nuevaPersona.appendChild(apellido);
            nuevaPersona.appendChild(edad);
            //Añadir la nueva persona a la etiquet raíz
            root.appendChild(nuevaPersona);

            /*Crear un nuevo nodo etiqueta (en el ejemplo una nueva persona)
            y reemplazar la primera etiqueta hija por ese nodo creado.*/
            //Crear nuevo elemento persona
            Element personaSustitucion = doc.createElement("persona");
            personaSustitucion.setAttribute("id","1");
            //Crear etiquetas hijas
            Element nombreSustitucion = doc.createElement("nombre");
            nombreSustitucion.setTextContent("Juanito");
            Element apellidoSustitucion = doc.createElement("apellido");
            apellidoSustitucion.setTextContent("Ortiz");
            Element edadSustitucion = doc.createElement("edad");
            edadSustitucion.setTextContent("20");
            //Añadir etiquetas hijas
            personaSustitucion.appendChild(nombreSustitucion);
            personaSustitucion.appendChild(apellidoSustitucion);
            personaSustitucion.appendChild(edadSustitucion);
            //Reemplazar
            Element primeraPersona = (Element) doc.getElementsByTagName("persona").item(0);
            root.replaceChild(personaSustitucion,primeraPersona);


            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoXML = new File("./src/U8_T2_Modificando_DOM/dom_modificado.xml");
            StreamResult destino = new StreamResult(nuevoXML);

            transformer.transform(origenDOM,destino);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
