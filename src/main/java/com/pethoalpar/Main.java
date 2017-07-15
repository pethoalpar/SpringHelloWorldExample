package com.pethoalpar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by petho on 2017-07-15.
 */
public class Main {

    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Person person = context.getBean("personBean",Person.class);
        person.printPerson();
    }
}
