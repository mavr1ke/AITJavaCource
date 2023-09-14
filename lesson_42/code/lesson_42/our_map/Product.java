package lesson_42.our_map;

import java.util.Objects;

public class Product {

    private String name;
    private String description;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }

        Product p = (Product) o;

        return name.equals(p.name) && description.equals(p.description);
    }

    public int hashCode() {
        return Objects.hash(name,description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
