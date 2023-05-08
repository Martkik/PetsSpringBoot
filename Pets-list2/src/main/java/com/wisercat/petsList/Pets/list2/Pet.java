package com.wisercat.petsList.Pets.list2;

public class Pet {

    private String name;
    private String code;
    public String types;
    private String colors;
    private String countries;

    public Pet() {
    }
    public Pet(String name, String code, String types, String colors, String countries) {
        this.name = name;
        this.code = code;
        this.types = types;
        this.colors = colors;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return types;
    }

    public void setType(String type) {
        this.types = type;
    }

    public String getFurColor() {
        return colors;
    }

    public void setFurColor(String furColor) {
        this.colors = furColor;
    }

    public String getCountry() {
        return countries;
    }

    public void setCountry(String country) {
        this.countries = country;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", type='" + types + '\'' +
                ", colors='" + colors + '\'' +
                ", countries='" + countries + '\'' +
                '}';
    }
}
