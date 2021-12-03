package exercicio;

import java.util.List;


public class Pergunta {
    public String descricao;
    public List<Resposta> respostas ;
    
    public Pergunta(List<Resposta> respostas,String descricao){
        this.respostas = respostas ;
        this.descricao=descricao;
        
    }

}

