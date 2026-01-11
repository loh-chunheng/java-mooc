
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(50);
        
        counter1.increase();
        counter1.increase(3);
        counter1.increase(-1);
        
        counter2.decrease();
        counter2.decrease(3);
        counter2.decrease(-1);
        
        System.out.println(counter1.value());
        System.out.println(counter2.value());
    }
}
