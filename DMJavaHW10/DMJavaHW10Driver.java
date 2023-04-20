import java.util.Scanner;
import java.io.*;

public class DMJavaHW10Driver {
    public static void main(String[] args) throws IOException{
        File mainText = new File("mainText.txt");
        File madeFile = new File("madeFile.txt");
        Scanner mainRead = new Scanner(mainText);
        if (madeFile.createNewFile())
        {
            System.out.println("created new file");
        }
        else
        {
            System.out.println("file already exists");
        }
        PrintWriter madeFileWriter = new PrintWriter(madeFile);
        if(madeFile.exists() && mainText.exists())
        {
            String[] textArray = new String[10];
            int count = 0;
            while(mainRead.hasNext())
            {
                textArray[count] = mainRead.next();
                count++;
            }
            for(int i = 0; i < textArray.length; i++)
            {
                madeFileWriter.print(textArray[i]);
            }
        }
        madeFileWriter.close();
        mainRead.close();
    }
}