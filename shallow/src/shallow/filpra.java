package shallow;
import java.io.File;
import java.io.IOException;
public class filpra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ff=new File("D:\\java\\file\\file1\\file2");
		File f2= new File("D:\\\\java");
		try {
			ff.createNewFile();
		
			ff.renameTo(f2);
			File a[]=ff.listFiles();
			for(File s:a) {
				if(s.isFile()) {
					String str=s.getName();
					int pointind=str.lastIndexOf(".");
					String ext=str.substring(pointind+1);
					if(ext.equals("txt")) {
						
					}
			}
			}
		}catch(IOException e){
			
			
		}
		

	}

}
