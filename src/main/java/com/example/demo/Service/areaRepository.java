package com.example.demo.Service;

import com.example.demo.Bean.areaBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface areaRepository extends CrudRepository <areaBean,Integer>{
}
