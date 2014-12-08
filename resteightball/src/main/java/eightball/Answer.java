package eightball;

import java.util.ArrayList;
import java.util.Random;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Answer {
	static  final Logger LOG = LoggerFactory.getLogger(Answer.class);
	
	private final long id;
	private String question;
	
	public Answer (long id, String question){
		this.id = id;
		this.question = question;
		LOG.debug(question );
		LOG.info(question);
	}
	
	public String getQuestion() {
		return question;
	}
	
	public long getId() {
		return id;
	}
	public String getResult(){
		Random rand = new Random();
		ArrayList<String> result = new ArrayList<String>(20);
		result.add(0, "As I see it, yes");
		result.add(1, "It is certain");
		result.add(2, "It is decidedly so");
		result.add(3, "Most likely");
		result.add(4, "Outlook good");
		result.add(5, "Signs point to yes");
		result.add(6, "Without a doubt");
		result.add(7, "Yes");
		result.add(8, "Yes - definitely");
		result.add(9, "You may rely on it");
		result.add(10, "Reply hazy, try again");
		result.add(11, "Better not tell you now");
		result.add(12, "Cannot predict now");
		result.add(13, "Concentrate and ask again");
		result.add(14, "Don't count on it");
		result.add(15, "My reply is no");
		result.add(16, "My sources say no");
		result.add(17, "Outlook not so good");
		result.add(18, "Very doubtful");
		result.add(19, "Ask again later");

		int iNum = rand.nextInt(20);
		LOG.debug(result.get(iNum).toString());
		return result.get(iNum).toString();

		
	}
}
