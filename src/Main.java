public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловат в наш зоопарк!");
        Lion lion = new Lion(0.4f,50, Lion.Color.Red);
        lion.growl();
        lion.eat(10);
        System.out.println(lion.weight);
    }
}