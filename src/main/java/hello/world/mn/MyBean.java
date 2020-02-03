package hello.world.mn;

import io.micronaut.context.ApplicationContext;

import javax.inject.Singleton;

@Singleton
public class MyBean {

    private final double r = Math.random();

    private MyOtherBean mob;

    public MyBean() {
        try (ApplicationContext context = ApplicationContext.run()) {
            mob = context.getBean(MyOtherBean.class);
            // do something with your bean
        }


    }

    @Override
    public String toString() {
        return "MyBean{ " + r + ", " + mob.toString() + " }";
    }
}
