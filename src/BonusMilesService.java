public class BonusMilesService {
    public int calculate(int amount, boolean isRegistered) {

        int percent = isRegistered ? 5 : 0;
        int bonus = amount * percent / 100;
        return bonus;
    }
}
