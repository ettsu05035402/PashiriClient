
public class Main {

	public static void main(String[] args) throws Exception {
		SQLManager.launchSQLManager();//SQL�T�[�o�[�Ƃ̐ڑ����m��
		
		//�����Ŋe�탁�\�b�h���e�X�g(�ȉ��͗�)
		UserDBUtil.addUser("5401","password","ABCDE FGHI");
		//
	}

}
