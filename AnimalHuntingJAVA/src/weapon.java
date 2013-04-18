/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Raghu
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class weapon extends list {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private game game;
    String[] weapons= new String[5];
    
	/** 
	 * /**
	 *  * @return the game
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
    
	public weapon()
	{
		weapons[0]="bow";
		weapons[1]="rifle";
		weapons[2]="gun";
		weapons[3]="spear";
		weapons[4]="bomb";	
	}
	
	
	
	public game getGame() {
		// begin-user-code
		return game;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param game the game to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setGame(game game) {
		// begin-user-code
		this.game = game;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private level level;

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
	public String name;

	/** 
	 * /**
	 *  * @return the name
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String[] getName() {
		// begin-user-code
		return weapons;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param name the name to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setName(String name,int index) {
		// begin-user-code
		weapons[index]=name;
		//this.name = name;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean IsAvailable;

	/** 
	 * /**
	 *  * @return the IsAvailable
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean isAvailable() {
		// begin-user-code
		return IsAvailable;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param IsAvailable the IsAvailable to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setAvailable(boolean IsAvailable) {
		// begin-user-code
		this.IsAvailable = IsAvailable;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private list list;

	/** 
	 * /**
	 *  * @return the list
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public list getList() {
		// begin-user-code
		return list;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param list the list to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setList(list list) {
		// begin-user-code
		this.list = list;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private list list2;

	/** 
	 * /**
	 *  * @return the list2
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public list getList2() {
		// begin-user-code
		return list2;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param list2 the list2 to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setList2(list list2) {
		// begin-user-code
		this.list2 = list2;
		// end-user-code
	}

		/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private list list3;

	/** 
	 * /**
	 *  * @return the list3
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public list getList3() {
		// begin-user-code
		return list3;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param list3 the list3 to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setList3(list list3) {
		// begin-user-code
		this.list3 = list3;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private weaponlist weaponList;

	/** 
	 * /**
	 *  * @return the weaponList
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public weaponlist getWeaponList() {
		// begin-user-code
		return weaponList;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param weaponList the weaponList to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setWeaponList(weaponlist weaponList) {
		// begin-user-code
		this.weaponList = weaponList;
		// end-user-code
	}
}