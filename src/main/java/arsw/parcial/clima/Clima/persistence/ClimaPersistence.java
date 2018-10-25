/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsw.parcial.clima.Clima.persistence;

import java.io.IOException;

/**
 *
 * @author 2106991
 */
public interface ClimaPersistence {
    
    
    public String getDaily(String url)throws IOException;;
}
