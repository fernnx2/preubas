/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entitys.OrdenTrabajo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fernando
 */
@Stateless
public class OrdenTrabajoFacade extends AbstractFacade<OrdenTrabajo> implements OrdenTrabajoFacadeLocal {

    @PersistenceContext(unitName = "com.edu.uesocc.ingenieria.tpi2018_MantenimientoEquipo_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdenTrabajoFacade() {
        super(OrdenTrabajo.class);
    }
    
}
