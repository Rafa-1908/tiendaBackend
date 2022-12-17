package com.example.demo.Controller;

import com.example.demo.Bean.areaBean;
import com.example.demo.Service.areaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/area")
public class areaController {

    @Autowired
    private areaRepository arRepo;

    @GetMapping("/obtener")
    public List<areaBean> obtenerArea(){
        return (List<areaBean>) arRepo.findAll();
    }

    @PostMapping("/insertar")
    public void insertarArea(@RequestBody areaBean arBean){
        arRepo.save(arBean);
    }

    @PutMapping("/modificar")
    public void modificarArea(@RequestBody areaBean arBean){
        arRepo.save(arBean);
    }

    @DeleteMapping(value = "/{idRecibido}")
    public void eliminarArea(@PathVariable("idRecibido")
                             Integer id){
        arRepo.deleteById(id);
    }


}
