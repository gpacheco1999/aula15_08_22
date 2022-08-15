public class Principal
{
 public static void main(String args[]){
  System.out.println("Bem Vindo!!!");
  Aluno a1 , a2;
  a1 =new Aluno("Zezim",7);  
  //a1.nome = "Zezin";  
  //a1.nota = 9;
  
  
  if(a1.estaAprovado()){
   System.out.println(a1.nome+" esta aprovado"); 
 }else{
   System.out.println(a1.nome+" esta reprovado");   
 }
 
  a2 =new Aluno("Pedro",4);
  //a2.nome = "Pedrin";
  //a2.nota = 4;
   
  System.out.println(a2.nome+((a2.estaAprovado())?" esta aprovado":" esta reprovado"));
  /* 
  if(a2.estaAprovado()){
   System.out.println(a2.nome+" esta aprovado"); 
 }else{
   System.out.println(a2.nome+" esta reprovado");   
 }
 */
  Professor p = new Professor();
  Aluno aux = p.alunoComMaiorNota();
  System.out.println(aux.nome + "tem a maior nota");
  System.out.println(p.alunoComMaiorNota().nome + "tem a maior nota");





}    
}
