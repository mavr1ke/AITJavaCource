package lesson_40.equals_hashcode;

import java.util.Objects;

public class Order {

    private int id;
    private String name;

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object){
        if (this == object) {
            return true;
        }
        if (!(object instanceof Order)) {
            return false;
        }

        Order order = (Order) object;

        return id == order.id && name.equals(order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    //    @Override
//    public int hashCode(){
//        int hash = 7;
//        hash = 31 * hash * id * name.hashCode();
//        return hash;
//    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
