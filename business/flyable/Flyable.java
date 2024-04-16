package business.flyable;

import business.tower.WeatherTower;

public abstract class Flyable {
    protected WeatherTower weatherTower;
    
    public abstract void updateConditions();
    
    public void registerTower(WeatherTower tower) {
        this.weatherTower = tower;
    }
}
