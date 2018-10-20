package Java_version1;
import java.security.*; 
import java.util.*;
import javax.crypto.*;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory; 
import javax.crypto.spec.DESKeySpec;

public class DES加密解密程式 {
	public static void main(String[] args) 
		{
		Scanner keyin = new Scanner(System.in);
		System.out.print("請輸入明文 =>"); 
		String plain = keyin.nextLine();
		System.out.print("請輸入密碼元素(8 個字元) =>"); 
		String key = keyin.nextLine(); 
		System.out.println("密碼元素:" + key); 
		System.out.println("明文:" + plain);
		byte[] cipher = encrypt (plain, key);		
		System.out.println("加密後密文:" + new String(cipher)); 
		String cipher_n = decrypt(cipher, key); 
		System.out.println("解密後明文:" + cipher_n);
		}
		// DES 加密程式
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
		
		//解密程式
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
