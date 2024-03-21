package org.ies.tierno.bank.model;

import java.util.Objects;

public class Account {
private String iban;
private String nif;
private double saldo;

    public Account(String iban, String nif, double saldo) {
        this.iban = iban;
        this.nif = nif;
        this.saldo = saldo;
    }

    public  Account(){

    }

    public  void  deposit(){

    }
    public String getIban() {
        return iban;
    }



    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSaldo() {
        return saldo;
    }

    public  void deposit(double amount){
        saldo+=amount;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(saldo, account.saldo) == 0 && Objects.equals(iban, account.iban) && Objects.equals(nif, account.nif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban, nif, saldo);
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", nif='" + nif + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
