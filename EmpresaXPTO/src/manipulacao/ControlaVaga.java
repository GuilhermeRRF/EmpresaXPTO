/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacao;

import java.util.ArrayList;
import negocio.Vaga;

/**
 *
 * @author romei
 */
public class ControlaVaga {
   
    private ArrayList<Vaga> vaga = new ArrayList<>();
    
    public boolean salvar(Vaga v){
        if (v != null){
           vaga.add(v);
           return true;
        }
        
        else{
            return false;
        }
    }
    public ArrayList<Vaga> retornarTodos () {
        return vaga;
    }
}
