package com.example.demo;

import com.example.demo.aspects.LoggingAspect;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.RequestScope;

@Configuration
public class GameConfig {
    @Bean @Redsox
    public Team getRedSox() {
        return new Team("RedSox");
    }

    @Bean @Boston
    public Team getBoston() {
        return new Team("Boston");
    }

    @Bean @RequestScope
    //@Scope(value="request",proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Game getGame(@Boston Team t1, @Redsox Team t2) {
        return new Game( t1, t2 );
    }

    @Bean
    GameController gameController(Game g) {
        return new GameController(g);
    }

    @Bean
    LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

//    @Bean  @Scope(value="prototype")
//    GameController gameController(@Qualifier("boston") Team t1, @Qualifier("redsox") Team t2) {
//        return new GameController(new Game( t1, t2 ));
//    }
}
