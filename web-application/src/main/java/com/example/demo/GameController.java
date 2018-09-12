package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("game")
@Slf4j
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

    //http://localhost:8090/game/setHomeTeam
    //{
    //	"id" :1,
    //	"name" :"Ida",
    //	"localDate" : "2017-01-01"
    //}
    @PostMapping(path = "setHomeTeam")
    public void setHomeTeam(@RequestBody Team t) {
        game.setHomeTeam(t);
    }

    @RequestMapping(path = "printBeans", method = RequestMethod.GET)
    public String[] printBeans() {
        return game.printBeans();
    }

    //http://localhost:8090/game/test/1?param1=20&param2=50&param3=70
    // HEADER
    // userId= 40
    @GetMapping(path = "test/{id}")
    public String test(@RequestHeader(value = "userId") String userId, @PathVariable int id,
                       @RequestParam(value = "param1") int param1, @RequestParam(value = "param2") int param2,
                       @RequestParam(value = "param3") String param3) {
        return "\nRequestHeader userId=" + userId +
                "\nPathVariable id=" + id +
                "\nRequestParam =" + param1 +
                "\nRequestParam =" + param2 +
                "\nRequestParam =" + param3;
    }

    @GetMapping(path = "getStream/{id}")
    public StreamingResponseBody getCsvStream(@PathVariable int id){
        String title = "Site ID,Interaction ID,Complete ID,Media Type Name,Contact GMT Start Time\n";
        String arr[] = {"Line1,Line1,Line1,Line1,Line1\n",
                        "Line2,Line2,Line2,Line2,Line2\n",
                        "Line3,Line3,Line3,Line3,Line3\n",
                        "Line4,Line4,Line4,Line4,Line4\n"};
//        fromDate = URLDecoder.decode(fromDate,"UTF-8");
        return outputStream -> {
            outputStream.write(title.getBytes());
             for (String line : arr) {
                outputStream.write(line.getBytes());
            }
            outputStream.flush();
       };
    }


}
