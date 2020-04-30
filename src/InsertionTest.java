import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InsertionTest {

	public static void main(String[] args) {	
		String[] str = new String[19];
		int[] Int = new int[19];
		int i = 0;
		
	        try{
	            //파일 객체 생성
	            File file = new File("C:\\Users\\junwo\\OneDrive\\바탕 화면\\movie1.txt");
	            //입력 스트림 생성
	            FileReader filereader = new FileReader(file);
	            //입력 버퍼 생성
	            BufferedReader bufReader = new BufferedReader(filereader);
	            String line = "";
	            while((line = bufReader.readLine()) != null){
	            		str[i] = line.split("\t")[0];
	            		Int[i] = Integer.parseInt(line.split("\t")[1]);
	            		i++;
	            }
	            //.readLine()은 끝에 개행문자를 읽지 않는다.            
	            bufReader.close();
	        }catch (FileNotFoundException e) {
	            // TODO: handle exception
	        }catch(IOException e){
	            System.out.println(e);
	        }	
		
		Movie[] hitMovies = new Movie[19];
		for(int j=0; j<19; j++) {
			hitMovies[j] = new Movie(str[j], Int[j]);
		}

		Insertion.sort(hitMovies, new Movie.YearNameOrder());
		
		for(Movie m: hitMovies) 
			System.out.println(m);
		
	}

}
