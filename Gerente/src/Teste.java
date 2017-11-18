import java.util.ArrayList;
import java.util.List;
import Entidade.Gerente;
import Repositorio.RepositorioGerente;
public class Teste {
    static RepositorioGerente rp = new RepositorioGerente();
    public static void main(String[] args){
        
        variosGerentes();
        listarGerentes();
        rp.removerFilme(15);
        listarGerentes();
        alteraGerente();
        listarGerentes();
        
        
        
        
        

        }
    public static void alteraGerente(){
        Gerente gerente = new Gerente();
        gerente.setNome("O poderoso Chefão");
        gerente.setCodigo(21);
        rp.alteraGerente(gerente);
        
    }
        
    
    static void variosGerentes(){
        Gerente gerente1 = new Gerente();
        

        
        gerente1.setNome("O massacre da serra elétrica");
        gerente1.setCodigo(7);
        gerente1.setGerenteName("Oswaldo");
        
        rp.adicionarFilme(gerente1);
        
        Gerente gerente2 = new Gerente();
        gerente2.setNome("O mágico de Oz");
        gerente2.setCodigo(15);
        gerente2.setGerenteName("Mário");
        
        rp.adicionarFilme(gerente2);
        
        Gerente gerente3 = new Gerente();
        gerente3.setNome("Senhor dos Anéis");
        gerente3.setCodigo(21);
        gerente3.setGerenteName("Santana Oliveira");
        
        rp.adicionarFilme(gerente3);

        
        
    } 
    
    public static void listarGerentes(){
        List<Gerente> lista = new ArrayList<Gerente>();
        RepositorioGerente rp = new RepositorioGerente();
        lista = rp.listarGerente();
        
        for (Gerente gerente :lista){
            System.out.println("Código do Filme:"+gerente.getCodigo());
            System.out.println("Nome do Filme:"+gerente.getNome());
            System.out.println("----------------------------------");
            
        }
        
    }
}
