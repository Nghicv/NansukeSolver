package nghicv.com.util;

import java.util.ArrayList;

public class NansukeUtil {
	private static int board0[][]={
		{1,0,1,0},
		{1,1,1,1},
		{0,0,1,1},
		{1,1,0,0}
		
};
private static String listNumber0[]={"12","2345","146","67","13","57"};
	private static int board1[][]={
			{1,0,1,0},
			{1,1,1,1},
			{0,0,1,1},
			{1,1,0,0}
			
	};
	private static String listNumber1[]={"12","2345","146","67","13","57"};
	private static int board2[][]={
		{1,0,1,1,1},
		{1,1,1,1,1},
		{1,0,1,1,0},
		{1,1,1,1,1},
		{0,1,1,0,1}
		
	};
	private static String listNumber2[]={"1234","23456","345","57","47689","97","79","34567","4579","56","82"};
	
	private static int board3[][]={
		{1,1,1,1,1,1,0,1,1,1,1,1},
		{1,1,1,1,1,0,1,1,1,1,1,1},
		{1,1,1,1,1,1,0,1,1,1,1,1},
		{1,1,1,1,1,0,1,1,1,1,1,1},
		{1,1,1,1,1,1,0,1,1,1,1,1},
		{0,1,0,1,0,1,1,1,0,1,0,1},
		{1,0,1,0,1,1,1,0,1,0,1,0},
		{1,1,1,1,1,0,1,1,1,1,1,1},
		{1,1,1,1,1,1,0,1,1,1,1,1},
		{1,1,1,1,1,0,1,1,1,1,1,1},
		{1,1,1,1,1,1,0,1,1,1,1,1},
		{1,1,1,1,1,0,1,1,1,1,1,1}
	};
	private static String listNumber3[]={"111","122","211","212","55755","55775","56656","56755","56765","56775","56785",
		"56787","56789","75855","77856","77858","77876","77879","95655","95657","96679","96777","97698","98677","156789",
		"256789","556677","586757","656585","667768","668688","678688","679876","686869","777777","857586","858799",
		"866967","887992","888755","957957","969897","976668","977572"};
	
	
	
	public static Nansuke[] arrNansukeQuestions={new Nansuke(new Matrix(board1), listNumber1),
		new Nansuke(new Matrix(board2), listNumber2),new Nansuke(new Matrix(board3), listNumber3)};
}
