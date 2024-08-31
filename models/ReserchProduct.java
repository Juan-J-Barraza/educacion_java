package models;

import java.util.ArrayList;
import java.util.List;

public class ReserchProduct {
    private String name;
    private String type;
    private String description;
    private String status;
    private int assignedPoints;
    private List<Task> listTasks;
    private Document document;
    private Publication publication;
    private ResearchProject reserchProject;
    private List<Researcher> listResearch;

    public ReserchProduct() {
    }

    public ReserchProduct(String name, String type, String description, String status, int assignedPoints,
            Document document, Publication publication, ResearchProject reserchProject) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.status = status;
        this.assignedPoints = assignedPoints;
        this.document = document;
        this.publication = publication;
        this.reserchProject = reserchProject;
        this.listTasks = new ArrayList<>();
        this.listResearch = new ArrayList<>();
    }

    
    @Override 
    public String toString() {
        return "ReserchProduct{" +
               "name='" + name + '\'' +
               ", type='" + type + '\'' +
               ", description='" + description + '\'' +
               ", status='" + status + '\'' +
               ", assignedPoints='" + assignedPoints + '\'' +
               '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAssignedPoints() {
        return assignedPoints;
    }

    public void setAssignedPoints(int assignedPoints) {
        this.assignedPoints = assignedPoints;
    }

    public List<Task> getListTasks() {
        return listTasks;
    }

    public void setListTasks(List<Task> listTasks) {
        this.listTasks = listTasks;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public ResearchProject getReserchProject() {
        return reserchProject;
    }

    public void setReserchProject(ResearchProject reserchProject) {
        this.reserchProject = reserchProject;
    }

    public List<Researcher> getListResearch() {
        return listResearch;
    }

    public void setListResearch(List<Researcher> listResearch) {
        this.listResearch = listResearch;
    }

    

    

    
}
