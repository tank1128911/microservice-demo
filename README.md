1.简介
==
1.本项目为Sping boot + Spring Clound构建分布式微服务的demo项目

2.各服务的启动命令为：java -jar <jar包名>.jar

2.子项目说明
==
2.1 oz-microservice-eureka：包含Eureka服务，是注册和监控服务；该服务必须先于其它服务启动
    
2.2 oz-microservice-client-sayhello：Hello World示例服务

2.3 oz-microservice-ribbon：ribbon客户端调用服务示例（含断路器示例）

2.4 oz-microservice-feign：feign客户端调用服务示例（含断路器示例）

2.5 oz-microservice-zuul：服务路由示例