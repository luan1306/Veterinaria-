FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN chmod +x ./veterinaria/mvnw

RUN ./veterinaria/mvnw clean package -DskipTests -f ./veterinaria/pom.xml

EXPOSE 8080

CMD ["sh", "-c", "java -jar veterinaria/target/*.jar"]