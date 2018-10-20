package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/**
 * Classe que representa a tabela USER
 * @generated
 */
@Entity
@Table(name = "\"USER\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"name" ,"login" }))
@XmlRootElement
@CronappSecurity(post = "Administrators", get = "Administrators", delete = "Administrators", put = "Administrators")
@JsonFilter("app.entity.User")
public class User implements Serializable {
  /**
  * Variável privada para verificação da criptofrafia
  *
  * @generated
  */
  private static final String ENCRYPT = "$2a$10$";

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
  @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String email;

  /**
  * @generated
  */
  @Column(name = "name", nullable = false, unique = true, insertable=true, updatable=true)
  
  private java.lang.String name;

  /**
  * @generated
  */
  @Column(name = "login", nullable = false, unique = true, insertable=true, updatable=true)
  
  private java.lang.String login;

  /**
  * @generated
  */
  @Column(name = "picture", nullable = true, unique = false, insertable=true, updatable=true)
  
  private byte[] picture;

  /**
  * @generated
  */
  @Column(name = "password", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String password;

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
  @JoinColumn(name="fk_cidade", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Cidade cidade;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_bairro", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private bairro bairro;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_tpMinisterio", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private tpMinisterio tpMinisterio;

  /**
   * Construtor
   * @generated
   */
  public User(){
  }


  /**
   * Obtém email
   * return email
   * @generated
   */
  
  public java.lang.String getEmail(){
    return this.email;
  }

  /**
   * Define email
   * @param email email
   * @generated
   */
  public User setEmail(java.lang.String email){
    this.email = email;
    return this;
  }

  /**
   * Obtém name
   * return name
   * @generated
   */
  
  public java.lang.String getName(){
    return this.name;
  }

  /**
   * Define name
   * @param name name
   * @generated
   */
  public User setName(java.lang.String name){
    this.name = name;
    return this;
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
  public User setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém login
   * return login
   * @generated
   */
  
  public java.lang.String getLogin(){
    return this.login;
  }

  /**
   * Define login
   * @param login login
   * @generated
   */
  public User setLogin(java.lang.String login){
    this.login = login;
    return this;
  }

  /**
   * Obtém picture
   * return picture
   * @generated
   */
  
  public byte[] getPicture(){
    return this.picture;
  }

  /**
   * Define picture
   * @param picture picture
   * @generated
   */
  public User setPicture(byte[] picture){
    this.picture = picture;
    return this;
  }

  /**
   * Obtém password
   * return password
   * @generated
   */
  
  public java.lang.String getPassword(){
    return this.password;
  }

  /**
   * Define password
   * @param password password
   * @generated
   */
  public User setPassword(java.lang.String password){
    password = password.startsWith(ENCRYPT) ? password : new BCryptPasswordEncoder().encode(password);
    this.password = password;
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
  public User setEstado(Estado estado){
    this.estado = estado;
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
  public User setCidade(Cidade cidade){
    this.cidade = cidade;
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
  public User setBairro(bairro bairro){
    this.bairro = bairro;
    return this;
  }

  /**
   * Obtém tpMinisterio
   * return tpMinisterio
   * @generated
   */
  
  public tpMinisterio getTpMinisterio(){
    return this.tpMinisterio;
  }

  /**
   * Define tpMinisterio
   * @param tpMinisterio tpMinisterio
   * @generated
   */
  public User setTpMinisterio(tpMinisterio tpMinisterio){
    this.tpMinisterio = tpMinisterio;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    User object = (User)obj;
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
