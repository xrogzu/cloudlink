package com.winit.cloudlink.message.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ErrorHandler;

public class MessageErrorHandler implements ErrorHandler {

    private static final Logger logger = LoggerFactory
            .getLogger(MessageErrorHandler.class);

    public void handleError(Throwable t) {
        logger.error("RabbitMQ happen a error:" + t.getMessage(), t);
    }

}
