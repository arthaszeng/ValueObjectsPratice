package bester;

public class Cookie implements RulesOfComparing {

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    @Override
    public boolean betterThan(RulesOfComparing someObject) {
        return this.numberOfChocolateChips > ((Cookie)someObject).numberOfChocolateChips;
    }
}
