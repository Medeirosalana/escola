package vew;

import controller.AlunoController;
import controller.ProfessorController;
import java.util.Scanner;


public class Principal { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       ProfessorView professorview = new ProfessorView();
        AlunoView alunoview = new AlunoView();
        TurmaView turmaview = new TurmaView();
        int opcao = -1;
        do{
        System.out.println("Opções:"
                          + "\n1- professor"
                          + "\n2- aluno"
                          + "\n3- turma"
                          + "\n0- sair"
                          + "\n opção: ");
        opcao = sc.nextInt();
        
        switch (opcao){
            case 1:
                professorview.run();
                                  
                break;
            case 2:
                alunoview.run();
                break;
            case 3:
                turmaview.run();
                break;
                
            
        }
        }while( opcao != 0);
        return;
        
       
    }
    


        
    }

    

 
            
    

