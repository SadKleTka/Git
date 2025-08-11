import java.util.*;
public class OOP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        HashSet<String> names = new HashSet<>();
        HashMap<String, Animal> typeOfAnimal = new HashMap<>();
        HashMap<String, Integer> agesOfAnimals = new HashMap<>();
        Animal a;
        while (true) {
            System.out.print("\nWrite \"stop\" to stop adding new animals");
            System.out.print("\nEnter which type of animal you want to add cat/dog: ");
            String type = scan.nextLine();
            if (type.equalsIgnoreCase("cat")) {
                a = new Cat();
            } else if (type.equalsIgnoreCase("dog")) {
                a = new Dog();
            } else if (type.equalsIgnoreCase("stop")) {
                break;
            } else {
                System.out.println("Invalid action, please try again");
                continue;
            }
            addNewAnimal(a, scan, names, typeOfAnimal, agesOfAnimals);
            animals.add(a);
        }

            while (true) {
                System.out.println("Write what do you want to do: ");
                System.out.println("--------------------------");
                System.out.println("List of animals with their sounds. Enter \"sounds\"");
                System.out.println("List of animals with their type. Enter \"type\"");
                System.out.println("List of unique names of animals. Enter \"unique\"");
                System.out.println("List of animals with their ages. Enter \"age\"");
                System.out.println("Enter \"exit\" to exit from menu");
                String menu = scan.nextLine();
                switch (menu) {
                    case "sounds":
                        listOfAnimalsAndSound(animals);
                        printOneAction(scan);
                        break;

                    case "type":
                        listOfAnimalsWithTypes(typeOfAnimal);
                        printOneAction(scan);
                        break;

                    case "unique":
                        uniqueNamesOfAnimals(names);
                        printOneAction(scan);
                        break;

                    case "age":
                        listOfAnimalsWithAges(agesOfAnimals);
                        printOneAction(scan);
                        break;

                    case "exit":
                        System.exit(0);

                    default:
                        System.out.println("Invalid action!");
                        break;
                }
            }


    }
    public static void addNewAnimal(Animal a, Scanner scan, HashSet<String> names, HashMap<String, Animal> typeOfAnimal, HashMap<String, Integer> agesOfAnimals) {
            System.out.print("\nWrite name of " + a + ":");
            a.setName(scan.nextLine());
            String name = a.getName();
            if (names.contains(name)) {
                System.out.println("This name already exists! Please try another one.");
                return;
            }
            names.add(name);
            System.out.print("\nWrite age of " + a + ":");
            a.setAge(scan.nextInt());
            scan.nextLine();
            int age = a.getAge();
            typeOfAnimal.put(name, a);
            agesOfAnimals.put(name, age);

    }
    public static void listOfAnimalsAndSound(ArrayList<Animal> animals) {
        System.out.println("List of animals with their sounds: ");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Type: " + animals.get(i) + " Name: " + animals.get(i).getName() + " Sound: " + animals.get(i).speak());

        }

    }
    public static void listOfAnimalsWithTypes(HashMap<String, Animal> typeOfAnimal) {
        System.out.println("List of animals with their type: ");
        for (String i : typeOfAnimal.keySet()) {
            System.out.println("Name: " + i + " Type: " + typeOfAnimal.get(i));
        }
    }
    public static void uniqueNamesOfAnimals(HashSet<String> names) {
        System.out.println("List of unique names of animals: ");
            System.out.println("Name: " + names);

    }
    public static void listOfAnimalsWithAges(HashMap<String, Integer> agesOfAnimals) {
        System.out.println("List of animals with their ages: ");
        for (String name : agesOfAnimals.keySet()) {
                System.out.println("Name: " + name + " Age: " + agesOfAnimals.get(name));

        }
    }
    public static void printOneAction(Scanner scan) {
        while (true) {
            System.out.println("Enter \"back\" to back in the menu");
            String back = scan.nextLine();
            if (back.equalsIgnoreCase("back"))
                break;
            else
                System.out.println("Invalid action pls try again");
        }
    }
}


















































