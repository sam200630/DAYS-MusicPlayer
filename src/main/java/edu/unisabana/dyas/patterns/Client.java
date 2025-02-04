package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AudioPlayer;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayerAdapter;

public class Client {
    public static void main(String[] args) {
        AudioPlayer player = new AdvancedAudioPlayerAdapter();

        player.play("mp3", "cancion.mp3");
        player.play("mp4", "video.mp4");
        player.play("vlc", "pelicula.vlc");
        player.play("wav", "sonido.wav"); // Este formato no está soportado

        player.stop();
    }
}
