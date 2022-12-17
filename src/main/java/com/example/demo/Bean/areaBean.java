package com.example.demo.Bean;

import javax.persistence.*;

@Entity
@Table(name ="areat")
public class areaBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idarea;

    public Integer getIdarea() {
        return idarea;
    }

    public void setIdarea(Integer idarea) {
        this.idarea = idarea;
    }

    public String getNombarea() {
        return nombarea;
    }

    public void setNombarea(String nombarea) {
        this.nombarea = nombarea;
    }

    public String getJefearea() {
        return jefearea;
    }

    public void setJefearea(String jefearea) {
        this.jefearea = jefearea;
    }

    private String nombarea;
    private String jefearea;
}
