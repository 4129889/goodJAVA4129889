package xxx;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class HK10_3 {
	public static void main(String[] args) {
		 Date date;
	        String choice = null;
	        SimpleDateFormat dateFormat = null;
	        SimpleDateFormat inputDate = new SimpleDateFormat("yyyyMMdd");

	        // scan date
	        System.out.println("請輸入日期(年日月，例如:20110131)");
	        while (true) {
	            try {
	                date = inputDate.parse(Integer.toString(
	                    HK10_2.intScanner("日期格式不正確，請再輸入一次")));
	                break;
	            } catch (ParseException e) {
	                System.out.println("日期格式不正確，請再輸入一次");
	            }
	        }

	        // scan choice and format date according to the choice
	        System.out.println("欲格式化成 (1)年/月/日 (2)月/日/年 (3)日/月/年");
	        switch (HK10_2.intScanner("格是不正確，請再輸入一次")) {
	            case 1 -> {
	                dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	                choice = "年/月/日";
	            }
	            case 2 -> {
	                dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	                choice = "月/日/年";
	            }
	            case 3 -> {
	                dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	                choice = "日/月/年";
	            }
	        }
	        if (choice != null) {
	            System.out.printf("%s:%s\n", choice, dateFormat.format(date));
	        }
	}

}
