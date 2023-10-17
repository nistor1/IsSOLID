package org.example.S.good;

public class GoodEmployee {
    private String name;
    private String type;
    private Integer hours;
    public GoodEmployee(String type, String name, Integer hours) {
        this.hours = hours;
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
