import lombok.*;

@Setter@Getter@AllArgsConstructor
public class Flower {
    private int sepalLength;
    private Color color;
    private int price;
    private FlowerType flowerType;
    public Flower() {
    }
    public boolean equals(Flower obj) {
        return this.getSepalLength() == obj.getSepalLength() && this.getColor()==obj.getColor() &&
                this.getPrice() == obj.getPrice() && this.getFlowerType() == obj.getFlowerType();
    }

}
