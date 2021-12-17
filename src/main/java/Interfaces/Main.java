package Interfaces;

public class Main {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        outputInfo(info1);
        outputInfo(info2);

        //или
//        Animal animal1 = new Animal(1);
//        Person person1 = new Person("Bob");
//        outputInfo(animal1);
//        outputInfo(person1);
    }
    public static void outputInfo(Info info){
        info.showInfo(); //метод принимающий на вход реализацию интерфейса Info. Метод вызывается у классов имеющих showInfo
    }
}

