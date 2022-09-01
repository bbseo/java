package AnimalPractice;

public class AnimalTest {

	public static void main(String[] args) {
		Lion lion = new Lion();
		Eagle eagle = new Eagle();
		Whale whale = new Whale();
		Human human = new Human();
		
		lion.name();
		lion.move();
		lion.eat();
		
		System.out.println();
		
		eagle.name();
		eagle.CanFly();
		eagle.move();
		eagle.eat();
		
		System.out.println();
		
		whale.name();
		whale.CanBreath();
		whale.move();
		whale.eat();
		
		System.out.println();
		
		human.name();
		human.CanFly();
		human.CanBreath();
	}

}
