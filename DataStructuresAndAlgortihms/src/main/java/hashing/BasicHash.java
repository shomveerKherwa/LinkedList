package hashing;

public class BasicHash {
	
	static char[] input = {'s','i','l','d','h','i'};
	
	public static void main(String[] args){
		int count[] = new int[256];
		
		for(int i=0 ;i<256 ; i++) {
			count[i]=0;
		}
		
		for(int i=0 ;i< input.length; i++) {
			System.out.println("input[i] "+input[i]);
			int ascii = input[i];
			System.out.println("ascii "+ascii);
			if(count[ascii] == 1) {
				System.out.println("first repeated char "+input[i]);
				break;
			}
			else
				count[ascii] = 1;
			
			if(i== input.length)
				System.out.println("No repeated character");
		}
	}

	
}
