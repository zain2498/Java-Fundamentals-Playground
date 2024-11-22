package File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {


    public static void main(String[] args) throws IOException {

        Path currentDirectoryPath = Paths.get(".");
        Path fileToRead = Paths.get("./src/File/resources/data.txt");
        Path fileToWrite = Paths.get("./src/File/resources/data-write.txt");

        Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
        BiPredicate<Path, BasicFileAttributes> matcher = (path, basicFileAttributes) -> String.valueOf(path).contains(".java");
        BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attributes) -> attributes.isDirectory();

        //to access root directory
        System.out.println("\n----Files.list fun ");
        Files.list(currentDirectoryPath).forEach(System.out::println);

        //to access all the java files
        System.out.println("\n----Files.walk fun \n");
        Files.walk(currentDirectoryPath,4).filter(predicate).forEach(System.out::println);

        Files.walk(currentDirectoryPath,4).filter(predicate).forEach(System.out::println);

        System.out.println("\n-----Files.find fun \n");
        Files.find(currentDirectoryPath,4,matcher).forEach(System.out::println);

        System.out.println("\n-----Files.find fun isDirectory \n");
        Files.find(currentDirectoryPath,4,javaMatcher).forEach(System.out::println);

        //it converts the data into stream and read the data one by one
        System.out.println("\n ------Read Files-------\n");
        Files.lines(fileToRead)
               .map(String::toLowerCase)
                       .filter(str ->str.contains("a"))
                               .forEach(System.out::println);

        /*but this is not a good approach it's because it reads all the lines present in the
         file at once which consumes the memory
        for small files to read */
        System.out.println("\n ------Read Files for few data-------\n");
        List<String> listOfFiles =  Files.readAllLines(fileToRead);
        System.out.println(listOfFiles);


        //List<String> list = List.of("Apple","Banana","Orange","Pineapple","Grapes","Mango","Dates","Watermelon");
//        Files.write(fileToWrite,list);

    }
}
