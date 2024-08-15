package io.arielcarvalho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// We need the annotation and the spring application run to say this is a spring application

@SpringBootApplication
@RestController
public class Main {

   public static void main(String[] args) {
       SpringApplication.run(Main.class, args);
   }

   @GetMapping("/greet")
   public GreetResponse greet() {
       // return "Hello there!";
       return new GreetResponse("Hello");
   }

   record GreetResponse(String greet){}
}
