package com.example.demo.Bean;

import javax.persistence.*;

@Entity
@Table(name ="fichat")
public class fichaBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idficha;

    private Integer idtienda;

    private Integer idarea;

    public Integer getIdficha() {
        return idficha;
    }

    public void setIdficha(Integer idficha) {
        this.idficha = idficha;
    }

    public Integer getIdtienda() {
        return idtienda;
    }

    public void setIdtienda(Integer idtienda) {
        this.idtienda = idtienda;
    }

    public Integer getIdarea() {
        return idarea;
    }

    public void setIdarea(Integer idarea) {
        this.idarea = idarea;
    }
}
