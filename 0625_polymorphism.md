# 다형성 Polymorphism

Animal 이라는 상위 클래스가 있다.

Animal 은 1. 움직이고 2. 먹는다.



### Animal

- void move()
- void eat()



Tiger, Human, Bird 는 Animal을 상속받은 하위 클래스이다.

각각 move() 와 eat() 은 override 하고, 그 외에 특징적인 부분은 추가로 가진다.



### Tiger

- void move() @Override 뛴다
- void eat() @Override

- void hunt()



### Human

- void move() @Override 걷는다
- void eat() @Override

- void read()



### Bird

- void move() @Override 난다
- void eat() @Override

- void egg() 



## Animal(상위클래스)로 세 클래스(하위클래스)를 모두 다룰 수 있다.

```java
ArrayList<Animal> animals = new ArrayList();
```

배열에 tiger, human, bird 인스턴스를 넣으면 상위 클래스인 Animal 로 형변환된다.

그렇지만, instance.move() 를 하면 override 한 메서드가 실행된다.

> 뛴다 / 걷는다 / 난다  



- 사람만이 가진 read 메서드를 실행하려면? 하위 클래스로 다시 `다운캐스팅` 해야한다.

- 상위 클래스에서는 공통적인 부분을 제공하고, 하위 클래스에서는 각 클래스에 맞는 기능을 구현한다.



## 다운캐스팅 해야하는 경우 instanceof 로 체크

```java
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
```

