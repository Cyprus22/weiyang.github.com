package h;

import java.util.Random;

public class MultiMatrixTest {
	static int[][] multiplyMatrix;// ����һ��ȫ�־��󣬴�ž���˻��Ľ��
	static Random ran = new Random();

	public static void main(String args[]) {
		int length1;
	//	int length2;
	//	int length3;
//		length1 = ran.nextInt(10) + 1;// �����������A�������Լ�����B���������������������������������ͬ
//		length2 = ran.nextInt(10) + 1;// �����������A������
//		length3 = ran.nextInt(10) + 1;// �����������B������
		length1=1000;
		
//		int[][] a = new int[length2][length1];
//		int[][] b = new int[length1][length3];
		int[][]a=new int[1000][1000];
		int[][]b=new int[1000][1000];
		getAB(a, b);
		long startTime=System.nanoTime();
		long startTime1=System.currentTimeMillis();
		mMatrix(a, b);
		long endTime=System.nanoTime();
		long endTime1=System.currentTimeMillis();
	//	show();
		long time=endTime-startTime;
		long time1=endTime1-startTime1;
		System.out.println("����a,b��˻��ѵ�ʱ��Ϊ��λ���룺"+time);
		System.out.println("����a,b��˻��ѵ�ʱ��Ϊ��λ���룺"+time1);
	}

	public static void getAB(int[][] a, int[][] b) {// ʹ����������ɾ���a��b
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = ran.nextInt(100);
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				b[i][j] = ran.nextInt(100);
			}
		}
		System.out.println("�������A");// �������A
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("�������B");// �������B
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void mMatrix(int[][] a, int[][] b) {// ����A*B
	//	System.out.println("�������A*B");
		multiplyMatrix = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {// A������
			for (int j = 0; j < b[0].length; j++) {// B������
				for (int k = 0; k < a[0].length; k++) {// A������
					multiplyMatrix[i][j] = multiplyMatrix[i][j] + a[i][k] * b[k][j];// ������A�ĵ�I�к;���B�ĵ�J�ж�Ӧ������˵õ�multiplyMatrix[i][j]
				}
			}
		}
	}

	public static void show() {// �������˻�multiplyMatrix
		for (int i = 0; i < multiplyMatrix.length; i++) {
			for (int j = 0; j < multiplyMatrix[0].length; j++) {
				System.out.print(multiplyMatrix[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
