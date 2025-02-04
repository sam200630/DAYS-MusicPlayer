package edu.unisabana.dyas.patterns.utils;

public class AdvancedAudioPlayerAdapter implements AudioPlayer {
    private AdvancedAudioPlayer advancedAudioPlayer;

    public AdvancedAudioPlayerAdapter() {
        this.advancedAudioPlayer = new AdvancedAudioPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Reproduciendo archivo MP3: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedAudioPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedAudioPlayer.playVlc(fileName);
        } else {
            System.out.println("Formato no soportado: " + audioType);
        }
    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
}
