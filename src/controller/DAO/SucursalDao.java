/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.DAO;

import java.io.IOException;
import model.EnumMes;
import model.Sucursal;
import model.Venta;

/**
 *
 * @author JUAN
 */
public class SucursalDao extends AdaptadorDao<Sucursal>{
    private Sucursal sucursal;
    
    public SucursalDao() {
        super(Sucursal.class);
    }

    public Sucursal getSucursal() {
        if (this.sucursal == null) {
            this.sucursal = new Sucursal();
        }
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
    public void guardar() throws IOException{
        this.guardar(sucursal);
    }
    
    public void modificar(Integer pos){
        this.modificar(sucursal, pos);
    }
    
}
