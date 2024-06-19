package com.isxcode.star.job;

import com.alibaba.fastjson.JSON;
import org.apache.spark.SparkConf;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import java.util.*;

public class Execute {

    public static void main(String[] args) {

        // 从args中获取参数
        String sql = args[0];

        // 初始化结果
        List<List<String>> result = new ArrayList<>();

        // 初始化sparkSession
        try (SparkSession sparkSession = initSparkSession()) {

            Dataset<Row> rowDataset = sparkSession.sql(sql);
            rowDataset.collectAsList().forEach(e -> {
                List<String> metaData = new ArrayList<>();
                for (int i = 0; i < e.size(); i++) {
                    metaData.add(String.valueOf(e.get(i)));
                }
                result.add(metaData);
            });
        }

        // 打印结果
        exportResult(result);
    }

    /**
     * 初始化sparkSession.
     */
    public static SparkSession initSparkSession() {

        SparkSession.Builder sparkSessionBuilder = SparkSession.builder();
        SparkConf conf = new SparkConf();
        conf.set("spark.executor.extraJavaOptions", "-Dfile.encoding=utf-8");
        conf.set("spark.driver.extraJavaOptions", "-Dfile.encoding=utf-8");
        conf.set("spark.cores.max", "-1");
        return sparkSessionBuilder.config(conf).getOrCreate();
    }

    // 导出结果
    public static void exportResult(Object result) {

        System.out.println("LogType:spark-yun\n" + JSON.toJSONString(result) + "\nEnd of LogType:spark-yun");
    }
}
