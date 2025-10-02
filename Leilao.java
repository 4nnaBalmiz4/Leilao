/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author AnnaLauraBalmizaSoar
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Sujeito. Mantém o estado e notifica os interessados.
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
        for (ICliente i : clientes){
            i.atualizar(lanceMin);
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