package Calculator;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;

import java.math.BigDecimal;

class win extends JFrame implements ActionListener{
	 
	Font font = new Font("OK", 1, 30);//�r��
	JButton btn[]=new JButton[10]; //�x�s 0~9 ���ƭ�
	JButton btnPoint,btnDel,btnRem,btnEqu; // �p���I �h�� �R�� ����
	JButton btnDiv,btnMul,btnSub,btnAdd;// + - * /
	JTextField txtMF = new JTextField("0"); // ��J��r��
	double n[]=new double[2]; // �x�s�B��� 
	FinalCalculator Cal=new FinalCalculator(); // �s�X�p���
	char MathSymbol; // �B��Ÿ�
	
	int flag=0;//�������S���M�ŹL
	int enter_counter=0;//�������Uenter������
	int oprand_counter=0;//�������U�p�⤸������
	
	win() {

		//�̷Ӵ�ĳ���������]�p
		
		txtMF.setBounds(10, 5, 295, 50);    add(txtMF);  // ��r
		txtMF.addActionListener(this);
		txtMF.setHorizontalAlignment(JTextField.RIGHT);
		txtMF.setFont(font);
		
		////�Ĥ@�C
		btn[7] = new JButton("7");//����btn��l��
	 	btn[7].setBounds(10,65,55,50);     add(btn[7]); //���s �Ʀr7
		btn[7].addActionListener(this);
		btn[7].setFont(font);
	 	
	 	btn[8] = new JButton("8");//����btn[1]��l��
	 	btn[8].setBounds(70,65,55,50);     add(btn[8]); //���s �Ʀr8
	 	btn[8].addActionListener(this);
	 	btn[8].setFont(font);
	 	
	 	
	 	btn[9] = new JButton("9");//����btn[0]��l��
	 	btn[9].setBounds(130,65,55,50);     add(btn[9]); //���s �Ʀr9
	 	btn[9].addActionListener(this);
	 	btn[9].setFont(font);
	 	
	 	btnDiv = new JButton("/");
	 	btnDiv.setBounds(190,65,55,50);    add(btnDiv);
	 	btnDiv.addActionListener(this);
	 	btnDiv.setFont(font);
	 	
	 	btnDel= new JButton("B");
	 	btnDel.setBounds(250,65,55,50);    add(btnDel);
	 	btnDel.addActionListener(this);
	 	btnDel.setFont(font);
	 	///�Ĥ@�C����
	 	
	 	///�ĤG�C
	 	btn[4] = new JButton("4");//����btn[0]��l��
	 	btn[4].setBounds(10,120,55,50);     add(btn[4]); //���s �Ʀr4
	 	btn[4].addActionListener(this);
	 	btn[4].setFont(font);
		
	 	btn[5] = new JButton("5");//����btn[0]��l��
	 	btn[5].setBounds(70,120,55,50);     add(btn[5]); //���s �Ʀr5
	 	btn[5].addActionListener(this);
	 	btn[5].setFont(font);
		
	 	btn[6] = new JButton("6");//����btn[0]��l��
	 	btn[6].setBounds(130,120,55,50);     add(btn[6]); //���s �Ʀr6
	 	btn[6].addActionListener(this);
	 	btn[6].setFont(font);
		
	 	btnMul = new JButton("*");
	 	btnMul.setBounds(190,120,55,50);    add(btnMul);
	 	btnMul.addActionListener(this);
	 	btnMul.setFont(font);
	 	
	 	
	 	btnRem = new JButton("c");
	 	btnRem.setBounds(250,120,55,50);    add(btnRem);
	 	btnRem.addActionListener(this);
	 	btnRem.setFont(font);
	 	///�ĤG�C����
	 	
	 	///�ĤT�C
	 	btn[1] = new JButton("1");//����btn[0]��l��
	 	btn[1].setBounds(10,175,55,50);     add(btn[1]); //���s �Ʀr7
	 	btn[1].addActionListener(this);
	 	btn[1].setFont(font);
	 	
	 	
	 	btn[2] = new JButton("2");//����btn[0]��l��
	 	btn[2].setBounds(70,175,55,50);     add(btn[2]); //���s �Ʀr8
	 	btn[2].addActionListener(this);
	 	btn[2].setFont(font);
	 	
	 	btn[3] = new JButton("3");//����btn[0]��l��
	 	btn[3].setBounds(130,175,55,50);     add(btn[3]); //���s �Ʀr9
	 	btn[3].addActionListener(this);
	 	btn[3].setFont(font);
	 	
	 	btnSub = new JButton("-");
	 	btnSub.setBounds(190,175,55,50);    add(btnSub);
	 	btnSub.addActionListener(this);
	 	btnSub.setFont(font);
	 	
	 	btnEqu = new JButton("=");
	 	btnEqu.setBounds(250,175,55,105);   add(btnEqu);
	 	btnEqu.addActionListener(this);
	 	btnEqu.setFont(font);
	 	///�ĤT�C����
	 	
	 	///�ĥ|�C
	 	btn[0] = new JButton("0");//����btn[0]��l��
	 	btn[0].setBounds(10,230,115,50);     add(btn[0]); //���s �Ʀr0
	 	btn[0].addActionListener(this);
	 	btn[0].setFont(font);
	 	
	 	btnPoint = new JButton(".");
	 	btnPoint.setBounds(130,230,55,50);   add(btnPoint);
	 	btnPoint.addActionListener(this);
	 	btnPoint.setFont(font);
	 	
	 	btnAdd = new JButton("+");
	 	btnAdd.setBounds(190,230,55,50);     add(btnAdd);
	 	btnAdd.addActionListener(this);
	 	btnAdd.setFont(font);
		///�ĥ|�C����
	 	
	 	
		//�����j�p
		setTitle("�p��L");                 
		setLayout(null);
		setBounds(100, 100, 330, 340);    
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
		
		//�����\����

		////
		for(int i=0;i<=9;i++){
				if(e.getSource()==btn[i]){
					if(MathSymbol!=0){//��J�B��l��A�n�NtxtFM��M�Ť@��(�ȯ�M�Ť@��)
						if(flag==0){
							txtMF.setText("");
							flag++;//�����w�g�M�ŹL�I
						}
						
						if(txtMF.getText().length()==1){
							if(txtMF.getText().charAt(0)=='0'){
								txtMF.setText(Cal.exapnd("",i));
							}
							else
								txtMF.setText(Cal.exapnd(txtMF.getText(),i));
						}
						else
							txtMF.setText(Cal.exapnd(txtMF.getText(),i));
					}
					else{
						
						if(txtMF.getText().length()==1){
							if(txtMF.getText().charAt(0)=='0'){
								txtMF.setText(Cal.exapnd("",i));
							}
							else
								txtMF.setText(Cal.exapnd(txtMF.getText(),i));
						}
						else
							txtMF.setText(Cal.exapnd(txtMF.getText(),i));
					}
					if(oprand_counter>0){
						oprand_counter=1;
					}
			}
		}
		////�Ʀr��J����
		
		
		///�Ÿ���P�p���I      btnDiv,btnMul,btnSub,btnAdd;
		///���ݭn�L�btxtMF    �b���n�]�ߥXn[0] �PNum[1]
		if(e.getSource()==btnDiv){
			Cal.MathSymbol='/';
			MathSymbol='/';
			flag=0;//���L�[������@�Ÿ��A�N�����Nflag�k���s
			if(enter_counter==0){//�Y�٨S���Lenter��A�NtxtFM�����ܦ�n[0]
				n[0]=Double.parseDouble(txtMF.getText());
			}
			else{	
			}
		}
		if(e.getSource()==btnMul){
			Cal.MathSymbol='*';
			MathSymbol='*';
			flag=0;//���L�[������@�Ÿ��A�N�����Nflag�k���s
			if(enter_counter==0){//�Y�٨S���Lenter��A�NtxtFM�����ܦ�n[0]
				n[0]=Double.parseDouble(txtMF.getText());
			}
			else{
				
			}
		}
		if(e.getSource()==btnSub){
			Cal.MathSymbol='-';
			MathSymbol='-';
			flag=0;
			if(oprand_counter==0){//�Y�٨S���Lenter��A�NtxtFM�����ܦ�n[0]
				n[0]=Double.parseDouble(txtMF.getText());
			}
			else if(oprand_counter==1){	
				n[1]=Double.parseDouble(txtMF.getText());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//��l��bigdecimal����
				Cal.Num[1]=new BigDecimal(String.valueOf(n[1]));
				
				
				txtMF.setText(Cal.GetAns());
				n[0]=Double.parseDouble(Cal.GetAns());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//�N�p�⪺���G�x�s�bNum[0]
			}
			else if(oprand_counter>=2){
				txtMF.setText(Cal.GetAns());
				n[0]=Double.parseDouble(Cal.GetAns());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//�N�p�⪺���G�x�s�bNum[0]
			}
			oprand_counter++;
		}
		if(e.getSource()==btnAdd){
			Cal.MathSymbol='+';
			MathSymbol='+';
			flag=0;
			if(oprand_counter==0){//�Y�٨S���Lenter��A�NtxtFM�����ܦ�n[0]
				n[0]=Double.parseDouble(txtMF.getText());
			}
			else if(oprand_counter==1){	
				n[1]=Double.parseDouble(txtMF.getText());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//��l��bigdecimal����
				Cal.Num[1]=new BigDecimal(String.valueOf(n[1]));
				
				
				txtMF.setText(Cal.GetAns());
				n[0]=Double.parseDouble(Cal.GetAns());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//�N�p�⪺���G�x�s�bNum[0]
			}
			else if(oprand_counter>=2){
				txtMF.setText(Cal.GetAns());
				n[0]=Double.parseDouble(Cal.GetAns());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//�N�p�⪺���G�x�s�bNum[0]
			}
			oprand_counter++;
		}
		if(e.getSource()==btnPoint){
			txtMF.setText(txtMF.getText()+".");
		}
		///�Ÿ��䵲��
		
		///����
		///�]��n[1] �P Num[1]
		if(e.getSource()==btnEqu)
		{
			if(enter_counter==0){//�٨S���Lenter��
				n[1]=Double.parseDouble(txtMF.getText());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//��l��bigdecimal����
				Cal.Num[1]=new BigDecimal(String.valueOf(n[1]));
				
				txtMF.setText(Cal.GetAns());
				
				n[0]=Double.parseDouble(Cal.GetAns());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//�N�p�⪺���G�x�s�bNum[0]
				
				enter_counter++;
			}
			else{
				
				txtMF.setText(Cal.GetAns());
				n[0]=Double.parseDouble(Cal.GetAns());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//�N�p�⪺���G�x�s�bNum[0]
			}
		}
		///���󵲧�
		
		
		////�h����
		if(e.getSource()==btnDel)
		{
			txtMF.setText(Cal.exapnd(txtMF.getText(),'.'));
		}
		///�h���䵲��
		///�R����
		if(e.getSource()==btnRem)
		{
			flag=0;//�������S���M�ŹL
			enter_counter=0;//�������Uenter������
			oprand_counter=0;//�������U�p�⤸������
			txtMF.setText(Cal.Remove(txtMF.getText()));
		}
		
		
		/* Q:�ӫ��b�I�U�[�����A�A���@���Ʀr��A�|�^�_?
		 * �]�����\�h�欰�A�O�b���Uenter�@����A�|���Ҥ��P�A��O�ڨM�w������enter������
		 * �]���[����]�����󪺮ĪG�A�ҥH�]�ݭn�p��[���������
		
		*/
	}
	
	
	
}
