package Sha1_Ford;

//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//
//public class Ford_Main {
//    public static void main(String[] args) {
//        // Ваш массив байтов
//        byte[] input = { (byte) 0xDB, (byte) 0x6F, (byte) 0x7C, (byte) 0x5C,
//                (byte) 0xE4, (byte) 0xA4, (byte) 0x07, (byte) 0xE4,
//                (byte) 0x45, (byte) 0xF0, (byte) 0x90, (byte) 0xFC,
//                (byte) 0x12, (byte) 0x7C, (byte) 0xA2, (byte) 0x43 };
//
//        try {
//            // Получаем экземпляр MessageDigest для SHA-1
//            MessageDigest digest = MessageDigest.getInstance("SHA-1");
//
//            // Вычисляем хеш
//            byte[] hashBytes = digest.digest(input);
//
//            // Преобразуем байты в шестнадцатеричную строку
//            StringBuilder hexString = new StringBuilder();
//            for (byte b : hashBytes) {
//                String hex = Integer.toHexString(0xff & b);
//                if (hex.length() == 1) {
//                    hexString.append('0');
//                }
//                hexString.append(hex);
//            }
//
//            // Выводим результат
//            System.out.println("SHA-1 хеш: " + hexString.toString());
//        } catch (NoSuchAlgorithmException e) {
//            System.err.println("Алгоритм не найден: " + e.getMessage());
//        }
//    }
//}
//
//


//import javax.crypto.Mac;
//import javax.crypto.spec.SecretKeySpec;
//import java.util.Arrays;
//
//public class Ford_Main {
//
//    public static void main(String[] args) {
//        // Примеры сидов
//        byte[][] seeds = {
//                {(byte)0xDB,(byte)0x6F, (byte)0x7C, (byte)0x5C, (byte)0xE4, (byte)0xA4, (byte)0x07, (byte)0xE4, (byte)0x45, (byte)0xF0, (byte)0x90, (byte)0xFC, (byte)0x12, (byte)0x7C, (byte)0xA2, (byte)0x43, (byte)0x00, (byte)0x00},
//                {(byte)0x4E, (byte)0xC5, (byte)0x3F, (byte)0x6B, (byte)0xEB, (byte)0xCD, (byte)0x81, (byte)0x18, (byte)0xC0, (byte)0x60,(byte) 0x90, (byte)0x91, (byte)0xF1, (byte)0xEE, (byte)0xE3, (byte)0xD4, (byte)0x00, (byte)0x00},
//                {(byte)0xE1, (byte)0x0F, (byte)0x46, (byte)0x44, (byte)0x92, (byte)0xDB, (byte)0x79, (byte)0x4A, (byte)0x5B, (byte)0x59,(byte) 0xAE, (byte)0xD7, (byte)0x70, (byte)0xC7, (byte)0x15, (byte)0x8F, (byte)0x00, (byte)0x00}
//        };
//
//        // Ключ
//        byte[] secBytes = new byte[] {
//                (byte) 0x52, (byte) 0x50, (byte) 0x53, (byte) 0x47,
//                (byte) 0x50, (byte) 0x4E, (byte) 0x53, (byte) 0x59,
//                (byte) 0x31, (byte) 0x36, (byte) 0x31, (byte) 0x31
//        }; // RCM Ranger/Explorer
//
//        // Обработка каждого сид-значения
//        for (byte[] seed : seeds) {
//            byte[] key = computeHMACSHA1(secBytes, seed);
//            System.out.println("Seed: " + Arrays.toString(seed));
//            System.out.println("Key: " + Arrays.toString(key));
//            System.out.println("=================================");
//        }
//    }
//
//    public static byte[] computeHMACSHA1(byte[] keyBytes, byte[] seedBytes) {
//        try {
//            // Создаем объект Mac с алгоритмом HMAC-SHA1
//            Mac mac = Mac.getInstance("HmacSHA1");
//            SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "HmacSHA1");
//            mac.init(secretKeySpec);
//
//            // Вычисляем HMAC
//            byte[] hmacResult = mac.doFinal(seedBytes);
//
//            // Возвращаем первые 18 байт результата
//            return Arrays.copyOf(hmacResult, Math.min(hmacResult.length, 18));
//        } catch (Exception e) {
//            throw new RuntimeException("Failed to compute HMAC: " + e.getMessage(), e);
//        }
//    }
//}


import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;

public class Ford_Main {

    public static void main(String[] args) {
        // Примеры сидов
        byte[][] seeds = {
                {(byte)0xDB, (byte)0x6F, (byte)0x7C, (byte)0x5C, (byte)0xE4, (byte)0xA4, (byte)0x07, (byte)0xE4, (byte)0x45, (byte)0xF0, (byte)0x90, (byte)0xFC, (byte)0x12, (byte)0x7C, (byte)0xA2, (byte)0x43, (byte)0x00, (byte)0x00},
                {(byte)0x4E, (byte)0xC5, (byte)0x3F, (byte)0x6B, (byte)0xEB, (byte)0xCD, (byte)0x81, (byte)0x18, (byte)0xC0, (byte)0x60,(byte) 0x90, (byte)0x91, (byte)0xF1, (byte)0xEE, (byte)0xE3, (byte)0xD4, (byte)0x00, (byte)0x00},
                {(byte)0xE1, (byte)0x0F, (byte)0x46, (byte)0x44, (byte)0x92, (byte)0xDB, (byte)0x79, (byte)0x4A, (byte)0x5B, (byte)0x59,(byte) 0xAE, (byte)0xD7, (byte)0x70, (byte)0xC7, (byte)0x15, (byte)0x8F, (byte)0x00, (byte)0x00}
        };

        // Ключ
        byte[] secBytes = new byte[] {
                (byte) 0x52, (byte) 0x50, (byte) 0x53, (byte) 0x47,
                (byte) 0x50, (byte) 0x4E, (byte) 0x53, (byte) 0x59,
                (byte) 0x31, (byte) 0x36, (byte) 0x31, (byte) 0x31
        }; // RCM Ranger/Explorer

        // Обработка каждого сид-значения
        for (byte[] seed : seeds) {
            byte[] key = computeHMACSHA1(secBytes, seed);
            System.out.println("seed _ " + bytesToHex(seed));
            System.out.println("Key _ " + bytesToHex(key));
            System.out.println("==================================================================");
        }
    }

    public static byte[] computeHMACSHA1(byte[] keyBytes, byte[] seedBytes) {
        try {
            // Создаем объект Mac с алгоритмом HMAC-SHA1
            Mac mac = Mac.getInstance("HmacSHA1");
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "HmacSHA1");
            mac.init(secretKeySpec);

            // Вычисляем HMAC
            byte[] hmacResult = mac.doFinal(seedBytes);

            // Возвращаем первые 18 байт результата
            return Arrays.copyOf(hmacResult, Math.min(hmacResult.length, 18));
        } catch (Exception e) {
            throw new RuntimeException("Failed to compute HMAC: " + e.getMessage(), e);
        }
    }

    // Метод для преобразования массива байтов в шестнадцатеричную строку с пробелами
    public static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(0xff & bytes[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex.toUpperCase()); // Преобразуем в верхний регистр
            if(i < bytes.length - 1){
                hexString.append(" "); // Добавляем пробел между байтами
            }
        }
        return hexString.toString();
    }
}