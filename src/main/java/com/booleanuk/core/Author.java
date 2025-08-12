package com.booleanuk.core;

public class Author {
    private String name;
    private String contactInformation;
    private String website;

    public Author(String name, String contactInformation, String website) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public String getContactInformation() {
        return contactInformation;
    }
}
