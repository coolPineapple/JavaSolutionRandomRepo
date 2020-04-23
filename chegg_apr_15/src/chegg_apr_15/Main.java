package chegg_apr_15;

public class Main {
}

/*Computer Science
Complete in Java 11. Given PatientRecord and PatientRecordNode, complete PatientRecordTree and the tester.

PatientRecord
*/
import java.util.Calendar;
import java.util.Date;

/**
* This class models a Patient
*
*/
public class PatientRecord implements Comparable {

private String name; // name of the patient
private final Date DATE_OF_BIRTH; // date of birth of the patient
  
/**
* Creates a new PatientRecord with given name and date of birth
*
* @param dateOfBirth String representation of the date of birth of the patient in format mm/dd/yyyy.
* @throws IllegalArgumentException if the format of the date is incorrect.
* @throws NumberFormatException if the format of the provided date is not valid
*/
public PatientRecord(String name, String dateOfBirth) {
// split the provided date with respect to "/"
String[] parts = dateOfBirth.split("/");
// get the month, day, and year of date
if (parts.length != 3)
throw new IllegalArgumentException("Incorrect format of date.");
int month = Integer.parseInt(parts[0]);
int day = Integer.parseInt(parts[1]);
int year = Integer.parseInt(parts[2]);
this.name = name;
Calendar calendar = Calendar.getInstance();
calendar.set(year, month - 1, day);
calendar.set(Calendar.HOUR_OF_DAY, 0);
calendar.set(Calendar.MINUTE, 0);
calendar.set(Calendar.SECOND, 0);
calendar.set(Calendar.MILLISECOND, 0);
DATE_OF_BIRTH = calendar.getTime();
}

/**
* Gets the name of the patient
*
* @return the name of the patient
*/
public String getName() {
return name;
}

/**
* Gets the date of birth of the patient
*
* @return the date of birth of the patient as a java.util.Date object
*/
public Date getDateOfBirth() {
return DATE_OF_BIRTH;
}

/**
* Gets a String representation of the date of birth of the patient
*
* @return the date of birth of this PatientRecord as a String in the format month/day/year.
*/
public String getStringDateOfBirth() {
Calendar calendar = Calendar.getInstance();
calendar.setTime(DATE_OF_BIRTH);
int day = calendar.get(Calendar.DAY_OF_MONTH);
int month = calendar.get(Calendar.MONTH) + 1;
int year = calendar.get(Calendar.YEAR);
return month + "/" + day + "/" + year;
}

/**
* Returns a String representation of this patient's record in the following format:
* "name(date_of_birth)". For instance "George(12/3/2000)"
*
* @return a String representation of this patient record
*
*/
@Override
public String toString() {
return name + "(" + getStringDateOfBirth() + ")";
}

/**
* Compares two PatientRecords for ordering with respect to the dates of birth of the patients.
*
* @returns the value 0 if the argument otherPatientRecord has the same date of birth as this
* PatientRecord; a value less than 0 if this patient is older than the otherPatient with
* otherPatientRecord; and a value greater than 0 if this patient is younger than
* other patient.
* @throws NullPointerException if otherPatientRecord is null
*/
@Override
public int compareTo(PatientRecord otherPatientRecord) {
return this.DATE_OF_BIRTH.compareTo(otherPatientRecord.DATE_OF_BIRTH);
}

/**
* Checks whether this PatientRecord equals some other object
* @return true if this PatientRecord equals the input argument o and false otherwise
*/
@Override
public boolean equals(Object o) {
return (o != null && o instanceof PatientRecord && compareTo((PatientRecord)o)== 0);
}
}

//PatientRecordnode

