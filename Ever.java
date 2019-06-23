/*
 * @Author: mikey.zhaopeng 
 * @Date: 2019-06-01 17:09:36 
 * @Last Modified by: mikey.zhaopeng
 * @Last Modified time: 2019-06-01 18:21:39
 */

import java.sql.*;
import java.util.Vector;
import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.IOException;



interface ModifInterface{
	public modifData();
}

public class Student extends{
	private String ID;
	private String name;
	private int age;
	private String sex;
	private String phone;
	private String QQ;
	private String department;
	private String major;
	private String sumScore;
	private String averageScore;
	private String chineseScore;
	private String mathScore;
	private String EnglishScore;
	private String C__Score;
	private String JavaScore;
	private String inearAlgebeaScore;
	
	public Student() {

	}

	public Student(String ID, String name, int age, String sex, String phone, String QQ, String depaer,
			String major) {

		setID(ID);
		setName(name);
		setAge(age);
		setSex(sex);
		setPhone(phone);
		setQQ(QQ);
		setDepartment(depaer);
		setMajor(major);
	}

	public String getID() {
		return ID;
	}

	public void setID(String studentID) {
		this.ID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String studentName) {
		this.name = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String studentSex) {
		this.sex = studentSex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String studentPhone) {
		this.phone = studentPhone;
	}

	public String getQQ() {
		return QQ;
	}

	public void setQQ(String studentQQ) {
		this.QQ = studentQQ;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String studentDepartment) {
		this.department = studentDepartment;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String studentMajor) {
		this.major = studentMajor;
	}
	public String getSumScore() {
		return sumScore;
	}

	public void setSumScore(String sumScore) {
		this.sumScore = sumScore;
	}

	public String getLessonChinese() {
		return chineseScore;
	}

	public void setLessonChinese(String lessonChinese) {
		this.chineseScore = lessonChinese;
	}

	public String getLessonMath() {
		return mathScore;
	}

	public void setLessonMath(String lessonMath) {
		this.mathScore = lessonMath;
	}

	public String getLessonEnglish() {
		return EnglishScore;
	}

	public void setLessonEnglish(String lessonEnglish) {
		this.EnglishScore = lessonEnglish;
	}

	public String getLessonC__() {
		return C__Score;
	}

	public void setLessonC__(String lessonC__) {
		this.C__Score = lessonC__;
	}

	public String getLessonJAVA() {
		return JavaScore;
	}

	public void setLessonJAVA(String lessonJAVA) {
		this.JavaScore = lessonJAVA;
	}

	public String getLessonInearAlgebea() {
		return inearAlgebeaScore;
	}

	public void setLessonInearAlgebea(String lessonInearAlgebea) {
		this.inearAlgebeaScore = lessonInearAlgebea;
	}

	public String getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(String averageScore) {
		this.averageScore = averageScore;
	}
}

//建立一个类用来进行排名
public class StudentScore {
	private String ID;
	private String Name;
	private double sumScore;
	private double averageScore;
	private double lessonChinese;
	private double lessonMath;
	private double lessonEnglish;
	private double lessonC__;
	private double lessonJAVA;
	private double lessonInearAlgebea;
	
	public StudentScore() {

	}

	public void initialize(String a, String b, double c) {	
		setName(b);
		setID(a);
		setSumScore(c);
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getSumScore() {
		return sumScore;
	}

	public void setSumScore(double sumScore) {
		this.sumScore = sumScore;
	}

	public double getLessonChinese() {
		return lessonChinese;
	}

	public void setLessonChinese(double lessonChinese) {
		this.lessonChinese = lessonChinese;
	}

	public double getLessonMath() {
		return lessonMath;
	}

	public void setLessonMath(double lessonMath) {
		this.lessonMath = lessonMath;
	}

	public double getLessonEnglish() {
		return lessonEnglish;
	}

	public void setLessonEnglish(double lessonEnglish) {
		this.lessonEnglish = lessonEnglish;
	}

	public double getLessonC__() {
		return lessonC__;
	}

	public void setLessonC__(double lessonC__) {
		this.lessonC__ = lessonC__;
	}

	public double getLessonJAVA() {
		return lessonJAVA;
	}

	public void setLessonJAVA(double lessonJAVA) {
		this.lessonJAVA = lessonJAVA;
	}

	public double getLessonInearAlgebea() {
		return lessonInearAlgebea;
	}

	public void setLessonInearAlgebea(double lessonInearAlgebea) {
		this.lessonInearAlgebea = lessonInearAlgebea;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}
}

public class Teacher {
	private String teacherID;
	private String teacherName;
	private String teacherPhone;
	private String teacherDepartment;

	public Teacher() {
	}

	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherPhone() {
		return teacherPhone;
	}

	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}

	public String getTeacherDepartment() {
		return teacherDepartment;
	}

	public void setTeacherDepartment(String teacherDepartment) {
		this.teacherDepartment = teacherDepartment;
	}
}


public class UserInformation {
	// 这里泛指所有用户

	private String name;
	private String password;
	private String ID;
	// 表示用户是学生还是老师(2,3)
	private String sign;

	public UserInformation() {
		// 默认编号为000000
		setID("000000");
		// 默认属性为零,表示它不是老师或学生
		setSign("");
	}

	public UserInformation(String name, String password) {
		setName(name);
		setPassword(password);
	}

	public String getName() {
		return name;
	}

	public void setName(String userName) {
		this.name = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String userPassword) {
		this.password = userPassword;
	}

	public String getID() {
		return ID;
	}

	public void setID(String userID) {
		this.ID = userID;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
}


//这个类用来建立与数据库的连接,并且封装了部分数据库指令
public class ConnectionSQL {

	// 调用DriverManager对象的getConnection()方法，获得一个Connection对象
	private static Connection connectionObject = null;

	// 建立与数据库连接的方法
	
	public static Connection getDatabaseConnection() {
		try {
			// 加载数据库连接驱动
			Class.forName("com.mysql.jdbc.Driver");
			// System.out.println("MySQL driver loaded successfully！");
			// 数据库的URL
			String sqlUrl = "jdbc:mysql://localhost:3306/mydata?useSSL=false";
			// 数据库的名字
			String sqlUserName = "root";
			// 数据库的密码
			String sqlPassward = "w990103";
			// 获取数据库的连接,若不成功则抛出异常
			connectionObject = DriverManager.getConnection(sqlUrl, sqlUserName, sqlPassward);
		} catch (Exception object) {
			System.out.println("连接数据库失败");
			object.printStackTrace();
		}
		return connectionObject;
	}

