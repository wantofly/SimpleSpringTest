cd E:\E\MyJava6_spring\SimpleSpringTest
> mvn compile

mvn archetype：create 创建Maven项目
mvn compile 编译源代码
mvn deploy 发布项目
mvn test-compile 编译测试源代码
mvn test 运行应用程序中的单元测试
mvn site 生成项目相关信息的网站
mvn clean 清除项目目录中的生成结果
mvn package 根据项目生成的jar
mvn install 在本地Repository中安装jar
mvn eclipse:eclipse 生成eclipse项目文件
mvnjetty:run 启动jetty服务
mvntomcat:run 启动tomcat服务

jaxb
src/main/resources/schema
target/generated-sources/jaxb
plugin: ref:http://mojo.codehaus.org/
<groupId>org.codehaus.mojo</groupId>
<artifactId>jaxb2-maven-plugin</artifactId>
自定义类型如日期格式 jaxb_binding.xml
http://josenemily.blog.163.com/blog/static/5643479201011133028798/

用xjc手工生成java
xjc -extension jaxb_bindings.xml -p com.cginfo.test.simplespring.util -d .\ JaxbUnmarshaller.xsd