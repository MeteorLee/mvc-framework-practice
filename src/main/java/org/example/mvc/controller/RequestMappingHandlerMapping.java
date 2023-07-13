package org.example.mvc.controller;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {

    // /users 로 들어오면 UsersController를 호출해줘
    // [key] : users [value] : UserController
    private Map<String, Controller> mappings = new HashMap<>();

    public void init() {
        mappings.put("/", new HomeController());
    }

    public Controller findHandler(String urlPath) {
        return mappings.get(urlPath);
    }
}
