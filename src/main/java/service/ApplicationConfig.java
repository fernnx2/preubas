/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author fernando
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(service.AsuetosFacadeREST.class);
        resources.add(service.CalendarioFacadeREST.class);
        resources.add(service.CargoFacadeREST.class);
        resources.add(service.DetalleEquipoFacadeREST.class);
        resources.add(service.DetalleManteniminetoFacadeREST.class);
        resources.add(service.DiagnosticoFacadeREST.class);
        resources.add(service.DiagnosticoParteFacadeREST.class);
        resources.add(service.EquipoFacadeREST.class);
        resources.add(service.EstadoDetalleMantenimientoFacadeREST.class);
        resources.add(service.MarcaFacadeREST.class);
        resources.add(service.ModeloFacadeREST.class);
        resources.add(service.OrdenTrabajoFacadeREST.class);
        resources.add(service.OrdenTrabajoPorTrabajadoresFacadeREST.class);
        resources.add(service.PasosFacadeREST.class);
        resources.add(service.ProcedimientoFacadeREST.class);
        resources.add(service.SolicitudFacadeREST.class);
        resources.add(service.TipoMantenimientoFacadeREST.class);
        resources.add(service.TrabajadoresFacadeREST.class);
    }
    
}
