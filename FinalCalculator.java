package Calculator;
import java.math.BigDecimal;


class FinalCalculator extends SimpleCalculator {
	FinalCalculator(){
		super();
	}
	int flag=0;//0的時候，是紀錄第一個數字,1的時候，是紀錄第二個數字
	
	String Delete(String str){//退格動作
		int longth=str.length();
		longth=longth-1;//最後一個字符的index再往前一格
		String substr=str.substring(0, longth);
		
		return substr;
	}
	
	String exapnd(String str,int i){//擴充動作
		str=str+String.valueOf(i);
		return str;
	}
	String exapndPoint(String str,char c){//擴充小數點動作
		return str+c;
	}
	
	String Remove(String str){//刪除動作  還需將所有紀錄(ex flag)初始化
		return "";
	}
	
}



	//完成建構子
	//注意，父類別為精度福點運算，記得要轉型態

	//且必須包含以下方法的實作
	
	
	


