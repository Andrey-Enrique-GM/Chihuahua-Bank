
package mx.itson.chihuahuabank.entities;


import java.util.Date;
import mx.itson.chihuahuabank.enums.TransactionType;

/**
 * The Transaction class represents a financial transaction with date, description, amount and type information
 * It supports different transaction types through an enum.
 * @authors: Andrey, Miguel, Christian, Fidel
 */
public class Transaction
{

    /** Description: Retrieves the date when the transaction occurred.
     * @return Date the date
     */
    public Date getDate() {
        return date;
    }

    /** Description: Sets or updates the transaction date.
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /** Description: Retrieves the description or purpose of the transaction.
     * @return String the description
     */
    public String getDescription() {
        return description;
    }

    /** Description: Sets or updates the transaction description.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** Description: Retrieves the unique reference number or identifier for the transaction.
     * @return String the reference
     */
    public String getReference() {
        return reference;
    }

    /** Description: Sets or updates the transaction reference number.
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /** Description: Retrieves the monetary amount involved in the transaction.
     * @return doyble the amount
     */
    public double getAmount() {
        return amount;
    }

    /** Description: Sets or updates the transaction amount.
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /** Description: Retrieves the type/category of the transaction (from TransactionType enum).
     * @return TransactionType the type
     */
    public TransactionType getType() {
        return type;
    }

    /** Description: Sets or updates the transaction type.
     * @param type the type to set
     */
    public void setType(TransactionType type) {
        this.type = type;
    }
    
    // yyyy-MM-dd
    // private String date; **** tipo de dato incorrecto causaba error en la tabla
    
    private Date date;
    private String description;
    private String reference;
    private double amount;
    private TransactionType type;
    
}
