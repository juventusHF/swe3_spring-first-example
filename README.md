# First Spring Example

Check how the Spring dependency is declared in `pom.xml`.

In `App.java`, replace the main method with the following code:

     public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
         PetStore petStore = context.getBean(PetStore.class);
         System.out.println(petStore.loadAllPets());
     }

This will set up the Spring application context and load the Spring beans from `services.xml`.

Add the following bean definition to `src/main/resources/services.xml`:

    <bean id="petStore" class="ch.juventus.example.PetStoreImpl"/>
       
Now run the `main` method in `App`. This should print out a list of pets.