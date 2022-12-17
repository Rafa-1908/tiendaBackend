package com.example.demo.Controller;

import com.example.demo.Bean.TiendaBean;
import com.example.demo.Service.tiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tienda")
@CrossOrigin(origins ="*")
public class tiendaController {

    //@Autowired
    //private TiendaBean TieBean;

    @Autowired
    private tiendaRepository tienRepo;

    @GetMapping("/obtener")
    public List<TiendaBean> obtenerTienda(){
        List<TiendaBean> listaTienda = new ArrayList<>();
        listaTienda = (List<TiendaBean>) tienRepo.findAll();
        return listaTienda;
    }

    @PostMapping("/insertar")
    public void insertarTienda(@RequestBody TiendaBean TieBean){

        tienRepo.save(TieBean);
    }

    @PutMapping("/modificar")
    public void modificarTrabajador(@RequestBody TiendaBean TieBean) {
        tienRepo.save(TieBean);
    }

    @DeleteMapping("/eliminar")
    public void eliminar(@RequestBody TiendaBean TieBean){
        tienRepo.deleteById(TieBean.getIdtienda());
    }

    @DeleteMapping("/eliminar/{idtienda}")
    public void eliminar(@PathVariable ("idtienda") Integer idtienda){
       tienRepo.deleteById(idtienda);
    }

}
