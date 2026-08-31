package s1;

import D.t;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import d2.d0;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r.Q;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f16435a = new d0(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f16436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f16437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q f16438d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f16436b = threadPoolExecutor;
        f16437c = new Object();
        f16438d = new Q(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < list.size(); i7++) {
            sb.append(((c) list.get(i7)).f16425e);
            sb.append("-");
            sb.append(i);
            if (i7 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static f b(String str, Context context, List list, int i) {
        int i7;
        Typeface typefaceT;
        d0 d0Var = f16435a;
        Trace.beginSection(E3.h.O("getFontSync"));
        try {
            Typeface typeface = (Typeface) d0Var.h(str);
            if (typeface != null) {
                return new f(typeface);
            }
            t tVarA = b.a(context, list);
            List list2 = tVarA.f1287b;
            int i8 = tVarA.f1286a;
            if (i8 != 0) {
                i7 = i8 != 1 ? -3 : -2;
            } else {
                h[] hVarArr = (h[]) list2.get(0);
                if (hVarArr == null || hVarArr.length == 0) {
                    i7 = 1;
                } else {
                    int length = hVarArr.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            i7 = 0;
                            break;
                        }
                        int i10 = hVarArr[i9].f16443e;
                        if (i10 == 0) {
                            i9++;
                        } else if (i10 >= 0) {
                            i7 = i10;
                        }
                    }
                }
            }
            if (i7 != 0) {
                return new f(i7);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                h[] hVarArr2 = (h[]) list2.get(0);
                Q2.g gVar = n1.e.f15132a;
                Trace.beginSection(E3.h.O("TypefaceCompat.createFromFontInfo"));
                typefaceT = n1.e.f15132a.t(context, hVarArr2, i);
                Trace.endSection();
            } else {
                Q2.g gVar2 = n1.e.f15132a;
                Trace.beginSection(E3.h.O("TypefaceCompat.createFromFontInfoWithFallback"));
                typefaceT = n1.e.f15132a.u(context, list2, i);
                Trace.endSection();
            }
            if (typefaceT == null) {
                return new f(-3);
            }
            d0Var.l(str, typefaceT);
            return new f(typefaceT);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }
}
