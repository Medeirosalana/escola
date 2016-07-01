package vew;

import controller.ProfessorController;
import java.util.Scanner;
import model.Professor;

public class ProfessorView {
    Scanner sc = new Scanner(System.in);
    ProfessorController ac =  new ProfessorController();
   
    private  void run(){
        
        int opcao = -1;
        Professor professor = new Professor();
        do{
        System.out.println(
                "=== Professor ==="
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
                professor.setMatricula(sc.nextInt());
                System.out.println("Nome: ");
                professor.setNome(sc.next());
                System.out.println("Disciplina: ");
                professor.setDisciplina(sc.next());
                ac.create(professor);
                break;
            case 2: 
                for (Professor a : ac.findALL()){
                    System.out.println(a.toString());
                }
                break;
            case 3:
                System.out.println("Digite a Matricula: ");
                professor = ac.findById(sc.nextInt());
                if(professor == null){
                    System.out.println("Professor não encontrado");
                }else{
                    System.out.println(professor.toString());
                }
                break;
            case 4:
                System.out.println("Digite a matricula: ");
                professor = ac.findById(sc.nextInt());
                if(professor == null){
                    System.out.println("Professor nao encontrado");
                }else{
                    System.out.println("Novo nome: ");
                    professor.setNome(sc.next());
                    System.out.println("Nova Disciplina: ");
                    professor.setDisciplina(sc.next());
                    ac.update(professor);
                }
                break;
            case 5:
                System.out.println("Digite a matricula: ");
                professor = ac.findById(sc.nextInt());
                if(professor == null){
                    System.out.println("Professor não encontrado");
                }else{
                ac.delete(professor);
                }
                break;
                
        }
        
        }while (opcao != 0);
    }
    public ProfessorView(){}
    
    public static void main(String[] args) {
        new ProfessorView().run();
    }
    
    
}       