package Baithi.model;

public class Product {
    private  String nameProduct;
    private  int price;
    private int quantity;
    private String clor;
    private String description;
    private String category;

    public Product() {
    }

    public Product(String nameProduct, int price, int quantity, String clor, String description, String category) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
        this.clor = clor;
        this.description = description;
        this.category = category;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getClor() {
        return clor;
    }

    public void setClor(String clor) {
        this.clor = clor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
