
package command.pattern.models;

/**
 * @author aschneider
 * @since 19.06.2018
 */

public class Stereo {

    int volume = 0;

    public void on() {
        System.out.println("Turn on stereo");
    }

    public void off() {
        System.out.println("Turn off stereo");
    }

    public void setCd() {
        System.out.println("Set stereo to cd");
    }

    public void setDvd() {
        System.out.println("Set stereo to dvd");
    }

    public void setVolume(int vol) {
        volume = vol;
        System.out.println("Set the voulume to " + vol);
    }
}
