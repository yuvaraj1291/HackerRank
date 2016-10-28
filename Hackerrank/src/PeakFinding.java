
/* Yuvaraj Sundarrajan
 * Niner NetID: 800903707*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Yuvaraj Sundarrajan 800903707
 * This program determines all the local peaks in a 2D array & write it to a file
 */
public class PeakFinding {

	public static final String EXTRACT_NUMBER_REGEX = "([\\d]+[,]?[ ]*)+";
	public static final String OUTPUT_FILE_NAME = "localPeaks_Output.txt";

	public static void main(String[] args) {

		try {
			BufferedReader inputReader = new BufferedReader(new FileReader(args[0]));
			// Extracting text from input file and setting it a string
			String inputMatrix = "", temp;
			while ((temp = inputReader.readLine()) != null) {
				inputMatrix = inputMatrix + temp;
			}
			inputReader.close();

			// Extracting the values from a file & setting it to an arrayList
			Pattern pattern = Pattern.compile(EXTRACT_NUMBER_REGEX);
			Matcher matcher = pattern.matcher(inputMatrix);

			// ArrayList hold the values in the input file
			List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> rowList;

			while (matcher.find()) {
				rowList = new ArrayList<Integer>();
				String[] strArray = matcher.group().split(",");
				for (String str : strArray) {
					rowList.add(Integer.parseInt(str.trim()));
				}
				list.add(rowList);
			}

			// Creating an output File
			File outputFile = new File(OUTPUT_FILE_NAME);

			if (outputFile.exists()) {
				outputFile.createNewFile();
			}

			FileWriter fileWriter = new FileWriter(outputFile.getAbsoluteFile());
			BufferedWriter outputWriter = new BufferedWriter(fileWriter);
			int count=0;
			// Iterating all the elements of an array except the boundaries to
			// find local peaks
			for (int i = 1; i < list.size() - 1; i++) {
				for (int j = 1; j < list.get(i).size() - 1; j++) {
					int value = list.get(i).get(j);
					// Checking the current value is greater than or equal to
					// the elements on top, bottom, right and left to check
					// whether its a peak
					if (value >= list.get(i).get(j + 1) && value >= list.get(i).get(j - 1)
							&& value >= list.get(i - 1).get(j) && value >= list.get(i + 1).get(j)) {
						count++;
						if(count==1){
							outputWriter.write(inputMatrix);
							outputWriter.newLine();
							outputWriter.write("Local Peaks Found");
							outputWriter.newLine();
						}
						outputWriter.write("Peak # "+count+": " + value);
						outputWriter.write("  (" + (i + 1) + "," + (j + 1) +")");
						outputWriter.newLine();
					}
				}
			}
			if(count==0){
				outputWriter.write("No Local Peaks Found");
			}
			outputWriter.close();
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
