package org.springframework.social.strava.api;

public class StravaSegment {
    private long id;

    public StravaSegment(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
