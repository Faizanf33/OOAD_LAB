import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import java.io.IOException;
import java.io.FileNotFoundException;

public class EditLines {
	public static void main(String[] args) throws IOException {
		BufferedReader fin = null;
		// File open to read
		try {
			fin = new BufferedReader(new FileReader("test.txt"));
			System.out.println("INFO: File 'text.txt' opened successfully");
		}
		catch (FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
			return;
		}

		ArrayList data = new ArrayList<String>();
		ArrayList mod_data = new ArrayList<String>();

		String line = fin.readLine();

		// Creating line of zero's
		String zero_line = "";
		for (int i = 0; i < line.length(); i++)
			zero_line += '0';

		// Read file
		while (line != null){
			data.add(line);
			mod_data.add(line);
			line = fin.readLine();
		}
		fin.close();

		// Replace next and previous line with zero's if matches 'f8'
		for (int i = 0; i < data.size(); i++)
			if (data.get(i).toString().contains("f8")) {
				mod_data.set(i-1, zero_line);
				mod_data.set(i, zero_line);
				mod_data.set(i+1, zero_line);
			}
		
		// Creating output file for modified data
		BufferedWriter fout = new BufferedWriter(new FileWriter("out.txt"));
		for (var l : mod_data)
			fout.write(l.toString() + '\n');
		
		fout.close();

		System.out.println("INFO: Output file written to 'out.txt'");
	}
}