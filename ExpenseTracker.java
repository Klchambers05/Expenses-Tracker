import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

Public class ExpenseTracker() {
    public static void main(String[] args) {
    //The app starts running here
    ArrayList<Expense> expenses = new ArrayList<>(); //Like adding a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter Expense Amount:");
    double Amount = scanner.nextDouble();
    Scanner.nextLine(); //Consume next line

    System.out.println("Enter Expense Description:");
    String Description = scanner.nextLine();
    

    System.out.println("Enter Expense Date (MM-DD-YYYY):");
    String dateInput = scanner.nextLine();
    LocalDate date = LocalDate.parse(dateInput);

    Expense expense = new Expense(Amount, Description, Date);
    expenses.add(expense);

    System.out.println("Expense Added!");

    String anotherExpense;
    System.out.println("Would you like to add another expense? Yes or No?");
     anotherExpense = scanner.nextLine();
        
        while(anotherExpense.equalsIgnoreCase("Yes")) {
             System.out.println("Enter Expense Amount:");
            double Amount = scanner.nextDouble();
            Scanner.nextLine(); //Consume next line

            System.out.println("Enter Expense Description:");
            String Description = scanner.nextLine();
    

            System.out.println("Enter Expense Date (MM-DD-YYYY):");
            String dateInput = scanner.nextLine();
            LocalDate date = LocalDate.parse(dateInput);

            Expense expense = new Expense(Amount, Description, Date);
            expenses.add(expense);

            System.out.println("Expense Added!");

            String anotherExpense;
            System.out.println("Would you like to add another expense? Yes or No?");
             anotherExpense = scanner.nextLine();
        
                while(anotherExpense.equalsIgnoreCase("Yes"))   
            
            
            

        }
    
    
    }
}


