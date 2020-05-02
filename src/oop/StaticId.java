package oop;

public class StaticId {
    private static int nextId = 1;

    private int id = 1;

    public StaticId increaseId() {
        nextId++;
        id++;
        return this;
    }

    @Override
    public String toString() {
        return "StaticId{" +
                "id=" + id +
                "nextId=" + nextId +
                '}';
    }
}
