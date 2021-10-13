package model;

public class Message {
    private String key;
    private boolean isActive;

    public Message(String key) {
        this.key = key;
    }

    public Message() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}