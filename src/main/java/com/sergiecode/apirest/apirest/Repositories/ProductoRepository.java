package com.sergiecode.apirest.apirest.Repositories;

import com.sergiecode.apirest.apirest.Entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
