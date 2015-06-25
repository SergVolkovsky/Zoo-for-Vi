import java.util.ArrayList ;

public class Zoo {

   private ArrayList animals;
   
   public Zoo() {
  animals = new ArrayList();
   }
   
   public void addAnimal(Animals animal){
  animals.add(animal);
   }
   
 public  void enter () {
	 System.out.println("\n Добро пожаловать !\n");
 for(int i=0; i<animals.size(); i++){
  ((Animals) animals.get(i)).voice();
  
 }
 }
 public void exit (){
  System.out.println("\n Хорошего Вам дня :)");
 }
}