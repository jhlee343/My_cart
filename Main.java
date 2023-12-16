import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //상품 품목 생성
        Set<Product> productSet = new HashSet<>();
        //TODO : 상품 클래스를 생성하여 상품 목록에 넣는다.
        productSet.add(new Product("a", 100));
        productSet.add(new Product("b", 200));
        //상품 목록 확인
        System.out.println("고유한 상품 목록");
        for(Product product : productSet){
            System.out.println(product.getName()+" : "+ product.getPrice()+" " + product.getKey());
        }
        Cart myCart = new Cart();

        //ToDO : 상품을 바구니에 추가 ("무엇을" , "몇개")
        myCart.addProduct(" ");
        //ToDO : 상품을 장바구니에서 제거 ("무엇을" , "몇개")
        myCart.removeProduct(" ");
        //ToDO : 상품에 현재 담긴 상품들을 출력
        myCart.showitems();
    }
}
