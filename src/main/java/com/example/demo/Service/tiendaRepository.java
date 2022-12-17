package com.example.demo.Service;

import com.example.demo.Bean.TiendaBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("Hola")
public interface tiendaRepository extends CrudRepository<TiendaBean, Integer> {

}
