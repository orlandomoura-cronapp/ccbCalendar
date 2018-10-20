package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("UserDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface UserDAO extends JpaRepository<User, java.lang.Integer> {

  /**
   * Obtém a instância de User utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM User entity WHERE entity.id = :id")
  public User findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de User utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM User entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Role entity WHERE entity.user.id = :id")
  public Page<Role> findRole(@Param(value="id") java.lang.Integer id, Pageable pageable);
    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.user.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%') OR entity.horarioEnsaio like concat('%',coalesce(:search,''),'%'))")
  public Page<igreja> findIgrejaGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.Integer id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.user.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%')) AND (:horarioEnsaio is null OR entity.horarioEnsaio like concat('%',:horarioEnsaio,'%'))")
  public Page<igreja> findIgrejaSpecificSearch(@Param(value="id") java.lang.Integer id, @Param(value="nome") java.lang.String nome, @Param(value="horarioEnsaio") java.lang.String horarioEnsaio, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.user.id = :id")
  public Page<igreja> findIgreja(@Param(value="id") java.lang.Integer id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM User entity WHERE entity.email like concat('%',coalesce(:search,''),'%') OR entity.name like concat('%',coalesce(:search,''),'%') OR entity.login like concat('%',coalesce(:search,''),'%')")
  public Page<User> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM User entity WHERE (:email is null OR entity.email like concat('%',:email,'%')) AND (:name is null OR entity.name like concat('%',:name,'%')) AND (:login is null OR entity.login like concat('%',:login,'%'))")
  public Page<User> specificSearch(@Param(value="email") java.lang.String email, @Param(value="name") java.lang.String name, @Param(value="login") java.lang.String login, Pageable pageable);
  
  /**
   * Foreign Key estado
   * @generated
   */
  @Query("SELECT entity FROM User entity WHERE entity.estado.id = :id")
  public Page<User> findUsersByEstado(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key cidade
   * @generated
   */
  @Query("SELECT entity FROM User entity WHERE entity.cidade.id = :id")
  public Page<User> findUsersByCidade(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key bairro
   * @generated
   */
  @Query("SELECT entity FROM User entity WHERE entity.bairro.id = :id")
  public Page<User> findUsersByBairro(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key tpMinisterio
   * @generated
   */
  @Query("SELECT entity FROM User entity WHERE entity.tpMinisterio.id = :id")
  public Page<User> findUsersByTpMinisterio(@Param(value="id") java.lang.String id, Pageable pageable);

}
