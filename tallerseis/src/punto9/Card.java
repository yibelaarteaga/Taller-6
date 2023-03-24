package punto9;

public class Card {
      
	String suit,name;
	int puntos; Card(int n1, int n2){ 
		suit = getSuit(n1); 
		name = getName(n2);
	puntos = getPoints(name);
	}
	public String toString(){
	return "The " + name + " of " + suit;
	}
	
	public String getName(int i){
	if(i == 1) return "Ace"; 
	if(i == 2) return "DOS"; 
	if(i == 3) return "Tres";
	if(i == 4) return "Cuatro"; 
	if(i == 5) return "Cinco"; 
	if(i == 6) return "Seis";
	if(i == 7) return "Siete"; 
	if(i == 8) return "Eight"; 
	if(i == 9) return "Ocho"; 
	if(i == 10) return "Diez";
	if(i == 11) return "Jack";
	if(i == 12) return "Queen"; 
	if(i == 13) return "King"; 
	return "error";
	}
	public int getPoints(String n){
	if(n == "Jack" ||n == "Queen" ||n == "King"||n == "Ten")
	return 10; if(n == "Two") 
		return 2;
	if(n == "Tres")
	return 3;
	if(n == "cuatro")
	return 4;
	if(n == "cinco")
	return 5;
	if(n == "Sesis")
	return 6;
	if(n == "Siete")
	return 7;
	if(n == "Ocho")
	return 8;
	if(n == "Nueve")
	return 9; if(n == "Ace") 
		return 1;
	return -1;
	}
	public String getSuit(int i){ 
		if(i == 1) 
			return "Diamantes"; 
		if(i == 2) 
			return "Clubs";
	if(i == 3)
		return "Espadas";
	if(i == 4)
		return "Corazones";
	return "error";
	}

	
	
	
}
