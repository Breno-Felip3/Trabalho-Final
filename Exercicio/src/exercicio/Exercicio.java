
package exercicio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Exercicio {
    int n1;
    
    
    public static void main(String[] args) {
        String confip1 ="";
        String confip2 ="";
        Scanner scan= new Scanner(System.in);
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        Jogador vencedor = null;
        int menu = 0;
        Personagem p1 = new Personagem("Mai-san",100);
        Personagem p2 = new Personagem("Zero-Two",100);
        Personagem p3 = new Personagem("Megumin",100);
        Personagem p4 = new Personagem("Kaguya-sama",100);
        Personagem p5 = new Personagem("Rikka",100);
        List<Pergunta> perguntas = criarPerguntas();
        

        



        

        
        
        
        
        
        
        
        
        
        
        
        System.out.println("MENU INICIAL");
        System.out.println("1)Iniciar jogo");
        System.out.println("2)Informações dos desenvolvedores");
        System.out.println("3)Explicação do jogo.");
        System.out.println("4)Sair do jogo");
        System.out.println("O que deseja fazer?");
        menu = scan.nextInt();
        
        switch (menu){
            case 1:
                System.out.println("Registro do Jogador");
            
            while(!confip1.equalsIgnoreCase("Sim" )){
        
                System.out.println("Qual o seu nome?(Jogador 1)");
                j1.nome = scan.next();
                System.out.println("Qual o seu telefone?(Jogador 1)");
                j1.telefone = scan.next();
                System.out.println("Qual o seu email?(Jogador 1)");
                j1.email = scan.next();
                System.out.println("Qual o seu apelido?(Jogador 1)");
                j1.apelido = scan.next();
                j1.status();
                System.out.println("Está correto seus dados? Sim/Não");
                confip1=scan.next();
            if(!confip1.equalsIgnoreCase("Sim")&&!confip1.equalsIgnoreCase("Não")){
                System.out.println("Escreva a mensagem correta!Sim/Não (Mais uma tentativa)");
                confip1=scan.next();
            }
    }
            while (!confip2.equalsIgnoreCase("Sim")){
                System.out.println("Qual o seu nome?(Jogador 2)");
                j2.nome = scan.next();
                System.out.println("Qual o seu telefone?(Jogador 2)");
                j2.telefone = scan.next();
                System.out.println("Qual o seu email?(Jogador 2)");
                j2.email = scan.next();
                System.out.println("Qual o seu apelido?(Jogador 2)");
                j2.apelido = scan.next();
                j2.status();
                System.out.println("Está correto seus dados? Sim/Não");
                confip2=scan.next();
            if(!confip2.equalsIgnoreCase("Sim")&&!confip2.equalsIgnoreCase("Não")){
                System.out.println("Escreva a mensagem correta!Sim/Não (Mais uma tentativa)");
                confip2=scan.next();
                
            }
          }  
                System.out.println("ESCOLHA DE PERSONAGEM!"); 
                System.out.println("Cada um escolhe seu pergonagem");
                System.out.println("Escolha seu personagem "+j1.apelido);
                
                System.out.println("1)"+p1.nome);
                System.out.println("2)"+p2.nome);
                System.out.println("3)"+p3.nome);
                System.out.println("4)"+p4.nome);
                System.out.println("5)"+p5.nome);
                int opcaoj1 =scan.nextInt();
                Personagem personagemEscolhido1 = null;
                
                switch(opcaoj1){
                    case 1:
                        p1.dono = j1; 
                        p1.status = false;
                        personagemEscolhido1 = p1;
                        break;
                
                    case 2:
                        p2.dono = j1;
                        p2.status = false;
                        personagemEscolhido1 = p2;
                        break;
                    
                    case 3:
                        p3.dono = j1;     
                        p3.status = false;
                        personagemEscolhido1 = p3;
                        break;
                    
                    case 4:
                        p4.dono = j1;  
                        p4.status = false;
                        personagemEscolhido1 = p4;
                        break;
                    
                    case 5:
                        p5.dono = j1;
                        p5.status = false;
                        personagemEscolhido1 = p5;
                        break;
                }
                System.out.println("Escolha seu personagem "+j2.apelido);
                
                System.out.println("1)"+p1.nome);
                System.out.println("2)"+p2.nome);
                System.out.println("3)"+p3.nome);
                System.out.println("4)"+p4.nome);
                System.out.println("5)"+p5.nome);
                
                int opcaoj2 =scan.nextInt();
                boolean p2escol = false;
                Personagem personagemEscolhido2=null;
            
                while(p2escol==false){ 
                  
                    switch(opcaoj2){
                        case 1:
                            if(p1.status==true){
                            p1.dono = j2; 
                            p2escol = true;
                            personagemEscolhido2 = p1;
                            }else{
                                
                                System.out.println("Personagem já escolhido ");
                                System.out.print("Escolha outro personagem: ");
                                opcaoj2 =scan.nextInt();
                            }break;
                        case 2:
                            if(p2.status==true){
                            p2.dono = j2; 
                            p2escol = true;
                            personagemEscolhido2 = p2;
                            }else{
                                                                
                                System.out.println("Personagem já escolhido ");
                                System.out.print("Escolha outro personagem: ");
                                opcaoj2 =scan.nextInt();
                            }
                            break;
                        case 3:
                            if(p3.status==true){
                            p3.dono = j2; 
                            p2escol = true;
                            personagemEscolhido2 = p3;
                            }else{
                                                             
                                System.out.println("Personagem já escolhido "); 
                                System.out.print("Escolha outro personagem: ");
                                opcaoj2 =scan.nextInt();                                
                            }break;    
                        case 4:
                            if(p4.status==true){
                            p4.dono = j2; 
                            p2escol = true;
                            personagemEscolhido2 = p4;
                            }else{
                                                              
                                System.out.println("Personagem já escolhido ");
                                System.out.print("Escolha outro personagem: ");
                                opcaoj2 =scan.nextInt();
                            }break;  
                        case 5:
                            if(p5.status==true){
                            p5.dono = j2; 
                            p2escol = true;
                            personagemEscolhido2 = p5; 
                            }else{ 
                                
                                System.out.println("Personagem já escolhido ");
                                System.out.print("Escolha outro personagem: ");
                                opcaoj2 =scan.nextInt();
                            
                            }break;
                    }
                }
                
                System.out.println("A BATALHA DO SÉCULO!!");
                System.out.println(personagemEscolhido1.nome+ " versus "+personagemEscolhido2.nome );
                Turno turno = new Turno(perguntas.get(0),1);
                double numero= Math.random();
                if(numero%2==0){
                    turno.champion= personagemEscolhido1;
                    System.out.println("O personagem "+ personagemEscolhido1.nome+ " irá jogar primeiro");
                }else{turno.champion = personagemEscolhido2;
                    System.out.println("O personagem "+ personagemEscolhido2.nome+ " irá jogar primeiro");
                }
                System.out.println("Vamos as perguntas!!!");
                int perguntaAtual = 0;
                while(vencedor==null){
                    System.out.println(turno.perguntaDoTurno.descricao);
                    for(int i = 0;i<turno.perguntaDoTurno.respostas.size();i++){
                        System.out.println((i+1)+") "+turno.perguntaDoTurno.respostas.get(i).descricao);  
                    }
                    int opcao = scan.nextInt();
                    if(responder(opcao,turno.perguntaDoTurno)){
                        System.out.println("Acertou mizeravi!!!");
                        perguntaAtual++;
                        turno.champion.acertos++;
                        try{
                            Pergunta proximaPergunta = perguntas.get(perguntaAtual);
                            turno.perguntaDoTurno = proximaPergunta;
                            turno.numeroDoTurno++;
                        }catch(Exception e){
                            System.out.println("Acabaram as perguntas, calculando o vencedor...");
                            vencedor = calcularVencedor(personagemEscolhido1,personagemEscolhido2);
                            System.out.println("Vencedor: "+ vencedor.apelido);
                            break;
                        }
                    }else{
                        if(turno.champion.vida==0){
                            System.out.println(turno.champion.nome+" Chegou a 0 de vida ! :( ");
                            vencedor = calcularVencedor(personagemEscolhido1,personagemEscolhido2);
                            System.out.println("O Vencedor é: "+ vencedor.apelido);
                        }else{
                           if(turno.champion==personagemEscolhido1){
                               System.out.println("Personagem "+personagemEscolhido1.nome+" errrrou!! Passando a vez!");
                               personagemEscolhido1.vida-=25;
                               turno.champion=personagemEscolhido2;
                        }else{
                               System.out.println("Personagem "+personagemEscolhido2.nome+" errrrou!! Passando a vez!");
                               personagemEscolhido2.vida-=25;
                               turno.champion=personagemEscolhido1;
                           }
                    }
                    
                }
                    
                }
                break;
                
            
            
            
            case 2:
                System.out.println("Filipe Ávila Guimarães Pimenta , 21 anos , cursando o primeiro período em Análise e Desenvolvimento de Sistemas. ");
                System.out.println("Rafaela Ramos Lopes, 25, cursando o primeiro período em Gestão em Tecnologia da Informação");
                System.out.println("Breno Felipe Gomes Cordeiro , 21, cursando o primeiro período em Sistemas de Informação");
                System.out.println("João Vitor Simão Pinheiro, 18, cursando o primeiro período em Ciências da Computação");
                System.out.println("Victoria Emilly Ferreira Santos, 19 anos, cursando o primeiro preríodo em Análise e Desenvolvimento de Sistemas");
                break;
            case 3: 
                System.out.println("Escolha seu personagem e duele contra outra pessoa.");
                System.out.println("A cada erro o jogador perde 25 de vida");
                System.out.println("O jogador que tiver mais vida no final, será o ganhador.");
                break;
                
            case 4: 
                System.out.println("Ja vai? Que triste...  '-'");
                System.out.println("Saindo do jogo...");
                
            
               
    }
    }
    public static List<Pergunta> criarPerguntas(){
        
        List<Pergunta> perguntas = new ArrayList<>();
        
        List<Resposta> respostasPergunta1=new ArrayList<>();
        Resposta p1r1 = new Resposta("Métodos", true);       
        Resposta p1r2 = new Resposta("Atributos", false);
        Resposta p1r3 = new Resposta("Variáveis", false);
        Resposta p1r4 = new Resposta("Objetos", false);
        respostasPergunta1.add(p1r1);       
        respostasPergunta1.add(p1r2);       
        respostasPergunta1.add(p1r3);         
        respostasPergunta1.add(p1r4); 
        Pergunta pergunta1 = new Pergunta(respostasPergunta1,"São implementados para realizarem algum tipo de tarefa:");
        perguntas.add(pergunta1);
        
        List<Resposta> respostasPergunta2=new ArrayList<>();
        Resposta p2r1 = new Resposta("Setter", false);       
        Resposta p2r2 = new Resposta("Getter", false);
        Resposta p2r3 = new Resposta("Construtor", true);
        Resposta p2r4 = new Resposta("Equeals", false);
        respostasPergunta2.add(p2r1);       
        respostasPergunta2.add(p2r2);       
        respostasPergunta2.add(p2r3);         
        respostasPergunta2.add(p2r4); 
        Pergunta pergunta2 = new Pergunta(respostasPergunta2,"Função de uma classe responsável por contruir e devolver sua instancia:");
        perguntas.add(pergunta2);
        
        List<Resposta> respostasPergunta3=new ArrayList<>();
        Resposta p3r1 = new Resposta("Abstração, Encapsulamento, Herança e Polimorfismo", true);       
        Resposta p3r2 = new Resposta("Classes, Atributos, Métodos e Abstração", false);
        Resposta p3r3 = new Resposta("Herança, Polimorfismo, Classes e Objetos", false);
        Resposta p3r4 = new Resposta("Sequenciamento, Procedimentos, Bibliotecas e Herança", false);
        respostasPergunta3.add(p3r1);       
        respostasPergunta3.add(p3r2);       
        respostasPergunta3.add(p3r3);         
        respostasPergunta3.add(p3r4); 
        Pergunta pergunta3 = new Pergunta(respostasPergunta3,"Os quatro pilares do paradigma de Orientação a Objetos são:");
        perguntas.add(pergunta3);
        
        List<Resposta> respostasPergunta4=new ArrayList<>();
        Resposta p4r1 = new Resposta("Verdadeiro", true);       
        Resposta p4r2 = new Resposta("mentira", false);
        respostasPergunta4.add(p4r1);       
        respostasPergunta4.add(p4r2);       
        Pergunta pergunta4 = new Pergunta(respostasPergunta4,"É possível herdar de uma classe abstrata. Verdadeiro ou Falso?");
        perguntas.add(pergunta4);
        
        List<Resposta> respostasPergunta5=new ArrayList<>();
        Resposta p5r1 = new Resposta("Uma classe é uma espécie de forma que vai definir tributos e/ou comportamentos de todos aqueles objetos que forem instanciados a partir dela.  ", true);       
        Resposta p5r2 = new Resposta("A POO (programação orientada a objetos) é equivalente à programação estruturada, pois se fundamenta no relacionamento entre variáveis e classes, através de polimorfismo e interfaces. ", false);
        Resposta p5r3 = new Resposta("Um objeto é a representação prática de um método de uma classe, pois todo método precisa retornar um tipo de informação. ", false);
        Resposta p5r4 = new Resposta("A partir do momento em que criamos um objeto, temos um novo TIPO disponível para utilização.", false);
        respostasPergunta5.add(p5r1);       
        respostasPergunta5.add(p5r2);       
        respostasPergunta5.add(p5r3);         
        respostasPergunta5.add(p5r4); 
        Pergunta pergunta5 = new Pergunta(respostasPergunta5,"Assinale a alternativa CORRETA: ");
        perguntas.add(pergunta5);
        
        List<Resposta> respostasPergunta6=new ArrayList<>();
        Resposta p6r1 = new Resposta("As mensagens trocadas entre os objetos são conhecidas como atributos.   ", false);       
        Resposta p6r2 = new Resposta("Os atributos e os métodos dos objetos são conhecidos como o ESTADO dos mesmos.  ", false);
        Resposta p6r3 = new Resposta("A programação orientada a objetos exige a utilização de uma máquina virtual que proteja o sistema operacional de possíveis erros de um programa.  ", false);
        Resposta p6r4 = new Resposta("O encapsulamento consiste em proteger os dados de um objeto do acesso externo, liberando-os conforme houver necessidade.", true);
        respostasPergunta6.add(p6r1);       
        respostasPergunta6.add(p6r2);       
        respostasPergunta6.add(p6r3);         
        respostasPergunta6.add(p6r4); 
        Pergunta pergunta6 = new Pergunta(respostasPergunta6,"Assinale a alternativa CORRETA: ");
        perguntas.add(pergunta6);
        
        List<Resposta> respostasPergunta7=new ArrayList<>();
        Resposta p7r1 = new Resposta("Os tipos de dados abstratos em linguagens orientadas a objeto usualmente são chamados de classes.", false);       
        Resposta p7r2 = new Resposta("Uma classe definida pela herança de outra é comumente chamada de classe derivada ou subclasse.", false);
        Resposta p7r3 = new Resposta("Uma classe definida pela herança de outra é comumente chamada de classe           derivada ou subclasse.", false);
        Resposta p7r4 = new Resposta("Toda e qualquer linguagem orientada a objetos suporta encapsulamento e herança múltipla.", true);
        respostasPergunta7.add(p7r1);       
        respostasPergunta7.add(p7r2);       
        respostasPergunta7.add(p7r3);         
        respostasPergunta7.add(p7r4); 
        Pergunta pergunta7 = new Pergunta(respostasPergunta7,"O conceito de programação orientada a objeto foi amplamente difundido a partir da evolução da linguagem de programação Smalltalk, em sua versão 80. Sobre o paradigma de programação orientada a objetos, assinale a opção INCORRETA.");
        perguntas.add(pergunta7);
        
        List<Resposta> respostasPergunta8=new ArrayList<>();
        Resposta p8r1 = new Resposta("Método - instâncias", false);       
        Resposta p8r2 = new Resposta("ator/atriz - atributos", false);
        Resposta p8r3 = new Resposta("superclasse - instâncias", true);
        Resposta p8r4 = new Resposta("superclasse - atores/atrizes", false);
        respostasPergunta8.add(p8r1);       
        respostasPergunta8.add(p8r2);       
        respostasPergunta8.add(p8r3);         
        respostasPergunta8.add(p8r4); 
        Pergunta pergunta8 = new Pergunta(respostasPergunta8,"Um dos conceitos em Orientação a Objetos é a classe abstrata. Assinale a alternativa que complete correta e respectivamente as lacunas da frase abaixo:\n" +
"A classe abstrata é sempre um(a) ______________ que não possui ______________");
        perguntas.add(pergunta8);
        
        List<Resposta> respostasPergunta9=new ArrayList<>();
        Resposta p9r1 = new Resposta("Diagrama de Atividade.  ", false);       
        Resposta p9r2 = new Resposta("Diagrama de Entidade e Relacionamento ", true);
        Resposta p9r3 = new Resposta("Diagrama de Casos de Uso.  ", false);
        Resposta p9r4 = new Resposta("Diagrama de Classes.  ", false);
        respostasPergunta9.add(p9r1);       
        respostasPergunta9.add(p9r2);       
        respostasPergunta9.add(p9r3);         
        respostasPergunta9.add(p9r4); 
        Pergunta pergunta9 = new Pergunta(respostasPergunta9,"A UML (Unified Modeling Language) trabalha com um conjunto de diagramas, cobrindo diferentes aspectos da especificação de sistemas. São diagramas UML, exceto:");
        perguntas.add(pergunta9);
        
        List<Resposta> respostasPergunta10=new ArrayList<>();
        Resposta p10r1 = new Resposta("A Linguagem de Modelagem Unificada (UML) simplifica o complexo processo de análise, projeto e construção de software criando visões do sistema que esta sendo construído. ", true);       
        Resposta p10r2 = new Resposta("A UML, como notação, possui um conjunto de artefatos gráficos, como exemplo Diagrama de Caso de Uso.", false);
        Resposta p10r3 = new Resposta("A Linguagem de Modelagem Unificada (UML) é um método de desenvolvimento de sistemas. Uma linguagem de modelagem gráfica para descrever um projeto de software.", false);
        Resposta p10r4 = new Resposta("A Linguagem de Modelagem Unificada (UML) é uma linguagem de programação.", false);
        respostasPergunta10.add(p10r1);       
        respostasPergunta10.add(p10r2);       
        respostasPergunta10.add(p10r3);         
        respostasPergunta10.add(p10r4); 
        Pergunta pergunta10 = new Pergunta(respostasPergunta10,"Acerca de UML (Unified Modeling Language), marque a alternativa correta:");
        perguntas.add(pergunta10);
        
        List<Resposta> respostasPergunta11=new ArrayList<>();
        Resposta p11r1 = new Resposta("de recursão.", false);       
        Resposta p11r2 = new Resposta("de dependência.", true);
        Resposta p11r3 = new Resposta("estendido.", false);
        Resposta p11r4 = new Resposta("hierárquico.", false);
        respostasPergunta11.add(p11r1);       
        respostasPergunta11.add(p11r2);       
        respostasPergunta11.add(p11r3);         
        respostasPergunta11.add(p11r4); 
        Pergunta pergunta11 = new Pergunta(respostasPergunta11,"Na representação da UML 2.0, um caso de uso incluído em outro caso de uso, estabelecido estereotipadamente como <<include>>, é um relacionamento");
        perguntas.add(pergunta11);
        
        
        return perguntas;
    }
    
    public static boolean responder(int opcao,Pergunta pergunta){
        try{
            Resposta respostaDoUsuario = pergunta.respostas.get(opcao-1);
            if(respostaDoUsuario.respostaCorreta){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            System.out.println("Escolha uma opção válida.");
            return responder(opcao,pergunta);
       }
    }
    public static Jogador calcularVencedor(Personagem p1, Personagem p2){
        if (p1.vida==p2.vida ) {
            return p1.acertos>p2.acertos?p1.dono:p2.dono;
        }
        return p1.vida>p2.vida?p1.dono:p2.dono;
    }
    
    
}