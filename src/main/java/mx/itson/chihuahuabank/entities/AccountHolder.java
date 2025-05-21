
package mx.itson.chihuahuabank.entities;


import com.google.gson.annotations.SerializedName;

/**
 * The AccountHolder class represents a bank account holder with personal and tax identification information.
 * It includes serialization support for JSON conversion.
 * @authors: Andrey, Miguel, Christian, Fidel
 */
public class AccountHolder
{

    /** Description: Retrieves the account holder's unique identification code.
     * @return String the code
     */
    public String getCode() {
        return code;
    }

    /** Description: Sets or updates the account holder's unique identification code
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**  Description: Retrieves the account holder's full name.
     * @return String the name
     */
    public String getName() {
        return name;
    }

    /** Description: Sets or updates the account holder's full name.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Description: Retrieves the account holder's physical address.
     * @return String the address
     */
    public String getAddress() {
        return address;
    }

    /** Description: Sets or updates the account holder's physical address.
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /** Description: Retrieves the city where the account holder resides.
     * @return String the city
     */
    public String getCity() {
        return city;
    }

    /** Description: Sets or updates the city where the account holder resides.
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /** Description: Retrieves the account holder's taxpayer identification number.
     * @return String the taxpayerId
     */
    public String getTaxpayerId() {
        return taxpayerId;
    }

    /** Description: Sets or updates the account holder's taxpayer identification number.
     * @param taxpayerId the taxpayerId to set
     */
    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId;
    }

    /** Description: Retrieves the account holder's postal code.
     * @return String the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /** Description: Sets or updates the account holder's postal code.
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    private String code;
    private String name;
    private String address;
    private String city;
    @SerializedName ("taxpayer-id")
    private String taxpayerId;
    @SerializedName ("zip-code")
    private String zipCode;
    
}
