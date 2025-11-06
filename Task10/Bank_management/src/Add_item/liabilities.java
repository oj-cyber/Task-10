package Add_item;

public class liabilities {
    private String name;
    private String id;
    private double price;

    public liabilities(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void ShowInfo(){
        System.out.println("Name:"+" "+name);
        System.out.println("ID:"+" "+id);
        System.out.println("Price:"+" "+price);
    }

}
