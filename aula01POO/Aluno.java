public class Aluno
{
  String nome;
  int nota;
  
  //metodo construtor
  public Aluno(String n,int nt){
      nome = n;
      nota = nt;
    
    
  }
  public Aluno(String n){
      nome = n;
      nota = 0;
  }
  public Aluno(){
      nome = "";nota=0;    
  }
  public boolean estaAprovado(){
      return (nota >= 7);
      /*
      if(nota>=7){     
       return true;
      }
      else{return false; }
      */     
 
  }
}
