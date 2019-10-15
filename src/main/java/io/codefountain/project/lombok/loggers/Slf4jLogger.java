package io.codefountain.project.lombok.loggers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Slf4jLogger {

    public void logIt(){
        log.error("Error occurred.");
    }
}
