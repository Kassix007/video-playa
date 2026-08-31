package C0;

import M5.AbstractC0263y;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import com.google.android.gms.internal.measurement.AbstractC0836n2;

/* JADX INFO: loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final X f943A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final X f944B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final X f945C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final X f946D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final X f947E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final X f948F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final X f949G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final X f950H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final X f951I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final X f952J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final X f953K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final X f954L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final X f955M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final X f956N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final X f957O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final X f958P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final X f959Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final X f960R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final X f961S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final X f962T;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final X f963r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final X f964s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final X f965t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final X f966u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final X f967v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final X f968w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final X f969x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final X f970y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final X f971z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f972q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 0;
        f963r = new X(i, 0);
        f964s = new X(i, 1);
        f965t = new X(i, 2);
        f966u = new X(i, 3);
        f967v = new X(i, 4);
        f968w = new X(i, 5);
        f969x = new X(i, 6);
        f970y = new X(i, 7);
        f971z = new X(i, 8);
        f943A = new X(i, 9);
        f944B = new X(i, 10);
        f945C = new X(i, 11);
        f946D = new X(i, 12);
        f947E = new X(i, 13);
        f948F = new X(i, 14);
        f949G = new X(i, 15);
        f950H = new X(i, 16);
        f951I = new X(i, 17);
        f952J = new X(i, 18);
        f953K = new X(i, 19);
        f954L = new X(i, 20);
        f955M = new X(i, 21);
        f956N = new X(i, 22);
        f957O = new X(i, 23);
        f958P = new X(i, 24);
        f959Q = new X(i, 25);
        f960R = new X(i, 26);
        f961S = new X(i, 27);
        f962T = new X(i, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(int i, int i7) {
        super(i);
        this.f972q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        Choreographer choreographer;
        switch (this.f972q) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    T5.e eVar = M5.H.f3811a;
                    choreographer = (Choreographer) AbstractC0263y.x(R5.n.f7261a, new C0070c0(2, null));
                }
                C0076f0 c0076f0 = new C0076f0(choreographer, AbstractC0836n2.k(Looper.getMainLooper()));
                return c0076f0.plus(c0076f0.f1037z);
            case 7:
            case 8:
                return null;
            case 9:
                AbstractC0103t0.b("LocalAutofillManager");
                throw null;
            case 10:
                AbstractC0103t0.b("LocalAutofillTree");
                throw null;
            case 11:
                AbstractC0103t0.b("LocalClipboard");
                throw null;
            case 12:
                AbstractC0103t0.b("LocalClipboardManager");
                throw null;
            case 13:
                return Boolean.TRUE;
            case 14:
                AbstractC0103t0.b("LocalDensity");
                throw null;
            case 15:
                AbstractC0103t0.b("LocalFocusManager");
                throw null;
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                AbstractC0103t0.b("LocalFontFamilyResolver");
                throw null;
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                AbstractC0103t0.b("LocalFontLoader");
                throw null;
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                AbstractC0103t0.b("LocalGraphicsContext");
                throw null;
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                AbstractC0103t0.b("LocalHapticFeedback");
                throw null;
            case 20:
                AbstractC0103t0.b("LocalInputManager");
                throw null;
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                AbstractC0103t0.b("LocalLayoutDirection");
                throw null;
            case 22:
                return null;
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                return Boolean.FALSE;
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
            case 25:
                return null;
            case 26:
                AbstractC0103t0.b("LocalTextToolbar");
                throw null;
            case 27:
                AbstractC0103t0.b("LocalUriHandler");
                throw null;
            default:
                AbstractC0103t0.b("LocalViewConfiguration");
                throw null;
        }
    }
}
