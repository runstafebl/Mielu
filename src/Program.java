public class Program {
    public static void main(String[] args) {
        Person Alex = new Person();
        Alex.Name = "Alexandru";
        Alex.age = 20;
        Alex.height = 210;
        Alex.stamina = 200;


        System.out.println(Alex.Name + " are " + Alex.age + " de ani ");

        Alex.run();
        Alex.run();
        Alex.run();
        System.out.println(Alex.Name + " are energia " + Alex.stamina);
        Alex.sleep();
        System.out.println(Alex.Name + " are energia " + Alex.stamina);

        if(Alex.isMajor()) {
            System.out.println(Alex.Name + " Drinks beer");
        }

        Dog Rex = new Dog();
        Rex.size = 24;

        Rex.bark();
        ;


            }

        }

