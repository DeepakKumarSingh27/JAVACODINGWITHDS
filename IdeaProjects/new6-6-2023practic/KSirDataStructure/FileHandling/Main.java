package KSirDataStructure.FileHandling;

import java.io.*;

public class Main {
    public static void main(String[] args) {
      /*try(InputStreamReader isr = new InputStreamReader(System.in)) {
          System.out.print("Enter the some Letters:");
          int letters = isr.read();
          while (isr.ready()) {
              System.out.println((char) letters);
              letters = isr.read();
          }
          System.out.println();
      }catch (IOException e){
          System.out.println(e.getMessage());
      }


        try (FileReader fr = new FileReader("D:\\ubuntuProgramm\\IdeaProjects\\new6-6-2023practic\\KSirDataStructure\\FileHandling\\note.txt")) {
            int letters = fr.read();
            while (fr.ready()) {
                System.out.print((char) letters);
                letters = fr.read();
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("you typed: " + br.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("D:\\ubuntuProgramm\\IdeaProjects\\new6-6-2023practic\\KSirDataStructure\\FileHandling\\note.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        OutputStream os = System.out;
        //os.write(😒);
       // System.out.println();
        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("Hello world");
            osw.write(97);
            osw.write('A');
            osw.write('\n');
            char[] arr = "hello world".toCharArray();
            osw.write(arr);
           // osw.write(😒);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
 */

        try(FileWriter fr = new FileWriter("D:\\ubuntuProgramm\\IdeaProjects\\new6-6-2023practic\\KSirDataStructure\\FileHandling\\note.txt",true)) {
            fr.write("Hello world this iss   s s   sksksk");
            //System.out.println("file successfully write ");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
          File fo = new File("D:\\ubuntuProgramm\\IdeaProjects\\new6-6-2023practic\\KSirDataStructure\\FileHandling\\new-file.txt");
          fo.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try{
            FileWriter fw = new FileWriter("D:\\ubuntuProgramm\\IdeaProjects\\new6-6-2023practic\\KSirDataStructure\\FileHandling\\new-file.txt");
            fw.write("Deepak is good  boy");
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new FileReader("D:\\ubuntuProgramm\\IdeaProjects\\new6-6-2023practic\\KSirDataStructure\\FileHandling\\new-file.txt"))) {
          while (br.ready()){
              System.out.println(br.readLine());
          }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try{
            File fo = new File("D:\\ubuntuProgramm\\IdeaProjects\\new6-6-2023practic\\KSirDataStructure\\FileHandling\\random.txt");
           fo.createNewFile();
           fo.delete();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
