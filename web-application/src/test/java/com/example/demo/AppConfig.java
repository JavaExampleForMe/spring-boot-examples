package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({GameConfig.class})
@Configuration
public class AppConfig {

//    @Bean
//    public GameApplicationTests getGame(Game game) {
//        return new GameApplicationTests(game);
//    }
}
