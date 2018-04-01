import java.util.List;

public class StringFormatter
{
	
	public static int totalLetters(List<String> wordList) {
		int totalLength = 0; 
		for (int i = 0; i < wordList.size(); i++) {
			totalLength += wordList.get(i).length(); 
		}
		return totalLength; 
	}

	public static int basicGapWidth(List<String> wordList, int formattedLen) {
		int gapWidth, numGaps = wordList.size() - 1; 
		
		gapWidth = (formattedLen - totalLetters(wordList)) / numGaps; 
		
		return gapWidth; 
	}
	
	public static int leftoverSpaces(List<String> wordList, int formattedLen) {
		return formattedLen - totalLetters(wordList) - basicGapWidth(wordList, formattedLen)*(wordList.size()-1);
	}
	
	public static String format(List<String> wordList, int formattedLen) {
		int leftoverCount = leftoverSpaces(wordList, formattedLen);
		int gapWidth = basicGapWidth(wordList, formattedLen); 
		String gap = ""; 
		for (int i = 0; i < gapWidth; i++) {
			gap += " "; 
		}
		String output = "";
		
		for (int i = 0; i < wordList.size(); i++) {
			output = output + wordList.get(i) + gap; 
		}
		
		return output; 
	}
	
}