/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entitys.TipoMantenimiento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fernando
 */
@Local
public interface TipoMantenimientoFacadeLocal {

    void create(TipoMantenimiento tipoMantenimiento);

    void edit(TipoMantenimiento tipoMantenimiento);

    void remove(TipoMantenimiento tipoMantenimiento);

    TipoMantenimiento find(Object id);

    List<TipoMantenimiento> findAll();

    List<TipoMantenimiento> findRange(int[] range);

    int count();
    
}
