package models;

public class Resource {
    private String type;
    private String description;
    private String availability;
    private Task task;

    public Resource() {
    }

    public Resource(String type, String description, String availability, Task task) {
        this.type = type;
        this.description = description;
        this.availability = availability;
        this.task = task;
    }

    @Override 
    public String toString() {
        return "Resource{" +
               " type='" + type + '\'' +
               ", description='" + description + '\'' +
               ", availability='" + availability + '\'' +
               '}';
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

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
    
    

    
}
