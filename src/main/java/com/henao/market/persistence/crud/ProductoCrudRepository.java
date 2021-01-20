package com.henao.market.persistence.crud;

import com.henao.market.persistence.entity.Producto;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//Spring Repository recibe dos parametros, la tabla y el typo de la clave primaria
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

//    Si usamos una anotación @Query Nativo no es necesario llamar el método asi: findByIdCategoria podría llamarse de cualquier manera getByCategoria
//    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)

//    Usar Query methodses mejor práctica pues ofrecen más flexibilidad
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

  Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
