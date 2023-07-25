package entities;

public class ProdutoImportado extends Produto {
    private Double customersFee;
    public ProdutoImportado(String name, Double price, Double customersFee) {
        super(name, price);
        this.customersFee = customersFee;
    }
    public Double getCustomersFee() {
        return customersFee;
    }
    public void setCustomersFee(Double customersFee) {
        this.customersFee = customersFee;
    }
    public Double totalPrice(){
        return getPrice() + (customersFee);
    }
    @Override
    public String priceTag(){
        return getName() + " $" + totalPrice() +"(Customs fee: $ " + customersFee + ")";
    }
}

