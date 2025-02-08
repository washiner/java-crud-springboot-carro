package com.washiner.carro.model;

import com.washiner.carro.enums.Cor;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "carro")
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false)
    private Integer ano;

    @Column(nullable = false)
    private Double motor;

    @Enumerated(EnumType.STRING) // Converte o enum para String no banco
    @Column(nullable = false, length = 50)
    private Cor cor;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    public CarroModel() {
    }

    public CarroModel(Long id, String nome, Integer ano, Double motor, Cor cor, BigDecimal valor, LocalDateTime createdAt) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.motor = motor;
        this.cor = cor;
        this.valor = valor;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getMotor() {
        return motor;
    }

    public void setMotor(Double motor) {
        this.motor = motor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarroModel that = (CarroModel) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(ano, that.ano) && Objects.equals(motor, that.motor) && cor == that.cor && Objects.equals(valor, that.valor) && Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, ano, motor, cor, valor, createdAt);
    }

    @Override
    public String toString() {
        return "CarroModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                ", motor=" + motor +
                ", cor=" + cor +
                ", valor=" + valor +
                ", createdAt=" + createdAt +
                '}';
    }
}
