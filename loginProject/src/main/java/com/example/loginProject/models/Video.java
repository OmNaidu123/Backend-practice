package com.example.loginProject.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Video {
    private String vidURL;
    private String username;
    public String getVidURL() {
        return vidURL;
    }

    public void setVidURL(String vidURL) {
        this.vidURL = vidURL;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Video{" +
                "username='" + username + '\'' +
                ", vidURL='" + vidURL + '\'' +
                '}';
    }
}
