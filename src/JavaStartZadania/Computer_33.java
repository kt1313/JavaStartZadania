package JavaStartZadania;

import java.util.Objects;

public class Computer_33 {
    private String producer;
    private int model;

    public Computer_33 (String producer, int model){
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer_33 that = (Computer_33) o;
        return model == that.model &&
                Objects.equals(producer, that.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model);
    }

    @Override
    public String toString() {
        return "Computer_33{" +
                "producer='" + producer + '\'' +
                ", model=" + model +
                '}';
    }
}
