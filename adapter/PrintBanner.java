package adapter;

public class PrintBanner extends Banner implements Print{
	
	public PrintBanner(String str){
		super(str);
	}

	//�@�e���\�b�h�̓C���^�[�t�F�C�X�ɒ�`���Ă���B
	
	// �p�����̃��\�b�h���Ă�
	public void printWeek() {
		showWithParen();
	}
	
	// �p�����̃��\�b�h���Ă�	
	public void printStrong() {
		showWithAster();
	}
}
