package k3;

import B0.AbstractC0041g;
import B0.C0050o;
import B0.F0;
import B0.L;
import B2.g;
import D2.j;
import D2.r;
import G1.i;
import I2.n;
import J1.AbstractComponentCallbacksC0185q;
import J1.C0188u;
import J1.E;
import J1.H;
import J1.T;
import M.AbstractC0229q;
import M.C0230s;
import M.r0;
import M.t0;
import M2.k;
import O3.B0;
import O3.C0300l0;
import O3.C0323t0;
import O3.EnumC0287h;
import O3.I0;
import O3.T1;
import O3.V;
import O3.X;
import O3.X1;
import P2.f;
import a3.D;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillManager;
import android.widget.EditText;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabaseVersions;
import b2.InterfaceC0692c;
import com.google.android.gms.internal.clearcut.m0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d2.AbstractC0960G;
import d2.C0961H;
import d2.f0;
import d4.InterfaceC1004a;
import e.C1008a;
import e.InterfaceC1009b;
import j0.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.m;
import m5.C1371j;
import n5.t;
import n5.x;
import r1.InterfaceC1573a;
import t2.C1618c;
import t2.l;
import v2.EnumC1757e;
import w1.AbstractC1835K;
import x1.o;
import y0.AbstractC1904a;
import z2.InterfaceC1963b;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC1009b, InterfaceC1573a, p, X1, f, S3.c, S3.b, o, InterfaceC0692c, f0, InterfaceC1004a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14121q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f14122r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ d(int i, Object obj) {
        this.f14121q = i;
        this.f14122r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int A(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i7 = 0;
        while (i7 < length && charSequence.charAt(i7) < 128) {
            i7++;
        }
        int i8 = length;
        while (true) {
            if (i7 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i7);
            if (cCharAt < 2048) {
                i8 += (127 - cCharAt) >>> 31;
                i7++;
            } else {
                int length2 = charSequence.length();
                while (i7 < length2) {
                    char cCharAt2 = charSequence.charAt(i7);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i7) < 65536) {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i7);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            i7++;
                        }
                    }
                    i7++;
                }
                i8 += i;
            }
        }
        if (i8 >= length) {
            return i8;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i8) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int G(int i, String str) {
        int iN = N(i);
        int iA = A(str);
        return O(iA) + iA + iN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void K(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        char cCharAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c7 = 57343;
        int i7 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i7 < length) {
                char cCharAt2 = charSequence.charAt(i7);
                int i8 = cCharAt2;
                if (cCharAt2 < 128) {
                    byteBuffer.put((byte) i8);
                } else if (cCharAt2 < 2048) {
                    byteBuffer.put((byte) ((cCharAt2 >>> 6) | 960));
                    i8 = (cCharAt2 & '?') | 128;
                    byteBuffer.put((byte) i8);
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i9 = i7 + 1;
                        if (i9 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint & 63) | 128));
                                i7 = i9;
                            } else {
                                i7 = i9;
                            }
                        }
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("Unpaired surrogate at index ");
                        sb.append(i7 - 1);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    byteBuffer.put((byte) ((cCharAt2 >>> '\f') | 480));
                    byteBuffer.put((byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put((byte) ((cCharAt2 & '?') | 128));
                }
                i7++;
            }
            return;
        }
        try {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int iRemaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i10 = iRemaining + iArrayOffset;
            while (i7 < length2) {
                int i11 = i7 + iArrayOffset;
                if (i11 >= i10 || (cCharAt = charSequence.charAt(i7)) >= 128) {
                    break;
                }
                bArrArray[i11] = (byte) cCharAt;
                i7++;
            }
            if (i7 == length2) {
                i = iArrayOffset + length2;
            } else {
                i = iArrayOffset + i7;
                while (i7 < length2) {
                    char cCharAt4 = charSequence.charAt(i7);
                    if (cCharAt4 < 128 && i < i10) {
                        bArrArray[i] = (byte) cCharAt4;
                        i++;
                    } else if (cCharAt4 < 2048 && i <= i10 - 2) {
                        int i12 = i + 1;
                        bArrArray[i] = (byte) ((cCharAt4 >>> 6) | 960);
                        i += 2;
                        bArrArray[i12] = (byte) ((cCharAt4 & '?') | 128);
                    } else {
                        if ((cCharAt4 >= 55296 && c7 >= cCharAt4) || i > i10 - 3) {
                            if (i > i10 - 4) {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(cCharAt4);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            int i13 = i7 + 1;
                            if (i13 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i13);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i] = (byte) ((codePoint2 >>> 18) | 240);
                                    bArrArray[i + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i14 = i + 3;
                                    bArrArray[i + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i += 4;
                                    bArrArray[i14] = (byte) ((codePoint2 & 63) | 128);
                                    i7 = i13;
                                } else {
                                    i7 = i13;
                                }
                            }
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unpaired surrogate at index ");
                            sb3.append(i7 - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        bArrArray[i] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i15 = i + 2;
                        bArrArray[i + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i += 3;
                        bArrArray[i15] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i7++;
                    c7 = 57343;
                }
            }
            byteBuffer.position(i - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e7) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e7);
            throw bufferOverflowException;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int M(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int N(int i) {
        return O(i << 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int O(int i) {
        if ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Integer r(d dVar, TypedArray typedArray, int i) {
        dVar.getClass();
        int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
        Integer numValueOf = Integer.valueOf(dimensionPixelSize);
        if (dimensionPixelSize != -1) {
            return numValueOf;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static r w(k kVar, j jVar, B2.a aVar, B2.b bVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(jVar.f1396a.getResources(), bVar.f537a);
        Map map = bVar.f538b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z5 = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = H2.f.f2137a;
        if (kVar != null && kVar.f3797c) {
            z5 = true;
        }
        return new r(bitmapDrawable, jVar, EnumC1757e.f17524q, aVar, str, zBooleanValue, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void B(int i, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f14122r;
        H(i, 2);
        try {
            int iO = O(str.length());
            if (iO != O(str.length() * 3)) {
                F(A(str));
                K(str, byteBuffer);
                return;
            }
            int iPosition = byteBuffer.position();
            if (byteBuffer.remaining() < iO) {
                throw new m0(iPosition + iO, byteBuffer.limit());
            }
            byteBuffer.position(iPosition + iO);
            K(str, byteBuffer);
            int iPosition2 = byteBuffer.position();
            byteBuffer.position(iPosition);
            F((iPosition2 - iPosition) - iO);
            byteBuffer.position(iPosition2);
        } catch (BufferOverflowException e7) {
            m0 m0Var = new m0(byteBuffer.position(), byteBuffer.limit());
            m0Var.initCause(e7);
            throw m0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void C(int i, String str, List list, boolean z5, boolean z6) {
        V v6;
        C0300l0 c0300l0 = (C0300l0) this.f14122r;
        int i7 = i - 1;
        if (i7 == 0) {
            X x6 = ((C0323t0) c0300l0.f4346r).f5077v;
            C0323t0.l(x6);
            v6 = x6.f4665D;
        } else if (i7 != 1) {
            if (i7 == 3) {
                X x7 = ((C0323t0) c0300l0.f4346r).f5077v;
                C0323t0.l(x7);
                v6 = x7.f4666E;
            } else if (i7 != 4) {
                X x8 = ((C0323t0) c0300l0.f4346r).f5077v;
                C0323t0.l(x8);
                v6 = x8.f4664C;
            } else if (z5) {
                X x9 = ((C0323t0) c0300l0.f4346r).f5077v;
                C0323t0.l(x9);
                v6 = x9.f4662A;
            } else if (z6) {
                X x10 = ((C0323t0) c0300l0.f4346r).f5077v;
                C0323t0.l(x10);
                v6 = x10.f4673z;
            } else {
                X x11 = ((C0323t0) c0300l0.f4346r).f5077v;
                C0323t0.l(x11);
                v6 = x11.f4663B;
            }
        } else if (z5) {
            X x12 = ((C0323t0) c0300l0.f4346r).f5077v;
            C0323t0.l(x12);
            v6 = x12.f4671x;
        } else if (z6) {
            X x13 = ((C0323t0) c0300l0.f4346r).f5077v;
            C0323t0.l(x13);
            v6 = x13.f4670w;
        } else {
            X x14 = ((C0323t0) c0300l0.f4346r).f5077v;
            C0323t0.l(x14);
            v6 = x14.f4672y;
        }
        int size = list.size();
        if (size == 1) {
            v6.c(list.get(0), str);
            return;
        }
        if (size == 2) {
            v6.d(list.get(0), list.get(1), str);
        } else if (size != 3) {
            v6.b(str);
        } else {
            v6.e(str, list.get(0), list.get(1), list.get(2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void D(int i, byte[] bArr) {
        H(i, 2);
        F(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f14122r;
        if (byteBuffer.remaining() < length) {
            throw new m0(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void E(int i) throws m0 {
        byte b7 = (byte) i;
        ByteBuffer byteBuffer = (ByteBuffer) this.f14122r;
        if (!byteBuffer.hasRemaining()) {
            throw new m0(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void F(int i) {
        while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            E((i & 127) | 128);
            i >>>= 7;
        }
        E(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void H(int i, int i7) {
        F((i << 3) | i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I(O3.I0 r2, int r3) {
        /*
            r1 = this;
            r0 = -30
            if (r3 == r0) goto L1e
            r0 = -20
            if (r3 == r0) goto L1b
            r0 = -10
            if (r3 == r0) goto L18
            if (r3 == 0) goto L1b
            r0 = 30
            if (r3 == r0) goto L15
            O3.h r3 = O3.EnumC0287h.UNSET
            goto L20
        L15:
            O3.h r3 = O3.EnumC0287h.INITIALIZATION
            goto L20
        L18:
            O3.h r3 = O3.EnumC0287h.MANIFEST
            goto L20
        L1b:
            O3.h r3 = O3.EnumC0287h.API
            goto L20
        L1e:
            O3.h r3 = O3.EnumC0287h.TCF
        L20:
            java.lang.Object r0 = r1.f14122r
            java.util.EnumMap r0 = (java.util.EnumMap) r0
            r0.put(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.d.I(O3.I0, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void J(I0 i02, EnumC0287h enumC0287h) {
        ((EnumMap) this.f14122r).put(i02, enumC0287h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void L(long j) {
        while (((-128) & j) != 0) {
            E((((int) j) & 127) | 128);
            j >>>= 7;
        }
        E((int) j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x1.o
    public boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f14122r;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        boolean z5 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f11359d;
        view.offsetLeftAndRight((!(i == 0 && z5) && (i != 1 || z5)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.p
    public long b() {
        C0230s c0230s = (C0230s) this.f14122r;
        long jB = c0230s.f3613J.b();
        if (jB != 16) {
            return jB;
        }
        r0 r0Var = (r0) AbstractC0041g.i(c0230s, t0.f3619b);
        if (r0Var != null) {
            long j = r0Var.f3609a;
            if (j != 16) {
                return j;
            }
        }
        return ((j0.o) AbstractC0041g.i(c0230s, AbstractC0229q.f3601a)).f13724a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P2.f
    public long c() {
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e.InterfaceC1009b
    public void d(Object obj) {
        C1008a c1008a = (C1008a) obj;
        H h4 = (H) this.f14122r;
        E e7 = (E) h4.f2514C.pollFirst();
        if (e7 == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = e7.f2508q;
        int i = e7.f2509r;
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185qH = h4.f2527c.h(str);
        if (abstractComponentCallbacksC0185qH != null) {
            abstractComponentCallbacksC0185qH.q(i, c1008a.f12454q, c1008a.f12455r);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P2.f
    public boolean e(P2.a aVar) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.f0
    public int f() {
        AbstractC0960G abstractC0960G = (AbstractC0960G) this.f14122r;
        return abstractC0960G.f11987n - abstractC0960G.F();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.c
    public void g(Object obj) {
        ((CountDownLatch) this.f14122r).countDown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.f0
    public int h(View view) {
        return (view.getLeft() - ((C0961H) view.getLayoutParams()).f11990b.left) - ((ViewGroup.MarginLayoutParams) ((C0961H) view.getLayoutParams())).leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P2.f
    public P2.b i(P2.a aVar) {
        return null;
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
        ((ProfileInstallReceiver) this.f14122r).setResultCode(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.f0
    public View l(int i) {
        return ((AbstractC0960G) this.f14122r).u(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P2.f
    public void m(P2.a aVar, n nVar, Map map, long j) {
        ((g) this.f14122r).d(aVar, nVar, map, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.f0
    public int n() {
        return ((AbstractC0960G) this.f14122r).E();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.f0
    public int o(View view) {
        return view.getRight() + ((C0961H) view.getLayoutParams()).f11990b.right + ((ViewGroup.MarginLayoutParams) ((C0961H) view.getLayoutParams())).rightMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // r1.InterfaceC1573a
    public void onCancel() {
        ((T) this.f14122r).a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.b
    public void q(Exception exc) {
        ((CountDownLatch) this.f14122r).countDown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void s(L l7) {
        if (!l7.F()) {
            AbstractC1904a.b("DepthSortedSet.add called on an unattached node");
        }
        ((F0) this.f14122r).add(l7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D t(Context context, String str, InputStream inputStream, String str2, String str3) {
        D dH;
        EnumC1187b enumC1187b;
        c cVar = (c) this.f14122r;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            n3.c.a();
            EnumC1187b enumC1187b2 = EnumC1187b.ZIP;
            dH = str3 != null ? a3.o.h(context, new ZipInputStream(new FileInputStream(cVar.s(str, inputStream, enumC1187b2))), str) : a3.o.h(context, new ZipInputStream(inputStream), null);
            enumC1187b = enumC1187b2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            n3.c.a();
            enumC1187b = EnumC1187b.GZIP;
            dH = str3 != null ? a3.o.d(new GZIPInputStream(new FileInputStream(cVar.s(str, inputStream, enumC1187b))), str) : a3.o.d(new GZIPInputStream(inputStream), null);
        } else {
            n3.c.a();
            enumC1187b = EnumC1187b.JSON;
            dH = str3 != null ? a3.o.d(new FileInputStream(cVar.s(str, inputStream, enumC1187b).getAbsolutePath()), str) : a3.o.d(inputStream, null);
        }
        if (str3 != null && dH.f8793a != null) {
            File file = new File(cVar.q(), c.d(str, enumC1187b, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            n3.c.a();
            if (!zRenameTo) {
                n3.c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return dH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f14121q) {
            case 1:
                return ((F0) this.f14122r).toString();
            case 10:
                StringBuilder sb = new StringBuilder("1");
                for (I0 i02 : I0.values()) {
                    EnumC0287h enumC0287h = (EnumC0287h) ((EnumMap) this.f14122r).get(i02);
                    if (enumC0287h == null) {
                        enumC0287h = EnumC0287h.UNSET;
                    }
                    sb.append(enumC0287h.f4875q);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        if (r7 != false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public B2.b u(D2.j r18, B2.a r19, E2.h r20, E2.g r21) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            D2.b r3 = r0.f1407o
            boolean r3 = r3.f1363q
            r4 = 0
            if (r3 != 0) goto L11
            r3 = r17
            goto L150
        L11:
            r3 = r17
            java.lang.Object r5 = r3.f14122r
            t2.l r5 = (t2.l) r5
            m5.o r5 = r5.f16716c
            java.lang.Object r5 = r5.getValue()
            B2.c r5 = (B2.c) r5
            if (r5 == 0) goto L74
            B2.h r6 = r5.f539a
            B2.b r6 = r6.g(r1)
            if (r6 != 0) goto L75
            B2.g r5 = r5.f540b
            monitor-enter(r5)
            java.util.LinkedHashMap r6 = r5.f549a     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r6.get(r1)     // Catch: java.lang.Throwable -> L59
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L59
            r7 = 0
            if (r6 != 0) goto L3a
            monitor-exit(r5)
        L38:
            r6 = r7
            goto L75
        L3a:
            int r8 = r6.size()     // Catch: java.lang.Throwable -> L59
            r9 = 0
        L3f:
            if (r9 >= r8) goto L63
            java.lang.Object r10 = r6.get(r9)     // Catch: java.lang.Throwable -> L59
            B2.f r10 = (B2.f) r10     // Catch: java.lang.Throwable -> L59
            java.lang.ref.WeakReference r11 = r10.f546b     // Catch: java.lang.Throwable -> L59
            java.lang.Object r11 = r11.get()     // Catch: java.lang.Throwable -> L59
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11     // Catch: java.lang.Throwable -> L59
            if (r11 == 0) goto L5b
            B2.b r12 = new B2.b     // Catch: java.lang.Throwable -> L59
            java.util.Map r10 = r10.f547c     // Catch: java.lang.Throwable -> L59
            r12.<init>(r11, r10)     // Catch: java.lang.Throwable -> L59
            goto L5c
        L59:
            r0 = move-exception
            goto L72
        L5b:
            r12 = r7
        L5c:
            if (r12 == 0) goto L60
            r7 = r12
            goto L63
        L60:
            int r9 = r9 + 1
            goto L3f
        L63:
            int r6 = r5.f550b     // Catch: java.lang.Throwable -> L59
            int r8 = r6 + 1
            r5.f550b = r8     // Catch: java.lang.Throwable -> L59
            r8 = 10
            if (r6 < r8) goto L70
            r5.a()     // Catch: java.lang.Throwable -> L59
        L70:
            monitor-exit(r5)
            goto L38
        L72:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L59
            throw r0
        L74:
            r6 = r4
        L75:
            if (r6 == 0) goto L150
            android.graphics.Bitmap r5 = r6.f537a
            android.graphics.Bitmap$Config r7 = r5.getConfig()
            if (r7 != 0) goto L81
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
        L81:
            boolean r7 = B0.G0.J(r0, r7)
            if (r7 != 0) goto L8a
        L87:
            r8 = 0
            goto L14d
        L8a:
            java.util.Map r7 = r6.f538b
            java.lang.String r9 = "coil#is_sampled"
            java.lang.Object r7 = r7.get(r9)
            boolean r9 = r7 instanceof java.lang.Boolean
            if (r9 == 0) goto L99
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            goto L9a
        L99:
            r7 = r4
        L9a:
            if (r7 == 0) goto La1
            boolean r7 = r7.booleanValue()
            goto La2
        La1:
            r7 = 0
        La2:
            E2.h r9 = E2.h.f1687c
            boolean r9 = kotlin.jvm.internal.m.a(r2, r9)
            if (r9 == 0) goto Lb1
            if (r7 == 0) goto Lae
            goto L14a
        Lae:
            r9 = 1
            goto L14c
        Lb1:
            java.util.Map r1 = r1.f536r
            java.lang.String r9 = "coil#transformation_size"
            java.lang.Object r1 = r1.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lc7
            java.lang.String r0 = r2.toString()
            boolean r8 = r1.equals(r0)
            goto L14d
        Lc7:
            int r1 = r5.getWidth()
            int r5 = r5.getHeight()
            C3.a r9 = r2.f1688a
            boolean r11 = r9 instanceof E2.a
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r11 == 0) goto Ldd
            E2.a r9 = (E2.a) r9
            int r9 = r9.f1676t
            goto Lde
        Ldd:
            r9 = r12
        Lde:
            C3.a r2 = r2.f1689b
            boolean r11 = r2 instanceof E2.a
            if (r11 == 0) goto Leb
            E2.a r2 = (E2.a) r2
            int r2 = r2.f1676t
        Le8:
            r11 = r21
            goto Led
        Leb:
            r2 = r12
            goto Le8
        Led:
            double r13 = Q2.g.p(r1, r5, r9, r2, r11)
            boolean r0 = H2.d.a(r0)
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 == 0) goto L11f
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 <= 0) goto Lff
            r11 = r15
            goto L100
        Lff:
            r11 = r13
        L100:
            double r8 = (double) r9
            r18 = r11
            double r10 = (double) r1
            double r11 = r18 * r10
            double r8 = r8 - r11
            double r8 = java.lang.Math.abs(r8)
            int r1 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r1 <= 0) goto Lae
            double r1 = (double) r2
            double r8 = (double) r5
            double r11 = r18 * r8
            double r1 = r1 - r11
            double r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 > 0) goto L11d
            goto Lae
        L11d:
            r9 = 1
            goto L13c
        L11f:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r8) goto L125
            if (r9 != r12) goto L127
        L125:
            r9 = 1
            goto L12f
        L127:
            int r9 = r9 - r1
            int r1 = java.lang.Math.abs(r9)
            r9 = 1
            if (r1 > r9) goto L13c
        L12f:
            if (r2 == r8) goto L14c
            if (r2 != r12) goto L134
            goto L14c
        L134:
            int r2 = r2 - r5
            int r1 = java.lang.Math.abs(r2)
            if (r1 > r9) goto L13c
            goto L14c
        L13c:
            int r1 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r1 != 0) goto L141
            goto L144
        L141:
            if (r0 != 0) goto L144
            goto L14a
        L144:
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L14c
            if (r7 == 0) goto L14c
        L14a:
            goto L87
        L14c:
            r8 = r9
        L14d:
            if (r8 == 0) goto L150
            return r6
        L150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.d.u(D2.j, B2.a, E2.h, E2.g):B2.b");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B2.a v(j jVar, Object obj, D2.n nVar, C1618c c1618c) {
        String strA;
        Map linkedHashMap;
        jVar.getClass();
        List list = jVar.f1401g;
        List list2 = ((l) this.f14122r).f16719g.f16678c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                strA = null;
                break;
            }
            C1371j c1371j = (C1371j) list2.get(i);
            InterfaceC1963b interfaceC1963b = (InterfaceC1963b) c1371j.f15080q;
            if (((Class) c1371j.f15081r).isAssignableFrom(obj.getClass())) {
                m.c(interfaceC1963b, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                strA = interfaceC1963b.a(obj, nVar);
                if (strA != null) {
                    break;
                }
            }
            i++;
        }
        if (strA == null) {
            return null;
        }
        Map map = jVar.f1417y.f1435q;
        boolean zIsEmpty = map.isEmpty();
        t tVar = t.f15300q;
        if (zIsEmpty) {
            linkedHashMap = tVar;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
        }
        if (list.isEmpty() && linkedHashMap.isEmpty()) {
            return new B2.a(strA, tVar);
        }
        LinkedHashMap linkedHashMapP = x.P(linkedHashMap);
        List list3 = list;
        if (!list3.isEmpty()) {
            if (list3.size() > 0) {
                list.get(0).getClass();
                throw new ClassCastException();
            }
            linkedHashMapP.put("coil#transformation_size", nVar.f1424d.toString());
        }
        return new B2.a(strA, linkedHashMapP);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void x() {
        ((C0188u) this.f14122r).f2737w.L();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void y(View view, int i, boolean z5) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f14122r).notifyViewVisibilityChanged(view, i, z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean z(L l7) {
        if (!l7.F()) {
            AbstractC1904a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((F0) this.f14122r).remove(l7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.X1
    public void zza(String str, String str2, Bundle bundle) {
        T1 t12 = (T1) this.f14122r;
        if (!TextUtils.isEmpty(str)) {
            t12.c().x(new B0(this, str, str2, bundle));
            return;
        }
        C0323t0 c0323t0 = t12.f4582B;
        if (c0323t0 != null) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.c(str2, "AppId not known when logging event");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f14121q = i;
        this.f14122r = obj;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.web2native.MainActivity.onCreate(android.os.Bundle):void, g0.c.a(B5.c):k3.d] */
    public /* synthetic */ d(int i, boolean z5) {
        this.f14121q = i;
    }

    public d(int i, byte[] bArr) {
        this.f14121q = 22;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
        this.f14122r = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public d(EnumMap enumMap) {
        this.f14121q = 10;
        EnumMap enumMap2 = new EnumMap(I0.class);
        this.f14122r = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public d(Resources resources, Resources.Theme theme, TypedArray typedArray) {
        this.f14121q = 9;
        this.f14122r = typedArray;
    }

    public d(Z.c cVar) {
        this.f14121q = 17;
        this.f14122r = new WeakReference(cVar);
    }

    public d(int i) {
        this.f14121q = i;
        switch (i) {
            case 10:
                this.f14122r = new EnumMap(I0.class);
                break;
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                this.f14122r = new CountDownLatch(1);
                break;
            case 20:
                this.f14122r = new HashSet();
                break;
            case 29:
                this.f14122r = new LinkedHashSet();
                break;
            default:
                this.f14122r = new F0(AbstractC0041g.f428b);
                break;
        }
    }

    public d(EditText editText) {
        this.f14121q = 4;
        C0050o c0050o = new C0050o();
        c0050o.f499q = editText;
        i iVar = new i(editText);
        c0050o.f500r = iVar;
        editText.addTextChangedListener(iVar);
        if (G1.a.f1978b == null) {
            synchronized (G1.a.f1977a) {
                try {
                    if (G1.a.f1978b == null) {
                        G1.a aVar = new G1.a();
                        try {
                            G1.a.f1979c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, G1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        G1.a.f1978b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(G1.a.f1978b);
        this.f14122r = c0050o;
    }

    @Override // P2.f
    public void clear() {
    }

    @Override // P2.f
    public void p(long j) {
    }
}
