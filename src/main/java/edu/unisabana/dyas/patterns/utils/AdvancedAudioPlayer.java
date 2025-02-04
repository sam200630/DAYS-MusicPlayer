package edu.unisabana.dyas.patterns.utils;

public class AdvancedAudioPlayer implements AudioPlayer {
    private AdvancedAudioPlayerAdapter adapter;

    public AdvancedAudioPlayer() {
        this.adapter = new AdvancedAudioPlayerAdapter();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Reproduciendo archivo MP3: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            adapter.play(audioType, fileName);
        } else {
            System.out.println("Formato no soportado: " + audioType);
        }
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo reproducción");
    }
}
