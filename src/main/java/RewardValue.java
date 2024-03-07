public class RewardValue {
    double cash = 0;

    private final double convertRate_milesToCash = 0.0035;

    public double convertFromMilesToCash(int miles){
        return miles * convertRate_milesToCash;
    }

    public int convertFromCashToMiles(double cash){
        return (int)(cash / convertRate_milesToCash);
    }

    RewardValue(double cash){
        this.cash = cash;
    }

    RewardValue(int miles){
        this.cash = convertFromMilesToCash(miles);
    }

    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return convertFromCashToMiles(cash);
    }
}
