package ObjectsAndClasses6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongsLab04 {

    private String typeList;
    private String name;
    private String time;

    public void setTypeList(String typeList) {

        this.typeList = typeList;
    }

    public String getTypeList() {

        return typeList;
    }

    public void setTime(String time) {

        this.time = time;
    }

    public String getTime() {

        return time;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numSongs = Integer.parseInt(scanner.nextLine());

        List<SongsLab04> songs = new ArrayList<>();

        for (int i = 0; i < numSongs; i++) {

            String[] data = scanner.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            SongsLab04 song = new SongsLab04();

            song.setName(name);
            song.setTypeList(type);
            song.setTime(time);

            songs.add(song);
        }
        String type = scanner.nextLine();

        if (type.equals("all")) {
            for (SongsLab04 song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (SongsLab04 song : songs) {
                if (song.getTypeList().equals(type)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}






