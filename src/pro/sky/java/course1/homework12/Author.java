package pro.sky.java.course1.homework12;

public class Author {
    private String firstName;
    private String surName;

    public Author(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getAuthorBook() {
        return firstName + "" + surName;
    }
}