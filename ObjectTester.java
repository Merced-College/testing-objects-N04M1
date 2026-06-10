//Naomi Rodriguez
//6/9/2026
//Object Testing Class for my dog and cat objects

public class ObjectTester {


    public static void main (String[] args) {

        
        // A1: Create a Dog with no constructors defined.
        Dog dog1 = new Dog();

        // A2: Print the object directly.
        System.out.println("Printing dog1 directly:");
        System.out.println(dog1);

        //test of data variables as public 

        Dog dog2 = new Dog();
        System.out.println("\nDefaults for d1 fields (before any assignment):");
        System.out.println("name = " + dog2.getName());   // expected: null
        System.out.println("age = " + dog2.getAge());     // expected: 0
        System.out.println("breed = " + dog2.getBreed()); // expected: null

        //test the constructors for the default and non-default --dv is still public
        Dog d2 = new Dog(); // uses default constructor values
        System.out.println("\nd2 after default constructor:");
        System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());

        Dog d3 = new Dog("Rex", 4, "Collie"); // uses parameterized constructor
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println("name = " + d3.getName() + ", age = " + d3.getAge() + ", breed = " + d3.getBreed());


        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        //step 10
        System.out.println("\nMutating public fields directly:");
        d3.setAge(5);//d3.age = 5;      // direct write
        d3.setName("Max");//d3.name = "Max"; // direct write
        System.out.println("After mutation, d3 = " + d3); // uses toString()
        

        System.out.println("\nMutating via setters after making fields private:");
        d3.setAge(6);
        d3.setName("Maxwell");
        d3.setBreed("Border Collie");
        System.out.println("d3 age via getter = " + d3.getAge());
        System.out.println("d3 now = " + d3);

        //Start of cat
        System.out.println("\nCat Classification");
        //Making a default cat object
        Cat cat1 = new Cat();

        //make a cat object with given data
        Cat cat2 = new Cat("Stinky", true, "Short hair");
        System.out.println("Cat object 1" + cat1);
        System.out.println("Cat object 2" + cat2);


    }// end of main

}//end of class