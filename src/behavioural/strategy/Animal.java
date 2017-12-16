package behavioural.strategy;

public abstract class Animal {
    private String name;
    private String sound;

    protected Flys flyingBehaviour;

    public String getFly() {
        return flyingBehaviour.fly();
    }

    public void setFlyingBehaviour(Flys flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (name != null ? !name.equals(animal.name) : animal.name != null) return false;
        return sound != null ? sound.equals(animal.sound) : animal.sound == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sound != null ? sound.hashCode() : 0);
        return result;
    }
}
