import java.util.ArrayList;

public class AminoAcid
{
    // ATTRIBUTES
    private String fullName = " ";
    private String abbreviation = "";
    private ArrayList<String> codons = new ArrayList<String>();

    // CONSTRUCTORS
    public AminoAcid() {}

    public AminoAcid(String fullName, String abbreviation, ArrayList<String> codons)
    {
        this.fullName = fullName;
        this.abbreviation = abbreviation;
        this.codons = codons;
    }

    // GETTERS
    public String getFullName()
    {
        return fullName;
    }

    public String getAbbreviation()
    {
        return abbreviation;
    }

    public ArrayList<String> getCodons()
    {
        return codons;
    }

    // toString, equals, and clone methods
    public String toString()
    {
        String str = "The codons for " + fullName + "(" + abbreviation + ")" + " are: " + String.join(" ", codons);
        return str;
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
                && this.abbreviation == aminoAcidTest.abbreviation
                && this.codons == aminoAcidTest.codons;
    }

    public AminoAcid clone()
    {
        return new AminoAcid(fullName, abbreviation, codons);
    }
}
