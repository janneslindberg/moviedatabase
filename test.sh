./mvnw clean spring-boot:run -Dspring-boot.run.profiles=test -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8787"
# -Dspring.profiles.active=test
# -Dspring-boot.run.profiles