package U8_T2_Modificando_DOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class DomDesdeCero {
    public static void main(String[] args) {

        ArrayList<Persona> listaPersona = new ArrayList<>();
        listaPersona.add(new Persona("Manolo","Olivares",49,"Director de negocios"));
        listaPersona.add(new Persona("Manuel","Olivares",45,"Director de negocios"));
        listaPersona.add(new Persona("Manolito","Olivares",30,"Director de negocios"));
        listaPersona.add(new Persona("Manuela","Olivares",45,"Bombero"));
        listaPersona.add(new Persona("Magnolia","Olivares",45,"Director de negocios"));
        listaPersona.add(new Persona("Pepe","Olivares",15,"Director de negocios"));
        listaPersona.add(new Persona("Jorge","Olivares",25,"Ornitólogo"));
        listaPersona.add(new Persona("Marco","Polo",55,"Director de negocios"));
        listaPersona.add(new Persona("Alvaro","Olivares",40,"Tecnico de Soporte"));
        listaPersona.add(new Persona("Jose","Barros",47,"Director de negocios"));

        try{

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            Element root = doc.createElement("personas");
            doc.appendChild(root);

            Integer i = 0;
            //Crear personas
            Iterator it = listaPersona.iterator();
            while (it.hasNext()){
                Persona p = (Persona) it.next();
                //Crear etiquetas persona
                Element personaTag = doc.createElement(p.getClass().getSimpleName());
                personaTag.setAttribute("ID",i.toString());
                root.appendChild(personaTag);
                i++;
                //Crear etiquetas hijas con atributos
                //Nombre
                Element nombre = doc.createElement("nombre");
                nombre.setTextContent(p.getNombre());
                personaTag.appendChild(nombre);
                //Apellido
                Element apellido = doc.createElement("apellido");
                apellido.setTextContent(p.getApellido());
                personaTag.appendChild(apellido);
                //Edad
                Element edad = doc.createElement("edad");
                edad.setTextContent(Integer.toString(p.getEdad()));
                personaTag.appendChild(edad);
                //Empleo
                Element empleo = doc.createElement("empleo");
                empleo.setTextContent(p.getEmpleo());
                personaTag.appendChild(empleo);
            }




            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");


            DOMSource origenDOM = new DOMSource(root);
            File nuevoXML = new File("./src/U8_T2_Modificando_DOM/PersonasDesdeCero.xml");
            StreamResult destino = new StreamResult(nuevoXML);

            transformer.transform(origenDOM,destino);

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }



    }
}
