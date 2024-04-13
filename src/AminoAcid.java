import java.util.ArrayList;

public class AminoAcid
{
    // ATTRIBUTES
    private String fullName = " ";
    private String threeLetterAbbreviation = " ";
    private String oneLetterAbbreviation = "";
    private static ArrayList<String> codons = new ArrayList<String>();

    // CONSTRUCTORS
    public AminoAcid() {}

    public AminoAcid(String fullName, String threeLetterAbbreviation, String oneLetterAbbreviation, ArrayList<String> codons)
    {
        this.fullName = fullName;
        this.threeLetterAbbreviation = threeLetterAbbreviation;
        this.oneLetterAbbreviation = oneLetterAbbreviation;
        this.codons = codons;
    }

    // SETTERS
    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public void setThreeLetterAbbreviation(String threeLetterAbbreviation)
    {
        this.threeLetterAbbreviation = threeLetterAbbreviation;
    }

    public void setOneLetterAbbreviation(String threeLetterAbbreviation)
    {
        this.oneLetterAbbreviation = oneLetterAbbreviation;
    }

    public void setCodons(ArrayList<String> codons)
    {
        this.codons = codons;
    }

    // GETTERS
    public String getFullName()
    {
        return fullName;
    }

    public String getThreeLetterAbbreviation()
    {
        return threeLetterAbbreviation;
    }

    public String getOneLetterAbbreviation()
    {
        return oneLetterAbbreviation;
    }

    public static ArrayList<String> getCodons()
    {
        return codons;
    }

    // toString, equals, and clone methods
    public String toString()
    {
        return "";
    }

    /**
     * I think we can use this method to analyze the files and return a formatted String with everything we need?
     * @return
     */
    public String analyzeCodons()
    {
        String str = "";
        return str;
    }

    public boolean equals(AminoAcid aminoAcidTest)
    {
        return this.fullName == aminoAcidTest.fullName
                && this.threeLetterAbbreviation == aminoAcidTest.threeLetterAbbreviation
                && this.oneLetterAbbreviation == aminoAcidTest.oneLetterAbbreviation
                && this.codons == aminoAcidTest.codons;
    }

    public AminoAcid clone()
    {
        return new AminoAcid(fullName, threeLetterAbbreviation, oneLetterAbbreviation, codons);
    }


}
