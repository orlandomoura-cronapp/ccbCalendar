package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PERIODO
 * @generated
 */
@Entity
@Table(name = "\"PERIODO\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"periodo" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Periodo")
public class Periodo implements Serializable {

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
  @Column(name = "Periodo", nullable = true, unique = true, insertable=true, updatable=true)
  
  private java.lang.String periodo;

  /**
   * Construtor
   * @generated
   */
  public Periodo(){
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
  public Periodo setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém periodo
   * return periodo
   * @generated
   */
  
  public java.lang.String getPeriodo(){
    return this.periodo;
  }

  /**
   * Define periodo
   * @param periodo periodo
   * @generated
   */
  public Periodo setPeriodo(java.lang.String periodo){
    this.periodo = periodo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Periodo object = (Periodo)obj;
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
