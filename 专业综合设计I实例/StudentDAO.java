//����ѧ����������ݲ�������
import java.sql.*;
import java.util.*;
public class StudentDAO {
	private Connection con;
	public StudentDAO()
	{
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//��������
			String conStr="jdbc:sqlserver://localhost:1433; DatabaseName=student_course";
			//���������ַ���
			String user="DESKTOP-BHGM3HS\\hasee";
			//�����û���
			String password="";
			//�����û��ķ�������
			con=DriverManager.getConnection(conStr,user,password);
			//�������ݿ����Ӷ���
		}
	    catch (ClassNotFoundException e) {//��׽����������δ�ҵ��쳣
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
       catch (SQLException e) {//��׽�����������ӻ��߲����쳣
	     // TODO Auto-generated catch block
	     e.printStackTrace();
    }
		
	}
	
	//����ѧ������ѯѧ��
	public StudentInfo findStuBySno(String sno)
	{
		StudentInfo stu=null;
		try{
			PreparedStatement ps=con.prepareStatement("select * from student where sno=?");
     		ps.setString(1, sno);
			ResultSet rs=ps.executeQuery();
		    if(rs.next())
		    {
		    	String name=rs.getString(2);
		    	String sex=rs.getString(3);
		    	int age=rs.getInt(4);
		    	String dept=rs.getString(5);
		    	stu=new StudentInfo(sno,name,sex,age,dept);
		    }
			ps.close();
			//�ر�SQL���ִ�ж���
			//con.close();
			//�ر����ݿ����Ӷ���
		} 
	       catch (SQLException e) {//��׽�����������ӻ��߲����쳣
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }

		return stu;
	}
	
	//������������ѯѧ��
	public ArrayList<StudentInfo> findStuBySname(String sname)
	{
		ArrayList<StudentInfo> result=new ArrayList<StudentInfo>();
		try{
			Statement st=con.createStatement();
     		String strSQL="select * from student where sname like '%"+sname+"%'";
			ResultSet rs=st.executeQuery(strSQL);
		    while(rs.next())
		    {
		    	String sno=rs.getString(1);
		    	String name=rs.getString(2);
		    	String sex=rs.getString(3);
		    	int age=rs.getInt(4);
		    	String dept=rs.getString(5);
		    	StudentInfo stu=new StudentInfo(sno,name,sex,age,dept);
		    	result.add(stu);
		    }
			st.close();
			//�ر�SQL���ִ�ж���
			//con.close();
			//�ر����ݿ����Ӷ���
		} 
	       catch (SQLException e) {//��׽�����������ӻ��߲����쳣
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }

		return result;
	}
	
	public void addStudent(StudentInfo stu)
	{
		try{
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
			//����SQL���ִ�ж���
			ps.setString(1, stu.getSno());
			ps.setString(2,stu.getSname());
			ps.setString(3, stu.getSex());
			ps.setInt(4,stu.getAge());
			ps.setString(5,stu.getSdept());
			ps.execute();
			ps.close();
			//�ر�SQL���ִ�ж���
			//con.close();
			//�ر����ݿ����Ӷ���
		} 
	       catch (SQLException e) {//��׽�����������ӻ��߲����쳣
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
	
	public void delStudent(String sno)
	{
		try{
			PreparedStatement ps=con.prepareStatement("delete from student where sno=?");
			//����SQL���ִ�ж���
			ps.setString(1, sno);
			ps.execute();
			ps.close();
			//�ر�SQL���ִ�ж���
			//con.close();
			//�ر����ݿ����Ӷ���
		} 
	       catch (SQLException e) {//��׽�����������ӻ��߲����쳣
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
	
	public void updateStudent(StudentInfo stu)
	{
		
			try{
				PreparedStatement ps=con.prepareStatement("update student set sname=?,ssex=?,sage=?,sdept=? where sno=?");
				//����SQL���ִ�ж���
				ps.setString(1,stu.getSname());
				ps.setString(2, stu.getSex());
				ps.setInt(3,stu.getAge());
				ps.setString(4,stu.getSdept());
				ps.setString(5, stu.getSno());
				ps.execute();
				ps.close();
				//�ر�SQL���ִ�ж���
				//con.close();
				//�ر����ݿ����Ӷ���
			} 
		       catch (SQLException e) {//��׽�����������ӻ��߲����쳣
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
	       
	}
}
