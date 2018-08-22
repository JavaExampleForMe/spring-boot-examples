package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppConfig.class)
public class GameApplicationTests {

	@Autowired
	private Game game;

	public GameApplicationTests(){
	}

	@Test
	public void contextLoads() {
		game.play();
	}

}
