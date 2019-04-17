package com.bridgelabz.util;


	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class FunctionalLogic {

		
		/**
		 * scanner inputs
		 */
		private static Scanner scanner=new Scanner(System.in);
		public static int getInt() {
			return scanner.nextInt();
		}
		public static String getString() {
			return scanner.next();
		}
		public static double getDouble() {
			return scanner.nextDouble();
		}
		
		
		
		/**String replace
		 * @param sentance
		 * @param userName
		 * @return
		 */
		public static String replaceUserName(String sentance, String userName) {

			final String REGEX_USERNAME="<<userName>>";
		    Pattern p=Pattern.compile(REGEX_USERNAME);
			Matcher m=p.matcher(sentance);
			String message=m.replaceFirst(userName);
			return message;
			
			//sentance=sentance.replaceAll(REGEX_USERNAME, userName);
		    //System.out.println(sentance);
			//return sentance;
		}
		

		
		public static  void Username(String s1 ,String s2,String s3) {
			if(s2.length()>3)
			{
				String s4 = s2.replaceAll(s1, s3);
				System.out.println(s4);
		
			}
			else
				System.out.println("please enter atleast three ");
		}
		//leap year 
		public static boolean LeapYear2(int year) {
			//condition to check leap year 
			if(((year%4==0)&&(year%100!=0))||(year%400==0))
				return true;
			else
				return false;
		}
		
		/*prime factor 
		 */
		public static void generateFactors(int n) 
		{
			while(n%2==0) {
				System.out.println(2+" ");
				n=n/2;
			}
			for(int i=3;i*i<=n ;i=i+2)
			{
				while(n%i==0)
				{
					System.out.println(i+"");
					n=n/i;
				}
			}if(n>2)
				System.out.println(n);

		}
		/*flip coin
		 */
		public static void Toss(int flips) {
			int heads = 0;
			int tails = 0;
			int counter = 0;
			double result;
			while(counter<flips)
			{
				result=Math.random();
				if(result<0.5) {
			                 tails++;
				}else
				{
					heads++;	
				}
				counter++;
			}
			System.out.println("Number of heads :" +heads);
			System.out.println("Number of tails :" +tails);
			double percent_head=heads*100/flips;
			double percent_tail=tails*100/flips;
			System.out.println("percentage of heads: "+percent_head);
			System.out.println("percentage of tails: "+percent_tail);
		}

		//generating harmonic_series 
		public static void generate_harmonicseries(int n) {
			// TODO Auto-generated method stub
			float h = 1; 
			for (int i =2; i<= n; i++) { 
				h += (float)1 / i;
			} 
			System.out.println(h);  
		}
		//power

		public static void power(int n) {
			
			int i = 0;
			int power = 1;
			if(n<31) {
				System.out.println("Powers of 2 that are less than 2^"+n);
				while (i <= n)
				{
					System.out.println("2^"+i+" = " + power);
					power = power * 2;
					i++;
				}
			}
			else 
				System.out.println("overflow of int range");	
		}		
		//gambler
		public static void gambler_function(int stake,int goal,int trials) {

			int wins = 0;        // total number of games won
			int lose = 0;
			// repeat trials times
			for (int t = 0; t < trials; t++) {
				int cash = stake;
				while (cash > 0 && cash < goal) {

					if (Math.random() < 0.5)
						cash++;     // win 
					else                   
						cash--;     // lose 
				}
				if (cash == goal) wins++; 
				else lose++;
			}

			// print results
			System.out.println(wins + " wins of " + trials);
			System.out.println("Percent of games won = " + 100.0 * wins / trials);
			System.out.println("Percent of games lose = " + 100.0 * lose / trials);

		}
		//function to calculate roots
		public static double[] findRoots(int a, int b, int c) {
			double root1=0.0, root2=0;
			double arr[]=new double [2];
			
			//res=b^2-4ac
			double res = b*b-4*a*c;
			if(res > 0) {
				root1 = (-b + Math.sqrt(res))/(2*a);
				root2 = (-b - Math.sqrt(res))/(2*a);
				System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
			}
			else if(res == 0) {
				root1 = root2 = -b/(2*a);
				System.out.format("root1 = root2 = %.2f;", root1);
			}
			// If roots are not real
			else {
				double realPart = -b/(2*a);
				double imaginaryPart = Math.sqrt(-res) / (2*a);
				System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
			}
			arr[0]=root1;
			arr[1]=root2;
			return arr;
		}
		//2D Array
		public static Object[][] array(int row, int col) {
			Object arr[][] = new Object[row][col];
			try {
				Integer i,j;
				System.out.print("Enter " +(row*col)+ " Array Elements : ");
				
				for( i=0; i<row; i++)
				{
					for( j=0; j<col; j++)
					{
						System.out.println("Enter next num");
						System.out.println("arr [ "+i+" ]"+"[ "+j+" ]");
						arr[i][j] =getString();
					}
				}
				System.out.print("The Array is :\n");
				System.out.println();
				for(i=0; i<row; i++)
				{
					for(j=0; j<col; j++)
					{
						System.out.print(arr[i][j]+ "    ");
					}
					System.out.println();
				} 
			}catch(Exception ds) {
				ds.fillInStackTrace();
	           System.out.println("Exception Occured");
			}
			return arr;
		}

		//sum of three integer to zero
		public static boolean find(int n) {
			int arr[]=new int[n];
			boolean found =false;
			System.out.println("enter the values of array");
			for(int i=0;i<n;i++) {
				arr[i]=getInt();
			}
			System.out.println("resultant value");
			
			for (int i=0; i<n-2; i++) 
			{ 
				for (int j=i+1; j<n-1; j++) 
				{ 
					for (int k=j+1; k<n; k++) 
					{ 
						if (arr[i]+arr[j]+arr[k] == 0) 
						{ 
							System.out.print(arr[i]+" "); 
							System.out.print(arr[j]+" ");
							System.out.print(arr[k]); 
							System.out.print("\n"); 
						 found =true; 
						}
	      
					} 
			    }
		}
			
			return found;
			
			} 
			// If no triplet with 0 sum found in array 
		      

		
		// coupon collector
		public  static int getCoupon(int n) {
			return (int) (Math.random() * n);		
		}
		public static int collect(int n) {
			
			boolean[] isCollected = new boolean[n];   // isCollected[i] = true if card type i already collected
			int count = 0;                         // number of cards collected
			int distinct  = 0;                     // number of distinct card types collected
			while (distinct < n) {
				
				int value = getCoupon(n);   
				System.out.println(value);
				count++;                            
				if (!isCollected[value]) {           
					distinct++;
					isCollected[value] = true;
				}
			}
		    return count ;
		}
		
		//stop watch 
		public static double elapse(long start, long end) {
			// TODO Auto-generated method stub
			 return (end - start);
		}
		//
		/**permutation
		 * @param x
		 * @param y
		 * @return
		 */
		public static double calculateDistance(int x,int y) {
			 double distance = Math.sqrt(x*x + y*y);
			return distance;	
		}
		
		//wind chill
		public static double wind(double t, double v) {
			
			double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
			return w;	
		}
		
		
		/**permutation
		 * @param s
		 * @param n
		 * @param r
		 */
		public static void permute(String s, int n, int r) 
	    { 
	        if (n == r) 
	            System.out.println(s); 
	        else
	        { 
	            for (int i = n; i <= r; i++) 
	            { 
	                s = swap(s,n,i); 
	                permute(s, n+1, r); 
	                s= swap(s,n,i); 
	            } 
	        } 
	    } 
	  
	    public static String swap(String a, int i, int j) 
	    { 
	        char temp; 
	        char[] ch = a.toCharArray(); 
	        temp = ch[i] ; 
	        ch[i] = ch[j]; 
	        ch[j] = temp; 
	        return String.valueOf(ch); 
	    }
	    
	    
	    
	    //tic tac toe

	    static final int USER = 1;
	           static final int EMPTY = 0;
	      	 static final int NONE = 0;
	        
	          static final int COMPUTER = 2;
	    static final int STALEMATE = 3;

	    public static char printChar(int b) {
	    	switch(b) {
	    	case EMPTY:
	    	    return ' ';
	    	case USER:
	    	    return 'X';
	    	case COMPUTER:
	    	    return 'O';
	    	}
	    	return ' ';
	        }

	        // See if the game is over
	        public static int checkWinner(int[][] board) {
	    	// Check if someone won
	    	// Check horizontals

	    	// top row
	    	if((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]))
	    	    return board[0][0];

	    	// middle row
	    	if((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]))
	    	    return board[1][0];

	    	// bottom row
	    	if((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]))
	    	    return board[2][0];

	    	// Check verticals

	    	// left column
	    	if((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]))
	    	    return board[0][0];

	    	// middle column
	    	if((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]))
	    	    return board[0][1];

	    	// right column
	    	if((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]))
	    	    return board[0][2];

	    	// Check diagonals
	    	// one diagonal
	    	if((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
	    	    return board[0][0];

	    	// the other diagonal
	    	if((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))
	    	    return board[0][2];

	    	// Check if the board is full
	    	if(board[0][0] == EMPTY || 
	               board[0][1] == EMPTY || 
	               board[0][2] == EMPTY || 
	    	   board[1][0] == EMPTY ||
	    	   board[1][1] == EMPTY ||
	    	   board[1][2] == EMPTY ||
	    	   board[2][0] == EMPTY ||
	    	   board[2][1] == EMPTY ||
	    	   board[2][2] == EMPTY)
	    	    return NONE;

	    	return STALEMATE;
	        }

	        // Generate a random computer move
	        public static int computer_move(int[][] board) {
	    	int move = (int)(Math.random()*9);

	    	while(board[move/3][move%3] != EMPTY) 
	    	    move = (int)(Math.random()*9);

	    	return move;
	        }
	    

}
