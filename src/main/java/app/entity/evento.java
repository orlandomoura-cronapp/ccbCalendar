package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela EVENTO
 * @generated
 */
@Entity
@Table(name = "\"EVENTO\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"nome" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.evento")
public class evento implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = true, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIME)
  @Column(name = "horario", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date horario;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_dia", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private dia dia;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_numeroDia", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private NumeroDia numeroDia;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_mes", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Mes mes;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_tipoEvento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private tipoEvento tipoEvento;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_igreja", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private igreja igreja;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_setor", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Setor setor;

  /**
   * Construtor
   * @generated
   */
  public evento(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public evento setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public evento setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém horario
   * return horario
   * @generated
   */
  
  public java.util.Date getHorario(){
    return this.horario;
  }

  /**
   * Define horario
   * @param horario horario
   * @generated
   */
  public evento setHorario(java.util.Date horario){
    this.horario = horario;
    return this;
  }

  /**
   * Obtém dia
   * return dia
   * @generated
   */
  
  public dia getDia(){
    return this.dia;
  }

  /**
   * Define dia
   * @param dia dia
   * @generated
   */
  public evento setDia(dia dia){
    this.dia = dia;
    return this;
  }

  /**
   * Obtém numeroDia
   * return numeroDia
   * @generated
   */
  
  public NumeroDia getNumeroDia(){
    return this.numeroDia;
  }

  /**
   * Define numeroDia
   * @param numeroDia numeroDia
   * @generated
   */
  public evento setNumeroDia(NumeroDia numeroDia){
    this.numeroDia = numeroDia;
    return this;
  }

  /**
   * Obtém mes
   * return mes
   * @generated
   */
  
  public Mes getMes(){
    return this.mes;
  }

  /**
   * Define mes
   * @param mes mes
   * @generated
   */
  public evento setMes(Mes mes){
    this.mes = mes;
    return this;
  }

  /**
   * Obtém tipoEvento
   * return tipoEvento
   * @generated
   */
  
  public tipoEvento getTipoEvento(){
    return this.tipoEvento;
  }

  /**
   * Define tipoEvento
   * @param tipoEvento tipoEvento
   * @generated
   */
  public evento setTipoEvento(tipoEvento tipoEvento){
    this.tipoEvento = tipoEvento;
    return this;
  }

  /**
   * Obtém igreja
   * return igreja
   * @generated
   */
  
  public igreja getIgreja(){
    return this.igreja;
  }

  /**
   * Define igreja
   * @param igreja igreja
   * @generated
   */
  public evento setIgreja(igreja igreja){
    this.igreja = igreja;
    return this;
  }

  /**
   * Obtém setor
   * return setor
   * @generated
   */
  
  public Setor getSetor(){
    return this.setor;
  }

  /**
   * Define setor
   * @param setor setor
   * @generated
   */
  public evento setSetor(Setor setor){
    this.setor = setor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    evento object = (evento)obj;
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
