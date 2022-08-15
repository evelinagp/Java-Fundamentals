package ExamPreparation;

import java.util.*;

public class ThePianistExam01Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> pieces = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            List<String> currentPiece = new ArrayList<>();
            String input = scanner.nextLine();
            String[] tokens = input.split("\\|");
            String piece = tokens[0];
            String composer = tokens[1];
            String key = tokens[2];
            currentPiece.add(composer);
            currentPiece.add(key);
            pieces.put(piece, currentPiece);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] tokens = command.split("\\|");

            String commandName = tokens[0];
            switch (commandName) {
                case "Add":
//•	Add|{piece}|{composer}|{key} .You need to add the given piece with the information about it to the other pieces
//o	If the piece is already in the collection, print: "{piece} is already in the collection!"
//o	If the piece is not in the collection, print: "{piece} by {composer} in {key} added to the collection!"
                    String piece = tokens[1];
                    String composer = tokens[2];
                    String key = tokens[3];
                    if (pieces.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!%n", piece);
                    } else {
                        List<String> currentComposerAndKey = new ArrayList<>();
                        currentComposerAndKey.add(composer);
                        currentComposerAndKey.add(key);
                        pieces.put(piece, currentComposerAndKey);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                case "Remove":
                    String pieceToRemove = tokens[1];
                    if (pieces.containsKey(pieceToRemove)) {
                        pieces.remove(pieceToRemove);
                        System.out.printf("Successfully removed %s!%n", pieceToRemove);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceToRemove);
                    }
                    break;
                case "ChangeKey":
//	ChangeKey|{piece}|{new key}
//o	If the piece is in the collection, change its key with the given one and print: "Changed the key of {piece} to {new key}!"
//o	If the piece is not in the collection, print: "Invalid operation! {piece} does not exist in the collection."
                    String pieceToChangeKey = tokens[1];
                    String newKey = tokens[2];
                    if (pieces.containsKey(pieceToChangeKey)) {
                        List<String> pieceValues = pieces.get(pieceToChangeKey);
                        String oldKey = pieceValues.get(1);
                        System.out.printf("Changed the key of %s to %s!%n", pieceToChangeKey, newKey);
                        pieceValues.remove(oldKey);
                        pieceValues.add(newKey);

                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceToChangeKey);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : pieces.entrySet()) {
            String piece = entry.getKey();
            String composer = entry.getValue().get(0);
            String key = entry.getValue().get(1);
            System.out.printf("%s -> Composer: %s, Key: %s%n", piece,composer,key);
        }
    }
}
