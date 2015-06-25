
public class Main {

	public static void main(String[] args) {
		
		Zoo MyZoo = new Zoo();
		Zoo MyZoo2 = new Zoo();
		
		Animals MyHip = new Hippo();
		Animals MyLion = new Lion();
		Animals MySnake = new Snake();
		Animals MyOwl = new Owl();
		Animals MyPumma = new Pumma();
		Animals MyParrot = new Parrot();
		
		MyZoo.addAnimal(MyLion);
		MyZoo.addAnimal(MyHip);
		MyZoo.addAnimal(MySnake);
		MyZoo.addAnimal(MyOwl);
		MyZoo.addAnimal(MyPumma);
		MyZoo.addAnimal(MyParrot);
		
		MyZoo.enter();
		MyZoo.exit();
		MyZoo2.addAnimal(MyLion);
		MyZoo2.enter();
		
	}

}
