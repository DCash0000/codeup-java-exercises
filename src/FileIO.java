import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileIO {
    public static void main(String[] args) {
//        newDogFile();
        readWriteFile();

    }


    static void newDogFile() {
        //Create New Directory
        //Creating directory and file name as strings
        String directory = "dogs";
        String pixieFilename = "Pixie.txt";
        String mittlyFilename = "Mittly.txt";


        //Setting path for the directory
        Path dogsDirectory = Paths.get(directory);
        System.out.println(dogsDirectory.toAbsolutePath());

        //Setting the path for file (NOTE: method override in Paths class allows different parameters for files and directory creation)
        Path pixieFile = Paths.get(directory, pixieFilename);
        Path mittlyFile = Paths.get(directory, mittlyFilename);


    //Error handling for file creation
    try {
        //NOTE: If the file already exists, program will run without creating files and WILL NOT run catch block
        //If the directory does not exist, create a new one
        if (Files.notExists(dogsDirectory)) {
            Files.createDirectories(dogsDirectory);
            System.out.println("Directory created");
        }
        //If file does not exist in the specified directory, create a new one
        if(!Files.exists(pixieFile)){
            Files.createFile(pixieFile);
            System.out.println("File Created");
        } if(!Files.exists(mittlyFile)){
            Files.createFile(mittlyFile);
            System.out.println("File Created");
        }
        //Handling errors during file creation
    }catch(IOException ioe){
        ioe.printStackTrace();
        System.out.println("Something went wrong");
    }
  }


  static void readWriteFile(){
        //Creating empty ist
      List<String> fruit = null;
      try{
          //Getting grocery file path
          Path groceries = Paths.get("dogs", "groceries.txt");
          //Getting all lines from groceries.txt(which should be nothing at first)
          fruit = Files.readAllLines(groceries);
          //Print each line of the array to the console
          for(String line : fruit){
              System.out.println(line);
          }
      }catch(IOException ioe){
          ioe.printStackTrace();
      }


      //Adding items to empty fruit list
      fruit.add("kiwi");
      fruit.add("starfruit");
      try{
          //Getting groceries file
          Path groceries = Paths.get("dogs", "groceries.txt");
          //Writing new added contents to the file
          Files.write(groceries, fruit);
          System.out.println("Done");
      }catch(IOException ioe){
          ioe.printStackTrace();
      }


  }
}
