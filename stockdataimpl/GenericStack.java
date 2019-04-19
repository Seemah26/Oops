package com.bridgelabz.stockdataimpl;

import java.util.ArrayList;

import com.bridgelabz.stock.model.StockModel;
import com.bridgelabz.stockliststack.model.StockStack;

public class GenericStack <T> {
	StockStack stack1=new StockStack();
		      private ArrayList<T> stack = new ArrayList<T> ();
		      private int top = 0;
		   
		    public int size () { return top; }
		   
		      public  void push (StockStack stockmodel) {
		        stack.add (top++, (T) stockmodel);
		     }
		  
		    public T pop () {
		       return stack.remove (--top);
		     }
		    public T peek() {
				return stack.get(top-1) ;
				
			}
		 
@Override		  
public String toString() {
	return stack1.getStockName();
	
}
}
