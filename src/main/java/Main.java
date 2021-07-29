public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60;
    boolean registered = true;

    int bonus = (int) service.calculate(amount, registered);
    System.out.println(bonus);
  }
}

