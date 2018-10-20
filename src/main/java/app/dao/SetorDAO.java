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
@Repository("SetorDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface SetorDAO extends JpaRepository<Setor, java.lang.Integer> {

  /**
   * Obtém a instância de Setor utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Setor entity WHERE entity.id = :id")
  public Setor findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de Setor utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Setor entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.setor.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%') OR entity.horarioEnsaio like concat('%',coalesce(:search,''),'%'))")
  public Page<igreja> findIgrejaGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.Integer id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.setor.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%')) AND (:horarioEnsaio is null OR entity.horarioEnsaio like concat('%',:horarioEnsaio,'%'))")
  public Page<igreja> findIgrejaSpecificSearch(@Param(value="id") java.lang.Integer id, @Param(value="nome") java.lang.String nome, @Param(value="horarioEnsaio") java.lang.String horarioEnsaio, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.setor.id = :id")
  public Page<igreja> findIgreja(@Param(value="id") java.lang.Integer id, Pageable pageable);
    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.setor.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<evento> findEventoGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.Integer id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.setor.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<evento> findEventoSpecificSearch(@Param(value="id") java.lang.Integer id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.setor.id = :id")
  public Page<evento> findEvento(@Param(value="id") java.lang.Integer id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Setor entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<Setor> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Setor entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<Setor> specificSearch(@Param(value="nome") java.lang.String nome, Pageable pageable);
  
}
