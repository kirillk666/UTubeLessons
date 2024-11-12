package RandomTasks.strategies.marketModelsByAutofill;

import java.util.HashMap;
import java.util.Map;


public class MarketsModelsMapFactory {

    private static final Map<String, MarketModelsStrategy> strategies = new HashMap<>();

    static {
        strategies.put("Football_Absent", new FootballStrategies.AbsentStrategy());
        strategies.put("Football_Low", new FootballStrategies.LowStrategy());
        strategies.put("Football_Medium", new FootballStrategies.MediumStrategy());
        strategies.put("Football_High", new FootballStrategies.HighStrategy());
        strategies.put("Football_Super", new FootballStrategies.SuperStrategy());
        strategies.put("Football_Super2", new FootballStrategies.Super2Strategy());
    }

    public static Map<String, Integer> getMarketModelsMap(String sport, AutoFillGroupCode autoFillGroupCode) {
        String key = sport + "_" + autoFillGroupCode.getCode();

        MarketModelsStrategy strategy = strategies.get(key);

        if (strategy == null) {
            throw new IllegalStateException("Wrong sport type or autofill group code setting name");
        }

        return strategy.getMarketModelsMap();
    }
}
