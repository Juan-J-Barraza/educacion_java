package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResearchProject {
    private String name;
    private String description;
    private Date publicationDateColciencias;
    private List<ReserchProduct> listReserchProduct;
    private BusinessGroup businessGroup;

    public ResearchProject() {
    }

    public ResearchProject(String name, String description, Date publicationDateColciencias,
            BusinessGroup businessGroup) {
        this.name = name;
        this.description = description;
        this.publicationDateColciencias = publicationDateColciencias;
        this.businessGroup = businessGroup;
        this.listReserchProduct = new ArrayList<>();
    }

    
    @Override 
    public String toString() {
        return "ResearchProject{" +
               "name='" + name + '\'' +
               ", description='" + description + '\'' +
               ", publicationDateColciencias='" + publicationDateColciencias + '\'' +
               '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublicationDateColciencias() {
        return publicationDateColciencias;
    }

    public void setPublicationDateColciencias(Date publicationDateColciencias) {
        this.publicationDateColciencias = publicationDateColciencias;
    }

    public List<ReserchProduct> getListReserchProduct() {
        return listReserchProduct;
    }

    public void setListReserchProduct(List<ReserchProduct> listReserchProduct) {
        this.listReserchProduct = listReserchProduct;
    }

    public BusinessGroup getBusinessGroup() {
        return businessGroup;
    }

    public void setBusinessGroup(BusinessGroup businessGroup) {
        this.businessGroup = businessGroup;
    }

    
    

    
}

