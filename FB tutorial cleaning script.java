import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Replace {

public static void main(String[] args) {
	
        try
            {
				/*put the path of the file from which you wanna read and if the 
				file is in the same folder as this program so you don't need to 
				write specify the path just write the name of the file with the 
				extension*/
				File file = new File("xml.xml");
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line = "", oldtext = "";
				while((line = reader.readLine()) != null)
					{
						oldtext += line + "\r\n";
					}
				reader.close();

				String replacedtext  = oldtext.replaceAll("&quot;", "" + "\"");
				replacedtext = replacedtext.replaceAll("<br />", "" + "");
				replacedtext = replacedtext.replaceAll("&gt;", "" + ">");
				replacedtext = replacedtext.replaceAll("&lt;", "" + "<");
				replacedtext = replacedtext.replaceAll("<p>", "" + "");
				replacedtext = replacedtext.replaceAll("</p>", "" + "");
				
				/*put the name of the file in which you wanna write the corrected
				code, as you can just overwrite the source file from which you are 
				readingsince you don't need it anymore*/
				FileWriter writer = new FileWriter("xml1.xml");
				writer.write(replacedtext);
				writer.close();

			}
        catch (IOException ioe)
            {
				ioe.printStackTrace();
			}
    }
}