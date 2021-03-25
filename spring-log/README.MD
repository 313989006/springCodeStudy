
spring 5.0.9 环境下
1、如果只依赖 context，直接抛 test，使用的 jul（util-logging）
2、如果引入了 log4j  依赖，日志级别为 ERROR，跑 test，也会打印日志
    但是如果日志级别为 INFO，跑 test，会打印日志
    说明 Spring 5 的日志默认不是 log4j
 
Spring 4.0.4 环境下
1、如果引入了 log4j  依赖，日志级别为 ERROR，跑 test，不会打印日志
    但是如果日志级别为 INFO，跑 test，会打印日志
    说明 Spring 4.0.4 的日志使用的是 log4j
  
