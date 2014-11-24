package day11;

import java.util.Random;

public class PokerCards {

	public static void main(String[] args) {
//		得到一副有序的牌
		Poker[] pokers = new Poker[54];
		int i = 0;
		for(int j=0;j<4;j++){
			for(int k=0;k<13;k++){
				pokers[i++]=new Poker(j,k);
			}
			
		}
		pokers[i++]=new Poker(4,13);
		pokers[i++]=new Poker(5,13);
		
		for(int x=0;x<54;x++){
			System.out.print(pokers[x].show());
		}
		System.out.println();
		
		
//		洗牌
		Random r = new Random();
		for(int j=pokers.length-1;j>0;j--){
			int num = r.nextInt(j);
			Poker temp = pokers[j];
			pokers[j] = pokers[num];
			pokers[num] = temp;
		}
		System.out.println();
		for(int x=0;x<54;x++){
			System.out.print(pokers[x].show());
		}
		System.out.println();
		
	}
	
}

	class Poker{
		int idType;
		int idPoint;
		
		Poker(int idType,int idPoint){
			this.idType=idType;
			this.idPoint=idPoint;
		}
		
		String[] type = {"黑桃","红心","梅花","方片","大王","小王"};
		String showType(int idType){
			return type[idType];
		}
		
		String[] point = {"3","4","5","6","7","8","9","10","J","Q","K","A","2",""};
		String showPoint(int idPoint){
			return point[idPoint];
		}
		
		String show(int idType,int idPoint){
			return (showType(idType)+showPoint(idPoint));
		}
		String show(){
			return (showType(idType)+showPoint(idPoint));
		}
		
	}
