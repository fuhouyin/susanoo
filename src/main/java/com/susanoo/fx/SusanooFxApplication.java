package com.susanoo.fx;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SusanooFxApplication {

    public SusanooFxApplication() {
        AppUI.main(new String[]{});
    }

    public static void main(String[] args) {
        // 初始化Logback
        new SpringApplicationBuilder(SusanooFxApplication.class).headless(false).run(args);
    }
}
