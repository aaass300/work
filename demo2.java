
class Animal {
    int num=20;
    static int age = 30;

    public static void drink(){
        System.out.println("喝水");

    }
    public static void go(){
        System.out.println("散步");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}

class Dog extends Animal {
    int num = 50;
    static int age = 60;

    public static void drink() {
        System.out.println("狗喝水");
    }
    public static void go() {
        System.out.println("狗睡觉");
    }

}


public class demo2{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.drink();
        a.go();


        System.out. println(a.num);
        System.out. println(a.age);
    }
}
