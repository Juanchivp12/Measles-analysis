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
      } while (fileChoice < RF1 || fileChoice > RF3);

      switch (fileChoice)
      {
        case RF1: fileReader("measlesSequenceRF1.csv"); break;

        case RF2: fileReader("measlesSequenceRF2.csv"); break;
        
        case RF3: fileReader("measlesSequenceRF3.csv"); break;
      }
    }

      // Initialize all the amino acids
      public static void initializeAminoAcids()
      {
          ArrayList<String> codonsA = new ArrayList<String>();
          codonsA.add("GCT");
          codonsA.add("GCC");
          codonsA.add("GCA");
          codonsA.add("GCG");
          SpecificAminoAcid aminoAcidA = new SpecificAminoAcid("Alanine", "Ala", codonsA, "A");

          ArrayList<String> codonsR = new ArrayList<String>();
          codonsR.add("CGT");
          codonsR.add("CGC");
          codonsR.add("CGA");
          codonsR.add("CGG");
          codonsR.add("AGA");
          codonsR.add("AGG");
          SpecificAminoAcid aminoAcidR = new SpecificAminoAcid("Arginine", "Arg", codonsR, "R");

          ArrayList<String> codonsN = new ArrayList<String>();
          codonsN.add("AAT");
          codonsN.add("AAC");
          SpecificAminoAcid aminoAcidN = new SpecificAminoAcid("Asparagine", "Asn", codonsN, "N");

          ArrayList<String> codonsD = new ArrayList<String>();
          codonsD.add("GAT");
          codonsD.add("GAC");
          SpecificAminoAcid aminoAcidD = new SpecificAminoAcid("AsparticAcid", "Asp", codonsD, "D");

          ArrayList<String> codonsC = new ArrayList<String>();
          codonsC.add("TGT");
          codonsC.add("TGC");
          SpecificAminoAcid aminoAcidC = new SpecificAminoAcid("Cysteine", "Cys", codonsC, "C");

          ArrayList<String> codonsQ = new ArrayList<String>();
          codonsQ.add("CAA");
          codonsQ.add("CAG");
          SpecificAminoAcid aminoAcidQ = new SpecificAminoAcid("Glutamine", "Gln", codonsQ, "Q");

          ArrayList<String> codonsE = new ArrayList<String>();
          codonsE.add("GAA");
          codonsE.add("GAG");
          SpecificAminoAcid aminoAcidE = new SpecificAminoAcid("GlutamicAcid", "Glu", codonsE, "E");

          ArrayList<String> codonsG = new ArrayList<String>();
          codonsG.add("GGT");
          codonsG.add("GGC");
          codonsG.add("GGA");
          codonsG.add("GGG");
          SpecificAminoAcid aminoAcidG = new SpecificAminoAcid("Glycine", "Gly", codonsG, "G");

          ArrayList<String> codonsH = new ArrayList<String>();
          codonsH.add("CAT");
          codonsH.add("CAC");
          SpecificAminoAcid aminoAcidH = new SpecificAminoAcid("Histidine", "His", codonsH, "H");

          ArrayList<String> codonsI = new ArrayList<String>();
          codonsI.add("ATT");
          codonsI.add("ATC");
          codonsI.add("ATA");
          SpecificAminoAcid aminoAcidI = new SpecificAminoAcid("Isoleucine", "Ile", codonsI, "I");

          ArrayList<String> codonsL = new ArrayList<String>();
          codonsL.add("TTA");
          codonsL.add("TTG");
          codonsL.add("CTT");
          codonsL.add("CTC");
          codonsL.add("CTA");
          codonsL.add("CTG");
          SpecificAminoAcid aminoAcidL = new SpecificAminoAcid("Leucine", "Leu", codonsL, "L");

          ArrayList<String> codonsK = new ArrayList<String>();
          codonsK.add("AAA");
          codonsK.add("AAG");
          SpecificAminoAcid aminoAcidK = new SpecificAminoAcid("Lysine", "Lys", codonsK, "K");

          ArrayList<String> codonsM = new ArrayList<String>();
          codonsM.add("ATG");
          SpecificAminoAcid aminoAcidM = new SpecificAminoAcid("Methionine", "Met", codonsM, "M");

          ArrayList<String> codonsF = new ArrayList<String>();
          codonsF.add("TTT");
          codonsF.add("TTC");
          SpecificAminoAcid aminoAcidF = new SpecificAminoAcid("Phenylalanine", "Phe", codonsF, "F");

          ArrayList<String> codonsP = new ArrayList<String>();
          codonsP.add("CCT");
          codonsP.add("CCC");
          codonsP.add("CCA");
          codonsP.add("CCG");
          SpecificAminoAcid aminoAcidP = new SpecificAminoAcid("Proline", "Pro", codonsP, "P");

          ArrayList<String> codonsS = new ArrayList<String>();
          codonsS.add("TCT");
          codonsS.add("TCC");
          codonsS.add("TCA");
          codonsS.add("TCG");
          codonsS.add("AGT");
          codonsS.add("AGC");
          SpecificAminoAcid aminoAcidS = new SpecificAminoAcid("Serine", "Ser", codonsS, "S");

          ArrayList<String> codonsT = new ArrayList<String>();
          codonsT.add("ACT");
          codonsT.add("ACC");
          codonsT.add("ACA");
          codonsT.add("ACG");
          SpecificAminoAcid aminoAcidT = new SpecificAminoAcid("Threonine", "Thr", codonsT, "T");

          ArrayList<String> codonsW = new ArrayList<String>();
          codonsW.add("TGG");
          SpecificAminoAcid aminoAcidW = new SpecificAminoAcid("Tryptophan", "Trp", codonsW, "W");

          ArrayList<String> codonsY = new ArrayList<String>();
          codonsY.add("TAT");
          codonsY.add("TAC");
          SpecificAminoAcid aminoAcidY = new SpecificAminoAcid("Tyrosine", "Tyr", codonsY, "Y");

          ArrayList<String> codonsV = new ArrayList<String>();
          codonsV.add("GTT");
          codonsV.add("GTC");
          codonsV.add("GTA");
          codonsV.add("GTG");
          SpecificAminoAcid aminoAcidV = new SpecificAminoAcid("Valine", "Val", codonsV, "V");

          ArrayList<String> codonsStop = new ArrayList<String>();
          codonsStop.add("TAG");
          codonsStop.add("TGA");
          codonsStop.add("TAA");
          SpecificAminoAcid aminoAcidStop = new SpecificAminoAcid("Stop", "Ter", codonsStop, "*");
      }

    /**
     * This method reads through any of the 3 reading frames
     * @param fileName a String representing a reading frame
     */
    public static void fileReader(String fileName) throws IOException
    {
        initializeAminoAcids();
        System.out.println(aminoAcidsA);

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
            else if (choice == aminoAcid)
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
