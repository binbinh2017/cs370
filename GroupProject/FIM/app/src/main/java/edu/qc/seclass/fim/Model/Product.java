package edu.qc.seclass.fim.Model;

public class Product {

    int id;
    String name;
    String category;
    String color;
    String size;
    String brand;
    String type;
    String price;
    String species;
    String storename;

    public Product() {
    }

    public Product(int id, String name, String category, String color, String size, String brand, String type, String price, String species, String storename) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.species = species;
        this.storename = storename;
    }

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }
}
