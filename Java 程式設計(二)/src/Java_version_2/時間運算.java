package Java_version_2;
/* timeTool.class, Time.class 需儲存於相同目錄下 */
import java.io.*;
import java.util.*;
/* 時間類別, 描述時間物件的規格 */
class Time {
int hour;
int minute;
int second;
}

/* 時間工具類別, 包含 4 個方法 (計算器) */
class timeTool {
/* 轉換字串成為時間物件格式 */
Time getTime(String time_S){
Time time = new Time();
Scanner s = new Scanner(time_S).useDelimiter("/");
time.hour = s.nextInt();
time.minute = s.nextInt();
time.second = s.nextInt();
return time;
}

/* 之前時間計算器 */
Time timeBefore(Time now, Time value) {
Time time = new Time();
time.hour=0; time.minute=0; time.second=0;
time.second = now.second-value.second;
if (time.second < 0) {
time.second = time.second + 60;
time.minute = 1;
}
time.minute = now.minute-value.minute-time.minute;
if (time.minute < 0) {
time.minute = time.minute + 60;
time.hour = 1;
}
time.hour = now.hour-value.hour-time.hour;
if(time.hour < 0)
time.hour = time.hour + 24;
return time;
}

/* 之後時間計算器 */
Time timeAfter(Time now, Time value) {
Time time = new Time();
time.hour=0; time.minute=0; time.second=0;
time.second = now.second + value.second;
if (time.second > 60) {
time.second = 60-time.second;
time.minute = 1;
}
time.minute = time.minute + now.minute + value.minute;
if (time.minute > 60) {
time.minute = 60-time.minute;
time.hour = 1;
}
time.hour = time.hour + now.hour + value.hour;
if (time.hour > 24)
time.hour = time.hour-24;
return time;
}
/* 兩點時間之間距離計算器 */
Time timeInterval(Time start, Time end) {
	Time time = new Time();
			time.hour=0; time.minute=0; time.second=0;
			time.second = end.second-start.second;
			if (time.second < 0) {
			time.second = time.second + 60;
			time.minute = 1;
			}
			time.minute = end.minute-start.minute-time.minute;
			if (time.minute < 0) {
			time.minute = time.minute + 60;
			time.hour = 1;
			}
			time.hour = end.hour-start.hour-time.hour;
			if(time.hour < 0)
			time.hour = time.hour + 24;
			return time;
			}
			}	


public class 時間運算 {
	public static void main(String args[]) throws IOException {
		BufferedReader keyin = new BufferedReader(new
		InputStreamReader(System.in));
		
		timeTool tool = new timeTool(); // 產生工具, 包含4種方法
				Time now = new Time(); // 儲存目前時間
				Time time_T = new Time(); // 時間暫存變數
				Time time_B = new Time(); // 時間暫存變數
				String time_S; // 讀入時間字串
				/* 設定目前時間 */
				System.out.printf("設定目前時間(時/分/秒) =>");
				time_S = keyin.readLine();
				now = tool.getTime(time_S);
				/* 測試計算之前時間 */
				System.out.printf("\n目前是 %d 時 %d 分 %d 秒\n",now.hour,now.minute,now.second);
				System.out.printf("請輸入之前時間距離 (時/分/秒) =>");
				time_S = keyin.readLine();
						time_T = tool.getTime(time_S);
						time_B = tool.timeBefore(now, time_T);
						System.out.printf("之前是 %d 時 %d 分 %d 秒\n",time_B.hour, time_B.minute, time_B.second);
						/* 測試計算之後時間 */
						System.out.printf("\n目前是 %d 時 %d 分 %d 秒\n",
						now.hour, now.minute, now.second);
						System.out.printf("請輸入之後時間距離 (時/分/秒) =>");
						time_S = keyin.readLine();
						time_T = tool.getTime(time_S);
						time_B = tool.timeAfter(now, time_T);
						System.out.printf("之後是 %d 時 %d 分 %d 秒\n",
						time_B.hour, time_B.minute, time_B.second);
						/* 測試計算兩時間之間 距離 */
						System.out.printf("\n目前是 %d 時 %d 分 %d 秒\n",
						now.hour, now.minute, now.second);
						System.out.printf("請輸入第二點時間 (時/分/秒) =>");
						time_S = keyin.readLine();
						time_T = tool.getTime(time_S);
								time_B = tool.timeInterval(now, time_T);
								System.out.printf("兩點時間相差 %d 時 %d 分 %d 秒\n",
								time_B.hour, time_B.minute, time_B.second);
								}
								}
						


