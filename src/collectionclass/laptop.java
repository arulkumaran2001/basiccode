package collectionclass;

public class laptop {
    int price, ram;
    boolean touch;
    String brand;

    public laptop(String brand,int price, int ram, boolean touch) {
        this.price=price;
        this.ram=ram;
        this.touch=touch;
        this.brand=brand;

    }

    @Override
    public String toString() {
        return "brand: "+this.brand+" price"+this.price+"\n";
    }
}
