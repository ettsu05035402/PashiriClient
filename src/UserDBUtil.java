import java.sql.ResultSet;

public class UserDBUtil {
	
	/*
	 * ���[�U�f�[�^�x�[�X�Ƀ��[�U��ǉ����郁�\�b�h(�Q�l���x��)
	 */
	public static boolean addUser(String userId, String pw, String name) {
		String query = "INSERT INTO table1 VALUES('"+userId+"','"+pw+"','"+name+"')";	//SQL���𐶐�
		try {
			ResultSet resultSet = SQLManager.userDBQuery(query);	//SQLManager�̃��\�b�h��p���ăN�G�����΂�(���̏ꍇ�̓��[�U�f�[�^�x�[�X��)
		} catch (Exception e) {
			e.printStackTrace();
			return false;	//�N�G�����M���s
		}
		return true;	//���[�U�ǉ�����
	}

}
