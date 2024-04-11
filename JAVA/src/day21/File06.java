package day21;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File06 {

	public static void main(String[] args) {
		//파일이 가지고 있는 정보 출력
		File f = new File("C:\\YJM\\eclipse-workspace\\JAVA\\test.txt");
		String name = f.getName(); // 경로를 제외한 이름
		System.out.println(name);
		System.out.println(f.getPath());//경로 + 이름
		System.out.println(f.getParent());//경로만
		System.out.println(File.separator);//파일구분자
		
		String f2 = f.toString();
		System.out.println(f2);
		//f2를 기준으로 파일명만 추출
		String fileName = f2.substring(f2.lastIndexOf(File.separator)+1);
		System.out.println(fileName);

	}

	public void filePrint() throws IOException{
		//StringBuffer 객체
		//.append : 기존 String에 데이터 추가 가능.
		//파일 출력
		FileWriter fs = new FileWriter("friendList.txt");
		BufferedWriter bw =new BufferedWriter(fs);
		
		StringBuffer sb= new StringBuffer();
		//sb.append : 기존 String에 데이터 추가
		String data = null;
		sb.append("--단어장--");
		sb.append("\r\n");//줄 바꿈
		
//		for(String key : map.keySet()) {
//			sb.append(key+":"+map.get(key));
//			sb.append("\r\n");
//			
//		}
		
		data = sb.toString(); //String Buffer 객체여서 String 객체로 변환
		System.out.println(data);
		bw.write(data);
		if(bw!=null) {
			bw.close();
		}
		
		if(fs!=null) {
			fs.close();
		}
	}
	
	
}
