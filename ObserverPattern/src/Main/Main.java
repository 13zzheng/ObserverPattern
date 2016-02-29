package Main;

import Observer.CurrentConditionsDisplay;
import Subject.WeaterData;

/**
 * Created by neng-zheng on 2016/2/29.
 */
public class Main {

    public static void main(String[] arg0){
        //生成一个主题
        WeaterData weaterData=new WeaterData();

        //注册一个观察者
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weaterData);

        //当观测数据发生变化
        weaterData.setMeasurements((float)13.2,20,30);
    }
}
