
public class Zoo {
   
 public  void enter () {
	
	 String sounds;
	 Animals Lion = new Animals ();
	 Animals Hippo = new Animals();
	 Animals Snake = new Animals();
	 Animals Pumma = new Animals();
	 Animals Owl= new Animals();
	 Animals Parrot = new Animals();
	 
	 
	 System.out.println("����� ���������� � ��� �������!\n");

	 sounds = Lion.reaction("���� - ���-������");
	 System.out.println(sounds);
	
	 sounds = Hippo.reaction("�������� - ����-�����");
	 System.out.println(sounds);
	
	 sounds = Snake.reaction("���� - ���-�������");
	 System.out.println(sounds);
	 		
	 sounds = Pumma.reaction("����� - ���-����");
	 System.out.println(sounds);
	 
	 sounds = Owl.reaction("���� - ����-����");
	 System.out.println(sounds);
	 
	 sounds = Parrot.reaction("������� - ���� �������!");
	 System.out.println(sounds);
 }
 public void exit (){
	 System.out.println("\n�� ��� ������� ? �������� ��� ��� :)");
 }
}
