package vew;

import controller.AlunoController;
import java.util.Scanner;
import model.Aluno;

public class AlunoView {
    Scanner sc = new Scanner(System.in);
    AlunoController ac =  new AlunoController();
    
    private  void run(){
        
        int opcao = -1;
        Aluno aluno = new Aluno();
        do{
        System.out.println(
                "=== Alunos ==="
              + "\n1-Cadrastar"
              + "\n2-Listar Tudo"
              + "\n3-Buscar Por Matricula"
              + "\n4-Editar"
              + "\n5-Excluir"
              + "\n0-sair"
              + "\n=============="
              + "\nOpção: "
        );
        opcao = sc.nextInt();
        switch(opcao){
            case 1:
                
                System.out.println("Matricula: ");
                aluno.setMatricula(sc.nextInt());
                System.out.println("Nome: ");
                aluno.setNome(sc.next());
                System.out.println("Idade: ");
                aluno.setIdade(sc.nextInt());
                ac.create(aluno);
                break;
            case 2:
                for (Aluno a : ac.findALL()){
                    System.out.println(a.toString());
                }
                break;
            case 3:
                
                System.out.println("Digite a Id do aluno: ");
                aluno = ac.findById(sc.nextInt());
                if (aluno == null){
                    System.out.println("Aluno não encontrado");
                }else{
                    System.out.println(aluno.toString());
                }
                break;       
                
                
                
            case 5:
                System.out.println("Digite a Mtricula:  ");
                aluno = ac.findById(sc.nextInt());
                if(aluno == null){
                    System.out.println("Aluno Não encontrado");
                }else{
                ac.delete(aluno);
                }
                break;
                
            case 4:
                System.out.println("Digite a Mtricula: ");
                aluno = ac.findById(sc.nextInt());
                if(aluno == null){
                    System.out.println("Aluno Não Encontrado");
                }else{
                    System.out.println("Nome: ");
                    aluno.setNome(sc.next());
                    System.out.println("Nova Idade");
                    aluno.setIdade(sc.nextInt());
                    ac.update(aluno);
                    
                }
            break;
                
                
                      
                
                                        
                                                         
            }  
        } while (opcao != 0);
    }
    public AlunoView(){}
        
    
    
    
    
    
    public static void main(String[] args) {
        new AlunoView().run();
    }
}
