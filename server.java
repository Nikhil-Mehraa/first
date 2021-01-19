package socket;

import java.io.*;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

public class server {
	public static void main (String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(4000) ;
		Socket s = ss.accept();
		System.out.println("client connected");
		InputStreamReader in = new InputStreamReader(s.getInputStream()) ;
		BufferedReader bf = new BufferedReader(in) ;
		String str = bf.readLine() ;
		System.out.println("Client "+str);
		String pathname = str;
		File file = new File(pathname);
		Scanner sc = new Scanner(file) ;
		String out= sc.nextLine();
		System.out.println(out);
				
	}

}
