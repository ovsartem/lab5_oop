
public class FlowerPack {
    Flower flower;
    int amount;
    CalculatePrice calculatePrice;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount =amount;
    }

    int price(){
        return calculatePrice.calculate(flower,amount);
    }
    public boolean equals(FlowerPack obj) {
        return this.flower.equals(obj.flower) && this.amount==obj.amount;
    }
}


class CalculatePrice{
    public static int calculate (Flower flower,int amount) {
        return amount*flower.getPrice();
    }
}