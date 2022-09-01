package AnimalPractice;

public interface Fly {
	public default void CanFly() {
		System.out.println("이 동물은 하늘을 날 수 있습니다");
	}
}
