package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela MES
 * @generated
 */
@Entity
@Table(name = "\"MES\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"mes" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Mes")
public class Mes implements Serializable {

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
  @Column(name = "mes", nullable = true, unique = true, insertable=true, updatable=true)
  
  private java.lang.String mes;

  /**
   * Construtor
   * @generated
   */
  public Mes(){
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
  public Mes setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém mes
   * return mes
   * @generated
   */
  
  public java.lang.String getMes(){
    return this.mes;
  }

  /**
   * Define mes
   * @param mes mes
   * @generated
   */
  public Mes setMes(java.lang.String mes){
    this.mes = mes;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Mes object = (Mes)obj;
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
