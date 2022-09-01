package AnimalPractice;

public interface Breath {
	public default void CanBreath() {
		System.out.println("이 동물은 물 속에서 숨을 쉴 수 있습니다.");
	}
}
