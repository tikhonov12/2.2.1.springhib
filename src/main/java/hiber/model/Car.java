package hiber.model;

import javax.persistence.*;

@Entity
@Table
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String model;

    private int series;

    @OneToOne
    @JoinTable(name = "users")
    private User user;
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Car() {

    }


    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
