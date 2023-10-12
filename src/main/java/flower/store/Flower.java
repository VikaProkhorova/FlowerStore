package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter @AllArgsConstructor @ToString @NoArgsConstructor
public class Flower extends Item {
    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.color = flower.color;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
    }

    private FlowerType flowerType;
    private FlowerColor color;
    private double price;
    private double sepalLength;

    public void setType(FlowerType type) {
        this.flowerType = type;
    }
    public String getColor() {
        return color.toString();
    }
    public void setColor(FlowerColor newColor) {
        this.color = newColor;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
