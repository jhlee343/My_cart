import java.util.Objects;

public class Product {
        private String key;
        private String name;
        private int price;
    public Product(String key, String name, int price) {
        this.key = key;
        this.price = price;
        this.name = name;
    }
    public int getPrice() {
        return price;
    }

    public String getKey() {
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
