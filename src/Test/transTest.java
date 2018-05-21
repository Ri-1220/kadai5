package Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import kadai5.IntToEng;

public class transTest {

	@Test
	public void translateEngで5を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "Five";
		String actual = ite.translateEng(5);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで10を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "Ten";
		String actual = ite.translateEng(10);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで15を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "Fifteen";
		String actual = ite.translateEng(15);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで20を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "Twenty";
		String actual = ite.translateEng(20);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで25を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "TwentyFive";
		String actual = ite.translateEng(25);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで30を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "Thirty";
		String actual = ite.translateEng(30);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで35を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "ThirtyFive";
		String actual = ite.translateEng(35);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで40を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "Fourty";
		String actual = ite.translateEng(40);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで45を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "FourtyFive";
		String actual = ite.translateEng(45);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで50を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "Fifty";
		String actual = ite.translateEng(50);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで55を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "FiftyFive";
		String actual = ite.translateEng(55);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで60を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "Sixty";
		String actual = ite.translateEng(60);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで65を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "SixtyFive";
		String actual = ite.translateEng(65);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで70を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "Seventy";
		String actual = ite.translateEng(70);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで75を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "SeventyFive";
		String actual = ite.translateEng(75);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで80を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "Eighty";
		String actual = ite.translateEng(80);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで85を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "EightyFive";
		String actual = ite.translateEng(85);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEngで90を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "Ninety";
		String actual = ite.translateEng(90);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで95を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "NinetyFive";
		String actual = ite.translateEng(95);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで100を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "One Hundred ";
		String actual = ite.translateEng(100);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで105を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "One Hundred Five";
		String actual = ite.translateEng(105);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで110を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "One Hundred Ten";
		String actual = ite.translateEng(110);
		assertThat(actual, is(expected));
	}
	@Test
	public void translateEngで112を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "One Hundred Twelve";
		String actual = ite.translateEng(112);
		assertThat(actual, is(expected));
	}
	@Test
	public void translateEngで158を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "One Hundred FiftyEight";
		String actual = ite.translateEng(158);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで236を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "Two Hundred ThirtySix";
		String actual = ite.translateEng(236);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで333を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "Three Hundred ThirtyThree";
		String actual = ite.translateEng(333);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで491を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "Four Hundred NinetyOne";
		String actual = ite.translateEng(491);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngで550を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "Five Hundred Fifty";
		String actual = ite.translateEng(550);
		assertThat(actual, is(expected));
	}
	
}
