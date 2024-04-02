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

    public  void addSaldo(String iban, double amount) {
        if (accountsByIban.containsKey(iban)){
            Account account=accountsByIban.get(iban);
            account.deposit(amount);
        }else{
            System.out.println("No existe la cuenta "+iban);
        }
    }


    /*
    Dado un nif, devolver todas las cuentas de ese cliente.
     Si el cliente no existe devuelve null.
     */

    public  List<Account>getAccountsByNif(String nif){
        List<Account> accountsnif=new ArrayList<>();
        for (var account: accountsByIban.values()){
            if (account.getNif().equals(nif)){
                 accountsnif.add(account);
            }
        }
        return  null;
    }



    /*
    Dado un iban y una cantidad, sacar la cantidad en la cuenta.
     */

    public void takeCuantity(String iban, double amount){
        if (accountsByIban.containsKey(iban)){
            Account account=accountsByIban.get(iban);
            account.withdraw(amount);
        }else{
            System.out.println("No existe la cuenta "+iban);
        }
    }



    /*
    Realizar una transferencia entre dos cuentas de dos clientes.
     Para realizar la transferencia será necesario proporcionar la
     cantidad, el iban de cuenta de origen y de destino
     */



    /*
    Dado un código postal, devuelve todas las cuentas cuyo propietario
    vive en ese código postal
     */

    //No me gusta, mirar si puedo hacerlo de otra forma :)

    public List<Account> findAccountsByZipcode(int zipcode){
        List<Account> accounts=new ArrayList<>();
        for (Customer customer: customers){
            if (customer.getZipcode()==zipcode){
                accounts.addAll(customer.getAccounts());
            }
        }
        return accounts;
    }

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
