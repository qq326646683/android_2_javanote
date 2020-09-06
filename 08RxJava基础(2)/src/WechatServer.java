import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observable{
    List<Observer> observerList;
    String msg;

    public WechatServer() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(msg);
        }
    }

    public void publishMessage(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
