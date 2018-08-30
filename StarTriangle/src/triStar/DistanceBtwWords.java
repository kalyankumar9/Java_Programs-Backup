package triStar;

public class DistanceBtwWords {

	public static void main(String args[]) {
	//	final String strWords = "The color of the car is blue";
		final String word1 = "color";
		final String word2 = "blue";
		
	//	final String strOnlyWords = strWords.replace(", ","").replaceAll(".","");
		String words = "";
		final int index1 = words.indexOf(word1);
		final int index2 = words.indexOf(word2);
		int distance = -1;
		
		if(index1 != -1 && index2 != -1) {
			distance = index2 - index1;
		}
		System.out.println(distance);		
	}
}
