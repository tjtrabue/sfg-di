package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * This class demonstrates the use of the \@Primary annotation in Spring.
 * \@Primary allows us to define a default, or primary Bean to use given a set
 * of alternatives. This way, if we don't specify a particular candidate with
 * the \@Qualifier annotation, the injected Bean will be the one marked
 * \@Primary.
 * 
 * @author EVOFORGE\tjtrabu
 */

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    // TODO Auto-generated method stub
    return "Hello World - From the PRIMARY Bean";
  }

}
