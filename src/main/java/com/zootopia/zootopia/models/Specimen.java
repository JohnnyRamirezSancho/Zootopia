package com.zootopia.zootopia.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "specimens")
public class Specimen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_specimen")
    private Long id;
    @Column(nullable = false)
    private String name;
    private Long id_gender;
    private Long id_country;
    private Long id_specie;
    private String date;

    public Specimen(Long id, String name, Long id_gender, Long id_country, Long id_specie, String date) {
        this.id = id;
        this.name = name;
        this.id_gender = id_gender;
        this.id_country = id_country;
        this.id_specie = id_specie;
        this.date = date;
    }

    public Specimen() {
        
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

    public Long getId_gender() {
        return id_gender;
    }

    public void setId_gender(Long id_gender) {
        this.id_gender = id_gender;
    }

    public Long getId_country() {
        return id_country;
    }

    public void setId_country(Long id_country) {
        this.id_country = id_country;
    }

    public Long getId_specie() {
        return id_specie;
    }

    public void setId_specie(Long id_specie) {
        this.id_specie = id_specie;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    

}
