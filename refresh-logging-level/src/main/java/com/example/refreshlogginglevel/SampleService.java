package com.example.refreshlogginglevel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@Service
public class SampleService {
    public String sayHellow() {

        log.trace("This is a trace message");
        log.debug("This is a debug message");
        log.error("This is error message");
        log.info("This is info message");
        return "Hellow was called " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

}
