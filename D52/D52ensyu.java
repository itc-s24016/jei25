package D52;
public class D52ensyu{
    //Animalを継承したクラスを作成する

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal tama = new Cat();
        Animal ao = new Horse();

        animal.bark();
        tama.bark();
        ao.bark();
    }
}

//スーパークラス
class Animal {
    public void bark(){
        System.out.println("< Bow");
    }
}

// Animal を継承した Cat
class Cat extends Animal {
    public void bark() {
        System.out.println("< Meow");
    }
}

// Animal を継承した Horse
class Horse extends Animal{
    public void bark(){
        System.out.println("< Neigh");
    }
}