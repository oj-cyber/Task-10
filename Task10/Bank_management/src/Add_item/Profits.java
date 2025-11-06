package Add_item;

public class Profits {
    private String source;
    private double Amount;

    public Profits(String source, double Amount) {
        this.source = source;
        this.Amount = Amount;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setPrice(double Amount) {
        this.Amount = Amount;
    }

    public void ShowInfo(){
        System.out.println("source:"+" "+source);
        System.out.println("Amount:"+" "+Amount);
    }
}
