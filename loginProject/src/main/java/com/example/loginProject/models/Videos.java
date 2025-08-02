package com.example.loginProject.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Scope("prototype")
public class Videos {
    List<String> urls;

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        return "Videos{" +
                "urls=" + urls +
                '}';
    }
}
