package com.zootopia.zootopia.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "families")
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_family")
    private Long id;
    @Column(nullable = false)
    private String name;
    @OneToMany
    @JoinColumn(name = "id_family")
    private List<Specie> specie;

    public Family(Long id, String name) {
        this.id = id;
        this.name = name;        
    }

    public Family() {
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


  

}


