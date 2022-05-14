package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class database {
	private Connection con;
	private PreparedStatement pstmt;
	private final String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
	public database() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("�����߽��ϴ�.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	//db�����
	public void getconnection() {
		try {
			con=DriverManager.getConnection(url,"root","1234");
			System.out.println("��������Ϸ�");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void disconnection() {
		try {
			if(pstmt!=null) {
				pstmt.close();
				System.out.println("psmt ��������");
			}
			if(con!=null) {
				con.close();
				System.out.println("con��������");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//����Ʈ ���
		public void mydblistdata() {
			try {
				//db����
				getconnection();
				//sql ���� �ۼ�
				String sql="select * from news";
				//mysql�� sql���� ����
				pstmt = con.prepareStatement(sql);
				//�������� �޾ƿ´�.
				ResultSet rs = pstmt.executeQuery();
				//����� ���
				while(rs.next()) {
					System.out.println(rs.getInt(1)
					+ ","+rs.getString(2));
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disconnection();
			}
		}
		public void newtable() {
			try {
				getconnection();
				PreparedStatement  create = con.prepareStatement("create table news(\r\n"
						+ "title text,content text\r\n"
						+ ");");
				create.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				disconnection();
			}
		}
		
		public void mydbinsert( String title,String content) {
			try {
				//��񿬰�
				getconnection();
				//sql�����ۼ�
				String sql="insert into news(title,content) "
						+"values(?,?)";
				//sql�� ����
				pstmt=con.prepareStatement(sql);
				
				//? ��ä���
				pstmt.setString(1, title);
				pstmt.setString(2, content);
				
				//db�� ����
				//db�� �� ������Ʈ�Ҷ�1
				pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disconnection();
			}
		}
		public void mydbupdate(int no,String name, String sex,String content) {
			try {
					getconnection();
					String sql="update member set name=?,sex=?,content=?"
							+"where no=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, name);
					pstmt.setString(2, sex);
					pstmt.setString(3, content);
					pstmt.setInt(4, no);
					
					pstmt.executeUpdate();
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					disconnection();
				}
			}
		//����
		public void mydbdelete(int no) {
			try {
				getconnection();
				String sql="delete from member where no=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, no);
				
				pstmt.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disconnection();
			}
		}
		//�˻���
		public void select(int no) {
			try {
				getconnection();
				//sql ���� �ۼ�
				String sql="select * from news where no=?";
				//mysql�� sql���� ����
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, no);
				//�������� �޾ƿ´�.
				ResultSet rs = pstmt.executeQuery();
				//����� ���
				while(rs.next()) {
					System.out.println(rs.getString(1)
					+ ","+rs.getString(2));
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disconnection();
			}
		}
	
	//public static void main(String[] args) {
		//database abc= new database();
		//abc.newtable();
		//abc.getconnection();
		//abc.mydbinsert(5, "������","����ȭ������" , "����");
		
		/*abc.mydblistdata();
		System.out.println("-----------------------");
		abc.mydbdelete(50);
		System.out.println("------------------");
		abc.mydblistdata();
		System.out.println("==================================");
		abc.select(3);*/
	//}

}