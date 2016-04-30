package logica;

public class CodeBreaker {
	private String key="9581";

	public CodeBreaker(){
		
	}
	
	public String isSecretNumber(String numero){
		String result="";
	
		for(int i = 0; i < numero.length(); i ++){
			if(numero.charAt(i) == key.charAt(i)){
				result = result + "X";
			}
		}
			
		for (int j = 0; j < key.length(); j++) {
				
			if(key.contains(String.valueOf(numero.charAt(j))) && numero.charAt(j) != key.charAt(j)){
				result+= "_";
			}
		}
		
		
		return result;
		
	}

}
