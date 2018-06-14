import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

class RoomIO {

    public static Room[] read(String fileName, int totalLines, Boolean skipFirst) {
        Room[] temp = new Room[totalLines];
        int i = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String currentLine;

            while((currentLine = br.readLine()) != null && totalLines > 0) {
                if(!skipFirst) {
                    temp[i] = new Room(currentLine);
                    totalLines--;
                    i++;
                } else {
                    skipFirst = false;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return temp;
    }

    public static void write(String fileName, Room[] allData) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for(int i = 0; i < allData.length; i++) {
                printWriter.println(allData[i].dataInLine());
            }
            
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}