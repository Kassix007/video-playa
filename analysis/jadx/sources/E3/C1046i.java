package e3;

import P.W;
import a3.C0632k;
import a3.EnumC0622a;
import a3.I;
import a3.y;
import a3.z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.android.gms.internal.measurement.P1;
import i0.C1133e;
import j0.AbstractC1148c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import l0.InterfaceC1221d;
import m5.C1386y;
import n5.AbstractC1397A;
import z0.AbstractC1937N;
import z0.AbstractC1938O;

/* JADX INFO: renamed from: e3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1046i extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Rect f12588q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Matrix f12589r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f12590s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0632k f12591t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f12592u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ B5.a f12593v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ W f12594w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1046i(Rect rect, Matrix matrix, y yVar, C0632k c0632k, Context context, B5.a aVar, W w3) {
        super(1);
        this.f12588q = rect;
        this.f12589r = matrix;
        this.f12590s = yVar;
        this.f12591t = c0632k;
        this.f12592u = context;
        this.f12593v = aVar;
        this.f12594w = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        InterfaceC1221d Canvas = (InterfaceC1221d) obj;
        kotlin.jvm.internal.m.e(Canvas, "$this$Canvas");
        j0.m mVarT = Canvas.z().t();
        Rect rect = this.f12588q;
        long jG = AbstractC1397A.g(rect.width(), rect.height());
        long jA = P1.a(D5.a.G(C1133e.d(Canvas.d())), D5.a.G(C1133e.b(Canvas.d())));
        float fC = AbstractC1938O.c(jG, Canvas.d());
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
        int i = AbstractC1937N.f18675a;
        float fD = C1133e.d(jG);
        int i7 = AbstractC1937N.f18675a;
        int i8 = (int) (jFloatToRawIntBits >> 32);
        int i9 = (int) (jFloatToRawIntBits & 4294967295L);
        long jA2 = P1.a((int) (Float.intBitsToFloat(i8) * fD), (int) (Float.intBitsToFloat(i9) * C1133e.b(jG)));
        float f = 1;
        long jRound = (((long) Math.round(((Canvas.getLayoutDirection() == W0.l.f8022q ? 0.0f : (-1) * 0.0f) + f) * ((((int) (jA >> 32)) - ((int) (jA2 >> 32))) / 2.0f))) << 32) | (((long) Math.round((f + 0.0f) * ((((int) (jA & 4294967295L)) - ((int) (jA2 & 4294967295L))) / 2.0f))) & 4294967295L);
        Matrix matrix = this.f12589r;
        matrix.reset();
        matrix.preTranslate((int) (jRound >> 32), (int) (jRound & 4294967295L));
        matrix.preScale(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9));
        y yVar = this.f12590s;
        boolean zRemove = ((HashSet) yVar.f8887B.f14122r).remove(z.f8930q);
        if (yVar.f8920q != null && zRemove) {
            yVar.c();
        }
        yVar.f8924u = false;
        yVar.f8897L = I.f8805q;
        yVar.e();
        EnumC0622a enumC0622a = EnumC0622a.f8809q;
        yVar.f8913b0 = enumC0622a;
        yVar.n(this.f12591t);
        if (yVar.f8929z != null) {
            yVar.f8929z = null;
            yVar.invalidateSelf();
        }
        if (this.f12594w.getValue() != null) {
            throw new ClassCastException();
        }
        if (yVar.f8893H) {
            yVar.f8893H = false;
            j3.c cVar = yVar.f8890E;
            if (cVar != null) {
                cVar.q(false);
            }
        }
        yVar.f8894I = false;
        yVar.f8895J = true;
        yVar.f8888C = false;
        if (true != yVar.f8889D) {
            yVar.f8889D = true;
            j3.c cVar2 = yVar.f8890E;
            if (cVar2 != null) {
                cVar2.f13778L = true;
            }
            yVar.invalidateSelf();
        }
        if (yVar.f8896K) {
            yVar.f8896K = false;
            yVar.invalidateSelf();
        }
        Iterator it = y.f8884j0.iterator();
        g3.h hVarD = null;
        while (it.hasNext()) {
            hVarD = yVar.f8920q.d((String) it.next());
            if (hVarD != null) {
                break;
            }
        }
        if (yVar.b(this.f12592u) || hVarD == null) {
            yVar.u(((Number) this.f12593v.invoke()).floatValue());
        } else {
            yVar.u(hVarD.f13066b);
        }
        yVar.setBounds(0, 0, rect.width(), rect.height());
        Canvas canvasA = AbstractC1148c.a(mVarT);
        a3.u uVar = yVar.f8917f0;
        ThreadPoolExecutor threadPoolExecutor = y.f8885k0;
        n3.e eVar = yVar.f8921r;
        Semaphore semaphore = yVar.f8914c0;
        j3.c cVar3 = yVar.f8890E;
        C0632k c0632k = yVar.f8920q;
        if (cVar3 != null && c0632k != null) {
            EnumC0622a enumC0622a2 = yVar.f8913b0;
            if (enumC0622a2 != null) {
                enumC0622a = enumC0622a2;
            }
            boolean z5 = enumC0622a == EnumC0622a.f8810r;
            if (z5) {
                try {
                    semaphore.acquire();
                    if (yVar.v()) {
                        yVar.u(eVar.a());
                    }
                } catch (InterruptedException unused) {
                    if (z5) {
                        semaphore.release();
                        if (cVar3.f13777K != eVar.a()) {
                        }
                    }
                    return C1386y.f15098a;
                } catch (Throwable th) {
                    if (z5) {
                        semaphore.release();
                        if (cVar3.f13777K != eVar.a()) {
                            threadPoolExecutor.execute(uVar);
                        }
                    }
                    throw th;
                }
            }
            if (yVar.f8924u) {
                try {
                    int i10 = yVar.f8891F;
                    if (yVar.f8898M) {
                        canvasA.save();
                        canvasA.concat(matrix);
                        yVar.l(canvasA, cVar3);
                        canvasA.restore();
                    } else {
                        cVar3.g(canvasA, matrix, i10, null);
                    }
                } catch (Throwable unused2) {
                    n3.c.f15153a.getClass();
                }
            } else {
                int i11 = yVar.f8891F;
                if (yVar.f8898M) {
                    canvasA.save();
                    canvasA.concat(matrix);
                    yVar.l(canvasA, cVar3);
                    canvasA.restore();
                } else {
                    cVar3.g(canvasA, matrix, i11, null);
                }
            }
            yVar.f8912a0 = false;
            if (z5) {
                semaphore.release();
                if (cVar3.f13777K != eVar.a()) {
                    threadPoolExecutor.execute(uVar);
                }
            }
        }
        return C1386y.f15098a;
    }
}
