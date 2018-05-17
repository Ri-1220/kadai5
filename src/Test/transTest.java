package Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import kadai5.IntToEng;

public class transTest {

	@Test
	public void translateEngで5を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "five";
		String actual = ite.translateEng(5);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで10を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "ten";
		String actual = ite.translateEng(10);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで15を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "fifteen";
		String actual = ite.translateEng(15);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで20を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "twenty";
		String actual = ite.translateEng(20);
		assertThat(actual, is(expected));
	}

}
