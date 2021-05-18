public class Item {

    private String name;
    private String description;
    private double weight;


    public Item(String name, String description, double weight) {
        setName(name);
        setDescription(description);
        setWeight(weight);
    }

    public String getName() {

        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return "\n" + description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
