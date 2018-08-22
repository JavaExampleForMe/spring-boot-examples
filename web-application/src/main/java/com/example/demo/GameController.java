package com.example.demo;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("game")
public class GameController {

    Game game;

    @Autowired
    Game g1;

    public GameController(Game game) {
        this.game = game;
    }

    @RequestMapping(path = "play", method = RequestMethod.GET)
    public Team play(HttpSession session) {
        return game.play();

    }

    @RequestMapping(path = "setHomeTeam", method = RequestMethod.POST)
    public void setHomeTeam(@RequestBody Team t) {
        game.setHomeTeam(t);
    }

    @RequestMapping(path = "printBeans", method = RequestMethod.GET)
    public String[] printBeans() {
        return game.printBeans();
    }

    @RequestMapping(path = "test", method = RequestMethod.GET)
    public String test() {
        return "true";
    }

}
