package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.*;

public class Client {
    public static void main(String[] args) {
        AudioPlayer player = new AdvancedAudioPlayer();

        // MP3 se reproduce directamente
        player.play("mp3", "cancion.mp3");

        // MP4 y VLC son manejados por el adaptador
        player.play("mp4", "video.mp4");
        player.play("vlc", "pelicula.vlc");

        // Formato no soportado
        player.play("wav", "audio.wav");

        player.stop();
    }
}
