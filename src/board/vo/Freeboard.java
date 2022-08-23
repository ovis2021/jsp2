package board.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Freeboard {
	private int idx;
	private String writer;
	private String password;
	private String subject;
	private String Content;
	private int readCount;
	private Timestamp wdate;
	private String ip;
	private int commentCount;
	
}