	// 关闭数据库连接方法
	public static Connection closeSQLConncetion() {
		try {
			connectionObject.close();
		} catch (Exception object) {
			System.out.println("关闭失败！");
			object.printStackTrace();
		}
		return connectionObject;
	}
}

public class DatabaseCommand {

	// 存放用户名和密码的表
	private String User_TableName = " User ";

	// 存放学生各项基本信息发表
	private String Student_Table = " Student ";

	// 三表存放教师基本信息
	private String Teacher_Table = " teacherinformation ";

	// 四表存放学生的各科成绩
	private String Score_Table = " studentScore ";

	// 五表放学生排名信息

	public String getTableName(String keyword) {
		switch (keyword) {
		case "User":
			return User_TableName;
		case "Student":
			return Student_Table;
		case "Teacher":
			return Teacher_Table;
		case "Score":
			return Score_Table;
		}
		return null;
	}

	// (仅用户表可用)添加指令
	public String insertTable1() {
		return "INSERT INTO " + getTableName("User") + "(ID,Name,Password) VALUES ";
	}

	// 仅1表,4表可用,给学生表中添加一个学号
	public String insertTable2(String tableName) {
		return "INSERT INTO " + tableName + "(Student_ID) VALUES ";
	}

	// (四个表均可用)基本操作
	public String sqlBasic(String tableName) {
		return "SELECT * FROM " + tableName;
	}

	// (四个表均可用)查找指令
	public String sqlFind(String tableName) {
		return sqlBasic(tableName) + " WHERE ";
	}

	// (四个表均可用)删除指令
	public String sqlDelete(String tableName) {
		return "DELETE FROM " + tableName + " WHERE ";
	}

	// (四个表均可用)修改指令
	public String sqlUpdate(String tableName) {
		return "UPDATE " + tableName + " SET ";
	}

	// 添加一列
	public String sqlInsertColumn(String tableName, String nameColumn) {
		return "ALTER TABLE " + tableName + " ADD COLUMN " + nameColumn + " VARCHAR(45) not NULL ";
	}
}

/**
 * 
 * @ClassName: TableOperation
 * @Description: 这个类用来直接对数据库中的表进行操作
 * @date 2018年12月20日
 *
 */

public class SqlOpreation extends DatabaseCommand {

	public SqlOpreation() {
	}

	// 创建Statement 对象用以执行SQL语句
	private static Statement statementObject = null;
	// 创建数据对象,用以接收数据
	private static ResultSet resultAssemblage = null;

	// -----------------关闭各项连接方法----------------------//
	public void closeConncetion() {
		try {
			resultAssemblage.close();
			statementObject.close();
			ConnectionSQL.closeSQLConncetion().close();
		} catch (SQLException object) {
			object.printStackTrace();
		}
	}

	// 表的通用操作方法
	public void basicOpera(String sqlSentence) {
		try {
			statementObject = ConnectionSQL.getDatabaseConnection().createStatement();
			statementObject.execute(sqlSentence);
			closeConncetion();
		} catch (SQLException object) {
			object.printStackTrace();
		}
	}

	// 表的查询通用办法,参数为数据库操作语句
	public boolean searchOpera(String sqlSentence) {
		try {
			statementObject = ConnectionSQL.getDatabaseConnection().createStatement();
			resultAssemblage = statementObject.executeQuery(sqlSentence);
			if (resultAssemblage.next()) {
				return true;
			}
			closeConncetion();
		} catch (SQLException object) {
			object.printStackTrace();
		}
		return false;
	}

	// 向某个表中增加一行信息的方法
	public void addData(String tableName, String newInformation) {
		String sqlSentence = null;
		if (tableName.equals(getTableName("User"))) {
			sqlSentence = insertTable1() + newInformation;
		}
		if (tableName.equals(getTableName("Score"))) {
			sqlSentence = insertTable2(tableName) + newInformation;
		}
		basicOpera(sqlSentence);
	}

	// 向某个表中增加一个新列的方法
	public void addColumn(String tableName, String nameColumn, String position) {
		String sqlSentence = null;
		if (position.equals("first")) {
			sqlSentence = sqlInsertColumn(tableName, nameColumn) + " first ";
		} else if (position.equals("end")) {
			sqlSentence = sqlInsertColumn(tableName, nameColumn);
		} else {
			sqlSentence = sqlInsertColumn(tableName, nameColumn) + "ALTER " + position;
		}
		basicOpera(sqlSentence);
	}

	// (仅用户表可用)删除用户表中一行用户名和密码信息的方法
	public void deleteTable1Row(String name) {
		String sqlSentence = sqlDelete(getTableName("User")) + " Name = '" + name + "'";
		basicOpera(sqlSentence);
	}

	// 基于主键查询某个表中的某项信息是否存在的方法,参数为表名，主键(编号或者用户名)，目标列和待查找值
	public boolean searchData(String tableName, String featureColumn, String featureValue, String goalColumn,String goalValue) {
		String sqlSentence = null;
		// 如果特征列和目标列相同，说明是为了查询主键是否存在于表中
		if (goalColumn.equals(featureColumn)) {
			sqlSentence = sqlFind(tableName) + " " + featureColumn + " = " + "'" + featureValue + "'";
		}
		// 否则为按主键查找目标值是否存在
		else {
			sqlSentence = sqlFind(tableName) + " " + featureColumn + " = '" + featureValue + "' AND " + goalColumn + " = '" + goalValue + "'";
		}
		// 判断该项与该特征编号是否对应,如果在表中能找到更改后的值,返回ture
		if (searchOpera(sqlSentence)) {
			return true;
		}
		return false;
	}

	// 基于编号修改某个表中的某项信息的方法,参数为表名，特征项(编号或者用户名)，信息项和新值
	public void modifData(String tableName, String featureColumn, String feartureValue, String goalColumn,
			String newValue) {
		// 如果要修改总成绩的话，则方法进行相应的调整，新值在方法中再次更新，而进行重新调整
		if (goalColumn.equals("sumScore")) {
			String sumScore, averScore = null;
			String sqlSentence3 = sqlFind(tableName) + " " + featureColumn + " = '" + feartureValue + "'";
			// size代表表的列数
			int size = getColumnTotal(getTableName("Score"));
			try {
				statementObject = ConnectionSQL.getDatabaseConnection().createStatement();
				resultAssemblage = statementObject.executeQuery(sqlSentence3);
				if (resultAssemblage.next()) {
					double sumScore1 = 0;
					for (int i = 1; i <= size - 2; i++) {
						if (i > 1) {
							sumScore1 += resultAssemblage.getDouble(i);
						}
					}
					double averScore1 = sumScore1 / 6;
					// 转换成字符串类型
					sumScore = String.format("%.2f", sumScore1);
					newValue = sumScore;
					averScore = String.format("%.2f", averScore1);
					closeConncetion();
				}
			} catch (SQLException object) {
				object.printStackTrace();
			}
			// 顺便修改平均成绩
			String sqlSentence4 = sqlUpdate(tableName) + " averScore = '" + averScore + "' WHERE " + featureColumn
					+ " = '" + feartureValue + "'";
			basicOpera(sqlSentence4);
		}
		// 对表中的信息进行修改
		String sqlSentence = sqlUpdate(tableName) + " " + goalColumn + " = '" + newValue + "' WHERE " + featureColumn
				+ " = '" + feartureValue + "'";
		basicOpera(sqlSentence);
	}

