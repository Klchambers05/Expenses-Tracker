import java.time.LocalDate;

public class Expense {
    private double amount;
    private String description;
    private LocalDate date;

    public Expense(double amount, String description, LocalDate date) {
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return String.format("Amount: $%.2f | Description: %s | Date: %s", amount, description, date.toString());
    }

    // For saving to a file
    public String toDataString() {
        return amount + "," + description + "," + date.toString();
    }

    // For loading from a file
    public static Expense fromDataString(String line) {
        String[] parts = line.split(",");
        if (parts.length != 3) return null;
        double amount = Double.parseDouble(parts[0]);
        String description = parts[1];
        LocalDate date = LocalDate.parse(parts[2]);
        return new Expense(amount, description, date);
    } 
//Add Expense Class
