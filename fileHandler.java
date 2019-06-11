import java.io.File;
import java.io.FileNotFoundException;


public abstract class fileHandler {

	private File filePath;
	private int fileNum;
	
	
	public fileHandler( String path){
		
		this.filePath = new File(path);
		
		this.fileNum++;
		
	}
	
	public File getFilePath() {
		return filePath;
	}
	public void setFilePath(File filePath) {
		this.filePath = filePath;
	}
	public int getFileNum() {
		return fileNum;
	}
	public void setFileNum(int fileNum) {
		this.fileNum = fileNum;
	}
	
	abstract public void read(File file) throws FileNotFoundException;
	
	abstract public void write() throws FileNotFoundException;
}