	// 基于某个特征列的主键返回目标列的目标值的方法,只提供按编号或者用户名作为主键查询
	public String getData(String tableName, String featureColumn, String featureValue, String goalColumn) {
		// 取出表的全部列名
		Vector<String> nameColumns_Vector = getListNames(tableName);
		int n = 0;
		int size = nameColumns_Vector.size();
		for (int i = 0; i < size; i++) {
			// 确定目标项在列中的位置
			if (goalColumn.equals(nameColumns_Vector.get(i))) {
				n = i + 1;
				break;
			}
		}
        
		String sqlSentence = sqlFind(tableName) + " " + featureColumn + " = '" + featureValue + "'";
		String str = null;
		try {
			statementObject = ConnectionSQL.getDatabaseConnection().createStatement();
			resultAssemblage = statementObject.executeQuery(sqlSentence);
			// 如果数据库中存在该元素
			if (resultAssemblage.next()) {
				str = resultAssemblage.getString(n);
			}
			// 关闭连接
			closeConncetion();
		} catch (SQLException object) {
			object.printStackTrace();
		}
		return str;
	}

	// 得到某个表中的总记录数
	public int getaTableRowTotal(String tableName) {
		String sqlSentence = sqlBasic(tableName);
		int countRows = 0;
		try {
			statementObject = ConnectionSQL.getDatabaseConnection().createStatement();
			resultAssemblage = statementObject.executeQuery(sqlSentence);
			while (resultAssemblage.next()) {
				countRows++;
			}
			closeConncetion();
		} catch (SQLException object) {
			object.printStackTrace();
		}
		return countRows;
	}

	// 获得某个表的总列数
	public int getColumnTotal(String tableName) {
		String sqlSentence = sqlBasic(tableName);
		int countColumns = 0;
		try {
			statementObject = ConnectionSQL.getDatabaseConnection().createStatement();
			resultAssemblage = statementObject.executeQuery(sqlSentence);
			countColumns = resultAssemblage.getMetaData().getColumnCount();
			resultAssemblage.last();
		} catch (SQLException object) {
			object.printStackTrace();
		}
		return countColumns;
	}

	// 获取某个表的所有列名
	public Vector<String> getListNames(String tableName) {
		Vector<String> nameColumn_Vector = new Vector<>();
		String sqlSentence = sqlBasic(tableName);
		// size代表表的列数
		int size = getColumnTotal(tableName);
		try {
			statementObject = ConnectionSQL.getDatabaseConnection().createStatement();
			resultAssemblage = statementObject.executeQuery(sqlSentence);
			if (resultAssemblage.next()) {
				for (int i = 1; i <= size; i++) {
					nameColumn_Vector.add(resultAssemblage.getMetaData().getColumnName(i));
				}
			}
			closeConncetion();
		} catch (SQLException object) {
			object.printStackTrace();
		}
		return nameColumn_Vector;
	}

	// 取出某个表中某一列的所有值的方法
	public Vector<String> getListAllData(String tableName, String goalColumn) {
		// n表示目标列是第几列
		int n = 0;
		// 取出这个表的全部列名
		Vector<String> nameCloumn_Vector = getListNames(tableName);
		// 取得该表的总列数
		int size = getColumnTotal(tableName);
		for (int i = 0; i < size; i++) {
			if (goalColumn.equals(nameCloumn_Vector.get(i))) {
				n = i + 1;
			}
		}
		// 新建一个容器,一会把该所有用户的用户名都存到其中
		Vector<String> temporaryVector = new Vector<String>();
		String sqlSentence = sqlBasic(tableName);
		try {
			statementObject = ConnectionSQL.getDatabaseConnection().createStatement();
			resultAssemblage = statementObject.executeQuery(sqlSentence);
			while (resultAssemblage.next()) {
				temporaryVector.add(resultAssemblage.getString(n));
			}
			closeConncetion();
		} catch (SQLException object) {
			object.printStackTrace();
		}
		return temporaryVector;
	}

	// 取出某个表中某一行全部信息的方法,参数为表名和特征编号
	public Vector<String> getRowAllValue(String tableName, String feartureCloumn, String featureValue) {
		// 如果是学生成绩表的话
		if (tableName.equals(getTableName("Score"))) {
			// 更新一下总成绩
			modifData(tableName, "Student_ID", featureValue, "sumScore", "");
		}
		Vector<String> temporaryVector = new Vector<String>();
		String sqlSentence = sqlFind(tableName) + " " + feartureCloumn + " = '" + featureValue + "'";
		try {
			statementObject = ConnectionSQL.getDatabaseConnection().createStatement();
			resultAssemblage = statementObject.executeQuery(sqlSentence);
			if (resultAssemblage.next()) {
				// size代表表的列数
				int size = getColumnTotal(tableName);
				for (int i = 1; i <= size; i++) {
					temporaryVector.add(resultAssemblage.getString(i));
				}
			}
			closeConncetion();
		} catch (SQLException object) {
			object.printStackTrace();
		}
		return temporaryVector;
	}

	// 取得一个表中全部信息的方法
	public Vector<Vector<String>> getTableAllData(String tableName) {
		// 如果是学生成绩表，先更新一下总成绩
		if (tableName.equals(getTableName("Score"))) {
			// 为了更新总成绩，先取出全体学生的学号
			Vector<String> studentID_Vector = getListAllData(getTableName("Score"), "Student_ID");
			// 根据学号更新每一个学生的总成绩
			int size = studentID_Vector.size();
			for (int i = 0; i < size; i++) {
				modifData(getTableName("Score"), "Student_ID", studentID_Vector.get(i), "sumScore", "");
			}
		}
		// 新建一个容器,一会把整个表中的信息都存到其中
		Vector<Vector<String>> allTable_Vector = new Vector<Vector<String>>();
		// 这个容器用来装每一行的全部信息
		Vector<String> someRow_Vector = new Vector<String>();
		String sqlSentence = sqlBasic(tableName);
		// 代表一个表的列数
		int size = getColumnTotal(tableName);
		try {
			statementObject = ConnectionSQL.getDatabaseConnection().createStatement();
			resultAssemblage = statementObject.executeQuery(sqlSentence);
			while (resultAssemblage.next()) {
				for (int i = 1; i <= size; i++) {
					someRow_Vector.add(resultAssemblage.getString(i));
				}
				// 小容器装入大容器中
				allTable_Vector.add(someRow_Vector);
				someRow_Vector = new Vector<String>();
			}
			closeConncetion();
		} catch (SQLException object) {
			object.printStackTrace();
		}
		return allTable_Vector;
	}

