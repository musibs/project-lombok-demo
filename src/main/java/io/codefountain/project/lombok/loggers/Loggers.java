package io.codefountain.project.lombok.loggers;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Log
public class Loggers {

    public void logIt(){
        log.info("Custom log");
    }
}m