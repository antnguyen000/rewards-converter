public class RewardValue {
    private final double cashValue;
    private static final double MILES_TO_CASH = 0.0035;

    public RewardValue(double cash) {
        this.cashValue = cash;
    }

    public RewardValue(int miles) {
        this(miles * MILES_TO_CASH);
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return (int) (this.cashValue / MILES_TO_CASH);
    }
}
