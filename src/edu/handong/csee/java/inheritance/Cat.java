package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        
        Animal dog = new Dog();
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        
        myAnimal.testInstanceMethod();//오버라이딩 (현재 myAnimal 객체에서는 Cat과 Animal클래스의 메소드를 모두 사용할 수 있지만
                                      //        부모,자손  클래스에 이름이 같은 메소드가 있으면 자손 클래스의 메소드를 사용한다-자손클래스를 먼저 접근하기 때문)
        
        myAnimal.testClassMethod();//하이딩 (그러나 스태틱으로 설정된 메소드는 오버라이딩이 아닌 하이딩이 적용 된다.따라서 이 경우에는 Cat이 아닌 Animal의 메소드가 실행됨.)
         
        dog.testInstanceMethod();//다형성 (부모 클래스를 변수로 해서 자식 클래스를 대입해 사용할 수 있다-Cat 클래스도 가능)
        
        //Animal.testClassMethod();
    }
}
