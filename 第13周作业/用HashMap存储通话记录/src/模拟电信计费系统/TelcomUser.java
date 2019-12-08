package ģ����żƷ�ϵͳ;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class TelcomUser {
	private String phoneNumber;
	private String callTo;
	
	private ArrayList commiuncationRecords;
	private HashMap singleRecord;
	
	public TelcomUser (String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.commiuncationRecords = new ArrayList();
//		this.callToNumbers = new TreeSet();
	}
	//ģ��ͨ����¼���γ�
	void generateCommunicateRecord() {
		//�������ͨ����¼��Ŀ
		int recordNum = new Random().nextInt(10);
		for(int i=0;i<=recordNum;i++) {
			//��ʼʱ�䣬��ǰʱ��ǰ��ĳ�����ʱ��
			long timeStart = System.currentTimeMillis() - new Random().nextInt(36000000);
			//����ʱ�䣬��ʼ���ʮ���������һ��ʱ�䣬����һ����
			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
			//���к���
			this.callTo = getCallToPhoneNumber();
//			this.callToNumbers.add(this.callTo);
			//����ͨ����¼
			this.singleRecord = new HashMap();
			this.singleRecord.put("����",this.phoneNumber);
			this.singleRecord.put("��ʼʱ��",new Date(timeStart));
			this.singleRecord.put("����ʱ��",new Date(timeEnd));
			this.singleRecord.put("���к���", this.callTo);
			this.singleRecord.put("�Ʒ�",this.accountFee(timeStart, timeEnd));
			this.commiuncationRecords.add(this.singleRecord);
		}
	}
    
	//������ɱ��к��루����λ��������
	private String getCallToPhoneNumber() {
		return "1380372" + String.valueOf(new Random().nextInt(10))
		+ String.valueOf(new Random().nextInt(10))
		+ String.valueOf(new Random().nextInt(10))
		+ String.valueOf(new Random().nextInt(10));
	}
	//ģ��Ʒѷ��������ַ�������ʽ���ر�����4λС���ļƷѽ��
	private String accountFee(long timeStart,long timeEnd) {
		//ÿ�����շ�0.2Ԫ
		double feePerMinute = 0.2;
		//ͨ���������������������
		int minutes = Math.round((timeEnd - timeStart)/60000);
		double feeTotal = feePerMinute * minutes;
		return String.format("%.4f", feeTotal);
	}
	//��ӡͨ����¼
	void printDetails() {
		/*
		 * ʹ��Iterator������
		 */
	    Iterator itRecords = this.commiuncationRecords.iterator();
	
		while(itRecords.hasNext()) {
			System.out.println("---------ͨ����¼�ָ���---------");
			this.singleRecord = ((HashMap)itRecords.next());
			Set keySet = this.singleRecord.keySet();
			Iterator itkey = keySet.iterator();
			while(itkey.hasNext()) {
				Object key = itkey.next();
				Object value = this.singleRecord.get(key);
				System.out.println(key + ":" + value);
			}
		}
	}
}
