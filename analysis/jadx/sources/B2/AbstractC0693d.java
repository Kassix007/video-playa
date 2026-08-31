package b2;

import C0.S;
import O3.B;
import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: b2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0693d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f9984a = new B(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f9985b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f9986c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f9987d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f9988e = {48, 49, 48, 0};
    public static final byte[] f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f9989g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f9990h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] b(C0691b[] c0691bArr, byte[] bArr) throws IOException {
        int i7 = 0;
        int length = 0;
        for (C0691b c0691b : c0691bArr) {
            length += ((((c0691b.f9982g * 2) + 7) & (-8)) / 8) + (c0691b.f9981e * 2) + d(c0691b.f9977a, c0691b.f9978b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0691b.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f)) {
            int length2 = c0691bArr.length;
            while (i7 < length2) {
                C0691b c0691b2 = c0691bArr[i7];
                q(byteArrayOutputStream, c0691b2, d(c0691b2.f9977a, c0691b2.f9978b, bArr));
                p(byteArrayOutputStream, c0691b2);
                i7++;
            }
        } else {
            for (C0691b c0691b3 : c0691bArr) {
                q(byteArrayOutputStream, c0691b3, d(c0691b3.f9977a, c0691b3.f9978b, bArr));
            }
            int length3 = c0691bArr.length;
            while (i7 < length3) {
                p(byteArrayOutputStream, c0691bArr[i7]);
                i7++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z5 = true;
        for (File file2 : fileArrListFiles) {
            z5 = c(file2) && z5;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f9990h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f9989g;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return k1.i.k(S.q(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] f(InputStream inputStream, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int i9 = inputStream.read(bArr, i8, i7 - i8);
            if (i9 < 0) {
                throw new IllegalStateException(k1.i.i(i7, "Not enough bytes to read: "));
            }
            i8 += i9;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i7) {
        int[] iArr = new int[i7];
        int iM = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i8] = iM;
        }
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] h(FileInputStream fileInputStream, int i7, int i8) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i8];
            byte[] bArr2 = new byte[2048];
            int i9 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i9 < i7) {
                int i10 = fileInputStream.read(bArr2);
                if (i10 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i7 + " bytes");
                }
                inflater.setInput(bArr2, 0, i10);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i8 - iInflate);
                    i9 += i10;
                } catch (DataFormatException e7) {
                    throw new IllegalStateException(e7.getMessage());
                }
            }
            if (i9 == i7) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i7 + " actual=" + i9);
        } finally {
            inflater.end();
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0691b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0691b[] c0691bArr) throws IOException {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                C0691b[] c0691bArrK = k(byteArrayInputStream, bArr2, iM, c0691bArr);
                byteArrayInputStream.close();
                return c0691bArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f9987d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            C0691b[] c0691bArrJ = j(byteArrayInputStream2, iM2, c0691bArr);
            byteArrayInputStream2.close();
            return c0691bArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0691b[] j(ByteArrayInputStream byteArrayInputStream, int i7, C0691b[] c0691bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0691b[0];
        }
        if (i7 != c0691bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i7];
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i8] = (int) m(byteArrayInputStream, 2);
            strArr[i8] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i9 = 0; i9 < i7; i9++) {
            C0691b c0691b = c0691bArr[i9];
            if (!c0691b.f9978b.equals(strArr[i9])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i10 = iArr[i9];
            c0691b.f9981e = i10;
            c0691b.f9983h = g(byteArrayInputStream, i10);
        }
        return c0691bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0691b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i7, C0691b[] c0691bArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C0691b[0];
        }
        if (i7 != c0691bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i8 = 0; i8 < i7; i8++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            C0691b c0691b = null;
            if (c0691bArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i9 = 0;
                while (true) {
                    if (i9 >= c0691bArr.length) {
                        break;
                    }
                    if (c0691bArr[i9].f9978b.equals(strSubstring)) {
                        c0691b = c0691bArr[i9];
                        break;
                    }
                    i9++;
                }
            }
            if (c0691b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0691b.f9980d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f9990h)) {
                c0691b.f9981e = iM;
                c0691b.f9983h = iArrG;
            }
        }
        return c0691bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0691b[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f9988e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            C0691b[] c0691bArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return c0691bArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long m(InputStream inputStream, int i7) throws IOException {
        byte[] bArrF = f(inputStream, i7);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 += ((long) (bArrF[i8] & 255)) << (i8 * 8);
        }
        return j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0691b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i7) throws IOException {
        int i8 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C0691b[0];
        }
        C0691b[] c0691bArr = new C0691b[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            c0691bArr[i9] = new C0691b(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        int i10 = 0;
        while (i10 < i7) {
            C0691b c0691b = c0691bArr[i10];
            int iAvailable = byteArrayInputStream.available();
            int i11 = c0691b.f;
            int i12 = c0691b.f9982g;
            TreeMap treeMap = c0691b.i;
            int i13 = iAvailable - i11;
            int iM3 = i8;
            while (byteArrayInputStream.available() > i13) {
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                int iM4 = (int) m(byteArrayInputStream, 2);
                while (iM4 > 0) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            int i14 = i8;
                            int i15 = i10;
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                            i8 = i14;
                            i10 = i15;
                        }
                    }
                    iM4--;
                    i8 = i8;
                    i10 = i10;
                }
            }
            int i16 = i8;
            int i17 = i10;
            if (byteArrayInputStream.available() != i13) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0691b.f9983h = g(byteArrayInputStream, c0691b.f9981e);
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i12 * 2) + 7) & (-8)) / 8));
            for (int i18 = i16; i18 < i12; i18++) {
                int i19 = bitSetValueOf.get(i18) ? 2 : i16;
                if (bitSetValueOf.get(i18 + i12)) {
                    i19 |= 4;
                }
                if (i19 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i18));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i16);
                    }
                    treeMap.put(Integer.valueOf(i18), Integer.valueOf(i19 | numValueOf.intValue()));
                }
            }
            i10 = i17 + 1;
            i8 = i16;
        }
        return c0691bArr;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, GOTO] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, GOTO] complete} */
    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0691b[] c0691bArr) throws IOException {
        long j7;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f9987d;
        int i7 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f9988e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(c0691bArr, bArr3);
                u(byteArrayOutputStream, c0691bArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f9989g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, c0691bArr.length, 1);
                for (C0691b c0691b : c0691bArr) {
                    int size = c0691b.i.size() * 4;
                    String strD = d(c0691b.f9977a, c0691b.f9978b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, c0691b.f9983h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, c0691b.f9979c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = c0691b.i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i8 : c0691b.f9983h) {
                        v(byteArrayOutputStream, i8);
                    }
                }
                return true;
            }
            byte[] bArr5 = f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(c0691bArr, bArr5);
                u(byteArrayOutputStream, c0691bArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f9990h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, c0691bArr.length);
            for (C0691b c0691b2 : c0691bArr) {
                String str = c0691b2.f9977a;
                TreeMap treeMap = c0691b2.i;
                String strD2 = d(str, c0691b2.f9978b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, c0691b2.f9983h.length);
                u(byteArrayOutputStream, c0691b2.f9979c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i9 : c0691b2.f9983h) {
                    v(byteArrayOutputStream, i9);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, c0691bArr.length);
            int i10 = 2;
            int i11 = 2;
            for (C0691b c0691b3 : c0691bArr) {
                u(byteArrayOutputStream2, c0691b3.f9979c, 4);
                u(byteArrayOutputStream2, c0691b3.f9980d, 4);
                u(byteArrayOutputStream2, c0691b3.f9982g, 4);
                String strD3 = d(c0691b3.f9977a, c0691b3.f9978b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i11 = i11 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i11 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray.length);
            }
            j jVar = new j(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(jVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < c0691bArr.length) {
                try {
                    C0691b c0691b4 = c0691bArr[i12];
                    v(byteArrayOutputStream3, i12);
                    v(byteArrayOutputStream3, c0691b4.f9981e);
                    i13 = i13 + 4 + (c0691b4.f9981e * i10);
                    int[] iArr = c0691b4.f9983h;
                    int length3 = iArr.length;
                    int i14 = i7;
                    int i15 = i10;
                    int i16 = i14;
                    while (i16 < length3) {
                        int i17 = iArr[i16];
                        v(byteArrayOutputStream3, i17 - i14);
                        i16++;
                        i14 = i17;
                    }
                    i12++;
                    i10 = i15;
                    i7 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
            }
            j jVar2 = new j(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i18 = 0;
            int i19 = 0;
            while (i18 < c0691bArr.length) {
                try {
                    C0691b c0691b5 = c0691bArr[i18];
                    Iterator it3 = c0691b5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, iIntValue, c0691b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, c0691b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i18);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i20 = i19 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i19 = i20 + length4;
                            i18++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i19 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i19 + ", does not match actual size " + byteArray5.length);
            }
            j jVar3 = new j(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar3);
            long j8 = 4;
            long size2 = j8 + j8 + 4 + ((long) (arrayList2.size() * 16));
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i21 = 0;
            while (i21 < arrayList2.size()) {
                j jVar4 = (j) arrayList2.get(i21);
                int i22 = jVar4.f10001a;
                byte[] bArr7 = jVar4.f10002b;
                if (i22 == 1) {
                    j7 = 0;
                } else if (i22 == 2) {
                    j7 = 1;
                } else if (i22 == 3) {
                    j7 = 2;
                } else if (i22 == 4) {
                    j7 = 3;
                } else {
                    if (i22 != 5) {
                        throw null;
                    }
                    j7 = 4;
                }
                u(byteArrayOutputStream, j7, 4);
                u(byteArrayOutputStream, size2, 4);
                if (jVar4.f10003c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    u(byteArrayOutputStream, bArrA3.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i21++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i23));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void p(ByteArrayOutputStream byteArrayOutputStream, C0691b c0691b) throws IOException {
        s(byteArrayOutputStream, c0691b);
        int i7 = c0691b.f9982g;
        int[] iArr = c0691b.f9983h;
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = iArr[i8];
            v(byteArrayOutputStream, i10 - i9);
            i8++;
            i9 = i10;
        }
        byte[] bArr = new byte[(((i7 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0691b.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i11 = iIntValue / 8;
                bArr[i11] = (byte) (bArr[i11] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i12 = iIntValue + i7;
                int i13 = i12 / 8;
                bArr[i13] = (byte) ((1 << (i12 % 8)) | bArr[i13]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void q(ByteArrayOutputStream byteArrayOutputStream, C0691b c0691b, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, c0691b.f9981e);
        u(byteArrayOutputStream, c0691b.f, 4);
        u(byteArrayOutputStream, c0691b.f9979c, 4);
        u(byteArrayOutputStream, c0691b.f9982g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i7, C0691b c0691b) throws IOException {
        int i8 = c0691b.f9982g;
        byte[] bArr = new byte[(((Integer.bitCount(i7 & (-2)) * i8) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0691b.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i9 = 0;
            for (int i10 = 1; i10 <= 4; i10 <<= 1) {
                if (i10 != 1 && (i10 & i7) != 0) {
                    if ((i10 & iIntValue2) == i10) {
                        int i11 = (i9 * i8) + iIntValue;
                        int i12 = i11 / 8;
                        bArr[i12] = (byte) ((1 << (i11 % 8)) | bArr[i12]);
                    }
                    i9++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void s(ByteArrayOutputStream byteArrayOutputStream, C0691b c0691b) throws IOException {
        int i7 = 0;
        for (Map.Entry entry : c0691b.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i7);
                v(byteArrayOutputStream, 0);
                i7 = iIntValue;
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:121:0x01b7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:180:0x026c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:182:0x026f */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(android.content.Context r18, java.util.concurrent.Executor r19, b2.InterfaceC0692c r20, boolean r21) {
        /*
            r1 = r18
            r5 = r20
            android.content.Context r0 = r1.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r4 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r8 = 7
            r9 = 0
            android.content.pm.PackageInfo r10 = r0.getPackageInfo(r2, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f1
            java.io.File r11 = r1.getFilesDir()
            java.lang.String r3 = "ProfileInstaller"
            r12 = 0
            if (r21 != 0) goto L8c
            java.io.File r0 = new java.io.File
            java.lang.String r7 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r11, r7)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L41
        L3f:
            r0 = r9
            goto L6f
        L41:
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch: java.io.IOException -> L3f
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3f
            r14.<init>(r0)     // Catch: java.io.IOException -> L3f
            r7.<init>(r14)     // Catch: java.io.IOException -> L3f
            long r14 = r7.readLong()     // Catch: java.lang.Throwable -> L64
            r7.close()     // Catch: java.io.IOException -> L3f
            r16 = r14
            long r13 = r10.lastUpdateTime
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 != 0) goto L5c
            r0 = 1
            goto L5d
        L5c:
            r0 = r9
        L5d:
            if (r0 == 0) goto L6f
            r7 = 2
            r5.k(r7, r12)
            goto L6f
        L64:
            r0 = move-exception
            r13 = r0
            r7.close()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch: java.io.IOException -> L3f
        L6e:
            throw r13     // Catch: java.io.IOException -> L3f
        L6f:
            if (r0 != 0) goto L72
            goto L8c
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r1.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            b2.i.c(r1, r9)
            goto L2f0
        L8c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "Installing profile for "
            r0.<init>(r7)
            java.lang.String r7 = r1.getPackageName()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            java.io.File r7 = new java.io.File
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "/data/misc/profiles/cur/0"
            r0.<init>(r3, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r0, r2)
            b2.a r2 = new b2.a
            java.lang.String r0 = "dexopt/baseline.prof"
            r3 = r4
            r4 = r19
            r2.<init>(r3, r4, r5, r6, r7)
            java.io.Serializable r4 = r2.f9973d
            byte[] r4 = (byte[]) r4
            if (r4 != 0) goto Lcc
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 3
            r2.e(r3, r0)
        Lc9:
            r7 = 1
            goto L2e5
        Lcc:
            boolean r6 = r7.exists()
            r13 = 4
            if (r6 == 0) goto Ldf
            boolean r6 = r7.canWrite()
            if (r6 != 0) goto Ldd
            r2.e(r13, r12)
            goto Lc9
        Ldd:
            r6 = 1
            goto Lec
        Ldf:
            boolean r6 = r7.createNewFile()     // Catch: java.io.IOException -> Le9
            if (r6 != 0) goto Ldd
            r2.e(r13, r12)     // Catch: java.io.IOException -> Le9
            goto Lc9
        Le9:
            r7 = 1
            goto L2e2
        Lec:
            r2.f9970a = r6
            r6 = 6
            java.io.FileInputStream r0 = r2.d(r3, r0)     // Catch: java.io.IOException -> Lf5 java.io.FileNotFoundException -> Lfa
            r7 = r0
            goto Lff
        Lf5:
            r0 = move-exception
            r5.k(r8, r0)
            goto Lfe
        Lfa:
            r0 = move-exception
            r5.k(r6, r0)
        Lfe:
            r7 = r12
        Lff:
            java.lang.String r14 = "Invalid magic"
            byte[] r15 = b2.AbstractC0693d.f9985b
            r6 = 8
            if (r7 == 0) goto L150
            byte[] r0 = f(r7, r13)     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            boolean r0 = java.util.Arrays.equals(r15, r0)     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            if (r0 == 0) goto L12d
            byte[] r0 = f(r7, r13)     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            java.lang.Object r9 = r2.f9975g     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            b2.b[] r9 = l(r7, r0, r9)     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            r7.close()     // Catch: java.io.IOException -> L121
            goto L144
        L121:
            r0 = move-exception
            r5.k(r8, r0)
            goto L144
        L126:
            r0 = move-exception
            r1 = r0
            goto L147
        L129:
            r0 = move-exception
            goto L133
        L12b:
            r0 = move-exception
            goto L13f
        L12d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            r0.<init>(r14)     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            throw r0     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
        L133:
            r5.k(r6, r0)     // Catch: java.lang.Throwable -> L126
        L136:
            r7.close()     // Catch: java.io.IOException -> L13a
            goto L143
        L13a:
            r0 = move-exception
            r5.k(r8, r0)
            goto L143
        L13f:
            r5.k(r8, r0)     // Catch: java.lang.Throwable -> L126
            goto L136
        L143:
            r9 = r12
        L144:
            r2.f9976h = r9
            goto L150
        L147:
            r7.close()     // Catch: java.io.IOException -> L14b
            goto L14f
        L14b:
            r0 = move-exception
            r5.k(r8, r0)
        L14f:
            throw r1
        L150:
            java.lang.Object r0 = r2.f9976h
            b2.b[] r0 = (b2.C0691b[]) r0
            if (r0 == 0) goto L1ba
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 31
            if (r7 < r9) goto L15d
            goto L166
        L15d:
            r9 = 24
            if (r7 == r9) goto L166
            r9 = 25
            if (r7 == r9) goto L166
            goto L1ba
        L166:
            java.lang.String r7 = "dexopt/baseline.profm"
            java.io.FileInputStream r3 = r2.d(r3, r7)     // Catch: java.lang.IllegalStateException -> L189 java.io.IOException -> L18b java.io.FileNotFoundException -> L18d
            if (r3 == 0) goto L1a1
            byte[] r7 = b2.AbstractC0693d.f9986c     // Catch: java.lang.Throwable -> L18f
            byte[] r9 = f(r3, r13)     // Catch: java.lang.Throwable -> L18f
            boolean r7 = java.util.Arrays.equals(r7, r9)     // Catch: java.lang.Throwable -> L18f
            if (r7 == 0) goto L192
            byte[] r7 = f(r3, r13)     // Catch: java.lang.Throwable -> L18f
            b2.b[] r0 = i(r3, r7, r4, r0)     // Catch: java.lang.Throwable -> L18f
            r2.f9976h = r0     // Catch: java.lang.Throwable -> L18f
            r3.close()     // Catch: java.lang.IllegalStateException -> L189 java.io.IOException -> L18b java.io.FileNotFoundException -> L18d
            r0 = r2
            goto L1b7
        L189:
            r0 = move-exception
            goto L1a7
        L18b:
            r0 = move-exception
            goto L1ad
        L18d:
            r0 = move-exception
            goto L1b1
        L18f:
            r0 = move-exception
            r4 = r0
            goto L198
        L192:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18f
            r0.<init>(r14)     // Catch: java.lang.Throwable -> L18f
            throw r0     // Catch: java.lang.Throwable -> L18f
        L198:
            r3.close()     // Catch: java.lang.Throwable -> L19c
            goto L1a0
        L19c:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L189 java.io.IOException -> L18b java.io.FileNotFoundException -> L18d
        L1a0:
            throw r4     // Catch: java.lang.IllegalStateException -> L189 java.io.IOException -> L18b java.io.FileNotFoundException -> L18d
        L1a1:
            if (r3 == 0) goto L1b6
            r3.close()     // Catch: java.lang.IllegalStateException -> L189 java.io.IOException -> L18b java.io.FileNotFoundException -> L18d
            goto L1b6
        L1a7:
            r2.f9976h = r12
            r5.k(r6, r0)
            goto L1b6
        L1ad:
            r5.k(r8, r0)
            goto L1b6
        L1b1:
            r3 = 9
            r5.k(r3, r0)
        L1b6:
            r0 = r12
        L1b7:
            if (r0 == 0) goto L1ba
            r2 = r0
        L1ba:
            java.lang.Object r0 = r2.f9972c
            r3 = r0
            b2.c r3 = (b2.InterfaceC0692c) r3
            java.lang.Object r0 = r2.f9976h
            b2.b[] r0 = (b2.C0691b[]) r0
            java.io.Serializable r4 = r2.f9973d
            byte[] r4 = (byte[]) r4
            java.lang.String r5 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L217
            if (r4 != 0) goto L1ce
            goto L217
        L1ce:
            boolean r7 = r2.f9970a
            if (r7 == 0) goto L211
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.IllegalStateException -> L1ed java.io.IOException -> L1ef
            r7.<init>()     // Catch: java.lang.IllegalStateException -> L1ed java.io.IOException -> L1ef
            r7.write(r15)     // Catch: java.lang.Throwable -> L1f1
            r7.write(r4)     // Catch: java.lang.Throwable -> L1f1
            boolean r0 = o(r7, r4, r0)     // Catch: java.lang.Throwable -> L1f1
            if (r0 != 0) goto L1f4
            r0 = 5
            r3.k(r0, r12)     // Catch: java.lang.Throwable -> L1f1
            r2.f9976h = r12     // Catch: java.lang.Throwable -> L1f1
            r7.close()     // Catch: java.lang.IllegalStateException -> L1ed java.io.IOException -> L1ef
            goto L217
        L1ed:
            r0 = move-exception
            goto L207
        L1ef:
            r0 = move-exception
            goto L20b
        L1f1:
            r0 = move-exception
            r4 = r0
            goto L1fe
        L1f4:
            byte[] r0 = r7.toByteArray()     // Catch: java.lang.Throwable -> L1f1
            r2.f9974e = r0     // Catch: java.lang.Throwable -> L1f1
            r7.close()     // Catch: java.lang.IllegalStateException -> L1ed java.io.IOException -> L1ef
            goto L20e
        L1fe:
            r7.close()     // Catch: java.lang.Throwable -> L202
            goto L206
        L202:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L1ed java.io.IOException -> L1ef
        L206:
            throw r4     // Catch: java.lang.IllegalStateException -> L1ed java.io.IOException -> L1ef
        L207:
            r3.k(r6, r0)
            goto L20e
        L20b:
            r3.k(r8, r0)
        L20e:
            r2.f9976h = r12
            goto L217
        L211:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L217:
            java.lang.Object r0 = r2.f9974e
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L221
            r6 = 0
            r7 = 1
            goto L2d0
        L221:
            boolean r3 = r2.f9970a
            if (r3 == 0) goto L2dc
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L269 java.io.IOException -> L2bd java.io.FileNotFoundException -> L2c0
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L269 java.io.IOException -> L2bd java.io.FileNotFoundException -> L2c0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2b1
            java.lang.Object r0 = r2.f     // Catch: java.lang.Throwable -> L2b1
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L2b1
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2b1
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch: java.lang.Throwable -> L2a5
            java.nio.channels.FileLock r6 = r5.tryLock()     // Catch: java.lang.Throwable -> L297
            if (r6 == 0) goto L27f
            boolean r0 = r6.isValid()     // Catch: java.lang.Throwable -> L281
            if (r0 == 0) goto L27f
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L281
        L247:
            int r7 = r3.read(r0)     // Catch: java.lang.Throwable -> L281
            if (r7 <= 0) goto L252
            r9 = 0
            r4.write(r0, r9, r7)     // Catch: java.lang.Throwable -> L281
            goto L247
        L252:
            r7 = 1
            r2.e(r7, r12)     // Catch: java.lang.Throwable -> L27c
            r6.close()     // Catch: java.lang.Throwable -> L279
            r5.close()     // Catch: java.lang.Throwable -> L276
            r4.close()     // Catch: java.lang.Throwable -> L273
            r3.close()     // Catch: java.lang.Throwable -> L269 java.io.IOException -> L26c java.io.FileNotFoundException -> L26f
            r2.f9974e = r12
            r2.f9976h = r12
            r6 = r7
            goto L2d0
        L269:
            r0 = move-exception
            goto L2d7
        L26c:
            r0 = move-exception
            goto L2c3
        L26f:
            r0 = move-exception
        L270:
            r3 = 6
            goto L2cb
        L273:
            r0 = move-exception
        L274:
            r4 = r0
            goto L2b4
        L276:
            r0 = move-exception
        L277:
            r5 = r0
            goto L2a8
        L279:
            r0 = move-exception
        L27a:
            r6 = r0
            goto L29a
        L27c:
            r0 = move-exception
        L27d:
            r9 = r0
            goto L28c
        L27f:
            r7 = 1
            goto L284
        L281:
            r0 = move-exception
            r7 = 1
            goto L27d
        L284:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L27c
            java.lang.String r9 = "Unable to acquire a lock on the underlying file channel."
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L27c
            throw r0     // Catch: java.lang.Throwable -> L27c
        L28c:
            if (r6 == 0) goto L296
            r6.close()     // Catch: java.lang.Throwable -> L292
            goto L296
        L292:
            r0 = move-exception
            r9.addSuppressed(r0)     // Catch: java.lang.Throwable -> L279
        L296:
            throw r9     // Catch: java.lang.Throwable -> L279
        L297:
            r0 = move-exception
            r7 = 1
            goto L27a
        L29a:
            if (r5 == 0) goto L2a4
            r5.close()     // Catch: java.lang.Throwable -> L2a0
            goto L2a4
        L2a0:
            r0 = move-exception
            r6.addSuppressed(r0)     // Catch: java.lang.Throwable -> L276
        L2a4:
            throw r6     // Catch: java.lang.Throwable -> L276
        L2a5:
            r0 = move-exception
            r7 = 1
            goto L277
        L2a8:
            r4.close()     // Catch: java.lang.Throwable -> L2ac
            goto L2b0
        L2ac:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L273
        L2b0:
            throw r5     // Catch: java.lang.Throwable -> L273
        L2b1:
            r0 = move-exception
            r7 = 1
            goto L274
        L2b4:
            r3.close()     // Catch: java.lang.Throwable -> L2b8
            goto L2bc
        L2b8:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L269 java.io.IOException -> L26c java.io.FileNotFoundException -> L26f
        L2bc:
            throw r4     // Catch: java.lang.Throwable -> L269 java.io.IOException -> L26c java.io.FileNotFoundException -> L26f
        L2bd:
            r0 = move-exception
            r7 = 1
            goto L2c3
        L2c0:
            r0 = move-exception
            r7 = 1
            goto L270
        L2c3:
            r2.e(r8, r0)     // Catch: java.lang.Throwable -> L269
        L2c6:
            r2.f9974e = r12
            r2.f9976h = r12
            goto L2cf
        L2cb:
            r2.e(r3, r0)     // Catch: java.lang.Throwable -> L269
            goto L2c6
        L2cf:
            r6 = 0
        L2d0:
            if (r6 == 0) goto L2d5
            e(r10, r11)
        L2d5:
            r9 = r6
            goto L2e6
        L2d7:
            r2.f9974e = r12
            r2.f9976h = r12
            throw r0
        L2dc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L2e2:
            r2.e(r13, r12)
        L2e5:
            r9 = 0
        L2e6:
            if (r9 == 0) goto L2ec
            if (r21 == 0) goto L2ec
            r9 = r7
            goto L2ed
        L2ec:
            r9 = 0
        L2ed:
            b2.i.c(r1, r9)
        L2f0:
            return
        L2f1:
            r0 = move-exception
            r5.k(r8, r0)
            r9 = 0
            b2.i.c(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.AbstractC0693d.t(android.content.Context, java.util.concurrent.Executor, b2.c, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j7, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = (byte) ((j7 >> (i8 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i7) throws IOException {
        u(byteArrayOutputStream, i7, 2);
    }
}
