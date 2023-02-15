package src.Semana8;

public interface VeiculoEletrico {
    
    int autonomia(); //devolve a autonomia restante
    void carregar(int percentagem); //simula um carregamento até "percentagem"
}
