package ��������ϵͳ;
import java.*;
import java.util.HashMap;

public class DBUtils {
	
	private static DBUtils instance = null;
	private HashMap<String,User> users = new HashMap<String,User>();
	public StringBuffer  line;
	
	private DBUtils(){
		//��˽�
		User user1 = new User();
		user1.setUserName("��˽�");
		user1.setCall("18818818818");
		user1.setCardId("1001");
		user1.setCardPwd("123456");
		user1.setAccount(10000);
		user1.setSex("��");
		users.put(user1.getCardId(), user1);
		//�����
		User user2 = new User();
		user2.setUserName("�����");
		user2.setCall("13313313313");
		user2.setCardId("1002");
		user2.setCardPwd("234567");
		user2.setAccount(30000);
		user2.setSex("��");
		users.put(user2.getCardId(), user2);
		//ɳ��
		User user3 = new User();
		user3.setUserName("�׹Ǿ�");
		user3.setCall("16616616616");
		user3.setCardId("1002");
		user3.setCardPwd("345678");
		user3.setAccount(20000);
		user3.setSex("Ů");
		users.put(user3.getCardId(), user3);
	}
	
	public static DBUtils getInstance(){
		if(instance == null){
			synchronized (DBUtils.class){
				if(instance == null){
					instance = new DBUtils();
				}
			}
		}
		return instance;
	}
	//��ȡ��һ�û�
	public User getUser(String cardId){
		User user = (User) users.get(cardId);
		return user;
	}
	//��ȡȫ���û�
	public HashMap<String,User> getUsers(){
//		 HashMap<String,User> userss =  (HashMap<String,User>) users;
		 return users;
	}
}
