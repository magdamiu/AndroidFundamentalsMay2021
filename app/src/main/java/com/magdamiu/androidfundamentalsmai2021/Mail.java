package com.magdamiu.androidfundamentalsmai2021;

public class Mail {
    private int id;
    private String senderName;
    private String subject;

    public Mail(int id, String senderName, String subject) {
        this.id = id;
        this.senderName = senderName;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
