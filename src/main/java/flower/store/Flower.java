package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter @AllArgsConstructor @ToString @NoArgsConstructor
public class Flower extends Item {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setType(FlowerType type) {
        this.flowerType = type;
    }
    public void setColor(FlowerColor color){
        this.color = color;
    }
    public Flower(Flower flower){
        this.flowerType = flower.flowerType;
        this.color = flower.color;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
    }
}
