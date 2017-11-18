package Repositorio;
import java.util.List;
import Entidade.Gerente;


public interface IRepositorioGerente {
    public boolean adicionarFilme(Gerente gerente);
    public boolean removerFilme(int codigo);
    public List<Gerente>listarGerente();
    public boolean alteraGerente(Gerente gerente);
    public boolean adicionarGerente(Gerente gerente);
    
}
