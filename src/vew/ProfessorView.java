package vew;

import controller.AlunoController;
import controller.ProfessorController;
import java.util.Scanner;
import model.Professor;

public class ProfessorView {
    private ProfessorController pc = new ProfessorController();
    Scanner sc = new Scanner(System.in);
   
    public ProfessorView(){}
    void run(){
        
        int opcao = -1;
        do{
            
        System.out.println(
                "=== Professores ==="
              + "\n1-Cadrastar profs"
              + "\n2-Listar Tudos profs"
              + "\n3-Buscar Por Matricula"
              + "\n4-Editar professor"
              + "\n5-Excluir professor"
              
              + "\n0-retornar"
              + "\n==================="
              + "\nOpção: "
        );
        opcao = sc.nextInt();
        switch(opcao){
            case 1: 
                cadastrar();
                break;
            case 2:
                Listartudo();
                break;
            case 3:
                Buscarporid();
                break;
            case 4:
                editar();
                break;
            case 5:
                remover();
                break;
            case 6:
                
        }
        }while (opcao != 0);
               
    } 
       private void cadastrar(){
       Professor professor = new Professor();          
           System.out.println("Nome: ");
           professor.setNome(sc.next());
           System.out.println("Idade: ");
           professor.setIdade(sc.nextInt());
           System.out.println("Disciplina: ");
           professor.setDisciplina(sc.next());
           pc.create(professor);
       }
       private void Listartudo(){
           for (Professor professor : pc.findALL()){
               System.out.println(professor.toString());                       
           }
       }
       private void remover(){
           Professor professor = new Professor();
           System.out.println("Matricula: ");
           professor = pc.findById(sc.nextInt());
           if (professor == null){
               System.out.println("Professor não encontrado");
           }else{
               pc.delete(professor);
           }
       }
       private void Buscarporid(){
       Professor professor = new Professor();
           System.out.println("Matricula: ");
           professor = pc.findById(sc.nextInt());
           if (professor == null){
               System.out.println("Professor não encontrado");
           }else{
               System.out.println(professor.toString());
           }
       }
        private void editar(){
        Professor professor = new Professor();
            System.out.println("Matricula: ");
            professor = pc.findById(sc.nextInt());
            if (professor == null){
                System.out.println("Professor não encontrado");
            }else{
                System.out.println("Novo Nome: ");
                professor.setNome(sc.next());
                System.out.println("Nova Idade: ");
                professor.setIdade(sc.nextInt());
                System.out.println("Nova Disciplina: ");
                professor.setDisciplina(sc.next());
                pc.update(professor);
            }
            
        }          
                   
      
       
    
    


}              