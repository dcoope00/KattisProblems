import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ACMContestScoring {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> minutes = new ArrayList<>();
		ArrayList<String> problems = new ArrayList<>();
		ArrayList<String> score = new ArrayList<>();
		int aWrong = 0;
		int bWrong = 0;
		int cWrong = 0;
		int dWrong = 0;
		int eWrong = 0;
		int fWrong = 0;
		int gWrong = 0;
		int hWrong = 0;
		int iWrong = 0;
		int jWrong = 0;
		int kWrong = 0;
		int lWrong = 0;
		int mWrong = 0;
		int nWrong = 0;
		int oWrong = 0;
		int pWrong = 0;
		int qWrong = 0;
		int rWrong = 0;
		int sWrong = 0;
		int tWrong = 0;
		int uWrong = 0;
		int vWrong = 0;
		int wWrong = 0;
		int xWrong = 0;
		int yWrong = 0;
		int zWrong = 0;
		Scanner scan = new Scanner(System.in);
		
		int minuteSum = 0;
		boolean bool = false;
		while(bool == false) {
			String line = scan.nextLine();
			if(line.equals("-1")) {
				break;
			}
			String[] tokens = line.split(" ");
			minutes.add(Integer.parseInt(tokens[0]));
			problems.add(tokens[1]);
			score.add(tokens[2]);
			
;
		}
		
		int count = 0;
		for(int i = 0;i < minutes.size();i++) {
			if(score.get(i).equals("right")) {
				count++;
				minuteSum += minutes.get(i);
				String tmp = problems.get(i);
				if(tmp.equals("A") && aWrong > 0) {
					minuteSum += (aWrong*20);
				}
				 if(tmp.equals("B") && bWrong > 0) {
					minuteSum += (bWrong*20);
				}
				 if(tmp.equals("C") && cWrong > 0) {
					minuteSum += (cWrong*20);
				}
				 if(tmp.equals("D") && dWrong > 0) {
					minuteSum += (dWrong*20);
				}
				 if(tmp.equals("E") && eWrong > 0) {
					minuteSum += (eWrong*20);
				}if(tmp.equals("F") && fWrong > 0) {
					minuteSum += (fWrong*20);
				}if(tmp.equals("G") && gWrong > 0) {
					minuteSum += (gWrong*20);
				}if(tmp.equals("H") && hWrong > 0) {
					minuteSum += (hWrong*20);
				}if(tmp.equals("I") && iWrong > 0) {
					minuteSum += (iWrong*20);
				}if(tmp.equals("J") && jWrong > 0) {
					minuteSum += (jWrong*20);
				}if(tmp.equals("K") && kWrong > 0) {
					minuteSum += (kWrong*20);
				}if(tmp.equals("L") && lWrong > 0) {
					minuteSum += (lWrong*20);
				}if(tmp.equals("M") && mWrong > 0) {
					minuteSum += (mWrong*20);
				}if(tmp.equals("N") && nWrong > 0) {
					minuteSum += (nWrong*20);
				}if(tmp.equals("O") && oWrong > 0) {
					minuteSum += (oWrong*20);
				}if(tmp.equals("P") && pWrong > 0) {
					minuteSum += (pWrong*20);
				}if(tmp.equals("Q") && qWrong > 0) {
					minuteSum += (qWrong*20);
				}if(tmp.equals("R") && rWrong > 0) {
					minuteSum += (rWrong*20);
				}if(tmp.equals("S") && sWrong > 0) {
					minuteSum += (sWrong*20);
				}if(tmp.equals("T") && tWrong > 0) {
					minuteSum += (tWrong*20);
				}if(tmp.equals("U") && uWrong > 0) {
					minuteSum += (uWrong*20);
				}if(tmp.equals("V") && vWrong > 0) {
					minuteSum += (vWrong*20);
				}if(tmp.equals("W") && wWrong > 0) {
					minuteSum += (wWrong*20);
				}if(tmp.equals("X") && xWrong > 0) {
					minuteSum += (xWrong*20);
				}if(tmp.equals("Y") && yWrong > 0) {
					minuteSum += (yWrong*20);
				}if(tmp.equals("Z") && zWrong > 0) {
					minuteSum += (zWrong*20);
				}
			}
			if(score.get(i).equals("wrong")) {
				String tmp = problems.get(i);
				if(tmp.equals("A")) {
					aWrong++;
				}
				 if(tmp.equals("B")) {
					bWrong++;
				}
				if(tmp.equals("C")) {
					cWrong++;
				}
				if(tmp.equals("D")) {
					dWrong++;
				}
				if(tmp.equals("E")) {
					eWrong++;
				}if(tmp.equals("F")) {
					fWrong++;
				}if(tmp.equals("G")) {
					gWrong++;
				}if(tmp.equals("H")) {
					hWrong++;
				}if(tmp.equals("I")) {
					iWrong++;
				}if(tmp.equals("J")) {
					jWrong++;
				}if(tmp.equals("K")) {
					kWrong++;
				}if(tmp.equals("L")) {
					lWrong++;
				}if(tmp.equals("M")) {
					mWrong++;
				}if(tmp.equals("N")) {
					nWrong++;
				}if(tmp.equals("O")) {
					oWrong++;
				}if(tmp.equals("P")) {
					pWrong++;
				}if(tmp.equals("Q")) {
					qWrong++;
				}if(tmp.equals("R")) {
					rWrong++;
				}if(tmp.equals("S")) {
					sWrong++;
				}if(tmp.equals("T")) {
					tWrong++;
				}if(tmp.equals("U")) {
					uWrong++;
				}if(tmp.equals("V")) {
					vWrong++;
				}if(tmp.equals("W")) {
					wWrong++;
				}if(tmp.equals("X")) {
					xWrong++;
				}if(tmp.equals("Y")) {
					yWrong++;
				}if(tmp.equals("Z")) {
					zWrong++;
				}
			}
			
		}
		System.out.println(count);
		System.out.print(minuteSum);
		
		
		
	}

}
