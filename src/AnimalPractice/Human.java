package AnimalPractice;

public class Human extends Animal implements AnimalInterface, Fly, Breath{

	@Override
	public void name() {
		System.out.println("이름 : 인간");
	}

	@Override
	public void category() {
		System.out.println("종류 : 고위동물");
	}

	@Override
	public void move() {
		System.out.println("인간은 두 발로 어디든 갈 수 있습니다.");
	}

	@Override
	public void eat() {
		System.out.println("인간은 다양한 음식을 먹습니다");
	}
	
	public void Language() {
		System.out.println("인간은 언어를 구사하여 의사소통을 할 수 있다.");
	}
}
