package com.example.mockmvc;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Employees {
    private List<Employee> employees = new ArrayList<>();
}
