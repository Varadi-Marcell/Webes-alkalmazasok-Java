package uni.miskolc.GuitarEntityWithInterfaces;

import javax.validation.constraints.NotNull;

public class Guitar {
    @NotNull
    private String id;

    @NotNull
    private String brand;

    @NotNull
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getbrand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
