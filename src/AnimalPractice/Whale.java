package AnimalPractice;

public class Whale extends Animal implements Breath{

	@Override
	public void name() {
		System.out.println("이름 : 고래");
	}

	@Override
	public void category() {
		System.out.println("종류 : 포유류");
	}

	@Override
	public void move() {
		System.out.println("고래는 큰 지느러미를 이용하여 바다를 자유롭게 헤엄쳐 다닙니다.");
	}

	@Override
	public void eat() {
		System.out.println("고래는 작은 새우나 작은 물고기 등을 먹는다");
	}

}
