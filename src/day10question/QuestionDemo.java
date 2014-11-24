package day10question;

import java.util.Scanner;

public class QuestionDemo {

	public static void main(String[] args) {
		Question[] questionare = new Question[2];
		
		questionare[0]=new SingleQuestion(
				1,
				"哪位是赵本山的徒弟？",
				new Option[]{
						new Option('A', "倪萍"),
			            new Option('B', "小沈阳"),
			            new Option('C', "莫小贝"),
			            new Option('D', "高圆圆")
				},
				'B'
				);
		
		questionare[1]=new MultiChoice(
				2,
				"著名的雷人教母是那几位?",
		        new Option[]{
		            new Option('A', "GAGA"),
		            new Option('B', "凤姐"),
		            new Option('C', "芙蓉"),
		            new Option('D', "赵本山")
		        },
		        new char[]{'A','B','C'}
				);
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<questionare.length;i++){
			Question q = questionare[i];
			q.show();
			System.out.print("请输入答案");
			char[]answer = s.nextLine().toUpperCase().toCharArray();
			boolean pass = q.check(answer);
			if(pass){
				System.out.println("牛呀！");
			}else{
				System.out.println("努力阿！");
			}
		}
		
		s.close();

	}

}
