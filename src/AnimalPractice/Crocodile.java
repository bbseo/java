package AnimalPractice;

public class Crocodile extends Animal{

	@Override
	public void name() {
		System.out.println("이름 : 악어");
	}

	@Override
	public void category() {
		System.out.println("종류 : 파충류");
	}

	@Override
	public void move() {
		System.out.println("악어는 4개의 다리로 생각보다 빠르게 달릴 수 있습니다.");
	}

	@Override
	public void eat() {
		System.out.println("악어는 큰 입으로 다른동물을 사냥하는 육식성입니다.");
	}

}
