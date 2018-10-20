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
@Repository("tipoEventoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tipoEventoDAO extends JpaRepository<tipoEvento, java.lang.Integer> {

  /**
   * Obtém a instância de tipoEvento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tipoEvento entity WHERE entity.id = :id")
  public tipoEvento findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de tipoEvento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tipoEvento entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.tipoEvento.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<evento> findEventoGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.Integer id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.tipoEvento.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<evento> findEventoSpecificSearch(@Param(value="id") java.lang.Integer id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.tipoEvento.id = :id")
  public Page<evento> findEvento(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
