public class Animal {
    public int energy;

    public Animal(){
        //System.out.println("This object is an animal!");

    }

    public void makeSound(){
        energy = energy-3;
    }
    public void eatFood(){
        energy = energy+5;
    }
    public void sleep(){
        energy = energy+10;
    }


}

class tiger extends Animal{
    public int energy;
    public String animalName;
    static int count;
    public tiger(String name, int a){
        //System.out.println("This object is a tiger!");
        animalName = name;
        energy = a;
        count++;
    }

    public void makeSound(){

        energy = energy-8;
        System.out.println(animalName + " " + energy);
    }
    public void eatFood(String food){
        if(food.equals("grain")){
            System.out.println("tiger cannot eat grain!");
        }
        else
            energy = energy+5;
    }
    public void sleep(){
        energy = energy+5;
    }
    public void getCount(){
        System.out.println("The tiger count is: " + count);
    }

}

class monkey extends Animal{
    public int energy;
    public String animalName;
    static int count;
    public monkey(String name, int en){
        //System.out.println("This object is an monkey!");
        animalName = name;
        energy = en;
        count++;
    }

    public void makeSound(){
        energy = energy-4;
        System.out.println(animalName + " " + energy);
    }
    public void eatFood(){
        energy = energy+2;
    }
    public void sleep(){
        energy = energy+5;
    }
    public void play(){
        if (energy<8) {
            System.out.println("Monkey is too tired!");
        }
        else{
            System.out.println("Oooo Oooo Oooo");
            energy = energy-8;
        }
    }
    public void getCount(){
        System.out.println("The monkey count is: " + count);
    }
}

class snake extends Animal{
    public int energy;
    public String animalName;
    static int count;
    public snake(String name, int en){
        //System.out.println("This object is an snake!");
        animalName = name;
        energy = en;
        count++;
    }

    public void makeSound(){
        energy = energy-3;
        System.out.println(animalName + " " + energy);
    }

    public void eatFood(){
        energy = energy+5;
    }
    public void sleep(){
        energy = energy+10;
    }
    public void getCount(){
        System.out.println("The snake count is: " + count);
    }

}
