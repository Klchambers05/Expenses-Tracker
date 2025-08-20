import java.util.*;
import java.time.LocalDate;
import java.io.*;

public class ExpenseTracker {
    private static final String FILE_NAME = "expenses.txt";
    private static List<Expense> expenses = new ArrayList<>();

    public static void main(String[] args) {
        loadExpenses();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Save Expenses");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addExpense(scanner);
                    break;
                case "2":
                    viewExpenses();
                    break;
                case "3":
                    saveExpenses();
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    saveExpenses();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void addExpense(Scanner scanner) {
        try {
            System.out.print("Enter amount: ");
            double amount = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter description: ");
            String description = scanner.nextLine();
            System.out.print("Enter date (YYYY-MM-DD): ");
            LocalDate date = LocalDate.parse(scanner.nextLine());

            Expense expense = new Expense(amount, description, date);
            expenses.add(expense);
            System.out.println("Expense added!");
        } catch (Exception e) {
            System.out.println("Error adding expense. Please check your inputs.");
        }
    }

    private static void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
        } else {
            for (Expense expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    private static void saveExpenses() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Expense expense : expenses) {
                writer.println(expense.toDataString());
            }
            System.out.println("Expenses saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving expenses.");
        }
    }

    private static void loadExpenses() {
        expenses.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Expense expense = Expense.fromDataString(line);
                if (expense != null) {
                    expenses.add(expense);
                }
            }
            System.out.println("Expenses loaded from file.");
        } catch (IOException e) {
            System.out.println("No previous expenses found. Starting fresh.");
        }
    }
}
