package javalogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Pracitce_230920 {
	
	//2차원배열로 다시
	
	public static class Birth{
		String name;
		int day, month, year;
		
		public Birth(String name, int day, int month, int year) {
			super();
			this.name = name;
			this.day = day;
			this.month = month;
			this.year = year;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Birth> arr = new ArrayList<>();
		StringTokenizer st;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String d = st.nextToken();	
			String m = st.nextToken();
			String y = st.nextToken();
			int day = Integer.parseInt(d);
			int month = Integer.parseInt(m);
			int year = Integer.parseInt(y);
			arr.add(new Birth(name, day, month, year));
		}
		
		
		
		int maxYear = 0;
		int maxMonth = 0;
		int maxDay = 0;
		int minYear = 10000;
		int minMonth = 10000;
		int minDay = 10000;
		String older = "";
		String younger = "";
		for(int i=0; i<arr.size(); i++) {
			if(minYear>arr.get(i).year) {
				minYear = arr.get(i).year;
				minMonth = arr.get(i).month;
				minDay = arr.get(i).day;
				older = arr.get(i).name;
			}else if(minYear == arr.get(i).year) {
				if(minMonth>arr.get(i).month) {
					minMonth = arr.get(i).month;
					minDay = arr.get(i).day;
					older = arr.get(i).name;
				}else if(minMonth == arr.get(i).month) {
					if(minDay > arr.get(i).day) older = arr.get(i).name;
				}
			}
			
			if(maxYear<arr.get(i).year) {
				maxYear = arr.get(i).year;
				maxMonth = arr.get(i).month;
				maxDay = arr.get(i).day;
				younger = arr.get(i).name;
			}else if(maxYear == arr.get(i).year) {
				if(maxMonth<arr.get(i).month) {
					maxMonth = arr.get(i).month;
					maxDay = arr.get(i).day;
					younger = arr.get(i).name;
				}else if(maxMonth == arr.get(i).month) {
					if(maxDay < arr.get(i).day) younger = arr.get(i).name;
				}
			}
		}
		
		System.out.println("older: "+older);
		System.out.println("younger: "+younger);
		
		
		
/*
5
Mickey 1 10 1991
Alice 30 12 1990
Tom 15 8 1993
Jerry 18 9 1990
Garfield 20 9 1990
*/
		
		
		
	}

}
