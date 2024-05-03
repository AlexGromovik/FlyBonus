public class BonusMilesService {

    public int calculate(int price) {
        int payBonus = 20;
        int miles;
        miles = price / payBonus;
        return miles;
    }
}
