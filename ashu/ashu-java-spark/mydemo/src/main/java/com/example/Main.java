package com.example;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.ArrayList;
import java.util.Arrays;
import  java.util.List;

public class Main {
    public  static  void main(String[] args){
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
        
        // creating spark confi
        SparkConf conf = new SparkConf().setAppName("ashuSparkApp").setMaster("spark://spark-setup-master-svc:7077");
        // connecting to spark
        JavaSparkContext sc = new JavaSparkContext(conf);
        // creating RDD from collection of data i can also define number of partiotion
        JavaRDD<Integer> myRDD2 = sc.parallelize(data,2);
       
        // // printing 
        List<Integer> collectiondata = myRDD2.collect();
        System.out.println(collectiondata);
        // closing context
        sc.close();

    }
}
