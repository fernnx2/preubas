/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entitys.EstadoDetalleMantenimiento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fernando
 */
@Local
public interface EstadoDetalleMantenimientoFacadeLocal {

    void create(EstadoDetalleMantenimiento estadoDetalleMantenimiento);

    void edit(EstadoDetalleMantenimiento estadoDetalleMantenimiento);

    void remove(EstadoDetalleMantenimiento estadoDetalleMantenimiento);

    EstadoDetalleMantenimiento find(Object id);

    List<EstadoDetalleMantenimiento> findAll();

    List<EstadoDetalleMantenimiento> findRange(int[] range);

    int count();
    
}
