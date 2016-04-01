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
	 
	Font font = new Font("OK", 1, 30);//字型
	JButton btn[]=new JButton[10]; //儲存 0~9 的數值
	JButton btnPoint,btnDel,btnRem,btnEqu; // 小數點 退格 刪除 等於
	JButton btnDiv,btnMul,btnSub,btnAdd;// + - * /
	JTextField txtMF = new JTextField("0"); // 輸入文字欄
	double n[]=new double[2]; // 儲存運算數 
	FinalCalculator Cal=new FinalCalculator(); // 叫出計算機
	char MathSymbol; // 運算符號
	
	int flag=0;//紀錄有沒有清空過
	int enter_counter=0;//紀錄按下enter的次數
	int oprand_counter=0;//紀錄按下計算元的次數
	
	win() {

		//依照提議完成介面設計
		
		txtMF.setBounds(10, 5, 295, 50);    add(txtMF);  // 文字
		txtMF.addActionListener(this);
		txtMF.setHorizontalAlignment(JTextField.RIGHT);
		txtMF.setFont(font);
		
		////第一列
		btn[7] = new JButton("7");//給予btn初始值
	 	btn[7].setBounds(10,65,55,50);     add(btn[7]); //按鈕 數字7
		btn[7].addActionListener(this);
		btn[7].setFont(font);
	 	
	 	btn[8] = new JButton("8");//給予btn[1]初始值
	 	btn[8].setBounds(70,65,55,50);     add(btn[8]); //按鈕 數字8
	 	btn[8].addActionListener(this);
	 	btn[8].setFont(font);
	 	
	 	
	 	btn[9] = new JButton("9");//給予btn[0]初始值
	 	btn[9].setBounds(130,65,55,50);     add(btn[9]); //按鈕 數字9
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
	 	///第一列結束
	 	
	 	///第二列
	 	btn[4] = new JButton("4");//給予btn[0]初始值
	 	btn[4].setBounds(10,120,55,50);     add(btn[4]); //按鈕 數字4
	 	btn[4].addActionListener(this);
	 	btn[4].setFont(font);
		
	 	btn[5] = new JButton("5");//給予btn[0]初始值
	 	btn[5].setBounds(70,120,55,50);     add(btn[5]); //按鈕 數字5
	 	btn[5].addActionListener(this);
	 	btn[5].setFont(font);
		
	 	btn[6] = new JButton("6");//給予btn[0]初始值
	 	btn[6].setBounds(130,120,55,50);     add(btn[6]); //按鈕 數字6
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
	 	///第二列結束
	 	
	 	///第三列
	 	btn[1] = new JButton("1");//給予btn[0]初始值
	 	btn[1].setBounds(10,175,55,50);     add(btn[1]); //按鈕 數字7
	 	btn[1].addActionListener(this);
	 	btn[1].setFont(font);
	 	
	 	
	 	btn[2] = new JButton("2");//給予btn[0]初始值
	 	btn[2].setBounds(70,175,55,50);     add(btn[2]); //按鈕 數字8
	 	btn[2].addActionListener(this);
	 	btn[2].setFont(font);
	 	
	 	btn[3] = new JButton("3");//給予btn[0]初始值
	 	btn[3].setBounds(130,175,55,50);     add(btn[3]); //按鈕 數字9
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
	 	///第三列結束
	 	
	 	///第四列
	 	btn[0] = new JButton("0");//給予btn[0]初始值
	 	btn[0].setBounds(10,230,115,50);     add(btn[0]); //按鈕 數字0
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
		///第四列結束
	 	
	 	
		//視窗大小
		setTitle("小算盤");                 
		setLayout(null);
		setBounds(100, 100, 330, 340);    
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
		
		//完成功能鍵

		////
		for(int i=0;i<=9;i++){
				if(e.getSource()==btn[i]){
					if(MathSymbol!=0){//輸入運算子後，要將txtFM欄清空一次(僅能清空一次)
						if(flag==0){
							txtMF.setText("");
							flag++;//紀錄已經清空過！
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
		////數字輸入結束
		
		
		///符號鍵與小數點      btnDiv,btnMul,btnSub,btnAdd;
		///不需要印在txtMF    在此要設立出n[0] 與Num[1]
		if(e.getSource()==btnDiv){
			Cal.MathSymbol='/';
			MathSymbol='/';
			flag=0;//按過加減乘除任一符號，就必須將flag歸為零
			if(enter_counter==0){//若還沒按過enter鍵，將txtFM的值變成n[0]
				n[0]=Double.parseDouble(txtMF.getText());
			}
			else{	
			}
		}
		if(e.getSource()==btnMul){
			Cal.MathSymbol='*';
			MathSymbol='*';
			flag=0;//按過加減乘除任一符號，就必須將flag歸為零
			if(enter_counter==0){//若還沒按過enter鍵，將txtFM的值變成n[0]
				n[0]=Double.parseDouble(txtMF.getText());
			}
			else{
				
			}
		}
		if(e.getSource()==btnSub){
			Cal.MathSymbol='-';
			MathSymbol='-';
			flag=0;
			if(oprand_counter==0){//若還沒按過enter鍵，將txtFM的值變成n[0]
				n[0]=Double.parseDouble(txtMF.getText());
			}
			else if(oprand_counter==1){	
				n[1]=Double.parseDouble(txtMF.getText());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//初始化bigdecimal物件
				Cal.Num[1]=new BigDecimal(String.valueOf(n[1]));
				
				
				txtMF.setText(Cal.GetAns());
				n[0]=Double.parseDouble(Cal.GetAns());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//將計算的結果儲存在Num[0]
			}
			else if(oprand_counter>=2){
				txtMF.setText(Cal.GetAns());
				n[0]=Double.parseDouble(Cal.GetAns());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//將計算的結果儲存在Num[0]
			}
			oprand_counter++;
		}
		if(e.getSource()==btnAdd){
			Cal.MathSymbol='+';
			MathSymbol='+';
			flag=0;
			if(oprand_counter==0){//若還沒按過enter鍵，將txtFM的值變成n[0]
				n[0]=Double.parseDouble(txtMF.getText());
			}
			else if(oprand_counter==1){	
				n[1]=Double.parseDouble(txtMF.getText());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//初始化bigdecimal物件
				Cal.Num[1]=new BigDecimal(String.valueOf(n[1]));
				
				
				txtMF.setText(Cal.GetAns());
				n[0]=Double.parseDouble(Cal.GetAns());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//將計算的結果儲存在Num[0]
			}
			else if(oprand_counter>=2){
				txtMF.setText(Cal.GetAns());
				n[0]=Double.parseDouble(Cal.GetAns());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//將計算的結果儲存在Num[0]
			}
			oprand_counter++;
		}
		if(e.getSource()==btnPoint){
			txtMF.setText(txtMF.getText()+".");
		}
		///符號鍵結束
		
		///等於
		///設立n[1] 與 Num[1]
		if(e.getSource()==btnEqu)
		{
			if(enter_counter==0){//還沒按過enter鍵
				n[1]=Double.parseDouble(txtMF.getText());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//初始化bigdecimal物件
				Cal.Num[1]=new BigDecimal(String.valueOf(n[1]));
				
				txtMF.setText(Cal.GetAns());
				
				n[0]=Double.parseDouble(Cal.GetAns());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//將計算的結果儲存在Num[0]
				
				enter_counter++;
			}
			else{
				
				txtMF.setText(Cal.GetAns());
				n[0]=Double.parseDouble(Cal.GetAns());
				Cal.Num[0]=new BigDecimal(String.valueOf(n[0]));//將計算的結果儲存在Num[0]
			}
		}
		///等於結束
		
		
		////退格鍵
		if(e.getSource()==btnDel)
		{
			txtMF.setText(Cal.exapnd(txtMF.getText(),'.'));
		}
		///退格鍵結束
		///刪除鍵
		if(e.getSource()==btnRem)
		{
			flag=0;//紀錄有沒有清空過
			enter_counter=0;//紀錄按下enter的次數
			oprand_counter=0;//紀錄按下計算元的次數
			txtMF.setText(Cal.Remove(txtMF.getText()));
		}
		
		
		/* Q:該怎麼在點下加減乘除後，再按一次數字鍵，會回復?
		 * 因為有許多行為，是在按下enter一次後，會有所不同，於是我決定紀錄按enter的次數
		 * 因為加減乘除也有等於的效果，所以也需要計算加減乘除的次數
		
		*/
	}
	
	
	
}
