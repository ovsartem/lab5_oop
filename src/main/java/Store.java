import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Store {
    FlowerBucket[] buckets;
    boolean search(FlowerBucket bucket){
        int i;
        for (i=0;i< buckets.length;i++){
            System.out.println(i);
            if (bucket.equals(buckets[i])){
                return true;
            }
    }return false;
}}
