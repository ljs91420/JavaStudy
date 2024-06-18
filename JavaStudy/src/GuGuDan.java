import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GuGuDan {
	public static void main(String[] args) {
		FileWriter out = null;
		try {
			out = new FileWriter("myfiles/gugudan.txt");
			
			for (int i = 2; i <= 9; ++i) {
				for (int j = 1; j <= 9; ++j) {
					out.write(String.format("%d * %d = %2d\t", i, j, i * j));
				}
				out.write("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileReader in = null;
		try {
			in = new FileReader("myfiles/gugudan.txt");
			
			char[] buff = new char[1];
			int len;
			while ((len = in.read(buff)) != -1) {
				System.out.printf("%s", new String(buff, 0, len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