/**
* This class models a patient record node in a binary search tree.
*
*/
public class PatientRecordNode {
private PatientRecord data; // data field which represents a patient within this PatientNode.
private PatientRecordNode rightChild; // reference to the right child of this PatientNode.
private PatientRecordNode leftChild; // reference to the left child of this PatientNode.
  
/**
* Creates a new PatientNode with given data and null for both left and right children
* @param data reference to the data of this PatientNode
*/
public PatientRecordNode(PatientRecord data) {
this.data = data;
}

/**
* Gets the right child of this PatientNode
* @return the rightChild of this PatientNode
*/
public PatientRecordNode getRightChild() {
return rightChild;
}

/**
* Sets the right child of this PatientNode
* @param rightChild the rightChild to set
*/
public void setRightChild(PatientRecordNode rightChild) {
this.rightChild = rightChild;
}

/**
* Gets the left child of this PatientNode
* @return the leftChild of this PatientNode
*/
public PatientRecordNode getLeftChild() {
return leftChild;
}

/**
* Sets the left child of this PatientNode
* @param leftChild the leftChild to set
*/
public void setLeftChild(PatientRecordNode leftChild) {
this.leftChild = leftChild;
}

/**
* Returns the patient record of this PatientNode
* @return the data of this binary node.
*/
public PatientRecord getPatientRecord() {
return data;
}
  
  

}

