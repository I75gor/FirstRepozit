package ClassTask1; //alt+inter - запуск
                    // тест этап given, when, than

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalFactoryTest {
    @Test
    public void testCreateAnimal_isDog(){
        AnimalType a = AnimalType.DOG;
        Animal b = AnimalFactory.createAnimal(a);
        assertTrue(b instanceof Dog);
    }
    @Test
    public void testCreateAnimal_isCat(){
        AnimalType a = AnimalType.CAT;
        Animal b = AnimalFactory.createAnimal(a);
        assertTrue(b instanceof Cat);
    }
    @Test
    public void testCreateAnimal_isBird(){
        AnimalType a = AnimalType.BIRD;
        Animal b = AnimalFactory.createAnimal(a);
        assertTrue(b instanceof Bird);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCreateAnimal_withIllegalArgumentExeption(){
        AnimalType a = AnimalType.SSS;
        Animal b = AnimalFactory.createAnimal(a);

    }

}