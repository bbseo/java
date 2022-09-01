package AnimalPractice;

public class Duck extends Animal implements Fly{

	@Override
	public void name() {
		System.out.println("이름 : 오리");
	}

	@Override
	public void category() {
		System.out.println("종류 : 조류");
	}

	@Override
	public void move() {
		System.out.println("오리는 두 발로 물속에서 헤엄쳐 다닙니다");
	}

	@Override
	public void eat() {
		System.out.println("오리는 곤충이나 작은 수생동물을 먹는 잡식성입니다");
	}

}
