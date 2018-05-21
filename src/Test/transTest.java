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
	
	@Test
	public void translateEngで25を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "twentyfive";
		String actual = ite.translateEng(25);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで30を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "thirty";
		String actual = ite.translateEng(30);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで35を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "thirtyfive";
		String actual = ite.translateEng(35);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで40を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "fourty";
		String actual = ite.translateEng(40);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで45を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "fourtyfive";
		String actual = ite.translateEng(45);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで50を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "fifty";
		String actual = ite.translateEng(50);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで55を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "fiftyfive";
		String actual = ite.translateEng(55);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで60を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "sixty";
		String actual = ite.translateEng(60);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで65を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "sixtyfive";
		String actual = ite.translateEng(65);
		assertThat(actual, is(expected));
	}

}
