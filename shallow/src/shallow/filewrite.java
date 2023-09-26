package shallow;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
public class filewrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:\\java\\file\\file1\\file2\\abc.txt");
		try {
//			FileWriter fw=new FileWriter(f);
//			fw.write("Kalai vanan is a full stack developer.");
//			fw.write("Kalai vanan is a full stack developer.");
//			fw.flush();
//			fw.close();
//			FileReader fr= new FileReader(f);
			//to print the single character
//			int asc=fr.read();
//			while(asc!=-1) {
//				System.out.print((char)asc);
//				asc=fr.read();
//			}
			//to print array of characters
//			char c[]=new char[(int)f.length()];
//			fr.read(c);
//			for(char v:c) {
//				System.out.print(v);
//			}
			FileWriter fw= new FileWriter(f);
			BufferedWriter bw= new BufferedWriter(fw);
			bw.write("Kalaivanan Full stack developer.");
			bw.newLine();
			bw.write("Mern stack developer. hai iam");
			bw.newLine();
			bw.flush();
			bw.close();
			FileReader fr= new FileReader(f);
			BufferedReader br= new BufferedReader(fr);
			String str=br.readLine();
			int senCount=0;
			int lineCount=0;
			int wordCount=0;
			int letterCount=0;
			while(str!=null) {
				lineCount++;
				letterCount=letterCount+str.length();
				
				String[] st=str.split("[.]");
				senCount=senCount+st.length;
				String ws[]=str.split(" ");
				wordCount=wordCount+ws.length;
				System.out.println(str);
				str=br.readLine();
			}
			System.out.println(senCount);
			System.out.println(lineCount);
			System.out.println(wordCount);
			System.out.println(letterCount);
			
			
		
			
		}
		catch(IOException e) {
			
		}
		

	}

}
