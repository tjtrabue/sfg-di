package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

  private final GreetingService greetingService;

  public ConstructorInjectedController(GreetingService greetingService) {
    super();
    this.greetingService = greetingService;
  }

  String getGreeting() {
    return greetingService.sayGreeting();
  }

}