	// 将某个表中的所有数据导出为文件
	public void exportDatabaseFile(String tableName, String fileName, String fileFormat) {
		// 将某个表中的全部数据导入指定磁盘的某个xls文件中
		String sqlSentence = sqlBasic(tableName) + " into outfile ' E:" + fileName + fileFormat;
		// 执行导出
		basicOpera(sqlSentence);
	}

	// 将表中的某行的全部数据导出为excle文件
	public void exportRowDataFile(String tableName, String featureColumn, String featureValue, String fileName,
			String fileFormat) {
		// 将学生表中的某个学生的全部数据导入指定磁盘的某个xls文件中
		String sqlSentence = sqlFind(tableName) + " " + featureColumn + " = '" + featureValue + "' into outfile ' E:"
				+ fileName + fileFormat;
		basicOpera(sqlSentence);
	}

}


/**
 * 
 * @ClassName: Backend
 * @Description: TODO 这个类用来接收前端的输入的数据,并向前端反馈输入结果
 * @date 2018年12月20日
 *
 */
public class Backend extends SqlOpreation{

	public Scanner input = new Scanner(System.in);

	public Backend() {
	}

	// 修改并且显示修改信息是否成功的方法
	public void modifInformation(String tableName, String featureColumn, String featureValue, String goalColumn,String newValue) {
		//如果是要修改成绩
		if(tableName.equals(getTableName("Score"))){
            String newScore = input.nextLine();
		    // 判断输入的成绩合不合法
            if(!judgeLegitimacyScore(0, 100, newScore)){
                System.out.println("输入成绩不合法请重新输入");
				//递归
                modifInformation(tableName,featureColumn,featureValue,goalColumn,newValue);
			}
			// 更新总成绩与平均成绩
		    modifData(getTableName("Score"), "Student_ID", featureValue, "sumScore", "");
		}
		modifData(tableName, featureColumn, featureValue, goalColumn, newValue);
		// 如果表中不能找修改后的数据
		if (!searchData(tableName, featureColumn, featureValue, goalColumn, newValue)) {
			System.out.println("修改失败!");
			return;
		}
		System.out.println("修改成功!");
	}

