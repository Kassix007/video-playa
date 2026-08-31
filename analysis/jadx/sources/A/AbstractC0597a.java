package a;

import A.G;
import B0.C0029a;
import B0.C0050o;
import D2.c;
import F.C0158l;
import I0.b;
import I0.p;
import J5.m;
import J5.t;
import M5.C0247h;
import M5.H;
import O3.D;
import Q2.g;
import R4.C0433b2;
import S3.d;
import S3.f;
import S3.h;
import X5.i;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StatFs;
import android.os.StrictMode;
import android.util.Log;
import android.util.TypedValue;
import androidx.concurrent.futures.j;
import androidx.concurrent.futures.o;
import androidx.work.WorkRequest;
import c0.C0715c;
import c0.C0716d;
import c0.InterfaceC0725m;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.O1;
import i0.C1130b;
import j0.AbstractC1146a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import m.C1262J0;
import m5.AbstractC1362a;
import m5.C1367f;
import m5.C1376o;
import n5.AbstractC1397A;
import n5.k;
import n5.l;
import n5.s;
import q5.InterfaceC1524c;
import q6.A;
import q6.AbstractC1532a;
import q6.C1533b;
import q6.C1534c;
import q6.C1538g;
import q6.C1541j;
import q6.E;
import q6.F;
import q6.I;
import q6.v;
import q6.x;
import q6.z;
import r.C1548G;
import r.C1549H;
import r.O;
import t2.C1617b;
import w.EnumC1778d0;
import x1.e;
import x3.AbstractC1887A;
import x5.AbstractC1902a;

