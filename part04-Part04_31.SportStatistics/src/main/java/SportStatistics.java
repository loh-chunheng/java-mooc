
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        ArrayList<Game> records = readSports(file);
        
        System.out.println("Team:");
        String nameToSearch = scan.nextLine();
        
        int countGame = 0;
        int countWin = 0;
        
        for (Game item: records) {
            if(item.getTeam1().equals(nameToSearch)) {
                countGame ++;
            }
            
            if(item.getTeam2().equals(nameToSearch)) {
                countGame ++;
            }
            
            if(item.winner().equals(nameToSearch)) {
                countWin ++;
            }
        }
        
        System.out.println("Games: " + countGame);
        System.out.println("Wins: " + countWin);
        System.out.println("Losses: " + (countGame - countWin));
        
    }
    
    public static ArrayList<Game> readSports(String file) {
        ArrayList<Game> games = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                
                games.add(new Game(parts[0], parts[1], Integer.valueOf(parts[2]), Integer.valueOf(parts[3])));
                
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return games;
    }

}
