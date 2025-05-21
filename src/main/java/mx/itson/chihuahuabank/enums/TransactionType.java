
package mx.itson.chihuahuabank.enums;


import com.google.gson.annotations.SerializedName;

/**
 * The TransactionType enum represents the two possible types of financial transactions in the 
 * banking system, with serialization support for JSON conversion.
 * @authors: Andrey, Miguel, Christian, Fidel
 */
public enum TransactionType
{
    
    @SerializedName("1")
    ABONO,
    @SerializedName("2")
    CARGO
    
}
