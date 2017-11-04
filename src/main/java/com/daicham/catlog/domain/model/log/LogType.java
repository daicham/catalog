package com.daicham.catlog.domain.model.log;

/**
 * @author daicham
 */
public enum LogType {
    PEE("/images/pee_64.png"),
    POO("/images/poo_64.png");

    private final String imagePath;

    LogType(String imagePath) {
        this.imagePath = imagePath;
    }

    public String asImagePath() {
        return imagePath;
    }

    public String asText() {
        return name();
    }
}
