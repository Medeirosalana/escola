package vew;

import controller.AlunoController;
import java.util.Scanner;
import model.Aluno;

public class AlunoView {
    Scanner sc = new Scanner(System.in);
    AlunoController ac =  new AlunoController();
    private  void run(){
        int opcao = -1;
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
                Aluno aluno = new Aluno();
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
                
                
                        
                    
                                     
            }  
        } while (opcao != 0);
    }
    public AlunoView(){}
        
    
    
    
    
    
    public static void main(String[] args) {
        new AlunoView().run();
    }
}
