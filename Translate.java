/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc450_assign1_lifedogma;

/**
 *
 * @author alexanderdouglas
 */
public class Translate 
{
    int counter;
    int templateRNAsize;
    char[] templateCodon;
    String codon;
    String templateRNA;
    String proteinSequence;
    
    final AminoAcidID protein;
    
    public Translate()
    {   
        counter = 3;
        templateRNAsize = 0;
        templateCodon = null;
        codon = "";
        templateRNA = "";
        proteinSequence = "";
        protein = new AminoAcidID();
    }
    public Translate(String templateRNA)
    {
        counter = 3;
        templateRNAsize = templateRNA.length();
        templateCodon = null;
        codon = "";
        proteinSequence = "";
        this.templateRNA = templateRNA;
        protein = new AminoAcidID();
    }
    public void setupTranslation(String templateRNA)
    {
        templateRNAsize = templateRNA.length();
        this.templateRNA = templateRNA;
    }
    public void startTranslation()
    {
        //Create protein sequence
        createProtein();
    }
    private void createProtein()
    {
        //Finds subsequent codon for every 3 RNA nucleotides
        while(codon.matches("STOP") != true && counter < templateRNAsize)
        {
            if(counter%3 == 0 && counter > 0)
            {
                //Collect the codon and send it to be identified in ProteinID
                codon = templateRNA.substring(counter-3,counter);
                protein.identifyAminoAcid(codon);
                proteinSequence = proteinSequence+protein.getAminoAcid();
            }
            else
            {
                //Stops iterating through the last
                codon = "STOP";
            }
            counter=counter+3;
        }
    }
    public String getProteinSequence()
    {
        return proteinSequence;
    }
}
