package chap06.EX07;

// 과일 클래스
class Fruit {
    // 1. 필드
    String fruitName;
    String fruitColor;
    int fruitCnt;

    // 2. 생성자
    Fruit() {}  // 기본 생성자

    Fruit(String fruitName, String fruitColor, int fruitCnt) {
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
        this.fruitCnt = fruitCnt;
    }

    // 3. Setter 메소드
    void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }

    void setFruitCnt(int fruitCnt) {
        this.fruitCnt = fruitCnt;
    }

    // 4. Getter 메소드
    String getFruitName() {
        return fruitName;
    }

    String getFruitColor() {
        return fruitColor;
    }

    int getFruitCnt() {
        return fruitCnt;
    }

    // 5. 전체 출력 메소드
    void printAll() {
        System.out.println("과일명: " + fruitName + ", 과일 색깔: " + fruitColor + ", 과일 개수: " + fruitCnt);
    }
}

// 메인 클래스
public class Field_initialize {
    public static void main(String[] args) {
        // 1. 생성자를 통한 값 할당
        Fruit fruit1 = new Fruit("바나나", "노란색", 10);
        fruit1.printAll();

        // 2. 기본 생성자 + Setter 사용
        Fruit fruit2 = new Fruit();
        fruit2.setFruitName("사과");
        fruit2.setFruitColor("빨간색");
        fruit2.setFruitCnt(20);
        fruit2.printAll();

        // 3. 직접 필드에 접근 (비추천 - 예시용)
        Fruit fruit3 = new Fruit();
        fruit3.fruitName = "포도";
        fruit3.fruitColor = "보라색";
        fruit3.fruitCnt = 30;
        fruit3.printAll();
    }
}
