public class Main {
    public static void main(String[] args) {
    BonusMilesService service = new BonusMilesService();

    int miles = service.calculate (11_300, true);
    System.out.println("Миль:" + miles );
}
}