	// 判断输入成绩的合法性,参数为接收的数据与成绩要求的上下限
	public boolean judgeLegitimacyScore(double minValue, double maxValue, String score) {
		// 判断输入的字符串是不是仅由0~9组成的
		for (int i = 0; i < score.length(); i++) {
			// 如果该位的字符不是一个数字
			if (!score.mathes("[0-9]") {
				return false;
			}
		}
		// 把该字符转换为数字,判断该成绩的合法性
		double score1 = new Double(score);
		if (score1 >= minValue && score1 <= maxValue) {
			return true;
		}
		return false;
	}

	// 后台身份查询方法,接收用户的编号,返回用户的身份
	public String judegIdentity(String number) {
		// 如果能在学生表中找到此编号,则表示其身份是学生
		if (searchData(getTableName("Student"), "Student_ID", number, "Student_ID", "")) {
			return "Student";
		}
		// 如果能在教师表中找到此编号,则表示其身份是学生
		if (searchData(getTableName("Teacher"), "Teacher_ID", number, "Teacher_ID", "")) {
			return "Teacher";
		} else {
			return "ERROR";
		}
	}

	// 后台判定某个编号是否已经被使用的方法
	public String findIDTable1(String number) {
		// 如果此编号存在于学生信息表中,则判断它是否已经被绑定
		if (searchData(getTableName("Student"), "Student_ID", number, "Student_ID", "")) {
			// 如果用户表中没有找到该学号,说明该学号还没有被绑定过
			if (!searchData(getTableName("User"), "ID", number, "ID", "")) {
				return "sure";
			}
			return "This Student_ID is already used";

		}
		// 如果此编号存在于老师信息表中,则判断它是否已经被绑定
		else if (searchData(getTableName("Teacher"), "Teacher_ID", number, "Teacher_ID", "")) {
			// 如果用户表中没有找到该学号,说明该工号还没有被绑定过
			if (!searchData(getTableName("User"), "ID", number, "ID", "")) {
				return "sure";
			}
		}
		return "This Teacher_ID is already used";
	}

	// 后台向用户表中添加新用户数据方法,如果添加成功则返回true
	public boolean addUser(String number, String name,
			String password) {
		String newInformation = "('" + number + "','" + name + "','" + password + "')";
		// 用户表新增数据,并判断是否添加成功
		addData(getTableName("User"), newInformation);
		// 若能在用户表中找到该用户名和密码
		if (searchData(getTableName("User"), "Name", name, "Password", password)) {
			return true;
		}
		return false;

	}

	// 后台删除用户方法,接收前台传入的用户名,并删除该用户
	public boolean deletedUser(String name) {
		// 调用父类的删除方法删除这个用户
		deleteTable1Row(name);
		// 判断是否删除成功,即是否能在用户表中找到这个用户
		if (!searchData(getTableName("User"), "Name", name, "Name", "")) {
			return true;
		}
		return false;

	}

	// 后台反馈用户真实姓名的方法,接收一个编号返回该用户的真实姓名
	public String getRealName(String number) {
		// 判断该编号是否位于学生表
		if (searchData(getTableName("Student"), "Student_ID", number, "Student_ID", "")) {
			// 返回该学生的姓名
			return getData(getTableName("Student"), "Student_ID", number, "Name");
		}
		// 否则如果该编号存在于老师表
		else if (searchData(getTableName("Teacher"), "Teacher_ID", number, "Teacher_ID", "")) {
			return getData(getTableName("Teacher"), "Teacher_ID", number, "Name");
		} else {
			return "error";
		}
	}

	// 后台获取全体学生排名表方法
	public Vector<StudentScore> getStudentsRank() {
		// 取出所有人的各科成绩
		Vector<Vector<String>> allScore_Vector = getTableAllData(getTableName("Score"));
		// 取出所有学生的姓名
		Vector<String> allName_Vector = getListAllData(getTableName("Student"), "Name");
		// 计算总人数
		int headcount = allScore_Vector.size();
		System.out.println("共" + headcount + "名学生");
		// 这个容器用来装每一个的信息类对象
		Vector<StudentScore> students_Vector = new Vector<StudentScore>();
		// 用来装一个人信息的容器
		Vector<String> someOne_Vector = new Vector<String>();
		// 遍历所有人
		for (int i = 0; i < headcount; i++) {
			// 建立一个学生对象
			StudentScore stuObject = new StudentScore();
			// 读取一个学生的成绩信息
			someOne_Vector = allScore_Vector.get(i);
			// 成绩容器中的第七项是学生的总成绩
			// 将字符串类型转换为double类型
			double sumScore = new Double(someOne_Vector.get(7));
			// 接收三个容器中的学号,姓名,总成绩,初始化学生对象
			stuObject.initialize(someOne_Vector.get(0), allName_Vector.get(i), sumScore);
			// 将这个学生对象添加到容器中
			students_Vector.add(stuObject);
		}
		// 这个容器用来装排名完成后的排名表
		Vector<StudentScore> rank_Vector = new Vector<StudentScore>();
		// 当容器不为空时继续排序工作
		while (!students_Vector.isEmpty()) {
			// 假设第一个学生是第一名
			StudentScore maxScore = students_Vector.get(0);
			// 初始最大值下标
			int maxIndex = 0;
			headcount = students_Vector.size();
			for (int i = 1; i < headcount; i++) {
				if (students_Vector.get(i).getSumScore() >= maxScore.getSumScore()) {
					// 更新下标
					maxIndex = i;
				}
			}
			// 将该轮找到的最大值放入新容器内
			rank_Vector.add(students_Vector.get(maxIndex));
			// 在原容器中删除该学生的信息
			students_Vector.remove(maxIndex);
		}
		return rank_Vector;
	}

	// 后台导出某个老师或学生信息到excel或txt文件中的方法
	public void exportInformationFile(String tableName, String featureColumn, String featureValue, String fileName,
			String fileFormat) {

		// ".xls" ".txt"
		File fileObject = new File("E:" + fileName + fileFormat);
		// 如果该文件已经存在,返回错误提示
		if (fileObject.exists()) {
			System.out.println("该文件已经存在");
			return;
		}
		// 如果特征列的值为空，说明是要导出整个表的数据
		if (featureColumn.equals("")) {
			exportDatabaseFile(tableName, fileName, fileFormat);
		} else {
			exportRowDataFile(tableName, featureColumn, featureValue, fileName, fileFormat);
		}
		try {
			fileObject.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 判断该文件是否已经被创建
		if (fileObject.exists()) {
			// 返回操作成功的提示
			System.out.println("导出成功");
		}
	}

	// 功能函数---产生一个合法的密码
	public String getValidityPassword() {
		String password;
		System.out.println("-----密码长度应在6~13位之间,只能包括数字,字母");
        System.out.println("请输入一个密码");

        password = input.nextLine();

        if(password.length() < 6 ||password.length() > 13){
            System.out.println("密码长度不合法!,请重新输入密码");
            return getValidityPassword();
        }

        for (int i = 0; i < password.length(); i++) {
            //str是仅含英文或数字(只有英文数字的字符串)返回true 否则false
			if (!(password.matches("[a-zA-Z0-9]"))) {
				System.out.println("密码错误,只能包括数字,字母,请重新输入密码");
				return getValidityPassword();
		    }
        }
        return password;
    }
}

//主页面类

public class Frontend {
	public Frontend() {
	}
	public Scanner input = new Scanner(System.in);

	// 三级学生菜单
	public void thirdStudentMenus(UserInformation userObj) {
		while (true) {
			System.out.println("------------------------三级菜学生单--------------------------");
			System.out.println(
            "1---修改全部信息\n
            2---修改年龄\n
            3---修改性别\n
            4---修改QQ号\n
            5---修改电话\n
            6---修改出生年月\n
            9---退出");
			String button = input.nextLine();
			String newValue = null;
			switch (button) {
			// 修改该学生的全部个人信息
			case "1":
				// 仅修改年龄
			case "2":
				System.out.println("请输入新年龄:");
				newValue = input.nextLine();
				modifInformation(getTableName("Student"), "Student_ID", userObj.getID(), " Age ",newValue);
				if (!button.equals("1")) {
					break;
				}
				// 仅修改性别
			case "3":
				System.out.println("请输入新性别");
				newValue = input.nextLine();
				modifInformation(getTableName("Student"), "Student_ID", userObj.getID(), " Sex ",newValue);
				if (!button.equals("1")) {
					break;
				}
				// 仅修改QQ
			case "4":
				System.out.println("请输入新QQ");
				newValue = input.nextLine();
				modifInformation(getTableName("Student"), "Student_ID", userObj.getID(), " QQ ",
						newValue);
				if (!button.equals("1")) {
					break;
				}
				// 仅修改电话
			case "5":
				System.out.println("请输入新电话");
				newValue = input.nextLine();
				modifInformation(getTableName("Student"), "Student_ID", userObj.getID(), " Phone ",
						newValue);
				if (!button.equals("1")) {
					break;
				}
				// 仅修改出生年月
			case "6":
				System.out.println("请输入新的出生年月");
				newValue = input.nextLine();
				modifInformation(getTableName("Student"), "Student_ID", userObj.getID(),
						" Birthday ", newValue);
				if (!button.equals("1")) {
					break;
				}
			case "9":
				return;
			default:
				System.out.println("指令错误请重新输入");
			}
		}
	}

	// 四级级老师菜单，用于修改学生的成绩
	public void teacherMenusModifStudntScore() {
		System.out.println("-----------------------三级老师单--------------------------");
		// 建立一个学生对象
		Student studentObject = new Student();
		String student_ID;
		String name;
		while (true) {
			System.out.println("请输入想要修改成绩的学生的学号");
			student_ID = input.nextLine();
			// 如果在学生表中不能找到该学生编号
			if (!searchData(getTableName("Student"), "Student_ID", student_ID,
					"Student_ID", "")) {
				System.out.println("查无此人!请重新输入");
				return;
			}
			studentObject.setID(student_ID);
			// 取得该学生的真实姓名
			name = getRealName(student_ID);
			// 初始化这个学生的所有成绩
			Vector<String> vector = getRowAllValue(getTableName("Score"), "Student_ID",student_ID);
			// set方法初始化该生的语文成绩
			studentObject.setLessonChinese(vector.get(1));
			// set方法初始化该生的数学成绩
			studentObject.setLessonMath(vector.get(2));
			// set方法初始化该生的英语成绩
			studentObject.setLessonEnglish(vector.get(3));
			// set方法初始化该生的C++成绩
			studentObject.setLessonC__(vector.get(4));
			// set方法初始化该生的Java成绩
			studentObject.setLessonJAVA(vector.get(5));
			// set方法初始化该生的线性代数成绩
			studentObject.setLessonInearAlgebea(vector.get(6));
			System.out.println("正在修改" + name + "的成绩");
			break;
		}
		// 进行下一步操作
		System.out.println(
				"1---修改全部成绩\n2---修改语文成绩\n3---修改数学成绩\n4---修改英语成绩\n5---修改C++成绩\n" 
                + "6---修改Java成绩\n7---修改线性代数成绩\n9---退出");
		String button = input.nextLine();
		switch (button) {
		case "1":
		case "2":
			// 修改语文成绩
			System.out.println("原本成绩为"+ studentObject.getLessonChinese())
			System.out.println("请输入 " + name + " 语文成绩");
			modifInformation(getTableName("Score"),"Student_ID",student_ID, "Chinese","");
			if (!button.equals("1")) {
				break;
			}
		case "3":
		System.out.println("原本成绩为"+ studentObject.getLessonChinese())
			System.out.println("请输入 " + name + " 数学成绩");
			modifInformation(getTableName("Score"),"Student_ID",student_ID, "Math","");
			if (!button.equals("1")) {
				break;
			}
		case "4":
		    System.out.println("原本成绩为"+ studentObject.getLessonChinese())
			System.out.println("请输入 " + name + " 英语成绩");
			modifInformation(getTableName("Score"),"Student_ID",student_ID, "English","");
			if (!button.equals("1")) {
				break;
			}
		case "5":
		    System.out.println("原本成绩为"+ studentObject.getLessonChinese())
			System.out.println("请输入 " + name + " C++成绩");
			modifInformation(getTableName("Score"),"Student_ID",student_ID, "C__","");
			if (!button.equals("1")) {
				break;
			}
		case "6":
		    System.out.println("原本成绩为"+ studentObject.getLessonChinese())
			System.out.println("请输入 " + name + " Java成绩");
			modifInformation(getTableName("Score"),"Student_ID",student_ID, "Java","");
			if (!button.equals("1")) {
				break;
			}
		case "7":
		    System.out.println("原本成绩为"+ studentObject.getLessonChinese())
			System.out.println("请输入 " + name + " 线性代数成绩");
			modifInformation(getTableName("Score"),"Student_ID",student_ID, "inear algebra","");
			break;
		}
	}

	// 三级老师菜单
	public void thirdMenusModifTeacherInforamtion(UserInformation userObj) {
		System.out.println("------------------------三级老师单--------------------------");
		System.out.println("1---修改全部信息\n2---修改电话3---修改出生年月\n9---退出");
		String button = input.nextLine();
		String newValue = null;
		switch (button) {
		case "1":
		case "2":
			System.out.println("请输入新电话");
			newValue = input.nextLine();
			modifInformation(getTableName("Teacher"), "Teacher_ID", userObj.getID(), " Phone ", newValue);
			if (!button.equals("1")) {
				break;
			}
		case "3":
			System.out.println("请输入新出生年月");
			newValue = input.nextLine();
			modifInformation(getTableName("Teacher"), "Teacher_ID", userObj.getID(), " Birthday ", newValue);
			if (!button.equals("1")) {
				break;
			}
		case "9":
			return;
		default:
			System.out.println("指令错误请重新输入");
		}
	}

	// 二级学生菜单
	public void fronted_Second_Student_Menus(UserInformation userObj) {
		while (true) {
			System.out.println("------------------------二级菜单--------------------------");
			System.out.println("1---查看该学生全部信息\n2---修改该学生信息\n3---查看该学生成绩\n4---查看该用户选课情况\n9---退出");
			String bottun = input.nextLine();
			switch (bottun) {
			// 查看该用户全部信息
			case "1":
				display_Student_CompleteInformation(userObj.getName(), userObj.getID());
				break;
			// 修改该用户信息
			case "2":
				thirdStudentMenus(userObj);
				break;
			case "3":
				display_Student_Scores(userObj.getName(), userObj.getID());
				break;
			case "9":
				return;
			default:
				System.out.println("指令错误请重新输入");
			}
		}
	}

	// 二级老师菜单
	public void fronted_Second_Techer_Meuns(UserInformation userObj) {
		while (true) {
			System.out.println("------------------------二级菜单--------------------------");
			System.out.println("1---查看本人全部信息\n2---修改本人信息\n3---查看学生概览\n4---查看全体学生个人信息\n"
					+ "5---查看全部学生成绩\n6---查看学生排名\n7---录入(修改)学生成绩\n9---退出");
			String bottun = input.nextLine();
			switch (bottun) {
			case "1":
				fronted_Display_A_Teacher_CompleteInformation(userObj.getName(), userObj.getID());
				break;
			case "2":
				thirdMenusModifTeacherInforamtion(userObj);
				break;
			case "3":
				fronted_Display_AllStudents_StudentID_Name();
				break;
			case "4":
				display_AllStudents_CompleteInformation();
				break;
			case "5":
				fronted_Display_AllStudent_AllScore();
				break;
			case "6":
				fronted_Display_AllStudent_ClassRanking();
				break;
			case "7":
				teacherMenusModifStudntScore();
				break;
			case "9":
				return;
			}
		}
	}

	// 一级菜单
	public void fronted_Main_BasicMenus() {
		// 建立一个用户对象
		UserInformation userObj = new UserInformation();
		while (true) {
			System.out.print("1---用户登陆\n2---新用户注册\n3---删除用户\n");
			System.out.println("4---修改密码\n5---查看所有用户\n9---退出系统");
			String bottun = input.nextLine();
			switch (bottun) {
			// 用户登陆
			case "1":
				fronted_LogIn(userObj);
				// 若该用户是学生,则进入二级学生菜单
				if ((userObj.getSign()).equals("Student")) {
					fronted_Second_Student_Menus(userObj);
				}
				// 若该用户是老师,进入老师二级菜单
				if ((userObj.getSign()).equals("Teacher")) {
					fronted_Second_Techer_Meuns(userObj);
				}
				break;
			// 新用户注册
			case "2":
				fronted_Registretion();
				break;
			// 学生用户注销
			case "3":
				fronted_Delete_Only_StudentUser();
				break;
			// 修改密码
			case "4":
				fronted_Modif_User_Password();
				break;

			case "5":
				fronted_Display_All_UserName();
				break;
			}
		}
	}

	// 用户登陆,系统自动判断它的身份
	public void fronted_LogIn(UserInformation userObj) {
		System.out.println("请输入用户名");
		String useName = input.nextLine();
		// 第一步------判断用户名的合法性,如果不能在用户表中找到该用户名
		if (!searchData(getTableName("User"), "Name", useName, "Name", "")) {
			System.out.println("该用户不存在,请检查输入或者注册");
		}
		int flag = 1;
		while (true) {
			if (flag == 1) {
				System.out.println("请输入密码");
			} else {
				System.out.println("您还可以输入" + flag + "次，请重新输入密码");
			}
			// 对密码的合法性进行判断,判断用户名和密码是否相对应
			String userPassword = input.nextLine();
			// 如果用户表中该用户名和密码不对应
			if (!searchData(getTableName("User"), "Name", useName, "Password",
					userPassword)) {
				System.out.println("密码不正确!");
				flag++;
				if (flag == 3) {
					return;
				}
			}
			System.out.println("登陆成功!");
			// 更新对象密码
			userObj.setPassword(userPassword);
			// 从用户表中获取该登陆用户的编号
			String userID = getData(getTableName("User"), "Name", useName, "ID");
			// 更新对象编号
			userObj.setID(userID);
			// 获取该用户的真实姓名
			String realName = getRealName(userID);
			// 更新对象的真实姓名
			userObj.setName(realName);
			// 获取用户身份
			String str = backend_Judeg_Identity_BaseOn_ID(userObj.getID());
			// 给出欢迎语
			System.out.println("欢迎您" + useName);
			// 如果该用户是学生
			if (str.equals("Student")) {
				// 更新对象身份
				userObj.setSign("Student");
				System.out.println(realName + "学生");
			}
			// 如果该用户是学生
			if (str.equals("Teacher")) {
				// 更新对象身份
				userObj.setSign("Teacher");
				System.out.println(realName + "老师");
			}
			return;
		}
	}

	// 新用户信息注册
	public void fronted_Registretion() {
		boolean flag = true;
		// 第一步------绑定工号或学号
		String number;
		// 判断该编号的合法性
		while (true) {
			if (flag) {
				System.out.println("请输入想要绑定的工号或学号");
			} else {
				System.out.println("请重新输入想要绑定的工号或学号");
			}
			number = input.nextLine();
			// 如果该编号未被绑定
			if (findIDTable1(number).equals("sure")) {
				flag = true;
				break;
			}
			if (findIDTable1(number)
					.equals("This Student_ID is already used")) {
				System.out.println("该学号已经被绑定!");
				flag = false;
			}
			if (findIDTable1(number)
					.equals("This Teacher_ID is already used")) {
				System.out.println("该工号已经被绑定!");
				flag = false;
			}
		}
		// 第二步------判断用户名的合法性， 判断用户名是否可以使用
		String name;

		while (true) {
			if (flag) {
				System.out.print("请输入一个用户名");
			} else {
				System.out.print("请重新输入一个用户名");
			}
			name = input.nextLine();
			// 如果用户表中不存在该用户名
			if (!searchData(getTableName("User"), "Name", name, "Name", "")) {
				flag = true;
				break;
			}
			System.out.println("该用户名已经存在请重新输入");
			flag = false;
		}
		// 第三步------判断密码的正确性，调用方法，产生一个合法的密码
		System.out.println("请输入密码");
		String password = getValidityPassword();
		while (true) {
			if (flag) {
				System.out.println("请再次输入密码");
			} else {
				System.out.println("请重新输入密码");
			}
			String password2 = input.nextLine();
			// 如果前后两次密码一致
			if (password.equals(password2)) {
				break;
			}
			System.out.println("前后两次密码不一致请重新输入");
			flag = false;
		}
		// 第四步------添加用户,判断是否添加成功,如果用户表中不能找到该用户名和其对应的密码
		if (!addUser(number, name, password)) {
			System.out.println("注册失败");
			return;
		}
		System.out.println("注册成功");
	}

	// 用户修改密码方法
	public void fronted_Modif_User_Password() {
		System.out.print("请输入想要修改密码的用户的用户名");
		String name = input.nextLine();
		// 判断该用户是否存在,如果不存在则函数结束
		if (!searchData(getTableName("User"), "Name", name, "Name", "")) {
			System.out.println("该用户不存在");
			return;
		}
		String newPassword = null, newpassword2;
		System.out.println("请输入原始密码");
		String oldPassword = input.nextLine();
		// 如果该用户名和密码不对应则函数结束
		if (!searchData(getTableName("User"), "Name", name, "Password", oldPassword)) {
			System.out.println("密码错误!");
			return;
		}
		while (true) {
			System.out.println("请输入新密码");
			// 产生一个合法的新密码
			newPassword = getValidityPassword();
			while (true) {
				// 如果新旧密码不相同
				if (!oldPassword.equals(newPassword)) {
					break;
				}
				System.out.println("新旧密码不能相同,请重新输入");
				newPassword = getValidityPassword();
			}
			System.out.println("请再次输入此密码");
			newpassword2 = input.nextLine();
			// 如果前后两次密码相同,进行下一步
			if (newPassword.equals(newpassword2)) {
				break;
			}
			System.out.println("前后两次密码不一致,请重新输入");
			newPassword = input.nextLine();
		}
		// 向后台传入新密码,后台反馈是否修改成功的结果
		modifInformation(getTableName("User"), "Name", name, "Password", newPassword);
	}

	// 删除用户方法,仅限学生用户删除自己的账号
	public void fronted_Delete_Only_StudentUser() {
		System.out.print("请想输入想删除用户的用户名");
		String name = input.nextLine();
		// 判断该用户名是否可以使用,如果后台不能查询到该用户,则函数结束
		if (!searchData(getTableName("User"), "Name", name, "Name", "")) {
			System.out.println("该用户不存在!");
			return;
		}
		// 从用户表中得到该用户的编号,判断该用户的身份
		String number = getData(getTableName("User"), "Name", name, "ID");
		// 如果是老师
		if (backend_Judeg_Identity_BaseOn_ID(number).equals("Teacher")) {
			System.out.println("不可以删除老师用户!");
			return;
		}
		// 如果是学生
		if (backend_Judeg_Identity_BaseOn_ID(number).equals("Student")) {
			System.out.print("请输入该用户的密码");
			String password = input.nextLine();
			// 判断该用户名和密码是否一致,如果不一致则函数结束
			if (!searchData(getTableName("User"), "Name", name, "Password", password)) {
				System.out.println("密码错误");
				return;
			}
			// 如果得到的是失败反馈
			if (!deletedUser(name)) {
				System.out.println("该用户删除失败");
				return;
			}
			System.out.println("该用户删除成功,学号 " + number + " 以解除绑定!");
		}
	}

	public void fronted_Display_All_UserName() {
		Vector<String> vectorObject = getListAllData(getTableName("User"), "Name");
		int size = vectorObject.size();
		for (int i = 0; i < size; i++) {
			System.out.println(vectorObject.get(i));
		}

	}

	// 显示一名学生用户全部信息方法,向后台传入一个学号,后台用容器传输回该学生所有信息
	public void display_Student_CompleteInformation(String name, String featureValue) {
		if (!searchData(getTableName("Student"), "Student_ID", featureValue, "Student_ID",
				"")) {
			System.out.println("该学号错误");
			return;
		}
		Vector<String> peopleVecotr = getRowAllValue(getTableName("Student"),
				"Student_ID", featureValue);
		System.out.println("-----------------------------------");
		System.out.println("学生" + name + "的全部信息为 ");
		System.out.println(name + "的学号为:" + peopleVecotr.get(0));
		System.out.println(name + "的姓名为:" + peopleVecotr.get(1));
		System.out.println(name + "的年龄为:" + peopleVecotr.get(3));
		System.out.println(name + "的性别为:" + peopleVecotr.get(4));
		System.out.println(name + "的电话为:" + peopleVecotr.get(5));
		System.out.println(name + "的QQ号为:" + peopleVecotr.get(6));
		System.out.println("-----------------------------------");
	}

	// 显示一名学生用户各科成绩方法,向后台传入一个学号,后台用容器传输回该学生的各科成绩
	public void display_Student_Scores(String name, String featureValue) {
		if (!searchData(getTableName("Student"), "Student_ID", featureValue, "Student_ID",
				"")) {
			System.out.println("该学号错误");
			return;
		}
		// 取出该学生的全部成绩信息
		Vector<String> scoreVector = getRowAllValue(getTableName("Score"), "Student_ID",
				featureValue);
		System.out.println("-----------------------------------");
		System.out.println("学生" + name + "的各科成绩为 ");
		System.out.println(name + "的学号为:" + featureValue);
		System.out.println(name + "的姓名为:" + name);
		System.out.println(name + "的语文成绩为:" + scoreVector.get(1) + "分");
		System.out.println(name + "的数学成绩为:" + scoreVector.get(2) + "分");
		System.out.println(name + "的英语成绩为:" + scoreVector.get(3) + "分");
		System.out.println(name + "的C++成绩为:" + scoreVector.get(4) + "分");
		System.out.println(name + "的JAVA成绩为:" + scoreVector.get(5) + "分");
		System.out.println(name + "的线性代数成绩为: " + scoreVector.get(6) + "分");
		System.out.println(name + "的总成绩为: " + scoreVector.get(7) + "分");
		System.out.println(name + "的平均成绩为: " + scoreVector.get(8) + "分");
		System.out.println("-----------------------------------");
	}

	// 显示全部学生用户全部信息方法,仅限老师操作,后台用容器传输回全部学生所有信息
	public void display_AllStudents_CompleteInformation() {
		// 取出所有学生的学号
		Vector<String> allIDVector = getListAllData(getTableName("Student"),
				"Student_ID");
		// 取出所有学生的姓名
		Vector<String> allNameVector = getListAllData(getTableName("Student"),
				"Name");
		int size = allIDVector.size();
		for (int i = 0; i < size; i++) {
			System.out.println("第" + (i + 1) + "位学生");
			display_Student_CompleteInformation(allNameVector.get(i), allIDVector.get(i));
		}
	}

	// 显示全部学生各科成绩的方法
	public void fronted_Display_AllStudent_AllScore() {
		// 取出所有学生的学号
		Vector<String> allIDVector = getListAllData(getTableName("Student"),
				"Student_ID");
		// 取出所有学生的姓名
		Vector<String> allNameVector = getListAllData(getTableName("Student"),
				"Name");
		int size = allIDVector.size();
		for (int i = 0; i < size; i++) {
			System.out.println("第" + (i + 1) + "位学生");
			display_Student_Scores(allNameVector.get(i), allIDVector.get(i));
		}
	}

	// 显示全体学生排名的方法
	public void fronted_Display_AllStudent_ClassRanking() {
		Vector<StudentScore> rankVector = getStudentsRank();
		int headcount = rankVector.size();
		System.out.println("共" + headcount + "名学生");
		for (int i = 0, j = 1; i < headcount; i++, j++) {
			System.out.println("---------------------第" + j + "名------------------");
			System.out.println(rankVector.get(i).getName());
			System.out.println("总成绩:" + rankVector.get(i).getSumScore());
			System.out.println("---------------------------------------------------");
		}
	}

	// 显示全体学生姓名和学号的方法
	public void fronted_Display_AllStudents_StudentID_Name() {
		// 取出所有学生的学号和姓名
		Vector<String> allNameVector = getListAllData(getTableName("Student"),
				"Student_ID");
		Vector<String> allIDVector = getListAllData(getTableName("Student"), "Name");
		int size = allNameVector.size();
		System.out.println("共" + size + "名学生");
		System.out.println("----------------------------------------------------------");
		System.out.println("--------------------------学生概览 ------------------------");
		for (int i = 0, j = 1; i < size; i++, j++) {
			System.out.println("第 " + j + "名学生" + allNameVector.get(i) + " 学号 " + allIDVector.get(i));
		}
		System.out.println("---------------------------------------------------");

	}

	// 显示一名老师用户全部信息方法,向后台传入一个工号,后台用容器传输回该老师所有信息
	public void fronted_Display_A_Teacher_CompleteInformation(String name, String featureValue) {
		Vector<String> vector = getRowAllValue(getTableName("Teacher"), "Teacher_ID",
				featureValue);
		System.out.println("-----------------------------------");
		System.out.println("老师" + name + "的全部信息为 ");
		System.out.println(name + "的工号为:" + vector.get(0));
		System.out.println(name + "的姓名为:" + vector.get(1));
		System.out.println(name + "的出生年月为:" + vector.get(2));
		System.out.println(name + "的性别为:" + vector.get(3));
		System.out.println(name + "的电话为:" + vector.get(4));
		System.out.println(name + "的院系为:" + vector.get(5));
		System.out.println("-----------------------------------");
	}

	public static void main(String[] args) {
		Frontend menuObject = new Frontend();
		menuObject.fronted_Main_BasicMenus();
	}
}
