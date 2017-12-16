package creational.singleton;

public class SingletonPattern {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getSingleObject();
        object.setName("Dipesh");
        object.showMessage();

        SingleObject object1 = SingleObject.getSingleObject();
        object1.setName("Rijal");
        object1.showMessage();

        object.showMessage();
    }
}
