// Problem Statement
// Design an Online Shopping System using Java OOP principles.
// Create the following classes:
// Person (Abstract Class)
// id
// name
// Email
// Customer extends Person city primeMember
// Seller extends Person companyName sellerRating
// Product productId productName category price rating inStock
// Seller seller
// Requirements:
// Use Encapsulation
// Use Inhenlance
// Use Constructors
// Override loString
// Store all objects using ArrayList.
// Creale.
// 4 Customers
// 3 Sellers
// 8 Products
// Using Stream APl, perform the following operations Display all product names
// Display all products that are in stock
// Find products costing more than $1000
// Find all Prime customers.
// Find sellers with rating above 4.5
// Sort products by price
// Sort sellers by rating (descending).
// Display all unique product calegones
// Count products that are in stock.
// Find the costliest and cheapest product.
// Calculate the average product price
// Calculate the total value of all products using reduced heck whether all products fre in stack.
// Check whether any customer belongs to Delhi.
// Find the first Prime customer.
// Display the top 3 highest-raled products.
// Group products by category
// Group products by seller.
// Partition products into In Stock and Out of Stock
// Create a Mapsinteger, Product> using Product ID as the key Print all customer names separaled by commas
import java.util.*;
import java.util.stream.*;

abstract class Person {
    private int id;
    private String name;
    private String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "ID=" + id + ", Name=" + name + ", Email=" + email;
    }
}

class Customer extends Person {
    private String city;
    private boolean primeMember;

    public Customer(int id, String name, String email, String city, boolean primeMember) {
        super(id, name, email);
        this.city = city;
        this.primeMember = primeMember;
    }

    public String getCity() {
        return city;
    }

    public boolean isPrimeMember() {
        return primeMember;
    }

    @Override
    public String toString() {
        return super.toString() + ", City=" + city + ", Prime=" + primeMember;
    }
}

class Seller extends Person {
    private String companyName;
    private double sellerRating;

    public Seller(int id, String name, String email, String companyName, double sellerRating) {
        super(id, name, email);
        this.companyName = companyName;
        this.sellerRating = sellerRating;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getSellerRating() {
        return sellerRating;
    }

    @Override
    public String toString() {
        return super.toString() + ", Company=" + companyName + ", Rating=" + sellerRating;
    }
}

class Product {
    private int productId;
    private String productName;
    private String category;
    private double price;
    private double rating;
    private boolean inStock;
    private Seller seller;

    public Product(int productId, String productName, String category,
                   double price, double rating, boolean inStock, Seller seller) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.rating = rating;
        this.inStock = inStock;
        this.seller = seller;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public boolean isInStock() {
        return inStock;
    }

    public Seller getSeller() {
        return seller;
    }

    @Override
    public String toString() {
        return productId + " " + productName + " " + category +
                " $" + price + " Rating=" + rating +
                " InStock=" + inStock +
                " Seller=" + seller.getName();
    }
}

public class OnlineShoppingSystem {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Seller> sellers = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

        // Sellers
        Seller s1 = new Seller(1, "Rahul", "rahul@gmail.com", "TechWorld", 4.8);
        Seller s2 = new Seller(2, "Amit", "amit@gmail.com", "MobileHub", 4.2);
        Seller s3 = new Seller(3, "Neha", "neha@gmail.com", "LaptopZone", 4.9);

        sellers.add(s1);
        sellers.add(s2);
        sellers.add(s3);

        // Customers
        customers.add(new Customer(101, "Ankit", "ankit@gmail.com", "Delhi", true));
        customers.add(new Customer(102, "Rohit", "rohit@gmail.com", "Noida", false));
        customers.add(new Customer(103, "Priya", "priya@gmail.com", "Delhi", true));
        customers.add(new Customer(104, "Simran", "simran@gmail.com", "Jaipur", false));

