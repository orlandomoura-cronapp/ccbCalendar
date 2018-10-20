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
@Repository("igrejaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface igrejaDAO extends JpaRepository<igreja, java.lang.Integer> {

  /**
   * Obtém a instância de igreja utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM igreja entity WHERE entity.id = :id")
  public igreja findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de igreja utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM igreja entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.igreja.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<evento> findEventoGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.Integer id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.igreja.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<evento> findEventoSpecificSearch(@Param(value="id") java.lang.Integer id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.igreja.id = :id")
  public Page<evento> findEvento(@Param(value="id") java.lang.Integer id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.nome like concat('%',coalesce(:search,''),'%') OR entity.horarioEnsaio like concat('%',coalesce(:search,''),'%')")
  public Page<igreja> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%')) AND (:horarioEnsaio is null OR entity.horarioEnsaio like concat('%',:horarioEnsaio,'%'))")
  public Page<igreja> specificSearch(@Param(value="nome") java.lang.String nome, @Param(value="horarioEnsaio") java.lang.String horarioEnsaio, Pageable pageable);
  
  /**
   * Foreign Key bairro
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.bairro.id = :id")
  public Page<igreja> findigrejasByBairro(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key numeroDia
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.numeroDia.id = :id")
  public Page<igreja> findigrejasByNumeroDia(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key periodo
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.periodo.id = :id")
  public Page<igreja> findigrejasByPeriodo(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key setor
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.setor.id = :id")
  public Page<igreja> findigrejasBySetor(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key dia
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.dia.id = :id")
  public Page<igreja> findigrejasByDia(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key cidade
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.cidade.id = :id")
  public Page<igreja> findigrejasByCidade(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key estado
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.estado.id = :id")
  public Page<igreja> findigrejasByEstado(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key user
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.user.id = :id")
  public Page<igreja> findigrejasByUser(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key encregional
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.encregional.id = :id")
  public Page<igreja> findigrejasByEncregional(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key examinadora
   * @generated
   */
  @Query("SELECT entity FROM igreja entity WHERE entity.examinadora.id = :id")
  public Page<igreja> findigrejasByExaminadora(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
