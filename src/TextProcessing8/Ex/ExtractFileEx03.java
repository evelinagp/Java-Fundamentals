package TextProcessing8.Ex;

import java.util.Scanner;

public class ExtractFileEx03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//       \C:\Internal\training-internal\Template.pptx.split " \"
        //command length-1 -> Template.pptx.split "."
        String path = scanner.nextLine();

        String [] pathParts = path.split("\\\\");
        String lastPart = pathParts [pathParts.length -1];
        String [] command = lastPart.split("\\.");
        String fileName = command [0];
        String extension = command [1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}
