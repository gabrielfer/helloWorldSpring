package helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class SayHelloController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = GET, value = "/sayHello")
    public SayHello greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new SayHello(counter.incrementAndGet(), String.format(template, name));
    }
}