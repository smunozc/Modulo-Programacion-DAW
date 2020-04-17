package U8_T3_Uso_Stax;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.events.*;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class crearStaxCero {
    public static void main(String[] args) {

        //Lista de pedidos
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        //10 Objetos Personas
        listaPersonas.add(new Persona("Juan","Monrove",31,"Emprendedor"));
        listaPersonas.add(new Persona("Tokio","Oliveira",25,"Criminal"));
        listaPersonas.add(new Persona("Claudia","Moreno",20,"Enfermera"));
        listaPersonas.add(new Persona("Jose","Bautista",44,"Servicio de Limpieza"));
        listaPersonas.add(new Persona("Carlos","Molina",33,"Emprendedor"));
        listaPersonas.add(new Persona("Salvador","Dalí",116,"Artista"));
        listaPersonas.add(new Persona("Maria","Monrove",43,"Directora de RRHH"));
        listaPersonas.add(new Persona("Ana","Luque",20,"Traductora"));
        listaPersonas.add(new Persona("Guillermo","de Paz",25,"Desarrollo de Aplicaciones Multiplataforma"));
        listaPersonas.add(new Persona("Alicia","Muñoz",28,"Emprendedora"));

        try{
            //Creación de Objeto para escribir
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("stax.xml"));

            //Creación de objeto que servirá para crear eventos
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

            //Crear evento de inicio de documento  y lo escribo con el objeto escritor
            StartDocument inicioDoc = eventFactory.createStartDocument();
            xmlWriter.add(inicioDoc);

            //Eventos para introducir saltos de linea y tabulaciones
            Characters saltoDeLinea = eventFactory.createCharacters("\n");
            Characters saltoDeLineaTab = eventFactory.createCharacters("\n\t");
            Characters tabulador = eventFactory.createCharacters("\t");
            xmlWriter.add(saltoDeLinea);

            //Evento para crear etiqueta raíz
            StartElement personasStartElement = eventFactory.createStartElement("","","personas");
            xmlWriter.add(personasStartElement);
            xmlWriter.add(saltoDeLineaTab);

            //Recorrer la lista para crear las etiquetas hijas
            Iterator it = listaPersonas.iterator();
            Integer contadorID = 1;
            int longitud = 0;

            while (it.hasNext()){

                Persona p = (Persona) it.next();
                //Etiqueta hija inicio
                StartElement personaStartElement = eventFactory.createStartElement("","","persona");
                Attribute atributoPersona = eventFactory.createAttribute("id",Integer.toString(contadorID));
                xmlWriter.add(personaStartElement);
                xmlWriter.add(atributoPersona);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                //Etiquetas atributo

                //Nombre
                StartElement nombreStartElement = eventFactory.createStartElement("","","nombre");
                EndElement nombreEndElement = eventFactory.createEndElement("","","nombre");
                Characters nombre = eventFactory.createCharacters(p.getNombre());
                xmlWriter.add(nombreStartElement);
                xmlWriter.add(nombre);
                xmlWriter.add(nombreEndElement);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                //Apellido
                StartElement apellidoStartElement = eventFactory.createStartElement("","","apellido");
                EndElement apellidoEndElement = eventFactory.createEndElement("","","apellido");
                Characters apellido = eventFactory.createCharacters(p.getApellido());
                xmlWriter.add(apellidoStartElement);
                xmlWriter.add(apellido);
                xmlWriter.add(apellidoEndElement);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                //Edad
                StartElement edadStartElement = eventFactory.createStartElement("","","edad");
                EndElement edadEndElement = eventFactory.createEndElement("","","edad");
                Characters edad = eventFactory.createCharacters(Integer.toString(p.getEdad()));
                xmlWriter.add(edadStartElement);
                xmlWriter.add(edad);
                xmlWriter.add(edadEndElement);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                //Empleo
                StartElement empleoStartElement = eventFactory.createStartElement("","","empleo");
                EndElement empleoEndElement = eventFactory.createEndElement("","","empleo");
                Characters empleo = eventFactory.createCharacters(p.getEmpleo());
                xmlWriter.add(empleoStartElement);
                xmlWriter.add(empleo);
                xmlWriter.add(empleoEndElement);
                xmlWriter.add(saltoDeLineaTab);

                //Etiqueta hija fin
                EndElement personaEndElement = eventFactory.createEndElement("","","persona");
                xmlWriter.add(personaEndElement);

                contadorID++;
                longitud++;

                //Para que la ultima etiqueta hija no tabule
                if (longitud == listaPersonas.size()){
                    xmlWriter.add(saltoDeLinea);
                } else {
                    xmlWriter.add(saltoDeLineaTab);
                }
            }

            //Evento para terminar la etiqueta raíz
            EndElement personasEndElement = eventFactory.createEndElement("","","personas");
            xmlWriter.add(personasEndElement);
            xmlWriter.add(saltoDeLinea);

            //Evento de finalización del documento
            EndDocument finDoc = eventFactory.createEndDocument();
            xmlWriter.add(finDoc);



        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
