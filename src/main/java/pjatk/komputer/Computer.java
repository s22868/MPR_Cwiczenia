package pjatk.komputer;

import javax.persistence.*;
import java.util.List;

@Entity
public class Computer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @OneToMany(
            cascade = CascadeType.ALL
    )
    private List<Component> componentsList;
    private String name;
    private double commision;

    public Computer(){}

    public Computer(Integer id, List<Component> componentsList, String name, int commision) {
        this.id = id;
        this.componentsList = componentsList;
        this.name = name;
        this.commision = commision;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Component> getComponentsList() {
        return componentsList;
    }

    public void setComponentsList(List<Component> componentsList) {
        this.componentsList = componentsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCommision() {
        return commision;
    }

    public void setCommision(double commision) {
        this.commision = commision;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", componentsList=" + componentsList +
                ", name='" + name + '\'' +
                ", commision=" + commision +
                '}';
    }
}
