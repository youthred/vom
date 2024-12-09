package io.github.youthred.vom;

import org.apache.commons.lang3.SystemUtils;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class VomApp {

    public static void main(String[] args) {
        SpringApplicationBuilder app = new SpringApplicationBuilder(VomApp.class).web(WebApplicationType.SERVLET);
        if (SystemUtils.IS_OS_LINUX) {
            app.build().addListeners(new ApplicationPidFileWriter("pid"));
        }
        app.run(args);
    }
}
