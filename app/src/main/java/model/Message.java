package model;

public class Message {
    private String key;
    private boolean isActive;

    public Message(String key, boolean isActive) {
        this.key = key;
        this.isActive = isActive;
    }

    public Message() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}