package org.example.mvc;

import org.example.mvc.controller.RequestMethod;

import java.util.Objects;

public class HandlerKey {

    private final RequestMethod requestMethod;
    private final String urlPath;

    public HandlerKey(RequestMethod requestMethod, String urlPath) {
        this.requestMethod = requestMethod;
        this.urlPath = urlPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HandlerKey that = (HandlerKey) o;
        return requestMethod == that.requestMethod && Objects.equals(urlPath, that.urlPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestMethod, urlPath);
    }
}
