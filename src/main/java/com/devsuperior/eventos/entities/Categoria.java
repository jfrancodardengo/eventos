package com.devsuperior.eventos.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_category")
public class Categoria {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String descricao;

  public Categoria(){
  }

  public Categoria(Integer id, String descricao) {
    this.id = id;
    this.descricao = descricao;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public int hashCode() {
    return id != null ? id.hashCode() : 0;    
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;    
    if (obj == null || getClass() != obj.getClass())
      return false;
    
    Categoria categoria = (Categoria) obj;
    
    return Objects.equals(id, categoria.id);
  }
  
}
