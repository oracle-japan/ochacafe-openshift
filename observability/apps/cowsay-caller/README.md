# cowsay-caller

cowsay-caller implemented by [Helidon](https://helidon.io/#/).

## Build and run

With JDK21

```bash
mvn package
java -jar target/cowsay-caller.jar
```

## Exercise the application

Basic:

```sh
curl -X GET http://localhost:8080/cowsay/say
 _______
< Moo!! >
 -------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||
```
