package ��������ϵͳ;

import java.util.Scanner;

public class Bank {
	double account;
	private static User user;
	
	public static void main(String[] args) {
		Bank b = new Bank();
		b.login();
		b.operate();
	}
	/*
	 * �˻������룬ȡ���Ͳ�ѯ����
	 */
	public void operate() {
		Bank b = new Bank();
		while(true) {
			System.out.println("��ѡ����Ҫ���еĲ������ͣ����س�����");
			System.out.println("��1" + "\t" + "ȡ��:2" + "\t" + "��ѯ��3" + "\t" + "�˳���0");
			Scanner in = new Scanner(System.in);
			String s = in.nextLine();    //�����������
			if("1".equals(s) || "2".equals(s)) {
				double num = 0;
				try {
					if("1".equals(s)) {
					System.out.println("����������:");
					num = Integer.parseInt(in.nextLine());
					}else {
						System.out.println("������ȡ����:");
						num = Integer.parseInt(in.nextLine());
					}
				}catch(Exception e) {
					System.out.println("����������");
					continue;
				}
				switch (s) {
				case "1": //������
				    b.income(num);
				    break;
				case "2": //ȡ�����
				    b.takeout(num);
				    break;
				}
			}else if("3".equals(s)) {
				b.show();
			}else if("0".equals(s)) {
				System.out.println("�˳�ϵͳ");
				return;
			}else {
				System.out.println("������0~3֮�������ѡ����صĲ�����");
			}
		}
	}
	/*
	 * �û���½��������
	 */
	public void login() {
		DBUtils dbutils = DBUtils.getInstance();
		System.out.println("��ӭ�����������У�");
		while(true) {
			Scanner in = new Scanner(System.in); //����¼��
			System.out.println("���������п��ţ�");
			String cardId = in.nextLine();
		System.out.println("���������п�����:");
	
		String cardPwd = in.nextLine();
		user = dbutils.getUser(cardId);
		//��½
		if(dbutils.getUsers().containsKey(cardId)
				&& user.getCardPwd().equals(cardPwd)) {
			if(user.getSex().equals("��")) {
				System.out.println("��½�ɹ�����ӭ" + user.getUserName() + "����");
			    break;
			}else {
				System.out.println("��½�ɹ�����ӭ" + user.getUserName() + "Ůʿ");
				break;
			}
		}else {
			System.out.println("���п��Ż��������");
			continue;
		    }
	    }
    }
	/*
	 * ���
	 */
	public void income(double num) {
		account = user.getAccount() + num;
		user.setAccount(account);
		System.out.println("������" + num + "Ԫ�ɹ���");
	}
	/*
	 * ȡ��
	 */
	public void takeout(double num) {
		if(user.getAccount() >= num) {
			account = user.getAccount() - num;
			user.setAccount(account);
			System.out.println("ȡ�����" + num +"Ԫ�ɹ���");
		}else {
			System.out.println("���㣬ȡ��ʧ�ܣ�");
		}
	}
	/*
	 * ��ѯ���
	 */
	public void show() {
		account = user.getAccount();
		System.out.println("�˻��ܽ��Ϊ" + account +"Ԫ");
	}
}