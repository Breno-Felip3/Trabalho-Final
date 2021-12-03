package exercicio;


public class Personagem {
    public String nome;
    public int vida ;
    public boolean status;
    public Jogador dono;
    public int acertos;
    
    
    public Personagem(String nome,int vida ){
        status = true;
        this.vida = vida;
        this.nome = nome;
        
    }
            
            
}
