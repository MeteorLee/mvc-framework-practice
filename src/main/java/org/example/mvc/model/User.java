package org.example.mvc.model;

public class User {
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    private final String userId;
    private final String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }
}
