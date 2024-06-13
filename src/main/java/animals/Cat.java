package animals;

import soundinterface.SoundProducable;

public class Cat implements SoundProducable {
    @Override
    public void makeNoise() {
        System.out.print("Attention, students. This is the voice of a cat: ");
        System.out.println("miaw-miaw");
    }
}
