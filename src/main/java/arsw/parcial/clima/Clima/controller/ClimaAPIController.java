/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsw.parcial.clima.Clima.controller;

import arsw.parcial.clima.Clima.services.ClimaServices;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2106991
 */
@RestController
@RequestMapping(value = "/weather")
public class ClimaAPIController {
    
    @Autowired
    ClimaServices weatherService;
    /**
     *
     * @param shareName
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, path = "/daily/{city}")
    public ResponseEntity<?> getIntradayShare(@PathVariable("city") String shareName){
        try {
            return new ResponseEntity<>(weatherService.getDAily(shareName),
                    HttpStatus.ACCEPTED);
        } catch (IOException ex) {
            return new ResponseEntity<>("No se han podido obtener las acciones", HttpStatus.NOT_FOUND);
        }        
    }
    
}
