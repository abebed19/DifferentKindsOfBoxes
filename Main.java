

public class Main {

    public static void main(String[] args) {
        // You can test your program here
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
        
        System.out.println("-----------One item box-------------------------------");
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
        
        System.out.println("--------------Misplacing Box Demo----------------------");
        MisplacingBox misplacing = new MisplacingBox();
        misplacing.add(new Item("Saludo", 5));
        misplacing.add(new Item("Pirkka", 5));

        System.out.println(misplacing.isInBox(new Item("Saludo")));
        System.out.println(misplacing.isInBox(new Item("Pirkka")));
        
    }
}
