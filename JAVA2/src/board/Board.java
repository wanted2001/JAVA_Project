package board;

import java.time.LocalDate;

public class Board {
	
	private int num;
	private String title;
	private String content;
	private String writer;
	private LocalDate writetime;
	
	public Board() {}
	public Board(int num, String title, String content, String writer, LocalDate now) {
		this.num = num;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writetime = now;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public LocalDate getWritetime() {
		return writetime;
	}
	public void setWritetime(LocalDate writetime) {
		this.writetime = writetime;
	}
	@Override
	public String toString() {
		return "번호: " + num + ", 제목: " + title + ", 내용: " + content + ", 작성자: " + writer + ", 작성일: "
				+ writetime;
	}

	
	

}
