package E3;

import C0.C0072d0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import x3.AbstractC1887A;
import x3.C1899k;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1899k f1700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s4.e f1701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1899k f1702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f1703e = null;
    public static String f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f1704g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f1705h = -1;
    public static Boolean i;
    public static final ThreadLocal j = new ThreadLocal();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0072d0 f1706k = new C0072d0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s4.e f1707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static l f1708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static m f1709n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1710a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i7 = 5;
        f1707l = new s4.e(i7);
        f1700b = new C1899k(i7);
        int i8 = 6;
        f1701c = new s4.e(i8);
        f1702d = new C1899k(i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(Context context) {
        this.f1710a = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC1887A.j(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e7) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e7.getMessage())));
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #4 {all -> 0x0085, blocks: (B:7:0x004b, B:11:0x007f, B:18:0x008b, B:21:0x0091, B:24:0x00a5, B:102:0x020d, B:103:0x0214, B:106:0x0217, B:107:0x0218, B:108:0x021f, B:125:0x0281, B:126:0x0292, B:109:0x0220, B:111:0x023e, B:113:0x024d, B:123:0x0279, B:124:0x0280, B:127:0x0293, B:128:0x02bf), top: B:148:0x004b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static E3.f c(android.content.Context r22, E3.e r23, java.lang.String r24) throws java.lang.Throwable {
        /*
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.String r0 = "No acceptable module "
            java.lang.String r4 = "VersionPolicy returned invalid code:"
            java.lang.String r5 = "Selected remote version of "
            java.lang.String r6 = "Selected remote version of "
            java.lang.String r7 = "Considering local module "
            android.content.Context r8 = r1.getApplicationContext()
            if (r8 == 0) goto L2df
            java.lang.ThreadLocal r9 = E3.f.j
            java.lang.Object r10 = r9.get()
            E3.j r10 = (E3.j) r10
            E3.j r11 = new E3.j
            r11.<init>()
            r9.set(r11)
            C0.d0 r12 = E3.f.f1706k
            java.lang.Object r13 = r12.get()
            java.lang.Long r13 = (java.lang.Long) r13
            long r14 = r13.longValue()
            r16 = 0
            long r18 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L2c0
            r20 = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r18)     // Catch: java.lang.Throwable -> L2c0
            r12.set(r9)     // Catch: java.lang.Throwable -> L2c0
            s4.e r9 = E3.f.f1707l     // Catch: java.lang.Throwable -> L2c0
            E3.d r9 = r2.b(r1, r3, r9)     // Catch: java.lang.Throwable -> L2c0
            java.lang.String r12 = "DynamiteModule"
            r18 = r14
            int r14 = r9.f1697a     // Catch: java.lang.Throwable -> L85
            int r15 = r9.f1698b     // Catch: java.lang.Throwable -> L85
            r21 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L85
            r0.append(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = ":"
            r0.append(r7)     // Catch: java.lang.Throwable -> L85
            r0.append(r14)     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = " and remote module "
            r0.append(r7)     // Catch: java.lang.Throwable -> L85
            r0.append(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = ":"
            r0.append(r7)     // Catch: java.lang.Throwable -> L85
            r0.append(r15)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L85
            android.util.Log.i(r12, r0)     // Catch: java.lang.Throwable -> L85
            int r0 = r9.f1699c     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L293
            r7 = -1
            if (r0 != r7) goto L88
            int r0 = r9.f1697a     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L293
            r0 = r7
            goto L88
        L85:
            r0 = move-exception
            goto L2c3
        L88:
            r12 = 1
            if (r0 != r12) goto L8f
            int r14 = r9.f1698b     // Catch: java.lang.Throwable -> L85
            if (r14 == 0) goto L293
        L8f:
            if (r0 != r7) goto La3
            java.lang.String r0 = "Selected local version of "
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = r0.concat(r3)     // Catch: java.lang.Throwable -> L85
            android.util.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L85
            E3.f r0 = new E3.f     // Catch: java.lang.Throwable -> L85
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L85
            goto L25d
        La3:
            if (r0 != r12) goto L281
            int r0 = r9.f1698b     // Catch: java.lang.Throwable -> L85 E3.b -> L215
            java.lang.Class<E3.f> r4 = E3.f.class
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            boolean r14 = g(r1)     // Catch: java.lang.Throwable -> L201
            if (r14 == 0) goto L203
            java.lang.Boolean r14 = E3.f.f1703e     // Catch: java.lang.Throwable -> L201
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L201
            if (r14 == 0) goto L1f9
            boolean r4 = r14.booleanValue()     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r14 = 2
            if (r4 == 0) goto L164
            java.lang.String r4 = "DynamiteModule"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r5.append(r3)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            java.lang.String r6 = ", version >= "
            r5.append(r6)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r5.append(r0)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            android.util.Log.i(r4, r5)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            java.lang.Class<E3.f> r4 = E3.f.class
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            E3.m r5 = E3.f.f1709n     // Catch: java.lang.Throwable -> L161
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L161
            if (r5 == 0) goto L159
            java.lang.Object r4 = r20.get()     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            E3.j r4 = (E3.j) r4     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            if (r4 == 0) goto L151
            android.database.Cursor r6 = r4.f1723a     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            if (r6 == 0) goto L151
            android.content.Context r6 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            android.database.Cursor r4 = r4.f1723a     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            D3.b r15 = new D3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r12 = 0
            r15.<init>(r12)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            java.lang.Class<E3.f> r12 = E3.f.class
            monitor-enter(r12)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            int r15 = E3.f.f1705h     // Catch: java.lang.Throwable -> L14e
            if (r15 < r14) goto Lfe
            r14 = 1
            goto Lff
        Lfe:
            r14 = 0
        Lff:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L14e
            if (r14 == 0) goto L121
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r14 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r12, r14)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            D3.b r12 = new D3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r12.<init>(r6)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            D3.b r6 = new D3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            D3.a r0 = r5.O(r12, r3, r0, r6)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            goto L136
        L118:
            r0 = move-exception
            goto L20d
        L11b:
            r0 = move-exception
            goto L217
        L11e:
            r0 = move-exception
            goto L218
        L121:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r14 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r12, r14)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            D3.b r12 = new D3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r12.<init>(r6)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            D3.b r6 = new D3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            D3.a r0 = r5.N(r12, r3, r0, r6)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
        L136:
            java.lang.Object r0 = D3.b.K(r0)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            if (r0 == 0) goto L146
            E3.f r4 = new E3.f     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
        L143:
            r0 = r4
            goto L25d
        L146:
            E3.b r0 = new E3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            java.lang.String r4 = "Failed to get module context"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            throw r0     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
        L14e:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L14e
            throw r0     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
        L151:
            E3.b r0 = new E3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            java.lang.String r4 = "No result cursor"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            throw r0     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
        L159:
            E3.b r0 = new E3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            java.lang.String r4 = "DynamiteLoaderV2 was not cached."
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            throw r0     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
        L161:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L161
            throw r0     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
        L164:
            java.lang.String r4 = "DynamiteModule"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r6.append(r3)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            java.lang.String r5 = ", version >= "
            r6.append(r5)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r6.append(r0)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            android.util.Log.i(r4, r5)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            E3.l r4 = h(r1)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            if (r4 == 0) goto L1f1
            android.os.Parcel r5 = r4.K()     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r6 = 6
            android.os.Parcel r5 = r4.I(r5, r6)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            int r6 = r5.readInt()     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r5.recycle()     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r5 = 3
            if (r6 < r5) goto L1b7
            java.lang.Object r5 = r20.get()     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            E3.j r5 = (E3.j) r5     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            if (r5 == 0) goto L1af
            D3.b r6 = new D3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            android.database.Cursor r5 = r5.f1723a     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            D3.b r12 = new D3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r12.<init>(r5)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            D3.a r0 = r4.O(r6, r3, r0, r12)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            goto L1da
        L1af:
            E3.b r0 = new E3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            java.lang.String r4 = "No cached result cursor holder"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            throw r0     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
        L1b7:
            if (r6 != r14) goto L1ca
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r6 = "IDynamite loader version = 2"
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            D3.b r5 = new D3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            D3.a r0 = r4.P(r5, r3, r0)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            goto L1da
        L1ca:
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r6 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            D3.b r5 = new D3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            D3.a r0 = r4.N(r5, r3, r0)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
        L1da:
            java.lang.Object r0 = D3.b.K(r0)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            if (r0 == 0) goto L1e9
            E3.f r4 = new E3.f     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            goto L143
        L1e9:
            E3.b r0 = new E3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            java.lang.String r4 = "Failed to load remote module."
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            throw r0     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
        L1f1:
            E3.b r0 = new E3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            java.lang.String r4 = "Failed to create IDynamiteLoader."
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            throw r0     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
        L1f9:
            E3.b r0 = new E3.b     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            java.lang.String r4 = "Failed to determine which loading route to use."
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
            throw r0     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
        L201:
            r0 = move-exception
            goto L20b
        L203:
            E3.b r0 = new E3.b     // Catch: java.lang.Throwable -> L201
            java.lang.String r5 = "Remote loading disabled"
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L201
            throw r0     // Catch: java.lang.Throwable -> L201
        L20b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L201
            throw r0     // Catch: java.lang.Throwable -> L118 E3.b -> L11b android.os.RemoteException -> L11e
        L20d:
            E3.b r4 = new E3.b     // Catch: java.lang.Throwable -> L85 E3.b -> L215
            java.lang.String r5 = "Failed to load remote module."
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L85 E3.b -> L215
            throw r4     // Catch: java.lang.Throwable -> L85 E3.b -> L215
        L215:
            r0 = move-exception
            goto L220
        L217:
            throw r0     // Catch: java.lang.Throwable -> L85 E3.b -> L215
        L218:
            E3.b r4 = new E3.b     // Catch: java.lang.Throwable -> L85 E3.b -> L215
            java.lang.String r5 = "Failed to load remote module."
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L85 E3.b -> L215
            throw r4     // Catch: java.lang.Throwable -> L85 E3.b -> L215
        L220:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r5 = r0.getMessage()     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r6.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r12 = "Failed to load remote module: "
            r6.append(r12)     // Catch: java.lang.Throwable -> L85
            r6.append(r5)     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L85
            android.util.Log.w(r4, r5)     // Catch: java.lang.Throwable -> L85
            int r4 = r9.f1697a     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L279
            E3.k r5 = new E3.k     // Catch: java.lang.Throwable -> L85
            r5.<init>()     // Catch: java.lang.Throwable -> L85
            r5.f1724q = r4     // Catch: java.lang.Throwable -> L85
            E3.d r1 = r2.b(r1, r3, r5)     // Catch: java.lang.Throwable -> L85
            int r1 = r1.f1699c     // Catch: java.lang.Throwable -> L85
            if (r1 != r7) goto L279
            java.lang.String r0 = "Selected local version of "
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = r0.concat(r3)     // Catch: java.lang.Throwable -> L85
            android.util.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L85
            E3.f r0 = new E3.f     // Catch: java.lang.Throwable -> L85
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L85
        L25d:
            int r1 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r1 != 0) goto L267
            C0.d0 r1 = E3.f.f1706k
            r1.remove()
            goto L26c
        L267:
            C0.d0 r1 = E3.f.f1706k
            r1.set(r13)
        L26c:
            android.database.Cursor r1 = r11.f1723a
            if (r1 == 0) goto L273
            r1.close()
        L273:
            java.lang.ThreadLocal r1 = E3.f.j
            r1.set(r10)
            return r0
        L279:
            E3.b r1 = new E3.b     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L85
            throw r1     // Catch: java.lang.Throwable -> L85
        L281:
            E3.b r1 = new E3.b     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L85
            r2.append(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L85
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L85
            throw r1     // Catch: java.lang.Throwable -> L85
        L293:
            E3.b r0 = new E3.b     // Catch: java.lang.Throwable -> L85
            int r1 = r9.f1697a     // Catch: java.lang.Throwable -> L85
            int r2 = r9.f1698b     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r5 = r21
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L85
            r4.append(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = " found. Local version is "
            r4.append(r3)     // Catch: java.lang.Throwable -> L85
            r4.append(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch: java.lang.Throwable -> L85
            r4.append(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = "."
            r4.append(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L85
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L85
            throw r0     // Catch: java.lang.Throwable -> L85
        L2c0:
            r0 = move-exception
            r18 = r14
        L2c3:
            int r1 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r1 != 0) goto L2cd
            C0.d0 r1 = E3.f.f1706k
            r1.remove()
            goto L2d2
        L2cd:
            C0.d0 r1 = E3.f.f1706k
            r1.set(r13)
        L2d2:
            android.database.Cursor r1 = r11.f1723a
            if (r1 == 0) goto L2d9
            r1.close()
        L2d9:
            java.lang.ThreadLocal r1 = E3.f.j
            r1.set(r10)
            throw r0
        L2df:
            E3.b r0 = new E3.b
            java.lang.String r1 = "null application Context"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.f.c(android.content.Context, E3.e, java.lang.String):E3.f");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0182 A[Catch: all -> 0x00ec, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00ec, blocks: (B:3:0x0002, B:63:0x00e1, B:65:0x00e7, B:73:0x010d, B:103:0x0182, B:111:0x0197, B:129:0x0219, B:130:0x021c, B:124:0x0210, B:71:0x00f2, B:132:0x021e, B:4:0x0003, B:7:0x000a, B:8:0x0026, B:61:0x00de, B:21:0x004a, B:44:0x00a1, B:47:0x00a4, B:54:0x00bc, B:62:0x00e0, B:60:0x00c2), top: B:143:0x0002, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0 A[Catch: all -> 0x0037, TryCatch #11 {, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b9, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x0050, B:27:0x0054, B:30:0x005d, B:32:0x0065, B:35:0x006c, B:42:0x0098, B:43:0x00a0, B:38:0x0073, B:40:0x0079, B:41:0x008a, B:46:0x00a3, B:49:0x00a6, B:50:0x00b0, B:17:0x003f), top: B:147:0x0027, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            java.lang.Class<E3.f> r1 = E3.f.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lec
            java.lang.Boolean r0 = E3.f.f1703e     // Catch: java.lang.Throwable -> L4c
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 != 0) goto Le0
            android.content.Context r0 = r11.getApplicationContext()     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r5 = com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.class
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
            java.lang.Class r0 = r0.loadClass(r5)     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
            java.lang.String r5 = "sClassLoader"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r5)     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
            java.lang.Class r5 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
            java.lang.Object r6 = r0.get(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.ClassLoader r6 = (java.lang.ClassLoader) r6     // Catch: java.lang.Throwable -> L37
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L37
            if (r6 != r7) goto L3a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L37
            goto Lb9
        L37:
            r0 = move-exception
            goto Lbb
        L3a:
            if (r6 == 0) goto L43
            f(r6)     // Catch: java.lang.Throwable -> L37 E3.b -> L3f
        L3f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L37
            goto Lb9
        L43:
            boolean r6 = g(r11)     // Catch: java.lang.Throwable -> L37
            if (r6 != 0) goto L50
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            return r4
        L4c:
            r0 = move-exception
            r12 = r0
            goto L21d
        L50:
            boolean r6 = E3.f.f1704g     // Catch: java.lang.Throwable -> L37
            if (r6 != 0) goto Lb0
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L37
            boolean r7 = r6.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L5d
            goto Lb0
        L5d:
            int r7 = e(r11, r12, r13, r2)     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            java.lang.String r8 = E3.f.f     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            if (r8 == 0) goto La3
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            if (r8 == 0) goto L6c
            goto La3
        L6c:
            java.lang.ClassLoader r8 = E3.h.R()     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            if (r8 == 0) goto L73
            goto L98
        L73:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            r9 = 29
            if (r8 < r9) goto L8a
            E3.a.b()     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            java.lang.String r8 = E3.f.f     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            x3.AbstractC1887A.g(r8)     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            dalvik.system.DelegateLastClassLoader r8 = E3.a.a(r9, r8)     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            goto L98
        L8a:
            E3.i r8 = new E3.i     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            java.lang.String r9 = E3.f.f     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            x3.AbstractC1887A.g(r9)     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            java.lang.ClassLoader r10 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> L37 E3.b -> La6
        L98:
            f(r8)     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            r0.set(r3, r8)     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            E3.f.f1703e = r6     // Catch: java.lang.Throwable -> L37 E3.b -> La6
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            return r7
        La3:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            return r7
        La6:
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L37
            r0.set(r3, r6)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L37
            goto Lb9
        Lb0:
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L37
            r0.set(r3, r6)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L37
        Lb9:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L37
            goto Lde
        Lbb:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
        Lbd:
            r0 = move-exception
            goto Lc2
        Lbf:
            r0 = move-exception
            goto Lc2
        Lc1:
            r0 = move-exception
        Lc2:
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r6.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r7 = "Failed to load module via V2: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L4c
            r6.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L4c
            android.util.Log.w(r5, r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L4c
        Lde:
            E3.f.f1703e = r0     // Catch: java.lang.Throwable -> L4c
        Le0:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lec
            if (r0 == 0) goto L10d
            int r11 = e(r11, r12, r13, r4)     // Catch: java.lang.Throwable -> Lec E3.b -> Lf0
            return r11
        Lec:
            r0 = move-exception
            r12 = r0
            goto L21f
        Lf0:
            r0 = move-exception
            r12 = r0
            java.lang.String r13 = "DynamiteModule"
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> Lec
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lec
            r0.<init>()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch: java.lang.Throwable -> Lec
            r0.append(r12)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> Lec
            android.util.Log.w(r13, r12)     // Catch: java.lang.Throwable -> Lec
            return r4
        L10d:
            E3.l r5 = h(r11)     // Catch: java.lang.Throwable -> Lec
            if (r5 != 0) goto L115
            goto L213
        L115:
            android.os.Parcel r0 = r5.K()     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            r1 = 6
            android.os.Parcel r0 = r5.I(r0, r1)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            int r1 = r0.readInt()     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            r0.recycle()     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            r0 = 3
            if (r1 < r0) goto L1a1
            java.lang.ThreadLocal r0 = E3.f.j     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            java.lang.Object r1 = r0.get()     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            E3.j r1 = (E3.j) r1     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            if (r1 == 0) goto L140
            android.database.Cursor r1 = r1.f1723a     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            if (r1 == 0) goto L140
            int r4 = r1.getInt(r4)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            goto L213
        L13c:
            r0 = move-exception
            r12 = r0
            goto L1f3
        L140:
            D3.b r6 = new D3.b     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            r6.<init>(r11)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            C0.d0 r1 = E3.f.f1706k     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            java.lang.Object r1 = r1.get()     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            long r9 = r1.longValue()     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            r7 = r12
            r8 = r13
            D3.a r12 = r5.Q(r6, r7, r8, r9)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            java.lang.Object r12 = D3.b.K(r12)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            android.database.Cursor r12 = (android.database.Cursor) r12     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            if (r12 == 0) goto L18e
            boolean r13 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L188 android.os.RemoteException -> L18b
            if (r13 != 0) goto L166
            goto L18e
        L166:
            int r13 = r12.getInt(r4)     // Catch: java.lang.Throwable -> L188 android.os.RemoteException -> L18b
            if (r13 <= 0) goto L17f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L188 android.os.RemoteException -> L18b
            E3.j r0 = (E3.j) r0     // Catch: java.lang.Throwable -> L188 android.os.RemoteException -> L18b
            if (r0 == 0) goto L17b
            android.database.Cursor r1 = r0.f1723a     // Catch: java.lang.Throwable -> L188 android.os.RemoteException -> L18b
            if (r1 != 0) goto L17b
            r0.f1723a = r12     // Catch: java.lang.Throwable -> L188 android.os.RemoteException -> L18b
            goto L17c
        L17b:
            r2 = r4
        L17c:
            if (r2 == 0) goto L17f
            goto L180
        L17f:
            r3 = r12
        L180:
            if (r3 == 0) goto L185
            r3.close()     // Catch: java.lang.Throwable -> Lec
        L185:
            r4 = r13
            goto L213
        L188:
            r0 = move-exception
            r13 = r0
            goto L19c
        L18b:
            r0 = move-exception
            r13 = r0
            goto L19f
        L18e:
            java.lang.String r13 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r13, r0)     // Catch: java.lang.Throwable -> L188 android.os.RemoteException -> L18b
            if (r12 == 0) goto L213
            r12.close()     // Catch: java.lang.Throwable -> Lec
            goto L213
        L19c:
            r3 = r12
            goto L217
        L19f:
            r3 = r12
            goto L1f4
        L1a1:
            r7 = r12
            r8 = r13
            r12 = 2
            if (r1 != r12) goto L1cc
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r13 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r12, r13)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            D3.b r12 = new D3.b     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            r12.<init>(r11)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            android.os.Parcel r13 = r5.K()     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            J3.a.c(r13, r12)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            r13.writeString(r7)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            r13.writeInt(r8)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            r12 = 5
            android.os.Parcel r12 = r5.I(r13, r12)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            int r13 = r12.readInt()     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            r12.recycle()     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            goto L185
        L1cc:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r13 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r12, r13)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            D3.b r12 = new D3.b     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            r12.<init>(r11)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            android.os.Parcel r13 = r5.K()     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            J3.a.c(r13, r12)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            r13.writeString(r7)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            r13.writeInt(r8)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            android.os.Parcel r12 = r5.I(r13, r0)     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            int r13 = r12.readInt()     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            r12.recycle()     // Catch: android.os.RemoteException -> L13c java.lang.Throwable -> L214
            goto L185
        L1f1:
            r13 = r12
            goto L217
        L1f3:
            r13 = r12
        L1f4:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r13 = r13.getMessage()     // Catch: java.lang.Throwable -> L214
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L214
            r0.<init>()     // Catch: java.lang.Throwable -> L214
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L214
            r0.append(r13)     // Catch: java.lang.Throwable -> L214
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> L214
            android.util.Log.w(r12, r13)     // Catch: java.lang.Throwable -> L214
            if (r3 == 0) goto L213
            r3.close()     // Catch: java.lang.Throwable -> Lec
        L213:
            return r4
        L214:
            r0 = move-exception
            r12 = r0
            goto L1f1
        L217:
            if (r3 == 0) goto L21c
            r3.close()     // Catch: java.lang.Throwable -> Lec
        L21c:
            throw r13     // Catch: java.lang.Throwable -> Lec
        L21d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            throw r12     // Catch: java.lang.Throwable -> Lec
        L21f:
            x3.AbstractC1887A.g(r11)     // Catch: java.lang.Exception -> L223
            goto L22c
        L223:
            r0 = move-exception
            r11 = r0
            java.lang.String r13 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r13, r0, r11)
        L22c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.f.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0137 A[PHI: r13
  0x0137: PHI (r13v6 boolean) = (r13v5 boolean), (r13v9 boolean) binds: [B:59:0x00ee, B:84:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            r1 = 0
            C0.d0 r0 = E3.f.f1706k     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            java.lang.String r0 = "api_force_staging"
            java.lang.String r4 = "api"
            r5 = 1
            if (r5 == r14) goto L15
            r0 = r4
        L15:
            android.net.Uri$Builder r14 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            r14.<init>()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            java.lang.String r4 = "content"
            android.net.Uri$Builder r14 = r14.scheme(r4)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r14 = r14.authority(r4)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            android.net.Uri$Builder r14 = r14.path(r0)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            android.net.Uri$Builder r13 = r14.appendPath(r13)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            java.lang.String r14 = "requestStartUptime"
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            android.net.Uri$Builder r13 = r13.appendQueryParameter(r14, r0)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            android.net.Uri r7 = r13.build()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            android.content.ContentResolver r12 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            android.content.ContentProviderClient r6 = r12.acquireUnstableContentProviderClient(r7)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            r12 = 2
            r13 = 0
            if (r6 != 0) goto L4b
        L48:
            r3 = r1
            goto Le2
        L4b:
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r14 = r6.query(r7, r8, r9, r10, r11)     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> Ld1
            if (r14 != 0) goto L59
        L55:
            r6.release()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            goto L48
        L59:
            int r0 = r14.getCount()     // Catch: java.lang.Throwable -> L8f
            int r2 = r14.getColumnCount()     // Catch: java.lang.Throwable -> L8f
            android.database.MatrixCursor r3 = new android.database.MatrixCursor     // Catch: java.lang.Throwable -> L8f
            java.lang.String[] r4 = r14.getColumnNames()     // Catch: java.lang.Throwable -> L8f
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L8f
            r4 = r13
        L6b:
            if (r4 >= r0) goto Lca
            boolean r7 = r14.moveToPosition(r4)     // Catch: java.lang.Throwable -> L8f
            if (r7 == 0) goto Lc2
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L8f
            r8 = r13
        L76:
            if (r8 >= r2) goto Lbc
            int r9 = r14.getType(r8)     // Catch: java.lang.Throwable -> L8f
            if (r9 == 0) goto Lb7
            if (r9 == r5) goto Lac
            if (r9 == r12) goto La1
            r10 = 3
            if (r9 == r10) goto L9a
            r10 = 4
            if (r9 != r10) goto L92
            byte[] r9 = r14.getBlob(r8)     // Catch: java.lang.Throwable -> L8f
            r7[r8] = r9     // Catch: java.lang.Throwable -> L8f
            goto Lb9
        L8f:
            r0 = move-exception
            r2 = r0
            goto Ld4
        L92:
            android.os.RemoteException r0 = new android.os.RemoteException     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "Unknown column type"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8f
        L9a:
            java.lang.String r9 = r14.getString(r8)     // Catch: java.lang.Throwable -> L8f
            r7[r8] = r9     // Catch: java.lang.Throwable -> L8f
            goto Lb9
        La1:
            double r9 = r14.getDouble(r8)     // Catch: java.lang.Throwable -> L8f
            java.lang.Double r9 = java.lang.Double.valueOf(r9)     // Catch: java.lang.Throwable -> L8f
            r7[r8] = r9     // Catch: java.lang.Throwable -> L8f
            goto Lb9
        Lac:
            long r9 = r14.getLong(r8)     // Catch: java.lang.Throwable -> L8f
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L8f
            r7[r8] = r9     // Catch: java.lang.Throwable -> L8f
            goto Lb9
        Lb7:
            r7[r8] = r1     // Catch: java.lang.Throwable -> L8f
        Lb9:
            int r8 = r8 + 1
            goto L76
        Lbc:
            r3.addRow(r7)     // Catch: java.lang.Throwable -> L8f
            int r4 = r4 + 1
            goto L6b
        Lc2:
            android.os.RemoteException r0 = new android.os.RemoteException     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "Cursor read incomplete (ContentProvider dead?)"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8f
        Lca:
            r14.close()     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> Ld1
            r6.release()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            goto Le2
        Ld1:
            r0 = move-exception
            r12 = r0
            goto Lde
        Ld4:
            r14.close()     // Catch: java.lang.Throwable -> Ld8
            goto Ldd
        Ld8:
            r0 = move-exception
            r14 = r0
            r2.addSuppressed(r14)     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> Ld1
        Ldd:
            throw r2     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> Ld1
        Lde:
            r6.release()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            throw r12     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
        Le2:
            if (r3 == 0) goto L15a
            boolean r14 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L13b java.lang.Exception -> L13e
            if (r14 == 0) goto L15a
            int r14 = r3.getInt(r13)     // Catch: java.lang.Throwable -> L13b java.lang.Exception -> L13e
            if (r14 <= 0) goto L137
            java.lang.Class<E3.f> r2 = E3.f.class
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L13b java.lang.Exception -> L13e
            java.lang.String r12 = r3.getString(r12)     // Catch: java.lang.Throwable -> L108
            E3.f.f = r12     // Catch: java.lang.Throwable -> L108
            java.lang.String r12 = "loaderVersion"
            int r12 = r3.getColumnIndex(r12)     // Catch: java.lang.Throwable -> L108
            if (r12 < 0) goto L10b
            int r12 = r3.getInt(r12)     // Catch: java.lang.Throwable -> L108
            E3.f.f1705h = r12     // Catch: java.lang.Throwable -> L108
            goto L10b
        L108:
            r0 = move-exception
            r12 = r0
            goto L139
        L10b:
            java.lang.String r12 = "disableStandaloneDynamiteLoader2"
            int r12 = r3.getColumnIndex(r12)     // Catch: java.lang.Throwable -> L108
            if (r12 < 0) goto L11f
            int r12 = r3.getInt(r12)     // Catch: java.lang.Throwable -> L108
            if (r12 == 0) goto L11b
            r12 = r5
            goto L11c
        L11b:
            r12 = r13
        L11c:
            E3.f.f1704g = r12     // Catch: java.lang.Throwable -> L108
            goto L120
        L11f:
            r12 = r13
        L120:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L108
            java.lang.ThreadLocal r0 = E3.f.j     // Catch: java.lang.Throwable -> L13b java.lang.Exception -> L13e
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L13b java.lang.Exception -> L13e
            E3.j r0 = (E3.j) r0     // Catch: java.lang.Throwable -> L13b java.lang.Exception -> L13e
            if (r0 == 0) goto L132
            android.database.Cursor r2 = r0.f1723a     // Catch: java.lang.Throwable -> L13b java.lang.Exception -> L13e
            if (r2 != 0) goto L132
            r0.f1723a = r3     // Catch: java.lang.Throwable -> L13b java.lang.Exception -> L13e
            goto L133
        L132:
            r5 = r13
        L133:
            r13 = r12
            if (r5 == 0) goto L137
            goto L141
        L137:
            r1 = r3
            goto L141
        L139:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L108
            throw r12     // Catch: java.lang.Throwable -> L13b java.lang.Exception -> L13e
        L13b:
            r0 = move-exception
            r12 = r0
            goto L169
        L13e:
            r0 = move-exception
            r12 = r0
            goto L16b
        L141:
            if (r15 == 0) goto L154
            if (r13 != 0) goto L146
            goto L154
        L146:
            E3.b r12 = new E3.b     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            java.lang.String r13 = "forcing fallback to container DynamiteLoader impl"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
            throw r12     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L151
        L14e:
            r0 = move-exception
            r12 = r0
            goto L18c
        L151:
            r0 = move-exception
            r12 = r0
            goto L16c
        L154:
            if (r1 == 0) goto L159
            r1.close()
        L159:
            return r14
        L15a:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r13 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r13)     // Catch: java.lang.Throwable -> L13b java.lang.Exception -> L13e
            E3.b r12 = new E3.b     // Catch: java.lang.Throwable -> L13b java.lang.Exception -> L13e
            java.lang.String r13 = "Failed to connect to dynamite module ContentResolver."
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L13b java.lang.Exception -> L13e
            throw r12     // Catch: java.lang.Throwable -> L13b java.lang.Exception -> L13e
        L169:
            r1 = r3
            goto L18c
        L16b:
            r1 = r3
        L16c:
            boolean r13 = r12 instanceof E3.b     // Catch: java.lang.Throwable -> L14e
            if (r13 == 0) goto L171
            throw r12     // Catch: java.lang.Throwable -> L14e
        L171:
            E3.b r13 = new E3.b     // Catch: java.lang.Throwable -> L14e
            java.lang.String r14 = r12.getMessage()     // Catch: java.lang.Throwable -> L14e
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14e
            r15.<init>()     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = "V2 version check failed: "
            r15.append(r0)     // Catch: java.lang.Throwable -> L14e
            r15.append(r14)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r14 = r15.toString()     // Catch: java.lang.Throwable -> L14e
            r13.<init>(r14, r12)     // Catch: java.lang.Throwable -> L14e
            throw r13     // Catch: java.lang.Throwable -> L14e
        L18c:
            if (r1 == 0) goto L191
            r1.close()
        L191:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.f.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(ClassLoader classLoader) throws b {
        try {
            m mVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                mVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
            }
            f1709n = mVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
            throw new b("Failed to instantiate dynamite loader", e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(i)) {
            return true;
        }
        boolean z5 = false;
        if (i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (com.google.android.gms.common.f.f10343b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z5 = true;
            }
            i = Boolean.valueOf(z5);
            if (z5 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f1704g = true;
            }
        }
        if (!z5) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static l h(Context context) {
        l lVar;
        synchronized (f.class) {
            l lVar2 = f1708m;
            if (lVar2 != null) {
                return lVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    lVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    lVar = iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new l(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (lVar != null) {
                    f1708m = lVar;
                    return lVar;
                }
            } catch (Exception e7) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e7.getMessage());
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IBinder b(String str) throws b {
        try {
            return (IBinder) this.f1710a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e7) {
            throw new b("Failed to instantiate module class: ".concat(str), e7);
        }
    }
}
