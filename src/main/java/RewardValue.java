public class RewardValue {
    double cash = 0;
    double miles = 0.0;

    private final double convertRate_milesToCash = 0.0035;
    private final double convertRate_cashToValue = 1 / convertRate_milesToCash;
    RewardValue(double cash){
        this.cash = cash;
    }

    RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return (int)(cash * convertRate_cashToValue);
    }
}
