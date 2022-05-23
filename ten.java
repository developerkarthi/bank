import java.io.*;
import java.util.*;
public class ten {
	public static void main(String args[]) throws IOException
	{	dem a = new dem();    a.writeing();      a.Reading();
	}}
class dem
{File f = new File("D:\\abc.txt");
	void writeing() throws IOException
	{	Scanner in=new Scanner(System.in);
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		if(f.exists())
		{}
		else {
		f.createNewFile();
		}
		System.out.println("Enter code number : "); 
		int code = in.nextInt();
		System.out.println("Enter the number of Itms : "); 
		int item = in.nextInt();
		System.out.println("Enter product cost : "); 
		int cost = in.nextInt();
		System.out.println("Enter product name : ");
		String na = in.nextLine(); String name = in.nextLine();
		double total = item*cost;
		bw.write(String.valueOf(code)+"       ");
		bw.write(String.valueOf(item)+"       ");
		bw.write(String.valueOf(cost)+"       ");
		bw.write(String.valueOf(total)+"       ");
		bw.write(name);
		bw.newLine();
		bw.flush();
		bw.close();	
	}
	void Reading() throws FileNotFoundException
	{		Scanner read = new Scanner(f);
		System.out.println("Code     N_item     Cost     Total     P_name");
		System.out.println("------------------------------------------------");
		while(read.hasNextLine())
		{
			System.out.println(read.nextLine());
		}
		read.close();
	}}
