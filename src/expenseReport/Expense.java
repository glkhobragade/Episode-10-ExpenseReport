package expenseReport;

public class Expense {
  public enum Type {DINNER, BREAKFAST, CAR_RENTAL};
  public Type type;
  public int amount;

  public Expense(Type type, int amountn) {
    this.type = type;
    this.amount = amountn;
  }


}
