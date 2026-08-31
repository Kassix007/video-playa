package p3;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class J implements K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15670c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15668a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f15671d = new C1469o();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public J(String str) {
        this.f15669b = 0;
        String strTrim = str.trim();
        this.f15670c = strTrim;
        this.f15669b = strTrim.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean o(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public void a(float f, float f7) {
        f((byte) 0);
        l(2);
        float[] fArr = (float[]) this.f15671d;
        int i = this.f15669b;
        int i7 = i + 1;
        this.f15669b = i7;
        fArr[i] = f;
        this.f15669b = i + 2;
        fArr[i7] = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public void b(float f, float f7, float f8, float f9, float f10, float f11) {
        f((byte) 2);
        l(6);
        float[] fArr = (float[]) this.f15671d;
        int i = this.f15669b;
        int i7 = i + 1;
        this.f15669b = i7;
        fArr[i] = f;
        int i8 = i + 2;
        this.f15669b = i8;
        fArr[i7] = f7;
        int i9 = i + 3;
        this.f15669b = i9;
        fArr[i8] = f8;
        int i10 = i + 4;
        this.f15669b = i10;
        fArr[i9] = f9;
        int i11 = i + 5;
        this.f15669b = i11;
        fArr[i10] = f10;
        this.f15669b = i + 6;
        fArr[i11] = f11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public void c(float f, float f7, float f8, boolean z5, boolean z6, float f9, float f10) {
        f((byte) ((z5 ? 2 : 0) | 4 | (z6 ? 1 : 0)));
        l(5);
        float[] fArr = (float[]) this.f15671d;
        int i = this.f15669b;
        int i7 = i + 1;
        this.f15669b = i7;
        fArr[i] = f;
        int i8 = i + 2;
        this.f15669b = i8;
        fArr[i7] = f7;
        int i9 = i + 3;
        this.f15669b = i9;
        fArr[i8] = f8;
        int i10 = i + 4;
        this.f15669b = i10;
        fArr[i9] = f9;
        this.f15669b = i + 5;
        fArr[i10] = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public void close() {
        f((byte) 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public void d(float f, float f7, float f8, float f9) {
        f((byte) 3);
        l(4);
        float[] fArr = (float[]) this.f15671d;
        int i = this.f15669b;
        int i7 = i + 1;
        this.f15669b = i7;
        fArr[i] = f;
        int i8 = i + 2;
        this.f15669b = i8;
        fArr[i7] = f7;
        int i9 = i + 3;
        this.f15669b = i9;
        fArr[i8] = f8;
        this.f15669b = i + 4;
        fArr[i9] = f9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public void e(float f, float f7) {
        f((byte) 1);
        l(2);
        float[] fArr = (float[]) this.f15671d;
        int i = this.f15669b;
        int i7 = i + 1;
        this.f15669b = i7;
        fArr[i] = f;
        this.f15669b = i + 2;
        fArr[i7] = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f(byte b7) {
        int i = this.f15668a;
        byte[] bArr = (byte[]) this.f15670c;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f15670c = bArr2;
        }
        byte[] bArr3 = (byte[]) this.f15670c;
        int i7 = this.f15668a;
        this.f15668a = i7 + 1;
        bArr3[i7] = b7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int g() {
        int i = this.f15668a;
        int i7 = this.f15669b;
        if (i == i7) {
            return -1;
        }
        int i8 = i + 1;
        this.f15668a = i8;
        if (i8 < i7) {
            return ((String) this.f15670c).charAt(i8);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Boolean h(Object obj) {
        if (obj == null) {
            return null;
        }
        x();
        int i = this.f15668a;
        if (i == this.f15669b) {
            return null;
        }
        char cCharAt = ((String) this.f15670c).charAt(i);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.f15668a++;
        return Boolean.valueOf(cCharAt == '1');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float i(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        x();
        return q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean j(char c7) {
        int i = this.f15668a;
        boolean z5 = i < this.f15669b && ((String) this.f15670c).charAt(i) == c7;
        if (z5) {
            this.f15668a++;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean k(String str) {
        int length = str.length();
        int i = this.f15668a;
        boolean z5 = i <= this.f15669b - length && ((String) this.f15670c).substring(i, i + length).equals(str);
        if (z5) {
            this.f15668a += length;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void l(int i) {
        float[] fArr = (float[]) this.f15671d;
        if (fArr.length < this.f15669b + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.f15671d = fArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean m() {
        return this.f15668a == this.f15669b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void n(K k7) {
        int i = 0;
        for (int i7 = 0; i7 < this.f15668a; i7++) {
            byte b7 = ((byte[]) this.f15670c)[i7];
            if (b7 == 0) {
                float[] fArr = (float[]) this.f15671d;
                int i8 = i + 1;
                float f = fArr[i];
                i += 2;
                k7.a(f, fArr[i8]);
            } else if (b7 == 1) {
                float[] fArr2 = (float[]) this.f15671d;
                int i9 = i + 1;
                float f7 = fArr2[i];
                i += 2;
                k7.e(f7, fArr2[i9]);
            } else if (b7 == 2) {
                float[] fArr3 = (float[]) this.f15671d;
                k7.b(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                i += 6;
            } else if (b7 == 3) {
                float[] fArr4 = (float[]) this.f15671d;
                float f8 = fArr4[i];
                float f9 = fArr4[i + 1];
                int i10 = i + 3;
                float f10 = fArr4[i + 2];
                i += 4;
                k7.d(f8, f9, f10, fArr4[i10]);
            } else if (b7 != 8) {
                boolean z5 = (b7 & 2) != 0;
                boolean z6 = (b7 & 1) != 0;
                float[] fArr5 = (float[]) this.f15671d;
                k7.c(fArr5[i], fArr5[i + 1], fArr5[i + 2], z5, z6, fArr5[i + 3], fArr5[i + 4]);
                i += 5;
            } else {
                k7.close();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Integer p() {
        int i = this.f15668a;
        if (i == this.f15669b) {
            return null;
        }
        String str = (String) this.f15670c;
        this.f15668a = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float q() {
        C1469o c1469o = (C1469o) this.f15671d;
        float fA = c1469o.a((String) this.f15670c, this.f15668a, this.f15669b);
        if (!Float.isNaN(fA)) {
            this.f15668a = c1469o.f15803a;
        }
        return fA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C r() {
        float fQ = q();
        if (Float.isNaN(fQ)) {
            return null;
        }
        int iV = v();
        return iV == 0 ? new C(1, fQ) : new C(iV, fQ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String s() {
        String str = (String) this.f15670c;
        if (m()) {
            return null;
        }
        int i = this.f15668a;
        char cCharAt = str.charAt(i);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iG = g();
        while (iG != -1 && iG != cCharAt) {
            iG = g();
        }
        if (iG == -1) {
            this.f15668a = i;
            return null;
        }
        int i7 = this.f15668a;
        this.f15668a = i7 + 1;
        return str.substring(i + 1, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String t() {
        return u(' ', false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String u(char c7, boolean z5) {
        String str = (String) this.f15670c;
        if (m()) {
            return null;
        }
        char cCharAt = str.charAt(this.f15668a);
        if ((!z5 && o(cCharAt)) || cCharAt == c7) {
            return null;
        }
        int i = this.f15668a;
        int iG = g();
        while (iG != -1 && iG != c7 && (z5 || !o(iG))) {
            iG = g();
        }
        return str.substring(i, this.f15668a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int v() {
        String str = (String) this.f15670c;
        if (m()) {
            return 0;
        }
        if (str.charAt(this.f15668a) == '%') {
            this.f15668a++;
            return 9;
        }
        int i = this.f15668a;
        if (i > this.f15669b - 2) {
            return 0;
        }
        try {
            int iV = k1.i.v(str.substring(i, i + 2).toLowerCase(Locale.US));
            this.f15668a += 2;
            return iV;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float w() {
        x();
        C1469o c1469o = (C1469o) this.f15671d;
        float fA = c1469o.a((String) this.f15670c, this.f15668a, this.f15669b);
        if (!Float.isNaN(fA)) {
            this.f15668a = c1469o.f15803a;
        }
        return fA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean x() {
        y();
        int i = this.f15668a;
        if (i == this.f15669b || ((String) this.f15670c).charAt(i) != ',') {
            return false;
        }
        this.f15668a++;
        y();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void y() {
        while (true) {
            int i = this.f15668a;
            if (i >= this.f15669b || !o(((String) this.f15670c).charAt(i))) {
                return;
            } else {
                this.f15668a++;
            }
        }
    }
}
