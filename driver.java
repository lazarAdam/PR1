import java.io.FileNotFoundException;


public class driver {
	
	
	
	public static  void main(String[] args) throws FileNotFoundException{
		
		
		FileRead obj= new FileRead("myInput.txt");
		
		obj.read(obj.getFilePath());
		
	}

}