/* JADX INFO: renamed from: a.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0597a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ColorStateList A(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC1146a.r(drawable)) {
            return null;
        }
        return AbstractC1146a.e(drawable).getColorStateList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String B() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(1) + "-" + (calendar.get(2) + 1) + "-" + calendar.get(5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Drawable C(Context context, int i) {
        return C1262J0.b().c(context, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a A[LOOP:0: B:4:0x000b->B:37:0x006a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d A[EDGE_INSN: B:42:0x006d->B:38:0x006d BREAK  A[LOOP:0: B:4:0x000b->B:37:0x006a], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final B0.A0 D(B0.L r7) {
        /*
            B0.g0 r7 = r7.f268U
            c0.l r7 = r7.f433e
            int r0 = r7.f10103t
            r0 = r0 & 8
            r1 = 0
            if (r0 == 0) goto L6d
        Lb:
            if (r7 == 0) goto L6d
            int r0 = r7.f10102s
            r0 = r0 & 8
            if (r0 == 0) goto L64
            r0 = r7
            r2 = r1
        L15:
            if (r0 == 0) goto L64
            boolean r3 = r0 instanceof B0.A0
            if (r3 == 0) goto L26
            r3 = r0
            B0.A0 r3 = (B0.A0) r3
            boolean r3 = r3.Z()
            if (r3 == 0) goto L5f
            r1 = r0
            goto L6d
        L26:
            int r3 = r0.f10102s
            r3 = r3 & 8
            if (r3 == 0) goto L5f
            boolean r3 = r0 instanceof B0.AbstractC0049n
            if (r3 == 0) goto L5f
            r3 = r0
            B0.n r3 = (B0.AbstractC0049n) r3
            c0.l r3 = r3.f473F
            r4 = 0
        L36:
            r5 = 1
            if (r3 == 0) goto L5c
            int r6 = r3.f10102s
            r6 = r6 & 8
            if (r6 == 0) goto L59
            int r4 = r4 + 1
            if (r4 != r5) goto L45
            r0 = r3
            goto L59
        L45:
            if (r2 != 0) goto L50
            R.e r2 = new R.e
            r5 = 16
            c0.l[] r5 = new c0.AbstractC0724l[r5]
            r2.<init>(r5)
        L50:
            if (r0 == 0) goto L56
            r2.c(r0)
            r0 = r1
        L56:
            r2.c(r3)
        L59:
            c0.l r3 = r3.f10105v
            goto L36
        L5c:
            if (r4 != r5) goto L5f
            goto L15
        L5f:
            c0.l r0 = B0.AbstractC0041g.f(r2)
            goto L15
        L64:
            int r0 = r7.f10103t
            r0 = r0 & 8
            if (r0 == 0) goto L6d
            c0.l r7 = r7.f10105v
            goto Lb
        L6d:
            B0.A0 r1 = (B0.A0) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0597a.D(B0.L):B0.A0");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static File E(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int F(int i, int i7) {
        return (i >> i7) & 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean G(AssertionError assertionError) {
        Logger logger = v.f16090a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? m.K0(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean H(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static MappedByteBuffer I(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String J(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        C1541j c1541j = C1541j.f16064t;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        kotlin.jvm.internal.m.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i = 0;
        g.o(encoded.length, 0, length);
        byte[] bArr = new C1541j(k.H0(encoded, 0, length)).b("SHA-256").f16065q;
        byte[] map = AbstractC1532a.f16048a;
        kotlin.jvm.internal.m.e(bArr, "<this>");
        kotlin.jvm.internal.m.e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length2 = bArr.length - (bArr.length % 3);
        int i7 = 0;
        while (i < length2) {
            byte b7 = bArr[i];
            int i8 = i + 2;
            byte b8 = bArr[i + 1];
            i += 3;
            byte b9 = bArr[i8];
            bArr2[i7] = map[(b7 & 255) >> 2];
            bArr2[i7 + 1] = map[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            int i9 = i7 + 3;
            bArr2[i7 + 2] = map[((b8 & 15) << 2) | ((b9 & 255) >> 6)];
            i7 += 4;
            bArr2[i9] = map[b9 & 63];
        }
        int length3 = bArr.length - length2;
        if (length3 == 1) {
            byte b10 = bArr[i];
            bArr2[i7] = map[(b10 & 255) >> 2];
            bArr2[i7 + 1] = map[(b10 & 3) << 4];
            bArr2[i7 + 2] = 61;
            bArr2[i7 + 3] = 61;
        } else if (length3 == 2) {
            int i10 = i + 1;
            byte b11 = bArr[i];
            byte b12 = bArr[i10];
            bArr2[i7] = map[(b11 & 255) >> 2];
            bArr2[i7 + 1] = map[((b11 & 3) << 4) | ((b12 & 255) >> 4)];
            bArr2[i7 + 2] = map[(b12 & 15) << 2];
            bArr2[i7 + 3] = 61;
        }
        sb.append(new String(bArr2, J5.a.f2809a));
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean K(C1548G c1548g, Object obj, Object obj2) {
        Object objG = c1548g.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof C1549H)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            c1548g.j(obj);
            return true;
        }
        C1549H c1549h = (C1549H) objG;
        boolean zL = c1549h.l(obj2);
        if (zL && c1549h.g()) {
            c1548g.j(obj);
        }
        return zL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void L(C1548G c1548g, Object obj) {
        boolean zG;
        long[] jArr = c1548g.f16133a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        int i9 = (i << 3) + i8;
                        Object obj2 = c1548g.f16134b[i9];
                        Object obj3 = c1548g.f16135c[i9];
                        if (obj3 instanceof C1549H) {
                            kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            C1549H c1549h = (C1549H) obj3;
                            c1549h.l(obj);
                            zG = c1549h.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            c1548g.k(i9);
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TypedValue M(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean N(Context context, int i, boolean z5) {
        TypedValue typedValueM = M(context, i);
        return (typedValueM == null || typedValueM.type != 18) ? z5 : typedValueM.data != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TypedValue O(Context context, int i, String str) {
        TypedValue typedValueM = M(context, i);
        if (typedValueM != null) {
            return typedValueM;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void P(I0.m mVar, e eVar) {
        Object objG = mVar.i().f2257q.g(p.f2307g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            throw new ClassCastException();
        }
        I0.m mVarJ = mVar.j();
        if (mVarJ == null) {
            return;
        }
        Object objG2 = mVarJ.i().f2257q.g(p.f2306e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = mVarJ.i().f2257q.g(p.f);
            b bVar = (b) (objG3 != null ? objG3 : null);
            if (bVar == null || (bVar.f2223a >= 0 && bVar.f2224b >= 0)) {
                if (mVar.i().f2257q.c(p.f2295E)) {
                    ArrayList arrayList = new ArrayList();
                    List listH = I0.m.h(4, mVarJ);
                    int size = listH.size();
                    int i = 0;
                    for (int i7 = 0; i7 < size; i7++) {
                        I0.m mVar2 = (I0.m) listH.get(i7);
                        if (mVar2.i().f2257q.c(p.f2295E)) {
                            arrayList.add(mVar2);
                            if (mVar2.f2267c.t() < mVar.f2267c.t()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zL = l(arrayList);
                    int i8 = zL ? 0 : i;
                    int i9 = zL ? i : 0;
                    Object objG4 = mVar.i().f2257q.g(p.f2295E);
                    if (objG4 == null) {
                        objG4 = Boolean.FALSE;
                    }
                    eVar.k(E0.a.a(((Boolean) objG4).booleanValue(), i8, 1, i9, 1));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1533b Q(Socket socket) throws IOException {
        Logger logger = v.f16090a;
        F f = new F(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.m.d(outputStream, "getOutputStream(...)");
        return new C1533b(0, f, new C1533b(1, outputStream, f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1534c R(InputStream inputStream) {
        Logger logger = v.f16090a;
        kotlin.jvm.internal.m.e(inputStream, "<this>");
        return new C1534c(inputStream, new I());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1534c S(Socket socket) throws IOException {
        Logger logger = v.f16090a;
        F f = new F(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.m.d(inputStream, "getInputStream(...)");
        return new C1534c(f, new C1534c(inputStream, f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String T(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        int i = -1;
        int i7 = 0;
        if (!m.K0(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                kotlin.jvm.internal.m.d(ascii, "toASCII(host)");
                Locale US = Locale.US;
                kotlin.jvm.internal.m.d(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                kotlin.jvm.internal.m.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i8 = 0; i8 < length; i8++) {
                    char cCharAt = lowerCase.charAt(i8);
                    if (kotlin.jvm.internal.m.f(cCharAt, 31) <= 0 || kotlin.jvm.internal.m.f(cCharAt, 127) >= 0 || m.R0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressV = (t.G0(str, "[", false) && t.A0(str, "]", false)) ? v(str, 1, str.length() - 1) : v(str, 0, str.length());
        if (inetAddressV == null) {
            return null;
        }
        byte[] address = inetAddressV.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressV.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < address.length) {
            int i11 = i9;
            while (i11 < 16 && address[i11] == 0 && address[i11 + 1] == 0) {
                i11 += 2;
            }
            int i12 = i11 - i9;
            if (i12 > i10 && i12 >= 4) {
                i = i9;
                i10 = i12;
            }
            i9 = i11 + 2;
        }
        C1538g c1538g = new C1538g();
        while (i7 < address.length) {
            if (i7 == i) {
                c1538g.e0(58);
                i7 += i10;
                if (i7 == 16) {
                    c1538g.e0(58);
                }
            } else {
                if (i7 > 0) {
                    c1538g.e0(58);
                }
                byte b7 = address[i7];
                byte[] bArr = e6.b.f12673a;
                c1538g.f0(((b7 & 255) << 8) | (address[i7 + 1] & 255));
                i7 += 2;
            }
        }
        return c1538g.M();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final G U(n1.b bVar) {
        return new G(bVar.f15125a, bVar.f15126b, bVar.f15127c, bVar.f15128d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final M2.a V(M2.a r10, U2.g r11, U2.n r12, I2.i r13, s5.c r14) {
        /*
            boolean r0 = r14 instanceof M2.i
            if (r0 == 0) goto L13
            r0 = r14
            M2.i r0 = (M2.i) r0
            int r1 = r0.f3790y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3790y = r1
            goto L18
        L13:
            M2.i r0 = new M2.i
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f3789x
            int r1 = r0.f3790y
            r2 = 1
            if (r1 == 0) goto L48
            if (r1 != r2) goto L40
            int r10 = r0.f3788w
            int r11 = r0.f3787v
            java.util.List r12 = r0.f3786u
            java.util.List r12 = (java.util.List) r12
            I2.i r13 = r0.f3785t
            U2.n r1 = r0.f3784s
            U2.g r3 = r0.f3783r
            M2.a r4 = r0.f3782q
            m5.AbstractC1362a.e(r14)
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            q5.h r5 = r0.getContext()
            M5.AbstractC0263y.i(r5)
            int r11 = r11 + r2
            goto Lbf
        L40:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L48:
            m5.AbstractC1362a.e(r14)
            I2.l r14 = U2.h.f7674a
            java.lang.Object r14 = I2.q.d(r11, r14)
            java.util.List r14 = (java.util.List) r14
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L5a
            return r10
        L5a:
            I2.n r1 = r10.f3725a
            boolean r3 = r1 instanceof I2.C0167a
            if (r3 != 0) goto L6f
            I2.l r4 = U2.h.f7677d
            java.lang.Object r4 = I2.q.d(r11, r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L6f
            return r10
        L6f:
            r4 = 0
            if (r3 == 0) goto L89
            r3 = r1
            I2.a r3 = (I2.C0167a) r3
            android.graphics.Bitmap r3 = r3.f2339a
            android.graphics.Bitmap$Config r5 = r3.getConfig()
            if (r5 != 0) goto L7f
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L7f:
            android.graphics.Bitmap$Config[] r6 = Y2.j.f8215a
            boolean r5 = n5.k.z0(r6, r5)
            if (r5 == 0) goto L89
            r1 = r3
            goto Lac
        L89:
            android.content.Context r3 = r12.f7686a
            android.content.res.Resources r3 = r3.getResources()
            android.graphics.drawable.Drawable r1 = I2.q.b(r1, r3)
            I2.l r3 = U2.i.f7678a
            java.lang.Object r3 = I2.q.e(r12, r3)
            android.graphics.Bitmap$Config r3 = (android.graphics.Bitmap.Config) r3
            V2.h r5 = r12.f7687b
            V2.g r6 = r12.f7688c
            V2.d r7 = r12.f7689d
            V2.d r8 = V2.d.f7960r
            if (r7 != r8) goto La7
            r7 = r2
            goto La8
        La7:
            r7 = r4
        La8:
            android.graphics.Bitmap r1 = y4.AbstractC1918b.l(r1, r3, r5, r6, r7)
        Lac:
            r13.getClass()
            r3 = r14
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r9 = r4
            r4 = r10
            r10 = r3
            r3 = r11
            r11 = r9
            r9 = r1
            r1 = r12
            r12 = r14
            r14 = r9
        Lbf:
            if (r11 < r10) goto Ld5
            r13.getClass()
            I2.a r10 = new I2.a
            r10.<init>(r14)
            boolean r11 = r4.f3726b
            J2.h r12 = r4.f3727c
            java.lang.String r13 = r4.f3728d
            M2.a r14 = new M2.a
            r14.<init>(r10, r11, r12, r13)
            return r14
        Ld5:
            java.lang.Object r14 = r12.get(r11)
            if (r14 != 0) goto Lf1
            V2.h r14 = r1.f7687b
            r0.f3782q = r4
            r0.f3783r = r3
            r0.f3784s = r1
            r0.f3785t = r13
            java.util.List r12 = (java.util.List) r12
            r0.f3786u = r12
            r0.f3787v = r11
            r0.f3788w = r10
            r0.f3790y = r2
            r10 = 0
            throw r10
        Lf1:
            java.lang.ClassCastException r10 = new java.lang.ClassCastException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0597a.V(M2.a, U2.g, U2.n, I2.i, s5.c):M2.a");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int W(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object X(d dVar) throws ExecutionException {
        if (dVar.d()) {
            return dVar.c();
        }
        throw new ExecutionException(dVar.b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String Y(Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i7 = 0;
        while (true) {
            length = objArr.length;
            if (i7 >= length) {
                break;
            }
            Object obj = objArr[i7];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e7) {
                    String str = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), (Throwable) e7);
                    string = "<" + str + " threw " + e7.getClass().getName() + ">";
                }
            }
            objArr[i7] = string;
            i7++;
        }
        StringBuilder sb = new StringBuilder((length * 16) + 29);
        int i8 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = "expected a non-null reference".indexOf("%s", i8)) == -1) {
                break;
            }
            sb.append((CharSequence) "expected a non-null reference", i8, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i8 = iIndexOf + 2;
        }
        sb.append((CharSequence) "expected a non-null reference", i8, 29);
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i9 = i + 1; i9 < objArr.length; i9++) {
                sb.append(", ");
                sb.append(objArr[i9]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final I0.m a(B0.L r8, boolean r9) {
        /*
            B0.g0 r0 = r8.f268U
            c0.l r0 = r0.f433e
            int r1 = r0.f10103t
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L64
        Lb:
            if (r0 == 0) goto L64
            int r1 = r0.f10102s
            r1 = r1 & 8
            if (r1 == 0) goto L5b
            r1 = r0
            r3 = r2
        L15:
            if (r1 == 0) goto L5b
            boolean r4 = r1 instanceof B0.A0
            if (r4 == 0) goto L1d
            r2 = r1
            goto L64
        L1d:
            int r4 = r1.f10102s
            r4 = r4 & 8
            if (r4 == 0) goto L56
            boolean r4 = r1 instanceof B0.AbstractC0049n
            if (r4 == 0) goto L56
            r4 = r1
            B0.n r4 = (B0.AbstractC0049n) r4
            c0.l r4 = r4.f473F
            r5 = 0
        L2d:
            r6 = 1
            if (r4 == 0) goto L53
            int r7 = r4.f10102s
            r7 = r7 & 8
            if (r7 == 0) goto L50
            int r5 = r5 + 1
            if (r5 != r6) goto L3c
            r1 = r4
            goto L50
        L3c:
            if (r3 != 0) goto L47
            R.e r3 = new R.e
            r6 = 16
            c0.l[] r6 = new c0.AbstractC0724l[r6]
            r3.<init>(r6)
        L47:
            if (r1 == 0) goto L4d
            r3.c(r1)
            r1 = r2
        L4d:
            r3.c(r4)
        L50:
            c0.l r4 = r4.f10105v
            goto L2d
        L53:
            if (r5 != r6) goto L56
            goto L15
        L56:
            c0.l r1 = B0.AbstractC0041g.f(r3)
            goto L15
        L5b:
            int r1 = r0.f10103t
            r1 = r1 & 8
            if (r1 == 0) goto L64
            c0.l r0 = r0.f10105v
            goto Lb
        L64:
            kotlin.jvm.internal.m.b(r2)
            B0.A0 r2 = (B0.A0) r2
            c0.l r2 = (c0.AbstractC0724l) r2
            c0.l r0 = r2.f10100q
            I0.i r1 = r8.u()
            if (r1 != 0) goto L78
            I0.i r1 = new I0.i
            r1.<init>()
        L78:
            I0.m r2 = new I0.m
            r2.<init>(r0, r9, r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0597a.a(B0.L, boolean):I0.m");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object[] b(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        k.G0(0, i, 6, objArr, objArr2);
        k.D0(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object[] c(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        k.G0(0, i, 6, objArr, objArr2);
        k.D0(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object[] d(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        k.G0(0, i, 6, objArr, objArr2);
        k.D0(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(C1548G c1548g, Object obj, Object obj2) {
        int iF = c1548g.f(obj);
        boolean z5 = iF < 0;
        Object obj3 = z5 ? null : c1548g.f16135c[iF];
        if (obj3 != null) {
            if (obj3 instanceof C1549H) {
                ((C1549H) obj3).a(obj2);
            } else if (obj3 != obj2) {
                C1549H c1549h = new C1549H();
                c1549h.a(obj3);
                c1549h.a(obj2);
                obj2 = c1549h;
            }
            obj2 = obj3;
        }
        if (!z5) {
            c1548g.f16135c[iF] = obj2;
            return;
        }
        int i = ~iF;
        c1548g.f16134b[i] = obj;
        c1548g.f16135c[i] = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object f(I4.b bVar, InterfaceC1524c interfaceC1524c) throws Throwable {
        try {
            if (bVar.isDone()) {
                return j.getUninterruptibly(bVar);
            }
            C0247h c0247h = new C0247h(1, AbstractC1397A.v(interfaceC1524c));
            bVar.addListener(new I4.a(24, bVar, c0247h), o.f9378q);
            c0247h.u(new C0029a(27, bVar));
            return c0247h.r();
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause != null) {
                throw cause;
            }
            C1367f c1367f = new C1367f();
            kotlin.jvm.internal.m.i(c1367f, kotlin.jvm.internal.m.class.getName());
            throw c1367f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object g(d dVar) throws InterruptedException {
        boolean z5;
        AbstractC1887A.f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        AbstractC1887A.h(dVar, "Task must not be null");
        S3.k kVar = (S3.k) dVar;
        synchronized (kVar.f7316a) {
            z5 = kVar.f7318c;
        }
        if (z5) {
            return X(dVar);
        }
        k3.d dVar2 = new k3.d(16);
        Executor executor = f.f7308b;
        dVar.a(executor, dVar2);
        S3.k kVar2 = (S3.k) dVar;
        h hVar = new h(executor, (S3.b) dVar2);
        O1 o12 = kVar2.f7317b;
        o12.e(hVar);
        kVar2.i();
        o12.e(new S3.g(executor, dVar2));
        kVar2.i();
        ((CountDownLatch) dVar2.f14122r).await();
        return X(dVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object h(d dVar) throws TimeoutException {
        boolean z5;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC1887A.f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        AbstractC1887A.h(dVar, "Task must not be null");
        AbstractC1887A.h(timeUnit, "TimeUnit must not be null");
        S3.k kVar = (S3.k) dVar;
        synchronized (kVar.f7316a) {
            z5 = kVar.f7318c;
        }
        if (z5) {
            return X(dVar);
        }
        k3.d dVar2 = new k3.d(16);
        Executor executor = f.f7308b;
        dVar.a(executor, dVar2);
        S3.k kVar2 = (S3.k) dVar;
        h hVar = new h(executor, (S3.b) dVar2);
        O1 o12 = kVar2.f7317b;
        o12.e(hVar);
        kVar2.i();
        o12.e(new S3.g(executor, dVar2));
        kVar2.i();
        if (((CountDownLatch) dVar2.f14122r).await(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, timeUnit)) {
            return X(dVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final z i(E e7) {
        kotlin.jvm.internal.m.e(e7, "<this>");
        return new z(e7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final A j(q6.G g7) {
        kotlin.jvm.internal.m.e(g7, "<this>");
        return new A(g7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static X5.g k(String serialName, I1 i12, X5.f[] fVarArr) {
        kotlin.jvm.internal.m.e(serialName, "serialName");
        if (m.U0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (i12.equals(i.f8194c)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        X5.a aVar = new X5.a(serialName);
        return new X5.g(serialName, i12, aVar.f8173b.size(), k.R0(fVarArr), aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean l(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = s.f15299q;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iU = AbstractC0836n2.u(arrayList);
                int i = 0;
                while (i < iU) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    I0.m mVar = (I0.m) obj2;
                    I0.m mVar2 = (I0.m) obj;
                    arrayList2.add(new C1130b((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (mVar2.e().a() >> 32)) - Float.intBitsToFloat((int) (mVar.e().a() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (mVar2.e().a() & 4294967295L)) - Float.intBitsToFloat((int) (mVar.e().a() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((C1130b) l.l0(list)).f13520a;
            } else {
                if (list.isEmpty()) {
                    Y0.a.b("Empty collection can't be reduced.");
                }
                Object objL0 = l.l0(list);
                int iU2 = AbstractC0836n2.u(list);
                if (1 <= iU2) {
                    int i7 = 1;
                    while (true) {
                        objL0 = new C1130b(C1130b.e(((C1130b) objL0).f13520a, ((C1130b) list.get(i7)).f13520a));
                        if (i7 == iU2) {
                            break;
                        }
                        i7++;
                    }
                }
                j = ((C1130b) objL0).f13520a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static S3.k m(Executor executor, Callable callable) {
        AbstractC1887A.h(executor, "Executor must not be null");
        S3.k kVar = new S3.k();
        executor.execute(new I4.a(22, kVar, callable));
        return kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m n(InterfaceC0725m interfaceC0725m, j0.E e7) {
        return androidx.compose.ui.graphics.a.b(interfaceC0725m, 0.0f, e7, true, 124927);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m o(InterfaceC0725m interfaceC0725m) {
        return androidx.compose.ui.graphics.a.b(interfaceC0725m, 0.0f, null, true, 126975);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void p(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1548G q() {
        long[] jArr = O.f16162a;
        return new C1548G();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long r(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j += (long) i;
            i = inputStream.read(bArr);
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean s(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zT = t(file, inputStreamOpenRawResource);
                p(inputStreamOpenRawResource);
                return zT;
            } catch (Throwable th) {
                th = th;
                p(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean t(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    p(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e8) {
            e = e8;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            p(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            p(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final t2.l u(Context context) {
        final t2.e eVar = new t2.e();
        eVar.f16684q = context.getApplicationContext();
        eVar.f16685r = H2.d.f2135a;
        eVar.f16686s = new H2.j();
        Context context2 = (Context) eVar.f16684q;
        c cVar = (c) eVar.f16685r;
        final int i = 0;
        C1376o c1376oD = AbstractC1362a.d(new B5.a() { // from class: t2.d
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B5.a
            public final Object invoke() {
                B2.h cVar2;
                int largeMemoryClass;
                w2.g gVar;
                switch (i) {
                    case 0:
                        Context context3 = (Context) eVar.f16684q;
                        Bitmap.Config[] configArr = H2.f.f2137a;
                        double d5 = 0.2d;
                        try {
                            Object systemService = context3.getSystemService((Class<Object>) ActivityManager.class);
                            kotlin.jvm.internal.m.b(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d5 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        int i7 = 0;
                        B2.g gVar2 = new B2.g(0);
                        if (d5 > 0.0d) {
                            Bitmap.Config[] configArr2 = H2.f.f2137a;
                            try {
                                Object systemService2 = context3.getSystemService((Class<Object>) ActivityManager.class);
                                kotlin.jvm.internal.m.b(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                largeMemoryClass = (context3.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                largeMemoryClass = 256;
                            }
                            double d7 = d5 * ((double) largeMemoryClass);
                            double d8 = 1024;
                            i7 = (int) (d7 * d8 * d8);
                            break;
                        }
                        if (i7 > 0) {
                            C0050o c0050o = new C0050o();
                            c0050o.f499q = gVar2;
                            c0050o.f500r = new B2.e(i7, c0050o);
                            cVar2 = c0050o;
                        } else {
                            cVar2 = new k3.c(gVar2);
                        }
                        return new B2.c(cVar2, gVar2);
                    default:
                        e eVar2 = eVar;
                        H2.l lVar = H2.l.f2155a;
                        Context context4 = (Context) eVar2.f16684q;
                        synchronized (lVar) {
                            try {
                                gVar = H2.l.f2156b;
                                if (gVar == null) {
                                    q6.t tVar = q6.l.f16071q;
                                    T5.e eVar3 = H.f3811a;
                                    T5.d dVar = T5.d.f7468q;
                                    Bitmap.Config[] configArr3 = H2.f.f2137a;
                                    File cacheDir = context4.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File fileQ = AbstractC1902a.Q(cacheDir);
                                    String str = x.f16093r;
                                    x xVarS = D.s(fileQ);
                                    long jR = 10485760;
                                    try {
                                        File file = xVarS.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        jR = D5.a.r((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                        break;
                                    } catch (Exception unused3) {
                                    }
                                    w2.g gVar3 = new w2.g(jR, dVar, tVar, xVarS);
                                    H2.l.f2156b = gVar3;
                                    gVar = gVar3;
                                }
                            } finally {
                            }
                        }
                        return gVar;
                }
            }
        });
        final int i7 = 1;
        C1376o c1376oD2 = AbstractC1362a.d(new B5.a() { // from class: t2.d
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B5.a
            public final Object invoke() {
                B2.h cVar2;
                int largeMemoryClass;
                w2.g gVar;
                switch (i7) {
                    case 0:
                        Context context3 = (Context) eVar.f16684q;
                        Bitmap.Config[] configArr = H2.f.f2137a;
                        double d5 = 0.2d;
                        try {
                            Object systemService = context3.getSystemService((Class<Object>) ActivityManager.class);
                            kotlin.jvm.internal.m.b(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d5 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        int i72 = 0;
                        B2.g gVar2 = new B2.g(0);
                        if (d5 > 0.0d) {
                            Bitmap.Config[] configArr2 = H2.f.f2137a;
                            try {
                                Object systemService2 = context3.getSystemService((Class<Object>) ActivityManager.class);
                                kotlin.jvm.internal.m.b(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                largeMemoryClass = (context3.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                largeMemoryClass = 256;
                            }
                            double d7 = d5 * ((double) largeMemoryClass);
                            double d8 = 1024;
                            i72 = (int) (d7 * d8 * d8);
                            break;
                        }
                        if (i72 > 0) {
                            C0050o c0050o = new C0050o();
                            c0050o.f499q = gVar2;
                            c0050o.f500r = new B2.e(i72, c0050o);
                            cVar2 = c0050o;
                        } else {
                            cVar2 = new k3.c(gVar2);
                        }
                        return new B2.c(cVar2, gVar2);
                    default:
                        e eVar2 = eVar;
                        H2.l lVar = H2.l.f2155a;
                        Context context4 = (Context) eVar2.f16684q;
                        synchronized (lVar) {
                            try {
                                gVar = H2.l.f2156b;
                                if (gVar == null) {
                                    q6.t tVar = q6.l.f16071q;
                                    T5.e eVar3 = H.f3811a;
                                    T5.d dVar = T5.d.f7468q;
                                    Bitmap.Config[] configArr3 = H2.f.f2137a;
                                    File cacheDir = context4.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File fileQ = AbstractC1902a.Q(cacheDir);
                                    String str = x.f16093r;
                                    x xVarS = D.s(fileQ);
                                    long jR = 10485760;
                                    try {
                                        File file = xVarS.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        jR = D5.a.r((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                        break;
                                    } catch (Exception unused3) {
                                    }
                                    w2.g gVar3 = new w2.g(jR, dVar, tVar, xVarS);
                                    H2.l.f2156b = gVar3;
                                    gVar = gVar3;
                                }
                            } finally {
                            }
                        }
                        return gVar;
                }
            }
        });
        C1376o c1376oD3 = AbstractC1362a.d(new C0433b2(26));
        s sVar = s.f15299q;
        return new t2.l(context2, cVar, c1376oD, c1376oD2, c1376oD3, new C1617b(sVar, sVar, sVar, sVar, sVar), (H2.j) eVar.f16686s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        if (r7 == 16) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
    
        if (r8 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d1, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress v(java.lang.String r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = 0
            r5 = -1
            r6 = r18
            r7 = r4
            r8 = r5
            r9 = r8
        Lf:
            if (r6 >= r1) goto Lcb
            if (r7 != r2) goto L15
            goto Lcf
        L15:
            int r10 = r6 + 2
            r11 = 255(0xff, float:3.57E-43)
            if (r10 > r1) goto L31
            java.lang.String r12 = "::"
            boolean r12 = J5.t.F0(r0, r12, r6, r4)
            if (r12 == 0) goto L31
            if (r8 == r5) goto L27
            goto Lcf
        L27:
            int r7 = r7 + 2
            r8 = r7
            if (r10 != r1) goto L2e
            goto Lcb
        L2e:
            r9 = r10
            goto L9e
        L31:
            if (r7 == 0) goto L3d
            java.lang.String r10 = ":"
            boolean r10 = J5.t.F0(r0, r10, r6, r4)
            if (r10 == 0) goto L40
            int r6 = r6 + 1
        L3d:
            r9 = r6
            goto L9e
        L40:
            java.lang.String r10 = "."
            boolean r6 = J5.t.F0(r0, r10, r6, r4)
            if (r6 == 0) goto Lcf
            int r6 = r7 + (-2)
            r10 = r6
        L4b:
            if (r9 >= r1) goto L97
            if (r10 != r2) goto L51
            goto Lcf
        L51:
            if (r10 == r6) goto L5f
            char r12 = r0.charAt(r9)
            r13 = 46
            if (r12 == r13) goto L5d
            goto Lcf
        L5d:
            int r9 = r9 + 1
        L5f:
            r13 = r4
            r12 = r9
        L61:
            if (r12 >= r1) goto L8a
            char r14 = r0.charAt(r12)
            r15 = 48
            int r16 = kotlin.jvm.internal.m.f(r14, r15)
            if (r16 < 0) goto L8a
            r18 = r15
            r15 = 57
            int r15 = kotlin.jvm.internal.m.f(r14, r15)
            if (r15 <= 0) goto L7a
            goto L8a
        L7a:
            if (r13 != 0) goto L7f
            if (r9 == r12) goto L7f
            goto Lcf
        L7f:
            int r13 = r13 * 10
            int r13 = r13 + r14
            int r13 = r13 + (-48)
            if (r13 <= r11) goto L87
            goto Lcf
        L87:
            int r12 = r12 + 1
            goto L61
        L8a:
            int r9 = r12 - r9
            if (r9 != 0) goto L8f
            goto Lcf
        L8f:
            int r9 = r10 + 1
            byte r13 = (byte) r13
            r3[r10] = r13
            r10 = r9
            r9 = r12
            goto L4b
        L97:
            int r0 = r7 + 2
            if (r10 != r0) goto Lcf
            int r7 = r7 + 2
            goto Lcb
        L9e:
            r10 = r4
            r6 = r9
        La0:
            if (r6 >= r1) goto Lb2
            char r12 = r0.charAt(r6)
            int r12 = e6.b.o(r12)
            if (r12 == r5) goto Lb2
            int r10 = r10 << 4
            int r10 = r10 + r12
            int r6 = r6 + 1
            goto La0
        Lb2:
            int r12 = r6 - r9
            if (r12 == 0) goto Lcf
            r13 = 4
            if (r12 <= r13) goto Lba
            goto Lcf
        Lba:
            int r12 = r7 + 1
            int r13 = r10 >>> 8
            r11 = r11 & r13
            byte r11 = (byte) r11
            r3[r7] = r11
            int r7 = r7 + 2
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r3[r12] = r10
            goto Lf
        Lcb:
            if (r7 == r2) goto Ldd
            if (r8 != r5) goto Ld1
        Lcf:
            r0 = 0
            return r0
        Ld1:
            int r0 = r7 - r8
            int r1 = 16 - r0
            java.lang.System.arraycopy(r3, r8, r3, r1, r0)
            int r2 = r2 - r7
            int r2 = r2 + r8
            java.util.Arrays.fill(r3, r8, r2, r4)
        Ldd:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0597a.v(java.lang.String, int, int):java.net.InetAddress");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long w(int i, int i7, int i8, int i9) {
        int i10 = 262142;
        int iMin = Math.min(i8, 262142);
        int iMin2 = i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i9, 262142);
        int i11 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i11 >= 8191) {
            if (i11 < 32767) {
                i10 = 65534;
            } else if (i11 < 65535) {
                i10 = 32766;
            } else {
                if (i11 >= 262143) {
                    W0.b.j(i11);
                    throw new C2.e();
                }
                i10 = 8190;
            }
        }
        return W0.b.a(Math.min(i10, i), i7 != Integer.MAX_VALUE ? Math.min(i10, i7) : Integer.MAX_VALUE, iMin, iMin2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long x(int i, int i7, int i8, int i9) {
        int i10 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i7, 262142);
        int i11 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i11 >= 8191) {
            if (i11 < 32767) {
                i10 = 65534;
            } else if (i11 < 65535) {
                i10 = 32766;
            } else {
                if (i11 >= 262143) {
                    W0.b.j(i11);
                    throw new C2.e();
                }
                i10 = 8190;
            }
        }
        return W0.b.a(iMin, iMin2, Math.min(i10, i8), i9 != Integer.MAX_VALUE ? Math.min(i10, i9) : Integer.MAX_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int y(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8);
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C0158l z(E.A a7, int i, long j, F.x xVar, long j7, EnumC1778d0 enumC1778d0, C0715c c0715c, C0716d c0716d, W0.l lVar, boolean z5, int i7) {
        return new C0158l(i, i7, a7.a(i, j), j7, xVar.b(i), enumC1778d0, c0715c, c0716d, lVar, z5);
    }
}
