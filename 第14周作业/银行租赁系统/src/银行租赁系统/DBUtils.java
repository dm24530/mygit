package 银行租赁系统;
import java.*;
import java.util.HashMap;

public class DBUtils {
	
	private static DBUtils instance = null;
	private HashMap<String,User> users = new HashMap<String,User>();
	public StringBuffer  line;
	
	private DBUtils(){
		//猪八戒
		User user1 = new User();
		user1.setUserName("猪八戒");
		user1.setCall("18818818818");
		user1.setCardId("1001");
		user1.setCardPwd("123456");
		user1.setAccount(10000);
		user1.setSex("男");
		users.put(user1.getCardId(), user1);
		//孙悟空
		User user2 = new User();
		user2.setUserName("孙悟空");
		user2.setCall("13313313313");
		user2.setCardId("1002");
		user2.setCardPwd("234567");
		user2.setAccount(30000);
		user2.setSex("男");
		users.put(user2.getCardId(), user2);
		//沙悟净
		User user3 = new User();
		user3.setUserName("白骨精");
		user3.setCall("16616616616");
		user3.setCardId("1002");
		user3.setCardPwd("345678");
		user3.setAccount(20000);
		user3.setSex("女");
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
	//获取单一用户
	public User getUser(String cardId){
		User user = (User) users.get(cardId);
		return user;
	}
	//获取全部用户
	public HashMap<String,User> getUsers(){
//		 HashMap<String,User> userss =  (HashMap<String,User>) users;
		 return users;
	}
}
