
package mx.itson.chihuahuabank.entities;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import mx.itson.chihuahuabank.enums.TransactionType;

/**
 * The TransactionTableLoader class is a utility class designed to load and format a list of
 * transactions into a DefaultTableModel for display in a Swing JTable. It ensures transactions are
 * sorted by date and calculates a running balance.
 * @authors: Andrey, Miguel, Christian, Fidel
 */
public class TransactionTableLoader
{
    /**
     * Description: Loads a list of transactions into a table model, formatting dates, calculating
     * balances, and separating charges from deposits.
     * @param model The table model where transactions will be loaded.
     * @param transactions The list of transactions to process.
     */
    public static void loadTransactionsIntoTable(DefaultTableModel model, List<Transaction> transactions) {
        model.setRowCount(0);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd 'de 'MMMM' de 'yyyy");

        // Ordenar por fecha
        Collections.sort(transactions, Comparator.comparing(Transaction::getDate));
        
        // saldo inicial en 0
        double balance = 0;
        
        for (Transaction t : transactions) {
            String formattedDate = (t.getDate() != null) ? dateFormat.format(t.getDate()) : "Fecha no disponible";
            
            String charge = "";
            String deposit = "";
            
            if (t.getType() == TransactionType.CARGO) {
                charge = String.valueOf(t.getAmount());
                balance -= t.getAmount();   // restar cargos
            } else if (t.getType() == TransactionType.ABONO) {
                deposit = String.valueOf(t.getAmount());
                balance += t.getAmount();   // sumar abonos
            }
            
            model.addRow(new Object[] {
                formattedDate,
                t.getReference(),
                t.getDescription(),
                charge,
                deposit,
                String.format("%.2f", balance)});   // muestra el saldo con 2 decimales
        }
    }
    
}
