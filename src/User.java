

import java.util.List;
/**
 * <p>User�N���X�́A���ꂼ��̃��[�U�[�̏����C���X�^���X�ɕێ�����B</p>
 * 
 * @author 5415 �y�c �Y�P
 *
 */
public class User {
	
	private String name;
	private String userID;
	private int points;
	
	/**
	 * User�N���X�̃C���X�^���X���쐬���܂��B
	 * @param name ���[�U�̖��O
	 * @param userID ���[�U��ID
	 * @param points ���[�U�̃|�C���g
	 */
	public User(String name, String userID, int points){
		this.name = name;
		this.userID = userID;
		this.points = points;
	}
}
