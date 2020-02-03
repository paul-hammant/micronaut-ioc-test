package hello.world.mn;

import io.micronaut.context.ApplicationContext;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

    private final double r = Math.random();

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        try (ApplicationContext context = ApplicationContext.run()) {
            return ">> " + r + ", " + context.getBean(MyBean.class).toString();
            // do something with your bean
        }
    }
}