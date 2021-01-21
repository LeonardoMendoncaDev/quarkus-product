package br.com.mp.product.api;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Product extends PanacheEntity {
    
    @NotBlank(message="Name may not be blank")
    private String nome;

    @NotBlank(message="Brand may not be blank")
    private String brand;

    @NotNull
    @CreationTimestamp
    @Column(name="model_year")
    private LocalDate modelYear;

    @CreationTimestamp
    @Column(name="created_date_time", insertable=true)
    private LocalDate createdDateTime;

    private BigDecimal price;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getModelYear() {
        return modelYear;
    }

    public void setModelYear(LocalDate modelYear) {
        this.modelYear = modelYear;
    }

    public LocalDate getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDate createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}