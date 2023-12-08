
(환경)
java : 17
spring boot: '2.7.2'
	
(실행)
localhost:10116
localhost:10116/hello.do

(src/main/resources/application.properties)
# tomcat server.port
server.port = 10116

# webapp
spring.mvc.view.prefix= /WEB-INF/views/
spring.mvc.view.suffix= .jsp
server.port = 10116

(build.gradle)
JSP 사용을 위해 필요한 패키지
dependencies {
	implementation 'org.apache.tomcat.embed:tomcat-embed-jasper'
}