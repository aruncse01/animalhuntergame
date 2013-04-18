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
//import java.lang.*;
public class weaponlist  {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	

	public weaponlist()
	{
		
	}
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
	public List<String> GenRandomWeaponlist() {
		weapon wpn = new weapon();
				List<String> wpnlist= new ArrayList<String>();
		String[] wpnnames=wpn.getName();
		for (int i=0;i< 5;i++)
		{
			wpnlist.add(wpnnames[i]);
		}
		return wpnlist;
	}
	public List<String> weapon1list(int level)
	{
		
		List<String> wl1= new ArrayList<String>();
		
		
			if(level==1)
			{
				String [] weaponlist1 = {"0","1","9","9","4"};
				wl1 = Arrays.asList(weaponlist1);
			}
			else if(level==2)
			{
				String [] weaponlist2 = {"0","1","9","9","4"};
				 wl1 = Arrays.asList(weaponlist2);
			}
			else
			{
				String [] weaponlist3 = {"0","1","9","9","4"};
				wl1 = Arrays.asList(weaponlist3);
			}					
               return getmapped(wl1);    
	}
	public List<String> weapon2list(int level)
	{
		List<String> wl1= new ArrayList<String>();
	
		if(level==1)
		{
			String[] weaponlist1 = {"0","1","2","9","9"};
			wl1 = Arrays.asList(weaponlist1);
		}
		else if(level==2)
		{
			String[] weaponlist2 = {"9","9","2","3","9"};
			wl1 = Arrays.asList(weaponlist2);
		}
		else
		{
			String[] weaponlist3 = {"0","9","2","3","9"};
			wl1 = Arrays.asList(weaponlist3);
		}
	
       return getmapped(wl1); 
		
	}
	public List<String> weapon3list(int level)
	{
		List<String> wl1= new ArrayList<String>();
		if(level==1)
		{
		String[] weaponlist1 = {"0","1","2","9","4"};
		wl1 = Arrays.asList(weaponlist1);
		}
		else if(level==2)
		{
			String[] weaponlist2 = {"0","1","2","9","9"};
			wl1 = Arrays.asList(weaponlist2);
		}
		else
		{
			String[] weaponlist3 = {"9","1","2","9","4"};
			wl1 = Arrays.asList(weaponlist3);
		}
        return getmapped(wl1); 
	}
	public List<String> weapon4list(int level)
	{
		List<String> wl1= new ArrayList<String>();
		if(level==1)
		{
			String[] weaponlist1 = {"0","1","2","3","9"};		
			wl1 = Arrays.asList(weaponlist1);
		}
		else if(level==2)
		{
			String[] weaponlist2 = {"0","1","9","9","9"};
			wl1 = Arrays.asList(weaponlist2);
		}
		else
		{
			String[] weaponlist3 = {"9","1","9","3","9"};
			wl1 = Arrays.asList(weaponlist3);
		}		
           return getmapped(wl1); 
	}
	public List<String> weapon5list(int level)
	{
		List<String> wl1= new ArrayList<String>();
		if(level==1)
		{
			String[] weaponlist1 = {"9","9","2","3","9"};
			wl1 = Arrays.asList(weaponlist1);
		}
		else if(level==2)
		{
			String[] weaponlist2 = {"9","9","2","3","4"};
			wl1 = Arrays.asList(weaponlist2);
		}
		else
		{
			String[] weaponlist3 = {"9","9","2","9","4"};
			wl1 = Arrays.asList(weaponlist3);
		}								
           return getmapped(wl1); 
	}
	public static List<String> getmapped(List<String>wb)
	{
		List<String> wl1 =new ArrayList<String>();;
		Map<Integer, String> weaponlist = new HashMap<Integer, String>();
		weaponlist.put(0, "bow");
		weaponlist.put(1, "rifle");
		weaponlist.put(2, "gun");
		weaponlist.put(3, "spear");
		weaponlist.put(4, "bomb");
		weaponlist.put(9, " ");
		for (String w1 :wb) 
		{
			 wl1.add(weaponlist.get(Integer.parseInt(w1)));
		}
                  
		return wl1;
	}
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void UpdateWeaponList() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}