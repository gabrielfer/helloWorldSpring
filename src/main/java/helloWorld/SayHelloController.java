package helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class SayHelloController {

    private static final String template = "Hello, %s!";
    private final Random lucckyNumber = new Random();

    @RequestMapping(method = GET, value = "/sayHello")
    public SayHello sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new SayHello(String.format(template, name), lucckyNumber.nextInt(999999));
    }
}