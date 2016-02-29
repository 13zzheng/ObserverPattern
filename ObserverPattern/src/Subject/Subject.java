package Subject;

import Observer.Observer;

/**
 * Created by neng-zheng on 2016/2/29.
 */
public interface Subject {

    //注册观察者
    public void registerObserver(Observer o);

    //移除观察者
    public void removeObserver(Observer o);

    //通知观察者
    public void notifyObserver();
}
