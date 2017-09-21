package example.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * TODO.
 *
 * @author Diego Lovison
 * @since 1.0 (21/09/17)
 */
@Service
public class RemoteMessageSource {

    private static final Map<String, String> dataBase = new HashMap<>();

    static {
        dataBase.put("example", "Example");
    }

    @Cacheable(value = "message", key = "#code")
    public String translate(String code) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }

        return dataBase.get(code);
    }
}
