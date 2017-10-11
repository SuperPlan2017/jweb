### 硬件设备列表
   
   - 业务硬件设备,所有服务都是基于docker部署,每台硬件设备会部署1+以上.主要承载(大小U)模块后的所有服务.并安装基于模块服务支撑的一些组件安装...
   - 数据中心硬件设备,所有服务也都是基于docker部署,每台硬件设备会部署1+以上.主要承载大数据平台以及数据建模分析.还有提供的数据服务接口应用等..
   
  - 1.业务硬件设备
  
 |编号 |   CPU |  内存  |  硬盘  |   网卡   | 安装系统    |                           安装组件列表                         |
 | ----|:-----:| -----: |--------|----------|-------------|----------------------------------------------------------------|
 | 1   | 8core | 64-128 |  3/1T  |   百兆+  | centos 6.5+ |docker, zookeeper,kafka,dubboAdmin,zkui,redis slave,mysql slave |
 | 2   | 8core | 64-128 |  3/1T  |   百兆+  | centos 6.5+ |docker, zookeeper,kafka,redis slave,mysql master,大/小U模块服务 |
 | 3   | 8core | 64-128 |  3/1T  |   百兆+  | centos 6.5+ |docker  zookeeper,kafka,redis master,mysql slave,大/小U模块服务 |
 
  - 2.数据中心硬件设备
  
   |编号 |   CPU |  内存  |  硬盘  |   网卡   | 安装系统    |                                        安装组件列表                         |
   | ----|:-----:| -----: |--------|----------|-------------|-----------------------------------------------------------------------------|
   | 1   | 8core | 64-128 |  3/1T  |   百兆+  | centos 6.5+ |docker,hadoop,ambari,spark,zookeeper,kafka,hive,nginx,                       |
   | 2   | 8core | 64-128 |  3/1T  |   百兆+  | centos 6.5+ |docker,hadoop,spark,zookeeper,kafka,hive,爬虫系统,征信数据接口               |
   | 3   | 8core | 64-128 |  3/1T  |   百兆+  | centos 6.5+ |docker,hadoop,spark,zookeeper,kafka,hive,数据采集系统,                       |
   