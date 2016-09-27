/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc450_assign1_lifedogma;

/**
 *
 * @author alexanderdouglas
 */
public class AminoAcidID 
{
    String sub1Codon;
    char sub2Codon;
    String aminoacid;
    
    public AminoAcidID()
    {
        aminoacid = "";
    }
    public void identifyAminoAcid(String codon)
    {
        sub1Codon = codon.substring(0,2);
        sub2Codon = codon.charAt(2);
        //Determine corresponding amino acid to the codon
        findAminoAcid();
    }
    private void findAminoAcid()
    {
        //Most frequented statement due to "M" being called first for ALL proteins
        if(sub1Codon.matches("AU"))
        {
            if(sub2Codon == 'G')
            {
                //Methionine
                aminoacid = "M";
            }
            else
            {
                //Isoleucine
                aminoacid = "I";
            }
        }
        else if(sub1Codon.matches("AA"))
        {
            if(sub2Codon == 'U' || sub2Codon == 'C')
            {
                //Asparagine
                aminoacid = "N";
            }
            else
            {
                //Lysine
                aminoacid = "K";
            }
        }
        else if(sub1Codon.matches("AG"))
        {
            if(sub2Codon == 'U' || sub2Codon == 'C')
            {
                //Serine
                aminoacid = "S";
            }
            else
            {
                //Arginine
                aminoacid = "R";
            }
        }
        else if(sub1Codon.matches("AC"))
        {
            //Threonine
            aminoacid = "T";
        }
        else if(sub1Codon.matches("UA"))
        {
            if(sub2Codon == 'U' || sub2Codon == 'C')
            {
                //Tyrosine
                aminoacid = "Y";
            }
            else
            {
                //STOP
                aminoacid = "STOP";
            }
        }
        else if(sub1Codon.matches("UU"))
        {
            
            if(sub2Codon == 'U' || sub2Codon == 'C')
            {
                //Phenylalanine
                aminoacid = "F";
            }
            else
            {
                //Leucine
                aminoacid = "L";
            }
        }
        else if(sub1Codon.matches("UG"))
        {
            if(sub2Codon == 'U' || sub2Codon == 'C')
            {
                //Cysteine
                aminoacid = "C";
            }
            else if(sub2Codon == 'G')
            {
                //Tryptophan
                aminoacid = "W";
            }
            else
            {
                //STOP
                aminoacid = "STOP";
            }
        }
        else if(sub1Codon.matches("UC"))
        {
            //Serine
            aminoacid = "S";
        }
        else if(sub1Codon.matches("CA"))
        {
            if(sub2Codon == 'U' || sub2Codon == 'C')
            {
                //Histidine
                aminoacid = "H";
            }
            else
            {
                //Glutamine
                aminoacid = "Q";
            }
        }
        else if(sub1Codon.matches("CU"))
        {
            //Leucine
            aminoacid = "L";
        }
        else if(sub1Codon.matches("CG"))
        {
            //Argigine
            aminoacid = "R";
        }
        else if(sub1Codon.matches("CC"))
        {
            //Proline
            aminoacid = "P";
        }
         else if(sub1Codon.matches("GA"))
        {
            if(sub2Codon == 'U' || sub2Codon == 'C')
            {
                //Aspartic acid
                aminoacid = "D";
            }
            else
            {
                //Glutamic acid
                aminoacid = "E";
            }
        }
        else if(sub1Codon.matches("GU"))
        {
            //Valine
            aminoacid = "V";
        }
        else if(sub1Codon.matches("GG"))
        {
            //Glycine
            aminoacid = "G";
        }
        else if(sub1Codon.matches("GC"))
        {
            //Alanine
            aminoacid = "A";
        }
        else
        {
            aminoacid = "OJO";
        }
  
    }
    public String getAminoAcid()
    {
        return aminoacid;
    }
}

