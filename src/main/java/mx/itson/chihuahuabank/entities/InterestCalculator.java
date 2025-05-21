
package mx.itson.chihuahuabank.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import mx.itson.chihuahuabank.enums.TransactionType;

/**
 *The InterestCalculator class generates daily interest transactions between existing transactions
 * in chronological order.
 * @authors: Andrey, Miguel, Christian, Fidel
 */
public class InterestCalculator {
    /**
     * Description: Generates daily interest transactions between existing transactions
     * @param original Original transaction list (will be sorted by date)
     * @param rate Daily interest rate (as decimal, e.g., 0.001 for 0.1%)
     * @return New list with original and generated interest transactions
     */
    public static List<Transaction> generateTransactionsWithInterest(List<Transaction> original, double rate) {
        List<Transaction> result = new ArrayList<>();

        // Ordenar por fecha
        original.sort(Comparator.comparing(Transaction::getDate));

        double currentBalance = 0;

        for (int i = 0; i < original.size(); i++) {
            Transaction current = original.get(i);
            Date currentDate = current.getDate();

            // Insertar dias faltantes desde la ultima fecha
            if (i > 0) {
                Date previousDate = original.get(i - 1).getDate();
                Calendar cal = Calendar.getInstance();
                cal.setTime(previousDate);

                while (true) {
                    cal.add(Calendar.DAY_OF_MONTH, 1);
                    Date nextDay = cal.getTime();

                    if (!nextDay.before(currentDate)) break;

                    // Crear nueva transaccion de interes
                    double interest = currentBalance * rate;

                    Transaction interestTransaction = new Transaction();
                    interestTransaction.setDate(nextDay);
                    interestTransaction.setReference("N/A");
                    interestTransaction.setDescription("Crecimiento diario");
                    interestTransaction.setAmount(interest);
                    interestTransaction.setType(TransactionType.ABONO);

                    result.add(interestTransaction);

                    // Actualizar balance simulado
                    currentBalance += interest;
                }
            }

            // Agregar transaccion original
            result.add(current);

            // Actualizar balance con la original
            if (current.getType() == TransactionType.ABONO) {
                currentBalance += current.getAmount();
            } else {
                currentBalance -= current.getAmount();
            }
        }

        return result;
    }
    
}
