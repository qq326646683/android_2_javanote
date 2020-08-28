package proxy;

public class AFactory implements ManToolsInterface{
    @Override
    public void saleManTools(String size) {
        System.out.println("定制一个size为" + size + "的女model");
    }
}
