package shallow;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class InputStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream is=new FileInputStream("D:\\java\\file\\file1\\file2\\cycle"
					+ "ass1.jpg");
			OutputStream os=new FileOutputStream("D:\\java\\file\\file1\\file2\\cycle.jpg");
			int con=is.read();
			while(con!=-1) {
				os.write(con);
				con=is.read();
			}
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
