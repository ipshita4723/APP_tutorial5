
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    
    public abstract double getDiscountRate();

    public double getFinalPrice() {
        return price - (price * getDiscountRate());
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Electronics extends Product {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    
    public double getDiscountRate() {
        return 0.20; 
    }
}

class Clothing extends Product {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double getDiscountRate() {
        return 0.15; 
    }
}

class Books extends Product {
    public Books(int productId, String name, double price) {
        super(productId, name, price);
    }

    
    public double getDiscountRate() {
        return 0.10; 
    }
}


public class Shop {
    public static void main(String[] args) {
       
        Product[] cart = {
            new Electronics(101, "Laptop", 1000.0),
            new Clothing(102, "Jacket", 100.0),
            new Books(103, "Java Programming", 50.0)
        };

        System.out.println(" Cart Summary");
        for (Product item : cart) {
            System.out.printf("%s (Original: $%.2f) -> Final Price: $%.2f%n",
                    item.getName(), item.getPrice(), item.getFinalPrice());
        }
    }
}