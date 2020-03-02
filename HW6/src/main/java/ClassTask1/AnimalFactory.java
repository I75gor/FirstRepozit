package ClassTask1;

public class AnimalFactory {
        static Animal createAnimal(AnimalType type){
            switch(type){
                case DOG:
                    return new Dog();
                case CAT:
                    return new Cat();
                case BIRD:
                    return new Bird();
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

