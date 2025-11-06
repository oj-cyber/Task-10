package Add_item;

public class liabilities {
    private String particular;

    private double Amount;

    public liabilities(String particular, double Amount) {
        this.particular = particular;

        this.Amount = Amount;
    }

    public void setName(String particular) {
        this.particular = particular;
    }

    public void setPrice(double Amount) {
        this.Amount = Amount;
    }

    public void ShowInfo(){
        System.out.println("particular:"+" "+particular);

        System.out.println("Amount:"+" "+"UGX"+Amount);
    }

}
