package hello.world.mn;

import javax.inject.Singleton;

@Singleton
public class MyOtherBean {

    private final double r = Math.random();

    @Override
    public String toString() {
        return "MyOtherBean{ + " + r + " }";
    }

}
