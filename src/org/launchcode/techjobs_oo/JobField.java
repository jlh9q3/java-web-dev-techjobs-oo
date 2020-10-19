package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;


    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }


    @Override
    public String toString() {
        return value;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // getters and setters for the 'value' field but
    //  ONLY a getter for the 'id' field.

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }
}