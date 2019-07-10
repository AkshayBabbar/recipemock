package com.springdemo.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredient {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private BigDecimal amount;

    @ManyToOne(cascade = CascadeType.ALL)
    private Recipe recipe ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
