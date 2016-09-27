/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc450_assign1_lifedogma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Autostreamreader would be a better choice instead of Scanner

/**
 *
 * @author alexanderdouglas
 */
public class ReadFile 
{
    String checkDNA;
    String readDNA;
    String storedDNA;
    File file;
    Scanner scan;
    
    public ReadFile() throws FileNotFoundException
    {
        checkDNA = null;
        readDNA = null;
        storedDNA = "";
    }
    public void record() throws FileNotFoundException
    {
        file = new File("DNA_template.txt");
        scan = new Scanner(file);
        
        checkDNA = scan.next();
        
        while(checkDNA.matches("//DNA") == false)
        {
            //Reads the next line
            checkDNA = scan.next();
            //Checks that DNA sequence is ATGC organized
            //authicateDNA();
            //Send DNA to be stored
            storeDNA();
        }
        
        scan.close();
    }
    private void storeDNA()
    {
        //System.out.println(checkDNA);
        if(checkDNA.matches("DNA//"))
        {
            //Merging Strings
            storedDNA = storedDNA+checkDNA;
        }
        else if(checkDNA.matches("//DNA"))
        {
            checkDNA = null;
        }
        System.out.println(storedDNA);
    }
    public String getStoredDNA()
    {
        return storedDNA;
    }
    public void test()
    {
        File here = new File(".");
        System.out.println(here.getAbsolutePath());
    }
}
