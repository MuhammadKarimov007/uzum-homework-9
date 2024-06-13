package animals;

import soundinterface.SoundProducable;

public class Dog implements SoundProducable {

    @Override
    public void makeNoise() {
        System.out.print("Attention, students. This is the voice of a dog: ");
        System.out.println("voww-voww");
    }
}
