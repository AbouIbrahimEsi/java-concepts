package dz.learnjava.dependencyInjectionCourse.model;

public class Car { // Domain Class

    private Integer Id;
    private String name;
    private String model;
    private String color;

    public Car(Integer id, String name, String model, String color) {
        Id = id;
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
