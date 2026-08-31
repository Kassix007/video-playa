package com.google.android.gms.internal.measurement;

import O3.C0299l;
import P.C0345b;
import P.C0363k;
import P.C0371o;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.icu.text.DecimalFormatSymbols;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Size;
import android.util.SizeF;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b.C0683A;
import com.wnapp.smspariaz.R;
import h.AbstractActivityC1106h;
import j0.AbstractC1145B;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import k1.AbstractC1176d;
import m.C1292Z;
import m5.C1371j;
import n5.AbstractC1397A;
import u1.C1676c;
import v0.C1733b;
import v0.C1743l;
import w0.C1822a;
import w0.C1824c;
import x3.C1899k;
import y0.AbstractC1904a;
import y3.C1916b;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public abstract class P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile G4.b f10683a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String A(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static E0.a B(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new E0.a(E0.d.b(view));
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long C(k3.c cVar) {
        DragEvent dragEvent = (DragEvent) cVar.f14120q;
        float x6 = dragEvent.getX();
        float y6 = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x6)) << 32) | (((long) Float.floatToRawIntBits(y6)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1676c D(C1292Z c1292z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C1676c(A1.k.k(c1292z));
        }
        TextPaint textPaint = new TextPaint(c1292z.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c1292z.getBreakStrategy();
        int hyphenationFrequency = c1292z.getHyphenationFrequency();
        if (c1292z.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (c1292z.getInputType() & 15) != 3) {
            boolean z5 = c1292z.getLayoutDirection() == 1;
            switch (c1292z.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z5) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(A1.k.c(DecimalFormatSymbols.getInstance(c1292z.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C1676c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Typeface E(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC1397A.n(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d6.l F(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i7 = 0; i7 < length; i7++) {
            String str = strArr2[i7];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i7] = J5.m.n1(str).toString();
        }
        int iV = AbstractC0836n2.v(0, strArr2.length - 1, 2);
        if (iV >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                h(str2);
                k(str3, str2);
                if (i == iV) {
                    break;
                }
                i += 2;
            }
        }
        return new d6.l(strArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void G(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            AbstractC1904a.a("At least one point must be provided");
        }
        int i7 = 2 >= i ? i - 1 : 2;
        int i8 = i7 + 1;
        float[][] fArr4 = new float[i8][];
        for (int i9 = 0; i9 < i8; i9++) {
            fArr4[i9] = new float[i];
        }
        for (int i10 = 0; i10 < i; i10++) {
            fArr4[0][i10] = 1.0f;
            for (int i11 = 1; i11 < i8; i11++) {
                fArr4[i11][i10] = fArr4[i11 - 1][i10] * fArr[i10];
            }
        }
        float[][] fArr5 = new float[i8][];
        for (int i12 = 0; i12 < i8; i12++) {
            fArr5[i12] = new float[i];
        }
        float[][] fArr6 = new float[i8][];
        for (int i13 = 0; i13 < i8; i13++) {
            fArr6[i13] = new float[i8];
        }
        int i14 = 0;
        while (i14 < i8) {
            float[] destination = fArr5[i14];
            float[] fArr7 = fArr4[i14];
            kotlin.jvm.internal.m.e(fArr7, "<this>");
            kotlin.jvm.internal.m.e(destination, "destination");
            System.arraycopy(fArr7, 0, destination, 0, i);
            for (int i15 = 0; i15 < i14; i15++) {
                float[] fArr8 = fArr5[i15];
                float fX = x(destination, fArr8);
                for (int i16 = 0; i16 < i; i16++) {
                    destination[i16] = destination[i16] - (fArr8[i16] * fX);
                }
            }
            float fSqrt = (float) Math.sqrt(x(destination, destination));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i17 = 0; i17 < i; i17++) {
                destination[i17] = destination[i17] * f;
            }
            float[] fArr9 = fArr6[i14];
            int i18 = 0;
            while (i18 < i8) {
                fArr9[i18] = i18 < i14 ? 0.0f : x(destination, fArr4[i18]);
                i18++;
            }
            i14++;
        }
        for (int i19 = i7; -1 < i19; i19--) {
            float fX2 = x(fArr5[i19], fArr2);
            float[] fArr10 = fArr6[i19];
            int i20 = i19 + 1;
            if (i20 <= i7) {
                int i21 = i7;
                while (true) {
                    fX2 -= fArr10[i21] * fArr3[i21];
                    if (i21 != i20) {
                        i21--;
                    }
                }
            }
            fArr3[i19] = fX2 / fArr10[i19];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void H(Bundle bundle, String key, Bundle value) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        bundle.putBundle(key, value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void I(String key, String value, Bundle bundle) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        bundle.putString(key, value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void J(Bundle bundle, String str, List list) {
        List list2 = list;
        bundle.putStringArrayList(str, list2 instanceof ArrayList ? (ArrayList) list2 : new ArrayList<>(list2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean K(Parcel parcel, int i) {
        k0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static IBinder L(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iO);
        return strongBinder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int M(Parcel parcel, int i) {
        k0(parcel, i, 4);
        return parcel.readInt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long N(Parcel parcel, int i) {
        k0(parcel, i, 8);
        return parcel.readLong();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int O(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object P(Object[] objArr, Z.l lVar, B5.a aVar, C0371o c0371o, int i, int i7) {
        Object[] objArr2;
        Object obj;
        Object objC;
        if ((i7 & 2) != 0) {
            lVar = Z.n.f8314a;
        }
        Z.l lVar2 = lVar;
        int i8 = c0371o.f5454P;
        I1.M(36);
        String string = Integer.toString(i8, 36);
        kotlin.jvm.internal.m.d(string, "toString(...)");
        kotlin.jvm.internal.m.c(lVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        Z.i iVar = (Z.i) c0371o.k(Z.k.f8310a);
        Object objH = c0371o.H();
        Object obj2 = C0363k.f5418a;
        if (objH == obj2) {
            Object objD = (iVar == null || (objC = iVar.c(string)) == null) ? null : lVar2.d(objC);
            if (objD == null) {
                objD = aVar.invoke();
            }
            objArr2 = objArr;
            Object bVar = new Z.b(lVar2, iVar, string, objD, objArr2);
            c0371o.d0(bVar);
            objH = bVar;
        } else {
            objArr2 = objArr;
        }
        Z.b bVar2 = (Z.b) objH;
        Object objInvoke = Arrays.equals(objArr2, bVar2.f8290u) ? bVar2.f8289t : null;
        if (objInvoke == null) {
            objInvoke = aVar.invoke();
        }
        boolean zI = c0371o.i(bVar2) | c0371o.i(lVar2) | c0371o.i(iVar) | c0371o.g(string) | c0371o.i(objInvoke) | c0371o.i(objArr2);
        Object objH2 = c0371o.H();
        if (zI || objH2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object aVar2 = new Z.a(bVar2, lVar2, iVar, string, obj, objArr3);
            c0371o.d0(aVar2);
            objH2 = aVar2;
        } else {
            obj = objInvoke;
        }
        C0345b.g((B5.a) objH2, c0371o);
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float Q(long j, float f, W0.c cVar) {
        float fC;
        long jB = W0.n.b(j);
        if (W0.o.a(jB, 4294967296L)) {
            if (cVar.l() <= 1.05d) {
                return cVar.T(j);
            }
            fC = W0.n.c(j) / W0.n.c(cVar.a0(f));
        } else {
            if (!W0.o.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = W0.n.c(j);
        }
        return fC * f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void R(Spannable spannable, long j, int i, int i7) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC1145B.v(j)), i, i7, 33);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void S(TextView textView, int i) {
        E3.h.n(i);
        if (Build.VERSION.SDK_INT >= 28) {
            A1.k.n(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i7 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i7)) {
            textView.setPadding(textView.getPaddingLeft(), i + i7, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void T(Spannable spannable, long j, W0.c cVar, int i, int i7) {
        long jB = W0.n.b(j);
        if (W0.o.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(D5.a.G(cVar.T(j)), false), i, i7, 33);
        } else if (W0.o.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(W0.n.c(j)), i, i7, 33);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void U(TextView textView, int i) {
        E3.h.n(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i7 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i7)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void V(TextView textView, int i) {
        E3.h.n(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void W(Spannable spannable, R0.b bVar, int i, int i7) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(n5.m.c0(bVar, 10));
            Iterator it = bVar.f6692q.iterator();
            while (it.hasNext()) {
                arrayList.add(((R0.a) it.next()).f6690a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i7, 33);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void X(String navigationBarColor, String statusBarColor, AbstractActivityC1106h appCompat, boolean z5) {
        kotlin.jvm.internal.m.e(navigationBarColor, "navigationBarColor");
        kotlin.jvm.internal.m.e(statusBarColor, "statusBarColor");
        kotlin.jvm.internal.m.e(appCompat, "appCompat");
        int color = Color.parseColor(statusBarColor);
        b.C c7 = new b.C(color, color);
        int color2 = Color.parseColor(navigationBarColor);
        b.C c8 = new b.C(color2, color2);
        int i = b.n.f9904a;
        View decorView = appCompat.getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        kotlin.jvm.internal.m.d(decorView.getResources(), "view.resources");
        kotlin.jvm.internal.m.d(decorView.getResources(), "view.resources");
        int i7 = Build.VERSION.SDK_INT;
        int i8 = 14;
        I1 sVar = i7 >= 30 ? new b.s(i8) : i7 >= 29 ? new b.r(i8) : i7 >= 28 ? new b.q(i8) : i7 >= 26 ? new b.p(i8) : new b.o(i8);
        Window window = appCompat.getWindow();
        kotlin.jvm.internal.m.d(window, "window");
        sVar.B0(c7, c8, window, decorView, true, true);
        Window window2 = appCompat.getWindow();
        kotlin.jvm.internal.m.d(window2, "window");
        sVar.G(window2);
        if (z5) {
            return;
        }
        b0(appCompat, statusBarColor);
        a0(appCompat, navigationBarColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void Y(String str, String str2, AbstractActivityC1106h abstractActivityC1106h, int i) {
        if ((i & 1) != 0) {
            str = "#000000";
        }
        X(str, str2, abstractActivityC1106h, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void Z(Activity activity, String statusBarColor, String str, boolean z5) {
        kotlin.jvm.internal.m.e(activity, "activity");
        kotlin.jvm.internal.m.e(statusBarColor, "statusBarColor");
        activity.getWindow().setStatusBarColor(Color.parseColor(statusBarColor));
        b0(activity, statusBarColor);
        if (z5) {
            kotlin.jvm.internal.m.b(str);
            activity.getWindow().setNavigationBarColor(Color.parseColor(str));
            a0(activity, str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long a(int i, int i7) {
        return (((long) i7) & 4294967295L) | (((long) i) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a0(Activity activity, String color) {
        kotlin.jvm.internal.m.e(activity, "activity");
        kotlin.jvm.internal.m.e(color, "color");
        boolean z5 = ((double) Color.luminance(Color.parseColor(color))) > 0.5d;
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            View decorView = activity.getWindow().getDecorView();
            kotlin.jvm.internal.m.d(decorView, "getDecorView(...)");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (i >= 26) {
                systemUiVisibility = z5 ? systemUiVisibility | 16 : systemUiVisibility & (-17);
            }
            decorView.setSystemUiVisibility(systemUiVisibility);
            return;
        }
        try {
            WindowInsetsController windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                if (z5) {
                    windowInsetsController.setSystemBarsAppearance(16, 16);
                } else {
                    windowInsetsController.setSystemBarsAppearance(0, 16);
                }
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long b(float f, float f7) {
        return (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b0(Activity activity, String color) {
        kotlin.jvm.internal.m.e(activity, "activity");
        kotlin.jvm.internal.m.e(color, "color");
        boolean z5 = ((double) Color.luminance(Color.parseColor(color))) > 0.5d;
        if (Build.VERSION.SDK_INT < 30) {
            View decorView = activity.getWindow().getDecorView();
            kotlin.jvm.internal.m.d(decorView, "getDecorView(...)");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z5 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            return;
        }
        try {
            WindowInsetsController windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                if (z5) {
                    windowInsetsController.setSystemBarsAppearance(8, 8);
                } else {
                    windowInsetsController.setSystemBarsAppearance(0, 8);
                }
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(C0683A c0683a, b.m mVar, B5.c cVar) {
        kotlin.jvm.internal.m.e(c0683a, "<this>");
        c0683a.a(mVar, new J1.z(cVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c0(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + O(parcel, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(C0299l c0299l, C1743l c1743l) {
        C1824c c1824c = (C1824c) c0299l.f4944c;
        C1824c c1824c2 = (C1824c) c0299l.f4943b;
        boolean zA = v0.v.a(c1743l);
        long j = c1743l.f17461b;
        if (zA) {
            C1822a[] c1822aArr = c1824c2.f18138d;
            n5.k.J0(0, c1822aArr.length, null, c1822aArr);
            c1824c2.f18139e = 0;
            C1822a[] c1822aArr2 = c1824c.f18138d;
            n5.k.J0(0, c1822aArr2.length, null, c1822aArr2);
            c1824c.f18139e = 0;
            c0299l.f4942a = 0L;
        }
        if (!v0.v.c(c1743l)) {
            List list = c1743l.f17467k;
            if (list == null) {
                list = n5.s.f15299q;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                C1733b c1733b = (C1733b) list.get(i);
                long j7 = c1733b.f17436a;
                long j8 = c1733b.f17438c;
                c1824c2.a(j7, Float.intBitsToFloat((int) (j8 >> 32)));
                c1824c.a(j7, Float.intBitsToFloat((int) (j8 & 4294967295L)));
                i++;
            }
            long j9 = c1743l.f17468l;
            c1824c2.a(j, Float.intBitsToFloat((int) (j9 >> 32)));
            c1824c.a(j, Float.intBitsToFloat((int) (j9 & 4294967295L)));
        }
        if (v0.v.c(c1743l) && j - c0299l.f4942a > 40) {
            C1822a[] c1822aArr3 = c1824c2.f18138d;
            n5.k.J0(0, c1822aArr3.length, null, c1822aArr3);
            c1824c2.f18139e = 0;
            C1822a[] c1822aArr4 = c1824c.f18138d;
            n5.k.J0(0, c1822aArr4.length, null, c1822aArr4);
            c1824c.f18139e = 0;
            c0299l.f4942a = 0L;
        }
        c0299l.f4942a = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long d0(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(StringBuilder sb, Object obj, B5.c cVar) {
        if (cVar != null) {
            sb.append((CharSequence) cVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ActionMode.Callback e0(ActionMode.Callback callback) {
        return (!(callback instanceof A1.m) || Build.VERSION.SDK_INT < 26) ? callback : ((A1.m) callback).f203a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(androidx.lifecycle.AbstractC0654q r5, s5.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof H2.b
            if (r0 == 0) goto L13
            r0 = r6
            H2.b r0 = (H2.b) r0
            int r1 = r0.f2132t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2132t = r1
            goto L18
        L13:
            H2.b r0 = new H2.b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f2131s
            int r1 = r0.f2132t
            m5.y r2 = m5.C1386y.f15098a
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            kotlin.jvm.internal.y r5 = r0.f2130r
            androidx.lifecycle.q r0 = r0.f2129q
            m5.AbstractC1362a.e(r6)     // Catch: java.lang.Throwable -> L2b
            goto L72
        L2b:
            r6 = move-exception
            goto L81
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            m5.AbstractC1362a.e(r6)
            androidx.lifecycle.p r6 = r5.b()
            androidx.lifecycle.p r1 = androidx.lifecycle.EnumC0653p.f9559t
            int r6 = r6.compareTo(r1)
            if (r6 < 0) goto L45
            return r2
        L45:
            kotlin.jvm.internal.y r6 = new kotlin.jvm.internal.y
            r6.<init>()
            r0.f2129q = r5     // Catch: java.lang.Throwable -> L7c
            r0.f2130r = r6     // Catch: java.lang.Throwable -> L7c
            r0.f2132t = r3     // Catch: java.lang.Throwable -> L7c
            M5.h r1 = new M5.h     // Catch: java.lang.Throwable -> L7c
            q5.c r0 = n5.AbstractC1397A.v(r0)     // Catch: java.lang.Throwable -> L7c
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L7c
            r1.s()     // Catch: java.lang.Throwable -> L7c
            H2.c r0 = new H2.c     // Catch: java.lang.Throwable -> L7c
            r3 = 0
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L7c
            r6.f14268q = r0     // Catch: java.lang.Throwable -> L7c
            r5.a(r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r1.r()     // Catch: java.lang.Throwable -> L7c
            r5.a r1 = r5.EnumC1580a.f16356q
            if (r0 != r1) goto L70
            return r1
        L70:
            r0 = r5
            r5 = r6
        L72:
            java.lang.Object r5 = r5.f14268q
            androidx.lifecycle.w r5 = (androidx.lifecycle.InterfaceC0659w) r5
            if (r5 == 0) goto L7b
            r0.c(r5)
        L7b:
            return r2
        L7c:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L81:
            java.lang.Object r5 = r5.f14268q
            androidx.lifecycle.w r5 = (androidx.lifecycle.InterfaceC0659w) r5
            if (r5 == 0) goto L8a
            r0.c(r5)
        L8a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.P1.f(androidx.lifecycle.q, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int f0(Parcel parcel) {
        int i = parcel.readInt();
        int iO = O(parcel, i);
        char c7 = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c7 != 20293) {
            throw new C1916b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i7 = iO + iDataPosition;
        if (i7 < iDataPosition || i7 > parcel.dataSize()) {
            throw new C1916b(C0.S.j(iDataPosition, i7, "Size read is invalid start=", " end="), parcel);
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Bundle g(C1371j... c1371jArr) {
        Bundle bundle = new Bundle(c1371jArr.length);
        for (C1371j c1371j : c1371jArr) {
            String str = (String) c1371j.f15080q;
            Object obj = c1371j.f15081r;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                kotlin.jvm.internal.m.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ActionMode.Callback g0(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof A1.m) || callback == null) ? callback : new A1.m(callback, textView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(e6.b.f("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int h0(byte[] bArr, int i, C0776b2 c0776b2) {
        int i7 = i + 1;
        byte b7 = bArr[i];
        if (b7 < 0) {
            return j0(b7, bArr, i7, c0776b2);
        }
        c0776b2.f10805a = b7;
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int i(Context context, String str, int i, int i7, String str2) {
        int iNoteProxyOpNoThrow;
        if (context.checkPermission(str, i, i7) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (str2 == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(i7);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        str2 = packagesForUid[0];
                    }
                }
                int iMyUid = Process.myUid();
                String packageName = context.getPackageName();
                if (iMyUid == i7 && Objects.equals(packageName, str2) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), str2);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, i7, AbstractC1176d.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, str2);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i0(Parcel parcel, int i, int i7) {
        if (i == i7) {
            return;
        }
        String hexString = Integer.toHexString(i);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i7);
        sb.append(" got ");
        sb.append(i);
        sb.append(" (0x");
        throw new C1916b(k1.i.k(sb, hexString, ")"), parcel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int j(Context context, String str) {
        return i(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int j0(int i, byte[] bArr, int i7, C0776b2 c0776b2) {
        byte b7 = bArr[i7];
        int i8 = i7 + 1;
        int i9 = i & 127;
        if (b7 >= 0) {
            c0776b2.f10805a = i9 | (b7 << 7);
            return i8;
        }
        int i10 = i9 | ((b7 & 127) << 7);
        int i11 = i7 + 2;
        byte b8 = bArr[i8];
        if (b8 >= 0) {
            c0776b2.f10805a = i10 | (b8 << 14);
            return i11;
        }
        int i12 = i10 | ((b8 & 127) << 14);
        int i13 = i7 + 3;
        byte b9 = bArr[i11];
        if (b9 >= 0) {
            c0776b2.f10805a = i12 | (b9 << 21);
            return i13;
        }
        int i14 = i12 | ((b9 & 127) << 21);
        int i15 = i7 + 4;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            c0776b2.f10805a = i14 | (b10 << 28);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 28);
        while (true) {
            int i17 = i15 + 1;
            if (bArr[i15] >= 0) {
                c0776b2.f10805a = i16;
                return i17;
            }
            i15 = i17;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(e6.b.f("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                sb.append(e6.b.n(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k0(Parcel parcel, int i, int i7) {
        int iO = O(parcel, i);
        if (iO == i7) {
            return;
        }
        String hexString = Integer.toHexString(iO);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i7);
        sb.append(" got ");
        sb.append(iO);
        sb.append(" (0x");
        throw new C1916b(k1.i.k(sb, hexString, ")"), parcel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long l(C0371o c0371o) {
        P.T0 t02 = AndroidCompositionLocals_androidKt.f9341b;
        Context context = (Context) c0371o.k(t02);
        c0371o.k(AndroidCompositionLocals_androidKt.f9340a);
        Resources resources = ((Context) c0371o.k(t02)).getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = m1.l.f15039a;
        return AbstractC1145B.b(resources.getColor(R.color.splash_bg_color, theme));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int l0(byte[] bArr, int i, C0776b2 c0776b2) {
        long j = bArr[i];
        int i7 = i + 1;
        if (j >= 0) {
            c0776b2.f10806b = j;
            return i7;
        }
        int i8 = i + 2;
        byte b7 = bArr[i7];
        long j7 = (j & 127) | (((long) (b7 & 127)) << 7);
        int i9 = 7;
        while (b7 < 0) {
            int i10 = i8 + 1;
            byte b8 = bArr[i8];
            i9 += 7;
            j7 |= ((long) (b8 & 127)) << i9;
            b7 = b8;
            i8 = i10;
        }
        c0776b2.f10806b = j7;
        return i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: E */
    /* JADX WARN: Multi-variable type inference failed */
    public static void m(T1.s sVar, String str, X.e eVar) {
        T1.A a7 = sVar.f;
        a7.getClass();
        U1.j jVar = new U1.j((U1.i) a7.b(C3.a.z(U1.i.class)), str, eVar);
        n5.r rVar = n5.r.f15298q;
        if (rVar.hasNext()) {
            rVar.next().getClass();
            throw new ClassCastException();
        }
        while (rVar.hasNext()) {
            T1.n navDeepLink = (T1.n) rVar.next();
            kotlin.jvm.internal.m.e(navDeepLink, "navDeepLink");
            jVar.f7410d.add(navDeepLink);
        }
        sVar.f7415h.add(jVar.a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int m0(int i, byte[] bArr) {
        int i7 = bArr[i] & 255;
        int i8 = bArr[i + 1] & 255;
        int i9 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i8 << 8) | i7 | (i9 << 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(int i, int i7) {
        if (i <= i7) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i7 + ").");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long n0(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Bundle o(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iO);
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int o0(byte[] bArr, int i, C0776b2 c0776b2) throws C0895z2 {
        int iH0 = h0(bArr, i, c0776b2);
        int i7 = c0776b2.f10805a;
        if (i7 < 0) {
            throw new C0895z2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i7 == 0) {
            c0776b2.f10807c = "";
            return iH0;
        }
        int i8 = AbstractC0797f3.f10843a;
        int length = bArr.length;
        if ((((length - iH0) - i7) | iH0 | i7) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iH0), Integer.valueOf(i7)));
        }
        int i9 = iH0 + i7;
        char[] cArr = new char[i7];
        int i10 = 0;
        while (iH0 < i9) {
            byte b7 = bArr[iH0];
            if (b7 < 0) {
                break;
            }
            iH0++;
            cArr[i10] = (char) b7;
            i10++;
        }
        while (iH0 < i9) {
            int i11 = iH0 + 1;
            byte b8 = bArr[iH0];
            if (b8 >= 0) {
                cArr[i10] = (char) b8;
                i10++;
                iH0 = i11;
                while (iH0 < i9) {
                    byte b9 = bArr[iH0];
                    if (b9 >= 0) {
                        iH0++;
                        cArr[i10] = (char) b9;
                        i10++;
                    }
                }
            } else {
                if (b8 >= -32) {
                    if (b8 >= -16) {
                        if (i11 >= i9 - 2) {
                            throw new C0895z2("Protocol message had invalid UTF-8.");
                        }
                        byte b10 = bArr[i11];
                        int i12 = iH0 + 3;
                        byte b11 = bArr[iH0 + 2];
                        iH0 += 4;
                        byte b12 = bArr[i12];
                        if (!AbstractC1918b.B(b10)) {
                            if ((((b10 + 112) + (b8 << 28)) >> 30) == 0 && !AbstractC1918b.B(b11) && !AbstractC1918b.B(b12)) {
                                int i13 = ((b10 & 63) << 12) | ((b8 & 7) << 18) | ((b11 & 63) << 6) | (b12 & 63);
                                cArr[i10] = (char) ((i13 >>> 10) + 55232);
                                cArr[i10 + 1] = (char) ((i13 & 1023) + 56320);
                                i10 += 2;
                            }
                        }
                        throw new C0895z2("Protocol message had invalid UTF-8.");
                    }
                    if (i11 >= i9 - 1) {
                        throw new C0895z2("Protocol message had invalid UTF-8.");
                    }
                    int i14 = i10 + 1;
                    int i15 = iH0 + 2;
                    byte b13 = bArr[i11];
                    iH0 += 3;
                    byte b14 = bArr[i15];
                    if (!AbstractC1918b.B(b13)) {
                        if (b8 == -32) {
                            if (b13 >= -96) {
                                b8 = -32;
                            }
                        }
                        if (b8 == -19) {
                            if (b13 < -96) {
                                b8 = -19;
                            }
                        }
                        if (!AbstractC1918b.B(b14)) {
                            cArr[i10] = (char) (((b13 & 63) << 6) | ((b8 & 15) << 12) | (b14 & 63));
                            i10 = i14;
                        }
                    }
                    throw new C0895z2("Protocol message had invalid UTF-8.");
                }
                if (i11 >= i9) {
                    throw new C0895z2("Protocol message had invalid UTF-8.");
                }
                int i16 = i10 + 1;
                iH0 += 2;
                byte b15 = bArr[i11];
                if (b8 < -62 || AbstractC1918b.B(b15)) {
                    throw new C0895z2("Protocol message had invalid UTF-8.");
                }
                cArr[i10] = (char) ((b15 & 63) | ((b8 & 31) << 6));
                i10 = i16;
            }
        }
        c0776b2.f10807c = new String(cArr, 0, i10);
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] p(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iO);
        return bArrCreateByteArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int p0(byte[] bArr, int i, C0776b2 c0776b2) throws C0895z2 {
        int iH0 = h0(bArr, i, c0776b2);
        int i7 = c0776b2.f10805a;
        if (i7 < 0) {
            throw new C0895z2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i7 > bArr.length - iH0) {
            throw new C0895z2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i7 == 0) {
            c0776b2.f10807c = C0796f2.f10840s;
            return iH0;
        }
        c0776b2.f10807c = C0796f2.i(bArr, iH0, i7);
        return iH0 + i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[][] q(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        int i7 = parcel.readInt();
        byte[][] bArr = new byte[i7][];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iO);
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int q0(Object obj, S2 s22, byte[] bArr, int i, int i7, C0776b2 c0776b2) throws C0895z2 {
        int iJ0 = i + 1;
        int i8 = bArr[i];
        if (i8 < 0) {
            iJ0 = j0(i8, bArr, iJ0, c0776b2);
            i8 = c0776b2.f10805a;
        }
        int i9 = iJ0;
        if (i8 < 0 || i8 > i7 - i9) {
            throw new C0895z2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i10 = c0776b2.f10808d + 1;
        c0776b2.f10808d = i10;
        if (i10 >= 100) {
            throw new C0895z2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i11 = i9 + i8;
        s22.d(obj, bArr, i9, i11, c0776b2);
        c0776b2.f10808d--;
        c0776b2.f10807c = obj;
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final O0.e r(Context context) {
        C1899k c1899k = new C1899k(9);
        context.getApplicationContext();
        return new O0.e(c1899k, new O0.a(Build.VERSION.SDK_INT >= 31 ? O0.k.f4285a.a(context) : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int r0(Object obj, S2 s22, byte[] bArr, int i, int i7, int i8, C0776b2 c0776b2) throws C0895z2 {
        L2 l22 = (L2) s22;
        int i9 = c0776b2.f10808d + 1;
        c0776b2.f10808d = i9;
        if (i9 >= 100) {
            throw new C0895z2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iS = l22.s(obj, bArr, i, i7, i8, c0776b2);
        c0776b2.f10808d--;
        c0776b2.f10807c = obj;
        return iS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int[] s(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iO);
        return iArrCreateIntArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int s0(int i, byte[] bArr, int i7, int i8, InterfaceC0880w2 interfaceC0880w2, C0776b2 c0776b2) {
        C0855r2 c0855r2 = (C0855r2) interfaceC0880w2;
        int iH0 = h0(bArr, i7, c0776b2);
        c0855r2.i(c0776b2.f10805a);
        while (iH0 < i8) {
            int iH02 = h0(bArr, iH0, c0776b2);
            if (i != c0776b2.f10805a) {
                break;
            }
            iH0 = h0(bArr, iH02, c0776b2);
            c0855r2.i(c0776b2.f10805a);
        }
        return iH0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Parcelable t(Parcel parcel, int i, Parcelable.Creator creator) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iO);
        return parcelable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int t0(byte[] bArr, int i, InterfaceC0880w2 interfaceC0880w2, C0776b2 c0776b2) throws C0895z2 {
        C0855r2 c0855r2 = (C0855r2) interfaceC0880w2;
        int iH0 = h0(bArr, i, c0776b2);
        int i7 = c0776b2.f10805a + iH0;
        while (iH0 < i7) {
            iH0 = h0(bArr, iH0, c0776b2);
            c0855r2.i(c0776b2.f10805a);
        }
        if (iH0 == i7) {
            return iH0;
        }
        throw new C0895z2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String u(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iO);
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int u0(S2 s22, int i, byte[] bArr, int i7, int i8, InterfaceC0880w2 interfaceC0880w2, C0776b2 c0776b2) throws C0895z2 {
        AbstractC0851q2 abstractC0851q2Zza = s22.zza();
        S2 s23 = s22;
        byte[] bArr2 = bArr;
        int i9 = i8;
        C0776b2 c0776b22 = c0776b2;
        int iQ0 = q0(abstractC0851q2Zza, s23, bArr2, i7, i9, c0776b22);
        s23.a(abstractC0851q2Zza);
        c0776b22.f10807c = abstractC0851q2Zza;
        interfaceC0880w2.add(abstractC0851q2Zza);
        while (iQ0 < i9) {
            C0776b2 c0776b23 = c0776b22;
            int i10 = i9;
            int iH0 = h0(bArr2, iQ0, c0776b23);
            if (i != c0776b23.f10805a) {
                break;
            }
            byte[] bArr3 = bArr2;
            S2 s24 = s23;
            AbstractC0851q2 abstractC0851q2Zza2 = s24.zza();
            iQ0 = q0(abstractC0851q2Zza2, s24, bArr3, iH0, i10, c0776b23);
            s23 = s24;
            bArr2 = bArr3;
            i9 = i10;
            c0776b22 = c0776b23;
            s23.a(abstractC0851q2Zza2);
            c0776b22.f10807c = abstractC0851q2Zza2;
            interfaceC0880w2.add(abstractC0851q2Zza2);
        }
        return iQ0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object[] v(Parcel parcel, int i, Parcelable.Creator creator) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iO);
        return objArrCreateTypedArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int v0(int i, byte[] bArr, int i7, int i8, Y2 y22, C0776b2 c0776b2) throws C0895z2 {
        if ((i >>> 3) == 0) {
            throw new C0895z2("Protocol message contained an invalid tag (zero).");
        }
        int i9 = i & 7;
        if (i9 == 0) {
            int iL0 = l0(bArr, i7, c0776b2);
            y22.d(i, Long.valueOf(c0776b2.f10806b));
            return iL0;
        }
        if (i9 == 1) {
            y22.d(i, Long.valueOf(n0(i7, bArr)));
            return i7 + 8;
        }
        if (i9 == 2) {
            int iH0 = h0(bArr, i7, c0776b2);
            int i10 = c0776b2.f10805a;
            if (i10 < 0) {
                throw new C0895z2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i10 > bArr.length - iH0) {
                throw new C0895z2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i10 == 0) {
                y22.d(i, C0796f2.f10840s);
            } else {
                y22.d(i, C0796f2.i(bArr, iH0, i10));
            }
            return iH0 + i10;
        }
        if (i9 != 3) {
            if (i9 != 5) {
                throw new C0895z2("Protocol message contained an invalid tag (zero).");
            }
            y22.d(i, Integer.valueOf(m0(i7, bArr)));
            return i7 + 4;
        }
        int i11 = (i & (-8)) | 4;
        Y2 y2A = Y2.a();
        int i12 = c0776b2.f10808d + 1;
        c0776b2.f10808d = i12;
        if (i12 >= 100) {
            throw new C0895z2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i13 = 0;
        while (true) {
            if (i7 >= i8) {
                break;
            }
            int iH02 = h0(bArr, i7, c0776b2);
            int i14 = c0776b2.f10805a;
            if (i14 == i11) {
                i13 = i14;
                i7 = iH02;
                break;
            }
            i7 = v0(i14, bArr, iH02, i8, y2A, c0776b2);
            i13 = i14;
        }
        c0776b2.f10808d--;
        if (i7 > i8 || i13 != i11) {
            throw new C0895z2("Failed to parse the message.");
        }
        y22.d(i, y2A);
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList w(Parcel parcel, int i, Parcelable.Creator creator) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iO);
        return arrayListCreateTypedArrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int w0(int i, byte[] bArr, int i7, int i8, C0776b2 c0776b2) throws C0895z2 {
        if ((i >>> 3) == 0) {
            throw new C0895z2("Protocol message contained an invalid tag (zero).");
        }
        int i9 = i & 7;
        if (i9 == 0) {
            return l0(bArr, i7, c0776b2);
        }
        if (i9 == 1) {
            return i7 + 8;
        }
        if (i9 == 2) {
            return h0(bArr, i7, c0776b2) + c0776b2.f10805a;
        }
        if (i9 != 3) {
            if (i9 == 5) {
                return i7 + 4;
            }
            throw new C0895z2("Protocol message contained an invalid tag (zero).");
        }
        int i10 = (i & (-8)) | 4;
        int i11 = 0;
        while (i7 < i8) {
            i7 = h0(bArr, i7, c0776b2);
            i11 = c0776b2.f10805a;
            if (i11 == i10) {
                break;
            }
            i7 = w0(i11, bArr, i7, i8, c0776b2);
        }
        if (i7 > i8 || i11 != i10) {
            throw new C0895z2("Failed to parse the message.");
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float x(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void y(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new C1916b(k1.i.i(i, "Overread allowed size end="), parcel);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float z(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / ((long) 3))) + 709952852);
        float f7 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f7 - ((f7 - (f / (f7 * f7))) * 0.33333334f);
    }
}
