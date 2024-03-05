public class Control {
    Writer writer = new Writer();

    public void run() {
        Toy pistol = new Toy(10,"Пистолет", 4, 40);
        Toy constructor = new Toy(15,"Конструктор", 7, 25);
        Toy barbie = new Toy(20, "Барби", 8, 15);
        Toy dollars = new Toy(20, "Игрушечные деньги", 15, 20);

        ToysFabric toysFabric = new ToysFabric();

        toysFabric.put(pistol);
        toysFabric.put(constructor);
        toysFabric.put(barbie);
        toysFabric.put(dollars);


        writer.createFile();
        for (int i = 0; i < 10; i++) {
            Toy toy = toysFabric.get();
            writer.writeFile(toy.toString());
        }
    }
}