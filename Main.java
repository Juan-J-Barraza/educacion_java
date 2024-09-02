
import models.*;
import java.util.Date;

public class Main {

        public static void main(String[] args) {

                // Creación de un objeto BusinessGroup
                BusinessGroup businessGroup = new BusinessGroup(1000000.00);

                // Creación de un objeto Institute
                Institute institute = new Institute("Instituto de Tecnología", "Formacion Profesional", businessGroup);

                // Creación de un objeto Researcher
                Researcher researcher = new Researcher("John Doe", "Investigador Principal","Liderazgo en el Proyecto", institute);
                Researcher researcher2 = new Researcher("Jose luis","Coinvestigador","Ayudante de proyecto", institute);
                institute.getListResearchers().add(researcher);
                institute.getListResearchers().add(researcher2);

                ResearchProject researchProject = new ResearchProject("Busqueda de informacion", "descrpition optional", null, businessGroup);
                
                // Creación de un objeto Resource
                Resource resource = new Resource("Equipo de Laboratorio", "Microscopio Electrónico", "Disponible");

                // Creación de un objeto Task
                Task task = new Task("Tarea de Investigación", new Date());
                task.getListResources().add(resource);

                // Creación de un objeto Document
                Document document = new Document("Informe de Investigación", new Date());

                // Creación de un objeto ReserchProduct
                ReserchProduct researchProduct = new ReserchProduct("Producto de Investigación 1", "Tipo de Producto",
                                "Descripción del Producto", "En progreso", 8, document, researchProject);
                researchProject.getListReserchProduct().add(researchProduct);

                // Creación de un objeto Publication
                Publication publication = new Publication("Título de la Publicación", "Descripción de la publicación",
                                "Publicado",
                                new Date(), researchProduct);

                // Creación de un objeto Category
                //Category category = new Category("Descripción de la Categoría", "Tipo de Categoría", "Categoría No Indexada");

                System.out.println("Publication: " + publication);
        }
}
