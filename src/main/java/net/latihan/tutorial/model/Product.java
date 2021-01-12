package net.latihan.tutorial.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.latihan.tutorial.utils.Rupiah;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "name")
    @JsonProperty("name")
    private String name;
    @NotNull
    @Column(name = "brand")
    @JsonProperty("brand")
    private String brand;
    @NotNull
    @Column(name = "madein")
    @JsonProperty("madein")
    private String madein;
    @NotNull
    @Column(name = "price")
    @JsonProperty("price")
    private double price;

    @JsonProperty("priceDisplay")
    public String showAmount() {
        return Rupiah.toRupiah(price);
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMadein() {
        return madein;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
