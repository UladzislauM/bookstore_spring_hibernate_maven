package com.company.controller.impl;

import com.company.controller.Command;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;

@Controller("index")
public class Index implements Command {

    private static final Logger log = LogManager.getLogger(Index.class);

    @Override
    public String execute(HttpServletRequest req) {
        log.error("Start method Index {}", req);
        return "JSP/index.jsp";
    }
}
