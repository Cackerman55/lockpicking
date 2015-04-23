package lockpicking;

/**
 * @author Colin
 *
 */
public class lock {
	
	private int key;
	private int rank;
	private int pos;
	private int rust;
	
	//pos must always be an odd number >=3
	
	/**
	 * Generates a lock based off of a given rank
	 * and the specified key position
	 *
	 * @param int k is the specified position for the lockpick to open
	 * @param int r the rank of the lock r>=1 && r<=6
	 */
	public lock(int k, int r){
		key =k;
		rank =r;
		if(rank==1){pos=3-1;}
		else if(rank==2){pos=9-1;}
		else if(rank==3){pos=17-1;}
		else if(rank==4){pos=27-1;}
		else if(rank==5){pos=39-1;}
		else if(rank==6){pos=179-1;}
		rust =(int)(Math.random()*5);
	}
	
	
	
	/**
	 * Generates a lock only based off of a given rank
	 * 
	 * @param int r the rank of the lock r>=1 && r<=6
	 */
	public lock(int r){
		rank =r;
		if(rank==1){pos=3;}
		else if(rank==2){pos=9;}
		else if(rank==3){pos=17;}
		else if(rank==4){pos=27;}
		else if(rank==5){pos=39;}
		else if(rank==6){pos=179;}
		key =(int)(Math.random()*pos);
		rust =(int)(Math.random()*5);
	}

}
