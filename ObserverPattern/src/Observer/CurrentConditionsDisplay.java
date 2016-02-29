package Observer;
import Subject.*;
/**
 * Created by neng-zheng on 2016/2/29.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity,float pressure) {
        this.temperature=temp;
        this.humidity=humidity;
        display();
    }

    //显示当前观测值
    @Override
    public void display(){
        System.out.println("Current conditions:"+temperature+"and"+humidity);
    }
}
