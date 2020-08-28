package proxy;

public class BFactory implements WomanToolsInterface{
    @Override
    public void saleWomanTools(float length) {
        System.out.println("定制了一个长度为" + length + "女model");
    }
}
