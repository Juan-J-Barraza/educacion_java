package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
    private String description;
    private Date duration;
    private List<Resource> listResources;

    public Task() {
    }

    public Task(String description, Date duration) {
        this.description = description;
        this.duration = duration;
        this.listResources = new  ArrayList<>();
    }

    @Override 
    public String toString() {
        return "Resource{" +
               " description='" + description + '\'' +
               ", duration='" + duration + '\'' +
               '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public List<Resource> getListResources() {
        return listResources;
    }

    public void setListResources(List<Resource> listResources) {
        this.listResources = listResources;
    }

    
}

