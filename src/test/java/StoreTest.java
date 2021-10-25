import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Flower flower1 = new Flower(5,Color.Black,10,FlowerType.Rose);
    private FlowerPack pack1 = new FlowerPack(flower1,5);
    private Flower flower2 = new Flower(4,Color.Red,7,FlowerType.Tulip);
    private FlowerPack pack2 = new FlowerPack(flower2,6);
    private FlowerPack[] packs1= {pack1,pack2};
    private  FlowerBucket bucket1 = new FlowerBucket(packs1);
    ///
    private Flower flower3 = new Flower(3,Color.Yellow,10,FlowerType.Rose);
    private FlowerPack pack3 = new FlowerPack(flower3,5);
    private Flower flower4 = new Flower(6,Color.Red,12,FlowerType.Rose);
    private FlowerPack pack4 = new FlowerPack(flower4,6);
    private FlowerPack[] packs2= {pack3,pack4};
    private  FlowerBucket bucket2 = new FlowerBucket(packs2);
    private FlowerBucket[] stuff = {bucket1,bucket2};
    //
    Store store = new Store(stuff);
    @Test
    void search() {
        assertEquals(true,store.search(bucket2));

    }
}