package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela DIA
 * @generated
 */
@Entity
@Table(name = "\"DIA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.dia")
public class dia implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer id;

  /**
  * @generated
  */
  @Column(name = "dia", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String dia;

  /**
   * Construtor
   * @generated
   */
  public dia(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.Integer getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public dia setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém dia
   * return dia
   * @generated
   */
  
  public java.lang.String getDia(){
    return this.dia;
  }

  /**
   * Define dia
   * @param dia dia
   * @generated
   */
  public dia setDia(java.lang.String dia){
    this.dia = dia;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    dia object = (dia)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
