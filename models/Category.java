package models;

public class Category {
    private String description;
    private String categoryType;
    private String categoryUnindexed;

    public Category() {

    }

    public Category(String description, String categoryType, String categoryUnindexed) {
    this.description = description;
    this. categoryType = categoryType;
    this.categoryUnindexed = categoryUnindexed;

    }

    @Override 
    public String toString() {
        return "Category{" +
               "description='" + description + '\'' +
               ", categoryType='" + categoryType + '\'' +
               ", categoryUnindexed='" + categoryType + '\'' +
               '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getCategoryUnindexed() {
        return categoryUnindexed;
    }

    public void setCategoryUnindexed(String categoryUnindexed) {
        this.categoryUnindexed = categoryUnindexed;
    }

    
}
