# Übung zum Spring Framework

Scha nach, wie im `pom.xml` die Abhängigkeit zum Spring Framework deklariert ist.

Ersetze die Main-Methode in `App.java` mit dem folgenden Code:

     public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
         PetStore petStore = context.getBean(PetStore.class);
         System.out.println(petStore.loadAllPets());
     }

Dadurch wird der Spring Application Context initialisiert, welcher die Spring Beans Definitionen aus `services.xml` lädt.
Das `petStore` Bean wird aus dem Container geladen und benutzt.

Dazu muss allerdings die folgende Bean-Definition zu `src/main/resources/services.xml` hinzugefügt werden:

    <bean id="petStore" class="ch.juventus.example.PetStoreImpl"/>
       
Jetzt kannst Du die Main-Methode in `App` ausführen. Dies wird eine Liste von Pets ausgeben.