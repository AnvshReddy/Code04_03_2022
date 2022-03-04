package instanceof_;

abstract class Animal {

}

class Dog extends Animal {
	public void barking() {
		System.out.println("Bow Bow Bow .........");
	}
}

class Cat extends Animal {
	public void moaning() {
		System.out.println("meow meow meow .........");
	}

}
class Lion extends Animal{
	public void roaring() {
		System.out.println("Roar roar roar ...........");
	}
	
}
class Zoo{
	public void playAnimalSounds(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			dog.barking();
		}
		if (animal instanceof Cat) {
			Cat cat = (Cat)animal;
			cat.moaning();
		}
		if (animal instanceof Lion) {
			Lion lion = (Lion)animal;
			lion.roaring();
		}
	}

}

public class Test {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.playAnimalSounds(new Dog());
		zoo.playAnimalSounds(new Cat());
		zoo.playAnimalSounds(new Lion());
		

	}

}
