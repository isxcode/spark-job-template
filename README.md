# spark-job-template
至轻云自定义作业模版

### 产品介绍
  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; [**至轻云**](https://zhiqingyun.isxcode.com)是一款超轻量级、企业级大数据平台，具备一键部署、开箱即用的特点。无需安装额外的大数据组件，即可快速实现企业级的离线ETL、实时计算和作业定时调度等功能，帮助企业高效处理海量数据，挖掘更多商业价值。

### 构建命令

```bash
git clone https://github.com/isxcode/spark-job-template.git
cd spark-job-template
./gradlew clean build
cp ./build/libs/job1.jar ~/Downloads
```

### 使用配置

- mainClass: com.isxcode.star.job.Execute
- 请求参数: show databases;
