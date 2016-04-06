package topK;
/**
 * ��ϣ���������࣬�ṩ��3���ַ���ϣ����
 * @author lyq
 *
 */
public class HashTool {
	/**
	 * BKDR�ַ���ϣ�㷨
	 * 
	 * @param str
	 * @return
	 */
	public static long BKDRHash(String str) {
		int seed = 31; /* 31 131 1313 13131 131313 etc.. */
		long hash = 0;
		int i = 0;

		for (i = 0; i < str.length(); i++) {
			hash = (hash * seed) + (str.charAt(i));
		}

		hash = Math.abs(hash);
		return hash;
	}

	/**
	 * SDB�ַ���ϣ�㷨
	 * 
	 * @param str
	 * @return
	 */
	public static long SDBMHash(String str) {
		long hash = 0;
		int i = 0;
		
		for (i = 0; i < str.length(); i++) {
			hash = (str.charAt(i)) + (hash << 6) + (hash << 16) - hash;
		}

		hash = Math.abs(hash);
		return hash;
	}

	/**
	 * DJB�ַ���ϣ�㷨
	 * 
	 * @param str
	 * @return
	 */
	public static long DJBHash(String str) {
		long hash = 5381;
		int i = 0;

		for (i = 0; i < str.length(); i++) {
			hash = ((hash << 5) + hash) + (str.charAt(i));
		}

		hash = Math.abs(hash);
		return hash;
	}

}