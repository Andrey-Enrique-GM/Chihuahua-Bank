
package mx.itson.chihuahuabank.entities;


import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * The Account class represents a bank account with associated product details, account holder information,
 * and transaction history. It supports JSON serialization/deserialization using Gson.
 * @authors: Andrey, Miguel, Christian, Fidel
 */
public class Account
{

    /** Description: Retrieves the type of banking product associated with the account
     * @return String the product
     */
    public String getProduct() {
        return product;
    }

    /** Description: Sets the type of banking product for the account
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /** Description: Retrieves the unique account number
     * @return String the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /** Description: Sets the account's unique number
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /** Description: Retrieves the currency type for the account
     * @return String the currency
     */
    public String getCurrency() {
        return currency;
    }

    /** Description: Sets the account's currency type
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**  Description: Retrieves the account holder information
     * @return AccountHolder the accountHolder
     */
    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    /** Description: Sets the account holder information
     * @param accountHolder the accountHolder to set
     */
    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    /** Description: Retrieves the list of transactions associated with the account
     * @return the transactions
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /** Description: Sets the account's transaction history
     * @param transactions the transactions to set
     */
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    
    private String product;
    @SerializedName ("account-number")
    private String accountNumber;
    private String currency;
    @SerializedName ("account-holder")
    private AccountHolder accountHolder;
    private List<Transaction> transactions;
    
    /*
    
    */
    public static Account deserialize(String json){
    Account a = new Account();
    try{
        Gson gson = new Gson();
        a = gson.fromJson(json, Account.class);
    } catch (Exception ex){
        System.err.println("Error: " + ex.getMessage());
    } return a;  
    }
    public static Account interes(double porcentaje){
        //TODO logica para calcular interes diario
        return null;
        //TODO logica para calcular interes diario
       
    }
}
/*
=== Titulo
"product":"Cuenta de nómina",

=== Detalles de la cuenta
"account-number":"69740214082"
"currency":"MXN"

=== Titular
"name":"Yolanda Saldívar"
"code":"36859941"
"taxpayer-id":"SAY690205ER9"

=== Direccion del titular
"address":"Calle Miguel Hidalgo #52"
"city":"Empalme, Sonora"
"zip-code":"85400"

=== Aqui iria la tabla con todas las transacciones :))
*/