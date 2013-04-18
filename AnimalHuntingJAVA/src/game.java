import java.util.Scanner;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Raghu
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
import java.util.*;
public class game {
	String animals;
	String weapons;
	int counter=0;
	Scanner ip=new Scanner(System.in);
	//game gn; 
	level lvl= new level();
	list lst;
	animal an; 
	weapon wn; 
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private level level;
	int test=1;
	/** 
	 * /**
	 *  * @return the level
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public level getLevel() {
		// begin-user-code
		return level;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param level the level to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLevel(level level) {
		// begin-user-code
		this.level = level;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private long endtime;

	/** 
	 * /**
	 *  * @return the endtime
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public long getEndtime() {
		// begin-user-code
		return endtime;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param endtime the endtime to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void  setEndtime(long endtime) {
		
		Calendar calendar = new GregorianCalendar();		
		endtime=calendar.get(Calendar.HOUR)*60*60+calendar.get(Calendar.MINUTE)*60+calendar.get(Calendar.SECOND);
		this.endtime= endtime;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String useroption;

	/** 
	 * /**
	 *  * @return the useroption
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getUseroption() {
		// begin-user-code
		return useroption;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param useroption the useroption to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setUseroption(String useroption) {
		// begin-user-code
		this.useroption = useroption;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String inputanimal;

	/** 
	 * /**
	 *  * @return the inputanimal
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getInputanimal() {
		// begin-user-code
		return inputanimal;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param inputanimal the inputanimal to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setInputanimal(String inputanimal) {
		// begin-user-code
		this.inputanimal = inputanimal;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String inputweapon;

	/** 
	 * /**
	 *  * @return the inputweapon
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getInputweapon() {
		// begin-user-code
		return inputweapon;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param inputweapon the inputweapon to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setInputweapon(String inputweapon) {
		// begin-user-code
		this.inputweapon = inputweapon;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private weapon weapon;

	/** 
	 * /**
	 *  * @return the weapon
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public weapon getWeapon() {
		// begin-user-code
		return weapon;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param weapon the weapon to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setWeapon(weapon weapon) {
		// begin-user-code
		this.weapon = weapon;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private animal animal;

	/** 
	 * /**
	 *  * @return the animal
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public animal getAnimal() {
		// begin-user-code
		return animal;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param animal the animal to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setAnimal(animal animal) {
		// begin-user-code
		this.animal = animal;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private long starttime;

	/** 
	 * /**
	 *  * @return the starttime
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public long getStarttime() {
		// begin-user-code
		return starttime;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param starttime the starttime to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setStarttime(long starttime) {
		
		Calendar calendar = new GregorianCalendar();		
		starttime=calendar.get(Calendar.HOUR)*60*60+calendar.get(Calendar.MINUTE)*60+calendar.get(Calendar.SECOND);
		this.starttime= starttime;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int errorcount;

	/** 
	 * /**
	 *  * @return the errorcount
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getErrorcount() {
		// begin-user-code
		return errorcount;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param errorcount the errorcount to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setErrorcount(int errorcount) {
		// begin-user-code
		this.errorcount = errorcount;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void StartGame() {
		setStarttime(0);
		//boolean flag=true;
		test=1;
		//String levels;
		lst= new list();
		//an= new animal();
		wn=new weapon();
		counter=0;
		Displaylevels();
	}
	public void Displaylevels()
	{
		boolean flag=true;
		do
		{
			
		System.out.println("Enter Game Level:");
		System.out.println("\n1 for Beginner\n2 for Advance\n3 for Expert\n4 for exit");					
		useroption=ip.next();
		setUseroption(useroption);
		if(useroption.equals("1")||useroption.equals("2")||useroption.equals("3"))
		{
			
			flag=false;
			lvl.setLevelno(Integer.parseInt(useroption));
			DisplayOptions();
		}
		else if(useroption.equals("4"))
		{
			flag=false;
			reusecode("n");
		}
		else
		{
			System.out.println("Please enter the valid game level");
		}
		}
		while(flag);
	}
	

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public long CalGameTime() {
		return getEndtime()-getStarttime();
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void EndGame(boolean result) {
		setEndtime(0);
		int level=lvl.getLevelno();
		String climax;
		if (result)
		{
			if (level==1||level==2)
			{
		  System.out.println("you won the game");
		 do{
		  System.out.println("Do you want to play the game again \t y or n");
		  climax=ip.next();
		  if(climax.equals("y")||climax.equals("n"))
		  {
			  reusecode(climax);
		  }
		  else
		  {
			  System.out.println("Please enter the valid input");
		  }
		 }		 
		  while(climax.equals("y")||climax.equals("n"));
		 
			}
			else
			{
				if(CalGameTime()<60)
				{
					System.out.println("You completed the game in:"+CalGameTime()+"Secs");
					System.out.println("you received the medal");
					System.out.println("you are king of the jungle\n");
					System.out.println("you won the game");
					do{
						  System.out.println("Do you want to play the game again \t y or n");
						  climax=ip.next();
						  if(climax.equals("y")||climax.equals("n"))
						  {
							  reusecode(climax);
						  }
						  else
						  {
							  System.out.println("Please enter the valid input");
						  }
						 }		 
						  while(climax.equals("y")||climax.equals("n"));
				}
				else
				{
					System.out.println("You completed the game in:"+CalGameTime()+"Secs");
					System.out.println("you won the game");
					do{
						  System.out.println("Do you want to play the game again \t y or n");
						  climax=ip.next();
						  if(climax.equals("y")||climax.equals("n"))
						  {
							  reusecode(climax);
						  }
						  else
						  {
							  System.out.println("Please enter the valid input");
						  }
						 }		 
						  while(climax.equals("y")||climax.equals("n"));
				}
			}
		}
		else
		{
			if(lvl.getLevelno()==3)
			{
			System.out.println("You completed the game in:"+CalGameTime()+"Secs");
			}
			  System.out.println("you lost the game");
			 // System.out.println("Animal left in forest is"+lst.animalss+"\n"+"Weapons not used effectively is"+lst.weaponss+"\n");
			  do{
				  System.out.println("Do you want to play the game again \t y or n");
				  climax=ip.next();
				  if(climax.equals("y")||climax.equals("n"))
				  {
					  reusecode(climax);
				  }
				  else
				  {
					  System.out.println("Please enter the valid input");
				  }
				 }		 
				  while(climax.equals("y")||climax.equals("n"));
		}
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void DisplayResult() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void ProcessUserInput() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void DisplayOptions() {
		boolean flag=true;
		//String options="";
		//String options=ip.next();
			//lst.GenerateCheckList(lvl.getLevelno());
			do{
				System.out.println("OPTIONS\n1 for listweapons\n2 for listanimals\n3 for exit\n Enter option");
				useroption=ip.next();
				if (useroption.equals("1"))
				{					
					flag=true;
					System.out.println("WEAPON LIST:");
					for(int m=0;m<lst.weaponss.size();m++ )
					{
					System.out.println(lst.weaponss.get(m));
					}
				}																				 
				else if (useroption.equals("2"))
					{
					flag=false;
					System.out.println("ANIMAL LIST");	
					for(int m=0;m<lst.animalss.size();m++ )
					{
					System.out.println(lst.animalss.get(m));
					}					
					}
				else if(useroption.equals("3"))
				{
					flag=false;
					reusecode("n");
				}
					else 
					{
					System.out.println("Input Error Please enter the right Options");					
					}
				 }
				 while(flag);
			do{
				
				do{
				
				System.out.println("OPTIONS\n1.for Hunt\nEnter option");
				useroption=ip.next();	
				
				if (useroption.matches("1")) //HUNT
				{
				flag=false;
				//String[] animals ={"ani1","ani2","ani3","ani4","ani5",""};
				
		    	Hunt();
				
				}
				}
				while(lst.animalss.size()!=0);
				if(lst.weaponss.size()>=0)
				{
					if(lst.animalss.size()==0)
					{
					EndGame(true);
					}
					
				}
			}
			 while(flag);
		
		
		
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void Hunt() {
		
		if(counter==0)
    	{
		lst.GenerateCheckList(lvl.getLevelno());
		getanimal();
		getweapon();
		counter++;
    	}
    	else if (counter>0)
    	{
    		for(String[] row : lst.M) {
    			lst.displaymatrix(row);
            }
    		getanimal();
    		if(lst.animaltrack.size()!=0)
    		{
    		getweapon();
    		}
    		else
    		{
    			EndGame(false);
    		}
    		
    	}
		
		
	}
	public void getanimal()
	{
		
		
		do
		{
			System.out.println("Please select an animal:");
			animals=ip.next();
			if(lst.CheckAnimalExist(animals))
			{
				lst.Displayanimalweapons(animals);
				break;
			}
			else if(lst.CheckAnimalExist1(animals))
			{
				System.out.println("Animal has already been killed");
			}
			else
			{
				System.out.println("please enter the valid input");
			}
		}
		while(!lst.animalss.contains(animals));
	}
	public void getweapon()
	{
		
		
		do
		{
		
		if(lvl.getLevelno()!=3)
		{		
			System.out.println("Please select a weapon");
			weapons=ip.next();
		if(lst.checkanimalweaponexist(weapons))
		{
			lst.UpdateListSize(animals, weapons,lvl.getLevelno());
			break;
		}
		else if(lst.checkallweaponExist(weapons))
		{
			if(lst.checkupdateweaponExist(weapons))
			{
				System.out.println("Weapon you selected cannot be used to kill the animal chose different weapon"); 
			}
			else
			{
				 System.out.println("you have already used that weapon");
			}
		}
		else
		{
			System.out.println("Please enter the valid weapon");
		}
		}
		else 
		{
			System.out.println("Please select a weapon");
			weapons=ip.next();
			if (lst.checkallweaponExist(weapons))
			{
				if(lst.checkanimalweaponexist(weapons)&&!lst.checkweaponusagelvl3(weapons))
				{
					lst.UpdateListSize(animals, weapons,lvl.getLevelno());
					break;
				}
				else if(lst.checkweaponusagelvl3(weapons) || lst.checkupdateweaponExist(weapons))
				{
					
					setErrorcount(test);
					if(getErrorcount()<=2)
					{
					test++;
					System.out.println("you have already used that weapon");					
					//getweapon();
					}
					else
					{
					EndGame(false);
					}
				}
				/*else if (lst.checkupdateweaponExist(weapons))
				{
					System.out.println("Weapon you selected cannot be used to kill the animal chose different weapon"); 
					
				}*/											
			}
			else
			{
				System.out.println("Please enter the valid weapon");
			}
		}
		}
		while(!lst.animaltrack.contains(weapons) || getErrorcount()<=2);
	}
	public void reusecode(String n)
	{
		if (n.equals("y"))
		  {
			 StartGame();
		  }
		  else if (n.equals("n"))
		  {
			  System.out.println("The hunter left the forest!");
			  System.exit(0);
		  }
	}
	public static void main(String[] args)
	{
		game playGame = new game();
		
		playGame.StartGame();
	}
}