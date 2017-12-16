package creational.singleton;

class SingleObject {
    private static final SingleObject instance = new SingleObject();

    private String name;

    private SingleObject() {
    }

    public static SingleObject getSingleObject() {
        return instance;
    }

    public void showMessage() {
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
