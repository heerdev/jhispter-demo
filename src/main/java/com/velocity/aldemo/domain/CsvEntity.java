package com.velocity.aldemo.domain;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;

@JsonPropertyOrder({ "name", "surname", "shoesize", "gender" })
@Entity
@Table(name="jhi_csv_entity")
public class CsvEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;
    private String surname;
    private int shoesize;
    private String gender;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getShoesize() {
        return shoesize;
    }

    public void setShoesize(int shoesize) {
        this.shoesize = shoesize;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
