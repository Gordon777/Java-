package Java_version1;
import java.security.*; 
import java.util.*;
import javax.crypto.*;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory; 
import javax.crypto.spec.DESKeySpec;

public class DES�[�K�ѱK�{�� {
	public static void main(String[] args) 
		{
		Scanner keyin = new Scanner(System.in);
		System.out.print("�п�J���� =>"); 
		String plain = keyin.nextLine();
		System.out.print("�п�J�K�X����(8 �Ӧr��) =>"); 
		String key = keyin.nextLine(); 
		System.out.println("�K�X����:" + key); 
		System.out.println("����:" + plain);
		byte[] cipher = encrypt (plain, key);		
		System.out.println("�[�K��K��:" + new String(cipher)); 
		String cipher_n = decrypt(cipher, key); 
		System.out.println("�ѱK�����:" + cipher_n);
		}
		// DES �[�K�{��
		public static byte[] encrypt(String plain, String key) {
		try {
		SecureRandom random = new SecureRandom();
		DESKeySpec desKey = new DESKeySpec(key.getBytes()); SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES"); SecretKey securekey = keyFactory.generateSecret(desKey);
		Cipher cipher = Cipher.getInstance("DES"); cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
		byte[] result = cipher.doFinal(plain.getBytes());
		return result;
		} catch (Throwable e) { e.printStackTrace();
		}
		return null; 
		}
		
		//�ѱK�{��
		public static String decrypt(byte[] content, String key) {
		try {
		SecureRandom random = new SecureRandom();
		DESKeySpec desKey = new DESKeySpec(key.getBytes()); SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES"); SecretKey securekey = keyFactory.generateSecret(desKey);
		Cipher cipher = Cipher.getInstance("DES"); cipher.init(Cipher.DECRYPT_MODE, securekey, random);
		byte[] result = cipher.doFinal(content);
		return new String(result);
		} catch (Throwable e) { e.printStackTrace();
		}
		return null; 
		}
	

}
