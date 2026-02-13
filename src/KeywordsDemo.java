class Parent {
    int val = 100;
}

class Child extends Parent {
    int val = 200;

    void display() {
        int val = 300;
        System.out.println("Local value: " + val);
        System.out.println("Current class (this): " + this.val);
        System.out.println("Parent class (super): " + super.val);
    }
}

public class KeywordsDemo {
    public static void main(String[] args) {
        new Child().display();
    }
}