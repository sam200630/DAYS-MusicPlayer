package edu.unisabana.dyas.patterns.utils;

public class AdvancedAudioPlayerAdapter implements AudioPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            System.out.println("Reproduciendo archivo MP4: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            System.out.println("Reproduciendo archivo VLC: " + fileName);
        } else {
            System.out.println("Formato no soportado en el adaptador: " + audioType);
        }
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo reproducción desde el adaptador");
    }
}