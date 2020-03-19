package com.hust.soict.k.client_server;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException{
		// TODO Auto-generated method stub
		Socket socket = new Socket("127.0.0.1", 9898);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		System.out.println(in.readLine());
		String message;
		do {
			System.out.println("Enter the sequence of numbers: ");
			Scanner scanner = new Scanner(System.in);
			message = scanner.nextLine();
			System.out.println("The sequence of numbers after being sorted: ");
			out.println(message);
			System.out.println(in.readLine());
		} while(!message.contentEquals(""));
		socket.close();
	}
}
