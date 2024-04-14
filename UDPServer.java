import java.io.*; 
import java.net.*; 
public class UDPServer { 
 public static void main(String[] args) { 
 try { 
 DatagramSocket serverSocket = new DatagramSocket(9876); 
 byte[] receiveData = new byte[1024]; 
 DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length); 
 serverSocket.receive(receivePacket); 
 String message = new String(receivePacket.getData(), 0, receivePacket.getLength()); 
 System.out.println("Received from client: " + message); 
 serverSocket.close(); 
 } catch (IOException e) { 
 e.printStackTrace(); 
 } 
 } 
} 

