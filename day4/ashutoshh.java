import java.util.Arrays;
import java.util.List;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
public class ashutoshh {
    public static void main(String[] args) {
        // all the code will be here 
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
        SparkConf conf = new SparkConf().setAppName("StartingApacheSpark").setMaster("local[*]");
        JavaSparkContext sc = new JavaSparkContext(conf); // starting DAG 
        JavaRDD<Integer> myRDD2 = sc.parallelize(data); // create DAG 
        JavaRDD<Double> myRDD3 = myRDD2.map(x -> Math.sqrt(x)); // create DAG 
        List<Double> mydata = myRDD3.collect(); // executing DAG 

        // parallelize is to create RDD from collection of data 
    }

}
