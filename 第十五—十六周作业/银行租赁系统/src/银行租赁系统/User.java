package ��������ϵͳ;

public class User {
	    //�绰����
		private String call;
		//���
		private int account;
		//�û���
		private String userName;
		//����
		private String cardPwd;
		//����
		private String cardId;
		//�Ա�
		private String sex;
		
		public void setCall(String call){
			this.call = call;
		}
		public String getCall(){
			return call;
		}
		
		public void setAccount(int account){
			this.account = account;
		}
		public int getAccount(){
			return account;
		}
		
		public void setUserName(String userName){
			this.userName = userName;
		}
		public String getUserName(){
			return userName;
		}
		
		public void setCardPwd(String cardPwd){
			this.cardPwd = cardPwd;
		}
		public String getCardPwd(){
			return cardPwd;
		}
		
		public void setCardId(String cardId){
			this.cardId = cardId;
		}
		public String getCardId(){
			return cardId;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getSex() {
			return sex;
		}

}
