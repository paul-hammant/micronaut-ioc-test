1. `./gradlew run`
2. In a browser go to http://localhost:8080/hello
3. Hit refresh a few times.

Those three doubles: one's an instance var for HelloController. 
Another is an instance var for MyBean (marked as @Singleton).
The third is an instance var for MyOtherBean (marked as @Singleton).

I expected all three to remain the same though refreshes, but that didn't happen.
