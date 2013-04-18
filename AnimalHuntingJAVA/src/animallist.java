import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Raghu
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class animallist extends animal {
	animal ani; 
	public animallist()
	{
		ani=new animal();
	}
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int listnumber;

	/** 
	 * /**
	 *  * @return the listnumber
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getListnumber() {
		// begin-user-code
		return listnumber;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param listnumber the listnumber to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setListnumber(int listnumber) {
		// begin-user-code
		this.listnumber = listnumber;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int listcount;

	/** 
	 * /**
	 *  * @return the listcount
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getListcount() {
		// begin-user-code
		return listcount;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param listcount the listcount to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setListcount(int listcount) {
		// begin-user-code
		this.listcount = listcount;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int listsize;

	/** 
	 * /**
	 *  * @return the listsize
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getListsize() {
		// begin-user-code
		return listsize;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param listsize the listsize to set
	 * 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setListsize(int listsize) {
		// begin-user-code
		this.listsize = listsize;
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
	public List<String> GenerateAnimalList() {
		
		List<String> anilist= new ArrayList<String>();
		String[] animalnames=ani.animals;
		for (int i=0;i<5;i++)
		{
			anilist.add(animalnames[i]);
		}
		return anilist;
	}
	public   String[] animalarray()
	{
		
		
		return ani.animals;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void UpdateAnimalList() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}