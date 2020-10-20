1、首先定义MyTomcat类
属性：port：private int port = 8088;
无参构造方法：public MyTomcat(){ }
有参构造方法：public MyTomcat(int port){this.port = port;}
get set方法
start（）方法：启动方法

这里最开始是先定义一个ServerSocket和Socket，直接通过获取输出流打印到页面。
经过改造，获取请求头信息，请求头信息如下（通过访问http://localhost:8088/）：
GET / HTTP/1.1
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8Accept-Language: zh-Hans-CN,zh-Hans;q=0.8,en-US;q=0.5,en;q=0.3Upgrade-Insecure-Requests: 1User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36 Edge/18.18363Accept-Encoding: gzip, deflateHost: localhost:8088Connection: Keep-Alive

2、取出header的请求方法、请求路径信息

3、定义请求Request，请求返回Response

4、定义Servlet抽象类，doGet，doPost、service方法

5、定义MxkServlet类，实现Servlet，重写doGet，doPost、service方法

6、定义ServletConfig

7、定义ServletConfigMapping类，指定对应的servlet，可以通过反射的方式

8、优化MyTomcat

详见 有道云笔记之：spring源码学习笔记--Tomcat