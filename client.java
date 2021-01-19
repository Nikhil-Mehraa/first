package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client {
	public static void main (String[] args) throws IOException {
		Socket s = new Socket("localhost",4000) ;
		
	
		PrintWriter pr = new PrintWriter(s.getOutputStream()) ;
		
		Scanner sc = new Scanner (System.in) ;
		String st  = sc.next() ;
		pr.println(st);
		pr.flush();
	}


}
