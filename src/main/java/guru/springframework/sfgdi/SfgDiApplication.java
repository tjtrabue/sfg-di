package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class,
        args);
    MyController myController = (MyController) ctx.getBean("myController");

    String greeting = myController.sayHello();

    System.out.println(greeting);

    PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
        .getBean("propertyInjectedController");
    System.out.println("Property:");
    System.out.println(propertyInjectedController.getGreeting());

    SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
        .getBean("setterInjectedController");
    System.out.println("Setter:");
    System.out.println(setterInjectedController.getGreeting());

    ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
        .getBean("constructorInjectedController");
    System.out.println("Constructor:");
    System.out.println(constructorInjectedController.getGreeting());
  }

}
