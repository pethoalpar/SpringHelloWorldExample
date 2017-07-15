<H1>Java spring framework hello world example</h1>

<h3>pom.xml</h3>

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>4.3.9.RELEASE</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>4.3.9.RELEASE</version>
    </dependency>
</dependencies>
```

<h3>application-context.xml to declare beans</h3>

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

    <bean id="personBean" class="com.pethoalpar.Person">
        <constructor-arg type="int" value="42"/>
        <constructor-arg type="java.lang.String" value="Alpar"/>
    </bean>
</beans>
```

<h3>Create a bean</h3>

```java
public class Person {

    private int age;
    private String name;

    public void printPerson(){
        System.out.println("Name:"+this.name+"  Age:"+this.age);
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
```

<h3>Main.java</h3>

```java
public class Main {

    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Person person = context.getBean("personBean",Person.class);
        person.printPerson();
    }
}
```


    
