package ss25.B4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MediaAdapter adapter = new MediaAdapter();
        adapter.play("mp4", "nhac mp4");
        adapter.play("vlc", "nhac vcl");
    }
}
