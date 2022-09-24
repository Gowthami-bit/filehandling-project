package mypackage;

	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;

	public class filehandling {
	static final String Projectpath="C:\\Users\\pasumarthi haritha\\eclipse-workspace\\simplilearn\\src\\mypackage";
		public static void main(String[] args) throws IOException 
		{
			Scanner Obj=new Scanner(System.in);
			int choice;
			do
			{
			displayMenu();
			System.out.println("Enter your choice");
			choice=Integer.parseInt(Obj.nextLine());
			switch(choice)
			{
			case 1:getallfiles();
			break;
			case 2:createfile();	
			break;
			case 3:deletefiles();
			break;
			case 4:searchfiles();
			break;
			case 5:System.exit(0);
			break;
		    default:System.out.println("invalid option");
		    break;
			}
			Obj.next();
			}
		    while(choice>0);
			
		    
		}
	public static void displayMenu()
	{


		System.out.println("Name: gowthami.k\t\t");
		System.out.println("1 To display all the files");
		System.out.println("2.Adding files to the existing directory");
		System.out.println("3.Deleting the file");
		System.out.println("4.Searching the file");
		System.out.println("5.Exit");
		System.out.println("********************************************************");
	}

	public static void getallfiles()

	{
		File[] listoffiles=new File(Projectpath).listFiles();
		if(listoffiles.length==0)
			System.out.println("No files exist in the directory");
		else
		{
			for(var l:listoffiles)
			{
				System.out.println(l.getName());
			}
		}

		
		
	}
	public static void createfile() throws IOException
	{
		try
		{
		Scanner obj=new Scanner(System.in);
		String fileName;
		int linesCount;
		
		System.out.println("Enter the filename");
		fileName=obj.nextLine();
		System.out.println("Enter how many line you want to add in the file");
		linesCount=Integer.parseInt(obj.nextLine());
		FileWriter fw=new FileWriter(Projectpath+"\\"+fileName);
		
			for(int i=1;i<=linesCount;i++)
			{
			System.out.println("Enter the content");
			fw.write(obj.nextLine()+"\n");
			}
			System.out.println("File was created ");
			fw.close();
		}
		catch(Exception ex)
		{
			System.out.println("some error occured");
		}
				
	}
	public static void deletefiles()
	{
		Scanner obj=new Scanner(System.in);
		try
		{
			String fileName;
			System.out.println("Enter the filename to delete");
			fileName=obj.nextLine();
			
			File fileName1=new File(Projectpath+"\\"+fileName);
			if(fileName1.exists())
			{
				fileName1.delete();
				System.out.println("File deleted successfully");
			}
			else
			{
			System.out.println("file doesn't exists");	
			}}
			catch(Exception ex)
			{
				
				System.out.println("Exception error");
		}
	}
	public static void searchfiles()
	{
		//search Files 

			Scanner obj=new Scanner(System.in);
			try
			{
				String fileName;
				System.out.println("Enter the filename to search");
				fileName=obj.nextLine();
				
				File fileName1=new File(Projectpath+"\\"+fileName);
				if(fileName1.exists())
				{
					System.out.println(" file was searched");
				}
				else
				{
				System.out.println("File doesn't exists");	
				}}
				catch(Exception ex)
				{
					
					System.out.println("Exception error");
			}
		}
	}
		
