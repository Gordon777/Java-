package Java_version_2;
/* Employee.class 檔案需存在於同⽬錄下 */
public class 薪資扣繳所得稅 {
	public static void main(String args[]){
		int tax;
		/* new 產⽣物件變數 */
		Employee emp = new Employee();
		emp.name = "張⼤名";
		emp.depart = "製造部";
		emp.ID = 43210;
		emp.payment = 50000;
		emp.duty = 15000;
		
		System.out.printf("\n***** 列印員⼯稅額 *****\n");
		System.out.printf("員⼯代號= %d ", emp.ID);
		System.out.printf("姓名= %s ", emp.name);
		System.out.printf("部⾨= %s ", emp.depart);
		System.out.printf("薪資= %d ", emp.payment+emp.duty);
		tax = (int)((emp.payment+emp.duty)*0.1);
		System.out.printf("預扣稅額= %d\n", tax);
		}
	}