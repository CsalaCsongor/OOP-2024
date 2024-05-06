package oop.labor11;

public class Product implements Comparable<Product>{
    private int  identifier;
    private String name;
    private int amount;
    private int price;

    public Product(int identifier, String name, int amount, int price) {
        this.identifier = identifier;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void increaseAmount(int newAmount)
    {
        this.amount = this.amount + newAmount;
    }

    @Override
    public String toString() {
        return
                " name='" + name + '\'' +
                " amount=" + amount +
                " price=" + price +
                "\n";
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.identifier, o.identifier);
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
