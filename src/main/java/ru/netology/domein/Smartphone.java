package ru.netology.domein;

public class Smartphone extends Product {
    private String produceBy;


    public String getProduceBy() {
        return produceBy;
    }

    public void setProduceBy(String produceBy) {
        this.produceBy = produceBy;
    }

    public Smartphone(int id, String name, int coast, String produceBy) {
        super(id, name, coast);
        this.produceBy = produceBy;
    }

}
