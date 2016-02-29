package Subject;

import Observer.Observer;

import java.util.ArrayList;

/**
 * Created by neng-zheng on 2016/2/29.
 */
public class WeaterData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeaterData(){
        observers=new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i <observers.size() ; i++) {
            Observer observer=(Observer)observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    //获取温度
    public void getTemperature(){

    }

    //获取湿度
    public void getHumidity(){

    }

    //获取气压
    public void getPressure(){

    }

    //当数据改变时执行
    public void measurementsChanged(){
        notifyObserver();
    }

    //模仿数据变动
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
