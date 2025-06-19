package ch07.sec07.poly;

public class AnimalExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();

        //public static void animalCrying(Animal animal){} 로 cat과 tiger  타입을 다 받을 수 있다.
        animalCrying(cat);
        animalCrying(tiger);

        animalCrying(dog);
        animalCrying(bullDog);  // 월~ 월~ 불독이 쩜프한다

    }


    public static void animalCrying(Animal animal){
        animal.crying();

        //dog객체 넘어오면 jump 메소드 호출하기
        if(animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.jump();
        }

    }
}