        // Products
        products.add(new Product(1, "iPhone", "Mobile", 1200, 4.8, true, s1));
        products.add(new Product(2, "Samsung", "Mobile", 900, 4.5, true, s2));
        products.add(new Product(3, "MacBook", "Laptop", 2000, 4.9, true, s3));
        products.add(new Product(4, "HP Laptop", "Laptop", 1100, 4.4, false, s3));
        products.add(new Product(5, "Watch", "Accessories", 300, 4.3, true, s1));
        products.add(new Product(6, "Headphones", "Accessories", 150, 4.6, false, s2));
        products.add(new Product(7, "Keyboard", "Electronics", 80, 4.2, true, s1));
        products.add(new Product(8, "Monitor", "Electronics", 450, 4.7, true, s2));

        // 1
        System.out.println("\nProduct Names");
        products.stream().map(Product::getProductName).forEach(System.out::println);

        // 2
        System.out.println("\nProducts In Stock");
        products.stream().filter(Product::isInStock).forEach(System.out::println);

        // 3
        System.out.println("\nProducts >1000");
        products.stream().filter(p -> p.getPrice() > 1000).forEach(System.out::println);

        // 4
        System.out.println("\nPrime Customers");
        customers.stream().filter(Customer::isPrimeMember).forEach(System.out::println);

        // 5
        System.out.println("\nSeller Rating >4.5");
        sellers.stream().filter(s -> s.getSellerRating() > 4.5).forEach(System.out::println);

        // 6
        System.out.println("\nSort Products by Price");
        products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(System.out::println);

        // 7
        System.out.println("\nSort Sellers by Rating Desc");
        sellers.stream()
                .sorted(Comparator.comparing(Seller::getSellerRating).reversed())
                .forEach(System.out::println);

        // 8
        System.out.println("\nUnique Categories");
        products.stream()
                .map(Product::getCategory)
                .distinct()
                .forEach(System.out::println);

        // 9
        System.out.println("\nCount In Stock");
        System.out.println(products.stream().filter(Product::isInStock).count());

        // 10
        System.out.println("\nCostliest Product");
        System.out.println(products.stream()
                .max(Comparator.comparing(Product::getPrice))
                .get());

        System.out.println("\nCheapest Product");
        System.out.println(products.stream()
                .min(Comparator.comparing(Product::getPrice))
                .get());

        // 11
        System.out.println("\nAverage Price");
        System.out.println(products.stream()
                .collect(Collectors.averagingDouble(Product::getPrice)));

        // 12
        System.out.println("\nTotal Value");
        System.out.println(products.stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum));

        // 13
        System.out.println("\nAll Products In Stock?");
        System.out.println(products.stream().allMatch(Product::isInStock));

        // 14
        System.out.println("\nAny Customer From Delhi?");
        System.out.println(customers.stream()
                .anyMatch(c -> c.getCity().equalsIgnoreCase("Delhi")));

        // 15
        System.out.println("\nFirst Prime Customer");
        System.out.println(customers.stream()
                .filter(Customer::isPrimeMember)
                .findFirst()
                .get());

        // 16
        System.out.println("\nTop 3 Highest Rated Products");
        products.stream()
                .sorted(Comparator.comparing(Product::getRating).reversed())
                .limit(3)
                .forEach(System.out::println);

        // 17
        System.out.println("\nGroup By Category");
        Map<String, List<Product>> byCategory =
                products.stream().collect(Collectors.groupingBy(Product::getCategory));
        System.out.println(byCategory);

        // 18
        System.out.println("\nGroup By Seller");
        Map<String, List<Product>> bySeller =
                products.stream().collect(Collectors.groupingBy(p -> p.getSeller().getName()));
        System.out.println(bySeller);

        // 19
        System.out.println("\nPartition By Stock");
        Map<Boolean, List<Product>> partition =
                products.stream().collect(Collectors.partitioningBy(Product::isInStock));
        System.out.println(partition);

        // 20
        System.out.println("\nMap<Integer,Product>");
        Map<Integer, Product> productMap =
                products.stream().collect(Collectors.toMap(Product::getProductId, p -> p));
        System.out.println(productMap);

        // 21
        System.out.println("\nCustomer Names");
        String names = customers.stream()
                .map(Customer::getName)
                .collect(Collectors.joining(", "));
        System.out.println(names);
    }
}