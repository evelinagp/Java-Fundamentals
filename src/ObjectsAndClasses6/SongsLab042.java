package ObjectsAndClasses6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongsLab042 {

    private String typeList;
    private String name;
    private String time;

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTypeList() {
        return typeList;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<SongsLab042> songs = new ArrayList();
        for (int i = 0; i < n; i++) {
            String[] songData = scanner.nextLine().split("_");
            String typeList = songData[0];
            String name = songData[1];
            String time = songData[2];

            SongsLab042 song = new SongsLab042();
            songs.add(song);
        }
        String type = scanner.nextLine();
        if (type.equals("all")) {
            for (SongsLab042 song : songs) {
                System.out.println(song.getName());
            }
        }else{
            for (SongsLab042 song : songs) {
                if (song.getTypeList().equals(type)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}

