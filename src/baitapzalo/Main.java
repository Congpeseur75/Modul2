package baitapzalo;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Product nyCong = new Product("Ngọc My",600.0,100);
    static Product nyKhoa = new Product("Ngọc Vy",500.0,100);
    static Product[] products = {nyCong,nyKhoa};
    public static void main(String[] args) {
        while (true) {
            System.out.println("Quản lí sản phẩm");
            System.out.println("1. hiển thị");
            System.out.println("2. thêm sản phẩm");
            System.out.println("3. sửa sản phẩm");
            System.out.println("4. xóa sản phẩm");
            System.out.println("5. sắp sếp sản phẩm theo giá");
            System.out.println("6. nhập sản phẩm cần tìm");
            int choice = scanner.nextInt();
            if (choice == 1){
                display();
                System.out.println("------------------");
            }
            else if (choice == 2){
                addProduct();
            }
            else if(choice == 3){
                editProduct();
            }
            else if (choice == 4){
                deleteProduct();
            }
            else if (choice == 5){
                arrangeProduct();
            }
            else {
                searchProduct();
            }
        }
    }
    public static void display(){
        for (Product product : products){
            System.out.println(product.display());
        }
    }

    public static void addProduct(){
        System.out.println("nhập name sản phẩm");
        String name = scanner.nextLine();
        System.out.println("nhập giá sản phẩm");
        Double price = scanner.nextDouble();
        System.out.println("nhập số lượng");
        int Quantity = scanner.nextInt();
        Product product = new Product(name,price,Quantity);
        Product [] productsNew = new Product[products.length+1];
        for (int i = 0; i < products.length; i++) {
            productsNew[i] = products[i];
        }
        productsNew[productsNew.length-1] = product;
        products = productsNew;
    }
    public static void editProduct() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm cần sửa:");
        String name = scanner1.nextLine();

        for (int i = 0; i < products.length; i++) {
            if (name.equals(products[i].name)) {
                System.out.println("Chọn thông tin cần sửa:");
                System.out.println("1. Tên sản phẩm");
                System.out.println("2. Giá sản phẩm");
                System.out.println("3. Số lượng");
                int editChoice = scanner.nextInt();

                switch (editChoice) {
                    case 1:
                        System.out.println("Nhập tên mới:");
                        String newName = scanner1.next();
                        products[i].name = newName;
                        break;
                    case 2:
                        System.out.println("Nhập giá mới:");
                        double newPrice = scanner1.nextDouble();
                        products[i].price = newPrice;
                        break;
                    case 3:
                        System.out.println("Nhập số lượng mới:");
                        int newQuantity = scanner1.nextInt();
                        products[i].Quantity = newQuantity;
                        break;
                }
                display();
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có tên: " + name);
    }
    public static void deleteProduct() {
        System.out.println("Nhập tên sản phẩm cần xóa:");
        String name = scanner.next();

        for (int i = 0; i < products.length; i++) {
            if (name.equals(products[i].name)) {
                Product[] productsNew = new Product[products.length - 1];
                System.arraycopy(products, 0, productsNew, 0, i);
                System.arraycopy(products, i + 1, productsNew, i, products.length - i - 1);
                products = productsNew;

                System.out.println("Sản phẩm sau khi xóa:");
                display();
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có tên: " + name);
    }
    public static void arrangeProduct(){
        for (int i = 0; i < products.length; i++) {
            for (int j = 1; j < products.length ; j++) {
                if (products[i].price > products[j].price){
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }
        display();
    }
    public static void searchProduct(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("nhập tên sản phẩm cần tìm");
        String name = scanner1.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (name.equals(products[i].name)){
                System.out.println(products[i].toString());
            }
        }
    }
}

