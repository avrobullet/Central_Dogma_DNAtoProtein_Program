/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc450_assign1_lifedogma;

/**
 *
 * @author alexanderdouglas
 */
public class Transcribe 
{
    char[] templateDNA;
    String DNA;
    String templateRNA;
    
    public Transcribe()
    {   
        DNA = "";
        templateRNA = "";
    }
    public Transcribe(String storedDNA)
    {
        DNA = storedDNA;
    }
    public void setupTranscription(String storedDNA)
    {
        DNA = storedDNA;
    }
    public void startTranscription()
    {
        templateDNA = DNA.toCharArray();
        createRNA();
    }
    private void createRNA()
    {
        for(int i = 0; i < DNA.length(); i++)
        {
            switch(templateDNA[i])
            {
                case 'A':
                    templateRNA = templateRNA+"U";
                    break;
                case 'T':
                    templateRNA = templateRNA+"A";
                    break;
                case 'G':
                    templateRNA = templateRNA+"C";
                    break;
                case 'C':
                    templateRNA = templateRNA+"G";
                    break;
                default:
                    break;
            }
        }
    }
    public String getTemplateRNA()
    {
        return templateRNA;
    }
}
