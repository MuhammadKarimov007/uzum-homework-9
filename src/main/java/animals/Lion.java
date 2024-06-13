package animals;

import soundinterface.SoundProducable;

public class Lion implements SoundProducable {
    @Override
    public void makeNoise() {
        System.out.print("Attention, students. This is the voice of a lion: ");
        System.out.println("Arr-arr");
    }
}
