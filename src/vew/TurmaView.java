package vew;

import controller.AlunoController;
import controller.TurmaController;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Aluno;
import model.Professor;
import model.Turma;

public class TurmaView {
    private TurmaController tc = new TurmaController();
    Scanner sc = new Scanner(System.in);
     ArrayList<Aluno> aluno ;
     AlunoController ac;
    private Aluno Aluno;
    
    
    
    
    void run (){
    int opcao = -1;
        Turma turma = new Turma();
        do{
        System.out.println(
                "=== Turmas ==="
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
                System.out.println("Turma: ");
                turma.setTurma(sc.next());
                System.out.println("Sala: ");
                turma.setSala(sc.nextInt());
                System.out.println("Matricula do aluno: ");
                 ac.findById(sc.nextInt());
                 if(aluno == null){
                     System.out.println("Aluno não encontrado");
                 }else{
                 aluno.add(Aluno);
                 }
                System.out.println("Matricula Professor: ");
                
                break;
                                                        
            }  
        } while (opcao != 0);
    }
}
