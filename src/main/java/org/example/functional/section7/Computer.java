package org.example.functional.section7;

import java.util.Optional;

public class Computer {

    private Optional<Soundcard> soundcard;

    public Optional<Soundcard> getSoundcard() {
        return this.soundcard;
    }
}
