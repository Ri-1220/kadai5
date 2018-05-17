package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import kadai5.IntToEng;

public class transTest {

	@Test
	public void translateEngで0から10を英語に変換できる(){
		IntToEng ite = new IntToEng();
		String expected = "five";
	}

}
