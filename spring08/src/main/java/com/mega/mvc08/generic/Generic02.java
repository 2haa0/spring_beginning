package com.mega.mvc08.generic;

import java.util.ArrayList;
import java.util.HashMap;

import com.mega.mvc08.MemberDTO;

public class Generic02 {

	public static void main(String[] args) {
		HashMap<String, Integer> mapSI = new HashMap<>();
		
		mapSI.put("고릴라", 1000);
		mapSI.put("귀신고래", 2000);
		mapSI.put("아프리카코끼리", 3000);
		
		System.out.println(mapSI);
		
		HashMap<Integer, MemberDTO> mapIMemD = new HashMap<>();
		
		mapIMemD.put(1, new MemberDTO());
		mapIMemD.put(2, new MemberDTO());
		System.out.println(mapIMemD);
	}

}
