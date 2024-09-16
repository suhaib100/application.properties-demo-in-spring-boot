package com.springboot.demo.firstapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

@Value("${coach.name}")
    private String coachName;
@Value("${team.name}")
    private String teamName;
     @GetMapping("/")
    public  String sayHello(){

        return "hello world";
    }

    @GetMapping("/teamInfo")
    public String getTeamInfo(){
         return "Coach Name: "+ coachName + " ,  Team Name: "+ teamName;
    }



   @GetMapping("/workout")
    public String  getDailyWorkout(){
         return "you are doing workout....";
    }

    @GetMapping("/fortune")
    public String  getDailyfortune(){
        return "you are doing fortune....";
    }


}