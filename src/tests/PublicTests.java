package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import letters.LetterFrequency;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PublicTests {

	
	@Test
	public void test1() {
		LetterFrequency lf = new LetterFrequency("test1.txt");
		ArrayList<Integer> letterFreq  = lf.freq();
		Object[] expected={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		Object[] result = letterFreq.toArray();
		assertArrayEquals( expected,  result );
	}
	
	@Test
	public void test2() {
		LetterFrequency lf = new LetterFrequency("test2.txt");
		ArrayList<Integer> letterFreq  = lf.freq();
		Object[] expected={2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
		Object[] result = letterFreq.toArray();
		assertArrayEquals( expected,  result );
	}
	
	
	@Test
	public void test3() {
		LetterFrequency lf = new LetterFrequency("test3.txt");
		ArrayList<Integer> letterFreq  = lf.freq();
		Object[] expected={81,9,39,25,90,15,17,21,56,10,0,42,26,53,58,33,1,50,48,57,22,16,10,1,13,0};
		Object[] result = letterFreq.toArray();
		assertArrayEquals( expected,  result );
	}
	
	
	@Test
	public void test4() {
		LetterFrequency lf = new LetterFrequency("test4.txt");
		ArrayList<Integer> letterFreq  = lf.freq();
		Object[] expected={223,23,167,117,331,76,39,60,206,7,15,133,48,160,207,65,4,176,157,199,50,21,12,9,21,2};
		Object[] result = letterFreq.toArray();
		assertArrayEquals( expected,  result );
	}

	
	@Test
	public void test5() {
		LetterFrequency lf = new LetterFrequency("test5.txt");
		ArrayList<Integer> letterFreq  = lf.freq();
		Object[] expected={6,2,2,2,4,1,2,3,2,0,1,1,0,2,2,0,0,4,0,2,0,1,0,0,2,0};
		Object[] result = letterFreq.toArray();
		assertArrayEquals( expected,  result );
	}
}
