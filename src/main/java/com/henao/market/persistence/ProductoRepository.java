package com.henao.market.persistence;

import com.henao.market.persistence.crud.ProductoCrudRepository;
import com.henao.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
