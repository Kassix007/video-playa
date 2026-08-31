package okhttp3.internal.publicsuffix;

import C0.S;
import I5.c;
import I5.d;
import I5.i;
import I5.n;
import J5.m;
import O3.D;
import a.AbstractC0597a;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.P1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import n5.l;
import n5.s;
import q6.A;
import q6.q;

/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f15467e = {42};
    public static final List f = AbstractC0836n2.z("*");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f15468g = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f15469a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f15470b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f15471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f15472d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List c(String str) {
        List listE1 = m.e1(str, new char[]{'.'});
        if (!kotlin.jvm.internal.m.a(l.r0(listE1), "")) {
            return listE1;
        }
        List list = listE1;
        int size = listE1.size() - 1;
        return l.y0(list, size >= 0 ? size : 0);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a(String str) {
        String strI;
        String strI2;
        String strI3;
        int size;
        int size2;
        String unicodeDomain = IDN.toUnicode(str);
        kotlin.jvm.internal.m.d(unicodeDomain, "unicodeDomain");
        List listC = c(unicodeDomain);
        List listE1 = s.f15299q;
        int i = 0;
        if (this.f15469a.get() || !this.f15469a.compareAndSet(false, true)) {
            try {
                this.f15470b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z5 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z5 = true;
                    } catch (IOException e7) {
                        l6.m mVar = l6.m.f14610a;
                        l6.m.f14610a.getClass();
                        l6.m.i("Failed to read public suffix list", 5, e7);
                        if (z5) {
                        }
                    }
                } finally {
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f15471c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i7 = 0; i7 < size3; i7++) {
            String str2 = (String) listC.get(i7);
            Charset UTF_8 = StandardCharsets.UTF_8;
            kotlin.jvm.internal.m.d(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            kotlin.jvm.internal.m.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i7] = bytes;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                strI = null;
                break;
            }
            byte[] bArr2 = this.f15471c;
            if (bArr2 == null) {
                kotlin.jvm.internal.m.k("publicSuffixListBytes");
                throw null;
            }
            strI = D.i(bArr2, bArr, i8);
            if (strI != null) {
                break;
            }
            i8++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i9 = 0; i9 < length; i9++) {
                bArr3[i9] = f15467e;
                byte[] bArr4 = this.f15471c;
                if (bArr4 == null) {
                    kotlin.jvm.internal.m.k("publicSuffixListBytes");
                    throw null;
                }
                strI2 = D.i(bArr4, bArr3, i9);
                if (strI2 != null) {
                    break;
                }
            }
            strI2 = null;
        } else {
            strI2 = null;
        }
        if (strI2 != null) {
            int i10 = size3 - 1;
            for (int i11 = 0; i11 < i10; i11++) {
                byte[] bArr5 = this.f15472d;
                if (bArr5 == null) {
                    kotlin.jvm.internal.m.k("publicSuffixExceptionListBytes");
                    throw null;
                }
                strI3 = D.i(bArr5, bArr, i11);
                if (strI3 != null) {
                    break;
                }
            }
            strI3 = null;
        } else {
            strI3 = null;
        }
        if (strI3 != null) {
            listE1 = m.e1("!".concat(strI3), new char[]{'.'});
        } else if (strI == null && strI2 == null) {
            listE1 = f;
        } else {
            List listE12 = strI != null ? m.e1(strI, new char[]{'.'}) : listE1;
            if (strI2 != null) {
                listE1 = m.e1(strI2, new char[]{'.'});
            }
            if (listE12.size() > listE1.size()) {
                listE1 = listE12;
            }
        }
        if (listC.size() == listE1.size() && ((String) listE1.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listE1.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listE1.size();
        } else {
            size = listC.size();
            size2 = listE1.size() + 1;
        }
        int i12 = size - size2;
        i nVar = new n(1, c(str));
        if (i12 < 0) {
            throw new IllegalArgumentException(S.m("Requested element count ", " is less than zero.", i12).toString());
        }
        if (i12 != 0) {
            nVar = nVar instanceof d ? ((d) nVar).a(i12) : new c(nVar, i12);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : nVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            P1.e(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                A aJ = AbstractC0597a.j(new q(AbstractC0597a.R(resourceAsStream)));
                try {
                    long j = aJ.readInt();
                    aJ.Q(j);
                    byte[] bArrZ = aJ.f16026r.z(j);
                    long j7 = aJ.readInt();
                    aJ.Q(j7);
                    byte[] bArrZ2 = aJ.f16026r.z(j7);
                    aJ.close();
                    synchronized (this) {
                        this.f15471c = bArrZ;
                        this.f15472d = bArrZ2;
                    }
                } finally {
                }
            }
        } finally {
            this.f15470b.countDown();
        }
    }
}
