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
        
        myAnimal.testInstanceMethod();//�������̵� (���� myAnimal ��ü������ Cat�� AnimalŬ������ �޼ҵ带 ��� ����� �� ������
                                      //        �θ�,�ڼ�  Ŭ������ �̸��� ���� �޼ҵ尡 ������ �ڼ� Ŭ������ �޼ҵ带 ����Ѵ�-�ڼ�Ŭ������ ���� �����ϱ� ����)
        
        myAnimal.testClassMethod();//���̵� (�׷��� ����ƽ���� ������ �޼ҵ�� �������̵��� �ƴ� ���̵��� ���� �ȴ�.���� �� ��쿡�� Cat�� �ƴ� Animal�� �޼ҵ尡 �����.)
         
        dog.testInstanceMethod();//������ (�θ� Ŭ������ ������ �ؼ� �ڽ� Ŭ������ ������ ����� �� �ִ�-Cat Ŭ������ ����)
        
        //Animal.testClassMethod();
    }
}
