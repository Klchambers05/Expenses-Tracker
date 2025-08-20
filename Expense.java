import java.time.LocalDate;


Public Class Expense {
    Private Double Amount;
    Private String Description;
    Private LocalDate Date;

    Public Expense(double Amount, String Description, LocalDate Date) {
    this.Amount = Amount;
    this.Description = Description;
    this.Date = Date

    }
    Public double getAmount() {
        return Amount;
    }
    Public String getDescription() {
        return Description;
    }
    Public LocalDate getDate) {
        return Date;
    }
}
