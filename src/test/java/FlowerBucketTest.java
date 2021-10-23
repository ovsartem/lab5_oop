import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private Flower flower1 = new Flower(5,Color.Black,10,FlowerType.Rose);
    private FlowerPack pack1 = new FlowerPack(flower1,5);
    private Flower flower2 = new Flower(4,Color.Red,7,FlowerType.Tulip);
    private FlowerPack pack2 = new FlowerPack(flower2,6);
    private FlowerPack[] packs= {pack1,pack2};
    private  FlowerBucket bucket = new FlowerBucket(packs);

//    private FlowerBucketTest bucket = FlowerType();
    @Test
    void price() {
        assertEquals(92,bucket.price());
    }
}