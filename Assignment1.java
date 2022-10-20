package jfsc;

public class Assignment1 {

	public static void main(String[] args) {

		int i, j;
		int n =8;

		for (i = 0; i < n; i++) {

//			Printing N
			
			for (j = 0; j < n; j++) {
				if((j==0||j==n-1)||(i==j&&j<=n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			for (j = 0; j <n/4; j++) {
				
					System.out.print(" ");
				
			}
			
			
			
//			Printing A
			
			for (j = 0; j < n; j++) {
				if((i==0&&j>0&&j<(3*n)/4)||(j==0&&i>0)||(i==n/2&&j<(3*n)/4)||(j==(3*n)/4&&i>0)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
//			Printing S
			
			for (j = 0; j < n; j++) {
				if(
						(i==0&&j>0&&j<(3*n)/4)
						||(j==0&&i>0&&i<=(n-1)/2)
						||(i==n/2&&j>0&&j<(3*n)/4)
						||(i==n-1&&j<(3*n)/4)
						||(j==(3*n)/4&&i>n/2&&i<n-1))
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}

//			Printing E
			
			for (j = 0; j < n; j++) {
				if(
						j==0||
						(i==0&&j<(3*n)/4)||
						(i==n/2&&j<n/2)||
						(i==n-1&&j<(3*n)/4)
						
				  )
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
//			Printing E
			
			for (j = 0; j < n; j++) {
				if(
						j==0||
						(i==0&&j<(3*n)/4)||
						(i==n/2&&j<n/2)||
						(i==n-1&&j<(3*n)/4)
						
				  )
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
//			Printing M
			
			for (j = 0; j < n; j++) {
				if(
					j==0||
					(j==n-1)||
					(i==j&&i<n/2)||
					(i+j==n-1&& i<n/2)
					
				  )
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			
			
//			Printing just spaces
			
			for (j = 0; j < n; j++) {
					System.out.print(" ");	
			}
			
			
//			Printing INEURON
			
//			printing I
			
			for (j = 0; j < n; j++) {
				if(
				 
						(i==0 && j<n-1)||
						(i==n-1 && j<n-1)||
						(j==(n-1)/2)
					
				  )
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
//			printing N
			
			for (j = 0; j < n; j++) {
				if(
				 
						(j==0||i==j||j==n-1)
					
				  )
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			for(j=0;j<n/4;j++) {
				System.out.print(" ");
			}
			
//			printing E
			
			for (j = 0; j < n; j++) {
				if(
				 
						j==0||
						(i==0&&j<(3*n)/4)||
						(i==n/2&&j<n/2)||
						(i==n-1&&j<(3*n)/4)
					
				  )
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
//			printing U
			
			for (j = 0; j < n; j++) {
				if(
				 
						(j==0&&i<n-1)||
						(i==n-1&&j>0&&j<(3*n)/4)||
						(j==(3*n)/4&&i<n-1)
					
				  )
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			
			
//			printing R
			
			for (j = 0; j < n; j++) {
				if(
				 
//						j==0||
//						(i==0&&j<=n/2)||
//						(j==(3*n)/4&&i>0&&i<n/2)||
//						(i==n/2&&j<=n/2)||
//						(i==j&&i>n/2)
						
						j==0||
						(i==0&& j>0&& j<=(3*n)/4-1)||
						(j==(3*n)/4&&i>0&&i<n/2)||
						(i==n/2&&j<=(3*n)/4-1)||
						(i==j&&i>n/2)	
				  )
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			
			for (j = 0; j <n/4-1; j++) {
				
				System.out.print(" ");
			
		}
			
//			printing o
			
			for (j = 0; j < n; j++) {
				if(
				 	(i==0&&j>0&&j<(3*n)/4)||
				 	(j==0&&i>0&&i<n-1)||
				 	(i==n-1&&j>0&&j<(3*n)/4)||
				 	(j==(3*n)/4&&i>0&&i<n-1)
				  )
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			
//			printing N
			
			for (j = 0; j < n; j++) {
				if(
				 
						(j==0||i==j||j==n-1)
					
				  )
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
}
