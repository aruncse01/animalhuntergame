import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

/**
 * 
 */

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Raghu
 * @generated 
 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class list {
	animallist ani;
	weaponlist wpn;
	public String[][] M;
	List<String> weaponss = new ArrayList<String>();
	List<String> animalss = new ArrayList<String>();
	List<String> animaltrack = new ArrayList<String>();
	List<String> weapontrack = new ArrayList<String>();
	List<String> track1 = new ArrayList<String>();
	List<String> track2 = new ArrayList<String>();
	// list l= new list();
	boolean isValidWeapon;
	game gn;
	public list() {
		gn=new game();
		ani = new animallist();
		wpn = new weaponlist();
		M = new String[6][5];
		animalss.add("rabbit");
		animalss.add("deer");
		animalss.add("lion");
		animalss.add("bear");
		animalss.add("dinosaur");
		weaponss.add("bow");
		weaponss.add("rifle");
		weaponss.add("gun");
		weaponss.add("spear");
		weaponss.add("bomb");
		isValidWeapon = true;
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */

	private int listnumber;

	/**
	 * /** * @return the listnumber
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getListnumber() {
		// begin-user-code
		return listnumber;
		// end-user-code
	}

	/**
	 * /** * @param listnumber the listnumber to set
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setListnumber(int listnumber) {
		// begin-user-code
		this.listnumber = listnumber;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private level level;

	/**
	 * /** * @return the level
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public level getLevel() {
		// begin-user-code
		return level;
		// end-user-code
	}

	/**
	 * /** * @param level the level to set
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLevel(level level) {
		// begin-user-code
		this.level = level;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private weapon weapon;

	/**
	 * /** * @return the weapon
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public weapon getWeapon() {
		// begin-user-code
		return weapon;
		// end-user-code
	}

	/**
	 * /** * @param weapon the weapon to set
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setWeapon(weapon weapon) {
		// begin-user-code
		this.weapon = weapon;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private weapon weapon2;

	/**
	 * /** * @return the weapon2
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public weapon getWeapon2() {
		// begin-user-code
		return weapon2;
		// end-user-code
	}

	/**
	 * /** * @param weapon2 the weapon2 to set
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setWeapon2(weapon weapon2) {
		// begin-user-code
		this.weapon2 = weapon2;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private weapon weapon3;

	/**
	 * /** * @return the weapon3
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public weapon getWeapon3() {
		// begin-user-code
		return weapon3;
		// end-user-code
	}

	/**
	 * /** * @param weapon3 the weapon3 to set
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setWeapon3(weapon weapon3) {
		// begin-user-code
		this.weapon3 = weapon3;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int listcount;

	/**
	 * /** * @return the listcount
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getListcount() {
		// begin-user-code
		return listcount;
		// end-user-code
	}

	/**
	 * /** * @param listcount the listcount to set
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setListcount(int listcount) {
		// begin-user-code
		this.listcount = listcount;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int listsize;

	/**
	 * /** * @return the listsize
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getListsize() {
		// begin-user-code
		return listsize;
		// end-user-code
	}

	/**
	 * /** * @param listsize the listsize to set
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setListsize(int listsize) {
		// begin-user-code
		this.listsize = listsize;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private weaponlist weaponList;

	/**
	 * /** * @return the weaponList
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public weaponlist getWeaponList() {
		// begin-user-code
		return weaponList;
		// end-user-code
	}

	/**
	 * /** * @param weaponList the weaponList to set
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setWeaponList(weaponlist weaponList) {
		// begin-user-code
		this.weaponList = weaponList;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	/* Generates the weaponchecklist */
	public void GenerateCheckList(int n) {
		// list r = new list();
		int row = 0;
		String[] animals = ani.animalarray();
		for (int r = 0; r < 5; r++) {
			M[row][r] = animals[r];
		}
		List randomList = new ArrayList();
		randomList.add(wpn.weapon1list(n));
		randomList.add(wpn.weapon2list(n));
		randomList.add(wpn.weapon3list(n));
		randomList.add(wpn.weapon4list(n));
		randomList.add(wpn.weapon5list(n));
		Collections.shuffle(randomList);
		for (int i = 0; i < randomList.size(); i++) {
			for (int j = 0; j < ((ArrayList) randomList.get(i)).size(); j++) {
				M[j + 1][i] = ((String) ((ArrayList) randomList.get(i)).get(j));
			}
		}

		for (String[] rows : M) {
			this.displaymatrix(rows);
		}

	}

	public void displaymatrix(String[] row) {
		for (String i : row) {
			System.out.print(i);
			System.out.print("\t");
		}
		System.out.println();
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void UpdateListSize(String animal, String wpnn,int no) {
		System.out.print("animal" + animal +"\t" +"Hunted by Weapon" +"\t"+ wpnn + "\n");
		animallist ani = new animallist();
		for (int k = 0; k < 6; k++) {
			for (int vi = 0; vi < 5; vi++) {
				if ((wpnn).equals(this.M[k][vi]))
				{
					if (no!=3)
					{
					this.M[k][vi] = " ";
					}
				}
				this.M[k][ani.GenerateAnimalList().indexOf(animal)] = " ";
			}
		}
		if(no==3)
		{
			track1.add(wpnn);
		}
		this.removeanimal(animal);
		this.removeweapon(wpnn);
		System.out.println("Number of animals left:" + animalss.size() + "\n"
				+ "Number of weapons left:" + weaponss.size() + "\n");	
		animaltrack.clear();		
		for (String[] row : M) {
			this.displaymatrix(row);
		}
	}

	public void removeweapon(String weapon) {
		int c = 0;
		while (c < weaponss.size() && weaponss.size() != 0) {
			if (weaponss.get(c).equals(weapon)) {
				weaponss.remove(weapon);
				c = 0;
			} else {
				c++;
			}
		}
	}

	public void Displayanimalweapons(String animal) {
		
		for (int k = 0; k < ani.GenerateAnimalList().size(); k++) {
			// System.out.println(M[k+1][ani.GenerateAnimalList().indexOf(animal)]+"\n");
			animaltrack.add(M[k + 1][ani.GenerateAnimalList().indexOf(animal)]);
		}
		Iterator<String> i = animaltrack.iterator();
		while (i.hasNext()) {
			String s = i.next();
			if (s == null || s == " ") {
				i.remove();
			}
		}
		if(animaltrack.size()>0)
		{
			for(int d=0;d<animaltrack.size();d++)
			{
				System.out.println(animaltrack.get(d));
			}
		
		}
		
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void CheckElementExits() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public boolean CheckAnimalExist(String animal) {
		boolean flag = false;
		if (animalss.contains(animal)) {
			flag = true;
		}
		return flag;
	}

	public boolean CheckAnimalExist1(String animal) {
		boolean flag = false;
		if (ani.GenerateAnimalList().contains(animal)) {
			flag = true;
		}
		return flag;
	}

	public boolean checkupdateweaponExist(String weapon) {
		boolean flag = false;
		if (weaponss.contains(weapon)) {
			flag = true;
		}
		return flag;
	}

	public boolean checkallweaponExist(String weapon) {
		boolean flag = false;
		if (wpn.GenRandomWeaponlist().contains(weapon)) {
			flag = true;
		}
		return flag;
	}

	public boolean checkanimalweaponexist(String weapon) {
		boolean flag = false;
		if (animaltrack.contains(weapon)) {
			flag = true;
		}
		return flag;
	}
	public boolean checkweaponusagelvl3(String weapon)
	{
		boolean flag=false;
		if(track1.contains(weapon))
		{
			flag=true;
		}
		return flag;
	}
public void removeanimal(String animal)
{
	int m = 0;
	while (m < animalss.size() && animalss.size() != 0) {
		if (animalss.get(m).equals(animal)) {
			animalss.remove(animal.toString());
			m = 0;
		} else {
			m++;
		}
	}

	
}
}