package Observer;

/**
 * Created by neng-zheng on 2016/2/29.
 */
public interface Observer {

    //获取通知后更新
    public void update(float temp, float humidity,float pressure);
}
