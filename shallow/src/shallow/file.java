package shallow;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
public class file {

	public static void main(String[] args){
		// TODO Auto-generated method stub
//		File ff = new File("D:\\java\\june11"); to make single folder.
//		ff.mkdir();
		//to make sub folders File ff = new File("D:\\java\\june11\\july\\august);
		//ff.mkdirs();
		//File ff = new File("D:\\java\\june11\\july\\august\\raja.txt");
		//System.out.println(ff.exists());
//		if(!ff.exists()) {
//			ff.mkdirs();
//		}
//		try {
//			if(!ff.exists())
//			ff.createNewFile();
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		//to delete a file
//		if(ff.exists())
//			ff.delete();
		//to get the list of folders we have ->list();
//		File ff= new File("D:\\java");
//		//ff.mkdir();
//		File f[]=ff.listFiles();
//		for(int i=0;i<f.length;i++) {
//			System.out.println(f[i]);
//		}
//		String s[]=ff.list();
//		for(int i=0;i<s.length;i++) {
//			    if(s[i].charAt(0)=='j')
//				System.out.println(s[i]);
//		}
	File f=new File("D:\\\\java\\\\june11\\\\july\\\\august\\\\raja.txt");
	try {
		f.createNewFile();
	}
	catch(IOException e) {
		System.out.println("file not ");
	}
	File ff= new File("D:\\\\java\\\\june11\\\\july\\\\august\\\\rani.txt");
//	f.renameTo(ff);
//	System.out.println(ff.getName());
//	System.out.println(ff.setReadOnly());
//	System.out.println(ff.canWrite());
//	System.out.println(ff.setWritable(true));
//	System.out.println(ff.canWrite());
//		String name="kalai";
//		int i=name.lastIndexOf("l");
//		System.out.println(i);
		
		
		try {
//			FileWriter fw=new FileWriter(ff);
//			fw.write("kalaivanan\n");
//			fw.write(97);
//			fw.flush();
//			fw.close();
//			FileReader fr=new FileReader(ff);
//			int asc=fr.read();
//			while(asc!=-1) {
//				System.out.println((char)asc);
//				asc=fr.read();
//				
//			}
//			
          FileWriter fw=new FileWriter(ff);
          BufferedWriter bw= new BufferedWriter(fw);
         bw.write("Full stack java developer.");
          bw.newLine();
        bw.write("Mern stack developer.");
          bw.newLine();
          bw.write("Android developer.");
          bw.flush();
          bw.close();
          FileReader fr=new FileReader(ff);
          BufferedReader br=new BufferedReader(fr);
          String str=br.readLine();
          int lineCount=0;
          int senCount=0;
          int wordCount=0;
          int charCount=0;
          while(str!=null) {
        	 
        	  String s[]=str.split("[.]");
        	  senCount=senCount+s.length;
        	  String wrd[]=str.split(" ");
        	  wordCount = wordCount+wrd.length;
        	  System.out.println(str);
        	  charCount=charCount+str.length();
        	  lineCount++;
        	  str=br.readLine();
          }
          System.out.println(lineCount);
          System.out.println(senCount);
          System.out.println(wordCount);
		System.out.println(charCount);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
		

	}

}
