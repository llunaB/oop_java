package 상속;

// 편의를 위해 여러 클래스를 한 패키지 내에 다 담음

import java.util.ArrayList;

abstract class Animal {

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {

    @Override
    public void move() {
        System.out.println("사람이 걷습니다.");
    }

    public void read() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {

    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunt() {
        System.out.println("호랑이가 사냥합니다.");
    }
}

class Bird extends Animal {

    @Override
    public void move() {
        System.out.println("새가 납니다.");
    }

    public void egg() {
        System.out.println("새가 알을 낳습니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        Human human = new Human();
        Tiger tiger = new Tiger();
        Bird bird = new Bird();

        animals.add(human);
        animals.add(tiger);
        animals.add(bird);

        AnimalTest test = new AnimalTest(); // 메서드 사용 위해 클래스 호출
        test.testMove(animals);
        test.testDownCasting(animals);

    }

    public void testMove(ArrayList<Animal> animals) {

        for (Animal animal:animals) {
            animal.move();
        }
    }

    public void testDownCasting(ArrayList<Animal> animals) {

        for (int i = 0;  i < animals.size(); i++) {

            Animal animal = animals.get(i);

            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.read();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunt();
            } else if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.egg();
            } else {
                System.out.println("Unsupported type");
            }
        }
    }
}
