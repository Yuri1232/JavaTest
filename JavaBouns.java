import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadFile {
    public static void main(String[] args) {
        try {
            File myfile = new File("file.txt");
            Scanner myReader = new Scanner(myfile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                for (int i = 0; i < data.length(); i++) {
                    for (int j = i + 1; j < data.length(); j++) {
                        if (!Character.isDigit(data.charAt(j))) {
                            break;
                        }

                        if (Character.isDigit(data.charAt(i)) && Character.isDigit(data.charAt(j))) {
                            int value1 = Integer.parseInt(String.valueOf(data.charAt(i)));
                            int value2 = Integer.parseInt(String.valueOf(data.charAt(j)));
                            if (value1 >= 1 && value2 >= 0) {
                                System.out.println(value1);
                                System.out.println(value2);
                            }
                        }

                    }

                }
            }
            myReader.close();
        } catch (

        FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}