# spark-job-template

> spark自定义作业模版

### 产品介绍
  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; [**至轻云**](https://zhiqingyun.isxcode.com)是一款超轻量级、企业级大数据计算产品，围绕Spark生态打造的数据计算平台。一键部署，开箱即用。可快速实现Spark计算、大数据离线ETL、实时计算、作业定时调度等功能。

### 构建命令

```bash
git clone https://github.com/isxcode/spark-job-template.git
cd spark-job-template
./gradlew clean build
cp ./build/libs/spark-custom-job.jar ~/Downloads
```

### 新建作业

- 应用名称: custom-job
- mainClass: com.isxcode.spark.job.Execute
- 请求参数: show databases;

### 官网pi计算demo

- https://openfly.oss-cn-shanghai.aliyuncs.com/spark-examples_2.12-3.4.1.jar

- 应用名称: pi-demo
- mainClass: org.apache.spark.examples.SparkPi
- 请求参数: 10

查看结果地址: Finished Drivers的stdout中

![20241023172629](https://img.isxcode.com/picgo/20241023172629.png)