package com.example.refreshlogginglevel;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@Service
public class SampleService {
    static Logger loggerSp = LoggerFactory.getLogger("storedProcedureDebug");

    public String sayHellow() {

        log.trace("This is a trace message");
        log.debug("This is a debug message");
        log.error("This is error message");
        log.info("This is info message");
        if (log.isTraceEnabled()) {
            log.debug("Trace enabled");
            loggerSp.trace("this is the trace for the sp");
        }else
            log.info("Trace Not enabled");
        return "Hellow was called " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

}
