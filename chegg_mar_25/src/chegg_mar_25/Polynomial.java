package chegg_mar_25;

import java.util.*;

public class Polynomial extends AbstractPolynomial {
	public Polynomial(String s) {
// complete this code
	}

	public Polynomial() {
		super();
	}

	public AbstractPolynomial add(AbstractPolynomial p) {
		AbstractPolynomial ans = new Polynomial();
// complete this code
		return ans;
	}

	public AbstractPolynomial subtract(AbstractPolynomial p) {
		AbstractPolynomial ans = new Polynomial();
// complete this code
		return ans;
	}

	public AbstractPolynomial multiply(AbstractPolynomial p) {
		AbstractPolynomial ans = new Polynomial();
// complete this code
		return ans;
	}

	/****************
	 * MAIN FUNCTION
	 ****************/

	public static void main(String args[]) throws Exception {
//Variables
		Scanner scnr = new Scanner(System.in);
		AbstractPolynomial p, q;
		String testInput = "";
//Custom test case
		if (scnr.hasNext()) {
			testInput = scnr.nextLine();
			p = new Polynomial(testInput);
			testInput = scnr.nextLine();
			q = new Polynomial(testInput);
			System.out.println("User Input\n***************************");
			Utility.run(p, q);
		}
//Default test case
		else {
			p = new Polynomial(" X^5");
			q = new Polynomial("X^2 - X + 1");
			System.out.println("Default Input\n***************************");
			Utility.run(p, q);
		}
	}
}

//AbstractPolynomial.java

abstract class AbstractPolynomial {
	DList<Term> data = null;

	public AbstractPolynomial() {
		data = new DList<>();
	}

	public final String toString() {
		String ans = "";
		boolean starting = true;
		try {
			DNode<Term> n = data.getFirst();
			while (n != null) {
				if (!starting && n.getData().isPositive())
					ans += " +";
				starting = false;
				ans += " " + n.getData().toString();
				n = data.getNext(n);
			}
		} catch (Exception e) {
			if (starting)
				return "0";
		}
		return ans;
	}

	abstract public AbstractPolynomial add(AbstractPolynomial p);

	abstract public AbstractPolynomial subtract(AbstractPolynomial p);

	abstract public AbstractPolynomial multiply(AbstractPolynomial p);
}

//---------------------------------------------------

// DNode.java

class DNode<T> {
	private T data;
	private DNode<T> prev, next;

	public DNode(T d, DNode<T> p, DNode<T> n) {
		data = d;
		next = n;
		prev = p;
	}

	public T getData() {
		return data;
	}

	public DNode<T> getNext() {
		return next;
	}

	public DNode<T> getPrev() {
		return prev;
	}

	public void setData(T d) {
		data = d;
	}

	public void setNext(DNode<T> n) {
		next = n;
	}

	public void setPrev(DNode<T> p) {
		prev = p;
	}
}

//---------------------------------------------------------------

// DList.java

class DList<T> {
	private DNode<T> header, trailer;
	private int size;

	public DList() {
		size = 0;
		header = new DNode<T>(null, null, null);
		trailer = new DNode<T>(null, header, null);
		header.setNext(trailer);
	}

// utility methods

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

// give clients access to nodes, but not to the header or trailer

	public DNode<T> getFirst() throws Exception {
		if (isEmpty())
			throw new Exception("Empty");
		return header.getNext();
	}

	public DNode<T> getLast() throws Exception {
		if (isEmpty())
			throw new Exception("Empty");
		return trailer.getPrev();
	}

	public DNode<T> getNext(DNode<T> v) throws Exception {
		DNode<T> ans = v.getNext();
		if (ans == null || ans == trailer)
			throw new Exception("No such node");
		return ans;
	}

	public DNode<T> getPrev(DNode<T> v) throws Exception {
		DNode<T> ans = v.getPrev();
		if (ans == null || ans == header)
			throw new Exception("No such node");
		return ans;
	}

// methods to change the list

	public void addBefore(T d, DNode<T> v) {
		DNode<T> u = v.getPrev();
		DNode<T> x = new DNode<T>(d, u, v);
		u.setNext(x);
		v.setPrev(x);
		size++;
	}

	public void addAfter(T d, DNode<T> v) {
		DNode<T> w = v.getNext();
		DNode<T> x = new DNode<T>(d, v, w);
		v.setNext(x);
		w.setPrev(x);
		size++;
	}

	public void addFirst(T d) {
		addAfter(d, header);
	}

	public void addLast(T d) {
		addBefore(d, trailer);
	}

	public T remove(DNode<T> v) throws Exception {
		if (v == header || v == trailer)
			throw new Exception("Sentinel");
		DNode<T> u = v.getPrev();
		DNode<T> w = v.getNext();
		w.setPrev(u);
		u.setNext(w);
		size--;
		return v.getData();
	}

// LinkedList testing methods:

	public String toString() {
		String ans = "";
		DNode<T> n = header;
		ans += "(H)<-->";
		do {
			n = n.getNext();
			if (n == trailer)
				ans += "(T)";
			else
				ans += (n.getData() + "<-->");
		} while (n != trailer);
		return ans;
	}
}

//-----------------------------------------------

//Term.java

class Term {

	Double coefficient;
	int degree;

	public Term() {
		this(null, 0);
	}

	public boolean isPositive() {
		return coefficient > 0;
	}

	public Term(Double coefficient, int degree) {
		this.coefficient = coefficient;
		this.degree = degree;
	}

	public Double getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(Double coefficient) {
		this.coefficient = coefficient;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public String toString() {
		String ans = "";
		if (coefficient.doubleValue() == 0)
			return "";
		if (degree == 0)
			return coefficient.toString();
		if (coefficient != 1) {
			if (coefficient == -1)
				ans += "-";
			else
				ans += coefficient + " ";
		}
		ans = ans + "X";
		if (degree == 1)
			return ans;
		return ans + "^" + degree;
	}
}

//---------------------------------------------------

//Utility.java

class Utility {
	public static void run(AbstractPolynomial p, AbstractPolynomial q) throws Exception {
		System.out.println("Polynomials\np = " + p + "\nq = " + q);
		System.out.println("Sum " + p.add(q));
		System.out.println("Difference " + p.subtract(q));
		System.out.println("Product " + p.multiply(q));
	}
}
