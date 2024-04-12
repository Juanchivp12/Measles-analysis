import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
  {
    public static void main(String[] args) throws IOException
    {
      final int RF1 = 1;
      final int RF2 = 2;
      final int RF3 = 3;

      int fileChoice;
      Scanner kbd = new Scanner(System.in);

      do
      {
      System.out.print("Which RF file would you like to scan? (1, 2, 3) ");
      fileChoice = kbd.nextInt();
      }
      while (fileChoice < RF1 || fileChoice > RF3);

      switch (fileChoice)
      {
        case RF1:
        fileReader("measlesSequenceRF1.csv");
        break;

        case RF2:
        fileReader("measlesSequenceRF2.csv");
        break;
        
        case RF3:
        fileReader("measlesSequenceRF3.csv");
        break;
      }
    }

    /**
     * This method reads through any of the 3 reading frames
     * @param fileName a String representing a reading frame
     * @throws IOException
     */
    public static void fileReader(String fileName) throws IOException
    {
        File file = new File(fileName);
        Scanner inFile = new Scanner(file);

        while (inFile.hasNext())
        {
            String str = inFile.nextLine();
            String[] tokens = str.split(",");
        }
        inFile.close();
    }
  }
