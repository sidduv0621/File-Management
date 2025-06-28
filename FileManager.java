import java.io.*;
public class FileManager
{
    public static void main(String[] args) 
    {
		File myfile= new File("notes.txt");
		try{if(myfile.createNewFile())
		{
			System.out.println("File created successfully!!!");
		}
		else
		{
			System.out.println("File creation error.");
		}

		String data="Siddharth, an intern at ELEVATE LABS!!!";
		FileWriter fw=new FileWriter("notes.txt");
		fw.write(data);
		fw.close();
		System.out.println("File written successfully!!!");
		
		
		char[] ch=new char[100];
		FileReader reader=new FileReader("notes.txt");
		reader.read(ch);
		System.out.println("Data recieved successfully from file!!!");
		System.out.println(ch);
		reader.close();
		}
		catch(IOException ex){
            System.out.println("File exception...");
		}
}
}































		