package Calculator;
import java.math.BigDecimal;


class FinalCalculator extends SimpleCalculator {
	FinalCalculator(){
		super();
	}
	int flag=0;//0���ɭԡA�O�����Ĥ@�ӼƦr,1���ɭԡA�O�����ĤG�ӼƦr
	
	String Delete(String str){//�h��ʧ@
		int longth=str.length();
		longth=longth-1;//�̫�@�Ӧr�Ū�index�A���e�@��
		String substr=str.substring(0, longth);
		
		return substr;
	}
	
	String exapnd(String str,int i){//�X�R�ʧ@
		str=str+String.valueOf(i);
		return str;
	}
	String exapndPoint(String str,char c){//�X�R�p���I�ʧ@
		return str+c;
	}
	
	String Remove(String str){//�R���ʧ@  �ٻݱN�Ҧ�����(ex flag)��l��
		return "";
	}
	
}



	//�����غc�l
	//�`�N�A�����O����׺��I�B��A�O�o�n�૬�A

	//�B�����]�t�H�U��k����@
	
	
	


