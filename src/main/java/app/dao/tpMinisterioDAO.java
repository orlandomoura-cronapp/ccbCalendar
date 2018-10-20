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
@Repository("tpMinisterioDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tpMinisterioDAO extends JpaRepository<tpMinisterio, java.lang.String> {

  /**
   * Obtém a instância de tpMinisterio utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tpMinisterio entity WHERE entity.id = :id")
  public tpMinisterio findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de tpMinisterio utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tpMinisterio entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM User entity WHERE entity.tpMinisterio.id = :id AND (entity.email like concat('%',coalesce(:search,''),'%') OR entity.name like concat('%',coalesce(:search,''),'%') OR entity.login like concat('%',coalesce(:search,''),'%'))")
  public Page<User> findUserGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM User entity WHERE entity.tpMinisterio.id = :id AND (:email is null OR entity.email like concat('%',:email,'%')) AND (:name is null OR entity.name like concat('%',:name,'%')) AND (:login is null OR entity.login like concat('%',:login,'%'))")
  public Page<User> findUserSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="email") java.lang.String email, @Param(value="name") java.lang.String name, @Param(value="login") java.lang.String login, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM User entity WHERE entity.tpMinisterio.id = :id")
  public Page<User> findUser(@Param(value="id") java.lang.String id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM tpMinisterio entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<tpMinisterio> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM tpMinisterio entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<tpMinisterio> specificSearch(@Param(value="nome") java.lang.String nome, Pageable pageable);
  
}
