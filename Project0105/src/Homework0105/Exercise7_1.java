package Homework0105;

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0;i<CARD_NUM;i++) {
			if(i==0||i==2||i==7) {
				cards[i] = new SutdaCard(i%10+1,true);
			}else{
				cards[i] = new SutdaCard(i%10+1,false);
			}
		}
	}
	public void shuffle(){
		
	
		for(int i=0;i<CARD_NUM;i++) {
			SutdaCard tmp = null;
			int rnd = (int)(Math.random()*CARD_NUM);
			tmp= cards[i];
			cards[i] = cards[rnd];
			cards[rnd] = tmp;
		}
	}
	public SutdaCard pick(int index){
		return cards[index];
	}
	public SutdaCard pick(){
		return cards[(int) (Math.random()*CARD_NUM)];
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}


public class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0;i<deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
	}
}
