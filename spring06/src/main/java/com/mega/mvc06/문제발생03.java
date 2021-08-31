package com.mega.mvc06;

import java.io.FileWriter;
import java.io.IOException;

public class 문제발생03 {

	public static void main(String[] args) {
		System.out.println("1. 프린트?");
		try { //이하 코드를 실행하다가 문제가 생기면
			System.out.println("2. 프린트?" + (10/1));
			FileWriter file = new FileWriter("d:\test.txt");
			file.write("내가 첫 줄\n");
			file.write("내가 둘째 줄\n");
			file.close();
		} catch (ArithmeticException e) {  
			/*
			 * 잡아서 e라는 변수에 넣어서 수학적인 Exception
			 * 산술적인 error는 기본적으로 잡아주기때문에 이외 예외를 잡아주는 catch문을 필요로 한다.
			 */
			e.printStackTrace(); 
		} catch (IOException e) {
			System.out.println("파일 작성 중 에러 발생");
		} catch (Exception e) {
			//catch는 순서적으로 발생하여 실행순간 break되기 때문에 가장 큰 개념을 가장 아래에 서술
			System.out.println("이상의 catch 외 전체적인 error");
		} finally {
			//error가 발생하던지 말던지 꼭! 실행!
			System.out.println("휴~~~ 예외처리 다 했다.");
		}
		System.out.println("3. 프린트?");
	}

}
