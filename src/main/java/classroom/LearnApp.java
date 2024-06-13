package classroom;

import animals.Cat;
import animals.Dog;
import animals.Lion;
import animals.RoboDog;
import soundinterface.SoundProducable;

import java.util.ArrayList;
import java.util.List;

public class LearnApp {
    public static void main(String[] args) {
        List<SoundProducable> animalsToLearn = new ArrayList<>(
                List.of(
                        new Cat(),
                        new Dog(),
                        new RoboDog(),
                        new Lion()
                )
        );

        LearnApp.animalSound(animalsToLearn);
    }

    public static void animalSound(List<SoundProducable> animals) {
        for (SoundProducable animal : animals) {
            animal.makeNoise();
        }
    }
}
