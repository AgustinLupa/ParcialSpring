package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.models.entity.Cliente;
import com.example.demo.models.entity.Factura;

public interface IFacturaDao_2 extends CrudRepository<Factura,Long>{

}
