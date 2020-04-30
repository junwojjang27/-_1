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
	            //���� ��ü ����
	            File file = new File("C:\\Users\\junwo\\OneDrive\\���� ȭ��\\movie1.txt");
	            //�Է� ��Ʈ�� ����
	            FileReader filereader = new FileReader(file);
	            //�Է� ���� ����
	            BufferedReader bufReader = new BufferedReader(filereader);
	            String line = "";
	            while((line = bufReader.readLine()) != null){
	            		str[i] = line.split("\t")[0];
	            		Int[i] = Integer.parseInt(line.split("\t")[1]);
	            		i++;
	            }
	            //.readLine()�� ���� ���๮�ڸ� ���� �ʴ´�.            
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
