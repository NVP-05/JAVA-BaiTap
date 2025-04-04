package ss25.B4;

class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer AdvancedMediaPlayer;

    public MediaAdapter() {
        AdvancedMediaPlayer = new AdvancedMediaPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp4")) {
            AdvancedMediaPlayer.playMp4(fileName);
        } else if (audioType.equals("vlc")) {
            AdvancedMediaPlayer.playVlc(fileName);
        }
    }

}
