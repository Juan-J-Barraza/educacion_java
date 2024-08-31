package models;

import java.util.ArrayList;
import java.util.List;

public class Institute {
    private String typpe;
    private String educationalLevel;
    private List<Researcher> listResearchers;
    private BusinessGroup businessGroup;

    public Institute() {
    }

    public Institute(String typpe, String educationalLevel, BusinessGroup businessGroup) {
        this.typpe = typpe;
        this.educationalLevel = educationalLevel;
        this.businessGroup = businessGroup;
        this.listResearchers = new ArrayList<>();
    }
    
    @Override 
    public String toString() {
        return "Institute{" +
               "type='" + typpe + '\'' +
               ", educationalLevel='" + educationalLevel + '\'' +
               '}';
    }

    public String getTyppe() {
        return typpe;
    }

    public void setTyppe(String typpe) {
        this.typpe = typpe;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

    public List<Researcher> getListResearchers() {
        return listResearchers;
    }

    public void setListResearchers(List<Researcher> listResearchers) {
        this.listResearchers = listResearchers;
    }

    public BusinessGroup getBusinessGroup() {
        return businessGroup;
    }

    public void setBusinessGroup(BusinessGroup businessGroup) {
        this.businessGroup = businessGroup;
    }

    
    
}