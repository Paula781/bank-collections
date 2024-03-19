package org.ies.tierno.bank.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Customer {
    private String nif;
    private String name;
    private String surname;
    private int zipcode;

    public Customer(String nif, String name, String surname, int zipcode) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.zipcode = zipcode;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return zipcode == customer.zipcode && Objects.equals(nif, customer.nif) && Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, zipcode);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}