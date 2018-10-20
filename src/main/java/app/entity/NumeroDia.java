package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela NUMERODIA
 * @generated
 */
@Entity
@Table(name = "\"NUMERODIA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.NumeroDia")
public class NumeroDia implements Serializable {

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
  @Column(name = "numeroDia", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String numeroDia;

  /**
   * Construtor
   * @generated
   */
  public NumeroDia(){
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
  public NumeroDia setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém numeroDia
   * return numeroDia
   * @generated
   */
  
  public java.lang.String getNumeroDia(){
    return this.numeroDia;
  }

  /**
   * Define numeroDia
   * @param numeroDia numeroDia
   * @generated
   */
  public NumeroDia setNumeroDia(java.lang.String numeroDia){
    this.numeroDia = numeroDia;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    NumeroDia object = (NumeroDia)obj;
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
