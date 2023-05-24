
import java.util.Arrays;
public class ArraysExercises {
    public static Person[] addPerson(Person[] placeHolder, Person addedPerson) {
        Person[] morePeople = Arrays.copyOf(placeHolder, placeHolder.length+1);
        morePeople[morePeople.length-1] = addedPerson;
        return morePeople;
    }


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person Connie = new Person("Kendra");
        Person Gina = new Person("Kayla");
        Person Tasha = new Person("Lisa");
        Person Tammy = new Person("April");

        Person[] people = new Person[3];
        people[0] = Connie;
        people[1] = Gina;
        people[2] = Tasha;
        people[] addedPeople = addPerson(people, Tammy);

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
