package com.tencent.smtt.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class LogFileUtils {
    /* renamed from: a */
    private static OutputStream f15179a = null;

    public static void closeOutputStream(OutputStream outputStream) {
        AppMethodBeat.m2504i(65262);
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                AppMethodBeat.m2505o(65262);
                return;
            }
        }
        AppMethodBeat.m2505o(65262);
    }

    public static byte[] createHeaderText(String str, String str2) {
        AppMethodBeat.m2504i(65266);
        try {
            byte[] encryptKey = encryptKey(str, str2);
            String format = String.format("%03d", new Object[]{Integer.valueOf(encryptKey.length)});
            byte[] bArr = new byte[(encryptKey.length + 3)];
            bArr[0] = (byte) format.charAt(0);
            bArr[1] = (byte) format.charAt(1);
            bArr[2] = (byte) format.charAt(2);
            System.arraycopy(encryptKey, 0, bArr, 3, encryptKey.length);
            AppMethodBeat.m2505o(65266);
            return bArr;
        } catch (Exception e) {
            AppMethodBeat.m2505o(65266);
            return null;
        }
    }

    public static String createKey() {
        AppMethodBeat.m2504i(65264);
        String valueOf = String.valueOf(System.currentTimeMillis());
        AppMethodBeat.m2505o(65264);
        return valueOf;
    }

    public static byte[] encrypt(String str, String str2) {
        AppMethodBeat.m2504i(65263);
        try {
            byte[] bytes = str2.getBytes("UTF-8");
            Cipher instance = Cipher.getInstance("RC4");
            instance.init(1, new SecretKeySpec(str.getBytes("UTF-8"), "RC4"));
            bytes = instance.update(bytes);
            AppMethodBeat.m2505o(65263);
            return bytes;
        } catch (Throwable th) {
            new StringBuilder("encrypt exception:").append(th.getMessage());
            AppMethodBeat.m2505o(65263);
            return null;
        }
    }

    public static byte[] encryptKey(String str, String str2) {
        AppMethodBeat.m2504i(65265);
        try {
            byte[] bytes = str2.getBytes("UTF-8");
            Cipher instance = Cipher.getInstance("RC4");
            instance.init(1, new SecretKeySpec(str.getBytes("UTF-8"), "RC4"));
            bytes = instance.update(bytes);
            AppMethodBeat.m2505o(65265);
            return bytes;
        } catch (Throwable th) {
            new StringBuilder("encrypt exception:").append(th.getMessage());
            AppMethodBeat.m2505o(65265);
            return null;
        }
    }

    public static synchronized void writeDataToStorage(File file, String str, byte[] bArr, String str2, boolean z) {
        synchronized (LogFileUtils.class) {
            AppMethodBeat.m2504i(65261);
            byte[] encrypt = encrypt(str, str2);
            if (encrypt != null) {
                str2 = null;
            } else {
                encrypt = null;
            }
            try {
                file.getParentFile().mkdirs();
                if (file.isFile() && file.exists() && file.length() > 2097152) {
                    file.delete();
                    file.createNewFile();
                }
                if (f15179a == null) {
                    f15179a = new BufferedOutputStream(new FileOutputStream(file, z));
                }
                if (str2 != null) {
                    f15179a.write(str2.getBytes());
                } else {
                    f15179a.write(bArr);
                    f15179a.write(encrypt);
                    f15179a.write(new byte[]{(byte) 10, (byte) 10});
                }
                if (f15179a != null) {
                    try {
                        f15179a.flush();
                    } catch (Throwable th) {
                    }
                }
                AppMethodBeat.m2505o(65261);
            } catch (Throwable th2) {
            }
        }
        return;
        AppMethodBeat.m2505o(65261);
        return;
        AppMethodBeat.m2505o(65261);
    }
}
