package helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class SayHelloController {

    private static final String template = "Hello, %s!";

    @RequestMapping(method = GET, value = "/sayHello")
    public SayHello sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new SayHello(String.format(template, name));
    }
}