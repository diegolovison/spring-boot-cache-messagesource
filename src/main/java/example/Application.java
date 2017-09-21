package example;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO.
 *
 * @author Diego Lovison
 * @since 1.0 (21/09/17)
 */
@SpringBootApplication
public class Application {

    public static final Locale FIXED_LOCALE = new Locale("EN", "us");

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
