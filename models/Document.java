package models;

import java.util.Date;

public class Document {
    private String report;
    private Date date;


    public Document() {

    }

    public Document(String report, Date date) {
        this.report = report;
        this.date = date;
    }

    @Override 
    public String toString() {
        return "Documentt{" +
               "report='" + report + '\'' +
               ", date='" + date + '\'' +
               '}';
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
}
