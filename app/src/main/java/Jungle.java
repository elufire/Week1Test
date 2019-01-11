import java.util.ArrayList;
import java.util.List;

public class Jungle {


public static void main(String args[]){
    Animal shrew = new Animal();
    tiger tiger1 = new tiger("Tiger1", 10);
    //tiger1.incrementCount();
    tiger tiger2 = new tiger("Tiger2", 10);
    tiger tiger3 = new tiger("Tiger3", 10);
    monkey monkey1 = new monkey("Monkey1",5);
    monkey monkey2 = new monkey("Monkey2", 20);
    snake snake1 = new snake("Snake1",20);

    tiger1.eatFood();

    List<Animal> animalList = new ArrayList <>();

    animalList.add(tiger1);
    animalList.add(tiger2);
    animalList.add(tiger3);
    animalList.add(monkey1);
    animalList.add(monkey2);
    animalList.add(snake1);



    for(Animal a: animalList){
        a.sleep();
    }
    tiger1.eatFood("grain");
    tiger2.eatFood("meat");
    snake1.eatFood();
    monkey1.play();
    System.out.println("This is a soundoff: ");
    for(Animal a: animalList){

        a.makeSound();
    }
    tiger1.getCount();
    monkey1.getCount();
    snake1.getCount();
    //System.out.println(tiger1.gettigerCount());
    //System.out.print(tiger1.energy);
}


/*
public static void soundOff(tiger tiger1){
*/

}

