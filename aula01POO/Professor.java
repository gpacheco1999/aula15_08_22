
public class Professor
{
   Aluno aluno1 ,aluno2 ;
   //metodo construtores 
   public Professor(){
           
   }
   public Professor(Aluno a1,Aluno a2){
       aluno1 = a1;
       aluno2 = a2;
    
   }
   
   
   //metodo
   public Aluno alunoComMaiorNota(){
    if(aluno1.nota > aluno2.nota){
     return aluno1;
    }
    else{ return aluno2; }    
 }
        
    
    
    
    
    
    
    
}
