package baitapzalo;
public class Product {
   String name;
   Double price;
   int Quantity;
   public Product(String name, Double price, int Quantity){
       this.name = name;
       this.price = price;
       this.Quantity = Quantity;
   }
   public String display(){
       return "sản phẩm hiện tại" + name + "giá hiện tại" + price + "số lượng hiện có" + Quantity;
   }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                '}';
    }
}
