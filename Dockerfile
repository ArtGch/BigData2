FROM openjdk:11
ADD target/projet_Gachod.jar projet_Gachod.jar
CMD ["java", "-jar", "projet_Gachod.jar"]
EXPOSE 8080