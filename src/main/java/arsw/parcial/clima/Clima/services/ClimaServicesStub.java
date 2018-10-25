/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsw.parcial.clima.Clima.services;

import arsw.parcial.clima.Clima.persistence.ClimaPersistence;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2106991
 */

@Service
public class ClimaServicesStub implements ClimaServices{

    
    @Autowired
    @Qualifier("Weather")
    ClimaPersistence clima;
    


    @Override
    public String getDAily(String url) throws IOException {
        return clima.getDaily(url);
    }


    
}
