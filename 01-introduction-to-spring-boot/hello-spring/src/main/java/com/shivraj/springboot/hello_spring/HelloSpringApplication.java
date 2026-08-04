package com.shivraj.springboot.hello_spring;

import com.shivraj.springboot.hello_spring.dependencyinjection.NotificationService;
import com.shivraj.springboot.hello_spring.dependencyinjection.impl.EmailNotificationService;
import com.shivraj.springboot.hello_spring.dependencyinjection.impl.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class HelloSpringApplication implements CommandLineRunner {

    @Autowired
    private Map<String, NotificationService> notificationServices = new HashMap<>();

    // ======================================    codes related to dependency injection    =================================================

    // we can use field injection, constructor injection or setter injection to inject the dependency


    // ================== field injection   ==============================
    // here we are using field injection
    // to inject the dependency of NotificationService interface
    // using @Autowired annotation


    /*
    @Autowired
    private NotificationService notificationService;
     */

    // ===================================================================

    // ================== constructor injection   ========================
    // here we are using constructor injection
    // to inject the dependency of NotificationService interface
    // using Constructor of the Class

    final private NotificationService notificationService;

    public HelloSpringApplication(@Qualifier("emailNotificationService") NotificationService notificationService) {
//    public HelloSpringApplication(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // ===================================================================




    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("=====================================================================================================================");
        // here it is loosely coupled because we are using the interface NotificationService and injecting the implementation class using @Autowired annotation
        notificationService.sendNotification("Hello, this is a test notification!");
        System.out.println("=====================================================================================================================");


        System.out.println("Sending notification using all the available notification services............");
        System.out.println("-----------------------------------------------------------------");
        // send notification using both EmailNotificationService and SmsNotificationService
        // this way we can send notification to all the services without changing the code in the main class
        for(var service : notificationServices.entrySet()) {
            System.out.println("Notification Service: " + service.getKey());
            service.getValue().sendNotification("Hello, this is a test notification!");
            System.out.println("-----------------------------------------------------------------");
        }


        /*
        // here it is tightly coupled because we are creating the object of EmailNotificationService class directly in the code,
        // so if we want to change the implementation of NotificationService, we have to change the code here as well

        // NotificationService notificationService = new EmailNotificationService();
        NotificationService notificationService = new SmsNotificationService();
        notificationService.sendNotification("Hello, this is a test notification!");
         */
    }
// =========================================================================================================================================




// ======================================    codes related to bean scope and lifecycle management    ======================================
//    @Autowired
//    PaymentService paymentService1;
//
//    @Autowired
//    PaymentService paymentService2;
//
//	public static void main(String[] args) {
//		SpringApplication.run(HelloSpringApplication.class, args);
//
//        /*
//            // not a good practice to create an object of PaymentService class like this
//            // because it will not be managed by Spring container
//            // and we will not be able to use the features of Spring framework like dependency injection, AOP, etc.
//            // PaymentService paymentService = null;
//            PaymentService paymentService = new PaymentService();
//            paymentService.pay();
//         */
//	}
//
//    @Override
//    public void run(String... args) throws Exception {
//        paymentService1.pay();
//        paymentService2.pay();
//    }
// =========================================================================================================================================
}
