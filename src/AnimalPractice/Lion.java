package AnimalPractice;

public class Lion extends Animal{

	@Override
	public void name() {
		System.out.println("이름 : 사자");
	}

	@Override
	public void category() {
		System.out.println("종류 : 포유류");
	}

	@Override
	public void move() {
		System.out.println("사자는 4개의 다리로 빠르게 달릴 수 있습니다.");
	}

	@Override
	public void eat() {
		System.out.println("사자는 다른 동물을 사냥하는 육식성입니다.");
	}



}
