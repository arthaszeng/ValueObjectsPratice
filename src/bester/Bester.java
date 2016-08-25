package bester;

import java.util.List;

public class Bester {
    public RulesOfComparing findBest(List<RulesOfComparing> objects) {
        RulesOfComparing bestObject = objects.get(0);

        for (RulesOfComparing someObject : objects) {
            if(someObject.betterThan(bestObject)) {
                bestObject = someObject;
            }
        }

        return bestObject;
    }
}
