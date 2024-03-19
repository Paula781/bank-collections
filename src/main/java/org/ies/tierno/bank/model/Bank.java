package org.ies.tierno.bank.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Bank {
    private String name;
    private List<Customer> customers;
    private Map<String, Account> accountsByIban;

    public Bank(String name, List<Customer> customers, Map<String, Account> accountsByIban) {
        this.name = name;
        this.customers = customers;
        this.accountsByIban = accountsByIban;
    }

/*
    Dado un iban y una cantidad, ingresar la cantidad
    en la cuenta. Si no existe la cuenta devuelve null.
     */

   /* public  Account addSaldo(String iban, double amount){
        for (Customer customer: customers){
           if ()
        }
        return null;
    }

    */



    /*
    Dado un nif, devolver todas las cuentas de ese cliente.
     Si el cliente no existe devuelve null.
     */

    public  List<Account>getAccountsByNif(String nif){
        List<Account> accountsnif=new ArrayList<>();
        for (Customer customer: customers){
            if (customer.getNif().equals(nif)){
                return accountsnif;
            }
        }
        return  null;
    }

    /*
    Dado un iban y una cantidad, sacar la cantidad en la cuenta.
     */



    /*
    Realizar una transferencia entre dos cuentas de dos clientes.
     Para realizar la transferencia será necesario proporcionar la
     cantidad, el iban de cuenta de origen y de destino
     */



    /*
    Dado un código postal, devuelve todas las cuentas cuyo propietario
    vive en ese código postal
     */

    /*public List<Account> findAccountsByZipcode(int zipcode){
        List<Account> accounts=new ArrayList<>();
        for (Customer customer: customers){
            if (customer.getZipcode()==zipcode){
                accounts.add();
            }
        }
        return accounts;
    }

     */



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Map<String, Account> getAccountsByIban() {
        return accountsByIban;
    }

    public void setAccountsByIban(Map<String, Account> accountsByIban) {
        this.accountsByIban = accountsByIban;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(name, bank.name) && Objects.equals(customers, bank.customers) && Objects.equals(accountsByIban, bank.accountsByIban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, customers, accountsByIban);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                ", accountsByIban=" + accountsByIban +
                '}';
    }
}
