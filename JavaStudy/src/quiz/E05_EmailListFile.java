package quiz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E05_EmailListFile {
	// D11번 문제에 있는 기자들의 이메일들로만 이루어진 파일을 myfiles 폴더에 생성해보세요.
	public static void main(String[] args) {
		FileWriter out = null;
		try {
			out = new FileWriter("myfiles/emails.txt");
			
			Pattern p = Pattern.compile("(.+)\\s+(\\S+)\\s+([가-힣]+)\\s+((\\w*)@(\\w*(\\.\\w+)*))");
			Matcher m = p.matcher(D11_ReporterList.reporters);
			
			for (int i = 0; i < D11_ReporterList.reporters.length(); ++i) {				
				out.write(m.group(4));
				System.out.println();
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
	}
}
