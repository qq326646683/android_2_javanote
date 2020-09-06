public class User implements Observer {
    String name;
    String msg;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Object org) {
        this.msg = (String) org;
        System.out.println(name + "监听到了一条消息：" + msg);
    }


}
