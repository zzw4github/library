##### 配置logback

https://www.cnblogs.com/lixuwu/p/5804793.html

http://nginx.org/en/docs/beginners_guide.html

##### nginx

https://www.cnblogs.com/eggplantpro/p/7445795.html

nginx.exe 以服务的方式启动？

it is likely not .

怎么启动了两个nginx进程，跟配置的代理服务器有关吗？

no , there is a master process

upstream 负载均衡 proxy-servers 不能用_ tomcat9 报错

location 是反向代理吗？

怎么不用配 location ~ \.jsp$ 也能访问jsp文件？

upstream proxy-servers {
​		server localhost:8080;
​		server localhost:8081;
​	}
​    server {
​        listen       8082;
​        server_name  localhost;

        #charset koi8-r;
    
        #access_log  logs/host.access.log  main;
    
        location / {
            # root   html;
            # index  index.html index.htm;
            proxy_pass http://proxy-servers/examples/;
           
        }
        location /examples/ { 
        proxy_pass http://proxy-servers/examples/;
        proxy_redirect default;
        } 
redis 

 https://www.cnblogs.com/gdpuzxs/p/7222309.html

https://blog.csdn.net/sy793314598/article/details/80719224

vuejs

bootstrap

es

https://blog.csdn.net/linzhiqiang0316/article/details/80343401

mysql



##### 原因：

因为删除了maven的子模块文件夹，但是没删pom中的配置，导致运行时按default配置。找不到application.yml，导致了问题1，问题2

##### 问题1

 @Value{''}  找不到yml中的参数值，找不到 redis 配置参数

##### 解决1 

注释掉后，配上@ConfigurationProperties(prefix="spring.redis") -> 以为好了

##### 乱投医1

以为 yml 和 properties 读取参数的配置不同，baidu

一直找不到原因，想要debug但是不知从哪个类开始，==输入的日志显示没有 profile是 default，也没想到是配置文件没有找到==，

配置上propertysource显示找不到application.yml，

加上application-dev,在 appcation中配置dev，

以为是 spring.profile.active这个参数不正确 以为是actived 或不要active，

dev这个值不正确，以为是development没配正确，

在run configuration 中设置 profile 也不行。

注释掉

##### 问题2：

datasource url没有配置 因为默认没有配置，依赖中有连数据库的jar包-mybatis

##### 解决2：

baidu 各种原因 最后找到一个，受启发

执行mvn clean compile 发现 es子模块不存在，删除 -> 可以运行

##### 原因：

重新编译后可以找到配置文件。

问题原因 按profile：default启动 可以启动，但是找不到的boot配置文件，

##### 新问题：

   发现 @Value 找不到参数是因为没有加载application配置文件

==原因： maven项目有问题-> 配置文件没有加载->默认配置起作用==

##### 问题3

start-redis 2 和 1 configuration代码不同

##### 问题四

redis   xx can't cast to xx

缓存对象需要实现serializable infterace