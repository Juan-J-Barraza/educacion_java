package models;

import java.util.Date;

public class Publication {
    private String title;
    private String description;
    private String statusPublication;
    private Date publicationDate;
    
    public Publication() {
    }

    public Publication(String title, String description, String statusPublication, Date publicationDate) {
        this.title = title;
        this.description = description;
        this.statusPublication = statusPublication;
        this.publicationDate = publicationDate;
    }

    
    @Override 
    public String toString() {
        return "Publication{" +
               "description='" + description + '\'' +
               ", statusPublication='" + statusPublication + '\'' +
               ", publicationDate='" + publicationDate + '\'' +
               '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatusPublication() {
        return statusPublication;
    }

    public void setStatusPublication(String statusPublication) {
        this.statusPublication = statusPublication;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    

    
}
