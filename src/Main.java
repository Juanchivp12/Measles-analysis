import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

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
     */
    public static void fileReader(String fileName) throws IOException
    {
        int wholeRF = 1;
        int specificAminoAcid = 2;
        Scanner kbd = new Scanner(System.in);

        File file = new File(fileName);
        Scanner inFile = new Scanner(file);

        while (inFile.hasNext())
        {
            String str = inFile.nextLine();
            String[] tokens = str.split(",");

            System.out.print("Want to see the whole RF or only a specific amino acid? (1, 2) ");
            int choice = kbd.nextInt();
            if (choice == wholeRF)
            {
                for (String s : tokens)
                {
                    System.out.print(s + " ");
                }
            }
            else if (choice == specificAminoAcid)
            {
                System.out.println("What amino acid are you looking for? (Enter a letter) ");
                String aminoChoice = kbd.nextLine();
                if (aminoChoice.equalsIgnoreCase("A"))
                {
                    ArrayList<String> codonsA = new ArrayList<String>();
                    codonsA.add("GCT");
                    codonsA.add("GCC");
                    codonsA.add("GCA");
                    codonsA.add("GCG");
                    AminoAcid AminoAcidA = new AminoAcid("Alanine", "Ala", codonsA);
                }
            }
        }
        inFile.close();
    }
  }
