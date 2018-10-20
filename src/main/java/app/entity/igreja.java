package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela IGREJA
 * @generated
 */
@Entity
@Table(name = "\"IGREJA\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"nome" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.igreja")
public class igreja implements Serializable {

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
  @Column(name = "nome", nullable = false, unique = true, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_bairro", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private bairro bairro;

  /**
  * @generated
  */
  @Column(name = "horarioEnsaio", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String horarioEnsaio;

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
  @JoinColumn(name="fk_periodo", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Periodo periodo;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_setor", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Setor setor;

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
  @JoinColumn(name="fk_cidade", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Cidade cidade;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_estado", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Estado estado;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private User user;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="encregional", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private User encregional;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="examinadora", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private User examinadora;

  /**
   * Construtor
   * @generated
   */
  public igreja(){
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
  public igreja setId(java.lang.Integer id){
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
  public igreja setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém bairro
   * return bairro
   * @generated
   */
  
  public bairro getBairro(){
    return this.bairro;
  }

  /**
   * Define bairro
   * @param bairro bairro
   * @generated
   */
  public igreja setBairro(bairro bairro){
    this.bairro = bairro;
    return this;
  }

  /**
   * Obtém horarioEnsaio
   * return horarioEnsaio
   * @generated
   */
  
  public java.lang.String getHorarioEnsaio(){
    return this.horarioEnsaio;
  }

  /**
   * Define horarioEnsaio
   * @param horarioEnsaio horarioEnsaio
   * @generated
   */
  public igreja setHorarioEnsaio(java.lang.String horarioEnsaio){
    this.horarioEnsaio = horarioEnsaio;
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
  public igreja setNumeroDia(NumeroDia numeroDia){
    this.numeroDia = numeroDia;
    return this;
  }

  /**
   * Obtém periodo
   * return periodo
   * @generated
   */
  
  public Periodo getPeriodo(){
    return this.periodo;
  }

  /**
   * Define periodo
   * @param periodo periodo
   * @generated
   */
  public igreja setPeriodo(Periodo periodo){
    this.periodo = periodo;
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
  public igreja setSetor(Setor setor){
    this.setor = setor;
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
  public igreja setDia(dia dia){
    this.dia = dia;
    return this;
  }

  /**
   * Obtém cidade
   * return cidade
   * @generated
   */
  
  public Cidade getCidade(){
    return this.cidade;
  }

  /**
   * Define cidade
   * @param cidade cidade
   * @generated
   */
  public igreja setCidade(Cidade cidade){
    this.cidade = cidade;
    return this;
  }

  /**
   * Obtém estado
   * return estado
   * @generated
   */
  
  public Estado getEstado(){
    return this.estado;
  }

  /**
   * Define estado
   * @param estado estado
   * @generated
   */
  public igreja setEstado(Estado estado){
    this.estado = estado;
    return this;
  }

  /**
   * Obtém user
   * return user
   * @generated
   */
  
  public User getUser(){
    return this.user;
  }

  /**
   * Define user
   * @param user user
   * @generated
   */
  public igreja setUser(User user){
    this.user = user;
    return this;
  }

  /**
   * Obtém encregional
   * return encregional
   * @generated
   */
  
  public User getEncregional(){
    return this.encregional;
  }

  /**
   * Define encregional
   * @param encregional encregional
   * @generated
   */
  public igreja setEncregional(User encregional){
    this.encregional = encregional;
    return this;
  }

  /**
   * Obtém examinadora
   * return examinadora
   * @generated
   */
  
  public User getExaminadora(){
    return this.examinadora;
  }

  /**
   * Define examinadora
   * @param examinadora examinadora
   * @generated
   */
  public igreja setExaminadora(User examinadora){
    this.examinadora = examinadora;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    igreja object = (igreja)obj;
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
