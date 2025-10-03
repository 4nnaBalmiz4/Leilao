/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnnaLauraBalmizaSoar
 */

public class Observer {
    public static void main(String[] args) {
        System.out.println("Demonstração do padrão observer");
        ICliente cliente1 = new Cliente("Petrus");
        ICliente cliente2 = new Cliente("Julius");
        ICliente cliente3 = new Cliente("Aloki");
        ICliente cliente4 = new Cliente("Totus");
        
        
        Leilao vendedor = new Leilao();
        vendedor.adicionarCliente(cliente1);
        vendedor.adicionarCliente(cliente2);
        vendedor.adicionarCliente(cliente3);
        vendedor.adicionarCliente(cliente4);
        
        vendedor.setComprador("Adubo NPK com 5% de desconto");
        vendedor.notificarClientes();
    }
}
