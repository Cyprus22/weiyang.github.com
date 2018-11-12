package m;

public class Matrix implements Runnable {
	static int[][] a = new int[1000][1000];
	static int[][] b = new int[1000][1000];
	static int[][] c = new int[a.length][b[0].length];// ����������������Ļ��ľ���
	int index;// ��������±�
	static Thread t[] = new Thread[a.length];// �����߳�����

	Matrix(int index) {
		this.index = index;// ��ǰ�߳̾�������±�
	}

	Matrix() {
	}
	public void run() {
		try {
			if (a[0].length == b.length) {
				// a�������������b������������ܽ��о���ĳ˷�
				this.matrix(index, a, b);
			} else {
				System.out.println("��ǰ���������ܽ��г˷�����");
			}
		} catch (Exception e) {
		}

	}

	public void matrix(int index, int[][] a, int[][] b) {
		// ȡ�ô�������±������еľ���Ļ�
		try {
			for (int s = index; s < 1000; s = s + 4) {
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < b.length; j++) {
						c[s][i] += a[s][j] * b[j][i];
					}

					// �������Ϊ�˴�ӡÿ���̵߳�ִ�й��̣��뿴�Ŀ��԰�ע�ͷ�ȥ��
					// System.out.println(Thread.currentThread().getName()+"c["+index+"]["+i+"]:"+c[index][i]);
				}
			}
		} catch (Exception e) {
		}
	}

	public void print(int[][] a) {
		// ��ӡ����ľ���
		System.out.println("***����**");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix d = new Matrix();// ������ǰ��Ķ��󣬷�����÷���
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				a[i][j] = (int) (Math.random() * 10);
			}
		}
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				b[i][j] = (int) (Math.random() * 10);
			}
		}
		// ������������ж����кͶ�����
		System.out.println("a��" + a.length + "��" + a[0].length + "��");
		System.out.println("b��" + b.length + "��" + b[0].length + "��");
		System.out.println("c��" + c.length + "��" + c[0].length + "��");
		long startTime = System.nanoTime(); // ����ʼ��¼ʱ��(����)
		/*
		 * for (int i = 0; i <a.length; i++) { // �������߳� t[i] = new
		 * Thread(newMatrix(i)); // �����߳� t[i].setName("�߳�" + i); // �����̵߳�����
		 * t[i].start(); ��ǰ�߳̿�ʼִ�� }
		 */
		t[0] = new Thread(new Matrix(0));
		t[1] = new Thread(new Matrix(1));
		t[2] = new Thread(new Matrix(2));
		t[3] = new Thread(new Matrix(3));
		t[4]=new Thread(new Matrix(4));
		t[5]=new Thread(new Matrix(5));
		t[6]=new Thread(new Matrix(6));
		t[7]=new Thread(new Matrix(7));
		t[8]=new Thread(new Matrix(8));
		t[9]=new Thread(new Matrix(9));
		t[10]=new Thread(new Matrix(10));
		t[11]=new Thread(new Matrix(11));
		t[0].start();
		t[1].start();
		t[2].start();
		t[3].start();
		t[4].start();
		t[5].start();
		t[6].start();
		t[7].start();
		t[8].start();
		t[9].start();
		t[10].start();
		t[11].start();
		long endTime = System.nanoTime(); // ���������¼ʱ��
		long TotalTime = endTime - startTime;// ������ʱ��
		System.out.println("����ʱ�䣺" + TotalTime);
		//d.print(a);// ��ӡ����a
		//d.print(b);// ��ӡ����b
		//d.print(c);// ��ӡ����c

	}

}
