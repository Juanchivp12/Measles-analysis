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
      ArrayList<AminoAcid> aminoAcidList = readFromAminoAcidTable();
      ArrayList<String> codonsArrayListRF1 = readCodonsFromFile("measlesSequenceRF1.csv");
      ArrayList<String> codonsArrayListRF2 = readCodonsFromFile("measlesSequenceRF2.csv");
      ArrayList<String> codonsArrayListRF3 = readCodonsFromFile("measlesSequenceRF3.csv");

      findATG(codonsArrayListRF1);
      printAllAminosToFile(aminoAcidList);

      AminoAcid aminoAcid = aminoAcidList.get(0);
      countCodons(aminoAcid);

      findATG(codonsArrayListRF1);

      do
      {
        System.out.print("Which RF file would you like to scan? (1, 2, 3) ");
        fileChoice = kbd.nextInt();
      } 
      while (fileChoice < RF1 || fileChoice > RF3);

      switch (fileChoice)
      {
        case RF1:
            lookForAcidFromList();
            break;
        case RF2:
            lookForAcidFromList();
            break;
        
        case RF3:
            lookForAcidFromList();
            break;
      }
    }

    /**
     * This method makes an array of AminoAcids using the aminoAcidTable file
     * @return the array list of amino acids
     * @throws IOException
     */
    public static ArrayList<AminoAcid> readFromAminoAcidTable() throws IOException
    {
        File file = new File("aminoAcidTable.csv");
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
            String abbreviation = tokens[2];

            // Make array list for codons and read them from file and add them to it
            ArrayList<String> codons = new ArrayList<String>();
            for (int i = 3; i < tokens.length; i++)
            {
                codons.add(tokens[i]);
            }

            // Make an instance of the AminoAcid class and add information from aminoAcidTable file
            acidList.add(new AminoAcid(name, abbreviation, codons));
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
     * This method asks the user to enter a letter and prints out the amino acid that contains that letter
     * @throws IOException
     */
    public static void lookForAcidFromList() throws IOException
    {
        ArrayList<AminoAcid> aminoAcidList = readFromAminoAcidTable();
        Scanner kbd = new Scanner(System.in);

        System.out.print("Which Amino Acid would you like to see? (Enter its one letter abbreviation) ");
        String aminoAcidLetter = kbd.nextLine().toUpperCase();

        for (AminoAcid amino : aminoAcidList)
        {
            if (aminoAcidLetter.equals(amino.getAbbreviation()))
            {
                System.out.println(amino.toString());
            }
        }
    }

    /**
     * This method prints all the amino acids into an output file
     * @param aminoAcids The array list of amino acids
     * @throws IOException
     */
    public static void printAllAminosToFile(ArrayList<AminoAcid> aminoAcids) throws IOException
    {
        PrintWriter outfile = new PrintWriter("RFAminoAcidsOutput.txt");

        for (AminoAcid acids : aminoAcids)
        {
            outfile.println(acids.toString());
        }
        outfile.close();
    }

    /**
     * This method finds the ATGs and counts amino acids from it
     * @param codons an arraylist
     * @return the number of codons from start codon
     */
    public static void findATG(ArrayList<String> codons)
    {
        int position = 0;
        boolean start = true;
        String str = "ATG";

        for (String cod : codons)
        {
            position++;
            
            if (cod.equals("ATG"))
            {
                System.out.println("Start codon found at position: " + position);
            }
            if (cod.equals("TAA") || cod.equals("TGA") || cod.equals("TAG"))
            {
                System.out.println("Stop codon found at position: " + position);
            }
        }
        // THIS METHOD IS NOT READY YET

    }
      public static void countCodons(AminoAcid aminoAcid)
      {
          int count = 0;
          if (aminoAcid.getAbbreviation().equals(aminoAcid.getAbbreviation()))
          {
              System.out.println("Found!");
              count++;
          }
      }
  }