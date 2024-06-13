package animals;

import soundinterface.SoundProducable;

public class RoboDog implements SoundProducable {
    @Override
    public void makeNoise() {
        System.out.print("Attention, students. This is the voice of a roboDog: ");
        System.out.println("Djik-djik");
    }
}
