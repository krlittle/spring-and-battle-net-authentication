package com.spring.blizzard;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class LocalSpringBlizzardApp extends SpringBlizzardApp {

    public static void main(String[] args)
    {
        new LocalSpringBlizzardApp().configure(new SpringApplicationBuilder()).run(args);
    }
}
