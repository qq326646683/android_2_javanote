public class Demo {
    public static void main(String[] args) {
        WechatServer wechatServer = new WechatServer();
        User user1 = new User("小明");
        User user2 = new User("小李");
        wechatServer.add(user1);
        wechatServer.add(user2);


        wechatServer.publishMessage("tiktok起诉美国政府");
    }
}
