package O3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import androidx.lifecycle.InterfaceC0648k;
import b2.InterfaceC0692c;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.C0772a4;
import com.google.android.gms.internal.measurement.C0822k3;
import com.google.android.gms.internal.measurement.C0827l3;
import com.google.android.gms.internal.measurement.C0837n3;
import com.google.android.gms.internal.measurement.C0881w3;
import com.google.android.gms.internal.measurement.C3;
import com.google.android.gms.internal.measurement.R3;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.p4;
import d3.InterfaceC1002b;
import j0.AbstractC1145B;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import k3.C1186a;
import l.MenuC1209l;
import o3.C1415a;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import q5.InterfaceC1528g;
import q6.C1535d;
import q6.C1538g;
import q6.C1541j;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class D implements InterfaceC0331w, P1.b, InterfaceC1528g, InterfaceC0692c, InterfaceC1002b, j0.E, l.w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4344q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ D f4335r = new D(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ D f4336s = new D(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ D f4337t = new D(2);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ D f4338u = new D(3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ D f4339v = new D(4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ D f4340w = new D(5);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ D f4341x = new D(6);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ D f4342y = new D(7);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ D f4343z = new D(8);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ D f4334A = new D(9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [B0.G0.<init>(int):void, B0.o.<init>(int):void, L.s.<init>():void, O3.D.<clinit>():void, O3.D.o(android.content.Context, int):O3.D, T1.h.<init>(T1.u, T1.z):void, a3.l.call():java.lang.Object, androidx.appcompat.widget.ActionMenuView.getMenu():android.view.Menu, androidx.lifecycle.X.<clinit>():void, com.web2native.MainActivity.onCreate(android.os.Bundle):void, d3.e.<init>(java.util.List):void, g6.d.<clinit>():void, j0.B.<clinit>():void, n4.c.<clinit>():void] */
    public /* synthetic */ D(int i) {
        this.f4344q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String i(byte[] bArr, byte[][] bArr2, int i) {
        int i7;
        boolean z5;
        int i8;
        int i9;
        byte[] bArr3 = PublicSuffixDatabase.f15467e;
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = (i10 + length) / 2;
            while (i11 > -1 && bArr[i11] != 10) {
                i11--;
            }
            int i12 = i11 + 1;
            int i13 = 1;
            while (true) {
                i7 = i12 + i13;
                if (bArr[i7] == 10) {
                    break;
                }
                i13++;
            }
            int i14 = i7 - i12;
            int i15 = i;
            boolean z6 = false;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (z6) {
                    i8 = 46;
                    z5 = false;
                } else {
                    byte b7 = bArr2[i15][i16];
                    byte[] bArr4 = e6.b.f12673a;
                    int i18 = b7 & 255;
                    z5 = z6;
                    i8 = i18;
                }
                byte b8 = bArr[i12 + i17];
                byte[] bArr5 = e6.b.f12673a;
                i9 = i8 - (b8 & 255);
                if (i9 != 0) {
                    break;
                }
                i17++;
                i16++;
                if (i17 == i14) {
                    break;
                }
                if (bArr2[i15].length != i16) {
                    z6 = z5;
                } else {
                    if (i15 == bArr2.length - 1) {
                        break;
                    }
                    i15++;
                    i16 = -1;
                    z6 = true;
                }
            }
            if (i9 >= 0) {
                if (i9 <= 0) {
                    int i19 = i14 - i17;
                    int length2 = bArr2[i15].length - i16;
                    int length3 = bArr2.length;
                    for (int i20 = i15 + 1; i20 < length3; i20++) {
                        length2 += bArr2[i20].length;
                    }
                    if (length2 >= i19) {
                        if (length2 <= i19) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            kotlin.jvm.internal.m.d(UTF_8, "UTF_8");
                            return new String(bArr, i12, i14, UTF_8);
                        }
                    }
                }
                i10 = i7 + 1;
            }
            length = i11;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void l(C1535d c1535d, long j, boolean z5) {
        C1535d c1535d2;
        ReentrantLock reentrantLock = C1535d.f16055h;
        if (C1535d.f16057l == null) {
            C1535d.f16057l = new C1535d();
            E3.g gVar = new E3.g("Okio Watchdog");
            gVar.setDaemon(true);
            gVar.start();
        }
        long jNanoTime = System.nanoTime();
        if (j != 0 && z5) {
            c1535d.f16059g = Math.min(j, c1535d.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            c1535d.f16059g = j + jNanoTime;
        } else {
            if (!z5) {
                throw new AssertionError();
            }
            c1535d.f16059g = c1535d.c();
        }
        long j7 = c1535d.f16059g - jNanoTime;
        C1535d c1535d3 = C1535d.f16057l;
        kotlin.jvm.internal.m.b(c1535d3);
        while (true) {
            c1535d2 = c1535d3.f;
            if (c1535d2 == null || j7 < c1535d2.f16059g - jNanoTime) {
                break;
            }
            kotlin.jvm.internal.m.b(c1535d2);
            c1535d3 = c1535d2;
        }
        c1535d.f = c1535d2;
        c1535d3.f = c1535d;
        if (c1535d3 == C1535d.f16057l) {
            C1535d.i.signal();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1535d m() throws InterruptedException {
        C1535d c1535d = C1535d.f16057l;
        kotlin.jvm.internal.m.b(c1535d);
        C1535d c1535d2 = c1535d.f;
        if (c1535d2 == null) {
            long jNanoTime = System.nanoTime();
            C1535d.i.await(C1535d.j, TimeUnit.MILLISECONDS);
            C1535d c1535d3 = C1535d.f16057l;
            kotlin.jvm.internal.m.b(c1535d3);
            if (c1535d3.f != null || System.nanoTime() - jNanoTime < C1535d.f16056k) {
                return null;
            }
            return C1535d.f16057l;
        }
        long jNanoTime2 = c1535d2.f16059g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C1535d.i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C1535d c1535d4 = C1535d.f16057l;
        kotlin.jvm.internal.m.b(c1535d4);
        c1535d4.f = c1535d2.f;
        c1535d2.f = null;
        c1535d2.f16058e = 2;
        return c1535d2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static D o(Context context, int i) {
        E3.h.m(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, V3.a.f7987p);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        com.google.android.gms.internal.measurement.I1.Z(context, typedArrayObtainStyledAttributes, 4);
        com.google.android.gms.internal.measurement.I1.Z(context, typedArrayObtainStyledAttributes, 9);
        com.google.android.gms.internal.measurement.I1.Z(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        s4.k.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new s4.a(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        D d5 = new D(19);
        E3.h.n(rect.left);
        E3.h.n(rect.top);
        E3.h.n(rect.right);
        E3.h.n(rect.bottom);
        return d5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static androidx.lifecycle.j0 p(androidx.lifecycle.l0 l0Var, androidx.lifecycle.h0 factory, int i) {
        if ((i & 2) != 0) {
            factory = l0Var instanceof InterfaceC0648k ? ((InterfaceC0648k) l0Var).d() : R1.a.f6695a;
        }
        P1.c extras = l0Var instanceof InterfaceC0648k ? ((InterfaceC0648k) l0Var).e() : P1.a.f5609b;
        kotlin.jvm.internal.m.e(factory, "factory");
        kotlin.jvm.internal.m.e(extras, "extras");
        return new androidx.lifecycle.j0(l0Var.f(), factory, extras);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1186a q(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C1186a(0, httpURLConnection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static q6.x r(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        C1541j c1541j = r6.c.f16369a;
        C1538g c1538g = new C1538g();
        c1538g.i0(str);
        return r6.c.d(c1538g, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static q6.x s(File file) {
        String str = q6.x.f16093r;
        String string = file.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return r(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public float a() {
        return 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public boolean c(float f) {
        throw new IllegalStateException("not implemented");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public float d() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.E
    public AbstractC1145B e(long j, W0.l lVar, W0.c cVar) {
        return new j0.y(AbstractC0836n2.c(0L, j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public C1415a f() {
        throw new IllegalStateException("not implemented");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.w
    public boolean g(MenuC1209l menuC1209l) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public boolean h(float f) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public boolean isEmpty() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b2.InterfaceC0692c
    public void j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b2.InterfaceC0692c
    public void k(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float n(float f, float f7) {
        return 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f4344q) {
            case 22:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0331w
    public Object zza() {
        switch (this.f4344q) {
            case 0:
                List list = F.f4412a;
                Boolean bool = (Boolean) C3.f10614b.b();
                bool.getClass();
                return bool;
            case 1:
                List list2 = F.f4412a;
                Boolean bool2 = (Boolean) p4.f11013a.b();
                bool2.getClass();
                return bool2;
            case 2:
                List list3 = F.f4412a;
                C0827l3.f10898r.get();
                return Integer.valueOf((int) ((Long) C0837n3.f10971m0.b()).longValue());
            case 3:
                List list4 = F.f4412a;
                Y3.f10777r.get();
                Boolean bool3 = (Boolean) C0772a4.f10797h.b();
                bool3.getClass();
                return bool3;
            case 4:
                List list5 = F.f4412a;
                Y3.f10777r.get();
                Boolean bool4 = (Boolean) C0772a4.f10792b.b();
                bool4.getClass();
                return bool4;
            case 5:
                List list6 = F.f4412a;
                Boolean bool5 = (Boolean) C0881w3.f11119b.b();
                bool5.getClass();
                return bool5;
            case 6:
                List list7 = F.f4412a;
                Boolean bool6 = (Boolean) C0822k3.f10888a.b();
                bool6.getClass();
                return bool6;
            case 7:
                List list8 = F.f4412a;
                Boolean bool7 = (Boolean) d4.f10827a.b();
                bool7.getClass();
                return bool7;
            case 8:
                List list9 = F.f4412a;
                C0827l3.f10898r.get();
                Long l7 = (Long) C0837n3.f10949a.b();
                l7.getClass();
                return l7;
            default:
                return new Boolean(((Boolean) R3.f10701a.b()).booleanValue());
        }
    }

    @Override // l.w
    public void b(MenuC1209l menuC1209l, boolean z5) {
    }
}
