/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AnnaLauraBalmizaSoar
 */
public class Leilao implements ILeilao {
    
    private List<ICliente> clientes; 
    private Integer lanceMin; 
    
    public Leilao(){
        clientes = new ArrayList(); 
        lanceMin = 0;
    }
    
    @Override
    public void adicionarCliente(ICliente ic) {
        clientes.add(ic);
    }

    @Override
    public void removerCliente(ICliente ic) {
        clientes.remove(ic);
    }

    @Override
    public void notificarClientes(){
        int maiorLance = 0;
        for (ICliente i : clientes){
            i.atualizar(lanceMin);
            int lance = i.atualizar(lanceMin);
            if(lance > maiorLance){
                maiorLance = lance;
            }
        }
    }

    public List<ICliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<ICliente> clientes) {
        this.clientes = clientes;
    }

    public void setComprador(String comprador) {
        this.lanceMin = lanceMin;
    }
    
}
