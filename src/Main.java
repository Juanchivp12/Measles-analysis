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

      // This array list contains the contents of aminoAcidTable.csv
      ArrayList<AminoAcid> aminoAcidList = readFromAminoAcidTable("aminoAcidTable.csv");
      ArrayList<String> codonsArrayListRF1 = readCodonsFromFile("measlesSequenceRF1.csv");
      ArrayList<String> codonsArrayListRF2 = readCodonsFromFile("measlesSequenceRF2.csv");
      ArrayList<String> codonsArrayListRF3 = readCodonsFromFile("measlesSequenceRF3.csv");

      do
      {
        System.out.print("Which RF file would you like to scan? (1, 2, 3) ");
        fileChoice = kbd.nextInt();
      } 
      while (fileChoice < RF1 || fileChoice > RF3);

      switch (fileChoice)
      {
        case RF1:
        break;

        case RF2:
        break;
        
        case RF3:
        break;
      }
    }

    /**
     * This method makes an array of AminoAcids using the aminoAcidTable file
     * @return the array list of amino acids
     * @throws IOException
     */
    public static ArrayList<AminoAcid> readFromAminoAcidTable(String filename) throws IOException
    {
        File file = new File(filename);
        Scanner inFile = new Scanner(file);

        // Skip first line of the file
        inFile.nextLine();

        ArrayList<AminoAcid> acidList = new ArrayList<AminoAcid>();

        while (inFile.hasNext())
        {
            // Read items from file and extract tokens
            String str = inFile.nextLine();
            String[] tokens = str.split(",");

            // Assign variables the values of tokens at specific positions
            String name = tokens[0];
            String threeLetter = tokens[1];
            String oneLetter = tokens[2];

            // Make array list for codons and read them from file and add them to it
            ArrayList<String> codons = new ArrayList<String>();
            for (int i = 3; i < tokens.length; i++)
            {
                codons.add(tokens[i]);
            }

            // Make an instance of the AminoAcid class and add information from aminoAcidTable file
            AminoAcid acid = new AminoAcid(name, threeLetter, oneLetter, codons);
            acidList.add(acid);
        }
        inFile.close();

        return acidList;
    }

    /**
     * This method reads the codons from a file chosen by the user and adds each codon into an array list
     * @param filename a String. file name chosen by user
     * @return the array list of codons
     * @throws IOException
     */
    public static ArrayList<String> readCodonsFromFile(String filename) throws IOException
    {
        ArrayList<String> codons = new ArrayList<String>();
        File file = new File(filename);
        Scanner inFile = new Scanner(file);

        while (inFile.hasNext())
        {
            String str = inFile.nextLine();
            String[] tokens = str.split(",");

            for (String s : tokens)
            {
                codons.add(s);
            }
        }
        inFile.close();

        return codons;
    }

    /**
     * This method reads through any of the 3 reading frames
     * @param fileName a String representing a reading frame
     */
    public static void fileReader(String fileName) throws IOException
    {

        int wholeRF = 1;
        int aminoAcid = 2;
        Scanner kbd = new Scanner(System.in);

        File file = new File(fileName);
        Scanner inFile = new Scanner(file);

        while (inFile.hasNext())
        {
            String str = inFile.nextLine();
            String[] tokens = str.split(",");

            System.out.print("Want to see the whole RF (1) or only a specific amino acid (2)? ");
            int choice = kbd.nextInt();
            if (choice == wholeRF)
            {
                for (String s : tokens)
                {
                    System.out.print(s + " ");
                }
            }
            else
            {
                System.out.println("What amino acid are you looking for? (Enter a letter) ");
                String aminoChoice = kbd.next().toUpperCase();

                switch (aminoChoice)
                {
                    case "A":
                        System.out.println(AminoAcid.getCodons());
                        break;

                    case "R":

                        break;

                    case "N":

                        break;

                    case "D":

                        break;

                    case "C":

                        break;

                    case "Q":

                        break;

                    case "E":

                        break;

                    case "G":

                        break;

                    case "H":

                        break;

                    case "I":

                        break;

                    case "L":

                        break;

                    case "K":

                        break;

                    case "M":

                        break;

                    case "F":

                        break;

                    case "P":

                        break;

                    case "S":

                        break;

                    case "T":

                        break;

                    case "W":

                        break;

                    case "Y":

                        break;

                    case "V":

                        break;

                    case "*":

                        break;
                }
            }
        }
        inFile.close();
    }
  }
