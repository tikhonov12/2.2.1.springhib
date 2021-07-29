package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars_table")
public class Car {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long car_id;
    @Column
    private String model;
    @Column
    private int series;
    @OneToOne(mappedBy = "car")
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

    @Override
    public String toString() {
        return "Car{" +
                "car_id=" + car_id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
