package com.example.demo;

import lombok.*;

@Getter  // used when the class is returned parameters in controller
@NoArgsConstructor   // used when the class is one of the input parameters in controller
@AllArgsConstructor
public class Team {

    private String name;
}
