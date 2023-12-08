public class Main {
    public static void main (String[]args){
        Cat thor = new Cat();
        Cat rambo = new Cat();
        
        thor.name= "Thor";
        thor.age= 3;
        thor.breed= "Azul russo";
        thor.color= "Marrom";
        thor.sleep();
        
        rambo.name= "Rambo";
        rambo.age= 4;
        rambo.breed= "Maine Coon";
        rambo.color= "Marrom";
        rambo.play();
    }
}