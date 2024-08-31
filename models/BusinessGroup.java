package models;

import java.util.ArrayList;
import java.util.List;

public class BusinessGroup {
    private double fundsInvested;
    private List<Institute> listInstitutes;
    private List<ResearchProject> listResearchProject;

    public BusinessGroup() {

    }

    public BusinessGroup(double fundsInvested) {
        this.fundsInvested = fundsInvested;
        this.listInstitutes = new ArrayList<>();
        this.listResearchProject = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "BusinessGroup{" +
                "fundsInvested='" + fundsInvested + '\'' +
                '}';
    }

    public double getFundsInvested() {
        return fundsInvested;
    }

    public void setFundsInvested(double fundsInvested) {
        this.fundsInvested = fundsInvested;
    }

    public List<Institute> getListInstitutes() {
        return listInstitutes;
    }

    public void setListInstitutes(List<Institute> listInstitutes) {
        this.listInstitutes = listInstitutes;
    }

    public List<ResearchProject> getListResearchProject() {
        return listResearchProject;
    }

    public void setListResearchProject(List<ResearchProject> listResearchProject) {
        this.listResearchProject = listResearchProject;
    }

    
}