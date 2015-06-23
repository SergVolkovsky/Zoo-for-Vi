
public class Zoo {
   
 public  void enter () {
	
	 String sounds;
	 Animals Lion = new Animals ();
	 Animals Hippo = new Animals();
	 Animals Snake = new Animals();
	 Animals Pumma = new Animals();
	 Animals Owl= new Animals();
	 Animals Parrot = new Animals();
	 
	 
	 System.out.println("Добро пожаловать в наш Зоопарк!\n");

	 sounds = Lion.reaction("Лева - Арр-Аррррр");
	 System.out.println(sounds);
	
	 sounds = Hippo.reaction("Бегемота - Вурр-вууур");
	 System.out.println(sounds);
	
	 sounds = Snake.reaction("Змии - Ссс-фсссссс");
	 System.out.println(sounds);
	 		
	 sounds = Pumma.reaction("Пуммы - Мрр-Аррр");
	 System.out.println(sounds);
	 
	 sounds = Owl.reaction("Совы - Пугу-пугу");
	 System.out.println(sounds);
	 
	 sounds = Parrot.reaction("Попугая - Кеша Хороший!");
	 System.out.println(sounds);
 }
 public void exit (){
	 System.out.println("\nВы уже уходите ? Хорошего Вам дня :)");
 }
}
