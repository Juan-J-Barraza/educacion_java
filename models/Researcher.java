package models;

public class Researcher {
    private String name;
    private String roleInProyect;
    private String roleInActivity;
    private Institute institute;

    public Researcher() {
    }

    public Researcher(String name, String roleInProyect, String roleInActivity,
            Institute institute) {
        this.name = name;
        this.roleInProyect = roleInProyect;
        this.roleInActivity = roleInActivity;
        this.institute = institute;
    }


    @Override 
    public String toString() {
        return "Researcher{" +
               "name='" + name + '\'' +
               ", roleInProyect='" + roleInProyect + '\'' +
               ", roleInActivity='" + roleInActivity + '\'' +
               '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleInProyect() {
        return roleInProyect;
    }

    public void setRoleInProyect(String roleInProyect) {
        this.roleInProyect = roleInProyect;
    }

    public String getRoleInActivity() {
        return roleInActivity;
    }

    public void setRoleInActivity(String roleInActivity) {
        this.roleInActivity = roleInActivity;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    

    
}
