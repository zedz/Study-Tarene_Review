class EmpDAO{
	public void findAll(){
		Connection conn = null;
		Statement st = null;
		ResultSet rt = null;

		try{
			conn=DBUtils.getConnection();
			st=conn.createStatement();
			rt=st.executeQuery("select id,name,salary from emp");

			while(rt.next()){
				System.out.println(
					rt.getInt(1)+","+
					rt.getString(2)+","+
					rt.getDouble(3));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtils.closeConnection(conn);
		}
	}

	public static void main(String[] args) {
		EmpDAO emp=new EmpDAO();
		emp.findAll();
	}
}