### jdk

查询系统版本

```
cat /etc/issue
```

查看yum包含的jdk版本

```
yum search java 或者 yum list java*
```

查看java版本

```
java -version
```

查看java相关信息

```
whereis java
which java （java执行路径）
echo $JAVA_HOME
echo $PATH
```

查看已安装java版本

```
rpm -qa | grep jdk
rpm -qa | grep gcj
```

卸载

```
yum -y remove  查到的java-1.8.0-openjdk*
```

安装jdk

```
yum install java-1.8.0-openjdk-devel.x86_64
或者
yum -y install java-1.8.0-openjdk*
```

安装的默认路径

```
 /usr/lib/jvm/java-1.8.0-openjdk-1.8.0
```

配置全局变量

```
vi /etc/profile
```

java_home已自己实际目录为准

```
export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.171-8.b10.el6_9.x86_64
export CLASSPATH=.:$JAVA_HOME/jre/lib/rt.jar:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
export PATH=$PATH:$JAVA_HOME/bin
```

全局变量立即生效

```
source /etc/profile
```

查看目录命令

```
find / -name 'java'
```

分配权限

```
sudo chmod -R 777 /usr/local/nginx
```



### tomcat

tomcat目录

```
    bin             --启动命令目录
    conf           --配置文件目录      重点
    lib              --库文件目录
    logs           --日志文件目录      重点
    temp         --临时缓存文件
    webapps  --web应用家目录    重点
    work         --工作缓存目录
```

官网下载

```
wget https://www-us.apache.org/dist/tomcat/tomcat-8/v8.5.49/bin/apache-tomcat-8.5.49.tar.gz
```

解压缩

```
tar -zxvf xxx
```

