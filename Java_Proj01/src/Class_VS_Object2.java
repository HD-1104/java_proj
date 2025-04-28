

// 동물 클래스
class Animal {
    // 필드
    String animalName;
    String animalEat;
    int animalAge;

    // 메서드
    void printAll() {
        System.out.println("동물 이름: " + animalName + ", 동물 먹이: " + animalEat + ", 동물 나이: " + animalAge);
    }
}

// 메인 클래스
public class Class_VS_Object2 {
    public static void main(String[] args) {
        // 객체 생성
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        // 필드 값 입력
        animal1.animalName = "호랑이";
        animal1.animalEat = "고기";
        animal1.animalAge = 10;

        animal2.animalName = "독수리";
        animal2.animalEat = "고기";
        animal2.animalAge = 20;

        // 출력
        animal1.printAll();
        animal2.printAll();
    }
}
