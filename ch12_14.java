
public class ch12_14 {
	public static void main(String[] args) {
		String str = "�~�ӭ����ɰ�A�s�t�h�~�D���o�C���a���k������A�i�b�`�ӤH���ѡC\n"
				+ "�ѥ��R�����۱�A�@�¿�b�g�����C�^���@���ʴA�͡A���c���L�L�C��C\n"
				+ "�K�H��D�زM���A�Ŭu���Ƭ~���סC�ͨ�߰_�b�L�O�A�l�O�s�Ӯ��A�ɡC\n"
				+ "���K���C���B�n�A�ܻT�b�x�׬K�d�C�K�d�W�u�鰪�_�A�q���g�������¡C\n";
		
		String s = "�A";
		System.out.println("�A�̥��X�{����m : " + str.indexOf(s));
		System.out.println("�A�̫�X�{����m : " + str.lastIndexOf(s));
		System.out.println("���bindex = 1�_�̥��X�{����m : " + str.indexOf(s));
		System.out.println("���bindex = 1�_�̫�X�{����m : " + str.lastIndexOf(s));
		System.out.println("���̥��X�{��m : " + str.indexOf("��"));

	}

}
