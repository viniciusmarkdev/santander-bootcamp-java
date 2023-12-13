package me.dio.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_card")
public class Card {

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    
    @Column(unique = true)
    private String number;
 
    
    /**
     * precision numero total de digitos 
     * 
     * scale - nuemro flutuantes ao lado do decimal
     * 
     * 
     */
    @Column(name="available_limit" , scale =2 , precision = 13)	
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

}