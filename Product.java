import java.util.Objects;

public class Product {
        int key=0;
        String name;
        int price;
    public Product(String name, int price) {
        this.price = price;
        this.name = name;
    }
    public int getPrice() {
        return price;
    }

    public int getKey() {
        key = key+1;
        return key;
    }

    public String getName() {
        return name;
    }

    /* todo : equals and hashcode part rebuildint */
    @Override
    public int hashCode() {
        return Objects.hash(name,price);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Product)){
            return false;
        }
        Product product = (Product)obj;
        return key == product.key && Objects.equals(key, product.key);
    }

}
