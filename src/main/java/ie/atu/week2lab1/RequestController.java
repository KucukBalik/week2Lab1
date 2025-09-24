package ie.atu.week2lab1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {

    @GetMapping("/hello")
    public String hello(){

        return "hello";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){

        return "Hello " + name + "!";
    }
    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age){
        return "Name: " + name + ", Age: " + age;
    }

    @GetMapping("/person")
    public Person getPerson(){

        return new Person("Emre", 23);

    }

    @GetMapping("/calculator/{function}")
    public int Calculator(@PathVariable String function, @RequestParam int num1, @RequestParam int num2){

        int result;

        switch (function){

            case "add" :
                myCalculator Addition = new myCalculator();
                result = Addition.add(num1, num2);
            break;
            case "substraction" :
                myCalculator substraction = new myCalculator();
                result = substraction.substraction(num1, num2);
            break;
            case "multiply" :
                myCalculator Multiply = new myCalculator();
                result = Multiply.multiply(num1, num2);
            break;
            case "divide" :
                myCalculator divide = new myCalculator();
                result = divide.divide(num1, num2);
            break;
            default:
                System.out.println("Please enter a valid operation");
                result = 0;
        }

        return result;
    }



}
