package com.matera.wcc.projeto.domain;


import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.util.UUID;
import com.matera.wcc.projeto.domain.Enum.TipoCombustivel;

@Entity
@Table(name = "VEICULO")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TIPO", discriminatorType = DiscriminatorType.STRING)
public abstract class Veiculo {
    @Column(name = "ID")
    @Id
    @Type(type="uuid-char")
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(name = "MARCA")
    private String marca;

    @Column ( name = "COMBUSTIVEL")
    private TipoCombustivel combustivel;

    @Column (name = "ANO_MODELO")
    private int anoModelo;

    @Column (name = "ANO_FABRICACAO")
    private int anoFabricacai;

    @Column ( name = "MODELO")
    private  String modelo;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TipoCombustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(TipoCombustivel combustivel) {
        this.combustivel = combustivel;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getAnoFabricacai() {
        return anoFabricacai;
    }

    public void setAnoFabricacai(int anoFabricacai) {
        this.anoFabricacai = anoFabricacai;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
