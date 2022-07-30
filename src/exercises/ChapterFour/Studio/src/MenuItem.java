import java.util.ArrayList;

public class MenuItem {

    private int price;
    private String name;
    private String description;
    private String category;
    private int dateCreated;
    private int dateUpdated;
    private boolean isNew = true;

    ArrayList<String> menuItems =  new ArrayList<String>();

    public MenuItem (int price, String name, String description, String category, int dateCreated, int dateUpdated, boolean isNew){
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.isNew = isNew;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(int dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(int dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void newItem (String itemName){
        if (!menuItems.contains(itemName)){
            menuItems.add(itemName);
            isNew = true;
        }else{
            isNew = false;
        }
    }
}
