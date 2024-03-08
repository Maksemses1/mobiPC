package org.example;

import org.example.Users.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        DataBaseGetters getter = context.getBean("getter", DataBaseGetters.class);
        DataBaseInserter dataBaseInserter = context.getBean("inserter", DataBaseInserter.class);
        //UserFactory userFactory = context.getBean("userFactory", UserFactory.class);
        //UserValidator userValidator = context.getBean("userValidator", UserValidator.class);
        dataBaseInserter.insertUser(new Student("John", 20, "Male", "kenaa@xample.com", "123", "TEACHER"));
        /*User user = userFactory.createUser(3);
        System.out.println(utils.getUserType(3));
        System.out.println(user.getUser() + "\n" +
                user.getAge() + "\n" +
                user.getEmail() + "\n" +
                user.getGender() + "\n" +
                user.getPassword() + "\n" +
                user.getId() + "\n" +
                user + "\n");
*/
        context.close();
    }
}
