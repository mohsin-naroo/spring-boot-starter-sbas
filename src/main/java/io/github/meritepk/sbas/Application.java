package io.github.meritepk.sbas;

import java.util.Locale;
import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import reactor.core.publisher.Hooks;

@EnableAdminServer
@SpringBootApplication
public class Application {

    static {
        init();
    }

    private static void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale.setDefault(Locale.US);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Hooks.enableAutomaticContextPropagation();
    }
}