//Complete this method

 import java.util.NoSuchElementException; /** * This class implements a binary search tree (BST) which stores a set of patient records. 
 * The left subtree contains the patient records of all the patients who are older than the 
 * * patient who's PatientRecord is stored at a parent node. 
 * * The right subtree contains the patient records of all the patients who are younger than the 
 * * patient who's PatientRecord is stored at a parent node. * */ 
 public class PatientRecordTree { private PatientRecordNode root; 
 // root of this binary search tree private int size; 
 // total number of patient records stored in this tree. 
 /** * Checks whether this binary search tree (BST) is empty * 
  * * @return true if this PatientRecordTree is empty, false otherwise */ 
 public boolean isEmpty() { //TODO Complete the implementation of this method. return false; 
	 // a default return statement added to let this code compile. } 
	 /** * Returns the number of patient records stored in this BST. * 
	  * }
	  * * @return the size of this PatientRecordTree */ 
	 public int size() { //TODO Complete the implementation of this method. return 0; 
		 // remove this statement. A default return statement added to let this code compile. } 
		 /** * Recursive helper method to add a new PatientRecord to a PatientRecordTree rooted at current. *
		  *  * @param current The "root" of the subtree we are inserting newRecord into. 
		  *  * @param newRecord The PatientRecord to be added to a BST rooted at current
		  *  . * @return true if the newRecord was successfully added to this PatientRecordTree, false otherwise */ 
	 }
		 public static boolean addPatientRecordHelper(PatientRecord newRecord, PatientRecordNode current) { 
			 //TODO Complete the implementation of this method. return false; 
			 // remove this statement. A default return statement added to let this code compile. } 
			 /** * Adds a new PatientRecord to this PatientRecordTree *
			  *  * @param newRecord a new PatientRecord to add to this BST.
			  *   * @return true if the newRecord was successfully added to this BST, and returns false if there is 
			  *   * a match with this PatientRecord already already stored in this BST. */ 
			 public boolean addPatientRecord(PatientRecord newRecord) { //TODO Complete the implementation of this method. 
				 if (isEmpty()) { 
				 // Add newRecord to an empty PatientRecordTree //TODO /* MISSING CODE */ 
					 } else { 
						 // Add newRecord to an non-empty PatientRecordTree //TODO /* MISSING CODE */ 
						 //[Hint]: call addPatientRecordHelper to help implement this behavior. 
						 } return false; 
						 // remove this statement. A default return statement added to let this code compile. 
						 }
			 /** * Recursive helper method which returns a String representation of the BST rooted at current. An 
			  * * example of the String representation of the contents of a PatientRecordTree is provided in the 
			  * * description of the above toString() method. *
			  *  * @param current reference to the current PatientRecordNode within this BST. 
			  *  * @return a String representation of all the PatientRecords stored in the sub-tree 
			  *  * PatientRecordTree rooted at current in increasing order with respect to the patients 
			  *  * dates of birth. Returns an empty String "" if current is null. */ 
			 public static String toStringHelper(PatientRecordNode current) { 
				 //TODO Complete the implementation of this method. return null; 
				 // remove this statement. 
				 } 
			 /** * Returns a String representation of all the PatientRecords stored within this BST in the 
			  * * increasing order, separated by a newline "\n". 
			  * For instance: * "Sarah(1/2/1935)" + "\n" + * "George(5/27/1943)" + "\n" + * "
			  * Adam(8/12/1972)" + "\n" + * "Norah(11/23/1985)" + "\n" + * "William(6/4/1998)" +
			  *  "\n" + * "Nancy(9/12/2003)" + "\n" + * "Sam(4/20/2019)" + "\n" * *
			  *   @return a String representation of all the PatientRecords stored within this BST sorted in an 
			  *   * increasing order with respect to the dates of birth of the patients (i.e. from the 
			  *   * oldest patient to the youngest patient). Returns an empty string "" if this BST is empty. */ 
			 public String toString() { 
				 //TODO Complete the implementation of this method. 
				 //[Hint]: call toStringHelper() method to help implement this behavior. return null; 
				 // remove this statement. } 
				 /** * Search for a patient record (PatientRecord) given the date of birth as lookup key. *
				  *  * @param date a String representation of the date of birth of a patient in the format mm/dd/yyyy 
				  *  * @return the PatientRecord of the patient born on date. 
				  *  * @throws a NoSuchElementException with a descriptive error message if there is no PatientRecord
				  *   * found in this BST having the provided date of birth */ 
				 public PatientRecord lookup(String date) { 
					 PatientRecord findRecord = new PatientRecord("", date); 
				 return this.lookupHelper(findRecord, root); } 
				 /** * Recursive helper method to lookup a PatientRecord given a reference PatientRecord with the same * date of birth in the subtree rooted at current * * @param findRecord a reference to a PatientRecord target we are lookup for a match in the BST * rooted at current. * @param current "root" of the subtree we are looking for a match to findRecord within it. * @return reference to the PatientRecord stored stored in this BST which matches findRecord. * @throws NoSuchElementException with a descriptive error message if there is no patient record * whose date of birth matches date, stored in this BST. */ private PatientRecord lookupHelper(PatientRecord findRecord, PatientRecordNode current) { // TODO Complete the implementation of this method return null; // remove this statement (added to let this code to compile) } /** * Computes and returns the height of this BST, counting the number of nodes (PatientRecordNodes) * from root to the deepest leaf. * * @return the height of this Binary Search Tree */ public int height() { return heightHelper(root); } /** * Recursive helper method that computes the height of the subtree rooted at current * * @param current pointer to the current PatientRecordNode within a PatientRecordTree * @return height of the subtree rooted at current, counting the number of PatientRecordNodes */ public static int heightHelper(PatientRecordNode current) { //TODO Complete this implementation of this method return 0; // remove this statement. } /** * Returns the PatientRecord of the youngest patient in this BST. * * @return the PatientRecord of the youngest patient in this BST and null if this tree is empty. */ public PatientRecord getRecordOfYoungestPatient() { //TODO Complete the implementation of this method // Feel free to implement either the iterative or the recursive version of this method. // If you choose recursion to implement this behavior, add a private helper method and call it here. return null; // added to let this incomplete code compile } /** * Returns the PatientRecord of the oldest patient in this BST. * * @return the PatientRecord of the oldest patient in this BST, and null if this tree is empty. */ public PatientRecord getRecordOfOldestPatient() { //TODO Complete the implementation of this method // Feel free to implement either the iterative or the recursive version of this method. // If you choose recursion to implement this behavior, add a private helper method and call it here. return null; // added to let this incomplete code compile } } 
					 }
		 }
	 }
 }
 }