class Person {
    int age;
    int height;
    int weight;

    Person() {
        age = 0;
        height = 0;
        weight = 0;
    }

    Person(int a, int h, int w) {
        age = a;
        height = h;
        weight = w;
    }

    void display() {
        System.out.println("Age: " + this.age);
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + this.weight);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p	1.display();

        Person p2 = new Person(20, 170, 60);
        p2.display();

        Person p3 = new Person(30, 180, 70);
        p3.display();
    }
}
