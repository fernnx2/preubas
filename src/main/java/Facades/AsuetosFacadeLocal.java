/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entitys.Asuetos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fernando
 */
@Local
public interface AsuetosFacadeLocal {

    void create(Asuetos asuetos);

    void edit(Asuetos asuetos);

    void remove(Asuetos asuetos);

    Asuetos find(Object id);

    List<Asuetos> findAll();

    List<Asuetos> findRange(int[] range);

    int count();
    
}
