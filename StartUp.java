/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc450_assign1_lifedogma;

import java.io.FileNotFoundException;

/**
 *
 * @author alexanderdouglas
 */
public class StartUp 
{
    final ReadFile readDNA;
    final Transcribe transcribe;
    final Translate translate;
        
    public StartUp() throws FileNotFoundException
    {
        readDNA = new ReadFile();
        transcribe = new Transcribe();
        translate = new Translate();
    }
    public void begin()throws FileNotFoundException
    {
        //Read DNA sequence from .txt file
        readDNA.record();
        //readDNA.test();
        //Send DNA sequence to be transcribed into RNA
        transcribe.setupTranscription(readDNA.getStoredDNA());
        transcribe.startTranscription();
        //Send RNA template sequence to be converted into a protein sequence
        translate.setupTranslation(transcribe.getTemplateRNA());
        translate.startTranslation();
        //Post results
        postResults();
        
    }
    public void postResults()
    {
        //RNA
        System.out.println("RNA: "+transcribe.getTemplateRNA());
        //Protein
        System.out.println("Protein: "+translate.getProteinSequence());
    }
}
