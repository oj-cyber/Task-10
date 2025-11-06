package Add_item;

public class Profits {
    private String source;
    private double price;

    public Profits(String source, double price) {
        this.source = source;
        this.price = price;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void ShowInfo(){
        System.out.println("Name:"+" "+source);
        System.out.println("Price:"+" "+price);
    }
}
