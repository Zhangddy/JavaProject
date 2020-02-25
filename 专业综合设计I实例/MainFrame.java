import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class MainFrame extends JFrame implements ActionListener
{
	JLabel numLa,nameLa;
	JTextField numTxt,nameTxt;
	JButton numFBt,nameFBt,addBt,delBt,upBt;
	JTable table;
	JScrollPane panel;
	
	public MainFrame()
	{
		this.setSize(800,600);
		this.setTitle("ѧ����Ϣ����");
		this.setLayout(null);
		numLa=new JLabel("ѧ��");
		numLa.setSize(60, 30);
		numLa.setLocation(30,30);
		this.add(numLa);
		numTxt=new JTextField();
		numTxt.setSize(150, 30);
		numTxt.setLocation(90,30);
		this.add(numTxt);
		numFBt=new JButton("ѧ�Ų���");
		numFBt.setSize(90, 30);
		numFBt.setLocation(280,30);
		numFBt.addActionListener(this);
		this.add(numFBt);
		
		nameLa=new JLabel("����");
		nameLa.setSize(60, 30);
		nameLa.setLocation(410,30);
		this.add(nameLa);
		nameTxt=new JTextField();
		nameTxt.setSize(150, 30);
		nameTxt.setLocation(470,30);
		this.add(nameTxt);
		nameFBt=new JButton("��������");
		nameFBt.setSize(90, 30);
		nameFBt.setLocation(660,30);
		nameFBt.addActionListener(this);
		this.add(nameFBt);
		
		addBt=new JButton("����");
		addBt.setSize(60, 30);
		addBt.setLocation(30,90);
		addBt.addActionListener(this);
		this.add(addBt);
		delBt=new JButton("ɾ��");
		delBt.setSize(60, 30);
		delBt.setLocation(120,90);
		delBt.addActionListener(this);
		this.add(delBt);
		upBt=new JButton("�޸�");
		upBt.setSize(60, 30);
		upBt.setLocation(210,90);
		upBt.addActionListener(this);
		this.add(upBt);
		
		StudentDAO dao=new StudentDAO();
		ArrayList list=dao.findStuBySname("");
		initTable(list);
		this.setVisible(true);
	}
	
	public void initTable(ArrayList<StudentInfo> stus)//��ʼ�����ķ���
	{
		if((stus!=null)||(stus.size()!=0))
 {
			if(panel!=null)
			{
				this.remove(panel);
			}
			String[] columnNames = { "ѧ��", "����", "�Ա�", "����", "����Ժϵ" };
			String[][] values = new String[stus.size()][5];
			for (int i = 0; i < stus.size(); i++) {
				StudentInfo stu = (StudentInfo) stus.get(i);
				values[i][0] = stu.getSno();
				values[i][1] = stu.getSname();
				values[i][2] = stu.getSex();
				values[i][3] = String.valueOf(stu.getAge());
				values[i][4] = stu.getSdept();
			}
			table = new JTable(values, columnNames);
			panel = new JScrollPane(table);
			panel.setSize(750, 400);
			panel.setLocation(20, 150);
			this.add(panel);
		}
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		JButton bt=(JButton)e.getSource();
		if(bt.getText().equals("��������"))
		{
			StudentDAO dao=new StudentDAO();
			ArrayList list=dao.findStuBySname(nameTxt.getText().trim());
			initTable(list);
		}
		else
		{
			if(bt.getText().equals("ѧ�Ų���"))
			{
				StudentDAO dao=new StudentDAO();
				ArrayList list=new ArrayList();
				StudentInfo stu=dao.findStuBySno(numTxt.getText().trim());
				if(stu!=null)
				{
					list.add(stu);
				}
				initTable(list);
			}
			else
			{
				if(bt.getText().equals("ɾ��"))
				{
					if(table.getSelectedRow()==-1)
					{
						JOptionPane.showMessageDialog(this, "��ѡ��Ҫɾ����ѧ��");
					}
					else
					{
						StudentDAO dao = new StudentDAO();
						dao.delStudent(table.getValueAt(table.getSelectedRow(),0).toString());
						ArrayList list = dao.findStuBySname("");
						initTable(list);
					}
				}
				else
				{
					if(bt.getText().equals("�޸�"))
					{
						if(table.getSelectedRow()==-1)
						{
							JOptionPane.showMessageDialog(this, "��ѡ��Ҫ�޸ĵ�ѧ��");
						}
						else
						{
							int row = table.getSelectedRow();
							String sno = table.getValueAt(row, 0).toString();
							String sname = table.getValueAt(row, 1).toString();
							String sex = table.getValueAt(row, 2).toString();
							int age = Integer.parseInt(table.getValueAt(row, 3)
									.toString());
							String sdept = table.getValueAt(row, 4).toString();
							StudentInfo stu = new StudentInfo(sno, sname, sex,
									age, sdept);
							AddOrUpdateFrame newFrame = new AddOrUpdateFrame(
									"�޸�", stu, this);
						}
					}
					else
					{
						AddOrUpdateFrame newFrame=new AddOrUpdateFrame("����",null,this);
					}
				}
			}
		}
	}
}
