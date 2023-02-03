package com.zootopia.zootopia.models;

import java.sql.Date;

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
        private String gender;
        private Date date;
        private String country;
        private Long id_specie;

        public Specimen() {
        }

        public Specimen(String name, String gender, Date date, String country, Long id_specie) {
            this.name = name;
            this.gender = gender;
            this.date = date;
            this.country = country;
            this.id_specie = id_specie;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Long getId_specie() {
            return id_specie;
        }

        public void setId_specie(Long id_specie) {
            this.id_specie = id_specie;
        }

    }
