package generateJsonWithtemplate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class GenerateJsonWithTemplate {

	/**
	 * @methodName getData
	 * @author Sriraman Raji
	 * @description parses json file as text and returns the context of the file as
	 *              a string
	 * 
	 * @param filePath
	 * @return inputData
	 * @throws Exception
	 */

	public static String getData(String filePath) throws Exception {

		File file = new File(filePath);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String inputData = null;
		String temp;
		while ((temp = br.readLine()) != null) {
			if (inputData != null) {
				inputData += "\n" + temp;
			} else {
				inputData = temp;
			}
		}
		br.close();

		return inputData;
	}

	/**
	 * @methodName generateJson
	 * @author Sriraman Raji
	 * @description Generates a json file with the string data passed on to the
	 *              method
	 * 
	 * @param filePath
	 * @param data
	 * @throws Exception
	 */

	public static void generateJson(String filePath, String data) throws Exception {

		FileWriter writer = new FileWriter(filePath, false);
		writer.write(data);
		writer.close();

	}

	public static void main(String[] args) throws Exception {

//		File path
		String filePath = System.getProperty("user.dir") + "/src/jsonUpdate/template.json";
		String generateFilePath = System.getProperty("user.dir") + "/src/jsonUpdate/ouput.json";

//		Map to handle the replace elements
		HashMap<String, String> replace = new HashMap<String, String>();

		String template = getData(filePath);
//		System.out.println(template);

//		Add or remove the replace elements
		replace.put("ID", "1");
		replace.put("NAME", "Sriraman Raji");
		replace.put("USERNAME", "RSRIRAM");
		replace.put("EMAIL", "test@test.com");
		replace.put("PHONE", "0123456789");
		replace.put("WEBSITE", "https://sriramanraji.github.io/SriramanRaji/");

//		Replace elements one by one
		for (Map.Entry<String, String> entry : replace.entrySet()) {

			template = template.replace("@" + entry.getKey() + "@", entry.getValue());

		}

//	Generate Json		 
		generateJson(generateFilePath, template);
		System.out.println("JSON File Generated.!!\n" + template);

	}

}
