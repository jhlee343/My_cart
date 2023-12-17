import java.util.HashMap;

public class Cart {
    HashMap<Product, Integer>map = new HashMap<>();

    public void addProduct(Product product, Integer amount) {
        //
        map.merge(product, amount,Integer::sum);
    }

    public void removeProduct(Product product, Integer amount) {
        //
        map.merge(product, amount,((Integer, Integer2) -> Math.max(0,Integer-Integer2)));
    }

    public void showitems() {
        System.out.println("현재 담긴 상품들");
        map.forEach((key,value)->{
            System.out.println(key.getName()+" ->"+ value +"개");
        });
    }
}
