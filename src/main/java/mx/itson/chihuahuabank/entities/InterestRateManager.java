
package mx.itson.chihuahuabank.entities;

/**
 *The InterestRateManager class manages daily interest rate operations for bank accounts,
 * supporting percentage input and financial calculations.
 * @authors: Andrey, Miguel, Christian, Fidel
 */
public class InterestRateManager
{
    /**
     * Description: Stores the daily interest rate as decimal value (e.g., 0.01 for 1%)
     */
    private double dailyInterestRate;
/**
 * Description: Sets the daily interest rate after validation
 * @param rate Daily interest rate as decimal (0.01 = 1%)
 */
    public void setDailyInterestRate(double rate) {
        this.dailyInterestRate = rate;
    }
/**
 * Description: Retrieves current daily interest rate
 * @return double Current rate in decimal format
 */
    public double getDailyInterestRate() {
        return dailyInterestRate;
    }
    
}
