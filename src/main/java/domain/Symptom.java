package domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Symptom {
    private UUID id;
    private LocalDate date;
    private LocalTime time;
    private String description;
    private Float duration;

    public Symptom(UUID id, LocalDate date, LocalTime time, String description, Float duration) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.description = description;
        this.duration = duration;
    }

    public UUID getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public Float getDuration() {
        return duration;
    }

}
