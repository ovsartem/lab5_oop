
public class FlowerBucket {
    protected FlowerPack [] bucket;
    protected CalculateBucketPrice calculateBucketPrice;

    public FlowerBucket(FlowerPack[] bucket) {
        this.bucket = bucket;
    }

    public int price(){
        return calculateBucketPrice.calculate(bucket);
    }
    public boolean equals(FlowerBucket obj) {
        if (this.bucket.length != obj.bucket.length){
            return false;
        }else {
            int i;
            for (i=0;i<this.bucket.length;i++){
                if (this.bucket[i].equals(obj.bucket[i]) == false){
                    return false;
                }
            }
            return true;
        }
    }

}

class CalculateBucketPrice{
    public static int calculate (FlowerPack [] bucket) {
        int price = 0;
        int i;
        for (i=0;i< bucket.length;i++){
            price+=bucket[i].price();
        }
        return price;
    }
}