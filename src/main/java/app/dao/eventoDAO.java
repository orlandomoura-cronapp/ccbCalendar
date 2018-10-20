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
@Repository("eventoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface eventoDAO extends JpaRepository<evento, java.lang.String> {

  /**
   * Obtém a instância de evento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM evento entity WHERE entity.id = :id")
  public evento findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de evento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM evento entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<evento> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<evento> specificSearch(@Param(value="nome") java.lang.String nome, Pageable pageable);
  
  /**
   * Foreign Key dia
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.dia.id = :id")
  public Page<evento> findeventosByDia(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key numeroDia
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.numeroDia.id = :id")
  public Page<evento> findeventosByNumeroDia(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key mes
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.mes.id = :id")
  public Page<evento> findeventosByMes(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key tipoEvento
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.tipoEvento.id = :id")
  public Page<evento> findeventosByTipoEvento(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key igreja
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.igreja.id = :id")
  public Page<evento> findeventosByIgreja(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key setor
   * @generated
   */
  @Query("SELECT entity FROM evento entity WHERE entity.setor.id = :id")
  public Page<evento> findeventosBySetor(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
