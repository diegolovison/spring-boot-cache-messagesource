package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO.
 *
 * @author Diego Lovison
 * @since 1.0 (21/09/17)
 */
@RestController
public class ExampleController {

    @Autowired
    MessageSource messageSource;

    @GetMapping("/example")
    public String example() {

        return messageSource.getMessage("example", null, Application.FIXED_LOCALE);
    }
}
