/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entitys.DetalleMantenimineto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fernando
 */
@Local
public interface DetalleManteniminetoFacadeLocal {

    void create(DetalleMantenimineto detalleMantenimineto);

    void edit(DetalleMantenimineto detalleMantenimineto);

    void remove(DetalleMantenimineto detalleMantenimineto);

    DetalleMantenimineto find(Object id);

    List<DetalleMantenimineto> findAll();

    List<DetalleMantenimineto> findRange(int[] range);

    int count();
    
}
