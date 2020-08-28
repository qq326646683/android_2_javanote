package proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        ManToolsInterface aFactory = new AFactory();
        NellCompany nellCompany = new NellCompany();
        nellCompany.setFactory(aFactory);

        // 张三来了
        ManToolsInterface employee1 = (ManToolsInterface) nellCompany.getProxyInstance();
        employee1.saleManTools("E");

        // 张三老婆来了
        BFactory bFactory = new BFactory();
        nellCompany.setFactory(bFactory);

        WomanToolsInterface employee2 = (WomanToolsInterface) nellCompany.getProxyInstance();
        employee2.saleWomanTools(1.9f);


    }
}
