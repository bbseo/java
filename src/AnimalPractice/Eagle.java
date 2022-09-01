package AnimalPractice;

public class Eagle extends Animal implements Fly{

	@Override
	public void name() {
		System.out.println("이름 : 독수리");
	}

	@Override
	public void category() {
		System.out.println("종류 : 맹금류");
	}

	@Override
	public void move() {
		System.out.println("독수리는 두 날개로 빠르게 날아다닙니다.");
	}

	@Override
	public void eat() {
		System.out.println("독수리는 죽은 동물이나 병든 동물을 먹는 육식성입니다.");
	}

}
