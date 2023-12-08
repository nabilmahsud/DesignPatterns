package proxy.ImageLoadingExample;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new VirtualProxyImage("test_10mb.jpg");
        image.display();
        System.out.println("");
    }
}