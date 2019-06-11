import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class FileRead extends fileHandler{

public FileRead(String Path) {
	
	
		super(Path);
		
	}
private	ArrayList<employee> list = new ArrayList<employee>();
	
	
	@Override
	public void  read(File file) throws FileNotFoundException {
		
		Scanner sc = new Scanner(file);
		
		
			while(sc.hasNextLine()){
				
		employee emp = new employee();
		
		String line = sc.nextLine();
		String[] tokens = line.split("\t");
		
		emp.setEmpId(Integer.parseInt(tokens[0]));
		emp.setfName(tokens[1]);
		emp.setLname(tokens[2]);
		emp.setRole(tokens[3]);
		emp.setSalary(Integer.parseInt(tokens[4]));
		emp.setTeam(tokens[5]);
		
		
				this.list.add(emp);
			}
		

	write();
			
	}
	@Override
	public void write() throws FileNotFoundException {
	
		File newfile = new File("MyOutput.txt");		
		
		PrintWriter OutPut = new PrintWriter(newfile);
		
		String newLine="";
		
		for(int i=0;i<this.list.size();i++){
			
			newLine = this.list.get(i).getfName() +"\t"+ list.get(i).getLname()
					+"\t"+list.get(i).getEmpId()+"\t"+list.get(i).getRole()
					+"\t"+list.get(i).getSalary()+"\t"+list.get(i).getTeam();
			
			OutPut.write(newLine+"\r\n");
		}
		
		OutPut.write("end of work");
		
		OutPut.close();
	}

	
	
	

}
