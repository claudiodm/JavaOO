package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadereBufferedReader1403 {
    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";
        //BufferedReader/FileReader e para ler arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
//            try{
//                if (br != null){
//                    br.close();
//                }
//                if (fr != null){
//                    fr.close();
//                }
//            }
//            catch (IOException e){
//                e.printStackTrace();
//            }
        }
    }
}
