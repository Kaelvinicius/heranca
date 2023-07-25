package entities;

public class UsedProduct extends Produto {
    private String manufactureData;

    public UsedProduct(String manufactureData) {
        this.manufactureData = manufactureData;
    }

    public UsedProduct(String name, Double price, String manufactureData) {
        super(name, price);
        this.manufactureData = manufactureData;
    }
    @Override
    public  String priceTag(){
        return super.priceTag() + " (Manufacture Date: " + manufactureData + ")";
    }
}
