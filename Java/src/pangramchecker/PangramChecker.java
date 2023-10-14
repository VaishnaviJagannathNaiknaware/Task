package pangramchecker;

public class PangramChecker {
	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog"; 
        boolean isPangram = checkIfPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
	 public static boolean checkIfPangram(String s) {
		 boolean[] hasLetter = new boolean[26]; 
		 s = s.toLowerCase();
		 
		 for (char c : s.toCharArray()) {
	            if (Character.isLetter(c)) {
	                int index = c - 'a';
	                hasLetter[index] = true;
	            }
	        }
		 for (boolean letterExists : hasLetter) {
	            if (!letterExists) {
	                return false;
	}

}
		 return true;
		 
	 }
}	 
