package Repositorio;

import Entidade.Gerente;
import java.util.ArrayList;
import java.util.List;


public class RepositorioGerente implements IRepositorioGerente {
    //cria um Arraylist de listaGerentes
    List<Gerente>listaGerentes = new ArrayList<Gerente>();
    List<Gerente>listaFilme = new ArrayList<Gerente>();

    @Override
    public boolean adicionarFilme(Gerente gerente) {
        //adiciona uma pessoa à listaGerentes
        try {
        listaGerentes.add(gerente);
        }catch(Exception e){
            return false;
        }
        
        return true;
    }

    @Override
    public boolean removerFilme(int codigo) {
        for (Gerente gerente:listaGerentes){
            if (gerente.getCodigo() == codigo){
                listaGerentes.remove(gerente);
            }
            
        }
        
        return false;
    }

    @Override
    public List<Gerente> listarGerente() {
        return listaGerentes;
    }

    @Override
    public boolean alteraGerente(Gerente gerente) 
    {
        for (Gerente gerente1:listaGerentes)
        {
            if (gerente1.getCodigo() == gerente.getCodigo())
            {
                listaGerentes.remove(gerente1);
                listaGerentes.add(gerente);
            }
        
        }
        return false;
    }
    public boolean adicionaGerente(Gerente gerente){
        try {
        listaFilme.add(gerente);
        }catch(Exception e){
            return false;
        }
        
        return true;
        
    }  

    @Override
    public boolean adicionarGerente(Gerente gerente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    

