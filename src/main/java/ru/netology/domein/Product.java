package ru.netology.domein;

public class Product {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    private int id;
    private String name;
    private int coast;

    public Product(int id, String name, int coast) {
        this.id = id;
        this.name = name;
        this.coast = coast;
    }
    public boolean matches(String search) {
        if (matches(search)) {
            return true;
        }
        return false;
    }
}
