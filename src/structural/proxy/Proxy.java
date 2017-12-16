package structural.proxy;

public class Proxy {
    public static void main(String[] args) {
        Image image = new ProxyImage("img.jpg");

        image.display();

        System.out.println("===");

        image.display();
    }
}
