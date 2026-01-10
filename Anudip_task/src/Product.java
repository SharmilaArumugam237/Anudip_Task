public class Product {
    private int productId;
    private String productName;
    private double price;
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        if (productId > 0) {
            this.productId = productId;
        } else {
            System.out.println("Product ID must be greater than 0.");
        }
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        if (productName != null && !productName.isEmpty()) {
            this.productName = productName;
        } else {
            System.out.println("Product name cannot be empty.");
        }
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be greater than 0.");
        }
    }
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
}
class ProductTest {
    public static void main(String[] args) {
        Product p = new Product();
        p.setProductId(101);
        p.setProductName("Laptop");
        p.setPrice(75000);
        p.displayProductDetails();
    }
}


