package O3;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.C0815j1;
import com.google.android.gms.internal.measurement.C0820k1;
import com.google.android.gms.internal.measurement.C0830m1;
import com.google.android.gms.internal.measurement.C0835n1;
import com.google.android.gms.internal.measurement.C0850q1;
import com.google.android.gms.internal.measurement.C0854r1;
import com.google.android.gms.internal.measurement.C0859s1;
import com.google.android.gms.internal.measurement.C0895z2;
import com.google.android.gms.internal.measurement.Y3;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import r.C1554e;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class T1 implements F0 {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static volatile T1 f4580a0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C0294j0 f4581A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0323t0 f4582B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f4584D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f4585E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayList f4586F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f4588H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f4589I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f4590J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f4591K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f4592L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public FileLock f4593M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public FileChannel f4594N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ArrayList f4595O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ArrayList f4596P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final HashMap f4598R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final HashMap f4599S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final HashMap f4600T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0295j1 f4602V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public String f4603W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C1 f4604X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f4605Y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0300l0 f4607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0270b0 f4608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0305n f4609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0276d0 f4610t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public J1 f4611u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0272c f4612v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0270b0 f4613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0270b0 f4614x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0339y1 f4615y;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final AtomicBoolean f4583C = new AtomicBoolean(false);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final LinkedList f4587G = new LinkedList();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final HashMap f4601U = new HashMap();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final k3.d f4606Z = new k3.d(13, this);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f4597Q = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Q1 f4616z = new Q1(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public T1(E1.p pVar) {
        this.f4582B = C0323t0.r(pVar.f1653a, null, null);
        C0270b0 c0270b0 = new C0270b0(this, 2);
        c0270b0.q();
        this.f4613w = c0270b0;
        C0270b0 c0270b02 = new C0270b0(this, 0);
        c0270b02.q();
        this.f4608r = c0270b02;
        C0300l0 c0300l0 = new C0300l0(this);
        c0300l0.q();
        this.f4607q = c0300l0;
        this.f4598R = new HashMap();
        this.f4599S = new HashMap();
        this.f4600T = new HashMap();
        c().x(new A1.b(this, pVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static T1 B(Context context) {
        AbstractC1887A.g(context);
        AbstractC1887A.g(context.getApplicationContext());
        if (f4580a0 == null) {
            synchronized (T1.class) {
                try {
                    if (f4580a0 == null) {
                        f4580a0 = new T1(new E1.p(context, 1));
                    }
                } finally {
                }
            }
        }
        return f4580a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void C(C0815j1 c0815j1, String str) {
        List listH = c0815j1.h();
        for (int i = 0; i < listH.size(); i++) {
            if (str.equals(((C0835n1) listH.get(i)).q())) {
                c0815j1.b();
                ((C0820k1) c0815j1.f11012r).E(i);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String K(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean Q(a2 a2Var) {
        return !TextUtils.isEmpty(a2Var.f4730r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void R(C0854r1 c0854r1) {
        c0854r1.b();
        ((C0859s1) c0854r1.f11012r).h0(Long.MAX_VALUE);
        c0854r1.b();
        ((C0859s1) c0854r1.f11012r).i0(Long.MIN_VALUE);
        for (int i = 0; i < c0854r1.V(); i++) {
            C0820k1 c0820k1T1 = ((C0859s1) c0854r1.f11012r).T1(i);
            if (c0820k1T1.u() < ((C0859s1) c0854r1.f11012r).a2()) {
                long jU = c0820k1T1.u();
                c0854r1.b();
                ((C0859s1) c0854r1.f11012r).h0(jU);
            }
            if (c0820k1T1.u() > ((C0859s1) c0854r1.f11012r).c2()) {
                long jU2 = c0820k1T1.u();
                c0854r1.b();
                ((C0859s1) c0854r1.f11012r).i0(jU2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void S(O1 o12) {
        if (o12 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!o12.f4546t) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(o12.getClass())));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Boolean T(a2 a2Var) {
        Boolean bool = a2Var.f4713F;
        String str = a2Var.f4726S;
        if (!TextUtils.isEmpty(str)) {
            int iOrdinal = ((G0) k3.c.v(str).f14120q).ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c0(C0815j1 c0815j1, int i, String str) {
        List listH = c0815j1.h();
        for (int i7 = 0; i7 < listH.size(); i7++) {
            if ("_err".equals(((C0835n1) listH.get(i7)).q())) {
                return;
            }
        }
        C0830m1 c0830m1B = C0835n1.B();
        c0830m1B.h("_err");
        c0830m1B.j(i);
        C0835n1 c0835n1 = (C0835n1) c0830m1B.e();
        C0830m1 c0830m1B2 = C0835n1.B();
        c0830m1B2.h("_ev");
        c0830m1B2.i(str);
        C0835n1 c0835n12 = (C0835n1) c0830m1B2.e();
        c0815j1.j(c0835n1);
        c0815j1.j(c0835n12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A() {
        c().o();
        k0();
        if (this.f4584D) {
            return;
        }
        this.f4584D = true;
        c().o();
        FileLock fileLock = this.f4593M;
        C0323t0 c0323t0 = this.f4582B;
        if (fileLock == null || !fileLock.isValid()) {
            ((C0323t0) this.f4609s.f4346r).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(c0323t0.f5072q.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.f4594N = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.f4593M = fileLockTryLock;
                if (fileLockTryLock == null) {
                    b().f4670w.b("Storage concurrent data access panic");
                    return;
                }
                b().f4666E.b("Storage concurrent access okay");
            } catch (FileNotFoundException e7) {
                b().f4670w.c(e7, "Failed to acquire storage lock");
                return;
            } catch (IOException e8) {
                b().f4670w.c(e8, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e9) {
                b().f4673z.c(e9, "Storage lock already acquired");
                return;
            }
        } else {
            b().f4666E.b("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.f4594N;
        c().o();
        int i = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            b().f4670w.b("Bad channel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i7 = fileChannel.read(byteBufferAllocate);
                if (i7 == 4) {
                    byteBufferAllocate.flip();
                    i = byteBufferAllocate.getInt();
                } else if (i7 != -1) {
                    b().f4673z.c(Integer.valueOf(i7), "Unexpected data length. Bytes read");
                }
            } catch (IOException e10) {
                b().f4670w.c(e10, "Failed to read from channel");
            }
        }
        N nQ = c0323t0.q();
        nQ.p();
        int i8 = nQ.f4529v;
        c().o();
        if (i > i8) {
            b().f4670w.d(Integer.valueOf(i), Integer.valueOf(i8), "Panic: can't downgrade version. Previous, current version");
            return;
        }
        if (i < i8) {
            FileChannel fileChannel2 = this.f4594N;
            c().o();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                b().f4670w.b("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(i8);
                byteBufferAllocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(byteBufferAllocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        b().f4670w.c(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    b().f4666E.d(Integer.valueOf(i), Integer.valueOf(i8), "Storage version upgraded. Previous, current version");
                    return;
                } catch (IOException e11) {
                    b().f4670w.c(e11, "Failed to write to channel");
                }
            }
            b().f4670w.d(Integer.valueOf(i), Integer.valueOf(i8), "Storage version upgrade failed. Previous, current version");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int D(String str, k3.d dVar) {
        G0 g0S;
        C0300l0 c0300l0 = this.f4607q;
        com.google.android.gms.internal.measurement.J0 j0J = c0300l0.J(str);
        I0 i02 = I0.AD_PERSONALIZATION;
        if (j0J == null) {
            dVar.J(i02, EnumC0287h.FAILSAFE);
            return 1;
        }
        C0305n c0305n = this.f4609s;
        S(c0305n);
        C0273c0 c0273c0S0 = c0305n.s0(str);
        if (c0273c0S0 == null || ((G0) k3.c.v(c0273c0S0.s()).f14120q) != G0.POLICY || (g0S = c0300l0.s(str, i02)) == G0.UNINITIALIZED) {
            dVar.J(i02, EnumC0287h.REMOTE_DEFAULT);
            if (c0300l0.I(str, i02)) {
                return 0;
            }
        } else {
            dVar.J(i02, EnumC0287h.REMOTE_ENFORCED_DEFAULT);
            if (g0S == G0.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HashMap E(C0820k1 c0820k1) {
        Serializable serializableD;
        HashMap map = new HashMap();
        i0();
        HashMap map2 = new HashMap();
        for (C0835n1 c0835n1 : c0820k1.p()) {
            if (c0835n1.q().startsWith("gad_") && (serializableD = C0270b0.D(c0835n1)) != null) {
                map2.put(c0835n1.q(), serializableD);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F() {
        c().o();
        if (this.f4587G.isEmpty()) {
            return;
        }
        if (this.f4604X == null) {
            this.f4604X = new C1(this, this.f4582B, 2);
        }
        if (this.f4604X.f4999c != 0) {
            return;
        }
        e().getClass();
        long jMax = Math.max(0L, ((long) ((Integer) F.f4365B0.a(null)).intValue()) - (SystemClock.elapsedRealtime() - this.f4605Y));
        b().f4666E.c(Long.valueOf(jMax), "Scheduling notify next app runnable, delay in ms");
        if (this.f4604X == null) {
            this.f4604X = new C1(this, this.f4582B, 2);
        }
        this.f4604X.b(jMax);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03f4 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00de, B:20:0x00f7, B:22:0x0101, B:205:0x06c1, B:27:0x012f, B:30:0x0141, B:32:0x0147, B:47:0x018b, B:49:0x019d, B:52:0x01c4, B:54:0x01ce, B:56:0x01de, B:58:0x01ec, B:60:0x01fc, B:61:0x0207, B:62:0x020a, B:64:0x0220, B:115:0x042e, B:116:0x043a, B:119:0x0444, B:125:0x0467, B:122:0x0456, B:147:0x04ef, B:149:0x04fb, B:152:0x050c, B:154:0x051d, B:156:0x0529, B:172:0x0587, B:174:0x0591, B:175:0x059d, B:177:0x05a7, B:179:0x05b7, B:181:0x05c1, B:182:0x05d4, B:184:0x05da, B:185:0x05f3, B:187:0x05f9, B:188:0x0617, B:189:0x0625, B:193:0x064c, B:190:0x062b, B:192:0x0637, B:194:0x0653, B:195:0x0670, B:197:0x0676, B:199:0x0689, B:200:0x0696, B:202:0x069d, B:204:0x06ab, B:160:0x053b, B:162:0x0547, B:165:0x055a, B:167:0x056b, B:169:0x0577, B:129:0x046f, B:131:0x047b, B:133:0x0487, B:146:0x04d2, B:138:0x04aa, B:141:0x04bc, B:143:0x04c2, B:145:0x04cc, B:72:0x024a, B:75:0x0258, B:77:0x0266, B:81:0x02bb, B:78:0x028a, B:80:0x029a, B:85:0x02c8, B:87:0x02f2, B:88:0x031a, B:90:0x034f, B:92:0x0355, B:95:0x0361, B:97:0x0396, B:98:0x03b3, B:100:0x03bd, B:102:0x03cb, B:106:0x03df, B:103:0x03d3, B:109:0x03e6, B:112:0x03f4, B:113:0x0413, B:36:0x0151, B:38:0x015e, B:40:0x016c, B:42:0x0172, B:46:0x017d, B:208:0x06d9, B:210:0x06eb, B:212:0x06f4, B:223:0x0724, B:213:0x06fc, B:215:0x0705, B:217:0x070b, B:220:0x0717, B:222:0x071f, B:224:0x0727, B:225:0x0733, B:228:0x073b, B:230:0x074d, B:231:0x0758, B:233:0x0760, B:237:0x078f, B:239:0x07ab, B:241:0x07c0, B:243:0x07dc, B:245:0x07f1, B:247:0x083e, B:249:0x0844, B:255:0x086f, B:257:0x0877, B:258:0x0895, B:260:0x089b, B:261:0x08af, B:263:0x08c6, B:265:0x08d7, B:267:0x08e9, B:270:0x08f4, B:272:0x08fa, B:273:0x0910, B:275:0x0916, B:277:0x0926, B:279:0x0942, B:282:0x095e, B:284:0x0985, B:304:0x0acf, B:307:0x0adf, B:285:0x099e, B:287:0x09b2, B:289:0x09cf, B:291:0x09f6, B:293:0x0a28, B:294:0x0a35, B:296:0x0a4b, B:298:0x0a68, B:300:0x0a8f, B:302:0x0ac1, B:308:0x0ae7, B:310:0x0b44, B:311:0x0b57, B:314:0x0b5f, B:317:0x0b7e, B:319:0x0b97, B:321:0x0bac, B:323:0x0bb1, B:325:0x0bb5, B:327:0x0bb9, B:329:0x0bc3, B:331:0x0bcc, B:333:0x0bd0, B:335:0x0bd6, B:337:0x0be1, B:339:0x0bef, B:405:0x0e4e, B:341:0x0bf6, B:343:0x0c12, B:348:0x0c2f, B:350:0x0c51, B:351:0x0c59, B:353:0x0c5f, B:355:0x0c71, B:361:0x0c98, B:362:0x0cbb, B:364:0x0cc7, B:366:0x0cdf, B:368:0x0d22, B:374:0x0d3e, B:376:0x0d49, B:378:0x0d4d, B:380:0x0d51, B:382:0x0d55, B:383:0x0d61, B:384:0x0d66, B:386:0x0d6c, B:388:0x0d82, B:389:0x0d87, B:404:0x0e4b, B:391:0x0dc5, B:393:0x0dc9, B:397:0x0ddd, B:399:0x0df9, B:400:0x0e00, B:403:0x0e3f, B:394:0x0dce, B:359:0x0c82, B:346:0x0c18, B:406:0x0e54, B:408:0x0e5e, B:409:0x0e72, B:410:0x0e7a, B:412:0x0e80, B:413:0x0e94, B:415:0x0ea6, B:435:0x0f55, B:437:0x0f5b, B:439:0x0f70, B:442:0x0f77, B:447:0x0fba, B:443:0x0f86, B:445:0x0f94, B:446:0x0fa1, B:448:0x0fc9, B:416:0x0ec1, B:418:0x0ec7, B:420:0x0ed7, B:422:0x0ede, B:428:0x0ef4, B:430:0x0efb, B:432:0x0f46, B:434:0x0f4d, B:433:0x0f4a, B:429:0x0ef8, B:421:0x0edb, B:250:0x0854, B:252:0x085a, B:254:0x0860, B:244:0x07ee, B:240:0x07bd, B:234:0x0766, B:236:0x076c, B:449:0x0fe4), top: B:457:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0413 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00de, B:20:0x00f7, B:22:0x0101, B:205:0x06c1, B:27:0x012f, B:30:0x0141, B:32:0x0147, B:47:0x018b, B:49:0x019d, B:52:0x01c4, B:54:0x01ce, B:56:0x01de, B:58:0x01ec, B:60:0x01fc, B:61:0x0207, B:62:0x020a, B:64:0x0220, B:115:0x042e, B:116:0x043a, B:119:0x0444, B:125:0x0467, B:122:0x0456, B:147:0x04ef, B:149:0x04fb, B:152:0x050c, B:154:0x051d, B:156:0x0529, B:172:0x0587, B:174:0x0591, B:175:0x059d, B:177:0x05a7, B:179:0x05b7, B:181:0x05c1, B:182:0x05d4, B:184:0x05da, B:185:0x05f3, B:187:0x05f9, B:188:0x0617, B:189:0x0625, B:193:0x064c, B:190:0x062b, B:192:0x0637, B:194:0x0653, B:195:0x0670, B:197:0x0676, B:199:0x0689, B:200:0x0696, B:202:0x069d, B:204:0x06ab, B:160:0x053b, B:162:0x0547, B:165:0x055a, B:167:0x056b, B:169:0x0577, B:129:0x046f, B:131:0x047b, B:133:0x0487, B:146:0x04d2, B:138:0x04aa, B:141:0x04bc, B:143:0x04c2, B:145:0x04cc, B:72:0x024a, B:75:0x0258, B:77:0x0266, B:81:0x02bb, B:78:0x028a, B:80:0x029a, B:85:0x02c8, B:87:0x02f2, B:88:0x031a, B:90:0x034f, B:92:0x0355, B:95:0x0361, B:97:0x0396, B:98:0x03b3, B:100:0x03bd, B:102:0x03cb, B:106:0x03df, B:103:0x03d3, B:109:0x03e6, B:112:0x03f4, B:113:0x0413, B:36:0x0151, B:38:0x015e, B:40:0x016c, B:42:0x0172, B:46:0x017d, B:208:0x06d9, B:210:0x06eb, B:212:0x06f4, B:223:0x0724, B:213:0x06fc, B:215:0x0705, B:217:0x070b, B:220:0x0717, B:222:0x071f, B:224:0x0727, B:225:0x0733, B:228:0x073b, B:230:0x074d, B:231:0x0758, B:233:0x0760, B:237:0x078f, B:239:0x07ab, B:241:0x07c0, B:243:0x07dc, B:245:0x07f1, B:247:0x083e, B:249:0x0844, B:255:0x086f, B:257:0x0877, B:258:0x0895, B:260:0x089b, B:261:0x08af, B:263:0x08c6, B:265:0x08d7, B:267:0x08e9, B:270:0x08f4, B:272:0x08fa, B:273:0x0910, B:275:0x0916, B:277:0x0926, B:279:0x0942, B:282:0x095e, B:284:0x0985, B:304:0x0acf, B:307:0x0adf, B:285:0x099e, B:287:0x09b2, B:289:0x09cf, B:291:0x09f6, B:293:0x0a28, B:294:0x0a35, B:296:0x0a4b, B:298:0x0a68, B:300:0x0a8f, B:302:0x0ac1, B:308:0x0ae7, B:310:0x0b44, B:311:0x0b57, B:314:0x0b5f, B:317:0x0b7e, B:319:0x0b97, B:321:0x0bac, B:323:0x0bb1, B:325:0x0bb5, B:327:0x0bb9, B:329:0x0bc3, B:331:0x0bcc, B:333:0x0bd0, B:335:0x0bd6, B:337:0x0be1, B:339:0x0bef, B:405:0x0e4e, B:341:0x0bf6, B:343:0x0c12, B:348:0x0c2f, B:350:0x0c51, B:351:0x0c59, B:353:0x0c5f, B:355:0x0c71, B:361:0x0c98, B:362:0x0cbb, B:364:0x0cc7, B:366:0x0cdf, B:368:0x0d22, B:374:0x0d3e, B:376:0x0d49, B:378:0x0d4d, B:380:0x0d51, B:382:0x0d55, B:383:0x0d61, B:384:0x0d66, B:386:0x0d6c, B:388:0x0d82, B:389:0x0d87, B:404:0x0e4b, B:391:0x0dc5, B:393:0x0dc9, B:397:0x0ddd, B:399:0x0df9, B:400:0x0e00, B:403:0x0e3f, B:394:0x0dce, B:359:0x0c82, B:346:0x0c18, B:406:0x0e54, B:408:0x0e5e, B:409:0x0e72, B:410:0x0e7a, B:412:0x0e80, B:413:0x0e94, B:415:0x0ea6, B:435:0x0f55, B:437:0x0f5b, B:439:0x0f70, B:442:0x0f77, B:447:0x0fba, B:443:0x0f86, B:445:0x0f94, B:446:0x0fa1, B:448:0x0fc9, B:416:0x0ec1, B:418:0x0ec7, B:420:0x0ed7, B:422:0x0ede, B:428:0x0ef4, B:430:0x0efb, B:432:0x0f46, B:434:0x0f4d, B:433:0x0f4a, B:429:0x0ef8, B:421:0x0edb, B:250:0x0854, B:252:0x085a, B:254:0x0860, B:244:0x07ee, B:240:0x07bd, B:234:0x0766, B:236:0x076c, B:449:0x0fe4), top: B:457:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04fb A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00de, B:20:0x00f7, B:22:0x0101, B:205:0x06c1, B:27:0x012f, B:30:0x0141, B:32:0x0147, B:47:0x018b, B:49:0x019d, B:52:0x01c4, B:54:0x01ce, B:56:0x01de, B:58:0x01ec, B:60:0x01fc, B:61:0x0207, B:62:0x020a, B:64:0x0220, B:115:0x042e, B:116:0x043a, B:119:0x0444, B:125:0x0467, B:122:0x0456, B:147:0x04ef, B:149:0x04fb, B:152:0x050c, B:154:0x051d, B:156:0x0529, B:172:0x0587, B:174:0x0591, B:175:0x059d, B:177:0x05a7, B:179:0x05b7, B:181:0x05c1, B:182:0x05d4, B:184:0x05da, B:185:0x05f3, B:187:0x05f9, B:188:0x0617, B:189:0x0625, B:193:0x064c, B:190:0x062b, B:192:0x0637, B:194:0x0653, B:195:0x0670, B:197:0x0676, B:199:0x0689, B:200:0x0696, B:202:0x069d, B:204:0x06ab, B:160:0x053b, B:162:0x0547, B:165:0x055a, B:167:0x056b, B:169:0x0577, B:129:0x046f, B:131:0x047b, B:133:0x0487, B:146:0x04d2, B:138:0x04aa, B:141:0x04bc, B:143:0x04c2, B:145:0x04cc, B:72:0x024a, B:75:0x0258, B:77:0x0266, B:81:0x02bb, B:78:0x028a, B:80:0x029a, B:85:0x02c8, B:87:0x02f2, B:88:0x031a, B:90:0x034f, B:92:0x0355, B:95:0x0361, B:97:0x0396, B:98:0x03b3, B:100:0x03bd, B:102:0x03cb, B:106:0x03df, B:103:0x03d3, B:109:0x03e6, B:112:0x03f4, B:113:0x0413, B:36:0x0151, B:38:0x015e, B:40:0x016c, B:42:0x0172, B:46:0x017d, B:208:0x06d9, B:210:0x06eb, B:212:0x06f4, B:223:0x0724, B:213:0x06fc, B:215:0x0705, B:217:0x070b, B:220:0x0717, B:222:0x071f, B:224:0x0727, B:225:0x0733, B:228:0x073b, B:230:0x074d, B:231:0x0758, B:233:0x0760, B:237:0x078f, B:239:0x07ab, B:241:0x07c0, B:243:0x07dc, B:245:0x07f1, B:247:0x083e, B:249:0x0844, B:255:0x086f, B:257:0x0877, B:258:0x0895, B:260:0x089b, B:261:0x08af, B:263:0x08c6, B:265:0x08d7, B:267:0x08e9, B:270:0x08f4, B:272:0x08fa, B:273:0x0910, B:275:0x0916, B:277:0x0926, B:279:0x0942, B:282:0x095e, B:284:0x0985, B:304:0x0acf, B:307:0x0adf, B:285:0x099e, B:287:0x09b2, B:289:0x09cf, B:291:0x09f6, B:293:0x0a28, B:294:0x0a35, B:296:0x0a4b, B:298:0x0a68, B:300:0x0a8f, B:302:0x0ac1, B:308:0x0ae7, B:310:0x0b44, B:311:0x0b57, B:314:0x0b5f, B:317:0x0b7e, B:319:0x0b97, B:321:0x0bac, B:323:0x0bb1, B:325:0x0bb5, B:327:0x0bb9, B:329:0x0bc3, B:331:0x0bcc, B:333:0x0bd0, B:335:0x0bd6, B:337:0x0be1, B:339:0x0bef, B:405:0x0e4e, B:341:0x0bf6, B:343:0x0c12, B:348:0x0c2f, B:350:0x0c51, B:351:0x0c59, B:353:0x0c5f, B:355:0x0c71, B:361:0x0c98, B:362:0x0cbb, B:364:0x0cc7, B:366:0x0cdf, B:368:0x0d22, B:374:0x0d3e, B:376:0x0d49, B:378:0x0d4d, B:380:0x0d51, B:382:0x0d55, B:383:0x0d61, B:384:0x0d66, B:386:0x0d6c, B:388:0x0d82, B:389:0x0d87, B:404:0x0e4b, B:391:0x0dc5, B:393:0x0dc9, B:397:0x0ddd, B:399:0x0df9, B:400:0x0e00, B:403:0x0e3f, B:394:0x0dce, B:359:0x0c82, B:346:0x0c18, B:406:0x0e54, B:408:0x0e5e, B:409:0x0e72, B:410:0x0e7a, B:412:0x0e80, B:413:0x0e94, B:415:0x0ea6, B:435:0x0f55, B:437:0x0f5b, B:439:0x0f70, B:442:0x0f77, B:447:0x0fba, B:443:0x0f86, B:445:0x0f94, B:446:0x0fa1, B:448:0x0fc9, B:416:0x0ec1, B:418:0x0ec7, B:420:0x0ed7, B:422:0x0ede, B:428:0x0ef4, B:430:0x0efb, B:432:0x0f46, B:434:0x0f4d, B:433:0x0f4a, B:429:0x0ef8, B:421:0x0edb, B:250:0x0854, B:252:0x085a, B:254:0x0860, B:244:0x07ee, B:240:0x07bd, B:234:0x0766, B:236:0x076c, B:449:0x0fe4), top: B:457:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x053b A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00de, B:20:0x00f7, B:22:0x0101, B:205:0x06c1, B:27:0x012f, B:30:0x0141, B:32:0x0147, B:47:0x018b, B:49:0x019d, B:52:0x01c4, B:54:0x01ce, B:56:0x01de, B:58:0x01ec, B:60:0x01fc, B:61:0x0207, B:62:0x020a, B:64:0x0220, B:115:0x042e, B:116:0x043a, B:119:0x0444, B:125:0x0467, B:122:0x0456, B:147:0x04ef, B:149:0x04fb, B:152:0x050c, B:154:0x051d, B:156:0x0529, B:172:0x0587, B:174:0x0591, B:175:0x059d, B:177:0x05a7, B:179:0x05b7, B:181:0x05c1, B:182:0x05d4, B:184:0x05da, B:185:0x05f3, B:187:0x05f9, B:188:0x0617, B:189:0x0625, B:193:0x064c, B:190:0x062b, B:192:0x0637, B:194:0x0653, B:195:0x0670, B:197:0x0676, B:199:0x0689, B:200:0x0696, B:202:0x069d, B:204:0x06ab, B:160:0x053b, B:162:0x0547, B:165:0x055a, B:167:0x056b, B:169:0x0577, B:129:0x046f, B:131:0x047b, B:133:0x0487, B:146:0x04d2, B:138:0x04aa, B:141:0x04bc, B:143:0x04c2, B:145:0x04cc, B:72:0x024a, B:75:0x0258, B:77:0x0266, B:81:0x02bb, B:78:0x028a, B:80:0x029a, B:85:0x02c8, B:87:0x02f2, B:88:0x031a, B:90:0x034f, B:92:0x0355, B:95:0x0361, B:97:0x0396, B:98:0x03b3, B:100:0x03bd, B:102:0x03cb, B:106:0x03df, B:103:0x03d3, B:109:0x03e6, B:112:0x03f4, B:113:0x0413, B:36:0x0151, B:38:0x015e, B:40:0x016c, B:42:0x0172, B:46:0x017d, B:208:0x06d9, B:210:0x06eb, B:212:0x06f4, B:223:0x0724, B:213:0x06fc, B:215:0x0705, B:217:0x070b, B:220:0x0717, B:222:0x071f, B:224:0x0727, B:225:0x0733, B:228:0x073b, B:230:0x074d, B:231:0x0758, B:233:0x0760, B:237:0x078f, B:239:0x07ab, B:241:0x07c0, B:243:0x07dc, B:245:0x07f1, B:247:0x083e, B:249:0x0844, B:255:0x086f, B:257:0x0877, B:258:0x0895, B:260:0x089b, B:261:0x08af, B:263:0x08c6, B:265:0x08d7, B:267:0x08e9, B:270:0x08f4, B:272:0x08fa, B:273:0x0910, B:275:0x0916, B:277:0x0926, B:279:0x0942, B:282:0x095e, B:284:0x0985, B:304:0x0acf, B:307:0x0adf, B:285:0x099e, B:287:0x09b2, B:289:0x09cf, B:291:0x09f6, B:293:0x0a28, B:294:0x0a35, B:296:0x0a4b, B:298:0x0a68, B:300:0x0a8f, B:302:0x0ac1, B:308:0x0ae7, B:310:0x0b44, B:311:0x0b57, B:314:0x0b5f, B:317:0x0b7e, B:319:0x0b97, B:321:0x0bac, B:323:0x0bb1, B:325:0x0bb5, B:327:0x0bb9, B:329:0x0bc3, B:331:0x0bcc, B:333:0x0bd0, B:335:0x0bd6, B:337:0x0be1, B:339:0x0bef, B:405:0x0e4e, B:341:0x0bf6, B:343:0x0c12, B:348:0x0c2f, B:350:0x0c51, B:351:0x0c59, B:353:0x0c5f, B:355:0x0c71, B:361:0x0c98, B:362:0x0cbb, B:364:0x0cc7, B:366:0x0cdf, B:368:0x0d22, B:374:0x0d3e, B:376:0x0d49, B:378:0x0d4d, B:380:0x0d51, B:382:0x0d55, B:383:0x0d61, B:384:0x0d66, B:386:0x0d6c, B:388:0x0d82, B:389:0x0d87, B:404:0x0e4b, B:391:0x0dc5, B:393:0x0dc9, B:397:0x0ddd, B:399:0x0df9, B:400:0x0e00, B:403:0x0e3f, B:394:0x0dce, B:359:0x0c82, B:346:0x0c18, B:406:0x0e54, B:408:0x0e5e, B:409:0x0e72, B:410:0x0e7a, B:412:0x0e80, B:413:0x0e94, B:415:0x0ea6, B:435:0x0f55, B:437:0x0f5b, B:439:0x0f70, B:442:0x0f77, B:447:0x0fba, B:443:0x0f86, B:445:0x0f94, B:446:0x0fa1, B:448:0x0fc9, B:416:0x0ec1, B:418:0x0ec7, B:420:0x0ed7, B:422:0x0ede, B:428:0x0ef4, B:430:0x0efb, B:432:0x0f46, B:434:0x0f4d, B:433:0x0f4a, B:429:0x0ef8, B:421:0x0edb, B:250:0x0854, B:252:0x085a, B:254:0x0860, B:244:0x07ee, B:240:0x07bd, B:234:0x0766, B:236:0x076c, B:449:0x0fe4), top: B:457:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0591 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00de, B:20:0x00f7, B:22:0x0101, B:205:0x06c1, B:27:0x012f, B:30:0x0141, B:32:0x0147, B:47:0x018b, B:49:0x019d, B:52:0x01c4, B:54:0x01ce, B:56:0x01de, B:58:0x01ec, B:60:0x01fc, B:61:0x0207, B:62:0x020a, B:64:0x0220, B:115:0x042e, B:116:0x043a, B:119:0x0444, B:125:0x0467, B:122:0x0456, B:147:0x04ef, B:149:0x04fb, B:152:0x050c, B:154:0x051d, B:156:0x0529, B:172:0x0587, B:174:0x0591, B:175:0x059d, B:177:0x05a7, B:179:0x05b7, B:181:0x05c1, B:182:0x05d4, B:184:0x05da, B:185:0x05f3, B:187:0x05f9, B:188:0x0617, B:189:0x0625, B:193:0x064c, B:190:0x062b, B:192:0x0637, B:194:0x0653, B:195:0x0670, B:197:0x0676, B:199:0x0689, B:200:0x0696, B:202:0x069d, B:204:0x06ab, B:160:0x053b, B:162:0x0547, B:165:0x055a, B:167:0x056b, B:169:0x0577, B:129:0x046f, B:131:0x047b, B:133:0x0487, B:146:0x04d2, B:138:0x04aa, B:141:0x04bc, B:143:0x04c2, B:145:0x04cc, B:72:0x024a, B:75:0x0258, B:77:0x0266, B:81:0x02bb, B:78:0x028a, B:80:0x029a, B:85:0x02c8, B:87:0x02f2, B:88:0x031a, B:90:0x034f, B:92:0x0355, B:95:0x0361, B:97:0x0396, B:98:0x03b3, B:100:0x03bd, B:102:0x03cb, B:106:0x03df, B:103:0x03d3, B:109:0x03e6, B:112:0x03f4, B:113:0x0413, B:36:0x0151, B:38:0x015e, B:40:0x016c, B:42:0x0172, B:46:0x017d, B:208:0x06d9, B:210:0x06eb, B:212:0x06f4, B:223:0x0724, B:213:0x06fc, B:215:0x0705, B:217:0x070b, B:220:0x0717, B:222:0x071f, B:224:0x0727, B:225:0x0733, B:228:0x073b, B:230:0x074d, B:231:0x0758, B:233:0x0760, B:237:0x078f, B:239:0x07ab, B:241:0x07c0, B:243:0x07dc, B:245:0x07f1, B:247:0x083e, B:249:0x0844, B:255:0x086f, B:257:0x0877, B:258:0x0895, B:260:0x089b, B:261:0x08af, B:263:0x08c6, B:265:0x08d7, B:267:0x08e9, B:270:0x08f4, B:272:0x08fa, B:273:0x0910, B:275:0x0916, B:277:0x0926, B:279:0x0942, B:282:0x095e, B:284:0x0985, B:304:0x0acf, B:307:0x0adf, B:285:0x099e, B:287:0x09b2, B:289:0x09cf, B:291:0x09f6, B:293:0x0a28, B:294:0x0a35, B:296:0x0a4b, B:298:0x0a68, B:300:0x0a8f, B:302:0x0ac1, B:308:0x0ae7, B:310:0x0b44, B:311:0x0b57, B:314:0x0b5f, B:317:0x0b7e, B:319:0x0b97, B:321:0x0bac, B:323:0x0bb1, B:325:0x0bb5, B:327:0x0bb9, B:329:0x0bc3, B:331:0x0bcc, B:333:0x0bd0, B:335:0x0bd6, B:337:0x0be1, B:339:0x0bef, B:405:0x0e4e, B:341:0x0bf6, B:343:0x0c12, B:348:0x0c2f, B:350:0x0c51, B:351:0x0c59, B:353:0x0c5f, B:355:0x0c71, B:361:0x0c98, B:362:0x0cbb, B:364:0x0cc7, B:366:0x0cdf, B:368:0x0d22, B:374:0x0d3e, B:376:0x0d49, B:378:0x0d4d, B:380:0x0d51, B:382:0x0d55, B:383:0x0d61, B:384:0x0d66, B:386:0x0d6c, B:388:0x0d82, B:389:0x0d87, B:404:0x0e4b, B:391:0x0dc5, B:393:0x0dc9, B:397:0x0ddd, B:399:0x0df9, B:400:0x0e00, B:403:0x0e3f, B:394:0x0dce, B:359:0x0c82, B:346:0x0c18, B:406:0x0e54, B:408:0x0e5e, B:409:0x0e72, B:410:0x0e7a, B:412:0x0e80, B:413:0x0e94, B:415:0x0ea6, B:435:0x0f55, B:437:0x0f5b, B:439:0x0f70, B:442:0x0f77, B:447:0x0fba, B:443:0x0f86, B:445:0x0f94, B:446:0x0fa1, B:448:0x0fc9, B:416:0x0ec1, B:418:0x0ec7, B:420:0x0ed7, B:422:0x0ede, B:428:0x0ef4, B:430:0x0efb, B:432:0x0f46, B:434:0x0f4d, B:433:0x0f4a, B:429:0x0ef8, B:421:0x0edb, B:250:0x0854, B:252:0x085a, B:254:0x0860, B:244:0x07ee, B:240:0x07bd, B:234:0x0766, B:236:0x076c, B:449:0x0fe4), top: B:457:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06fc A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00de, B:20:0x00f7, B:22:0x0101, B:205:0x06c1, B:27:0x012f, B:30:0x0141, B:32:0x0147, B:47:0x018b, B:49:0x019d, B:52:0x01c4, B:54:0x01ce, B:56:0x01de, B:58:0x01ec, B:60:0x01fc, B:61:0x0207, B:62:0x020a, B:64:0x0220, B:115:0x042e, B:116:0x043a, B:119:0x0444, B:125:0x0467, B:122:0x0456, B:147:0x04ef, B:149:0x04fb, B:152:0x050c, B:154:0x051d, B:156:0x0529, B:172:0x0587, B:174:0x0591, B:175:0x059d, B:177:0x05a7, B:179:0x05b7, B:181:0x05c1, B:182:0x05d4, B:184:0x05da, B:185:0x05f3, B:187:0x05f9, B:188:0x0617, B:189:0x0625, B:193:0x064c, B:190:0x062b, B:192:0x0637, B:194:0x0653, B:195:0x0670, B:197:0x0676, B:199:0x0689, B:200:0x0696, B:202:0x069d, B:204:0x06ab, B:160:0x053b, B:162:0x0547, B:165:0x055a, B:167:0x056b, B:169:0x0577, B:129:0x046f, B:131:0x047b, B:133:0x0487, B:146:0x04d2, B:138:0x04aa, B:141:0x04bc, B:143:0x04c2, B:145:0x04cc, B:72:0x024a, B:75:0x0258, B:77:0x0266, B:81:0x02bb, B:78:0x028a, B:80:0x029a, B:85:0x02c8, B:87:0x02f2, B:88:0x031a, B:90:0x034f, B:92:0x0355, B:95:0x0361, B:97:0x0396, B:98:0x03b3, B:100:0x03bd, B:102:0x03cb, B:106:0x03df, B:103:0x03d3, B:109:0x03e6, B:112:0x03f4, B:113:0x0413, B:36:0x0151, B:38:0x015e, B:40:0x016c, B:42:0x0172, B:46:0x017d, B:208:0x06d9, B:210:0x06eb, B:212:0x06f4, B:223:0x0724, B:213:0x06fc, B:215:0x0705, B:217:0x070b, B:220:0x0717, B:222:0x071f, B:224:0x0727, B:225:0x0733, B:228:0x073b, B:230:0x074d, B:231:0x0758, B:233:0x0760, B:237:0x078f, B:239:0x07ab, B:241:0x07c0, B:243:0x07dc, B:245:0x07f1, B:247:0x083e, B:249:0x0844, B:255:0x086f, B:257:0x0877, B:258:0x0895, B:260:0x089b, B:261:0x08af, B:263:0x08c6, B:265:0x08d7, B:267:0x08e9, B:270:0x08f4, B:272:0x08fa, B:273:0x0910, B:275:0x0916, B:277:0x0926, B:279:0x0942, B:282:0x095e, B:284:0x0985, B:304:0x0acf, B:307:0x0adf, B:285:0x099e, B:287:0x09b2, B:289:0x09cf, B:291:0x09f6, B:293:0x0a28, B:294:0x0a35, B:296:0x0a4b, B:298:0x0a68, B:300:0x0a8f, B:302:0x0ac1, B:308:0x0ae7, B:310:0x0b44, B:311:0x0b57, B:314:0x0b5f, B:317:0x0b7e, B:319:0x0b97, B:321:0x0bac, B:323:0x0bb1, B:325:0x0bb5, B:327:0x0bb9, B:329:0x0bc3, B:331:0x0bcc, B:333:0x0bd0, B:335:0x0bd6, B:337:0x0be1, B:339:0x0bef, B:405:0x0e4e, B:341:0x0bf6, B:343:0x0c12, B:348:0x0c2f, B:350:0x0c51, B:351:0x0c59, B:353:0x0c5f, B:355:0x0c71, B:361:0x0c98, B:362:0x0cbb, B:364:0x0cc7, B:366:0x0cdf, B:368:0x0d22, B:374:0x0d3e, B:376:0x0d49, B:378:0x0d4d, B:380:0x0d51, B:382:0x0d55, B:383:0x0d61, B:384:0x0d66, B:386:0x0d6c, B:388:0x0d82, B:389:0x0d87, B:404:0x0e4b, B:391:0x0dc5, B:393:0x0dc9, B:397:0x0ddd, B:399:0x0df9, B:400:0x0e00, B:403:0x0e3f, B:394:0x0dce, B:359:0x0c82, B:346:0x0c18, B:406:0x0e54, B:408:0x0e5e, B:409:0x0e72, B:410:0x0e7a, B:412:0x0e80, B:413:0x0e94, B:415:0x0ea6, B:435:0x0f55, B:437:0x0f5b, B:439:0x0f70, B:442:0x0f77, B:447:0x0fba, B:443:0x0f86, B:445:0x0f94, B:446:0x0fa1, B:448:0x0fc9, B:416:0x0ec1, B:418:0x0ec7, B:420:0x0ed7, B:422:0x0ede, B:428:0x0ef4, B:430:0x0efb, B:432:0x0f46, B:434:0x0f4d, B:433:0x0f4a, B:429:0x0ef8, B:421:0x0edb, B:250:0x0854, B:252:0x085a, B:254:0x0860, B:244:0x07ee, B:240:0x07bd, B:234:0x0766, B:236:0x076c, B:449:0x0fe4), top: B:457:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0c51 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00de, B:20:0x00f7, B:22:0x0101, B:205:0x06c1, B:27:0x012f, B:30:0x0141, B:32:0x0147, B:47:0x018b, B:49:0x019d, B:52:0x01c4, B:54:0x01ce, B:56:0x01de, B:58:0x01ec, B:60:0x01fc, B:61:0x0207, B:62:0x020a, B:64:0x0220, B:115:0x042e, B:116:0x043a, B:119:0x0444, B:125:0x0467, B:122:0x0456, B:147:0x04ef, B:149:0x04fb, B:152:0x050c, B:154:0x051d, B:156:0x0529, B:172:0x0587, B:174:0x0591, B:175:0x059d, B:177:0x05a7, B:179:0x05b7, B:181:0x05c1, B:182:0x05d4, B:184:0x05da, B:185:0x05f3, B:187:0x05f9, B:188:0x0617, B:189:0x0625, B:193:0x064c, B:190:0x062b, B:192:0x0637, B:194:0x0653, B:195:0x0670, B:197:0x0676, B:199:0x0689, B:200:0x0696, B:202:0x069d, B:204:0x06ab, B:160:0x053b, B:162:0x0547, B:165:0x055a, B:167:0x056b, B:169:0x0577, B:129:0x046f, B:131:0x047b, B:133:0x0487, B:146:0x04d2, B:138:0x04aa, B:141:0x04bc, B:143:0x04c2, B:145:0x04cc, B:72:0x024a, B:75:0x0258, B:77:0x0266, B:81:0x02bb, B:78:0x028a, B:80:0x029a, B:85:0x02c8, B:87:0x02f2, B:88:0x031a, B:90:0x034f, B:92:0x0355, B:95:0x0361, B:97:0x0396, B:98:0x03b3, B:100:0x03bd, B:102:0x03cb, B:106:0x03df, B:103:0x03d3, B:109:0x03e6, B:112:0x03f4, B:113:0x0413, B:36:0x0151, B:38:0x015e, B:40:0x016c, B:42:0x0172, B:46:0x017d, B:208:0x06d9, B:210:0x06eb, B:212:0x06f4, B:223:0x0724, B:213:0x06fc, B:215:0x0705, B:217:0x070b, B:220:0x0717, B:222:0x071f, B:224:0x0727, B:225:0x0733, B:228:0x073b, B:230:0x074d, B:231:0x0758, B:233:0x0760, B:237:0x078f, B:239:0x07ab, B:241:0x07c0, B:243:0x07dc, B:245:0x07f1, B:247:0x083e, B:249:0x0844, B:255:0x086f, B:257:0x0877, B:258:0x0895, B:260:0x089b, B:261:0x08af, B:263:0x08c6, B:265:0x08d7, B:267:0x08e9, B:270:0x08f4, B:272:0x08fa, B:273:0x0910, B:275:0x0916, B:277:0x0926, B:279:0x0942, B:282:0x095e, B:284:0x0985, B:304:0x0acf, B:307:0x0adf, B:285:0x099e, B:287:0x09b2, B:289:0x09cf, B:291:0x09f6, B:293:0x0a28, B:294:0x0a35, B:296:0x0a4b, B:298:0x0a68, B:300:0x0a8f, B:302:0x0ac1, B:308:0x0ae7, B:310:0x0b44, B:311:0x0b57, B:314:0x0b5f, B:317:0x0b7e, B:319:0x0b97, B:321:0x0bac, B:323:0x0bb1, B:325:0x0bb5, B:327:0x0bb9, B:329:0x0bc3, B:331:0x0bcc, B:333:0x0bd0, B:335:0x0bd6, B:337:0x0be1, B:339:0x0bef, B:405:0x0e4e, B:341:0x0bf6, B:343:0x0c12, B:348:0x0c2f, B:350:0x0c51, B:351:0x0c59, B:353:0x0c5f, B:355:0x0c71, B:361:0x0c98, B:362:0x0cbb, B:364:0x0cc7, B:366:0x0cdf, B:368:0x0d22, B:374:0x0d3e, B:376:0x0d49, B:378:0x0d4d, B:380:0x0d51, B:382:0x0d55, B:383:0x0d61, B:384:0x0d66, B:386:0x0d6c, B:388:0x0d82, B:389:0x0d87, B:404:0x0e4b, B:391:0x0dc5, B:393:0x0dc9, B:397:0x0ddd, B:399:0x0df9, B:400:0x0e00, B:403:0x0e3f, B:394:0x0dce, B:359:0x0c82, B:346:0x0c18, B:406:0x0e54, B:408:0x0e5e, B:409:0x0e72, B:410:0x0e7a, B:412:0x0e80, B:413:0x0e94, B:415:0x0ea6, B:435:0x0f55, B:437:0x0f5b, B:439:0x0f70, B:442:0x0f77, B:447:0x0fba, B:443:0x0f86, B:445:0x0f94, B:446:0x0fa1, B:448:0x0fc9, B:416:0x0ec1, B:418:0x0ec7, B:420:0x0ed7, B:422:0x0ede, B:428:0x0ef4, B:430:0x0efb, B:432:0x0f46, B:434:0x0f4d, B:433:0x0f4a, B:429:0x0ef8, B:421:0x0edb, B:250:0x0854, B:252:0x085a, B:254:0x0860, B:244:0x07ee, B:240:0x07bd, B:234:0x0766, B:236:0x076c, B:449:0x0fe4), top: B:457:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0c82 A[Catch: all -> 0x011e, EDGE_INSN: B:507:0x0c82->B:359:0x0c82 BREAK  A[LOOP:16: B:351:0x0c59->B:509:?], TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00de, B:20:0x00f7, B:22:0x0101, B:205:0x06c1, B:27:0x012f, B:30:0x0141, B:32:0x0147, B:47:0x018b, B:49:0x019d, B:52:0x01c4, B:54:0x01ce, B:56:0x01de, B:58:0x01ec, B:60:0x01fc, B:61:0x0207, B:62:0x020a, B:64:0x0220, B:115:0x042e, B:116:0x043a, B:119:0x0444, B:125:0x0467, B:122:0x0456, B:147:0x04ef, B:149:0x04fb, B:152:0x050c, B:154:0x051d, B:156:0x0529, B:172:0x0587, B:174:0x0591, B:175:0x059d, B:177:0x05a7, B:179:0x05b7, B:181:0x05c1, B:182:0x05d4, B:184:0x05da, B:185:0x05f3, B:187:0x05f9, B:188:0x0617, B:189:0x0625, B:193:0x064c, B:190:0x062b, B:192:0x0637, B:194:0x0653, B:195:0x0670, B:197:0x0676, B:199:0x0689, B:200:0x0696, B:202:0x069d, B:204:0x06ab, B:160:0x053b, B:162:0x0547, B:165:0x055a, B:167:0x056b, B:169:0x0577, B:129:0x046f, B:131:0x047b, B:133:0x0487, B:146:0x04d2, B:138:0x04aa, B:141:0x04bc, B:143:0x04c2, B:145:0x04cc, B:72:0x024a, B:75:0x0258, B:77:0x0266, B:81:0x02bb, B:78:0x028a, B:80:0x029a, B:85:0x02c8, B:87:0x02f2, B:88:0x031a, B:90:0x034f, B:92:0x0355, B:95:0x0361, B:97:0x0396, B:98:0x03b3, B:100:0x03bd, B:102:0x03cb, B:106:0x03df, B:103:0x03d3, B:109:0x03e6, B:112:0x03f4, B:113:0x0413, B:36:0x0151, B:38:0x015e, B:40:0x016c, B:42:0x0172, B:46:0x017d, B:208:0x06d9, B:210:0x06eb, B:212:0x06f4, B:223:0x0724, B:213:0x06fc, B:215:0x0705, B:217:0x070b, B:220:0x0717, B:222:0x071f, B:224:0x0727, B:225:0x0733, B:228:0x073b, B:230:0x074d, B:231:0x0758, B:233:0x0760, B:237:0x078f, B:239:0x07ab, B:241:0x07c0, B:243:0x07dc, B:245:0x07f1, B:247:0x083e, B:249:0x0844, B:255:0x086f, B:257:0x0877, B:258:0x0895, B:260:0x089b, B:261:0x08af, B:263:0x08c6, B:265:0x08d7, B:267:0x08e9, B:270:0x08f4, B:272:0x08fa, B:273:0x0910, B:275:0x0916, B:277:0x0926, B:279:0x0942, B:282:0x095e, B:284:0x0985, B:304:0x0acf, B:307:0x0adf, B:285:0x099e, B:287:0x09b2, B:289:0x09cf, B:291:0x09f6, B:293:0x0a28, B:294:0x0a35, B:296:0x0a4b, B:298:0x0a68, B:300:0x0a8f, B:302:0x0ac1, B:308:0x0ae7, B:310:0x0b44, B:311:0x0b57, B:314:0x0b5f, B:317:0x0b7e, B:319:0x0b97, B:321:0x0bac, B:323:0x0bb1, B:325:0x0bb5, B:327:0x0bb9, B:329:0x0bc3, B:331:0x0bcc, B:333:0x0bd0, B:335:0x0bd6, B:337:0x0be1, B:339:0x0bef, B:405:0x0e4e, B:341:0x0bf6, B:343:0x0c12, B:348:0x0c2f, B:350:0x0c51, B:351:0x0c59, B:353:0x0c5f, B:355:0x0c71, B:361:0x0c98, B:362:0x0cbb, B:364:0x0cc7, B:366:0x0cdf, B:368:0x0d22, B:374:0x0d3e, B:376:0x0d49, B:378:0x0d4d, B:380:0x0d51, B:382:0x0d55, B:383:0x0d61, B:384:0x0d66, B:386:0x0d6c, B:388:0x0d82, B:389:0x0d87, B:404:0x0e4b, B:391:0x0dc5, B:393:0x0dc9, B:397:0x0ddd, B:399:0x0df9, B:400:0x0e00, B:403:0x0e3f, B:394:0x0dce, B:359:0x0c82, B:346:0x0c18, B:406:0x0e54, B:408:0x0e5e, B:409:0x0e72, B:410:0x0e7a, B:412:0x0e80, B:413:0x0e94, B:415:0x0ea6, B:435:0x0f55, B:437:0x0f5b, B:439:0x0f70, B:442:0x0f77, B:447:0x0fba, B:443:0x0f86, B:445:0x0f94, B:446:0x0fa1, B:448:0x0fc9, B:416:0x0ec1, B:418:0x0ec7, B:420:0x0ed7, B:422:0x0ede, B:428:0x0ef4, B:430:0x0efb, B:432:0x0f46, B:434:0x0f4d, B:433:0x0f4a, B:429:0x0ef8, B:421:0x0edb, B:250:0x0854, B:252:0x085a, B:254:0x0860, B:244:0x07ee, B:240:0x07bd, B:234:0x0766, B:236:0x076c, B:449:0x0fe4), top: B:457:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0c98 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00de, B:20:0x00f7, B:22:0x0101, B:205:0x06c1, B:27:0x012f, B:30:0x0141, B:32:0x0147, B:47:0x018b, B:49:0x019d, B:52:0x01c4, B:54:0x01ce, B:56:0x01de, B:58:0x01ec, B:60:0x01fc, B:61:0x0207, B:62:0x020a, B:64:0x0220, B:115:0x042e, B:116:0x043a, B:119:0x0444, B:125:0x0467, B:122:0x0456, B:147:0x04ef, B:149:0x04fb, B:152:0x050c, B:154:0x051d, B:156:0x0529, B:172:0x0587, B:174:0x0591, B:175:0x059d, B:177:0x05a7, B:179:0x05b7, B:181:0x05c1, B:182:0x05d4, B:184:0x05da, B:185:0x05f3, B:187:0x05f9, B:188:0x0617, B:189:0x0625, B:193:0x064c, B:190:0x062b, B:192:0x0637, B:194:0x0653, B:195:0x0670, B:197:0x0676, B:199:0x0689, B:200:0x0696, B:202:0x069d, B:204:0x06ab, B:160:0x053b, B:162:0x0547, B:165:0x055a, B:167:0x056b, B:169:0x0577, B:129:0x046f, B:131:0x047b, B:133:0x0487, B:146:0x04d2, B:138:0x04aa, B:141:0x04bc, B:143:0x04c2, B:145:0x04cc, B:72:0x024a, B:75:0x0258, B:77:0x0266, B:81:0x02bb, B:78:0x028a, B:80:0x029a, B:85:0x02c8, B:87:0x02f2, B:88:0x031a, B:90:0x034f, B:92:0x0355, B:95:0x0361, B:97:0x0396, B:98:0x03b3, B:100:0x03bd, B:102:0x03cb, B:106:0x03df, B:103:0x03d3, B:109:0x03e6, B:112:0x03f4, B:113:0x0413, B:36:0x0151, B:38:0x015e, B:40:0x016c, B:42:0x0172, B:46:0x017d, B:208:0x06d9, B:210:0x06eb, B:212:0x06f4, B:223:0x0724, B:213:0x06fc, B:215:0x0705, B:217:0x070b, B:220:0x0717, B:222:0x071f, B:224:0x0727, B:225:0x0733, B:228:0x073b, B:230:0x074d, B:231:0x0758, B:233:0x0760, B:237:0x078f, B:239:0x07ab, B:241:0x07c0, B:243:0x07dc, B:245:0x07f1, B:247:0x083e, B:249:0x0844, B:255:0x086f, B:257:0x0877, B:258:0x0895, B:260:0x089b, B:261:0x08af, B:263:0x08c6, B:265:0x08d7, B:267:0x08e9, B:270:0x08f4, B:272:0x08fa, B:273:0x0910, B:275:0x0916, B:277:0x0926, B:279:0x0942, B:282:0x095e, B:284:0x0985, B:304:0x0acf, B:307:0x0adf, B:285:0x099e, B:287:0x09b2, B:289:0x09cf, B:291:0x09f6, B:293:0x0a28, B:294:0x0a35, B:296:0x0a4b, B:298:0x0a68, B:300:0x0a8f, B:302:0x0ac1, B:308:0x0ae7, B:310:0x0b44, B:311:0x0b57, B:314:0x0b5f, B:317:0x0b7e, B:319:0x0b97, B:321:0x0bac, B:323:0x0bb1, B:325:0x0bb5, B:327:0x0bb9, B:329:0x0bc3, B:331:0x0bcc, B:333:0x0bd0, B:335:0x0bd6, B:337:0x0be1, B:339:0x0bef, B:405:0x0e4e, B:341:0x0bf6, B:343:0x0c12, B:348:0x0c2f, B:350:0x0c51, B:351:0x0c59, B:353:0x0c5f, B:355:0x0c71, B:361:0x0c98, B:362:0x0cbb, B:364:0x0cc7, B:366:0x0cdf, B:368:0x0d22, B:374:0x0d3e, B:376:0x0d49, B:378:0x0d4d, B:380:0x0d51, B:382:0x0d55, B:383:0x0d61, B:384:0x0d66, B:386:0x0d6c, B:388:0x0d82, B:389:0x0d87, B:404:0x0e4b, B:391:0x0dc5, B:393:0x0dc9, B:397:0x0ddd, B:399:0x0df9, B:400:0x0e00, B:403:0x0e3f, B:394:0x0dce, B:359:0x0c82, B:346:0x0c18, B:406:0x0e54, B:408:0x0e5e, B:409:0x0e72, B:410:0x0e7a, B:412:0x0e80, B:413:0x0e94, B:415:0x0ea6, B:435:0x0f55, B:437:0x0f5b, B:439:0x0f70, B:442:0x0f77, B:447:0x0fba, B:443:0x0f86, B:445:0x0f94, B:446:0x0fa1, B:448:0x0fc9, B:416:0x0ec1, B:418:0x0ec7, B:420:0x0ed7, B:422:0x0ede, B:428:0x0ef4, B:430:0x0efb, B:432:0x0f46, B:434:0x0f4d, B:433:0x0f4a, B:429:0x0ef8, B:421:0x0edb, B:250:0x0854, B:252:0x085a, B:254:0x0860, B:244:0x07ee, B:240:0x07bd, B:234:0x0766, B:236:0x076c, B:449:0x0fe4), top: B:457:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0cbb A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00de, B:20:0x00f7, B:22:0x0101, B:205:0x06c1, B:27:0x012f, B:30:0x0141, B:32:0x0147, B:47:0x018b, B:49:0x019d, B:52:0x01c4, B:54:0x01ce, B:56:0x01de, B:58:0x01ec, B:60:0x01fc, B:61:0x0207, B:62:0x020a, B:64:0x0220, B:115:0x042e, B:116:0x043a, B:119:0x0444, B:125:0x0467, B:122:0x0456, B:147:0x04ef, B:149:0x04fb, B:152:0x050c, B:154:0x051d, B:156:0x0529, B:172:0x0587, B:174:0x0591, B:175:0x059d, B:177:0x05a7, B:179:0x05b7, B:181:0x05c1, B:182:0x05d4, B:184:0x05da, B:185:0x05f3, B:187:0x05f9, B:188:0x0617, B:189:0x0625, B:193:0x064c, B:190:0x062b, B:192:0x0637, B:194:0x0653, B:195:0x0670, B:197:0x0676, B:199:0x0689, B:200:0x0696, B:202:0x069d, B:204:0x06ab, B:160:0x053b, B:162:0x0547, B:165:0x055a, B:167:0x056b, B:169:0x0577, B:129:0x046f, B:131:0x047b, B:133:0x0487, B:146:0x04d2, B:138:0x04aa, B:141:0x04bc, B:143:0x04c2, B:145:0x04cc, B:72:0x024a, B:75:0x0258, B:77:0x0266, B:81:0x02bb, B:78:0x028a, B:80:0x029a, B:85:0x02c8, B:87:0x02f2, B:88:0x031a, B:90:0x034f, B:92:0x0355, B:95:0x0361, B:97:0x0396, B:98:0x03b3, B:100:0x03bd, B:102:0x03cb, B:106:0x03df, B:103:0x03d3, B:109:0x03e6, B:112:0x03f4, B:113:0x0413, B:36:0x0151, B:38:0x015e, B:40:0x016c, B:42:0x0172, B:46:0x017d, B:208:0x06d9, B:210:0x06eb, B:212:0x06f4, B:223:0x0724, B:213:0x06fc, B:215:0x0705, B:217:0x070b, B:220:0x0717, B:222:0x071f, B:224:0x0727, B:225:0x0733, B:228:0x073b, B:230:0x074d, B:231:0x0758, B:233:0x0760, B:237:0x078f, B:239:0x07ab, B:241:0x07c0, B:243:0x07dc, B:245:0x07f1, B:247:0x083e, B:249:0x0844, B:255:0x086f, B:257:0x0877, B:258:0x0895, B:260:0x089b, B:261:0x08af, B:263:0x08c6, B:265:0x08d7, B:267:0x08e9, B:270:0x08f4, B:272:0x08fa, B:273:0x0910, B:275:0x0916, B:277:0x0926, B:279:0x0942, B:282:0x095e, B:284:0x0985, B:304:0x0acf, B:307:0x0adf, B:285:0x099e, B:287:0x09b2, B:289:0x09cf, B:291:0x09f6, B:293:0x0a28, B:294:0x0a35, B:296:0x0a4b, B:298:0x0a68, B:300:0x0a8f, B:302:0x0ac1, B:308:0x0ae7, B:310:0x0b44, B:311:0x0b57, B:314:0x0b5f, B:317:0x0b7e, B:319:0x0b97, B:321:0x0bac, B:323:0x0bb1, B:325:0x0bb5, B:327:0x0bb9, B:329:0x0bc3, B:331:0x0bcc, B:333:0x0bd0, B:335:0x0bd6, B:337:0x0be1, B:339:0x0bef, B:405:0x0e4e, B:341:0x0bf6, B:343:0x0c12, B:348:0x0c2f, B:350:0x0c51, B:351:0x0c59, B:353:0x0c5f, B:355:0x0c71, B:361:0x0c98, B:362:0x0cbb, B:364:0x0cc7, B:366:0x0cdf, B:368:0x0d22, B:374:0x0d3e, B:376:0x0d49, B:378:0x0d4d, B:380:0x0d51, B:382:0x0d55, B:383:0x0d61, B:384:0x0d66, B:386:0x0d6c, B:388:0x0d82, B:389:0x0d87, B:404:0x0e4b, B:391:0x0dc5, B:393:0x0dc9, B:397:0x0ddd, B:399:0x0df9, B:400:0x0e00, B:403:0x0e3f, B:394:0x0dce, B:359:0x0c82, B:346:0x0c18, B:406:0x0e54, B:408:0x0e5e, B:409:0x0e72, B:410:0x0e7a, B:412:0x0e80, B:413:0x0e94, B:415:0x0ea6, B:435:0x0f55, B:437:0x0f5b, B:439:0x0f70, B:442:0x0f77, B:447:0x0fba, B:443:0x0f86, B:445:0x0f94, B:446:0x0fa1, B:448:0x0fc9, B:416:0x0ec1, B:418:0x0ec7, B:420:0x0ed7, B:422:0x0ede, B:428:0x0ef4, B:430:0x0efb, B:432:0x0f46, B:434:0x0f4d, B:433:0x0f4a, B:429:0x0ef8, B:421:0x0edb, B:250:0x0854, B:252:0x085a, B:254:0x0860, B:244:0x07ee, B:240:0x07bd, B:234:0x0766, B:236:0x076c, B:449:0x0fe4), top: B:457:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G(java.lang.String r48, long r49) {
        /*
            r47 = this;
            r1 = r47
            java.lang.String r0 = "1"
            java.lang.String r2 = "_ai"
            java.lang.String r3 = "purchase"
            java.lang.String r4 = "items"
            r5 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            O3.n r8 = r1.f0()
            r8.c0()
            O3.g0 r15 = new O3.g0     // Catch: java.lang.Throwable -> L11e
            r15.<init>(r1)     // Catch: java.lang.Throwable -> L11e
            O3.n r9 = r1.f0()     // Catch: java.lang.Throwable -> L11e
            long r13 = r1.f4597Q     // Catch: java.lang.Throwable -> L11e
            r10 = r48
            r11 = r49
            r9.a0(r10, r11, r13, r15)     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r8 = r15.f4862d     // Catch: java.lang.Throwable -> L11e
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch: java.lang.Throwable -> L11e
            if (r8 == 0) goto L35
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L11e
            if (r8 == 0) goto L38
        L35:
            r4 = 0
            goto Lfe4
        L38:
            java.lang.Object r8 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r8 = (com.google.android.gms.internal.measurement.C0859s1) r8     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.p2 r8 = r8.i()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.r1 r8 = (com.google.android.gms.internal.measurement.C0854r1) r8     // Catch: java.lang.Throwable -> L11e
            r8.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r10 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r10 = (com.google.android.gms.internal.measurement.C0859s1) r10     // Catch: java.lang.Throwable -> L11e
            r10.a0()     // Catch: java.lang.Throwable -> L11e
            r9 = -1
            r11 = -1
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L57:
            java.lang.Object r10 = r15.f4862d     // Catch: java.lang.Throwable -> L11e
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch: java.lang.Throwable -> L11e
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = "_et"
            java.lang.String r6 = "_fr"
            r21 = r13
            java.lang.String r13 = "_e"
            r22 = r14
            O3.t0 r14 = r1.f4582B
            r23 = r14
            java.lang.String r14 = "_c"
            r24 = r7
            if (r12 >= r10) goto L6ce
            java.lang.Object r10 = r15.f4862d     // Catch: java.lang.Throwable -> L11e
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r10 = r10.get(r12)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r10 = (com.google.android.gms.internal.measurement.C0820k1) r10     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.p2 r10 = r10.i()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.j1 r10 = (com.google.android.gms.internal.measurement.C0815j1) r10     // Catch: java.lang.Throwable -> L11e
            r25 = 1
            O3.l0 r7 = r1.e0()     // Catch: java.lang.Throwable -> L11e
            r26 = r12
            java.lang.Object r12 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r12 = (com.google.android.gms.internal.measurement.C0859s1) r12     // Catch: java.lang.Throwable -> L11e
            java.lang.String r12 = r12.p()     // Catch: java.lang.Throwable -> L11e
            r27 = r4
            java.lang.String r4 = r10.l()     // Catch: java.lang.Throwable -> L11e
            boolean r4 = r7.D(r12, r4)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r7 = "_err"
            if (r4 == 0) goto L12f
            O3.X r4 = r1.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r4 = r4.t()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = "Dropping blocked raw event. appId"
            java.lang.Object r6 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r6 = (com.google.android.gms.internal.measurement.C0859s1) r6     // Catch: java.lang.Throwable -> L11e
            java.lang.String r6 = r6.p()     // Catch: java.lang.Throwable -> L11e
            O3.W r6 = O3.X.w(r6)     // Catch: java.lang.Throwable -> L11e
            O3.Q r12 = r23.m()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r13 = r10.l()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r12 = r12.a(r13)     // Catch: java.lang.Throwable -> L11e
            r4.d(r6, r12, r5)     // Catch: java.lang.Throwable -> L11e
            O3.l0 r4 = r1.e0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r5 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = r5.p()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r6 = "measurement.upload.blacklist_internal"
            java.lang.String r4 = r4.a(r5, r6)     // Catch: java.lang.Throwable -> L11e
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Throwable -> L11e
            if (r4 != 0) goto L121
            O3.l0 r4 = r1.e0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r5 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = r5.p()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r6 = "measurement.upload.blacklist_public"
            java.lang.String r4 = r4.a(r5, r6)     // Catch: java.lang.Throwable -> L11e
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Throwable -> L11e
            if (r4 == 0) goto Lf7
            goto L121
        Lf7:
            java.lang.String r4 = r10.l()     // Catch: java.lang.Throwable -> L11e
            boolean r4 = r7.equals(r4)     // Catch: java.lang.Throwable -> L11e
            if (r4 != 0) goto L121
            r1.j0()     // Catch: java.lang.Throwable -> L11e
            k3.d r4 = r1.f4606Z     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r5 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5     // Catch: java.lang.Throwable -> L11e
            java.lang.String r29 = r5.p()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r31 = "_ev"
            java.lang.String r32 = r10.l()     // Catch: java.lang.Throwable -> L11e
            r33 = 0
            r30 = 11
            r28 = r4
            O3.Y1.E(r28, r29, r30, r31, r32, r33)     // Catch: java.lang.Throwable -> L11e
            goto L121
        L11e:
            r0 = move-exception
            goto Lff4
        L121:
            r30 = r2
            r31 = r3
            r13 = r21
            r4 = r26
            r7 = r27
        L12b:
            r14 = r22
            goto L6c1
        L12f:
            java.lang.String r4 = r10.l()     // Catch: java.lang.Throwable -> L11e
            boolean r12 = r4.equals(r3)     // Catch: java.lang.Throwable -> L11e
            r28 = r12
            java.lang.String r12 = "ecommerce_purchase"
            r29 = r11
            java.lang.String r11 = "_iap"
            if (r28 != 0) goto L151
            boolean r28 = r4.equals(r11)     // Catch: java.lang.Throwable -> L11e
            if (r28 != 0) goto L151
            boolean r4 = r4.equals(r12)     // Catch: java.lang.Throwable -> L11e
            if (r4 == 0) goto L14e
            goto L151
        L14e:
            r28 = r5
            goto L18b
        L151:
            com.google.android.gms.internal.measurement.m1 r4 = com.google.android.gms.internal.measurement.C0835n1.B()     // Catch: java.lang.Throwable -> L11e
            r28 = r5
            java.lang.String r5 = "_ct"
            r4.h(r5)     // Catch: java.lang.Throwable -> L11e
            if (r22 != 0) goto L17b
            java.lang.Object r5 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = r5.p()     // Catch: java.lang.Throwable -> L11e
            boolean r22 = r1.P(r5, r3)     // Catch: java.lang.Throwable -> L11e
            if (r22 == 0) goto L17b
            boolean r11 = r1.P(r5, r11)     // Catch: java.lang.Throwable -> L11e
            if (r11 == 0) goto L17b
            boolean r5 = r1.P(r5, r12)     // Catch: java.lang.Throwable -> L11e
            if (r5 == 0) goto L17b
            java.lang.String r5 = "new"
            goto L17d
        L17b:
            java.lang.String r5 = "returning"
        L17d:
            r4.i(r5)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r4 = r4.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r4 = (com.google.android.gms.internal.measurement.C0835n1) r4     // Catch: java.lang.Throwable -> L11e
            r10.j(r4)     // Catch: java.lang.Throwable -> L11e
            r22 = r25
        L18b:
            java.lang.String r4 = r10.l()     // Catch: java.lang.Throwable -> L11e
            java.lang.String[] r5 = O3.K0.f4504c     // Catch: java.lang.Throwable -> L11e
            java.lang.String[] r11 = O3.K0.f4502a     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = O3.K0.g(r2, r5, r11)     // Catch: java.lang.Throwable -> L11e
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L11e
            if (r4 == 0) goto L20a
            r10.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r4 = r10.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r4 = (com.google.android.gms.internal.measurement.C0820k1) r4     // Catch: java.lang.Throwable -> L11e
            r4.F(r2)     // Catch: java.lang.Throwable -> L11e
            O3.X r4 = r1.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r4 = r4.v()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = "Renaming ad_impression to _ai"
            r4.b(r5)     // Catch: java.lang.Throwable -> L11e
            O3.X r4 = r1.b()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r4 = r4.y()     // Catch: java.lang.Throwable -> L11e
            r5 = 5
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch: java.lang.Throwable -> L11e
            if (r4 == 0) goto L20a
            r4 = 0
        L1c4:
            com.google.android.gms.internal.measurement.q2 r5 = r10.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r5 = (com.google.android.gms.internal.measurement.C0820k1) r5     // Catch: java.lang.Throwable -> L11e
            int r5 = r5.q()     // Catch: java.lang.Throwable -> L11e
            if (r4 >= r5) goto L20a
            java.lang.String r5 = "ad_platform"
            com.google.android.gms.internal.measurement.n1 r11 = r10.i(r4)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = r11.q()     // Catch: java.lang.Throwable -> L11e
            boolean r5 = r5.equals(r11)     // Catch: java.lang.Throwable -> L11e
            if (r5 == 0) goto L207
            com.google.android.gms.internal.measurement.n1 r5 = r10.i(r4)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = r5.s()     // Catch: java.lang.Throwable -> L11e
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L11e
            if (r5 != 0) goto L207
            java.lang.String r5 = "admob"
            com.google.android.gms.internal.measurement.n1 r11 = r10.i(r4)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = r11.s()     // Catch: java.lang.Throwable -> L11e
            boolean r5 = r5.equalsIgnoreCase(r11)     // Catch: java.lang.Throwable -> L11e
            if (r5 == 0) goto L207
            O3.X r5 = r1.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r5 = r5.f4663B     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = "AdMob ad impression logged from app. Potentially duplicative."
            r5.b(r11)     // Catch: java.lang.Throwable -> L11e
        L207:
            int r4 = r4 + 1
            goto L1c4
        L20a:
            O3.l0 r4 = r1.e0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r5 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = r5.p()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = r10.l()     // Catch: java.lang.Throwable -> L11e
            boolean r4 = r4.E(r5, r11)     // Catch: java.lang.Throwable -> L11e
            if (r4 != 0) goto L23c
            r1.i0()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = r10.l()     // Catch: java.lang.Throwable -> L11e
            x3.AbstractC1887A.d(r5)     // Catch: java.lang.Throwable -> L11e
            int r11 = r5.hashCode()     // Catch: java.lang.Throwable -> L11e
            r12 = 95027(0x17333, float:1.33161E-40)
            if (r11 == r12) goto L234
            goto L242
        L234:
            java.lang.String r11 = "_ui"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L242
        L23c:
            r30 = r2
            r5 = 0
            r11 = 0
            r12 = 0
            goto L24a
        L242:
            r30 = r2
            r31 = r3
            r32 = 0
            goto L42c
        L24a:
            com.google.android.gms.internal.measurement.q2 r2 = r10.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r2 = (com.google.android.gms.internal.measurement.C0820k1) r2     // Catch: java.lang.Throwable -> L11e
            int r2 = r2.q()     // Catch: java.lang.Throwable -> L11e
            r31 = r3
            java.lang.String r3 = "_r"
            if (r5 >= r2) goto L2c2
            com.google.android.gms.internal.measurement.n1 r2 = r10.i(r5)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r2 = r2.q()     // Catch: java.lang.Throwable -> L11e
            boolean r2 = r14.equals(r2)     // Catch: java.lang.Throwable -> L11e
            if (r2 == 0) goto L28a
            com.google.android.gms.internal.measurement.n1 r2 = r10.i(r5)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.p2 r2 = r2.i()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.m1 r2 = (com.google.android.gms.internal.measurement.C0830m1) r2     // Catch: java.lang.Throwable -> L11e
            r32 = r4
            r3 = 1
            r2.j(r3)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r2 = r2.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r2 = (com.google.android.gms.internal.measurement.C0835n1) r2     // Catch: java.lang.Throwable -> L11e
            r10.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r3 = r10.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r3 = (com.google.android.gms.internal.measurement.C0820k1) r3     // Catch: java.lang.Throwable -> L11e
            r3.A(r5, r2)     // Catch: java.lang.Throwable -> L11e
            r11 = r25
            goto L2bb
        L28a:
            r32 = r4
            com.google.android.gms.internal.measurement.n1 r2 = r10.i(r5)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r2 = r2.q()     // Catch: java.lang.Throwable -> L11e
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L11e
            if (r2 == 0) goto L2bb
            com.google.android.gms.internal.measurement.n1 r2 = r10.i(r5)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.p2 r2 = r2.i()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.m1 r2 = (com.google.android.gms.internal.measurement.C0830m1) r2     // Catch: java.lang.Throwable -> L11e
            r3 = 1
            r2.j(r3)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r2 = r2.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r2 = (com.google.android.gms.internal.measurement.C0835n1) r2     // Catch: java.lang.Throwable -> L11e
            r10.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r3 = r10.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r3 = (com.google.android.gms.internal.measurement.C0820k1) r3     // Catch: java.lang.Throwable -> L11e
            r3.A(r5, r2)     // Catch: java.lang.Throwable -> L11e
            r12 = r25
        L2bb:
            int r5 = r5 + 1
            r3 = r31
            r4 = r32
            goto L24a
        L2c2:
            r32 = r4
            if (r11 != 0) goto L2f0
            if (r32 == 0) goto L2f0
            O3.X r2 = r1.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r2 = r2.v()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r4 = "Marking event as conversion"
            O3.Q r5 = r23.m()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = r10.l()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = r5.a(r11)     // Catch: java.lang.Throwable -> L11e
            r2.c(r5, r4)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.m1 r2 = com.google.android.gms.internal.measurement.C0835n1.B()     // Catch: java.lang.Throwable -> L11e
            r2.h(r14)     // Catch: java.lang.Throwable -> L11e
            r4 = 1
            r2.j(r4)     // Catch: java.lang.Throwable -> L11e
            r10.k(r2)     // Catch: java.lang.Throwable -> L11e
        L2f0:
            if (r12 != 0) goto L31a
            O3.X r2 = r1.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r2 = r2.v()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r4 = "Marking event as real-time"
            O3.Q r5 = r23.m()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = r10.l()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = r5.a(r11)     // Catch: java.lang.Throwable -> L11e
            r2.c(r5, r4)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.m1 r2 = com.google.android.gms.internal.measurement.C0835n1.B()     // Catch: java.lang.Throwable -> L11e
            r2.h(r3)     // Catch: java.lang.Throwable -> L11e
            r4 = 1
            r2.j(r4)     // Catch: java.lang.Throwable -> L11e
            r10.k(r2)     // Catch: java.lang.Throwable -> L11e
        L31a:
            O3.n r33 = r1.f0()     // Catch: java.lang.Throwable -> L11e
            long r34 = r1.f()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r2 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r2 = (com.google.android.gms.internal.measurement.C0859s1) r2     // Catch: java.lang.Throwable -> L11e
            java.lang.String r36 = r2.p()     // Catch: java.lang.Throwable -> L11e
            r39 = 0
            r40 = 0
            r37 = 0
            r38 = 1
            O3.j r2 = r33.u0(r34, r36, r37, r38, r39, r40)     // Catch: java.lang.Throwable -> L11e
            long r4 = r2.f4921e     // Catch: java.lang.Throwable -> L11e
            O3.g r2 = r1.d0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r11 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r11 = (com.google.android.gms.internal.measurement.C0859s1) r11     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = r11.p()     // Catch: java.lang.Throwable -> L11e
            O3.E r12 = O3.F.f4449p     // Catch: java.lang.Throwable -> L11e
            int r2 = r2.w(r11, r12)     // Catch: java.lang.Throwable -> L11e
            long r11 = (long) r2     // Catch: java.lang.Throwable -> L11e
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 <= 0) goto L353
            C(r10, r3)     // Catch: java.lang.Throwable -> L11e
            goto L355
        L353:
            r16 = r25
        L355:
            java.lang.String r2 = r10.l()     // Catch: java.lang.Throwable -> L11e
            boolean r2 = O3.Y1.m0(r2)     // Catch: java.lang.Throwable -> L11e
            if (r2 == 0) goto L42c
            if (r32 == 0) goto L42c
            O3.n r33 = r1.f0()     // Catch: java.lang.Throwable -> L11e
            long r34 = r1.f()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r2 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r2 = (com.google.android.gms.internal.measurement.C0859s1) r2     // Catch: java.lang.Throwable -> L11e
            java.lang.String r36 = r2.p()     // Catch: java.lang.Throwable -> L11e
            r39 = 0
            r40 = 0
            r37 = 1
            r38 = 0
            O3.j r2 = r33.u0(r34, r36, r37, r38, r39, r40)     // Catch: java.lang.Throwable -> L11e
            long r2 = r2.f4919c     // Catch: java.lang.Throwable -> L11e
            O3.g r4 = r1.d0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r5 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = r5.p()     // Catch: java.lang.Throwable -> L11e
            O3.E r11 = O3.F.f4447o     // Catch: java.lang.Throwable -> L11e
            int r4 = r4.w(r5, r11)     // Catch: java.lang.Throwable -> L11e
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L11e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L42c
            O3.X r2 = r1.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r2 = r2.t()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r3 = "Too many conversions. Not logging as conversion. appId"
            java.lang.Object r4 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r4 = (com.google.android.gms.internal.measurement.C0859s1) r4     // Catch: java.lang.Throwable -> L11e
            java.lang.String r4 = r4.p()     // Catch: java.lang.Throwable -> L11e
            O3.W r4 = O3.X.w(r4)     // Catch: java.lang.Throwable -> L11e
            r2.c(r4, r3)     // Catch: java.lang.Throwable -> L11e
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
        L3b3:
            com.google.android.gms.internal.measurement.q2 r11 = r10.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r11 = (com.google.android.gms.internal.measurement.C0820k1) r11     // Catch: java.lang.Throwable -> L11e
            int r11 = r11.q()     // Catch: java.lang.Throwable -> L11e
            if (r3 >= r11) goto L3e2
            com.google.android.gms.internal.measurement.n1 r11 = r10.i(r3)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r12 = r11.q()     // Catch: java.lang.Throwable -> L11e
            boolean r12 = r14.equals(r12)     // Catch: java.lang.Throwable -> L11e
            if (r12 == 0) goto L3d3
            com.google.android.gms.internal.measurement.p2 r2 = r11.i()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.m1 r2 = (com.google.android.gms.internal.measurement.C0830m1) r2     // Catch: java.lang.Throwable -> L11e
            r5 = r3
            goto L3df
        L3d3:
            java.lang.String r11 = r11.q()     // Catch: java.lang.Throwable -> L11e
            boolean r11 = r7.equals(r11)     // Catch: java.lang.Throwable -> L11e
            if (r11 == 0) goto L3df
            r4 = r25
        L3df:
            int r3 = r3 + 1
            goto L3b3
        L3e2:
            if (r4 == 0) goto L3f2
            if (r2 == 0) goto L3f1
            r10.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r2 = r10.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r2 = (com.google.android.gms.internal.measurement.C0820k1) r2     // Catch: java.lang.Throwable -> L11e
            r2.E(r5)     // Catch: java.lang.Throwable -> L11e
            goto L42c
        L3f1:
            r2 = 0
        L3f2:
            if (r2 == 0) goto L413
            com.google.android.gms.internal.measurement.p2 r2 = r2.clone()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.m1 r2 = (com.google.android.gms.internal.measurement.C0830m1) r2     // Catch: java.lang.Throwable -> L11e
            r2.h(r7)     // Catch: java.lang.Throwable -> L11e
            r3 = 10
            r2.j(r3)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r2 = r2.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r2 = (com.google.android.gms.internal.measurement.C0835n1) r2     // Catch: java.lang.Throwable -> L11e
            r10.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r3 = r10.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r3 = (com.google.android.gms.internal.measurement.C0820k1) r3     // Catch: java.lang.Throwable -> L11e
            r3.A(r5, r2)     // Catch: java.lang.Throwable -> L11e
            goto L42c
        L413:
            O3.X r2 = r1.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r2 = r2.s()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r3 = "Did not find conversion parameter. appId"
            java.lang.Object r4 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r4 = (com.google.android.gms.internal.measurement.C0859s1) r4     // Catch: java.lang.Throwable -> L11e
            java.lang.String r4 = r4.p()     // Catch: java.lang.Throwable -> L11e
            O3.W r4 = O3.X.w(r4)     // Catch: java.lang.Throwable -> L11e
            r2.c(r4, r3)     // Catch: java.lang.Throwable -> L11e
        L42c:
            if (r32 == 0) goto L4a4
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11e
            java.util.List r3 = r10.h()     // Catch: java.lang.Throwable -> L11e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L11e
            r3 = 0
            r4 = -1
            r5 = -1
        L43a:
            int r7 = r2.size()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = "currency"
            java.lang.String r12 = "value"
            if (r3 >= r7) goto L46a
            java.lang.Object r7 = r2.get(r3)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r7 = (com.google.android.gms.internal.measurement.C0835n1) r7     // Catch: java.lang.Throwable -> L11e
            java.lang.String r7 = r7.q()     // Catch: java.lang.Throwable -> L11e
            boolean r7 = r12.equals(r7)     // Catch: java.lang.Throwable -> L11e
            if (r7 == 0) goto L456
            r4 = r3
            goto L467
        L456:
            java.lang.Object r7 = r2.get(r3)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r7 = (com.google.android.gms.internal.measurement.C0835n1) r7     // Catch: java.lang.Throwable -> L11e
            java.lang.String r7 = r7.q()     // Catch: java.lang.Throwable -> L11e
            boolean r7 = r11.equals(r7)     // Catch: java.lang.Throwable -> L11e
            if (r7 == 0) goto L467
            r5 = r3
        L467:
            int r3 = r3 + 1
            goto L43a
        L46a:
            r3 = -1
            if (r4 != r3) goto L46f
            goto L4ef
        L46f:
            java.lang.Object r3 = r2.get(r4)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r3 = (com.google.android.gms.internal.measurement.C0835n1) r3     // Catch: java.lang.Throwable -> L11e
            boolean r3 = r3.t()     // Catch: java.lang.Throwable -> L11e
            if (r3 != 0) goto L4a6
            java.lang.Object r3 = r2.get(r4)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r3 = (com.google.android.gms.internal.measurement.C0835n1) r3     // Catch: java.lang.Throwable -> L11e
            boolean r3 = r3.x()     // Catch: java.lang.Throwable -> L11e
            if (r3 != 0) goto L4a6
            O3.X r2 = r1.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r2 = r2.f4663B     // Catch: java.lang.Throwable -> L11e
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.b(r3)     // Catch: java.lang.Throwable -> L11e
            r10.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r2 = r10.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r2 = (com.google.android.gms.internal.measurement.C0820k1) r2     // Catch: java.lang.Throwable -> L11e
            r2.E(r4)     // Catch: java.lang.Throwable -> L11e
            C(r10, r14)     // Catch: java.lang.Throwable -> L11e
            r2 = 18
            c0(r10, r2, r12)     // Catch: java.lang.Throwable -> L11e
        L4a4:
            r3 = -1
            goto L4ef
        L4a6:
            r3 = -1
            if (r5 != r3) goto L4aa
            goto L4d2
        L4aa:
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r2 = (com.google.android.gms.internal.measurement.C0835n1) r2     // Catch: java.lang.Throwable -> L11e
            java.lang.String r2 = r2.s()     // Catch: java.lang.Throwable -> L11e
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L11e
            r7 = 3
            if (r5 != r7) goto L4d2
            r5 = 0
        L4bc:
            int r7 = r2.length()     // Catch: java.lang.Throwable -> L11e
            if (r5 >= r7) goto L4ef
            int r7 = r2.codePointAt(r5)     // Catch: java.lang.Throwable -> L11e
            boolean r12 = java.lang.Character.isLetter(r7)     // Catch: java.lang.Throwable -> L11e
            if (r12 == 0) goto L4d2
            int r7 = java.lang.Character.charCount(r7)     // Catch: java.lang.Throwable -> L11e
            int r5 = r5 + r7
            goto L4bc
        L4d2:
            O3.X r2 = r1.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r2 = r2.f4663B     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.b(r5)     // Catch: java.lang.Throwable -> L11e
            r10.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r2 = r10.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r2 = (com.google.android.gms.internal.measurement.C0820k1) r2     // Catch: java.lang.Throwable -> L11e
            r2.E(r4)     // Catch: java.lang.Throwable -> L11e
            C(r10, r14)     // Catch: java.lang.Throwable -> L11e
            r2 = 19
            c0(r10, r2, r11)     // Catch: java.lang.Throwable -> L11e
        L4ef:
            java.lang.String r2 = r10.l()     // Catch: java.lang.Throwable -> L11e
            boolean r2 = r13.equals(r2)     // Catch: java.lang.Throwable -> L11e
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L53b
            r1.i0()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r2 = r10.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r2 = (com.google.android.gms.internal.measurement.C0820k1) r2     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r2 = O3.C0270b0.w(r2, r6)     // Catch: java.lang.Throwable -> L11e
            if (r2 != 0) goto L538
            if (r18 == 0) goto L533
            long r6 = r18.m()     // Catch: java.lang.Throwable -> L11e
            long r11 = r10.m()     // Catch: java.lang.Throwable -> L11e
            long r6 = r6 - r11
            long r6 = java.lang.Math.abs(r6)     // Catch: java.lang.Throwable -> L11e
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 > 0) goto L533
            com.google.android.gms.internal.measurement.p2 r2 = r18.clone()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.j1 r2 = (com.google.android.gms.internal.measurement.C0815j1) r2     // Catch: java.lang.Throwable -> L11e
            boolean r4 = r1.I(r10, r2)     // Catch: java.lang.Throwable -> L11e
            if (r4 == 0) goto L533
            r8.X(r9, r2)     // Catch: java.lang.Throwable -> L11e
            r11 = r29
        L52e:
            r17 = 0
            r18 = 0
            goto L587
        L533:
            r17 = r10
            r11 = r21
            goto L587
        L538:
            r4 = r29
            goto L586
        L53b:
            java.lang.String r2 = "_vs"
            java.lang.String r6 = r10.l()     // Catch: java.lang.Throwable -> L11e
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Throwable -> L11e
            if (r2 == 0) goto L538
            r1.i0()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r2 = r10.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r2 = (com.google.android.gms.internal.measurement.C0820k1) r2     // Catch: java.lang.Throwable -> L11e
            r7 = r28
            com.google.android.gms.internal.measurement.n1 r2 = O3.C0270b0.w(r2, r7)     // Catch: java.lang.Throwable -> L11e
            if (r2 != 0) goto L538
            if (r17 == 0) goto L57e
            long r6 = r17.m()     // Catch: java.lang.Throwable -> L11e
            long r11 = r10.m()     // Catch: java.lang.Throwable -> L11e
            long r6 = r6 - r11
            long r6 = java.lang.Math.abs(r6)     // Catch: java.lang.Throwable -> L11e
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 > 0) goto L57e
            com.google.android.gms.internal.measurement.p2 r2 = r17.clone()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.j1 r2 = (com.google.android.gms.internal.measurement.C0815j1) r2     // Catch: java.lang.Throwable -> L11e
            boolean r4 = r1.I(r2, r10)     // Catch: java.lang.Throwable -> L11e
            if (r4 == 0) goto L57e
            r4 = r29
            r8.X(r4, r2)     // Catch: java.lang.Throwable -> L11e
            r11 = r4
            goto L52e
        L57e:
            r4 = r29
            r11 = r4
            r18 = r10
            r9 = r21
            goto L587
        L586:
            r11 = r4
        L587:
            com.google.android.gms.internal.measurement.q2 r2 = r10.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r2 = (com.google.android.gms.internal.measurement.C0820k1) r2     // Catch: java.lang.Throwable -> L11e
            int r2 = r2.q()     // Catch: java.lang.Throwable -> L11e
            if (r2 == 0) goto L6a9
            r1.i0()     // Catch: java.lang.Throwable -> L11e
            java.util.List r2 = r10.h()     // Catch: java.lang.Throwable -> L11e
            android.os.Bundle r2 = O3.C0270b0.v(r2)     // Catch: java.lang.Throwable -> L11e
            r4 = 0
        L59d:
            com.google.android.gms.internal.measurement.q2 r5 = r10.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r5 = (com.google.android.gms.internal.measurement.C0820k1) r5     // Catch: java.lang.Throwable -> L11e
            int r5 = r5.q()     // Catch: java.lang.Throwable -> L11e
            if (r4 >= r5) goto L653
            com.google.android.gms.internal.measurement.n1 r5 = r10.i(r4)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r6 = r5.q()     // Catch: java.lang.Throwable -> L11e
            r7 = r27
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L11e
            if (r6 == 0) goto L62b
            java.util.List r6 = r5.z()     // Catch: java.lang.Throwable -> L11e
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L11e
            if (r6 != 0) goto L62b
            java.lang.Object r6 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r6 = (com.google.android.gms.internal.measurement.C0859s1) r6     // Catch: java.lang.Throwable -> L11e
            java.lang.String r6 = r6.p()     // Catch: java.lang.Throwable -> L11e
            java.util.List r5 = r5.z()     // Catch: java.lang.Throwable -> L11e
            int r12 = r5.size()     // Catch: java.lang.Throwable -> L11e
            android.os.Bundle[] r12 = new android.os.Bundle[r12]     // Catch: java.lang.Throwable -> L11e
            r13 = 0
        L5d4:
            int r14 = r5.size()     // Catch: java.lang.Throwable -> L11e
            if (r13 >= r14) goto L625
            java.lang.Object r14 = r5.get(r13)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r14 = (com.google.android.gms.internal.measurement.C0835n1) r14     // Catch: java.lang.Throwable -> L11e
            r1.i0()     // Catch: java.lang.Throwable -> L11e
            java.util.List r23 = r14.z()     // Catch: java.lang.Throwable -> L11e
            android.os.Bundle r3 = O3.C0270b0.v(r23)     // Catch: java.lang.Throwable -> L11e
            java.util.List r14 = r14.z()     // Catch: java.lang.Throwable -> L11e
            java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> L11e
        L5f3:
            boolean r23 = r14.hasNext()     // Catch: java.lang.Throwable -> L11e
            if (r23 == 0) goto L617
            java.lang.Object r23 = r14.next()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r23 = (com.google.android.gms.internal.measurement.C0835n1) r23     // Catch: java.lang.Throwable -> L11e
            r25 = r4
            java.lang.String r4 = r10.l()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.p2 r23 = r23.i()     // Catch: java.lang.Throwable -> L11e
            r27 = r5
            r5 = r23
            com.google.android.gms.internal.measurement.m1 r5 = (com.google.android.gms.internal.measurement.C0830m1) r5     // Catch: java.lang.Throwable -> L11e
            r1.w(r4, r5, r3, r6)     // Catch: java.lang.Throwable -> L11e
            r4 = r25
            r5 = r27
            goto L5f3
        L617:
            r25 = r4
            r27 = r5
            r12[r13] = r3     // Catch: java.lang.Throwable -> L11e
            int r13 = r13 + 1
            r4 = r25
            r5 = r27
            r3 = -1
            goto L5d4
        L625:
            r25 = r4
            r2.putParcelableArray(r7, r12)     // Catch: java.lang.Throwable -> L11e
            goto L64c
        L62b:
            r25 = r4
            java.lang.String r3 = r5.q()     // Catch: java.lang.Throwable -> L11e
            boolean r3 = r3.equals(r7)     // Catch: java.lang.Throwable -> L11e
            if (r3 != 0) goto L64c
            java.lang.String r3 = r10.l()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.p2 r4 = r5.i()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.m1 r4 = (com.google.android.gms.internal.measurement.C0830m1) r4     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r5 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = r5.p()     // Catch: java.lang.Throwable -> L11e
            r1.w(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L11e
        L64c:
            int r4 = r25 + 1
            r27 = r7
            r3 = -1
            goto L59d
        L653:
            r7 = r27
            r10.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r3 = r10.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r3 = (com.google.android.gms.internal.measurement.C0820k1) r3     // Catch: java.lang.Throwable -> L11e
            r3.D()     // Catch: java.lang.Throwable -> L11e
            O3.b0 r3 = r1.i0()     // Catch: java.lang.Throwable -> L11e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11e
            r4.<init>()     // Catch: java.lang.Throwable -> L11e
            java.util.Set r5 = r2.keySet()     // Catch: java.lang.Throwable -> L11e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L11e
        L670:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L11e
            if (r6 == 0) goto L696
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.m1 r12 = com.google.android.gms.internal.measurement.C0835n1.B()     // Catch: java.lang.Throwable -> L11e
            r12.h(r6)     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r6 = r2.get(r6)     // Catch: java.lang.Throwable -> L11e
            if (r6 == 0) goto L670
            r3.O(r12, r6)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r6 = r12.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r6 = (com.google.android.gms.internal.measurement.C0835n1) r6     // Catch: java.lang.Throwable -> L11e
            r4.add(r6)     // Catch: java.lang.Throwable -> L11e
            goto L670
        L696:
            int r2 = r4.size()     // Catch: java.lang.Throwable -> L11e
            r3 = 0
        L69b:
            if (r3 >= r2) goto L6ab
            java.lang.Object r5 = r4.get(r3)     // Catch: java.lang.Throwable -> L11e
            int r3 = r3 + 1
            com.google.android.gms.internal.measurement.n1 r5 = (com.google.android.gms.internal.measurement.C0835n1) r5     // Catch: java.lang.Throwable -> L11e
            r10.j(r5)     // Catch: java.lang.Throwable -> L11e
            goto L69b
        L6a9:
            r7 = r27
        L6ab:
            java.lang.Object r2 = r15.f4862d     // Catch: java.lang.Throwable -> L11e
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r3 = r10.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r3 = (com.google.android.gms.internal.measurement.C0820k1) r3     // Catch: java.lang.Throwable -> L11e
            r4 = r26
            r2.set(r4, r3)     // Catch: java.lang.Throwable -> L11e
            r8.Y(r10)     // Catch: java.lang.Throwable -> L11e
            int r13 = r21 + 1
            goto L12b
        L6c1:
            int r12 = r4 + 1
            r4 = r7
            r7 = r24
            r2 = r30
            r3 = r31
            r5 = 1
            goto L57
        L6ce:
            r7 = r5
            r25 = 1
            r2 = 0
            r9 = r2
            r4 = r21
            r0 = 0
        L6d7:
            if (r0 >= r4) goto L727
            com.google.android.gms.internal.measurement.q2 r5 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r5 = r5.T1(r0)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = r5.s()     // Catch: java.lang.Throwable -> L11e
            boolean r11 = r13.equals(r11)     // Catch: java.lang.Throwable -> L11e
            if (r11 == 0) goto L6fc
            r1.i0()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r11 = O3.C0270b0.w(r5, r6)     // Catch: java.lang.Throwable -> L11e
            if (r11 == 0) goto L6fc
            r8.Z(r0)     // Catch: java.lang.Throwable -> L11e
            int r4 = r4 + (-1)
            int r0 = r0 + (-1)
            goto L724
        L6fc:
            r1.i0()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r5 = O3.C0270b0.w(r5, r7)     // Catch: java.lang.Throwable -> L11e
            if (r5 == 0) goto L724
            boolean r11 = r5.t()     // Catch: java.lang.Throwable -> L11e
            if (r11 == 0) goto L714
            long r11 = r5.u()     // Catch: java.lang.Throwable -> L11e
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L11e
            goto L715
        L714:
            r5 = 0
        L715:
            if (r5 == 0) goto L724
            long r11 = r5.longValue()     // Catch: java.lang.Throwable -> L11e
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 <= 0) goto L724
            long r11 = r5.longValue()     // Catch: java.lang.Throwable -> L11e
            long r9 = r9 + r11
        L724:
            int r0 = r0 + 1
            goto L6d7
        L727:
            r4 = 0
            r1.H(r8, r9, r4)     // Catch: java.lang.Throwable -> L11e
            java.util.List r0 = r8.U()     // Catch: java.lang.Throwable -> L11e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L11e
        L733:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = "_se"
            if (r4 == 0) goto L758
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r4 = (com.google.android.gms.internal.measurement.C0820k1) r4     // Catch: java.lang.Throwable -> L11e
            java.lang.String r6 = "_s"
            java.lang.String r4 = r4.s()     // Catch: java.lang.Throwable -> L11e
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L11e
            if (r4 == 0) goto L733
            O3.n r0 = r1.f0()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r4 = r8.o()     // Catch: java.lang.Throwable -> L11e
            r0.i0(r4, r5)     // Catch: java.lang.Throwable -> L11e
        L758:
            java.lang.String r0 = "_sid"
            int r0 = O3.C0270b0.c0(r8, r0)     // Catch: java.lang.Throwable -> L11e
            if (r0 < 0) goto L766
            r4 = r25
            r1.H(r8, r9, r4)     // Catch: java.lang.Throwable -> L11e
            goto L78f
        L766:
            int r0 = O3.C0270b0.c0(r8, r5)     // Catch: java.lang.Throwable -> L11e
            if (r0 < 0) goto L78f
            r8.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r4 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r4 = (com.google.android.gms.internal.measurement.C0859s1) r4     // Catch: java.lang.Throwable -> L11e
            r4.e0(r0)     // Catch: java.lang.Throwable -> L11e
            O3.X r0 = r1.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r0 = r0.s()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r4 = "Session engagement user property is in the bundle without session ID. appId"
            java.lang.Object r5 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = r5.p()     // Catch: java.lang.Throwable -> L11e
            O3.W r5 = O3.X.w(r5)     // Catch: java.lang.Throwable -> L11e
            r0.c(r5, r4)     // Catch: java.lang.Throwable -> L11e
        L78f:
            java.lang.Object r0 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r0 = (com.google.android.gms.internal.measurement.C0859s1) r0     // Catch: java.lang.Throwable -> L11e
            java.lang.String r0 = r0.p()     // Catch: java.lang.Throwable -> L11e
            O3.p0 r4 = r1.c()     // Catch: java.lang.Throwable -> L11e
            r4.o()     // Catch: java.lang.Throwable -> L11e
            r1.k0()     // Catch: java.lang.Throwable -> L11e
            O3.n r4 = r1.f0()     // Catch: java.lang.Throwable -> L11e
            O3.c0 r4 = r4.s0(r0)     // Catch: java.lang.Throwable -> L11e
            if (r4 != 0) goto L7bd
            O3.X r4 = r1.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r4 = r4.s()     // Catch: java.lang.Throwable -> L11e
            O3.W r0 = O3.X.w(r0)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = "Cannot fix consent fields without appInfo. appId"
            r4.c(r0, r5)     // Catch: java.lang.Throwable -> L11e
            goto L7c0
        L7bd:
            r1.m(r4, r8)     // Catch: java.lang.Throwable -> L11e
        L7c0:
            java.lang.Object r0 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r0 = (com.google.android.gms.internal.measurement.C0859s1) r0     // Catch: java.lang.Throwable -> L11e
            java.lang.String r0 = r0.p()     // Catch: java.lang.Throwable -> L11e
            O3.p0 r4 = r1.c()     // Catch: java.lang.Throwable -> L11e
            r4.o()     // Catch: java.lang.Throwable -> L11e
            r1.k0()     // Catch: java.lang.Throwable -> L11e
            O3.n r4 = r1.f0()     // Catch: java.lang.Throwable -> L11e
            O3.c0 r4 = r4.s0(r0)     // Catch: java.lang.Throwable -> L11e
            if (r4 != 0) goto L7ee
            O3.X r4 = r1.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r4 = r4.t()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = "Cannot populate ad_campaign_info without appInfo. appId"
            O3.W r0 = O3.X.w(r0)     // Catch: java.lang.Throwable -> L11e
            r4.c(r0, r5)     // Catch: java.lang.Throwable -> L11e
            goto L7f1
        L7ee:
            r1.n(r4, r8)     // Catch: java.lang.Throwable -> L11e
        L7f1:
            R(r8)     // Catch: java.lang.Throwable -> L11e
            r8.M()     // Catch: java.lang.Throwable -> L11e
            O3.J0 r0 = O3.J0.f4496c     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r0 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r0 = (com.google.android.gms.internal.measurement.C0859s1) r0     // Catch: java.lang.Throwable -> L11e
            java.lang.String r0 = r0.p()     // Catch: java.lang.Throwable -> L11e
            O3.J0 r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r4 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r4 = (com.google.android.gms.internal.measurement.C0859s1) r4     // Catch: java.lang.Throwable -> L11e
            java.lang.String r4 = r4.u0()     // Catch: java.lang.Throwable -> L11e
            r5 = 100
            O3.J0 r4 = O3.J0.c(r5, r4)     // Catch: java.lang.Throwable -> L11e
            O3.J0 r0 = r0.j(r4)     // Catch: java.lang.Throwable -> L11e
            O3.n r4 = r1.f0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r5 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = r5.p()     // Catch: java.lang.Throwable -> L11e
            O3.J0 r4 = r4.X(r5)     // Catch: java.lang.Throwable -> L11e
            O3.n r5 = r1.f0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r6 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r6 = (com.google.android.gms.internal.measurement.C0859s1) r6     // Catch: java.lang.Throwable -> L11e
            java.lang.String r6 = r6.p()     // Catch: java.lang.Throwable -> L11e
            r5.W(r6, r0)     // Catch: java.lang.Throwable -> L11e
            O3.I0 r5 = O3.I0.ANALYTICS_STORAGE     // Catch: java.lang.Throwable -> L11e
            boolean r6 = r0.i(r5)     // Catch: java.lang.Throwable -> L11e
            if (r6 != 0) goto L854
            boolean r6 = r4.i(r5)     // Catch: java.lang.Throwable -> L11e
            if (r6 == 0) goto L854
            O3.n r4 = r1.f0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r6 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r6 = (com.google.android.gms.internal.measurement.C0859s1) r6     // Catch: java.lang.Throwable -> L11e
            java.lang.String r6 = r6.p()     // Catch: java.lang.Throwable -> L11e
            r4.g0(r6)     // Catch: java.lang.Throwable -> L11e
            goto L86f
        L854:
            boolean r6 = r0.i(r5)     // Catch: java.lang.Throwable -> L11e
            if (r6 == 0) goto L86f
            boolean r4 = r4.i(r5)     // Catch: java.lang.Throwable -> L11e
            if (r4 != 0) goto L86f
            O3.n r4 = r1.f0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r6 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r6 = (com.google.android.gms.internal.measurement.C0859s1) r6     // Catch: java.lang.Throwable -> L11e
            java.lang.String r6 = r6.p()     // Catch: java.lang.Throwable -> L11e
            r4.h0(r6)     // Catch: java.lang.Throwable -> L11e
        L86f:
            O3.I0 r4 = O3.I0.AD_STORAGE     // Catch: java.lang.Throwable -> L11e
            boolean r6 = r0.i(r4)     // Catch: java.lang.Throwable -> L11e
            if (r6 != 0) goto L895
            r8.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r6 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r6 = (com.google.android.gms.internal.measurement.C0859s1) r6     // Catch: java.lang.Throwable -> L11e
            r6.z1()     // Catch: java.lang.Throwable -> L11e
            r8.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r6 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r6 = (com.google.android.gms.internal.measurement.C0859s1) r6     // Catch: java.lang.Throwable -> L11e
            r6.B1()     // Catch: java.lang.Throwable -> L11e
            r8.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r6 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r6 = (com.google.android.gms.internal.measurement.C0859s1) r6     // Catch: java.lang.Throwable -> L11e
            r6.S0()     // Catch: java.lang.Throwable -> L11e
        L895:
            boolean r6 = r0.i(r5)     // Catch: java.lang.Throwable -> L11e
            if (r6 != 0) goto L8af
            r8.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r6 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r6 = (com.google.android.gms.internal.measurement.C0859s1) r6     // Catch: java.lang.Throwable -> L11e
            r6.D1()     // Catch: java.lang.Throwable -> L11e
            r8.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r6 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r6 = (com.google.android.gms.internal.measurement.C0859s1) r6     // Catch: java.lang.Throwable -> L11e
            r6.Z0()     // Catch: java.lang.Throwable -> L11e
        L8af:
            com.google.android.gms.internal.measurement.Y3.a()     // Catch: java.lang.Throwable -> L11e
            O3.g r6 = r1.d0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r7 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r7 = (com.google.android.gms.internal.measurement.C0859s1) r7     // Catch: java.lang.Throwable -> L11e
            java.lang.String r7 = r7.p()     // Catch: java.lang.Throwable -> L11e
            O3.E r9 = O3.F.f4392P0     // Catch: java.lang.Throwable -> L11e
            boolean r6 = r6.y(r7, r9)     // Catch: java.lang.Throwable -> L11e
            if (r6 == 0) goto Lae7
            r1.j0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r6 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r6 = (com.google.android.gms.internal.measurement.C0859s1) r6     // Catch: java.lang.Throwable -> L11e
            java.lang.String r6 = r6.p()     // Catch: java.lang.Throwable -> L11e
            boolean r6 = O3.Y1.K(r6)     // Catch: java.lang.Throwable -> L11e
            if (r6 == 0) goto Lae7
            java.lang.Object r6 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r6 = (com.google.android.gms.internal.measurement.C0859s1) r6     // Catch: java.lang.Throwable -> L11e
            java.lang.String r6 = r6.p()     // Catch: java.lang.Throwable -> L11e
            O3.J0 r6 = r1.a(r6)     // Catch: java.lang.Throwable -> L11e
            boolean r4 = r6.i(r4)     // Catch: java.lang.Throwable -> L11e
            if (r4 == 0) goto Lae7
            java.lang.Object r4 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r4 = (com.google.android.gms.internal.measurement.C0859s1) r4     // Catch: java.lang.Throwable -> L11e
            boolean r4 = r4.z0()     // Catch: java.lang.Throwable -> L11e
            if (r4 == 0) goto Lae7
            r4 = 0
        L8f4:
            int r6 = r8.V()     // Catch: java.lang.Throwable -> L11e
            if (r4 >= r6) goto Lae7
            com.google.android.gms.internal.measurement.q2 r6 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r6 = (com.google.android.gms.internal.measurement.C0859s1) r6     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r6 = r6.T1(r4)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.p2 r6 = r6.i()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.j1 r6 = (com.google.android.gms.internal.measurement.C0815j1) r6     // Catch: java.lang.Throwable -> L11e
            java.util.List r7 = r6.h()     // Catch: java.lang.Throwable -> L11e
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L11e
        L910:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> L11e
            if (r9 == 0) goto Ladd
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r9 = (com.google.android.gms.internal.measurement.C0835n1) r9     // Catch: java.lang.Throwable -> L11e
            java.lang.String r9 = r9.q()     // Catch: java.lang.Throwable -> L11e
            boolean r9 = r14.equals(r9)     // Catch: java.lang.Throwable -> L11e
            if (r9 == 0) goto Lad9
            java.lang.Object r7 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r7 = (com.google.android.gms.internal.measurement.C0859s1) r7     // Catch: java.lang.Throwable -> L11e
            int r7 = r7.G0()     // Catch: java.lang.Throwable -> L11e
            O3.g r9 = r1.d0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r10 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r10 = (com.google.android.gms.internal.measurement.C0859s1) r10     // Catch: java.lang.Throwable -> L11e
            java.lang.String r10 = r10.p()     // Catch: java.lang.Throwable -> L11e
            O3.E r11 = O3.F.f4442l0     // Catch: java.lang.Throwable -> L11e
            int r9 = r9.w(r10, r11)     // Catch: java.lang.Throwable -> L11e
            if (r7 < r9) goto Lacd
            O3.g r7 = r1.d0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r9 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r9 = (com.google.android.gms.internal.measurement.C0859s1) r9     // Catch: java.lang.Throwable -> L11e
            java.lang.String r9 = r9.p()     // Catch: java.lang.Throwable -> L11e
            O3.E r10 = O3.F.f4468y0     // Catch: java.lang.Throwable -> L11e
            int r7 = r7.w(r9, r10)     // Catch: java.lang.Throwable -> L11e
            java.util.LinkedList r9 = r1.f4587G
            java.lang.String r10 = "Generated trigger URI. appId, uri"
            java.lang.String r11 = "_tr"
            java.lang.String r12 = "_tu"
            if (r7 <= 0) goto La35
            O3.n r26 = r1.f0()     // Catch: java.lang.Throwable -> L11e
            long r27 = r1.f()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r13 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r13 = (com.google.android.gms.internal.measurement.C0859s1) r13     // Catch: java.lang.Throwable -> L11e
            java.lang.String r29 = r13.p()     // Catch: java.lang.Throwable -> L11e
            r32 = 0
            r33 = 1
            r30 = 0
            r31 = 0
            O3.j r13 = r26.u0(r27, r29, r30, r31, r32, r33)     // Catch: java.lang.Throwable -> L11e
            r17 = r2
            long r2 = r13.f4922g     // Catch: java.lang.Throwable -> L11e
            r21 = r2
            long r1 = (long) r7     // Catch: java.lang.Throwable -> L11e
            int r1 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r1 <= 0) goto L99e
            com.google.android.gms.internal.measurement.m1 r1 = com.google.android.gms.internal.measurement.C0835n1.B()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r2 = "_tnr"
            r1.h(r2)     // Catch: java.lang.Throwable -> L11e
            r2 = 1
            r1.j(r2)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r1 = r1.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r1 = (com.google.android.gms.internal.measurement.C0835n1) r1     // Catch: java.lang.Throwable -> L11e
            r6.j(r1)     // Catch: java.lang.Throwable -> L11e
            goto Lacf
        L99e:
            O3.g r1 = r47.d0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r2 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r2 = (com.google.android.gms.internal.measurement.C0859s1) r2     // Catch: java.lang.Throwable -> L11e
            java.lang.String r2 = r2.p()     // Catch: java.lang.Throwable -> L11e
            O3.E r3 = O3.F.f4396R0     // Catch: java.lang.Throwable -> L11e
            boolean r1 = r1.y(r2, r3)     // Catch: java.lang.Throwable -> L11e
            if (r1 == 0) goto L9ce
            O3.Y1 r1 = r47.j0()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r1 = r1.g0()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.m1 r2 = com.google.android.gms.internal.measurement.C0835n1.B()     // Catch: java.lang.Throwable -> L11e
            r2.h(r12)     // Catch: java.lang.Throwable -> L11e
            r2.i(r1)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r2 = r2.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r2 = (com.google.android.gms.internal.measurement.C0835n1) r2     // Catch: java.lang.Throwable -> L11e
            r6.j(r2)     // Catch: java.lang.Throwable -> L11e
            goto L9cf
        L9ce:
            r1 = 0
        L9cf:
            com.google.android.gms.internal.measurement.m1 r2 = com.google.android.gms.internal.measurement.C0835n1.B()     // Catch: java.lang.Throwable -> L11e
            r2.h(r11)     // Catch: java.lang.Throwable -> L11e
            r11 = 1
            r2.j(r11)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r2 = r2.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r2 = (com.google.android.gms.internal.measurement.C0835n1) r2     // Catch: java.lang.Throwable -> L11e
            r6.j(r2)     // Catch: java.lang.Throwable -> L11e
            O3.b0 r2 = r47.i0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r3 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r3 = (com.google.android.gms.internal.measurement.C0859s1) r3     // Catch: java.lang.Throwable -> L11e
            java.lang.String r3 = r3.p()     // Catch: java.lang.Throwable -> L11e
            O3.I1 r1 = r2.P(r3, r8, r6, r1)     // Catch: java.lang.Throwable -> L11e
            if (r1 == 0) goto Lacf
            O3.X r2 = r47.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r2 = r2.v()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r3 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r3 = (com.google.android.gms.internal.measurement.C0859s1) r3     // Catch: java.lang.Throwable -> L11e
            java.lang.String r3 = r3.p()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r7 = r1.f4493q     // Catch: java.lang.Throwable -> L11e
            r2.d(r3, r7, r10)     // Catch: java.lang.Throwable -> L11e
            O3.n r2 = r47.f0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r3 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r3 = (com.google.android.gms.internal.measurement.C0859s1) r3     // Catch: java.lang.Throwable -> L11e
            java.lang.String r3 = r3.p()     // Catch: java.lang.Throwable -> L11e
            r2.U(r3, r1)     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r1 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r1 = (com.google.android.gms.internal.measurement.C0859s1) r1     // Catch: java.lang.Throwable -> L11e
            java.lang.String r1 = r1.p()     // Catch: java.lang.Throwable -> L11e
            boolean r1 = r9.contains(r1)     // Catch: java.lang.Throwable -> L11e
            if (r1 != 0) goto Lacf
            java.lang.Object r1 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r1 = (com.google.android.gms.internal.measurement.C0859s1) r1     // Catch: java.lang.Throwable -> L11e
            java.lang.String r1 = r1.p()     // Catch: java.lang.Throwable -> L11e
            r9.add(r1)     // Catch: java.lang.Throwable -> L11e
            goto Lacf
        La35:
            r17 = r2
            O3.g r1 = r47.d0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r2 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r2 = (com.google.android.gms.internal.measurement.C0859s1) r2     // Catch: java.lang.Throwable -> L11e
            java.lang.String r2 = r2.p()     // Catch: java.lang.Throwable -> L11e
            O3.E r3 = O3.F.f4396R0     // Catch: java.lang.Throwable -> L11e
            boolean r1 = r1.y(r2, r3)     // Catch: java.lang.Throwable -> L11e
            if (r1 == 0) goto La67
            O3.Y1 r1 = r47.j0()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r1 = r1.g0()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.m1 r2 = com.google.android.gms.internal.measurement.C0835n1.B()     // Catch: java.lang.Throwable -> L11e
            r2.h(r12)     // Catch: java.lang.Throwable -> L11e
            r2.i(r1)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r2 = r2.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r2 = (com.google.android.gms.internal.measurement.C0835n1) r2     // Catch: java.lang.Throwable -> L11e
            r6.j(r2)     // Catch: java.lang.Throwable -> L11e
            goto La68
        La67:
            r1 = 0
        La68:
            com.google.android.gms.internal.measurement.m1 r2 = com.google.android.gms.internal.measurement.C0835n1.B()     // Catch: java.lang.Throwable -> L11e
            r2.h(r11)     // Catch: java.lang.Throwable -> L11e
            r11 = 1
            r2.j(r11)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r2 = r2.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r2 = (com.google.android.gms.internal.measurement.C0835n1) r2     // Catch: java.lang.Throwable -> L11e
            r6.j(r2)     // Catch: java.lang.Throwable -> L11e
            O3.b0 r2 = r47.i0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r3 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r3 = (com.google.android.gms.internal.measurement.C0859s1) r3     // Catch: java.lang.Throwable -> L11e
            java.lang.String r3 = r3.p()     // Catch: java.lang.Throwable -> L11e
            O3.I1 r1 = r2.P(r3, r8, r6, r1)     // Catch: java.lang.Throwable -> L11e
            if (r1 == 0) goto Lacf
            O3.X r2 = r47.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r2 = r2.v()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r3 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r3 = (com.google.android.gms.internal.measurement.C0859s1) r3     // Catch: java.lang.Throwable -> L11e
            java.lang.String r3 = r3.p()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r7 = r1.f4493q     // Catch: java.lang.Throwable -> L11e
            r2.d(r3, r7, r10)     // Catch: java.lang.Throwable -> L11e
            O3.n r2 = r47.f0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r3 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r3 = (com.google.android.gms.internal.measurement.C0859s1) r3     // Catch: java.lang.Throwable -> L11e
            java.lang.String r3 = r3.p()     // Catch: java.lang.Throwable -> L11e
            r2.U(r3, r1)     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r1 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r1 = (com.google.android.gms.internal.measurement.C0859s1) r1     // Catch: java.lang.Throwable -> L11e
            java.lang.String r1 = r1.p()     // Catch: java.lang.Throwable -> L11e
            boolean r1 = r9.contains(r1)     // Catch: java.lang.Throwable -> L11e
            if (r1 != 0) goto Lacf
            java.lang.Object r1 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r1 = (com.google.android.gms.internal.measurement.C0859s1) r1     // Catch: java.lang.Throwable -> L11e
            java.lang.String r1 = r1.p()     // Catch: java.lang.Throwable -> L11e
            r9.add(r1)     // Catch: java.lang.Throwable -> L11e
            goto Lacf
        Lacd:
            r17 = r2
        Lacf:
            com.google.android.gms.internal.measurement.q2 r1 = r6.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r1 = (com.google.android.gms.internal.measurement.C0820k1) r1     // Catch: java.lang.Throwable -> L11e
            r8.W(r4, r1)     // Catch: java.lang.Throwable -> L11e
            goto Ladf
        Lad9:
            r1 = r47
            goto L910
        Ladd:
            r17 = r2
        Ladf:
            int r4 = r4 + 1
            r1 = r47
            r2 = r17
            goto L8f4
        Lae7:
            r17 = r2
            r8.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r1 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r1 = (com.google.android.gms.internal.measurement.C0859s1) r1     // Catch: java.lang.Throwable -> L11e
            r1.L1()     // Catch: java.lang.Throwable -> L11e
            O3.c r26 = r47.h0()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r27 = r8.o()     // Catch: java.lang.Throwable -> L11e
            java.util.List r28 = r8.U()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r1 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r1 = (com.google.android.gms.internal.measurement.C0859s1) r1     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.w2 r1 = r1.U1()     // Catch: java.lang.Throwable -> L11e
            java.util.List r29 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r1 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r1 = (com.google.android.gms.internal.measurement.C0859s1) r1     // Catch: java.lang.Throwable -> L11e
            long r1 = r1.a2()     // Catch: java.lang.Throwable -> L11e
            java.lang.Long r30 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r1 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r1 = (com.google.android.gms.internal.measurement.C0859s1) r1     // Catch: java.lang.Throwable -> L11e
            long r1 = r1.c2()     // Catch: java.lang.Throwable -> L11e
            java.lang.Long r31 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L11e
            boolean r0 = r0.i(r5)     // Catch: java.lang.Throwable -> L11e
            r25 = 1
            r32 = r0 ^ 1
            java.util.ArrayList r0 = r26.s(r27, r28, r29, r30, r31, r32)     // Catch: java.lang.Throwable -> L11e
            r8.J(r0)     // Catch: java.lang.Throwable -> L11e
            O3.g r0 = r47.d0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r1 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r1 = (com.google.android.gms.internal.measurement.C0859s1) r1     // Catch: java.lang.Throwable -> L11e
            java.lang.String r1 = r1.p()     // Catch: java.lang.Throwable -> L11e
            boolean r0 = r0.q(r1)     // Catch: java.lang.Throwable -> L11e
            if (r0 == 0) goto Le94
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L11e
            r1.<init>()     // Catch: java.lang.Throwable -> L11e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11e
            r2.<init>()     // Catch: java.lang.Throwable -> L11e
            O3.Y1 r0 = r47.j0()     // Catch: java.lang.Throwable -> L11e
            java.security.SecureRandom r3 = r0.l0()     // Catch: java.lang.Throwable -> L11e
            r4 = 0
        Lb57:
            int r0 = r8.V()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = "events"
            if (r4 >= r0) goto Le54
            com.google.android.gms.internal.measurement.q2 r0 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r0 = (com.google.android.gms.internal.measurement.C0859s1) r0     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r0 = r0.T1(r4)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.p2 r0 = r0.i()     // Catch: java.lang.Throwable -> L11e
            r6 = r0
            com.google.android.gms.internal.measurement.j1 r6 = (com.google.android.gms.internal.measurement.C0815j1) r6     // Catch: java.lang.Throwable -> L11e
            java.lang.String r0 = r6.l()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r7 = "_ep"
            boolean r0 = r0.equals(r7)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r7 = "_efs"
            java.lang.String r9 = "_sr"
            if (r0 == 0) goto Lbf6
            r47.i0()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r0 = r6.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0     // Catch: java.lang.Throwable -> L11e
            java.lang.String r10 = "_en"
            java.io.Serializable r0 = O3.C0270b0.x(r0, r10)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r10 = r1.get(r0)     // Catch: java.lang.Throwable -> L11e
            O3.s r10 = (O3.C0319s) r10     // Catch: java.lang.Throwable -> L11e
            if (r10 != 0) goto Lbaf
            O3.n r10 = r47.f0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r11 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r11 = (com.google.android.gms.internal.measurement.C0859s1) r11     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = r11.p()     // Catch: java.lang.Throwable -> L11e
            x3.AbstractC1887A.g(r0)     // Catch: java.lang.Throwable -> L11e
            O3.s r10 = r10.O(r5, r11, r0)     // Catch: java.lang.Throwable -> L11e
            if (r10 == 0) goto Lbaf
            r1.put(r0, r10)     // Catch: java.lang.Throwable -> L11e
        Lbaf:
            if (r10 == 0) goto Lbeb
            java.lang.Long r0 = r10.i     // Catch: java.lang.Throwable -> L11e
            if (r0 != 0) goto Lbeb
            java.lang.Long r0 = r10.j     // Catch: java.lang.Throwable -> L11e
            if (r0 == 0) goto Lbca
            long r11 = r0.longValue()     // Catch: java.lang.Throwable -> L11e
            r19 = 1
            int r5 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r5 <= 0) goto Lbcc
            r47.i0()     // Catch: java.lang.Throwable -> L11e
            O3.C0270b0.u(r6, r9, r0)     // Catch: java.lang.Throwable -> L11e
            goto Lbcc
        Lbca:
            r19 = 1
        Lbcc:
            java.lang.Boolean r0 = r10.f5047k     // Catch: java.lang.Throwable -> L11e
            if (r0 == 0) goto Lbdf
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L11e
            if (r0 == 0) goto Lbdf
            r47.i0()     // Catch: java.lang.Throwable -> L11e
            r10 = r24
            O3.C0270b0.u(r6, r7, r10)     // Catch: java.lang.Throwable -> L11e
            goto Lbe1
        Lbdf:
            r10 = r24
        Lbe1:
            com.google.android.gms.internal.measurement.q2 r0 = r6.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0     // Catch: java.lang.Throwable -> L11e
            r2.add(r0)     // Catch: java.lang.Throwable -> L11e
            goto Lbef
        Lbeb:
            r10 = r24
            r19 = 1
        Lbef:
            r8.X(r4, r6)     // Catch: java.lang.Throwable -> L11e
        Lbf2:
            r14 = r10
            r7 = 0
            goto Le4e
        Lbf6:
            r10 = r24
            r19 = 1
            O3.l0 r11 = r47.e0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r0 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r0 = (com.google.android.gms.internal.measurement.C0859s1) r0     // Catch: java.lang.Throwable -> L11e
            java.lang.String r12 = r0.p()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r0 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r0 = r11.a(r12, r0)     // Catch: java.lang.Throwable -> L11e
            boolean r13 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11e
            if (r13 != 0) goto Lc2d
            long r11 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L11e java.lang.NumberFormatException -> Lc17
            goto Lc2f
        Lc17:
            r0 = move-exception
            java.lang.Object r11 = r11.f4346r     // Catch: java.lang.Throwable -> L11e
            O3.t0 r11 = (O3.C0323t0) r11     // Catch: java.lang.Throwable -> L11e
            O3.X r11 = r11.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r11 = r11.t()     // Catch: java.lang.Throwable -> L11e
            O3.W r12 = O3.X.w(r12)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r13 = "Unable to parse timezone offset. appId"
            r11.d(r12, r0, r13)     // Catch: java.lang.Throwable -> L11e
        Lc2d:
            r11 = r17
        Lc2f:
            r47.j0()     // Catch: java.lang.Throwable -> L11e
            long r13 = r6.m()     // Catch: java.lang.Throwable -> L11e
            r21 = 60000(0xea60, double:2.9644E-319)
            long r11 = r11 * r21
            long r13 = r13 + r11
            r21 = 86400000(0x5265c00, double:4.2687272E-316)
            long r13 = r13 / r21
            com.google.android.gms.internal.measurement.q2 r0 = r6.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0     // Catch: java.lang.Throwable -> L11e
            r26 = r11
            java.lang.String r11 = "_dbg"
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L11e
            if (r12 != 0) goto Lc82
            java.util.List r0 = r0.p()     // Catch: java.lang.Throwable -> L11e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L11e
        Lc59:
            boolean r12 = r0.hasNext()     // Catch: java.lang.Throwable -> L11e
            if (r12 == 0) goto Lc82
            java.lang.Object r12 = r0.next()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.n1 r12 = (com.google.android.gms.internal.measurement.C0835n1) r12     // Catch: java.lang.Throwable -> L11e
            r50 = r12
            java.lang.String r12 = r50.q()     // Catch: java.lang.Throwable -> L11e
            boolean r12 = r11.equals(r12)     // Catch: java.lang.Throwable -> L11e
            if (r12 == 0) goto Lc59
            long r11 = r50.u()     // Catch: java.lang.Throwable -> L11e
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L11e
            boolean r0 = r10.equals(r0)     // Catch: java.lang.Throwable -> L11e
            if (r0 != 0) goto Lc80
            goto Lc82
        Lc80:
            r0 = 1
            goto Lc96
        Lc82:
            O3.l0 r0 = r47.e0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r11 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r11 = (com.google.android.gms.internal.measurement.C0859s1) r11     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = r11.p()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r12 = r6.l()     // Catch: java.lang.Throwable -> L11e
            int r0 = r0.F(r11, r12)     // Catch: java.lang.Throwable -> L11e
        Lc96:
            if (r0 > 0) goto Lcbb
            O3.X r5 = r47.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r5 = r5.t()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r7 = "Sample rate must be positive. event, rate"
            java.lang.String r9 = r6.l()     // Catch: java.lang.Throwable -> L11e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L11e
            r5.d(r9, r0, r7)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r0 = r6.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0     // Catch: java.lang.Throwable -> L11e
            r2.add(r0)     // Catch: java.lang.Throwable -> L11e
            r8.X(r4, r6)     // Catch: java.lang.Throwable -> L11e
            goto Lbf2
        Lcbb:
            java.lang.String r11 = r6.l()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r11 = r1.get(r11)     // Catch: java.lang.Throwable -> L11e
            O3.s r11 = (O3.C0319s) r11     // Catch: java.lang.Throwable -> L11e
            if (r11 != 0) goto Ld20
            O3.n r11 = r47.f0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r12 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r12 = (com.google.android.gms.internal.measurement.C0859s1) r12     // Catch: java.lang.Throwable -> L11e
            java.lang.String r12 = r12.p()     // Catch: java.lang.Throwable -> L11e
            r28 = r13
            java.lang.String r13 = r6.l()     // Catch: java.lang.Throwable -> L11e
            O3.s r11 = r11.O(r5, r12, r13)     // Catch: java.lang.Throwable -> L11e
            if (r11 != 0) goto Ld22
            O3.X r5 = r47.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r5 = r5.t()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = "Event being bundled has no eventAggregate. appId, eventName"
            java.lang.Object r12 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r12 = (com.google.android.gms.internal.measurement.C0859s1) r12     // Catch: java.lang.Throwable -> L11e
            java.lang.String r12 = r12.p()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r13 = r6.l()     // Catch: java.lang.Throwable -> L11e
            r5.d(r12, r13, r11)     // Catch: java.lang.Throwable -> L11e
            O3.s r30 = new O3.s     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r5 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5     // Catch: java.lang.Throwable -> L11e
            java.lang.String r31 = r5.p()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r32 = r6.l()     // Catch: java.lang.Throwable -> L11e
            long r39 = r6.m()     // Catch: java.lang.Throwable -> L11e
            r45 = 0
            r46 = 0
            r33 = 1
            r35 = 1
            r37 = 1
            r41 = 0
            r43 = 0
            r44 = 0
            r30.<init>(r31, r32, r33, r35, r37, r39, r41, r43, r44, r45, r46)     // Catch: java.lang.Throwable -> L11e
            r11 = r30
            goto Ld22
        Ld20:
            r28 = r13
        Ld22:
            r47.i0()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r5 = r6.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r5 = (com.google.android.gms.internal.measurement.C0820k1) r5     // Catch: java.lang.Throwable -> L11e
            java.lang.String r12 = "_eid"
            java.io.Serializable r5 = O3.C0270b0.x(r5, r12)     // Catch: java.lang.Throwable -> L11e
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L11e
            if (r5 == 0) goto Ld39
            r25 = 1
        Ld37:
            r12 = 1
            goto Ld3c
        Ld39:
            r25 = 0
            goto Ld37
        Ld3c:
            if (r0 != r12) goto Ld66
            com.google.android.gms.internal.measurement.q2 r0 = r6.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0     // Catch: java.lang.Throwable -> L11e
            r2.add(r0)     // Catch: java.lang.Throwable -> L11e
            if (r25 == 0) goto Ld61
            java.lang.Long r0 = r11.i     // Catch: java.lang.Throwable -> L11e
            if (r0 != 0) goto Ld55
            java.lang.Long r0 = r11.j     // Catch: java.lang.Throwable -> L11e
            if (r0 != 0) goto Ld55
            java.lang.Boolean r0 = r11.f5047k     // Catch: java.lang.Throwable -> L11e
            if (r0 == 0) goto Ld61
        Ld55:
            r5 = 0
            O3.s r0 = r11.b(r5, r5, r5)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r5 = r6.l()     // Catch: java.lang.Throwable -> L11e
            r1.put(r5, r0)     // Catch: java.lang.Throwable -> L11e
        Ld61:
            r8.X(r4, r6)     // Catch: java.lang.Throwable -> L11e
            goto Lbf2
        Ld66:
            int r13 = r3.nextInt(r0)     // Catch: java.lang.Throwable -> L11e
            if (r13 != 0) goto Ldc5
            r47.i0()     // Catch: java.lang.Throwable -> L11e
            long r13 = (long) r0     // Catch: java.lang.Throwable -> L11e
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L11e
            O3.C0270b0.u(r6, r9, r0)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r5 = r6.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r5 = (com.google.android.gms.internal.measurement.C0820k1) r5     // Catch: java.lang.Throwable -> L11e
            r2.add(r5)     // Catch: java.lang.Throwable -> L11e
            if (r25 == 0) goto Ld87
            r5 = 0
            O3.s r11 = r11.b(r5, r0, r5)     // Catch: java.lang.Throwable -> L11e
        Ld87:
            java.lang.String r0 = r6.l()     // Catch: java.lang.Throwable -> L11e
            long r41 = r6.m()     // Catch: java.lang.Throwable -> L11e
            O3.s r30 = new O3.s     // Catch: java.lang.Throwable -> L11e
            java.lang.Long r43 = java.lang.Long.valueOf(r28)     // Catch: java.lang.Throwable -> L11e
            java.lang.Long r5 = r11.i     // Catch: java.lang.Throwable -> L11e
            java.lang.Long r7 = r11.j     // Catch: java.lang.Throwable -> L11e
            java.lang.Boolean r9 = r11.f5047k     // Catch: java.lang.Throwable -> L11e
            java.lang.String r13 = r11.f5040a     // Catch: java.lang.Throwable -> L11e
            java.lang.String r14 = r11.f5041b     // Catch: java.lang.Throwable -> L11e
            r31 = r13
            long r12 = r11.f5042c     // Catch: java.lang.Throwable -> L11e
            r33 = r12
            long r12 = r11.f5043d     // Catch: java.lang.Throwable -> L11e
            r35 = r12
            long r12 = r11.f5044e     // Catch: java.lang.Throwable -> L11e
            r37 = r12
            long r11 = r11.f     // Catch: java.lang.Throwable -> L11e
            r44 = r5
            r45 = r7
            r46 = r9
            r39 = r11
            r32 = r14
            r30.<init>(r31, r32, r33, r35, r37, r39, r41, r43, r44, r45, r46)     // Catch: java.lang.Throwable -> L11e
            r5 = r30
            r1.put(r0, r5)     // Catch: java.lang.Throwable -> L11e
            r14 = r10
        Ldc2:
            r7 = 0
            goto Le4b
        Ldc5:
            java.lang.Long r12 = r11.f5046h     // Catch: java.lang.Throwable -> L11e
            if (r12 == 0) goto Ldce
            long r12 = r12.longValue()     // Catch: java.lang.Throwable -> L11e
            goto Ldd9
        Ldce:
            r47.j0()     // Catch: java.lang.Throwable -> L11e
            long r12 = r6.n()     // Catch: java.lang.Throwable -> L11e
            long r12 = r26 + r12
            long r12 = r12 / r21
        Ldd9:
            int r12 = (r12 > r28 ? 1 : (r12 == r28 ? 0 : -1))
            if (r12 == 0) goto Le3c
            r47.i0()     // Catch: java.lang.Throwable -> L11e
            O3.C0270b0.u(r6, r7, r10)     // Catch: java.lang.Throwable -> L11e
            r47.i0()     // Catch: java.lang.Throwable -> L11e
            long r12 = (long) r0     // Catch: java.lang.Throwable -> L11e
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L11e
            O3.C0270b0.u(r6, r9, r0)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r5 = r6.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.k1 r5 = (com.google.android.gms.internal.measurement.C0820k1) r5     // Catch: java.lang.Throwable -> L11e
            r2.add(r5)     // Catch: java.lang.Throwable -> L11e
            if (r25 == 0) goto Le00
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L11e
            r7 = 0
            O3.s r11 = r11.b(r7, r0, r5)     // Catch: java.lang.Throwable -> L11e
        Le00:
            java.lang.String r0 = r6.l()     // Catch: java.lang.Throwable -> L11e
            long r41 = r6.m()     // Catch: java.lang.Throwable -> L11e
            O3.s r30 = new O3.s     // Catch: java.lang.Throwable -> L11e
            java.lang.Long r43 = java.lang.Long.valueOf(r28)     // Catch: java.lang.Throwable -> L11e
            java.lang.Long r5 = r11.i     // Catch: java.lang.Throwable -> L11e
            java.lang.Long r7 = r11.j     // Catch: java.lang.Throwable -> L11e
            java.lang.Boolean r9 = r11.f5047k     // Catch: java.lang.Throwable -> L11e
            java.lang.String r12 = r11.f5040a     // Catch: java.lang.Throwable -> L11e
            java.lang.String r13 = r11.f5041b     // Catch: java.lang.Throwable -> L11e
            r46 = r9
            r14 = r10
            long r9 = r11.f5042c     // Catch: java.lang.Throwable -> L11e
            r33 = r9
            long r9 = r11.f5043d     // Catch: java.lang.Throwable -> L11e
            r35 = r9
            long r9 = r11.f5044e     // Catch: java.lang.Throwable -> L11e
            r37 = r9
            long r9 = r11.f     // Catch: java.lang.Throwable -> L11e
            r44 = r5
            r45 = r7
            r39 = r9
            r31 = r12
            r32 = r13
            r30.<init>(r31, r32, r33, r35, r37, r39, r41, r43, r44, r45, r46)     // Catch: java.lang.Throwable -> L11e
            r5 = r30
            r1.put(r0, r5)     // Catch: java.lang.Throwable -> L11e
            goto Ldc2
        Le3c:
            r14 = r10
            if (r25 == 0) goto Ldc2
            java.lang.String r0 = r6.l()     // Catch: java.lang.Throwable -> L11e
            r7 = 0
            O3.s r5 = r11.b(r5, r7, r7)     // Catch: java.lang.Throwable -> L11e
            r1.put(r0, r5)     // Catch: java.lang.Throwable -> L11e
        Le4b:
            r8.X(r4, r6)     // Catch: java.lang.Throwable -> L11e
        Le4e:
            int r4 = r4 + 1
            r24 = r14
            goto Lb57
        Le54:
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L11e
            int r3 = r8.V()     // Catch: java.lang.Throwable -> L11e
            if (r0 >= r3) goto Le72
            r8.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r0 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r0 = (com.google.android.gms.internal.measurement.C0859s1) r0     // Catch: java.lang.Throwable -> L11e
            r0.a0()     // Catch: java.lang.Throwable -> L11e
            r8.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r0 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r0 = (com.google.android.gms.internal.measurement.C0859s1) r0     // Catch: java.lang.Throwable -> L11e
            r0.Z(r2)     // Catch: java.lang.Throwable -> L11e
        Le72:
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Throwable -> L11e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L11e
        Le7a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L11e
            if (r1 == 0) goto Le94
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L11e
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L11e
            O3.n r2 = r47.f0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L11e
            O3.s r1 = (O3.C0319s) r1     // Catch: java.lang.Throwable -> L11e
            r2.P(r5, r1)     // Catch: java.lang.Throwable -> L11e
            goto Le7a
        Le94:
            java.lang.Object r0 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r0 = (com.google.android.gms.internal.measurement.C0859s1) r0     // Catch: java.lang.Throwable -> L11e
            java.lang.String r0 = r0.p()     // Catch: java.lang.Throwable -> L11e
            O3.n r1 = r47.f0()     // Catch: java.lang.Throwable -> L11e
            O3.c0 r1 = r1.s0(r0)     // Catch: java.lang.Throwable -> L11e
            if (r1 != 0) goto Lec1
            O3.X r1 = r47.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r1 = r1.s()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r2 = "Bundling raw events w/o app info. appId"
            java.lang.Object r3 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r3 = (com.google.android.gms.internal.measurement.C0859s1) r3     // Catch: java.lang.Throwable -> L11e
            java.lang.String r3 = r3.p()     // Catch: java.lang.Throwable -> L11e
            O3.W r3 = O3.X.w(r3)     // Catch: java.lang.Throwable -> L11e
            r1.c(r3, r2)     // Catch: java.lang.Throwable -> L11e
            goto Lf55
        Lec1:
            int r2 = r8.V()     // Catch: java.lang.Throwable -> L11e
            if (r2 <= 0) goto Lf55
            O3.t0 r2 = r1.f4793a     // Catch: java.lang.Throwable -> L11e
            O3.p0 r2 = r2.f5078w     // Catch: java.lang.Throwable -> L11e
            O3.C0323t0.l(r2)     // Catch: java.lang.Throwable -> L11e
            r2.o()     // Catch: java.lang.Throwable -> L11e
            long r2 = r1.i     // Catch: java.lang.Throwable -> L11e
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto Ledb
            r8.h(r2)     // Catch: java.lang.Throwable -> L11e
            goto Lede
        Ledb:
            r8.i()     // Catch: java.lang.Throwable -> L11e
        Lede:
            O3.t0 r4 = r1.f4793a     // Catch: java.lang.Throwable -> L11e
            O3.p0 r4 = r4.f5078w     // Catch: java.lang.Throwable -> L11e
            O3.C0323t0.l(r4)     // Catch: java.lang.Throwable -> L11e
            r4.o()     // Catch: java.lang.Throwable -> L11e
            long r4 = r1.f4799h     // Catch: java.lang.Throwable -> L11e
            int r6 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r6 != 0) goto Leef
            goto Lef0
        Leef:
            r2 = r4
        Lef0:
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto Lef8
            r8.c0(r2)     // Catch: java.lang.Throwable -> L11e
            goto Lefb
        Lef8:
            r8.d0()     // Catch: java.lang.Throwable -> L11e
        Lefb:
            int r2 = r8.V()     // Catch: java.lang.Throwable -> L11e
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L11e
            r1.h(r2)     // Catch: java.lang.Throwable -> L11e
            O3.t0 r2 = r1.f4793a     // Catch: java.lang.Throwable -> L11e
            O3.p0 r2 = r2.f5078w     // Catch: java.lang.Throwable -> L11e
            O3.C0323t0.l(r2)     // Catch: java.lang.Throwable -> L11e
            r2.o()     // Catch: java.lang.Throwable -> L11e
            long r2 = r1.f4779F     // Catch: java.lang.Throwable -> L11e
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L11e
            r8.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r3 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r3 = (com.google.android.gms.internal.measurement.C0859s1) r3     // Catch: java.lang.Throwable -> L11e
            r3.j1(r2)     // Catch: java.lang.Throwable -> L11e
            O3.t0 r2 = r1.f4793a     // Catch: java.lang.Throwable -> L11e
            O3.p0 r2 = r2.f5078w     // Catch: java.lang.Throwable -> L11e
            O3.C0323t0.l(r2)     // Catch: java.lang.Throwable -> L11e
            r2.o()     // Catch: java.lang.Throwable -> L11e
            long r2 = r1.f4798g     // Catch: java.lang.Throwable -> L11e
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L11e
            r8.x(r2)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r2 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r2 = (com.google.android.gms.internal.measurement.C0859s1) r2     // Catch: java.lang.Throwable -> L11e
            long r2 = r2.a2()     // Catch: java.lang.Throwable -> L11e
            r1.L(r2)     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r2 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r2 = (com.google.android.gms.internal.measurement.C0859s1) r2     // Catch: java.lang.Throwable -> L11e
            long r2 = r2.c2()     // Catch: java.lang.Throwable -> L11e
            r1.M(r2)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r2 = r1.u()     // Catch: java.lang.Throwable -> L11e
            if (r2 == 0) goto Lf4a
            r8.F(r2)     // Catch: java.lang.Throwable -> L11e
            goto Lf4d
        Lf4a:
            r8.G()     // Catch: java.lang.Throwable -> L11e
        Lf4d:
            O3.n r2 = r47.f0()     // Catch: java.lang.Throwable -> L11e
            r4 = 0
            r2.t0(r1, r4)     // Catch: java.lang.Throwable -> L11e
        Lf55:
            int r1 = r8.V()     // Catch: java.lang.Throwable -> L11e
            if (r1 <= 0) goto Lfc9
            r23.getClass()     // Catch: java.lang.Throwable -> L11e
            O3.l0 r1 = r47.e0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r2 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r2 = (com.google.android.gms.internal.measurement.C0859s1) r2     // Catch: java.lang.Throwable -> L11e
            java.lang.String r2 = r2.p()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.O0 r1 = r1.A(r2)     // Catch: java.lang.Throwable -> L11e
            if (r1 == 0) goto Lf86
            boolean r2 = r1.p()     // Catch: java.lang.Throwable -> L11e
            if (r2 != 0) goto Lf77
            goto Lf86
        Lf77:
            long r1 = r1.q()     // Catch: java.lang.Throwable -> L11e
            r8.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r3 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r3 = (com.google.android.gms.internal.measurement.C0859s1) r3     // Catch: java.lang.Throwable -> L11e
            r3.Q0(r1)     // Catch: java.lang.Throwable -> L11e
            goto Lfba
        Lf86:
            java.lang.Object r1 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r1 = (com.google.android.gms.internal.measurement.C0859s1) r1     // Catch: java.lang.Throwable -> L11e
            java.lang.String r1 = r1.E()     // Catch: java.lang.Throwable -> L11e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L11e
            if (r1 == 0) goto Lfa1
            r8.b()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r1 = r8.f11012r     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r1 = (com.google.android.gms.internal.measurement.C0859s1) r1     // Catch: java.lang.Throwable -> L11e
            r2 = -1
            r1.Q0(r2)     // Catch: java.lang.Throwable -> L11e
            goto Lfba
        Lfa1:
            O3.X r1 = r47.b()     // Catch: java.lang.Throwable -> L11e
            O3.V r1 = r1.t()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r2 = "Did not find measurement config or missing version info. appId"
            java.lang.Object r3 = r15.f4860b     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r3 = (com.google.android.gms.internal.measurement.C0859s1) r3     // Catch: java.lang.Throwable -> L11e
            java.lang.String r3 = r3.p()     // Catch: java.lang.Throwable -> L11e
            O3.W r3 = O3.X.w(r3)     // Catch: java.lang.Throwable -> L11e
            r1.c(r3, r2)     // Catch: java.lang.Throwable -> L11e
        Lfba:
            O3.n r1 = r47.f0()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.q2 r2 = r8.e()     // Catch: java.lang.Throwable -> L11e
            com.google.android.gms.internal.measurement.s1 r2 = (com.google.android.gms.internal.measurement.C0859s1) r2     // Catch: java.lang.Throwable -> L11e
            r9 = r16
            r1.x0(r2, r9)     // Catch: java.lang.Throwable -> L11e
        Lfc9:
            O3.n r1 = r47.f0()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r2 = r15.f4861c     // Catch: java.lang.Throwable -> L11e
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L11e
            r1.E(r2)     // Catch: java.lang.Throwable -> L11e
            O3.n r1 = r47.f0()     // Catch: java.lang.Throwable -> L11e
            r1.F(r0)     // Catch: java.lang.Throwable -> L11e
            O3.n r0 = r47.f0()     // Catch: java.lang.Throwable -> L11e
            r0.d0()     // Catch: java.lang.Throwable -> L11e
            r9 = 1
            goto Lfec
        Lfe4:
            O3.n r0 = r47.f0()     // Catch: java.lang.Throwable -> L11e
            r0.d0()     // Catch: java.lang.Throwable -> L11e
            r9 = r4
        Lfec:
            O3.n r0 = r47.f0()
            r0.e0()
            return r9
        Lff4:
            O3.n r1 = r47.f0()
            r1.e0()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T1.G(java.lang.String, long):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(C0854r1 c0854r1, long j, boolean z5) {
        W1 w12;
        Object obj;
        String str = true != z5 ? "_lte" : "_se";
        C0305n c0305n = this.f4609s;
        S(c0305n);
        W1 w1K0 = c0305n.k0(c0854r1.o(), str);
        if (w1K0 == null || (obj = w1K0.f4661e) == null) {
            String strO = c0854r1.o();
            e().getClass();
            w12 = new W1(strO, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String strO2 = c0854r1.o();
            e().getClass();
            w12 = new W1(strO2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        com.google.android.gms.internal.measurement.A1 a1A = com.google.android.gms.internal.measurement.B1.A();
        a1A.b();
        ((com.google.android.gms.internal.measurement.B1) a1A.f11012r).C(str);
        e().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        a1A.b();
        ((com.google.android.gms.internal.measurement.B1) a1A.f11012r).B(jCurrentTimeMillis);
        Object obj2 = w12.f4661e;
        long jLongValue = ((Long) obj2).longValue();
        a1A.b();
        ((com.google.android.gms.internal.measurement.B1) a1A.f11012r).F(jLongValue);
        com.google.android.gms.internal.measurement.B1 b12 = (com.google.android.gms.internal.measurement.B1) a1A.e();
        int iC0 = C0270b0.c0(c0854r1, str);
        if (iC0 >= 0) {
            c0854r1.b();
            ((C0859s1) c0854r1.f11012r).c0(iC0, b12);
        } else {
            c0854r1.b();
            ((C0859s1) c0854r1.f11012r).d0(b12);
        }
        if (j > 0) {
            C0305n c0305n2 = this.f4609s;
            S(c0305n2);
            c0305n2.j0(w12);
            b().f4666E.d(true != z5 ? "lifetime" : "session-scoped", obj2, "Updated engagement user property. scope, value");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean I(C0815j1 c0815j1, C0815j1 c0815j12) {
        AbstractC1887A.a("_e".equals(c0815j1.l()));
        i0();
        C0835n1 c0835n1W = C0270b0.w((C0820k1) c0815j1.e(), "_sc");
        String strS = c0835n1W == null ? null : c0835n1W.s();
        i0();
        C0835n1 c0835n1W2 = C0270b0.w((C0820k1) c0815j12.e(), "_pc");
        String strS2 = c0835n1W2 != null ? c0835n1W2.s() : null;
        if (strS2 == null || !strS2.equals(strS)) {
            return false;
        }
        AbstractC1887A.a("_e".equals(c0815j1.l()));
        i0();
        C0835n1 c0835n1W3 = C0270b0.w((C0820k1) c0815j1.e(), "_et");
        if (c0835n1W3 == null || !c0835n1W3.t() || c0835n1W3.u() <= 0) {
            return true;
        }
        long jU = c0835n1W3.u();
        i0();
        C0835n1 c0835n1W4 = C0270b0.w((C0820k1) c0815j12.e(), "_et");
        if (c0835n1W4 != null && c0835n1W4.u() > 0) {
            jU += c0835n1W4.u();
        }
        i0();
        C0270b0.u(c0815j12, "_et", Long.valueOf(jU));
        i0();
        C0270b0.u(c0815j1, "_fr", 1L);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean J() {
        c().o();
        k0();
        C0305n c0305n = this.f4609s;
        S(c0305n);
        if (c0305n.K("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        C0305n c0305n2 = this.f4609s;
        S(c0305n2);
        return !TextUtils.isEmpty(c0305n2.w());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x032a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            r22 = this;
            r1 = r22
            O3.b0 r0 = r1.f4613w
            O3.p0 r2 = r1.c()
            r2.o()
            r1.k0()
            long r2 = r1.f4585E
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L51
            B3.a r2 = r1.e()
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r6 = r1.f4585E
            long r2 = r2 - r6
            long r2 = java.lang.Math.abs(r2)
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            long r6 = r6 - r2
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L4f
            O3.X r0 = r1.b()
            O3.V r0 = r0.f4666E
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r0.c(r3, r2)
            O3.d0 r0 = r1.g0()
            r0.a()
            O3.J1 r0 = r1.f4611u
            S(r0)
            r0.s()
            return
        L4f:
            r1.f4585E = r4
        L51:
            O3.t0 r2 = r1.f4582B
            boolean r2 = r2.h()
            if (r2 == 0) goto L3b4
            boolean r2 = r1.J()
            if (r2 != 0) goto L61
            goto L3b4
        L61:
            B3.a r2 = r1.e()
            r2.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            r1.d0()
            O3.E r6 = O3.F.f4389O
            r7 = 0
            java.lang.Object r6 = r6.a(r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r8 = r6.longValue()
            long r8 = java.lang.Math.max(r4, r8)
            O3.n r6 = r1.f4609s
            S(r6)
            java.lang.String r10 = "select count(1) > 0 from raw_events where realtime = 1"
            long r10 = r6.K(r10, r7)
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto L91
        L8f:
            r6 = 1
            goto La2
        L91:
            O3.n r6 = r1.f4609s
            S(r6)
            java.lang.String r12 = "select count(1) > 0 from queue where has_realtime = 1"
            long r12 = r6.K(r12, r7)
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto La1
            goto L8f
        La1:
            r6 = 0
        La2:
            if (r6 == 0) goto Le4
            O3.g r12 = r1.d0()
            java.lang.String r13 = "debug.firebase.analytics.app"
            java.lang.String r12 = r12.s(r13)
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto Ld0
            java.lang.String r13 = ".none."
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto Ld0
            r1.d0()
            O3.E r12 = O3.F.f4379J
            java.lang.Object r12 = r12.a(r7)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r4, r12)
            goto Lf7
        Ld0:
            r1.d0()
            O3.E r12 = O3.F.f4377I
            java.lang.Object r12 = r12.a(r7)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r4, r12)
            goto Lf7
        Le4:
            r1.d0()
            O3.E r12 = O3.F.f4375H
            java.lang.Object r12 = r12.a(r7)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r4, r12)
        Lf7:
            O3.y1 r14 = r1.f4615y
            O3.f0 r14 = r14.f5166y
            long r14 = r14.a()
            O3.y1 r11 = r1.f4615y
            O3.f0 r11 = r11.f5167z
            long r16 = r11.a()
            O3.n r11 = r1.f4609s
            S(r11)
            java.lang.String r10 = "select max(bundle_end_timestamp) from queue"
            long r10 = r11.L(r10, r7, r4)
            O3.n r4 = r1.f4609s
            S(r4)
            java.lang.String r5 = "select max(timestamp) from raw_events"
            r20 = r2
            r2 = 0
            long r4 = r4.L(r5, r7, r2)
            long r4 = java.lang.Math.max(r10, r4)
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 != 0) goto L130
            r4 = 0
        L12b:
            r6 = 0
        L12c:
            r18 = 0
            goto L1b5
        L130:
            long r4 = r4 - r20
            long r2 = java.lang.Math.abs(r4)
            long r2 = r20 - r2
            long r14 = r14 - r20
            long r4 = java.lang.Math.abs(r14)
            long r4 = r20 - r4
            long r16 = r16 - r20
            long r10 = java.lang.Math.abs(r16)
            long r10 = r20 - r10
            long r8 = r8 + r2
            long r4 = java.lang.Math.max(r4, r10)
            if (r6 == 0) goto L15a
            r18 = 0
            int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r6 <= 0) goto L15a
            long r8 = java.lang.Math.min(r2, r4)
            long r8 = r8 + r12
        L15a:
            S(r0)
            boolean r6 = r0.Y(r4, r12)
            if (r6 != 0) goto L167
            long r4 = r4 + r12
        L164:
            r18 = 0
            goto L169
        L167:
            r4 = r8
            goto L164
        L169:
            int r6 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r6 == 0) goto L12b
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 < 0) goto L12b
            r2 = 0
        L172:
            r1.d0()
            O3.E r3 = O3.F.f4393Q
            java.lang.Object r3 = r3.a(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r6 = 0
            int r3 = java.lang.Math.max(r6, r3)
            r8 = 20
            int r3 = java.lang.Math.min(r8, r3)
            if (r2 >= r3) goto L1b1
            r8 = 1
            long r8 = r8 << r2
            r1.d0()
            O3.E r3 = O3.F.f4391P
            java.lang.Object r3 = r3.a(r7)
            java.lang.Long r3 = (java.lang.Long) r3
            long r12 = r3.longValue()
            r14 = 0
            long r12 = java.lang.Math.max(r14, r12)
            long r12 = r12 * r8
            long r4 = r4 + r12
            int r3 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r3 <= 0) goto L1ae
            goto L12c
        L1ae:
            int r2 = r2 + 1
            goto L172
        L1b1:
            r4 = 0
            goto L12c
        L1b5:
            int r2 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r2 != 0) goto L1d4
            O3.X r0 = r1.b()
            O3.V r0 = r0.f4666E
            java.lang.String r2 = "Next upload time is 0"
            r0.b(r2)
            O3.d0 r0 = r1.g0()
            r0.a()
            O3.J1 r0 = r1.f4611u
            S(r0)
            r0.s()
            return
        L1d4:
            O3.b0 r2 = r1.f4608r
            S(r2)
            boolean r2 = r2.I()
            if (r2 == 0) goto L35e
            O3.y1 r2 = r1.f4615y
            O3.f0 r2 = r2.f5165x
            long r2 = r2.a()
            r1.d0()
            O3.E r8 = O3.F.f4373G
            java.lang.Object r8 = r8.a(r7)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            r14 = 0
            long r8 = java.lang.Math.max(r14, r8)
            S(r0)
            boolean r0 = r0.Y(r2, r8)
            if (r0 != 0) goto L20a
            long r2 = r2 + r8
            long r4 = java.lang.Math.max(r4, r2)
        L20a:
            O3.d0 r0 = r1.g0()
            r0.a()
            B3.a r0 = r1.e()
            r0.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            r14 = 0
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 > 0) goto L248
            r1.d0()
            O3.E r0 = O3.F.f4381K
            java.lang.Object r0 = r0.a(r7)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            long r4 = java.lang.Math.max(r14, r2)
            O3.y1 r0 = r1.f4615y
            O3.f0 r0 = r0.f5166y
            B3.a r2 = r1.e()
            r2.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            r0.b(r2)
        L248:
            O3.X r0 = r1.b()
            O3.V r0 = r0.f4666E
            java.lang.String r2 = "Upload scheduled in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r0.c(r3, r2)
            O3.J1 r0 = r1.f4611u
            S(r0)
            r0.p()
            java.lang.Object r2 = r0.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            r2.getClass()
            O3.X r3 = r2.f5077v
            android.content.Context r8 = r2.f5072q
            boolean r9 = O3.Y1.e0(r8)
            if (r9 != 0) goto L27a
            O3.C0323t0.l(r3)
            O3.V r9 = r3.f4665D
            java.lang.String r10 = "Receiver not registered/enabled"
            r9.b(r10)
        L27a:
            boolean r9 = O3.Y1.H(r8)
            if (r9 != 0) goto L28a
            O3.C0323t0.l(r3)
            O3.V r9 = r3.f4665D
            java.lang.String r10 = "Service not registered/enabled"
            r9.b(r10)
        L28a:
            r0.s()
            O3.C0323t0.l(r3)
            O3.V r3 = r3.f4666E
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            java.lang.String r10 = "Scheduling upload, millis"
            r3.c(r9, r10)
            B3.a r2 = r2.f5052A
            r2.getClass()
            android.os.SystemClock.elapsedRealtime()
            O3.E r2 = O3.F.f4383L
            java.lang.Object r2 = r2.a(r7)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r14 = 0
            long r2 = java.lang.Math.max(r14, r2)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L2cb
            O3.o r2 = r0.t()
            long r2 = r2.f4999c
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L2c4
            goto L2cb
        L2c4:
            O3.o r2 = r0.t()
            r2.b(r4)
        L2cb:
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementJobService"
            r2.<init>(r8, r3)
            int r0 = r0.v()
            android.os.PersistableBundle r3 = new android.os.PersistableBundle
            r3.<init>()
            java.lang.String r9 = "action"
            java.lang.String r10 = "com.google.android.gms.measurement.UPLOAD"
            r3.putString(r9, r10)
            android.app.job.JobInfo$Builder r9 = new android.app.job.JobInfo$Builder
            r9.<init>(r0, r2)
            android.app.job.JobInfo$Builder r0 = r9.setMinimumLatency(r4)
            long r4 = r4 + r4
            android.app.job.JobInfo$Builder r0 = r0.setOverrideDeadline(r4)
            android.app.job.JobInfo$Builder r0 = r0.setExtras(r3)
            android.app.job.JobInfo r2 = r0.build()
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.F.f10627a
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r8.getSystemService(r0)
            r3 = r0
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3
            r3.getClass()
            java.lang.reflect.Method r4 = com.google.android.gms.internal.measurement.F.f10627a
            if (r4 == 0) goto L35a
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r0 = r8.checkSelfPermission(r0)
            if (r0 == 0) goto L313
            goto L35a
        L313:
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.F.f10628b
            if (r0 == 0) goto L32a
            java.lang.Class<android.os.UserHandle> r5 = android.os.UserHandle.class
            java.lang.Object r0 = r0.invoke(r5, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L326 java.lang.IllegalAccessException -> L328
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.reflect.InvocationTargetException -> L326 java.lang.IllegalAccessException -> L328
            if (r0 == 0) goto L32a
            int r10 = r0.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L326 java.lang.IllegalAccessException -> L328
            goto L33b
        L326:
            r0 = move-exception
            goto L32c
        L328:
            r0 = move-exception
            goto L32c
        L32a:
            r10 = r6
            goto L33b
        L32c:
            r5 = 6
            java.lang.String r7 = "JobSchedulerCompat"
            boolean r5 = android.util.Log.isLoggable(r7, r5)
            if (r5 == 0) goto L32a
            java.lang.String r5 = "myUserId invocation illegal"
            android.util.Log.e(r7, r5, r0)
            goto L32a
        L33b:
            java.lang.String r5 = "UploadAlarm"
            java.lang.String r0 = "com.google.android.gms"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.reflect.InvocationTargetException -> L34e java.lang.IllegalAccessException -> L350
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0, r6, r5}     // Catch: java.lang.reflect.InvocationTargetException -> L34e java.lang.IllegalAccessException -> L350
            java.lang.Object r0 = r4.invoke(r3, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L34e java.lang.IllegalAccessException -> L350
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.reflect.InvocationTargetException -> L34e java.lang.IllegalAccessException -> L350
            goto L359
        L34e:
            r0 = move-exception
            goto L351
        L350:
            r0 = move-exception
        L351:
            java.lang.String r4 = "error calling scheduleAsPackage"
            android.util.Log.e(r5, r4, r0)
            r3.schedule(r2)
        L359:
            return
        L35a:
            r3.schedule(r2)
            return
        L35e:
            O3.X r0 = r1.b()
            O3.V r0 = r0.f4666E
            java.lang.String r2 = "No network"
            r0.b(r2)
            O3.d0 r0 = r1.g0()
            O3.T1 r2 = r0.f4826a
            r2.k0()
            O3.p0 r3 = r2.c()
            r3.o()
            boolean r3 = r0.f4827b
            if (r3 == 0) goto L37e
            goto L3ab
        L37e:
            O3.t0 r3 = r2.f4582B
            android.content.Context r3 = r3.f5072q
            android.content.IntentFilter r4 = new android.content.IntentFilter
            java.lang.String r5 = "android.net.conn.CONNECTIVITY_CHANGE"
            r4.<init>(r5)
            r3.registerReceiver(r0, r4)
            O3.b0 r3 = r2.f4608r
            S(r3)
            boolean r3 = r3.I()
            r0.f4828c = r3
            O3.X r2 = r2.b()
            O3.V r2 = r2.f4666E
            boolean r3 = r0.f4828c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Registering connectivity change receiver. Network connected"
            r2.c(r3, r4)
            r2 = 1
            r0.f4827b = r2
        L3ab:
            O3.J1 r0 = r1.f4611u
            S(r0)
            r0.s()
            return
        L3b4:
            O3.X r0 = r1.b()
            O3.V r0 = r0.f4666E
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r0.b(r2)
            O3.d0 r0 = r1.g0()
            r0.a()
            O3.J1 r0 = r1.f4611u
            S(r0)
            r0.s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T1.L():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M() {
        c().o();
        if (this.f4590J || this.f4591K || this.f4592L) {
            b().f4666E.e("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f4590J), Boolean.valueOf(this.f4591K), Boolean.valueOf(this.f4592L));
            return;
        }
        b().f4666E.b("Stopping uploading service(s)");
        ArrayList arrayList = this.f4586F;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        ArrayList arrayList2 = this.f4586F;
        AbstractC1887A.g(arrayList2);
        arrayList2.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Boolean N(C0273c0 c0273c0) {
        try {
            long jP = c0273c0.P();
            C0323t0 c0323t0 = this.f4582B;
            if (jP != -2147483648L) {
                if (c0273c0.P() == C3.c.a(c0323t0.f5072q).a(0, c0273c0.D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C3.c.a(c0323t0.f5072q).a(0, c0273c0.D()).versionName;
                String strN = c0273c0.N();
                if (strN != null && strN.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final a2 O(String str) {
        C0305n c0305n = this.f4609s;
        S(c0305n);
        C0273c0 c0273c0S0 = c0305n.s0(str);
        if (c0273c0S0 != null) {
            C0323t0 c0323t0 = c0273c0S0.f4793a;
            if (!TextUtils.isEmpty(c0273c0S0.N())) {
                Boolean boolN = N(c0273c0S0);
                if (boolN != null && !boolN.booleanValue()) {
                    b().f4670w.c(X.w(str), "App version does not match; dropping. appId");
                    return null;
                }
                String strG = c0273c0S0.G();
                String strN = c0273c0S0.N();
                long jP = c0273c0S0.P();
                C0312p0 c0312p0 = c0323t0.f5078w;
                C0323t0.l(c0312p0);
                c0312p0.o();
                String str2 = c0273c0S0.f4801l;
                C0312p0 c0312p02 = c0323t0.f5078w;
                C0323t0.l(c0312p02);
                c0312p02.o();
                long j = c0273c0S0.f4802m;
                C0312p0 c0312p03 = c0323t0.f5078w;
                C0323t0.l(c0312p03);
                c0312p03.o();
                long j7 = c0273c0S0.f4803n;
                C0312p0 c0312p04 = c0323t0.f5078w;
                C0323t0.l(c0312p04);
                c0312p04.o();
                boolean z5 = c0273c0S0.f4804o;
                String strJ = c0273c0S0.J();
                C0312p0 c0312p05 = c0323t0.f5078w;
                C0323t0.l(c0312p05);
                c0312p05.o();
                boolean z6 = c0273c0S0.f4805p;
                Boolean boolW = c0273c0S0.w();
                long jB = c0273c0S0.b();
                C0312p0 c0312p06 = c0323t0.f5078w;
                C0323t0.l(c0312p06);
                c0312p06.o();
                ArrayList arrayList = c0273c0S0.f4808s;
                String strG2 = a(str).g();
                boolean zY = c0273c0S0.y();
                C0312p0 c0312p07 = c0323t0.f5078w;
                C0323t0.l(c0312p07);
                c0312p07.o();
                long j8 = c0273c0S0.f4811v;
                int i = a(str).f4498b;
                String str3 = n0(str).f5006b;
                C0312p0 c0312p08 = c0323t0.f5078w;
                C0323t0.l(c0312p08);
                c0312p08.o();
                int i7 = c0273c0S0.f4813x;
                C0312p0 c0312p09 = c0323t0.f5078w;
                C0323t0.l(c0312p09);
                c0312p09.o();
                return new a2(str, strG, strN, jP, str2, j, j7, (String) null, z5, false, strJ, 0L, 0, z6, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j8, i, str3, i7, c0273c0S0.f4775B, c0273c0S0.C(), c0273c0S0.s(), 0L, c0273c0S0.t());
            }
        }
        b().f4665D.c(str, "No app data available; dropping");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean P(String str, String str2) {
        C0305n c0305n = this.f4609s;
        S(c0305n);
        C0319s c0319sO = c0305n.O("events", str, str2);
        return c0319sO == null || c0319sO.f5042c < 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(O3.V1 r24, O3.a2 r25) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            java.lang.String r3 = "_id"
            O3.p0 r4 = r1.c()
            r4.o()
            r1.k0()
            boolean r4 = Q(r2)
            java.lang.String r6 = r2.f4729q
            if (r4 != 0) goto L1c
            goto L1fb
        L1c:
            boolean r4 = r2.f4736x
            if (r4 != 0) goto L24
            r1.a0(r2)
            return
        L24:
            O3.Y1 r4 = r1.j0()
            java.lang.String r8 = r0.f4647r
            int r11 = r4.t0(r8)
            r4 = 1
            r5 = 24
            k3.d r9 = r1.f4606Z
            if (r11 == 0) goto L53
            r1.j0()
            r1.d0()
            java.lang.String r13 = O3.Y1.t(r8, r4, r5)
            if (r8 == 0) goto L47
            int r12 = r8.length()
            r14 = r12
            goto L48
        L47:
            r14 = 0
        L48:
            r1.j0()
            java.lang.String r10 = r2.f4729q
            java.lang.String r12 = "_ev"
            O3.Y1.E(r9, r10, r11, r12, r13, r14)
            return
        L53:
            O3.Y1 r7 = r1.j0()
            java.lang.Object r10 = r0.W()
            int r14 = r7.B(r10, r8)
            if (r14 == 0) goto L93
            r1.j0()
            r1.d0()
            java.lang.String r16 = O3.Y1.t(r8, r4, r5)
            java.lang.Object r0 = r0.W()
            if (r0 == 0) goto L7a
            boolean r3 = r0 instanceof java.lang.String
            if (r3 != 0) goto L7d
            boolean r3 = r0 instanceof java.lang.CharSequence
            if (r3 == 0) goto L7a
            goto L7d
        L7a:
            r17 = 0
            goto L87
        L7d:
            java.lang.String r0 = r0.toString()
            int r12 = r0.length()
            r17 = r12
        L87:
            r1.j0()
            java.lang.String r13 = r2.f4729q
            java.lang.String r15 = "_ev"
            r12 = r9
            O3.Y1.E(r12, r13, r14, r15, r16, r17)
            return
        L93:
            r4 = r9
            O3.Y1 r5 = r1.j0()
            java.lang.Object r7 = r0.W()
            java.lang.Object r11 = r5.C(r7, r8)
            if (r11 == 0) goto L1fb
            java.lang.String r13 = "_sid"
            boolean r5 = r13.equals(r8)
            if (r5 == 0) goto L11c
            long r9 = r0.f4648s
            java.lang.String r5 = r0.f4651v
            x3.AbstractC1887A.g(r6)
            O3.n r7 = r1.f4609s
            S(r7)
            java.lang.String r14 = "_sno"
            O3.W1 r7 = r7.k0(r6, r14)
            if (r7 == 0) goto Lcd
            java.lang.Object r14 = r7.f4661e
            boolean r15 = r14 instanceof java.lang.Long
            if (r15 == 0) goto Lcd
            java.lang.Long r14 = (java.lang.Long) r14
            long r14 = r14.longValue()
            r22 = r13
            goto L104
        Lcd:
            if (r7 == 0) goto Ldc
            O3.X r14 = r1.b()
            O3.V r14 = r14.f4673z
            java.lang.String r15 = "Retrieved last session number from database does not contain a valid (long) value"
            java.lang.Object r7 = r7.f4661e
            r14.c(r7, r15)
        Ldc:
            O3.n r7 = r1.f4609s
            S(r7)
            java.lang.String r14 = "_s"
            java.lang.String r15 = "events"
            O3.s r7 = r7.O(r15, r6, r14)
            if (r7 == 0) goto L100
            O3.X r14 = r1.b()
            O3.V r14 = r14.f4666E
            r22 = r13
            long r12 = r7.f5042c
            java.lang.String r7 = "Backfill the session number. Last used session number"
            java.lang.Long r15 = java.lang.Long.valueOf(r12)
            r14.c(r15, r7)
            r14 = r12
            goto L104
        L100:
            r22 = r13
            r14 = 0
        L104:
            O3.V1 r16 = new O3.V1
            r12 = 1
            long r14 = r14 + r12
            java.lang.Long r19 = java.lang.Long.valueOf(r14)
            java.lang.String r20 = "_sno"
            r21 = r5
            r17 = r9
            r16.<init>(r17, r19, r20, r21)
            r5 = r16
            r1.U(r5, r2)
            goto L11e
        L11c:
            r22 = r13
        L11e:
            O3.W1 r5 = new O3.W1
            x3.AbstractC1887A.g(r6)
            java.lang.String r7 = r0.f4651v
            x3.AbstractC1887A.g(r7)
            long r9 = r0.f4648s
            r5.<init>(r6, r7, r8, r9, r11)
            O3.X r0 = r1.b()
            O3.V r0 = r0.f4666E
            O3.t0 r7 = r1.f4582B
            O3.Q r9 = r7.f5081z
            java.lang.String r10 = r5.f4659c
            java.lang.String r9 = r9.c(r10)
            java.lang.String r12 = "Setting user property"
            r0.d(r9, r11, r12)
            O3.n r0 = r1.f4609s
            S(r0)
            r0.c0()
            boolean r0 = r3.equals(r10)     // Catch: java.lang.Throwable -> L170
            java.lang.Object r9 = r5.f4661e
            if (r0 == 0) goto L173
            O3.n r0 = r1.f4609s     // Catch: java.lang.Throwable -> L170
            S(r0)     // Catch: java.lang.Throwable -> L170
            O3.W1 r0 = r0.k0(r6, r3)     // Catch: java.lang.Throwable -> L170
            if (r0 == 0) goto L173
            java.lang.Object r0 = r0.f4661e     // Catch: java.lang.Throwable -> L170
            boolean r0 = r9.equals(r0)     // Catch: java.lang.Throwable -> L170
            if (r0 != 0) goto L173
            O3.n r0 = r1.f4609s     // Catch: java.lang.Throwable -> L170
            S(r0)     // Catch: java.lang.Throwable -> L170
            java.lang.String r3 = "_lair"
            r0.i0(r6, r3)     // Catch: java.lang.Throwable -> L170
            goto L173
        L170:
            r0 = move-exception
            goto L1f2
        L173:
            r1.a0(r2)     // Catch: java.lang.Throwable -> L170
            O3.n r0 = r1.f4609s     // Catch: java.lang.Throwable -> L170
            S(r0)     // Catch: java.lang.Throwable -> L170
            boolean r0 = r0.j0(r5)     // Catch: java.lang.Throwable -> L170
            r3 = r22
            boolean r3 = r3.equals(r8)     // Catch: java.lang.Throwable -> L170
            if (r3 == 0) goto L1c2
            O3.b0 r3 = r1.f4613w     // Catch: java.lang.Throwable -> L170
            S(r3)     // Catch: java.lang.Throwable -> L170
            java.lang.String r2 = r2.f4718K     // Catch: java.lang.Throwable -> L170
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L170
            if (r5 == 0) goto L197
            r14 = 0
            goto L1a5
        L197:
            java.lang.String r5 = "UTF-8"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch: java.lang.Throwable -> L170
            byte[] r2 = r2.getBytes(r5)     // Catch: java.lang.Throwable -> L170
            long r14 = r3.Z(r2)     // Catch: java.lang.Throwable -> L170
        L1a5:
            O3.n r2 = r1.f4609s     // Catch: java.lang.Throwable -> L170
            S(r2)     // Catch: java.lang.Throwable -> L170
            O3.c0 r2 = r2.s0(r6)     // Catch: java.lang.Throwable -> L170
            if (r2 == 0) goto L1c2
            r2.A(r14)     // Catch: java.lang.Throwable -> L170
            boolean r3 = r2.o()     // Catch: java.lang.Throwable -> L170
            if (r3 == 0) goto L1c2
            O3.n r3 = r1.f4609s     // Catch: java.lang.Throwable -> L170
            S(r3)     // Catch: java.lang.Throwable -> L170
            r15 = 0
            r3.t0(r2, r15)     // Catch: java.lang.Throwable -> L170
        L1c2:
            O3.n r2 = r1.f4609s     // Catch: java.lang.Throwable -> L170
            S(r2)     // Catch: java.lang.Throwable -> L170
            r2.d0()     // Catch: java.lang.Throwable -> L170
            if (r0 != 0) goto L1e9
            O3.X r0 = r1.b()     // Catch: java.lang.Throwable -> L170
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> L170
            java.lang.String r2 = "Too many unique user properties are set. Ignoring user property"
            O3.Q r3 = r7.f5081z     // Catch: java.lang.Throwable -> L170
            java.lang.String r3 = r3.c(r10)     // Catch: java.lang.Throwable -> L170
            r0.d(r3, r9, r2)     // Catch: java.lang.Throwable -> L170
            r1.j0()     // Catch: java.lang.Throwable -> L170
            r9 = 0
            r10 = 0
            r7 = 9
            r8 = 0
            r5 = r4
            O3.Y1.E(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L170
        L1e9:
            O3.n r0 = r1.f4609s
            S(r0)
            r0.e0()
            return
        L1f2:
            O3.n r2 = r1.f4609s
            S(r2)
            r2.e0()
            throw r0
        L1fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T1.U(O3.V1, O3.a2):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V(String str, a2 a2Var) {
        c().o();
        k0();
        boolean zQ = Q(a2Var);
        String str2 = a2Var.f4729q;
        if (zQ) {
            if (!a2Var.f4736x) {
                a0(a2Var);
                return;
            }
            Boolean boolT = T(a2Var);
            if ("_npa".equals(str) && boolT != null) {
                b().f4665D.b("Falling back to manifest metadata value for ad personalization");
                e().getClass();
                U(new V1(System.currentTimeMillis(), Long.valueOf(true != boolT.booleanValue() ? 0L : 1L), "_npa", "auto"), a2Var);
                return;
            }
            V v6 = b().f4665D;
            C0323t0 c0323t0 = this.f4582B;
            v6.c(c0323t0.f5081z.c(str), "Removing user property");
            C0305n c0305n = this.f4609s;
            S(c0305n);
            c0305n.c0();
            try {
                a0(a2Var);
                if ("_id".equals(str)) {
                    C0305n c0305n2 = this.f4609s;
                    S(c0305n2);
                    AbstractC1887A.g(str2);
                    c0305n2.i0(str2, "_lair");
                }
                C0305n c0305n3 = this.f4609s;
                S(c0305n3);
                AbstractC1887A.g(str2);
                c0305n3.i0(str2, str);
                C0305n c0305n4 = this.f4609s;
                S(c0305n4);
                c0305n4.d0();
                b().f4665D.c(c0323t0.f5081z.c(str), "User property removed");
                C0305n c0305n5 = this.f4609s;
                S(c0305n5);
                c0305n5.e0();
            } catch (Throwable th) {
                C0305n c0305n6 = this.f4609s;
                S(c0305n6);
                c0305n6.e0();
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0404 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0150, B:62:0x0174, B:65:0x017f, B:67:0x0195, B:105:0x026e, B:107:0x029a, B:108:0x029d, B:110:0x02bc, B:152:0x039a, B:153:0x039d, B:161:0x0427, B:113:0x02d2, B:118:0x02f1, B:120:0x02f9, B:122:0x0301, B:126:0x0314, B:131:0x0333, B:135:0x033f, B:138:0x0356, B:143:0x037b, B:145:0x0383, B:147:0x038b, B:149:0x0391, B:141:0x0369, B:129:0x0325, B:116:0x02df, B:69:0x01a4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e0, B:76:0x01e6, B:78:0x01f0, B:80:0x01f6, B:82:0x01fc, B:84:0x0202, B:85:0x0207, B:87:0x0219, B:89:0x021f, B:95:0x022f, B:101:0x0239, B:102:0x024a, B:103:0x0256, B:104:0x0262, B:154:0x03b6, B:156:0x03e9, B:157:0x03ec, B:158:0x0404, B:160:0x040b, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0150, B:62:0x0174, B:65:0x017f, B:67:0x0195, B:105:0x026e, B:107:0x029a, B:108:0x029d, B:110:0x02bc, B:152:0x039a, B:153:0x039d, B:161:0x0427, B:113:0x02d2, B:118:0x02f1, B:120:0x02f9, B:122:0x0301, B:126:0x0314, B:131:0x0333, B:135:0x033f, B:138:0x0356, B:143:0x037b, B:145:0x0383, B:147:0x038b, B:149:0x0391, B:141:0x0369, B:129:0x0325, B:116:0x02df, B:69:0x01a4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e0, B:76:0x01e6, B:78:0x01f0, B:80:0x01f6, B:82:0x01fc, B:84:0x0202, B:85:0x0207, B:87:0x0219, B:89:0x021f, B:95:0x022f, B:101:0x0239, B:102:0x024a, B:103:0x0256, B:104:0x0262, B:154:0x03b6, B:156:0x03e9, B:157:0x03ec, B:158:0x0404, B:160:0x040b, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0150, B:62:0x0174, B:65:0x017f, B:67:0x0195, B:105:0x026e, B:107:0x029a, B:108:0x029d, B:110:0x02bc, B:152:0x039a, B:153:0x039d, B:161:0x0427, B:113:0x02d2, B:118:0x02f1, B:120:0x02f9, B:122:0x0301, B:126:0x0314, B:131:0x0333, B:135:0x033f, B:138:0x0356, B:143:0x037b, B:145:0x0383, B:147:0x038b, B:149:0x0391, B:141:0x0369, B:129:0x0325, B:116:0x02df, B:69:0x01a4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e0, B:76:0x01e6, B:78:0x01f0, B:80:0x01f6, B:82:0x01fc, B:84:0x0202, B:85:0x0207, B:87:0x0219, B:89:0x021f, B:95:0x022f, B:101:0x0239, B:102:0x024a, B:103:0x0256, B:104:0x0262, B:154:0x03b6, B:156:0x03e9, B:157:0x03ec, B:158:0x0404, B:160:0x040b, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120 A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0150, B:62:0x0174, B:65:0x017f, B:67:0x0195, B:105:0x026e, B:107:0x029a, B:108:0x029d, B:110:0x02bc, B:152:0x039a, B:153:0x039d, B:161:0x0427, B:113:0x02d2, B:118:0x02f1, B:120:0x02f9, B:122:0x0301, B:126:0x0314, B:131:0x0333, B:135:0x033f, B:138:0x0356, B:143:0x037b, B:145:0x0383, B:147:0x038b, B:149:0x0391, B:141:0x0369, B:129:0x0325, B:116:0x02df, B:69:0x01a4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e0, B:76:0x01e6, B:78:0x01f0, B:80:0x01f6, B:82:0x01fc, B:84:0x0202, B:85:0x0207, B:87:0x0219, B:89:0x021f, B:95:0x022f, B:101:0x0239, B:102:0x024a, B:103:0x0256, B:104:0x0262, B:154:0x03b6, B:156:0x03e9, B:157:0x03ec, B:158:0x0404, B:160:0x040b, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0150, B:62:0x0174, B:65:0x017f, B:67:0x0195, B:105:0x026e, B:107:0x029a, B:108:0x029d, B:110:0x02bc, B:152:0x039a, B:153:0x039d, B:161:0x0427, B:113:0x02d2, B:118:0x02f1, B:120:0x02f9, B:122:0x0301, B:126:0x0314, B:131:0x0333, B:135:0x033f, B:138:0x0356, B:143:0x037b, B:145:0x0383, B:147:0x038b, B:149:0x0391, B:141:0x0369, B:129:0x0325, B:116:0x02df, B:69:0x01a4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e0, B:76:0x01e6, B:78:0x01f0, B:80:0x01f6, B:82:0x01fc, B:84:0x0202, B:85:0x0207, B:87:0x0219, B:89:0x021f, B:95:0x022f, B:101:0x0239, B:102:0x024a, B:103:0x0256, B:104:0x0262, B:154:0x03b6, B:156:0x03e9, B:157:0x03ec, B:158:0x0404, B:160:0x040b, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0150, B:62:0x0174, B:65:0x017f, B:67:0x0195, B:105:0x026e, B:107:0x029a, B:108:0x029d, B:110:0x02bc, B:152:0x039a, B:153:0x039d, B:161:0x0427, B:113:0x02d2, B:118:0x02f1, B:120:0x02f9, B:122:0x0301, B:126:0x0314, B:131:0x0333, B:135:0x033f, B:138:0x0356, B:143:0x037b, B:145:0x0383, B:147:0x038b, B:149:0x0391, B:141:0x0369, B:129:0x0325, B:116:0x02df, B:69:0x01a4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e0, B:76:0x01e6, B:78:0x01f0, B:80:0x01f6, B:82:0x01fc, B:84:0x0202, B:85:0x0207, B:87:0x0219, B:89:0x021f, B:95:0x022f, B:101:0x0239, B:102:0x024a, B:103:0x0256, B:104:0x0262, B:154:0x03b6, B:156:0x03e9, B:157:0x03ec, B:158:0x0404, B:160:0x040b, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #0, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(O3.a2 r34) {
        /*
            r33 = this;
            r1 = r33
            r2 = r34
            O3.t0 r3 = r1.f4582B
            java.lang.String r4 = "_sysu"
            java.lang.String r5 = "_sys"
            java.lang.String r6 = "_pfo"
            java.lang.String r0 = "com.android.vending"
            java.lang.String r7 = "_npa"
            java.lang.String r8 = "_uwa"
            O3.p0 r9 = r1.c()
            r9.o()
            r1.k0()
            x3.AbstractC1887A.g(r2)
            boolean r9 = r2.f4712E
            java.lang.String r10 = r2.f4729q
            x3.AbstractC1887A.d(r10)
            boolean r11 = Q(r2)
            if (r11 != 0) goto L2d
            return
        L2d:
            O3.n r11 = r1.f4609s
            S(r11)
            O3.c0 r11 = r11.s0(r10)
            r12 = 0
            r13 = 0
            if (r11 == 0) goto L65
            java.lang.String r15 = r11.G()
            boolean r15 = android.text.TextUtils.isEmpty(r15)
            if (r15 == 0) goto L65
            java.lang.String r15 = r2.f4730r
            boolean r15 = android.text.TextUtils.isEmpty(r15)
            if (r15 != 0) goto L65
            r11.f(r13)
            O3.n r15 = r1.f4609s
            S(r15)
            r15.t0(r11, r12)
            O3.l0 r11 = r1.f4607q
            S(r11)
            r11.o()
            r.e r11 = r11.f4954y
            r11.remove(r10)
        L65:
            boolean r11 = r2.f4736x
            if (r11 != 0) goto L6d
            r33.a0(r34)
            return
        L6d:
            r15 = r13
            long r13 = r2.f4709B
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 != 0) goto L7f
            B3.a r11 = r1.e()
            r11.getClass()
            long r13 = java.lang.System.currentTimeMillis()
        L7f:
            r18 = r13
            int r11 = r2.f4710C
            r13 = 1
            if (r11 == 0) goto L9c
            if (r11 == r13) goto L9c
            O3.X r14 = r1.b()
            O3.V r14 = r14.f4673z
            O3.W r15 = O3.X.w(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = "Incorrect app type, assuming installed app. appId, appType"
            r14.d(r15, r11, r12)
            r11 = 0
        L9c:
            O3.n r12 = r1.f4609s
            S(r12)
            r12.c0()
            O3.n r12 = r1.f4609s     // Catch: java.lang.Throwable -> Lc4
            S(r12)     // Catch: java.lang.Throwable -> Lc4
            O3.W1 r12 = r12.k0(r10, r7)     // Catch: java.lang.Throwable -> Lc4
            java.lang.Boolean r14 = T(r2)     // Catch: java.lang.Throwable -> Lc4
            r15 = r14
            if (r12 == 0) goto Lc7
            r29 = 1
            java.lang.String r13 = "auto"
            java.lang.String r14 = r12.f4658b     // Catch: java.lang.Throwable -> Lc4
            boolean r13 = r13.equals(r14)     // Catch: java.lang.Throwable -> Lc4
            if (r13 == 0) goto Lc1
            goto Lc9
        Lc1:
            r14 = r18
            goto Lff
        Lc4:
            r0 = move-exception
            goto L438
        Lc7:
            r29 = 1
        Lc9:
            if (r15 == 0) goto Lf8
            O3.V1 r17 = new O3.V1     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r21 = "_npa"
            boolean r7 = r15.booleanValue()     // Catch: java.lang.Throwable -> Lc4
            r13 = 1
            if (r13 == r7) goto Ld9
            r15 = 0
            goto Ldb
        Ld9:
            r15 = r29
        Ldb:
            java.lang.Long r20 = java.lang.Long.valueOf(r15)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r22 = "auto"
            r17.<init>(r18, r20, r21, r22)     // Catch: java.lang.Throwable -> Lc4
            r7 = r17
            r14 = r18
            if (r12 == 0) goto Lf4
            java.lang.Object r12 = r12.f4661e     // Catch: java.lang.Throwable -> Lc4
            java.lang.Long r13 = r7.f4649t     // Catch: java.lang.Throwable -> Lc4
            boolean r12 = r12.equals(r13)     // Catch: java.lang.Throwable -> Lc4
            if (r12 != 0) goto Lff
        Lf4:
            r1.U(r7, r2)     // Catch: java.lang.Throwable -> Lc4
            goto Lff
        Lf8:
            r14 = r18
            if (r12 == 0) goto Lff
            r1.V(r7, r2)     // Catch: java.lang.Throwable -> Lc4
        Lff:
            O3.g r7 = r1.d0()     // Catch: java.lang.Throwable -> Lc4
            O3.E r12 = O3.F.f4420c1     // Catch: java.lang.Throwable -> Lc4
            r13 = 0
            boolean r7 = r7.y(r13, r12)     // Catch: java.lang.Throwable -> Lc4
            if (r7 == 0) goto L116
            r18 = r14
            long r13 = r2.f4727T     // Catch: java.lang.Throwable -> Lc4
            r1.Z(r2, r13)     // Catch: java.lang.Throwable -> Lc4
            r14 = r18
            goto L119
        L116:
            r1.Z(r2, r14)     // Catch: java.lang.Throwable -> Lc4
        L119:
            r33.a0(r34)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r12 = "events"
            if (r11 != 0) goto L12d
            O3.n r11 = r1.f4609s     // Catch: java.lang.Throwable -> Lc4
            S(r11)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r13 = "_f"
            O3.s r11 = r11.O(r12, r10, r13)     // Catch: java.lang.Throwable -> Lc4
            r12 = 0
            goto L139
        L12d:
            O3.n r11 = r1.f4609s     // Catch: java.lang.Throwable -> Lc4
            S(r11)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r13 = "_v"
            O3.s r11 = r11.O(r12, r10, r13)     // Catch: java.lang.Throwable -> Lc4
            r12 = 1
        L139:
            if (r11 != 0) goto L404
            r16 = 3600000(0x36ee80, double:1.7786363E-317)
            long r18 = r14 / r16
            long r18 = r18 + r29
            long r18 = r18 * r16
            java.lang.String r11 = "_dac"
            java.lang.String r13 = "_et"
            java.lang.String r7 = "_r"
            r31 = r9
            java.lang.String r9 = "_c"
            if (r12 != 0) goto L3b6
            O3.V1 r17 = new O3.V1     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r21 = "_fot"
            java.lang.Long r20 = java.lang.Long.valueOf(r18)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r22 = "auto"
            r18 = r14
            r17.<init>(r18, r20, r21, r22)     // Catch: java.lang.Throwable -> Lc4
            r12 = r17
            r1.U(r12, r2)     // Catch: java.lang.Throwable -> Lc4
            O3.p0 r12 = r1.c()     // Catch: java.lang.Throwable -> Lc4
            r12.o()     // Catch: java.lang.Throwable -> Lc4
            O3.j0 r12 = r1.f4581A     // Catch: java.lang.Throwable -> Lc4
            x3.AbstractC1887A.g(r12)     // Catch: java.lang.Throwable -> Lc4
            O3.t0 r14 = r12.f4924b
            if (r10 == 0) goto L17a
            boolean r15 = r10.isEmpty()     // Catch: java.lang.Throwable -> Lc4
            if (r15 == 0) goto L17f
        L17a:
            r32 = r3
            r2 = 1
            goto L262
        L17f:
            O3.p0 r15 = r14.f5078w     // Catch: java.lang.Throwable -> Lc4
            r16 = r15
            android.content.Context r15 = r14.f5072q     // Catch: java.lang.Throwable -> Lc4
            r21 = r15
            O3.X r15 = r14.f5077v     // Catch: java.lang.Throwable -> Lc4
            O3.C0323t0.l(r16)     // Catch: java.lang.Throwable -> Lc4
            r16.o()     // Catch: java.lang.Throwable -> Lc4
            boolean r16 = r12.a()     // Catch: java.lang.Throwable -> Lc4
            if (r16 != 0) goto L1a4
            O3.C0323t0.l(r15)     // Catch: java.lang.Throwable -> Lc4
            O3.V r0 = r15.f4664C     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r12 = "Install Referrer Reporter is not available"
            r0.b(r12)     // Catch: java.lang.Throwable -> Lc4
            r32 = r3
        L1a1:
            r2 = 1
            goto L26e
        L1a4:
            O3.i0 r2 = new O3.i0     // Catch: java.lang.Throwable -> Lc4
            r2.<init>(r12, r10)     // Catch: java.lang.Throwable -> Lc4
            r24 = r2
            O3.p0 r2 = r14.f5078w     // Catch: java.lang.Throwable -> Lc4
            O3.C0323t0.l(r2)     // Catch: java.lang.Throwable -> Lc4
            r2.o()     // Catch: java.lang.Throwable -> Lc4
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> Lc4
            r16 = r12
            java.lang.String r12 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r2.<init>(r12)     // Catch: java.lang.Throwable -> Lc4
            android.content.ComponentName r12 = new android.content.ComponentName     // Catch: java.lang.Throwable -> Lc4
            r32 = r3
            java.lang.String r3 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r12.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lc4
            r2.setComponent(r12)     // Catch: java.lang.Throwable -> Lc4
            android.content.pm.PackageManager r3 = r21.getPackageManager()     // Catch: java.lang.Throwable -> Lc4
            if (r3 != 0) goto L1d9
            O3.C0323t0.l(r15)     // Catch: java.lang.Throwable -> Lc4
            O3.V r0 = r15.f4662A     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.b(r2)     // Catch: java.lang.Throwable -> Lc4
            goto L1a1
        L1d9:
            r12 = 0
            java.util.List r3 = r3.queryIntentServices(r2, r12)     // Catch: java.lang.Throwable -> Lc4
            if (r3 == 0) goto L256
            boolean r17 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lc4
            if (r17 != 0) goto L256
            java.lang.Object r3 = r3.get(r12)     // Catch: java.lang.Throwable -> Lc4
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3     // Catch: java.lang.Throwable -> Lc4
            android.content.pm.ServiceInfo r3 = r3.serviceInfo     // Catch: java.lang.Throwable -> Lc4
            if (r3 == 0) goto L1a1
            java.lang.String r12 = r3.packageName     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = r3.name     // Catch: java.lang.Throwable -> Lc4
            if (r3 == 0) goto L24a
            boolean r0 = r0.equals(r12)     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto L24a
            boolean r0 = r16.a()     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto L24a
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> Lc4
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lc4
            A3.b r20 = A3.b.a()     // Catch: java.lang.Throwable -> Lc4 java.lang.RuntimeException -> L237
            java.lang.Class r2 = r21.getClass()     // Catch: java.lang.Throwable -> Lc4 java.lang.RuntimeException -> L237
            java.lang.String r22 = r2.getName()     // Catch: java.lang.Throwable -> Lc4 java.lang.RuntimeException -> L237
            r26 = 0
            r23 = r0
            r25 = 1
            boolean r0 = r20.c(r21, r22, r23, r24, r25, r26)     // Catch: java.lang.Throwable -> Lc4 java.lang.RuntimeException -> L233
            r2 = r25
            O3.C0323t0.l(r15)     // Catch: java.lang.Throwable -> Lc4 java.lang.RuntimeException -> L22b
            O3.V r3 = r15.f4666E     // Catch: java.lang.Throwable -> Lc4 java.lang.RuntimeException -> L22b
            java.lang.String r12 = "Install Referrer Service is"
            if (r0 == 0) goto L22d
            java.lang.String r0 = "available"
            goto L22f
        L22b:
            r0 = move-exception
            goto L239
        L22d:
            java.lang.String r0 = "not available"
        L22f:
            r3.c(r0, r12)     // Catch: java.lang.Throwable -> Lc4 java.lang.RuntimeException -> L22b
            goto L26e
        L233:
            r0 = move-exception
            r2 = r25
            goto L239
        L237:
            r0 = move-exception
            r2 = 1
        L239:
            O3.X r3 = r14.f5077v     // Catch: java.lang.Throwable -> Lc4
            O3.C0323t0.l(r3)     // Catch: java.lang.Throwable -> Lc4
            O3.V r3 = r3.f4670w     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r12 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lc4
            r3.c(r0, r12)     // Catch: java.lang.Throwable -> Lc4
            goto L26e
        L24a:
            r2 = 1
            O3.C0323t0.l(r15)     // Catch: java.lang.Throwable -> Lc4
            O3.V r0 = r15.f4673z     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.b(r3)     // Catch: java.lang.Throwable -> Lc4
            goto L26e
        L256:
            r2 = 1
            O3.C0323t0.l(r15)     // Catch: java.lang.Throwable -> Lc4
            O3.V r0 = r15.f4664C     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.b(r3)     // Catch: java.lang.Throwable -> Lc4
            goto L26e
        L262:
            O3.X r0 = r14.f5077v     // Catch: java.lang.Throwable -> Lc4
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> Lc4
            O3.V r0 = r0.f4662A     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = "Install Referrer Reporter was called with invalid app package name"
            r0.b(r3)     // Catch: java.lang.Throwable -> Lc4
        L26e:
            O3.p0 r0 = r1.c()     // Catch: java.lang.Throwable -> Lc4
            r0.o()     // Catch: java.lang.Throwable -> Lc4
            r1.k0()     // Catch: java.lang.Throwable -> Lc4
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lc4
            r3.<init>()     // Catch: java.lang.Throwable -> Lc4
            r14 = r29
            r3.putLong(r9, r14)     // Catch: java.lang.Throwable -> Lc4
            r3.putLong(r7, r14)     // Catch: java.lang.Throwable -> Lc4
            r14 = 0
            r3.putLong(r8, r14)     // Catch: java.lang.Throwable -> Lc4
            r3.putLong(r6, r14)     // Catch: java.lang.Throwable -> Lc4
            r3.putLong(r5, r14)     // Catch: java.lang.Throwable -> Lc4
            r3.putLong(r4, r14)     // Catch: java.lang.Throwable -> Lc4
            r14 = 1
            r3.putLong(r13, r14)     // Catch: java.lang.Throwable -> Lc4
            if (r31 == 0) goto L29d
            r3.putLong(r11, r14)     // Catch: java.lang.Throwable -> Lc4
        L29d:
            x3.AbstractC1887A.g(r10)     // Catch: java.lang.Throwable -> Lc4
            O3.n r0 = r1.f4609s     // Catch: java.lang.Throwable -> Lc4
            S(r0)     // Catch: java.lang.Throwable -> Lc4
            x3.AbstractC1887A.d(r10)     // Catch: java.lang.Throwable -> Lc4
            r0.o()     // Catch: java.lang.Throwable -> Lc4
            r0.p()     // Catch: java.lang.Throwable -> Lc4
            long r11 = r0.C(r10)     // Catch: java.lang.Throwable -> Lc4
            r7 = r32
            android.content.Context r0 = r7.f5072q     // Catch: java.lang.Throwable -> Lc4
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> Lc4
            if (r0 != 0) goto L2d2
            O3.X r0 = r1.b()     // Catch: java.lang.Throwable -> Lc4
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = "PackageManager is null, first open report might be inaccurate. appId"
            O3.W r4 = O3.X.w(r10)     // Catch: java.lang.Throwable -> Lc4
            r0.c(r4, r2)     // Catch: java.lang.Throwable -> Lc4
            r8 = r34
            r2 = r3
        L2ce:
            r15 = 0
            goto L396
        L2d2:
            android.content.Context r0 = r7.f5072q     // Catch: java.lang.Throwable -> Lc4 android.content.pm.PackageManager.NameNotFoundException -> L2de
            C3.b r0 = C3.c.a(r0)     // Catch: java.lang.Throwable -> Lc4 android.content.pm.PackageManager.NameNotFoundException -> L2de
            r9 = 0
            android.content.pm.PackageInfo r0 = r0.a(r9, r10)     // Catch: java.lang.Throwable -> Lc4 android.content.pm.PackageManager.NameNotFoundException -> L2de
            goto L2ef
        L2de:
            r0 = move-exception
            O3.X r9 = r1.b()     // Catch: java.lang.Throwable -> Lc4
            O3.V r9 = r9.f4670w     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            O3.W r14 = O3.X.w(r10)     // Catch: java.lang.Throwable -> Lc4
            r9.d(r14, r0, r13)     // Catch: java.lang.Throwable -> Lc4
            r0 = 0
        L2ef:
            if (r0 == 0) goto L352
            long r13 = r0.firstInstallTime     // Catch: java.lang.Throwable -> Lc4
            r15 = 0
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 == 0) goto L352
            r23 = r3
            long r2 = r0.lastUpdateTime     // Catch: java.lang.Throwable -> Lc4
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto L32d
            O3.g r0 = r1.d0()     // Catch: java.lang.Throwable -> Lc4
            O3.E r2 = O3.F.f4378I0     // Catch: java.lang.Throwable -> Lc4
            r3 = 0
            boolean r0 = r0.y(r3, r2)     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto L325
            r15 = 0
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 != 0) goto L31f
            r2 = r23
            r13 = 1
            r2.putLong(r8, r13)     // Catch: java.lang.Throwable -> Lc4
            r13 = 0
            r27 = 0
            goto L333
        L31f:
            r2 = r23
        L321:
            r27 = r11
            r13 = 0
            goto L333
        L325:
            r2 = r23
            r13 = 1
            r2.putLong(r8, r13)     // Catch: java.lang.Throwable -> Lc4
            goto L321
        L32d:
            r2 = r23
            r3 = 0
            r27 = r11
            r13 = 1
        L333:
            O3.V1 r17 = new O3.V1     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r21 = "_fi"
            r8 = 1
            if (r8 == r13) goto L33d
            r8 = 0
            goto L33f
        L33d:
            r8 = 1
        L33f:
            java.lang.Long r20 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r22 = "auto"
            r17.<init>(r18, r20, r21, r22)     // Catch: java.lang.Throwable -> Lc4
            r0 = r17
            r8 = r34
            r1.U(r0, r8)     // Catch: java.lang.Throwable -> Lc4
            r11 = r27
            goto L356
        L352:
            r8 = r34
            r2 = r3
            r3 = 0
        L356:
            android.content.Context r0 = r7.f5072q     // Catch: java.lang.Throwable -> Lc4 android.content.pm.PackageManager.NameNotFoundException -> L368
            C3.b r0 = C3.c.a(r0)     // Catch: java.lang.Throwable -> Lc4 android.content.pm.PackageManager.NameNotFoundException -> L368
            android.content.Context r0 = r0.f1185a     // Catch: java.lang.Throwable -> Lc4 android.content.pm.PackageManager.NameNotFoundException -> L368
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> Lc4 android.content.pm.PackageManager.NameNotFoundException -> L368
            r9 = 0
            android.content.pm.ApplicationInfo r13 = r0.getApplicationInfo(r10, r9)     // Catch: java.lang.Throwable -> Lc4 android.content.pm.PackageManager.NameNotFoundException -> L368
            goto L379
        L368:
            r0 = move-exception
            O3.X r7 = r1.b()     // Catch: java.lang.Throwable -> Lc4
            O3.V r7 = r7.f4670w     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r9 = "Application info is null, first open report might be inaccurate. appId"
            O3.W r10 = O3.X.w(r10)     // Catch: java.lang.Throwable -> Lc4
            r7.d(r10, r0, r9)     // Catch: java.lang.Throwable -> Lc4
            r13 = r3
        L379:
            if (r13 == 0) goto L2ce
            int r0 = r13.flags     // Catch: java.lang.Throwable -> Lc4
            r25 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L389
            r9 = 1
            r2.putLong(r5, r9)     // Catch: java.lang.Throwable -> Lc4
            goto L38b
        L389:
            r9 = 1
        L38b:
            int r0 = r13.flags     // Catch: java.lang.Throwable -> Lc4
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L2ce
            r2.putLong(r4, r9)     // Catch: java.lang.Throwable -> Lc4
            goto L2ce
        L396:
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 < 0) goto L39d
            r2.putLong(r6, r11)     // Catch: java.lang.Throwable -> Lc4
        L39d:
            O3.v r17 = new O3.v     // Catch: java.lang.Throwable -> Lc4
            r21 = r18
            java.lang.String r18 = "_f"
            O3.u r0 = new O3.u     // Catch: java.lang.Throwable -> Lc4
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r20 = "auto"
            r19 = r0
            r17.<init>(r18, r19, r20, r21)     // Catch: java.lang.Throwable -> Lc4
            r0 = r17
            r1.i(r0, r8)     // Catch: java.lang.Throwable -> Lc4
            goto L427
        L3b6:
            r8 = r2
            r21 = r14
            O3.V1 r17 = new O3.V1     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r21 = "_fvt"
            java.lang.Long r20 = java.lang.Long.valueOf(r18)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r22 = "auto"
            r18 = r14
            r17.<init>(r18, r20, r21, r22)     // Catch: java.lang.Throwable -> Lc4
            r0 = r17
            r1.U(r0, r8)     // Catch: java.lang.Throwable -> Lc4
            O3.p0 r0 = r1.c()     // Catch: java.lang.Throwable -> Lc4
            r0.o()     // Catch: java.lang.Throwable -> Lc4
            r1.k0()     // Catch: java.lang.Throwable -> Lc4
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lc4
            r0.<init>()     // Catch: java.lang.Throwable -> Lc4
            r14 = 1
            r0.putLong(r9, r14)     // Catch: java.lang.Throwable -> Lc4
            r0.putLong(r7, r14)     // Catch: java.lang.Throwable -> Lc4
            r0.putLong(r13, r14)     // Catch: java.lang.Throwable -> Lc4
            if (r31 == 0) goto L3ec
            r0.putLong(r11, r14)     // Catch: java.lang.Throwable -> Lc4
        L3ec:
            O3.v r17 = new O3.v     // Catch: java.lang.Throwable -> Lc4
            r21 = r18
            java.lang.String r18 = "_v"
            O3.u r2 = new O3.u     // Catch: java.lang.Throwable -> Lc4
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r20 = "auto"
            r19 = r2
            r17.<init>(r18, r19, r20, r21)     // Catch: java.lang.Throwable -> Lc4
            r0 = r17
            r1.i(r0, r8)     // Catch: java.lang.Throwable -> Lc4
            goto L427
        L404:
            r8 = r2
            r18 = r14
            boolean r0 = r8.f4737y     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto L427
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lc4
            r0.<init>()     // Catch: java.lang.Throwable -> Lc4
            O3.v r17 = new O3.v     // Catch: java.lang.Throwable -> Lc4
            r21 = r18
            java.lang.String r18 = "_cd"
            O3.u r2 = new O3.u     // Catch: java.lang.Throwable -> Lc4
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r20 = "auto"
            r19 = r2
            r17.<init>(r18, r19, r20, r21)     // Catch: java.lang.Throwable -> Lc4
            r0 = r17
            r1.i(r0, r8)     // Catch: java.lang.Throwable -> Lc4
        L427:
            O3.n r0 = r1.f4609s     // Catch: java.lang.Throwable -> Lc4
            S(r0)     // Catch: java.lang.Throwable -> Lc4
            r0.d0()     // Catch: java.lang.Throwable -> Lc4
            O3.n r0 = r1.f4609s
            S(r0)
            r0.e0()
            return
        L438:
            O3.n r2 = r1.f4609s
            S(r2)
            r2.e0()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T1.W(O3.a2):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void X(C0278e c0278e, a2 a2Var) {
        C0328v c0328v;
        AbstractC1887A.d(c0278e.f4830q);
        AbstractC1887A.g(c0278e.f4831r);
        AbstractC1887A.g(c0278e.f4832s);
        AbstractC1887A.d(c0278e.f4832s.f4647r);
        c().o();
        k0();
        if (Q(a2Var)) {
            if (!a2Var.f4736x) {
                a0(a2Var);
                return;
            }
            C0278e c0278e2 = new C0278e(c0278e);
            boolean z5 = false;
            c0278e2.f4834u = false;
            C0305n c0305n = this.f4609s;
            S(c0305n);
            c0305n.c0();
            try {
                C0305n c0305n2 = this.f4609s;
                S(c0305n2);
                String str = c0278e2.f4830q;
                AbstractC1887A.g(str);
                C0278e c0278eO0 = c0305n2.o0(str, c0278e2.f4832s.f4647r);
                C0323t0 c0323t0 = this.f4582B;
                if (c0278eO0 != null && !c0278eO0.f4831r.equals(c0278e2.f4831r)) {
                    b().f4673z.e("Updating a conditional user property with different origin. name, origin, origin (from DB)", c0323t0.f5081z.c(c0278e2.f4832s.f4647r), c0278e2.f4831r, c0278eO0.f4831r);
                }
                if (c0278eO0 != null && c0278eO0.f4834u) {
                    c0278e2.f4831r = c0278eO0.f4831r;
                    c0278e2.f4833t = c0278eO0.f4833t;
                    c0278e2.f4837x = c0278eO0.f4837x;
                    c0278e2.f4835v = c0278eO0.f4835v;
                    c0278e2.f4838y = c0278eO0.f4838y;
                    c0278e2.f4834u = true;
                    V1 v12 = c0278e2.f4832s;
                    c0278e2.f4832s = new V1(c0278eO0.f4832s.f4648s, v12.W(), v12.f4647r, c0278eO0.f4832s.f4651v);
                } else if (TextUtils.isEmpty(c0278e2.f4835v)) {
                    V1 v13 = c0278e2.f4832s;
                    c0278e2.f4832s = new V1(c0278e2.f4833t, v13.W(), v13.f4647r, c0278e2.f4832s.f4651v);
                    c0278e2.f4834u = true;
                    z5 = true;
                }
                if (c0278e2.f4834u) {
                    V1 v14 = c0278e2.f4832s;
                    String str2 = c0278e2.f4830q;
                    AbstractC1887A.g(str2);
                    String str3 = c0278e2.f4831r;
                    String str4 = v14.f4647r;
                    long j = v14.f4648s;
                    Object objW = v14.W();
                    AbstractC1887A.g(objW);
                    W1 w12 = new W1(str2, str3, str4, j, objW);
                    Object obj = w12.f4661e;
                    String str5 = w12.f4659c;
                    C0305n c0305n3 = this.f4609s;
                    S(c0305n3);
                    if (c0305n3.j0(w12)) {
                        b().f4665D.e("User property updated immediately", c0278e2.f4830q, c0323t0.f5081z.c(str5), obj);
                    } else {
                        b().f4670w.e("(2)Too many active user properties, ignoring", X.w(c0278e2.f4830q), c0323t0.f5081z.c(str5), obj);
                    }
                    if (z5 && (c0328v = c0278e2.f4838y) != null) {
                        l(new C0328v(c0328v, c0278e2.f4833t), a2Var);
                    }
                }
                C0305n c0305n4 = this.f4609s;
                S(c0305n4);
                if (c0305n4.n0(c0278e2)) {
                    b().f4665D.e("Conditional property added", c0278e2.f4830q, c0323t0.f5081z.c(c0278e2.f4832s.f4647r), c0278e2.f4832s.W());
                } else {
                    b().f4670w.e("Too many conditional properties, ignoring", X.w(c0278e2.f4830q), c0323t0.f5081z.c(c0278e2.f4832s.f4647r), c0278e2.f4832s.W());
                }
                C0305n c0305n5 = this.f4609s;
                S(c0305n5);
                c0305n5.d0();
                C0305n c0305n6 = this.f4609s;
                S(c0305n6);
                c0305n6.e0();
            } catch (Throwable th) {
                C0305n c0305n7 = this.f4609s;
                S(c0305n7);
                c0305n7.e0();
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Y(C0278e c0278e, a2 a2Var) {
        AbstractC1887A.d(c0278e.f4830q);
        AbstractC1887A.g(c0278e.f4832s);
        AbstractC1887A.d(c0278e.f4832s.f4647r);
        c().o();
        k0();
        if (Q(a2Var)) {
            if (!a2Var.f4736x) {
                a0(a2Var);
                return;
            }
            C0305n c0305n = this.f4609s;
            S(c0305n);
            c0305n.c0();
            try {
                a0(a2Var);
                String str = c0278e.f4830q;
                AbstractC1887A.g(str);
                C0305n c0305n2 = this.f4609s;
                S(c0305n2);
                C0278e c0278eO0 = c0305n2.o0(str, c0278e.f4832s.f4647r);
                C0323t0 c0323t0 = this.f4582B;
                if (c0278eO0 != null) {
                    b().f4665D.d(c0278e.f4830q, c0323t0.f5081z.c(c0278e.f4832s.f4647r), "Removing conditional user property");
                    C0305n c0305n3 = this.f4609s;
                    S(c0305n3);
                    c0305n3.p0(str, c0278e.f4832s.f4647r);
                    if (c0278eO0.f4834u) {
                        C0305n c0305n4 = this.f4609s;
                        S(c0305n4);
                        c0305n4.i0(str, c0278e.f4832s.f4647r);
                    }
                    C0328v c0328v = c0278e.f4829A;
                    if (c0328v != null) {
                        C0325u c0325u = c0328v.f5092r;
                        C0328v c0328vQ = j0().Q(c0328v.f5091q, c0325u != null ? c0325u.c0() : null, c0278eO0.f4831r, c0328v.f5094t, true);
                        AbstractC1887A.g(c0328vQ);
                        l(c0328vQ, a2Var);
                    }
                } else {
                    b().f4673z.d(X.w(c0278e.f4830q), c0323t0.f5081z.c(c0278e.f4832s.f4647r), "Conditional user property doesn't exist");
                }
                C0305n c0305n5 = this.f4609s;
                S(c0305n5);
                c0305n5.d0();
                C0305n c0305n6 = this.f4609s;
                S(c0305n6);
                c0305n6.e0();
            } catch (Throwable th) {
                C0305n c0305n7 = this.f4609s;
                S(c0305n7);
                c0305n7.e0();
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Z(a2 a2Var, long j) throws Throwable {
        C0305n c0305n = this.f4609s;
        S(c0305n);
        String str = a2Var.f4729q;
        AbstractC1887A.g(str);
        C0273c0 c0273c0S0 = c0305n.s0(str);
        if (c0273c0S0 != null) {
            j0();
            String str2 = a2Var.f4730r;
            String strG = c0273c0S0.G();
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean zIsEmpty2 = TextUtils.isEmpty(strG);
            if (!zIsEmpty && !zIsEmpty2) {
                AbstractC1887A.g(str2);
                if (!str2.equals(strG)) {
                    b().f4673z.c(X.w(c0273c0S0.D()), "New GMP App Id passed in. Removing cached database data. appId");
                    C0305n c0305n2 = this.f4609s;
                    S(c0305n2);
                    C0323t0 c0323t0 = (C0323t0) c0305n2.f4346r;
                    String strD = c0273c0S0.D();
                    c0305n2.p();
                    c0305n2.o();
                    AbstractC1887A.d(strD);
                    try {
                        SQLiteDatabase sQLiteDatabaseF0 = c0305n2.f0();
                        String[] strArr = {strD};
                        int iDelete = sQLiteDatabaseF0.delete("events", "app_id=?", strArr) + sQLiteDatabaseF0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseF0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseF0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseF0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseF0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseF0.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseF0.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseF0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseF0.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseF0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseF0.delete("trigger_uris", "app_id=?", strArr);
                        if (c0323t0.f5075t.y(null, F.f4436i1)) {
                            iDelete += sQLiteDatabaseF0.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (iDelete > 0) {
                            X x6 = c0323t0.f5077v;
                            C0323t0.l(x6);
                            x6.f4666E.d(strD, Integer.valueOf(iDelete), "Deleted application data. app, records");
                        }
                    } catch (SQLiteException e7) {
                        X x7 = c0323t0.f5077v;
                        C0323t0.l(x7);
                        x7.f4670w.d(X.w(strD), e7, "Error deleting application data. appId, error");
                    }
                    c0273c0S0 = null;
                }
            }
        }
        if (c0273c0S0 != null) {
            boolean z5 = (c0273c0S0.P() == -2147483648L || c0273c0S0.P() == a2Var.f4738z) ? false : true;
            String strN = c0273c0S0.N();
            if (z5 || ((c0273c0S0.P() != -2147483648L || strN == null || strN.equals(a2Var.f4731s)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strN);
                C0328v c0328v = new C0328v("_au", new C0325u(bundle), "auto", j);
                if (d0().y(null, F.f4423d1)) {
                    i(c0328v, a2Var);
                } else {
                    j(c0328v, a2Var);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final J0 a(String str) {
        J0 j02 = J0.f4496c;
        c().o();
        k0();
        HashMap map = this.f4598R;
        J0 j0J = (J0) map.get(str);
        if (j0J == null) {
            C0305n c0305n = this.f4609s;
            S(c0305n);
            j0J = c0305n.J(str);
            if (j0J == null) {
                j0J = J0.f4496c;
            }
            c().o();
            k0();
            map.put(str, j0J);
            C0305n c0305n2 = this.f4609s;
            S(c0305n2);
            c0305n2.V(str, j0J);
        }
        return j0J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O3.C0273c0 a0(O3.a2 r13) {
        /*
            r12 = this;
            O3.p0 r0 = r12.c()
            r0.o()
            r12.k0()
            x3.AbstractC1887A.g(r13)
            boolean r0 = r13.f4711D
            java.lang.String r2 = r13.f4729q
            x3.AbstractC1887A.d(r2)
            java.lang.String r1 = r13.f4717J
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L26
            O3.R1 r3 = new O3.R1
            r3.<init>(r12, r1)
            java.util.HashMap r1 = r12.f4600T
            r1.put(r2, r3)
        L26:
            O3.n r1 = r12.f4609s
            S(r1)
            O3.c0 r8 = r1.s0(r2)
            O3.J0 r1 = r12.a(r2)
            java.lang.String r3 = r13.f4716I
            r4 = 100
            O3.J0 r3 = O3.J0.c(r4, r3)
            O3.J0 r1 = r1.j(r3)
            O3.I0 r3 = O3.I0.AD_STORAGE
            boolean r4 = r1.i(r3)
            java.lang.String r5 = ""
            if (r4 == 0) goto L50
            O3.y1 r4 = r12.f4615y
            java.lang.String r4 = r4.t(r2, r0)
            goto L51
        L50:
            r4 = r5
        L51:
            r9 = 1
            O3.I0 r6 = O3.I0.ANALYTICS_STORAGE
            r10 = 0
            if (r8 != 0) goto L77
            O3.c0 r8 = new O3.c0
            O3.t0 r5 = r12.f4582B
            r8.<init>(r5, r2)
            boolean r2 = r1.i(r6)
            if (r2 == 0) goto L6b
            java.lang.String r2 = r12.o(r1)
            r8.F(r2)
        L6b:
            boolean r1 = r1.i(r3)
            if (r1 == 0) goto L74
            r8.I(r4)
        L74:
            r11 = r10
            goto L146
        L77:
            O3.t0 r7 = r8.f4793a
            boolean r11 = r1.i(r3)
            if (r11 == 0) goto L12d
            if (r4 == 0) goto L12d
            O3.p0 r11 = r7.f5078w
            O3.C0323t0.l(r11)
            r11.o()
            java.lang.String r11 = r8.f4797e
            boolean r11 = r4.equals(r11)
            if (r11 != 0) goto L12d
            O3.p0 r7 = r7.f5078w
            O3.C0323t0.l(r7)
            r7.o()
            java.lang.String r7 = r8.f4797e
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r8.I(r4)
            if (r0 == 0) goto L114
            O3.y1 r4 = r12.f4615y
            r4.getClass()
            boolean r3 = r1.i(r3)
            if (r3 == 0) goto Lb4
            android.util.Pair r3 = r4.s(r2)
            goto Lbb
        Lb4:
            android.util.Pair r3 = new android.util.Pair
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.<init>(r5, r4)
        Lbb:
            java.lang.Object r3 = r3.first
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L114
            if (r7 != 0) goto L114
            boolean r3 = r1.i(r6)
            if (r3 == 0) goto Ld6
            java.lang.String r1 = r12.o(r1)
            r8.F(r1)
            r11 = r10
            goto Ld7
        Ld6:
            r11 = r9
        Ld7:
            O3.n r1 = r12.f4609s
            S(r1)
            java.lang.String r3 = "_id"
            O3.W1 r1 = r1.k0(r2, r3)
            if (r1 == 0) goto L146
            O3.n r1 = r12.f4609s
            S(r1)
            java.lang.String r3 = "_lair"
            O3.W1 r1 = r1.k0(r2, r3)
            if (r1 != 0) goto L146
            B3.a r1 = r12.e()
            r1.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            O3.W1 r1 = new O3.W1
            r3 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "auto"
            java.lang.String r4 = "_lair"
            r1.<init>(r2, r3, r4, r5, r7)
            O3.n r2 = r12.f4609s
            S(r2)
            r2.j0(r1)
            goto L146
        L114:
            java.lang.String r2 = r8.E()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L74
            boolean r2 = r1.i(r6)
            if (r2 == 0) goto L74
            java.lang.String r1 = r12.o(r1)
            r8.F(r1)
            goto L74
        L12d:
            java.lang.String r2 = r8.E()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L74
            boolean r2 = r1.i(r6)
            if (r2 == 0) goto L74
            java.lang.String r1 = r12.o(r1)
            r8.F(r1)
            goto L74
        L146:
            O3.t0 r1 = r8.f4793a
            java.lang.String r2 = r13.f4730r
            r8.H(r2)
            java.lang.String r2 = r13.f4708A
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L158
            r8.K(r2)
        L158:
            long r2 = r13.f4733u
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L163
            r8.S(r2)
        L163:
            java.lang.String r2 = r13.f4731s
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L16e
            r8.O(r2)
        L16e:
            long r2 = r13.f4738z
            r8.Q(r2)
            java.lang.String r2 = r13.f4732t
            if (r2 == 0) goto L17a
            r8.R(r2)
        L17a:
            long r2 = r13.f4734v
            r8.a(r2)
            boolean r2 = r13.f4736x
            r8.d(r2)
            java.lang.String r2 = r13.f4735w
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L18f
            r8.v(r2)
        L18f:
            O3.p0 r2 = r1.f5078w
            O3.C0323t0.l(r2)
            r2.o()
            boolean r2 = r8.f4790Q
            boolean r3 = r8.f4805p
            if (r3 == r0) goto L19f
            r3 = r9
            goto L1a0
        L19f:
            r3 = r10
        L1a0:
            r2 = r2 | r3
            r8.f4790Q = r2
            r8.f4805p = r0
            java.lang.Boolean r0 = r13.f4713F
            O3.p0 r2 = r1.f5078w
            O3.C0323t0.l(r2)
            r2.o()
            boolean r2 = r8.f4790Q
            java.lang.Boolean r3 = r8.f4806q
            boolean r3 = java.util.Objects.equals(r3, r0)
            r3 = r3 ^ r9
            r2 = r2 | r3
            r8.f4790Q = r2
            r8.f4806q = r0
            long r2 = r13.f4714G
            r8.c(r2)
            java.lang.String r0 = r13.f4718K
            O3.p0 r2 = r1.f5078w
            O3.C0323t0.l(r2)
            r2.o()
            boolean r2 = r8.f4790Q
            java.lang.String r3 = r8.f4809t
            boolean r3 = java.util.Objects.equals(r3, r0)
            r3 = r3 ^ r9
            r2 = r2 | r3
            r8.f4790Q = r2
            r8.f4809t = r0
            com.google.android.gms.internal.measurement.A3 r0 = com.google.android.gms.internal.measurement.A3.f10594r
            G4.g r2 = r0.f10595q
            java.lang.Object r2 = r2.f2014q
            com.google.android.gms.internal.measurement.B3 r2 = (com.google.android.gms.internal.measurement.B3) r2
            O3.g r2 = r12.d0()
            O3.E r3 = O3.F.f4384L0
            r4 = 0
            boolean r2 = r2.y(r4, r3)
            if (r2 == 0) goto L1f5
            java.util.List r0 = r13.f4715H
            r8.x(r0)
            goto L20a
        L1f5:
            G4.g r0 = r0.f10595q
            java.lang.Object r0 = r0.f2014q
            com.google.android.gms.internal.measurement.B3 r0 = (com.google.android.gms.internal.measurement.B3) r0
            O3.g r0 = r12.d0()
            O3.E r2 = O3.F.f4382K0
            boolean r0 = r0.y(r4, r2)
            if (r0 == 0) goto L20a
            r8.x(r4)
        L20a:
            boolean r0 = r13.f4719L
            O3.p0 r2 = r1.f5078w
            O3.C0323t0.l(r2)
            r2.o()
            boolean r2 = r8.f4790Q
            boolean r3 = r8.f4810u
            if (r3 == r0) goto L21c
            r3 = r9
            goto L21d
        L21c:
            r3 = r10
        L21d:
            r2 = r2 | r3
            r8.f4790Q = r2
            r8.f4810u = r0
            java.lang.String r0 = r13.f4725R
            O3.p0 r2 = r1.f5078w
            O3.C0323t0.l(r2)
            r2.o()
            boolean r2 = r8.f4790Q
            java.lang.String r3 = r8.f4776C
            if (r3 == r0) goto L234
            r3 = r9
            goto L235
        L234:
            r3 = r10
        L235:
            r2 = r2 | r3
            r8.f4790Q = r2
            r8.f4776C = r0
            com.google.android.gms.internal.measurement.Y3.a()
            O3.g r0 = r12.d0()
            O3.E r2 = O3.F.f4392P0
            boolean r0 = r0.y(r4, r2)
            if (r0 == 0) goto L261
            int r0 = r13.f4723P
            O3.p0 r2 = r1.f5078w
            O3.C0323t0.l(r2)
            r2.o()
            boolean r2 = r8.f4790Q
            int r3 = r8.f4813x
            if (r3 == r0) goto L25b
            r3 = r9
            goto L25c
        L25b:
            r3 = r10
        L25c:
            r2 = r2 | r3
            r8.f4790Q = r2
            r8.f4813x = r0
        L261:
            long r2 = r13.f4720M
            r8.z(r2)
            java.lang.String r0 = r13.f4726S
            O3.p0 r2 = r1.f5078w
            O3.C0323t0.l(r2)
            r2.o()
            boolean r2 = r8.f4790Q
            java.lang.String r3 = r8.f4780G
            if (r3 == r0) goto L278
            r3 = r9
            goto L279
        L278:
            r3 = r10
        L279:
            r2 = r2 | r3
            r8.f4790Q = r2
            r8.f4780G = r0
            int r13 = r13.f4728U
            O3.p0 r0 = r1.f5078w
            O3.C0323t0.l(r0)
            r0.o()
            boolean r0 = r8.f4790Q
            int r1 = r8.f4782I
            if (r1 == r13) goto L28f
            r10 = r9
        L28f:
            r0 = r0 | r10
            r8.f4790Q = r0
            r8.f4782I = r13
            boolean r13 = r8.o()
            if (r13 != 0) goto L29e
            if (r11 == 0) goto L29d
            goto L29f
        L29d:
            return r8
        L29e:
            r9 = r11
        L29f:
            O3.n r13 = r12.f4609s
            S(r13)
            r13.t0(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T1.a0(O3.a2):O3.c0");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.F0
    public final X b() {
        C0323t0 c0323t0 = this.f4582B;
        AbstractC1887A.g(c0323t0);
        X x6 = c0323t0.f5077v;
        C0323t0.l(x6);
        return x6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:61:0x013e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List b0(a2 a2Var, Bundle bundle) {
        int[] iArr;
        c().o();
        Y3.a();
        C0284g c0284gD0 = d0();
        String str = a2Var.f4729q;
        if (!c0284gD0.y(str, F.f4392P0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    b().f4670w.b("Uri sources and timestamps do not match");
                } else {
                    int i = 0;
                    while (i < intArray.length) {
                        C0305n c0305n = this.f4609s;
                        S(c0305n);
                        C0323t0 c0323t0 = (C0323t0) c0305n.f4346r;
                        int i7 = intArray[i];
                        long j = longArray[i];
                        AbstractC1887A.d(str);
                        c0305n.o();
                        c0305n.p();
                        try {
                            iArr = intArray;
                        } catch (SQLiteException e7) {
                            e = e7;
                            iArr = intArray;
                        }
                        try {
                            int iDelete = c0305n.f0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i7), String.valueOf(j)});
                            X x6 = c0323t0.f5077v;
                            C0323t0.l(x6);
                            V v6 = x6.f4666E;
                            StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 46);
                            sb.append("Pruned ");
                            sb.append(iDelete);
                            sb.append(" trigger URIs. appId, source, timestamp");
                            v6.e(sb.toString(), str, Integer.valueOf(i7), Long.valueOf(j));
                        } catch (SQLiteException e8) {
                            e = e8;
                            X x7 = c0323t0.f5077v;
                            C0323t0.l(x7);
                            x7.f4670w.d(X.w(str), e, "Error pruning trigger URIs. appId");
                        }
                        i++;
                        intArray = iArr;
                    }
                }
            }
        }
        C0305n c0305n2 = this.f4609s;
        S(c0305n2);
        String str2 = a2Var.f4729q;
        AbstractC1887A.d(str2);
        c0305n2.o();
        c0305n2.p();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c0305n2.f0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", FirebaseAnalytics.Param.SOURCE}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new I1(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e9) {
            X x8 = ((C0323t0) c0305n2.f4346r).f5077v;
            C0323t0.l(x8);
            x8.f4670w.d(X.w(str2), e9, "Error querying trigger uris. appId");
            arrayList = Collections.EMPTY_LIST;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.F0
    public final C0312p0 c() {
        C0323t0 c0323t0 = this.f4582B;
        AbstractC1887A.g(c0323t0);
        C0312p0 c0312p0 = c0323t0.f5078w;
        C0323t0.l(c0312p0);
        return c0312p0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.F0
    public final Context d() {
        return this.f4582B.f5072q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0284g d0() {
        C0323t0 c0323t0 = this.f4582B;
        AbstractC1887A.g(c0323t0);
        return c0323t0.f5075t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.F0
    public final B3.a e() {
        C0323t0 c0323t0 = this.f4582B;
        AbstractC1887A.g(c0323t0);
        return c0323t0.f5052A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0300l0 e0() {
        C0300l0 c0300l0 = this.f4607q;
        S(c0300l0);
        return c0300l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long f() {
        e().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0339y1 c0339y1 = this.f4615y;
        c0339y1.p();
        c0339y1.o();
        C0282f0 c0282f0 = c0339y1.f5161A;
        long jA = c0282f0.a();
        if (jA == 0) {
            Y1 y12 = ((C0323t0) c0339y1.f4346r).f5080y;
            C0323t0.j(y12);
            jA = ((long) y12.l0().nextInt(86400000)) + 1;
            c0282f0.b(jA);
        }
        return ((((jCurrentTimeMillis + jA) / 1000) / 60) / 60) / 24;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0305n f0() {
        C0305n c0305n = this.f4609s;
        S(c0305n);
        return c0305n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.F0
    public final s4.e g() {
        return this.f4582B.f5074s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0276d0 g0() {
        C0276d0 c0276d0 = this.f4610t;
        if (c0276d0 != null) {
            return c0276d0;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(C0328v c0328v, String str) throws Throwable {
        C0305n c0305n = this.f4609s;
        S(c0305n);
        C0273c0 c0273c0S0 = c0305n.s0(str);
        if (c0273c0S0 != null) {
            C0323t0 c0323t0 = c0273c0S0.f4793a;
            if (!TextUtils.isEmpty(c0273c0S0.N())) {
                Boolean boolN = N(c0273c0S0);
                if (boolN == null) {
                    if (!"_ui".equals(c0328v.f5091q)) {
                        b().f4673z.c(X.w(str), "Could not find package. appId");
                    }
                } else if (!boolN.booleanValue()) {
                    b().f4670w.c(X.w(str), "App version does not match; dropping event. appId");
                    return;
                }
                String strG = c0273c0S0.G();
                String strN = c0273c0S0.N();
                long jP = c0273c0S0.P();
                C0312p0 c0312p0 = c0323t0.f5078w;
                C0323t0.l(c0312p0);
                c0312p0.o();
                String str2 = c0273c0S0.f4801l;
                C0312p0 c0312p02 = c0323t0.f5078w;
                C0323t0.l(c0312p02);
                c0312p02.o();
                long j = c0273c0S0.f4802m;
                C0312p0 c0312p03 = c0323t0.f5078w;
                C0323t0.l(c0312p03);
                c0312p03.o();
                long j7 = c0273c0S0.f4803n;
                C0312p0 c0312p04 = c0323t0.f5078w;
                C0323t0.l(c0312p04);
                c0312p04.o();
                boolean z5 = c0273c0S0.f4804o;
                String strJ = c0273c0S0.J();
                C0312p0 c0312p05 = c0323t0.f5078w;
                C0323t0.l(c0312p05);
                c0312p05.o();
                boolean z6 = c0273c0S0.f4805p;
                Boolean boolW = c0273c0S0.w();
                long jB = c0273c0S0.b();
                C0312p0 c0312p06 = c0323t0.f5078w;
                C0323t0.l(c0312p06);
                c0312p06.o();
                ArrayList arrayList = c0273c0S0.f4808s;
                String strG2 = a(str).g();
                boolean zY = c0273c0S0.y();
                C0312p0 c0312p07 = c0323t0.f5078w;
                C0323t0.l(c0312p07);
                c0312p07.o();
                long j8 = c0273c0S0.f4811v;
                int i = a(str).f4498b;
                String str3 = n0(str).f5006b;
                C0312p0 c0312p08 = c0323t0.f5078w;
                C0323t0.l(c0312p08);
                c0312p08.o();
                int i7 = c0273c0S0.f4813x;
                C0312p0 c0312p09 = c0323t0.f5078w;
                C0323t0.l(c0312p09);
                c0312p09.o();
                i(c0328v, new a2(str, strG, strN, jP, str2, j, j7, (String) null, z5, false, strJ, 0L, 0, z6, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j8, i, str3, i7, c0273c0S0.f4775B, c0273c0S0.C(), c0273c0S0.s(), 0L, c0273c0S0.t()));
                return;
            }
        }
        b().f4665D.c(str, "No app data available; dropping event");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0272c h0() {
        C0272c c0272c = this.f4612v;
        S(c0272c);
        return c0272c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0080: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:129), block:B:18:0x0080 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(O3.C0328v r11, O3.a2 r12) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r1 = r12.f4729q
            x3.AbstractC1887A.d(r1)
            O3.Y r11 = O3.Y.c(r11)
            java.lang.Object r0 = r11.f4683e
            r2 = r0
            android.os.Bundle r2 = (android.os.Bundle) r2
            O3.Y1 r3 = r10.j0()
            O3.n r0 = r10.f4609s
            S(r0)
            java.lang.Object r4 = r0.f4346r
            O3.t0 r4 = (O3.C0323t0) r4
            r0.o()
            r0.p()
            r5 = 0
            android.database.sqlite.SQLiteDatabase r6 = r0.f0()     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r7 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r8 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            android.database.Cursor r6 = r6.rawQuery(r7, r8)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            boolean r7 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            if (r7 != 0) goto L48
            O3.X r0 = r4.f5077v     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            O3.V r0 = r0.f4666E     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            java.lang.String r7 = "Default event parameters not found"
            r0.b(r7)     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            goto L95
        L43:
            r0 = move-exception
            r11 = r0
            goto L80
        L46:
            r0 = move-exception
            goto L89
        L48:
            r7 = 0
            byte[] r7 = r6.getBlob(r7)     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            com.google.android.gms.internal.measurement.j1 r8 = com.google.android.gms.internal.measurement.C0820k1.z()     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46 java.io.IOException -> L6e
            com.google.android.gms.internal.measurement.p2 r7 = O3.C0270b0.b0(r8, r7)     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46 java.io.IOException -> L6e
            com.google.android.gms.internal.measurement.j1 r7 = (com.google.android.gms.internal.measurement.C0815j1) r7     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46 java.io.IOException -> L6e
            com.google.android.gms.internal.measurement.q2 r7 = r7.e()     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46 java.io.IOException -> L6e
            com.google.android.gms.internal.measurement.k1 r7 = (com.google.android.gms.internal.measurement.C0820k1) r7     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46 java.io.IOException -> L6e
            O3.T1 r0 = r0.f4510s     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            r0.i0()     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            java.util.List r0 = r7.p()     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            android.os.Bundle r0 = O3.C0270b0.v(r0)     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            r6.close()
            goto L9b
        L6e:
            r0 = move-exception
            O3.X r7 = r4.f5077v     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            O3.C0323t0.l(r7)     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            O3.V r7 = r7.f4670w     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            java.lang.String r8 = "Failed to retrieve default event parameters. appId"
            O3.W r9 = O3.X.w(r1)     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            r7.d(r9, r0, r8)     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            goto L95
        L80:
            r5 = r6
            goto L10b
        L83:
            r0 = move-exception
            r11 = r0
            goto L10b
        L87:
            r0 = move-exception
            r6 = r5
        L89:
            O3.X r4 = r4.f5077v     // Catch: java.lang.Throwable -> L43
            O3.C0323t0.l(r4)     // Catch: java.lang.Throwable -> L43
            O3.V r4 = r4.f4670w     // Catch: java.lang.Throwable -> L43
            java.lang.String r7 = "Error selecting default event parameters"
            r4.c(r0, r7)     // Catch: java.lang.Throwable -> L43
        L95:
            if (r6 == 0) goto L9a
            r6.close()
        L9a:
            r0 = r5
        L9b:
            r3.z(r2, r0)
            O3.Y1 r0 = r10.j0()
            O3.g r2 = r10.d0()
            r2.getClass()
            O3.E r3 = O3.F.f4406X
            r4 = 100
            int r1 = r2.w(r1, r3)
            int r1 = java.lang.Math.min(r1, r4)
            r2 = 25
            int r1 = java.lang.Math.max(r1, r2)
            r0.x(r11, r1)
            O3.v r11 = r11.e()
            O3.g r0 = r10.d0()
            O3.E r1 = O3.F.f4431g1
            boolean r0 = r0.y(r5, r1)
            if (r0 == 0) goto Lcf
            goto L107
        Lcf:
            java.lang.String r0 = r11.f5091q
            java.lang.String r1 = "_cmp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L107
            O3.u r0 = r11.f5092r
            android.os.Bundle r1 = r0.f5085q
            java.lang.String r2 = "_cis"
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "referrer API v2"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L107
            java.lang.String r1 = "gclid"
            android.os.Bundle r0 = r0.f5085q
            java.lang.String r5 = r0.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L107
            long r3 = r11.f5094t
            O3.V1 r2 = new O3.V1
            java.lang.String r7 = "auto"
            java.lang.String r6 = "_lgclid"
            r2.<init>(r3, r5, r6, r7)
            r10.U(r2, r12)
        L107:
            r10.j(r11, r12)
            return
        L10b:
            if (r5 == 0) goto L110
            r5.close()
        L110:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T1.i(O3.v, O3.a2):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0270b0 i0() {
        C0270b0 c0270b0 = this.f4613w;
        S(c0270b0);
        return c0270b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(C0328v c0328v, a2 a2Var) {
        C0328v c0328v2;
        List listR0;
        C0323t0 c0323t0;
        List listR02;
        List<C0278e> listR03;
        String str;
        AbstractC1887A.g(a2Var);
        String str2 = a2Var.f4729q;
        AbstractC1887A.d(str2);
        c().o();
        k0();
        long j = c0328v.f5094t;
        Y yC = Y.c(c0328v);
        c().o();
        Y1.f0((this.f4602V == null || (str = this.f4603W) == null || !str.equals(str2)) ? null : this.f4602V, (Bundle) yC.f4683e, false);
        C0328v c0328vE = yC.e();
        i0();
        if (TextUtils.isEmpty(a2Var.f4730r)) {
            return;
        }
        if (!a2Var.f4736x) {
            a0(a2Var);
            return;
        }
        List list = a2Var.f4715H;
        if (list != null) {
            String str3 = c0328vE.f5091q;
            if (!list.contains(str3)) {
                b().f4665D.e("Dropping non-safelisted event. appId, event name, origin", str2, c0328vE.f5091q, c0328vE.f5093s);
                return;
            } else {
                Bundle bundleC0 = c0328vE.f5092r.c0();
                bundleC0.putLong("ga_safelisted", 1L);
                c0328v2 = new C0328v(str3, new C0325u(bundleC0), c0328vE.f5093s, c0328vE.f5094t);
            }
        } else {
            c0328v2 = c0328vE;
        }
        C0305n c0305n = this.f4609s;
        S(c0305n);
        c0305n.c0();
        try {
            String str4 = c0328v2.f5091q;
            if ("_s".equals(str4)) {
                C0305n c0305n2 = this.f4609s;
                S(c0305n2);
                if (!c0305n2.D(str2, "_s") && c0328v2.f5092r.f5085q.getLong("_sid") != 0) {
                    C0305n c0305n3 = this.f4609s;
                    S(c0305n3);
                    if (c0305n3.D(str2, "_f")) {
                        C0305n c0305n4 = this.f4609s;
                        S(c0305n4);
                        c0305n4.I(str2, null, "_sid", k(c0328v2, str2));
                    } else {
                        C0305n c0305n5 = this.f4609s;
                        S(c0305n5);
                        if (c0305n5.D(str2, "_v")) {
                            C0305n c0305n42 = this.f4609s;
                            S(c0305n42);
                            c0305n42.I(str2, null, "_sid", k(c0328v2, str2));
                        } else {
                            C0305n c0305n6 = this.f4609s;
                            S(c0305n6);
                            e().getClass();
                            c0305n6.I(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", k(c0328v2, str2));
                        }
                    }
                }
            }
            C0305n c0305n7 = this.f4609s;
            S(c0305n7);
            AbstractC1887A.d(str2);
            c0305n7.o();
            c0305n7.p();
            if (j < 0) {
                X x6 = ((C0323t0) c0305n7.f4346r).f5077v;
                C0323t0.l(x6);
                x6.f4673z.d(X.w(str2), Long.valueOf(j), "Invalid time querying timed out conditional properties");
                listR0 = Collections.EMPTY_LIST;
            } else {
                listR0 = c0305n7.r0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = listR0.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c0323t0 = this.f4582B;
                if (!zHasNext) {
                    break;
                }
                C0278e c0278e = (C0278e) it.next();
                if (c0278e != null) {
                    b().f4666E.e("User property timed out", c0278e.f4830q, c0323t0.f5081z.c(c0278e.f4832s.f4647r), c0278e.f4832s.W());
                    C0328v c0328v3 = c0278e.f4836w;
                    if (c0328v3 != null) {
                        l(new C0328v(c0328v3, j), a2Var);
                    }
                    C0305n c0305n8 = this.f4609s;
                    S(c0305n8);
                    c0305n8.p0(str2, c0278e.f4832s.f4647r);
                }
            }
            C0305n c0305n9 = this.f4609s;
            S(c0305n9);
            AbstractC1887A.d(str2);
            c0305n9.o();
            c0305n9.p();
            if (j < 0) {
                X x7 = ((C0323t0) c0305n9.f4346r).f5077v;
                C0323t0.l(x7);
                x7.f4673z.d(X.w(str2), Long.valueOf(j), "Invalid time querying expired conditional properties");
                listR02 = Collections.EMPTY_LIST;
            } else {
                listR02 = c0305n9.r0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(listR02.size());
            Iterator it2 = listR02.iterator();
            while (it2.hasNext()) {
                C0278e c0278e2 = (C0278e) it2.next();
                if (c0278e2 != null) {
                    Iterator it3 = it2;
                    b().f4666E.e("User property expired", c0278e2.f4830q, c0323t0.f5081z.c(c0278e2.f4832s.f4647r), c0278e2.f4832s.W());
                    C0305n c0305n10 = this.f4609s;
                    S(c0305n10);
                    c0305n10.i0(str2, c0278e2.f4832s.f4647r);
                    C0328v c0328v4 = c0278e2.f4829A;
                    if (c0328v4 != null) {
                        arrayList.add(c0328v4);
                    }
                    C0305n c0305n11 = this.f4609s;
                    S(c0305n11);
                    c0305n11.p0(str2, c0278e2.f4832s.f4647r);
                    it2 = it3;
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l(new C0328v((C0328v) obj, j), a2Var);
            }
            C0305n c0305n12 = this.f4609s;
            S(c0305n12);
            AbstractC1887A.d(str2);
            AbstractC1887A.d(str4);
            c0305n12.o();
            c0305n12.p();
            if (j < 0) {
                C0323t0 c0323t02 = (C0323t0) c0305n12.f4346r;
                X x8 = c0323t02.f5077v;
                C0323t0.l(x8);
                x8.f4673z.e("Invalid time querying triggered conditional properties", X.w(str2), c0323t02.f5081z.a(str4), Long.valueOf(j));
                listR03 = Collections.EMPTY_LIST;
            } else {
                listR03 = c0305n12.r0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(listR03.size());
            for (C0278e c0278e3 : listR03) {
                if (c0278e3 != null) {
                    V1 v12 = c0278e3.f4832s;
                    String str5 = c0278e3.f4830q;
                    AbstractC1887A.g(str5);
                    String str6 = c0278e3.f4831r;
                    String str7 = v12.f4647r;
                    Object objW = v12.W();
                    AbstractC1887A.g(objW);
                    W1 w12 = new W1(str5, str6, str7, j, objW);
                    Object obj2 = w12.f4661e;
                    String str8 = w12.f4659c;
                    C0305n c0305n13 = this.f4609s;
                    S(c0305n13);
                    if (c0305n13.j0(w12)) {
                        b().f4666E.e("User property triggered", c0278e3.f4830q, c0323t0.f5081z.c(str8), obj2);
                    } else {
                        b().f4670w.e("Too many active user properties, ignoring", X.w(c0278e3.f4830q), c0323t0.f5081z.c(str8), obj2);
                    }
                    C0328v c0328v5 = c0278e3.f4838y;
                    if (c0328v5 != null) {
                        arrayList2.add(c0328v5);
                    }
                    c0278e3.f4832s = new V1(w12);
                    c0278e3.f4834u = true;
                    C0305n c0305n14 = this.f4609s;
                    S(c0305n14);
                    c0305n14.n0(c0278e3);
                }
            }
            l(c0328v2, a2Var);
            int size2 = arrayList2.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj3 = arrayList2.get(i7);
                i7++;
                l(new C0328v((C0328v) obj3, j), a2Var);
            }
            C0305n c0305n15 = this.f4609s;
            S(c0305n15);
            c0305n15.d0();
            C0305n c0305n16 = this.f4609s;
            S(c0305n16);
            c0305n16.e0();
        } catch (Throwable th) {
            C0305n c0305n17 = this.f4609s;
            S(c0305n17);
            c0305n17.e0();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Y1 j0() {
        C0323t0 c0323t0 = this.f4582B;
        AbstractC1887A.g(c0323t0);
        Y1 y12 = c0323t0.f5080y;
        C0323t0.j(y12);
        return y12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Bundle k(C0328v c0328v, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", c0328v.f5092r.f5085q.getLong("_sid"));
        C0305n c0305n = this.f4609s;
        S(c0305n);
        W1 w1K0 = c0305n.k0(str, "_sno");
        if (w1K0 != null) {
            Object obj = w1K0.f4661e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k0() {
        if (!this.f4583C.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(17:74|(12:76|(0)(1:79)|80|87|(1:89)|91|(0)(0)|94|102|(0)(0)|157|158)|78|81|398|82|86|80|87|(0)(0)|91|(0)(0)|94|102|(0)(0)|157|158) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02fe, code lost:
    
        ((O3.C0323t0) r10.f4346r).b().s().d(O3.X.w(r13), r0, "Error pruning currencies. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03e5 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x088c A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x089c A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x09b0 A[Catch: all -> 0x0944, TryCatch #2 {all -> 0x0944, blocks: (B:273:0x08b5, B:275:0x08c0, B:277:0x08ce, B:279:0x08d8, B:282:0x08ec, B:284:0x08f6, B:286:0x0902, B:288:0x090c, B:290:0x091a, B:292:0x0932, B:296:0x094b, B:298:0x0959, B:299:0x0962, B:301:0x096d, B:303:0x09b0, B:306:0x09bb, B:307:0x09c5, B:308:0x09c6, B:310:0x09d0, B:276:0x08c5), top: B:386:0x08b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x09d0 A[Catch: all -> 0x0944, TRY_LEAVE, TryCatch #2 {all -> 0x0944, blocks: (B:273:0x08b5, B:275:0x08c0, B:277:0x08ce, B:279:0x08d8, B:282:0x08ec, B:284:0x08f6, B:286:0x0902, B:288:0x090c, B:290:0x091a, B:292:0x0932, B:296:0x094b, B:298:0x0959, B:299:0x0962, B:301:0x096d, B:303:0x09b0, B:306:0x09bb, B:307:0x09c5, B:308:0x09c6, B:310:0x09d0, B:276:0x08c5), top: B:386:0x08b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0a41 A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:312:0x09d9, B:314:0x09f0, B:318:0x0a01, B:320:0x0a39, B:322:0x0a41, B:324:0x0a4b, B:325:0x0a55, B:327:0x0a5f, B:328:0x0a69, B:329:0x0a72, B:331:0x0a78, B:333:0x0ac2, B:335:0x0ad4, B:339:0x0af3, B:341:0x0b03, B:338:0x0ae3, B:345:0x0b16, B:346:0x0b58, B:347:0x0b63, B:348:0x0b76, B:350:0x0b7c, B:359:0x0bc3, B:360:0x0c0b, B:362:0x0c1c, B:376:0x0c83, B:367:0x0c36, B:368:0x0c39, B:353:0x0b8a, B:355:0x0bb0, B:373:0x0c54, B:374:0x0c6d, B:375:0x0c6e), top: B:394:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0a5f A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:312:0x09d9, B:314:0x09f0, B:318:0x0a01, B:320:0x0a39, B:322:0x0a41, B:324:0x0a4b, B:325:0x0a55, B:327:0x0a5f, B:328:0x0a69, B:329:0x0a72, B:331:0x0a78, B:333:0x0ac2, B:335:0x0ad4, B:339:0x0af3, B:341:0x0b03, B:338:0x0ae3, B:345:0x0b16, B:346:0x0b58, B:347:0x0b63, B:348:0x0b76, B:350:0x0b7c, B:359:0x0bc3, B:360:0x0c0b, B:362:0x0c1c, B:376:0x0c83, B:367:0x0c36, B:368:0x0c39, B:353:0x0b8a, B:355:0x0bb0, B:373:0x0c54, B:374:0x0c6d, B:375:0x0c6e), top: B:394:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0a78 A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:312:0x09d9, B:314:0x09f0, B:318:0x0a01, B:320:0x0a39, B:322:0x0a41, B:324:0x0a4b, B:325:0x0a55, B:327:0x0a5f, B:328:0x0a69, B:329:0x0a72, B:331:0x0a78, B:333:0x0ac2, B:335:0x0ad4, B:339:0x0af3, B:341:0x0b03, B:338:0x0ae3, B:345:0x0b16, B:346:0x0b58, B:347:0x0b63, B:348:0x0b76, B:350:0x0b7c, B:359:0x0bc3, B:360:0x0c0b, B:362:0x0c1c, B:376:0x0c83, B:367:0x0c36, B:368:0x0c39, B:353:0x0b8a, B:355:0x0bb0, B:373:0x0c54, B:374:0x0c6d, B:375:0x0c6e), top: B:394:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0b7c A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:312:0x09d9, B:314:0x09f0, B:318:0x0a01, B:320:0x0a39, B:322:0x0a41, B:324:0x0a4b, B:325:0x0a55, B:327:0x0a5f, B:328:0x0a69, B:329:0x0a72, B:331:0x0a78, B:333:0x0ac2, B:335:0x0ad4, B:339:0x0af3, B:341:0x0b03, B:338:0x0ae3, B:345:0x0b16, B:346:0x0b58, B:347:0x0b63, B:348:0x0b76, B:350:0x0b7c, B:359:0x0bc3, B:360:0x0c0b, B:362:0x0c1c, B:376:0x0c83, B:367:0x0c36, B:368:0x0c39, B:353:0x0b8a, B:355:0x0bb0, B:373:0x0c54, B:374:0x0c6d, B:375:0x0c6e), top: B:394:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c1c A[Catch: all -> 0x09fe, SQLiteException -> 0x0c32, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0c32, blocks: (B:360:0x0c0b, B:362:0x0c1c), top: B:391:0x0c0b, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0c34  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0b8a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0338 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x037e A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(O3.C0328v r60, O3.a2 r61) throws java.lang.Throwable {
        /*
            r59 = this;
            r1 = r59
            r2 = r61
            java.lang.String r3 = "metadata_fingerprint"
            java.lang.String r4 = "app_id"
            java.lang.String r5 = "_fx"
            java.lang.String r6 = "events"
            java.lang.String r7 = "raw_events"
            java.lang.String r8 = "_sno"
            x3.AbstractC1887A.g(r2)
            boolean r9 = r2.f4711D
            long r10 = r2.f4714G
            long r12 = r2.f4734v
            java.lang.String r14 = r2.f4716I
            r15 = r3
            r16 = r4
            long r3 = r2.f4733u
            r17 = r9
            r18 = r10
            long r9 = r2.f4738z
            java.lang.String r11 = r2.f4718K
            r20 = r15
            java.lang.String r15 = r2.f4731s
            r21 = r5
            java.lang.String r5 = r2.f4732t
            r22 = r12
            boolean r12 = r2.f4736x
            java.lang.String r13 = r2.f4729q
            x3.AbstractC1887A.d(r13)
            long r41 = java.lang.System.nanoTime()
            O3.p0 r0 = r1.c()
            r0.o()
            r1.k0()
            r1.i0()
            r43 = r12
            java.lang.String r12 = r2.f4730r
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L56
            goto L124
        L56:
            if (r43 != 0) goto L5c
            r1.a0(r2)
            return
        L5c:
            O3.l0 r0 = r1.e0()
            r45 = r12
            r44 = r14
            r14 = r60
            java.lang.String r12 = r14.f5091q
            boolean r0 = r0.D(r13, r12)
            java.lang.String r14 = "_err"
            r46 = r3
            O3.t0 r3 = r1.f4582B
            k3.d r4 = r1.f4606Z
            r24 = r4
            r4 = 0
            if (r0 == 0) goto L125
            O3.X r0 = r1.b()
            O3.V r0 = r0.t()
            O3.W r2 = O3.X.w(r13)
            O3.Q r3 = r3.m()
            java.lang.String r3 = r3.a(r12)
            java.lang.String r5 = "Dropping blocked event. appId"
            r0.d(r2, r3, r5)
            O3.l0 r0 = r1.e0()
            java.lang.String r2 = "measurement.upload.blacklist_internal"
            java.lang.String r0 = r0.a(r13, r2)
            java.lang.String r2 = "1"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lb4
            O3.l0 r0 = r1.e0()
            java.lang.String r3 = "measurement.upload.blacklist_public"
            java.lang.String r0 = r0.a(r13, r3)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb6
        Lb4:
            r12 = r13
            goto Lcd
        Lb6:
            boolean r0 = r14.equals(r12)
            if (r0 != 0) goto L124
            r1.j0()
            java.lang.String r27 = "_ev"
            r29 = 0
            r26 = 11
            r28 = r12
            r25 = r13
            O3.Y1.E(r24, r25, r26, r27, r28, r29)
            return
        Lcd:
            O3.n r0 = r1.f0()
            O3.c0 r0 = r0.s0(r12)
            if (r0 == 0) goto L124
            O3.t0 r2 = r0.f4793a
            O3.p0 r3 = r2.f5078w
            O3.C0323t0.l(r3)
            r3.o()
            long r5 = r0.f4792S
            O3.p0 r2 = r2.f5078w
            O3.C0323t0.l(r2)
            r2.o()
            long r2 = r0.f4791R
            long r2 = java.lang.Math.max(r5, r2)
            B3.a r5 = r1.e()
            r5.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r2
            long r2 = java.lang.Math.abs(r5)
            r1.d0()
            O3.E r5 = O3.F.f4387N
            java.lang.Object r4 = r5.a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L124
            O3.X r2 = r1.b()
            O3.V r2 = r2.u()
            java.lang.String r3 = "Fetching config for blocked app"
            r2.b(r3)
            r1.y(r0)
        L124:
            return
        L125:
            r12 = r13
            r13 = r24
            O3.Y r0 = O3.Y.c(r60)
            O3.Y1 r4 = r1.j0()
            r31 = r13
            O3.g r13 = r1.d0()
            r13.getClass()
            r48 = r3
            O3.E r3 = O3.F.f4406X
            int r3 = r13.w(r12, r3)
            r13 = 100
            int r3 = java.lang.Math.min(r3, r13)
            r13 = 25
            int r3 = java.lang.Math.max(r3, r13)
            r4.x(r0, r3)
            O3.g r3 = r1.d0()
            O3.E r4 = O3.F.f4430g0
            r13 = 35
            int r3 = r3.w(r12, r4)
            int r3 = java.lang.Math.min(r3, r13)
            r4 = 10
            int r3 = java.lang.Math.max(r3, r4)
            java.lang.Object r4 = r0.f4683e
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.util.TreeSet r13 = new java.util.TreeSet
            r49 = r9
            java.util.Set r9 = r4.keySet()
            r13.<init>(r9)
            java.util.Iterator r9 = r13.iterator()
        L179:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L199
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r13 = "items"
            boolean r13 = r13.equals(r10)
            if (r13 == 0) goto L179
            O3.Y1 r13 = r1.j0()
            android.os.Parcelable[] r10 = r4.getParcelableArray(r10)
            r13.y(r10, r3)
            goto L179
        L199:
            O3.v r3 = r0.e()
            O3.u r4 = r3.f5092r
            java.lang.String r9 = r3.f5091q
            O3.X r0 = r1.b()
            java.lang.String r0 = r0.y()
            r10 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r10)
            if (r0 == 0) goto L1c5
            O3.X r0 = r1.b()
            O3.V r0 = r0.v()
            O3.Q r10 = r48.m()
            java.lang.String r10 = r10.d(r3)
            java.lang.String r13 = "Logging event"
            r0.c(r10, r13)
        L1c5:
            O3.n r0 = r1.f0()
            r0.c0()
            r1.a0(r2)     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r0 = "ecommerce_purchase"
            boolean r0 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r10 = "refund"
            if (r0 != 0) goto L1e7
            java.lang.String r0 = "purchase"
            boolean r0 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1eb
            if (r0 != 0) goto L1e7
            boolean r0 = r10.equals(r9)     // Catch: java.lang.Throwable -> L1eb
            if (r0 == 0) goto L1e9
        L1e7:
            r0 = 1
            goto L1ef
        L1e9:
            r0 = 0
            goto L1ef
        L1eb:
            r0 = move-exception
            r5 = r1
            goto Lcb4
        L1ef:
            java.lang.String r13 = "_iap"
            boolean r13 = r13.equals(r9)     // Catch: java.lang.Throwable -> L1eb
            r24 = r13
            java.lang.String r13 = "value"
            if (r24 != 0) goto L1fe
            if (r0 == 0) goto L201
            r0 = 1
        L1fe:
            r51 = r11
            goto L20f
        L201:
            r53 = r5
            r54 = r6
            r51 = r11
            r25 = r12
            r52 = r15
        L20b:
            r5 = r31
            goto L36c
        L20f:
            java.lang.String r11 = "_ltv_"
            r52 = r15
            java.lang.String r15 = r4.b0()     // Catch: java.lang.Throwable -> L1eb
            r53 = r5
            android.os.Bundle r5 = r4.f5085q
            if (r0 == 0) goto L274
            java.lang.Double r0 = r4.a0()     // Catch: java.lang.Throwable -> L1eb
            double r24 = r0.doubleValue()     // Catch: java.lang.Throwable -> L1eb
            r26 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r24 = r24 * r26
            r28 = 0
            int r0 = (r24 > r28 ? 1 : (r24 == r28 ? 0 : -1))
            if (r0 != 0) goto L23c
            r54 = r6
            long r5 = r5.getLong(r13)     // Catch: java.lang.Throwable -> L1eb
            double r5 = (double) r5     // Catch: java.lang.Throwable -> L1eb
            double r24 = r5 * r26
            goto L23e
        L23c:
            r54 = r6
        L23e:
            r5 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r0 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r0 > 0) goto L256
            r5 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r0 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r0 < 0) goto L256
            long r5 = java.lang.Math.round(r24)     // Catch: java.lang.Throwable -> L1eb
            boolean r0 = r10.equals(r9)     // Catch: java.lang.Throwable -> L1eb
            if (r0 == 0) goto L27a
            long r5 = -r5
            goto L27a
        L256:
            O3.X r0 = r1.b()     // Catch: java.lang.Throwable -> L1eb
            O3.V r0 = r0.t()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r2 = "Data lost. Currency value is too big. appId"
            O3.W r3 = O3.X.w(r12)     // Catch: java.lang.Throwable -> L1eb
            java.lang.Double r4 = java.lang.Double.valueOf(r24)     // Catch: java.lang.Throwable -> L1eb
            r0.d(r3, r4, r2)     // Catch: java.lang.Throwable -> L1eb
            O3.n r0 = r1.f0()     // Catch: java.lang.Throwable -> L1eb
            r0.d0()     // Catch: java.lang.Throwable -> L1eb
            goto L62a
        L274:
            r54 = r6
            long r5 = r5.getLong(r13)     // Catch: java.lang.Throwable -> L1eb
        L27a:
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Throwable -> L1eb
            if (r0 != 0) goto L368
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r0 = r15.toUpperCase(r0)     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r10 = "[A-Z]{3}"
            boolean r10 = r0.matches(r10)     // Catch: java.lang.Throwable -> L1eb
            if (r10 == 0) goto L368
            java.lang.String r10 = r11.concat(r0)     // Catch: java.lang.Throwable -> L1eb
            O3.n r0 = r1.f0()     // Catch: java.lang.Throwable -> L1eb
            O3.W1 r0 = r0.k0(r12, r10)     // Catch: java.lang.Throwable -> L1eb
            if (r0 == 0) goto L2a2
            java.lang.Object r0 = r0.f4661e     // Catch: java.lang.Throwable -> L1eb
            boolean r11 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L1eb
            if (r11 != 0) goto L2a5
        L2a2:
            r27 = r10
            goto L2d2
        L2a5:
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L1eb
            long r24 = r0.longValue()     // Catch: java.lang.Throwable -> L1eb
            r25 = r24
            O3.W1 r24 = new O3.W1     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r0 = r3.f5093s     // Catch: java.lang.Throwable -> L1eb
            B3.a r11 = r1.e()     // Catch: java.lang.Throwable -> L1eb
            r11.getClass()     // Catch: java.lang.Throwable -> L1eb
            long r28 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1eb
            long r5 = r25 + r5
            java.lang.Long r30 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L1eb
            r26 = r0
            r27 = r10
            r25 = r12
            r24.<init>(r25, r26, r27, r28, r30)     // Catch: java.lang.Throwable -> L1eb
            r12 = r25
            r25 = r12
        L2cf:
            r0 = r24
            goto L32e
        L2d2:
            O3.n r10 = r1.f0()     // Catch: java.lang.Throwable -> L1eb
            O3.g r0 = r1.d0()     // Catch: java.lang.Throwable -> L1eb
            O3.E r11 = O3.F.f4399T     // Catch: java.lang.Throwable -> L1eb
            int r0 = r0.w(r12, r11)     // Catch: java.lang.Throwable -> L1eb
            int r0 = r0 + (-1)
            x3.AbstractC1887A.d(r12)     // Catch: java.lang.Throwable -> L1eb
            r10.o()     // Catch: java.lang.Throwable -> L1eb
            r10.p()     // Catch: java.lang.Throwable -> L1eb
            android.database.sqlite.SQLiteDatabase r11 = r10.f0()     // Catch: java.lang.Throwable -> L1eb android.database.sqlite.SQLiteException -> L2fd
            java.lang.String r15 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L1eb android.database.sqlite.SQLiteException -> L2fd
            java.lang.String[] r0 = new java.lang.String[]{r12, r12, r0}     // Catch: java.lang.Throwable -> L1eb android.database.sqlite.SQLiteException -> L2fd
            r11.execSQL(r15, r0)     // Catch: java.lang.Throwable -> L1eb android.database.sqlite.SQLiteException -> L2fd
            goto L313
        L2fd:
            r0 = move-exception
            java.lang.Object r10 = r10.f4346r     // Catch: java.lang.Throwable -> L1eb
            O3.t0 r10 = (O3.C0323t0) r10     // Catch: java.lang.Throwable -> L1eb
            O3.X r10 = r10.b()     // Catch: java.lang.Throwable -> L1eb
            O3.V r10 = r10.s()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r11 = "Error pruning currencies. appId"
            O3.W r15 = O3.X.w(r12)     // Catch: java.lang.Throwable -> L1eb
            r10.d(r15, r0, r11)     // Catch: java.lang.Throwable -> L1eb
        L313:
            O3.W1 r24 = new O3.W1     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r0 = r3.f5093s     // Catch: java.lang.Throwable -> L1eb
            B3.a r10 = r1.e()     // Catch: java.lang.Throwable -> L1eb
            r10.getClass()     // Catch: java.lang.Throwable -> L1eb
            long r28 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1eb
            java.lang.Long r30 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L1eb
            r26 = r0
            r25 = r12
            r24.<init>(r25, r26, r27, r28, r30)     // Catch: java.lang.Throwable -> L1eb
            goto L2cf
        L32e:
            O3.n r5 = r1.f0()     // Catch: java.lang.Throwable -> L1eb
            boolean r5 = r5.j0(r0)     // Catch: java.lang.Throwable -> L1eb
            if (r5 != 0) goto L20b
            O3.X r5 = r1.b()     // Catch: java.lang.Throwable -> L1eb
            O3.V r5 = r5.s()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r6 = "Too many unique user properties are set. Ignoring user property. appId"
            O3.W r10 = O3.X.w(r25)     // Catch: java.lang.Throwable -> L1eb
            O3.Q r11 = r48.m()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r12 = r0.f4659c     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r11 = r11.c(r12)     // Catch: java.lang.Throwable -> L1eb
            java.lang.Object r0 = r0.f4661e     // Catch: java.lang.Throwable -> L1eb
            r5.e(r6, r10, r11, r0)     // Catch: java.lang.Throwable -> L1eb
            r1.j0()     // Catch: java.lang.Throwable -> L1eb
            r28 = 0
            r29 = 0
            r26 = 9
            r27 = 0
            r24 = r31
            O3.Y1.E(r24, r25, r26, r27, r28, r29)     // Catch: java.lang.Throwable -> L1eb
            r5 = r24
            goto L36c
        L368:
            r25 = r12
            goto L20b
        L36c:
            boolean r31 = O3.Y1.m0(r9)     // Catch: java.lang.Throwable -> L1eb
            boolean r33 = r14.equals(r9)     // Catch: java.lang.Throwable -> L1eb
            r1.j0()     // Catch: java.lang.Throwable -> L1eb
            if (r4 != 0) goto L37e
            r14 = 0
        L37b:
            r55 = 0
            goto L3a9
        L37e:
            android.os.Bundle r0 = r4.f5085q     // Catch: java.lang.Throwable -> L1eb
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L1eb
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1eb
            r14 = 0
        L38a:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L1eb
            if (r6 == 0) goto L37b
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L1eb
            java.lang.Object r6 = r4.W(r6)     // Catch: java.lang.Throwable -> L1eb
            boolean r12 = r6 instanceof android.os.Parcelable[]     // Catch: java.lang.Throwable -> L1eb
            if (r12 == 0) goto L3a6
            android.os.Parcelable[] r6 = (android.os.Parcelable[]) r6     // Catch: java.lang.Throwable -> L1eb
            int r6 = r6.length     // Catch: java.lang.Throwable -> L1eb
            r55 = 0
            long r10 = (long) r6     // Catch: java.lang.Throwable -> L1eb
            long r14 = r14 + r10
            goto L38a
        L3a6:
            r55 = 0
            goto L38a
        L3a9:
            r10 = 1
            long r28 = r14 + r10
            O3.n r24 = r1.f0()     // Catch: java.lang.Throwable -> L1eb
            r27 = r25
            long r25 = r1.f()     // Catch: java.lang.Throwable -> L1eb
            r35 = 0
            r36 = 0
            r30 = 1
            r32 = 0
            r34 = 0
            O3.j r0 = r24.v0(r25, r27, r28, r30, r31, r32, r33, r34, r35, r36)     // Catch: java.lang.Throwable -> L1eb
            r25 = r27
            r6 = r31
            long r14 = r0.f4918b     // Catch: java.lang.Throwable -> L1eb
            r1.d0()     // Catch: java.lang.Throwable -> L1eb
            O3.E r12 = O3.F.f4441l     // Catch: java.lang.Throwable -> L1eb
            r57 = r10
            r10 = 0
            java.lang.Object r11 = r12.a(r10)     // Catch: java.lang.Throwable -> L1eb
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.Throwable -> L1eb
            int r10 = r11.intValue()     // Catch: java.lang.Throwable -> L1eb
            long r10 = (long) r10     // Catch: java.lang.Throwable -> L1eb
            long r14 = r14 - r10
            int r10 = (r14 > r55 ? 1 : (r14 == r55 ? 0 : -1))
            r11 = 1000(0x3e8, double:4.94E-321)
            if (r10 <= 0) goto L40a
            long r14 = r14 % r11
            int r2 = (r14 > r57 ? 1 : (r14 == r57 ? 0 : -1))
            if (r2 != 0) goto L401
            O3.X r2 = r1.b()     // Catch: java.lang.Throwable -> L1eb
            O3.V r2 = r2.s()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            O3.W r4 = O3.X.w(r25)     // Catch: java.lang.Throwable -> L1eb
            long r5 = r0.f4918b     // Catch: java.lang.Throwable -> L1eb
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L1eb
            r2.d(r4, r0, r3)     // Catch: java.lang.Throwable -> L1eb
        L401:
            O3.n r0 = r1.f0()     // Catch: java.lang.Throwable -> L1eb
            r0.d0()     // Catch: java.lang.Throwable -> L1eb
            goto L62a
        L40a:
            if (r6 == 0) goto L45e
            long r14 = r0.f4917a     // Catch: java.lang.Throwable -> L1eb
            r1.d0()     // Catch: java.lang.Throwable -> L1eb
            O3.E r10 = O3.F.f4445n     // Catch: java.lang.Throwable -> L1eb
            r26 = r11
            r11 = 0
            java.lang.Object r10 = r10.a(r11)     // Catch: java.lang.Throwable -> L1eb
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Throwable -> L1eb
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L1eb
            long r10 = (long) r10     // Catch: java.lang.Throwable -> L1eb
            long r14 = r14 - r10
            int r10 = (r14 > r55 ? 1 : (r14 == r55 ? 0 : -1))
            if (r10 <= 0) goto L45e
            long r14 = r14 % r26
            int r2 = (r14 > r57 ? 1 : (r14 == r57 ? 0 : -1))
            if (r2 != 0) goto L443
            O3.X r2 = r1.b()     // Catch: java.lang.Throwable -> L1eb
            O3.V r2 = r2.s()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            O3.W r6 = O3.X.w(r25)     // Catch: java.lang.Throwable -> L1eb
            long r7 = r0.f4917a     // Catch: java.lang.Throwable -> L1eb
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L1eb
            r2.d(r6, r0, r4)     // Catch: java.lang.Throwable -> L1eb
        L443:
            r1.j0()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r27 = "_ev"
            java.lang.String r0 = r3.f5091q     // Catch: java.lang.Throwable -> L1eb
            r29 = 0
            r26 = 16
            r28 = r0
            r24 = r5
            O3.Y1.E(r24, r25, r26, r27, r28, r29)     // Catch: java.lang.Throwable -> L1eb
            O3.n r0 = r1.f0()     // Catch: java.lang.Throwable -> L1eb
            r0.d0()     // Catch: java.lang.Throwable -> L1eb
            goto L62a
        L45e:
            r12 = r25
            if (r33 == 0) goto L4a4
            long r14 = r0.f4920d     // Catch: java.lang.Throwable -> L1eb
            O3.g r11 = r1.d0()     // Catch: java.lang.Throwable -> L1eb
            O3.E r10 = O3.F.f4443m     // Catch: java.lang.Throwable -> L1eb
            int r10 = r11.w(r12, r10)     // Catch: java.lang.Throwable -> L1eb
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch: java.lang.Throwable -> L1eb
            r11 = 0
            int r10 = java.lang.Math.max(r11, r10)     // Catch: java.lang.Throwable -> L1eb
            long r10 = (long) r10     // Catch: java.lang.Throwable -> L1eb
            long r14 = r14 - r10
            int r10 = (r14 > r55 ? 1 : (r14 == r55 ? 0 : -1))
            if (r10 <= 0) goto L4a4
            int r2 = (r14 > r57 ? 1 : (r14 == r57 ? 0 : -1))
            if (r2 != 0) goto L49b
            O3.X r2 = r1.b()     // Catch: java.lang.Throwable -> L1eb
            O3.V r2 = r2.s()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r3 = "Too many error events logged. appId, count"
            O3.W r4 = O3.X.w(r12)     // Catch: java.lang.Throwable -> L1eb
            long r5 = r0.f4920d     // Catch: java.lang.Throwable -> L1eb
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L1eb
            r2.d(r4, r0, r3)     // Catch: java.lang.Throwable -> L1eb
        L49b:
            O3.n r0 = r1.f0()     // Catch: java.lang.Throwable -> L1eb
            r0.d0()     // Catch: java.lang.Throwable -> L1eb
            goto L62a
        L4a4:
            android.os.Bundle r4 = r4.c0()     // Catch: java.lang.Throwable -> L1eb
            O3.Y1 r0 = r1.j0()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r10 = "_o"
            java.lang.String r11 = r3.f5093s     // Catch: java.lang.Throwable -> L1eb
            r0.D(r4, r10, r11)     // Catch: java.lang.Throwable -> L1eb
            O3.Y1 r0 = r1.j0()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r10 = r2.f4725R     // Catch: java.lang.Throwable -> L1eb
            boolean r0 = r0.O(r12, r10)     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r10 = "_r"
            if (r0 == 0) goto L4d5
            O3.Y1 r0 = r1.j0()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r14 = "_dbg"
            java.lang.Long r15 = java.lang.Long.valueOf(r57)     // Catch: java.lang.Throwable -> L1eb
            r0.D(r4, r14, r15)     // Catch: java.lang.Throwable -> L1eb
            O3.Y1 r0 = r1.j0()     // Catch: java.lang.Throwable -> L1eb
            r0.D(r4, r10, r15)     // Catch: java.lang.Throwable -> L1eb
        L4d5:
            java.lang.String r0 = "_s"
            boolean r0 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1eb
            if (r0 == 0) goto L4f4
            O3.n r0 = r1.f0()     // Catch: java.lang.Throwable -> L1eb
            O3.W1 r0 = r0.k0(r12, r8)     // Catch: java.lang.Throwable -> L1eb
            if (r0 == 0) goto L4f4
            java.lang.Object r0 = r0.f4661e     // Catch: java.lang.Throwable -> L1eb
            boolean r14 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L1eb
            if (r14 == 0) goto L4f4
            O3.Y1 r14 = r1.j0()     // Catch: java.lang.Throwable -> L1eb
            r14.D(r4, r8, r0)     // Catch: java.lang.Throwable -> L1eb
        L4f4:
            O3.g r0 = r1.d0()     // Catch: java.lang.Throwable -> L1eb
            O3.E r8 = O3.F.f4407X0     // Catch: java.lang.Throwable -> L1eb
            r14 = 0
            boolean r0 = r0.y(r14, r8)     // Catch: java.lang.Throwable -> L1eb
            if (r0 == 0) goto L525
            java.lang.String r0 = "am"
            boolean r0 = java.util.Objects.equals(r11, r0)     // Catch: java.lang.Throwable -> L1eb
            if (r0 == 0) goto L525
            java.lang.String r0 = "_ai"
            boolean r0 = r9.equals(r0)     // Catch: java.lang.Throwable -> L1eb
            if (r0 == 0) goto L525
            java.lang.Object r0 = r4.get(r13)     // Catch: java.lang.Throwable -> L1eb
            boolean r8 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1eb
            if (r8 == 0) goto L525
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L525
            double r8 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L525
            r4.remove(r13)     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L525
            r4.putDouble(r13, r8)     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L525
        L525:
            O3.n r8 = r1.f0()     // Catch: java.lang.Throwable -> L1eb
            x3.AbstractC1887A.d(r12)     // Catch: java.lang.Throwable -> L1eb
            r8.o()     // Catch: java.lang.Throwable -> L1eb
            r8.p()     // Catch: java.lang.Throwable -> L1eb
            android.database.sqlite.SQLiteDatabase r0 = r8.f0()     // Catch: java.lang.Throwable -> L1eb android.database.sqlite.SQLiteException -> L55e
            java.lang.Object r9 = r8.f4346r     // Catch: java.lang.Throwable -> L1eb android.database.sqlite.SQLiteException -> L55e
            O3.t0 r9 = (O3.C0323t0) r9     // Catch: java.lang.Throwable -> L1eb android.database.sqlite.SQLiteException -> L55e
            O3.g r9 = r9.f5075t     // Catch: java.lang.Throwable -> L1eb android.database.sqlite.SQLiteException -> L55e
            O3.E r11 = O3.F.f4451q     // Catch: java.lang.Throwable -> L1eb android.database.sqlite.SQLiteException -> L55e
            int r9 = r9.w(r12, r11)     // Catch: java.lang.Throwable -> L1eb android.database.sqlite.SQLiteException -> L55e
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r9 = java.lang.Math.min(r11, r9)     // Catch: java.lang.Throwable -> L1eb android.database.sqlite.SQLiteException -> L55e
            r11 = 0
            int r9 = java.lang.Math.max(r11, r9)     // Catch: java.lang.Throwable -> L1eb android.database.sqlite.SQLiteException -> L55e
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L1eb android.database.sqlite.SQLiteException -> L55e
            java.lang.String r11 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            java.lang.String[] r9 = new java.lang.String[]{r12, r9}     // Catch: java.lang.Throwable -> L1eb android.database.sqlite.SQLiteException -> L55e
            int r0 = r0.delete(r7, r11, r9)     // Catch: java.lang.Throwable -> L1eb android.database.sqlite.SQLiteException -> L55e
            long r8 = (long) r0
            goto L576
        L55e:
            r0 = move-exception
            java.lang.Object r8 = r8.f4346r     // Catch: java.lang.Throwable -> L1eb
            O3.t0 r8 = (O3.C0323t0) r8     // Catch: java.lang.Throwable -> L1eb
            O3.X r8 = r8.b()     // Catch: java.lang.Throwable -> L1eb
            O3.V r8 = r8.s()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r9 = "Error deleting over the limit events. appId"
            O3.W r11 = O3.X.w(r12)     // Catch: java.lang.Throwable -> L1eb
            r8.d(r11, r0, r9)     // Catch: java.lang.Throwable -> L1eb
            r8 = r55
        L576:
            int r0 = (r8 > r55 ? 1 : (r8 == r55 ? 0 : -1))
            if (r0 <= 0) goto L58f
            O3.X r0 = r1.b()     // Catch: java.lang.Throwable -> L1eb
            O3.V r0 = r0.t()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r11 = "Data lost. Too many events stored on disk, deleted. appId"
            O3.W r13 = O3.X.w(r12)     // Catch: java.lang.Throwable -> L1eb
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L1eb
            r0.d(r13, r8, r11)     // Catch: java.lang.Throwable -> L1eb
        L58f:
            O3.r r24 = new O3.r     // Catch: java.lang.Throwable -> L1eb
            O3.t0 r0 = r1.f4582B     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r8 = r3.f5093s     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r9 = r3.f5091q     // Catch: java.lang.Throwable -> L1eb
            long r13 = r3.f5094t     // Catch: java.lang.Throwable -> L1eb
            r31 = 0
            r25 = r0
            r33 = r4
            r26 = r8
            r28 = r9
            r27 = r12
            r29 = r13
            r24.<init>(r25, r26, r27, r28, r29, r31, r33)     // Catch: java.lang.Throwable -> L1eb
            r0 = r24
            r3 = r25
            O3.n r4 = r1.f0()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r8 = r0.f5032b     // Catch: java.lang.Throwable -> L1eb
            r9 = r54
            O3.s r4 = r4.O(r9, r12, r8)     // Catch: java.lang.Throwable -> L1eb
            if (r4 != 0) goto L657
            O3.n r4 = r1.f0()     // Catch: java.lang.Throwable -> L1eb
            long r13 = r4.G(r12)     // Catch: java.lang.Throwable -> L1eb
            O3.g r4 = r1.d0()     // Catch: java.lang.Throwable -> L1eb
            r4.getClass()     // Catch: java.lang.Throwable -> L1eb
            O3.E r11 = O3.F.f4404W     // Catch: java.lang.Throwable -> L1eb
            int r4 = r4.w(r12, r11)     // Catch: java.lang.Throwable -> L1eb
            r15 = 2000(0x7d0, float:2.803E-42)
            int r4 = java.lang.Math.min(r4, r15)     // Catch: java.lang.Throwable -> L1eb
            r15 = 500(0x1f4, float:7.0E-43)
            int r4 = java.lang.Math.max(r4, r15)     // Catch: java.lang.Throwable -> L1eb
            r31 = r5
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L1eb
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 < 0) goto L632
            if (r6 == 0) goto L632
            O3.X r0 = r1.b()     // Catch: java.lang.Throwable -> L1eb
            O3.V r0 = r0.s()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r2 = "Too many event names used, ignoring event. appId, name, supported count"
            O3.W r4 = O3.X.w(r12)     // Catch: java.lang.Throwable -> L1eb
            O3.Q r3 = r3.m()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r3 = r3.a(r8)     // Catch: java.lang.Throwable -> L1eb
            O3.g r5 = r1.d0()     // Catch: java.lang.Throwable -> L1eb
            r5.getClass()     // Catch: java.lang.Throwable -> L1eb
            int r5 = r5.w(r12, r11)     // Catch: java.lang.Throwable -> L1eb
            r6 = 2000(0x7d0, float:2.803E-42)
            int r5 = java.lang.Math.min(r5, r6)     // Catch: java.lang.Throwable -> L1eb
            int r5 = java.lang.Math.max(r5, r15)     // Catch: java.lang.Throwable -> L1eb
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L1eb
            r0.e(r2, r4, r3, r5)     // Catch: java.lang.Throwable -> L1eb
            r1.j0()     // Catch: java.lang.Throwable -> L1eb
            r28 = 0
            r29 = 0
            r26 = 8
            r27 = 0
            r25 = r12
            r24 = r31
            O3.Y1.E(r24, r25, r26, r27, r28, r29)     // Catch: java.lang.Throwable -> L1eb
        L62a:
            O3.n r0 = r1.f0()
            r0.e0()
            return
        L632:
            r25 = r12
            r5 = r31
            O3.s r24 = new O3.s     // Catch: java.lang.Throwable -> L1eb
            long r3 = r0.f5034d     // Catch: java.lang.Throwable -> L1eb
            r39 = 0
            r40 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r33 = r3
            r26 = r8
            r24.<init>(r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40)     // Catch: java.lang.Throwable -> L1eb
            r12 = r25
        L653:
            r3 = r0
            r0 = r24
            goto L664
        L657:
            long r13 = r4.f     // Catch: java.lang.Throwable -> L1eb
            O3.r r0 = r0.a(r3, r13)     // Catch: java.lang.Throwable -> L1eb
            long r13 = r0.f5034d     // Catch: java.lang.Throwable -> L1eb
            O3.s r24 = r4.a(r13)     // Catch: java.lang.Throwable -> L1eb
            goto L653
        L664:
            O3.n r4 = r1.f0()     // Catch: java.lang.Throwable -> L1eb
            r4.P(r9, r0)     // Catch: java.lang.Throwable -> L1eb
            O3.p0 r0 = r1.c()     // Catch: java.lang.Throwable -> L1eb
            r0.o()     // Catch: java.lang.Throwable -> L1eb
            r1.k0()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r0 = r3.f5031a     // Catch: java.lang.Throwable -> L1eb
            x3.AbstractC1887A.d(r0)     // Catch: java.lang.Throwable -> L1eb
            boolean r0 = r0.equals(r12)     // Catch: java.lang.Throwable -> L1eb
            x3.AbstractC1887A.a(r0)     // Catch: java.lang.Throwable -> L1eb
            com.google.android.gms.internal.measurement.r1 r4 = com.google.android.gms.internal.measurement.C0859s1.U()     // Catch: java.lang.Throwable -> L1eb
            r4.y()     // Catch: java.lang.Throwable -> L1eb
            r4.j()     // Catch: java.lang.Throwable -> L1eb
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L1eb
            if (r0 != 0) goto L694
            r4.p(r12)     // Catch: java.lang.Throwable -> L1eb
        L694:
            boolean r0 = android.text.TextUtils.isEmpty(r53)     // Catch: java.lang.Throwable -> L1eb
            if (r0 != 0) goto L6a0
            r6 = r53
            r4.n(r6)     // Catch: java.lang.Throwable -> L1eb
            goto L6a2
        L6a0:
            r6 = r53
        L6a2:
            boolean r0 = android.text.TextUtils.isEmpty(r52)     // Catch: java.lang.Throwable -> L1eb
            if (r0 != 0) goto L6ae
            r8 = r52
            r4.q(r8)     // Catch: java.lang.Throwable -> L1eb
            goto L6b0
        L6ae:
            r8 = r52
        L6b0:
            boolean r0 = android.text.TextUtils.isEmpty(r51)     // Catch: java.lang.Throwable -> L1eb
            if (r0 != 0) goto L6bc
            r9 = r51
            r4.R(r9)     // Catch: java.lang.Throwable -> L1eb
            goto L6be
        L6bc:
            r9 = r51
        L6be:
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r49 > r13 ? 1 : (r49 == r13 ? 0 : -1))
            if (r0 == 0) goto L6d1
            r13 = r49
            int r0 = (int) r13     // Catch: java.lang.Throwable -> L1eb
            r4.L(r0)     // Catch: java.lang.Throwable -> L1eb
        L6cb:
            r53 = r6
            r11 = r7
            r6 = r46
            goto L6d4
        L6d1:
            r13 = r49
            goto L6cb
        L6d4:
            r4.r(r6)     // Catch: java.lang.Throwable -> L1eb
            boolean r0 = android.text.TextUtils.isEmpty(r45)     // Catch: java.lang.Throwable -> L1eb
            if (r0 != 0) goto L6e3
            r15 = r45
            r4.H(r15)     // Catch: java.lang.Throwable -> L1eb
            goto L6e5
        L6e3:
            r15 = r45
        L6e5:
            x3.AbstractC1887A.g(r12)     // Catch: java.lang.Throwable -> L1eb
            O3.J0 r0 = r1.a(r12)     // Catch: java.lang.Throwable -> L1eb
            r46 = r6
            r51 = r9
            r24 = r11
            r11 = r44
            r9 = 100
            O3.J0 r6 = O3.J0.c(r9, r11)     // Catch: java.lang.Throwable -> L1eb
            O3.J0 r0 = r0.j(r6)     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r6 = r0.f()     // Catch: java.lang.Throwable -> L1eb
            r4.Q(r6)     // Catch: java.lang.Throwable -> L1eb
            com.google.android.gms.internal.measurement.Y3.a()     // Catch: java.lang.Throwable -> L1eb
            O3.g r6 = r1.d0()     // Catch: java.lang.Throwable -> L1eb
            O3.E r7 = O3.F.f4392P0     // Catch: java.lang.Throwable -> L1eb
            boolean r6 = r6.y(r12, r7)     // Catch: java.lang.Throwable -> L1eb
            O3.I0 r7 = O3.I0.AD_STORAGE
            if (r6 == 0) goto L7b6
            r1.j0()     // Catch: java.lang.Throwable -> L1eb
            boolean r6 = O3.Y1.K(r12)     // Catch: java.lang.Throwable -> L1eb
            if (r6 == 0) goto L7b6
            int r6 = r2.f4723P     // Catch: java.lang.Throwable -> L1eb
            r4.z(r6)     // Catch: java.lang.Throwable -> L1eb
            r49 = r13
            long r13 = r2.f4724Q     // Catch: java.lang.Throwable -> L1eb
            boolean r0 = r0.i(r7)     // Catch: java.lang.Throwable -> L1eb
            r25 = 32
            if (r0 != 0) goto L73a
            int r0 = (r13 > r55 ? 1 : (r13 == r55 ? 0 : -1))
            if (r0 == 0) goto L73a
            r27 = -2
            long r13 = r13 & r27
            long r13 = r13 | r25
        L73a:
            int r0 = (r13 > r57 ? 1 : (r13 == r57 ? 0 : -1))
            if (r0 != 0) goto L740
            r0 = 1
            goto L741
        L740:
            r0 = 0
        L741:
            r4.T(r0)     // Catch: java.lang.Throwable -> L1eb
            int r0 = (r13 > r55 ? 1 : (r13 == r55 ? 0 : -1))
            if (r0 != 0) goto L74a
            goto L7b8
        L74a:
            com.google.android.gms.internal.measurement.Z0 r0 = com.google.android.gms.internal.measurement.C0769a1.w()     // Catch: java.lang.Throwable -> L1eb
            long r27 = r13 & r57
            int r6 = (r27 > r55 ? 1 : (r27 == r55 ? 0 : -1))
            if (r6 == 0) goto L756
            r6 = 1
            goto L757
        L756:
            r6 = 0
        L757:
            r0.h(r6)     // Catch: java.lang.Throwable -> L1eb
            r27 = 2
            long r27 = r13 & r27
            int r6 = (r27 > r55 ? 1 : (r27 == r55 ? 0 : -1))
            if (r6 == 0) goto L764
            r6 = 1
            goto L765
        L764:
            r6 = 0
        L765:
            r0.i(r6)     // Catch: java.lang.Throwable -> L1eb
            r27 = 4
            long r27 = r13 & r27
            int r6 = (r27 > r55 ? 1 : (r27 == r55 ? 0 : -1))
            if (r6 == 0) goto L772
            r6 = 1
            goto L773
        L772:
            r6 = 0
        L773:
            r0.j(r6)     // Catch: java.lang.Throwable -> L1eb
            r27 = 8
            long r27 = r13 & r27
            int r6 = (r27 > r55 ? 1 : (r27 == r55 ? 0 : -1))
            if (r6 == 0) goto L780
            r6 = 1
            goto L781
        L780:
            r6 = 0
        L781:
            r0.k(r6)     // Catch: java.lang.Throwable -> L1eb
            r27 = 16
            long r27 = r13 & r27
            int r6 = (r27 > r55 ? 1 : (r27 == r55 ? 0 : -1))
            if (r6 == 0) goto L78e
            r6 = 1
            goto L78f
        L78e:
            r6 = 0
        L78f:
            r0.l(r6)     // Catch: java.lang.Throwable -> L1eb
            long r25 = r13 & r25
            int r6 = (r25 > r55 ? 1 : (r25 == r55 ? 0 : -1))
            if (r6 == 0) goto L79a
            r6 = 1
            goto L79b
        L79a:
            r6 = 0
        L79b:
            r0.m(r6)     // Catch: java.lang.Throwable -> L1eb
            r25 = 64
            long r13 = r13 & r25
            int r6 = (r13 > r55 ? 1 : (r13 == r55 ? 0 : -1))
            if (r6 == 0) goto L7a8
            r6 = 1
            goto L7a9
        L7a8:
            r6 = 0
        L7a9:
            r0.n(r6)     // Catch: java.lang.Throwable -> L1eb
            com.google.android.gms.internal.measurement.q2 r0 = r0.e()     // Catch: java.lang.Throwable -> L1eb
            com.google.android.gms.internal.measurement.a1 r0 = (com.google.android.gms.internal.measurement.C0769a1) r0     // Catch: java.lang.Throwable -> L1eb
            r4.A(r0)     // Catch: java.lang.Throwable -> L1eb
            goto L7b8
        L7b6:
            r49 = r13
        L7b8:
            int r0 = (r22 > r55 ? 1 : (r22 == r55 ? 0 : -1))
            if (r0 == 0) goto L7c3
            r13 = r22
            r4.w(r13)     // Catch: java.lang.Throwable -> L1eb
            r22 = r13
        L7c3:
            r13 = r18
            r4.O(r13)     // Catch: java.lang.Throwable -> L1eb
            O3.b0 r6 = r1.i0()     // Catch: java.lang.Throwable -> L1eb
            O3.T1 r0 = r6.f4510s     // Catch: java.lang.Throwable -> L1eb
            O3.t0 r0 = r0.f4582B     // Catch: java.lang.Throwable -> L1eb
            android.content.Context r0 = r0.d()     // Catch: java.lang.Throwable -> L1eb
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L1eb
            android.net.Uri r9 = com.google.android.gms.internal.measurement.S1.a()     // Catch: java.lang.Throwable -> L1eb
            r18 = r13
            E1.q r13 = E1.q.f1654r     // Catch: java.lang.Throwable -> L1eb
            com.google.android.gms.internal.measurement.M1 r0 = com.google.android.gms.internal.measurement.M1.a(r0, r9, r13)     // Catch: java.lang.Throwable -> L1eb
            if (r0 != 0) goto L7e9
            java.util.Map r0 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L1eb
            goto L7ed
        L7e9:
            java.util.Map r0 = r0.b()     // Catch: java.lang.Throwable -> L1eb
        L7ed:
            if (r0 == 0) goto L7f5
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1eb
            if (r9 == 0) goto L7fa
        L7f5:
            r52 = r8
        L7f7:
            r9 = 0
            goto L88a
        L7fa:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1eb
            r9.<init>()     // Catch: java.lang.Throwable -> L1eb
            O3.E r13 = O3.F.f4427f0     // Catch: java.lang.Throwable -> L1eb
            r14 = 0
            java.lang.Object r13 = r13.a(r14)     // Catch: java.lang.Throwable -> L1eb
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch: java.lang.Throwable -> L1eb
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> L1eb
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L1eb
            java.util.Iterator r14 = r0.iterator()     // Catch: java.lang.Throwable -> L1eb
        L814:
            boolean r0 = r14.hasNext()     // Catch: java.lang.Throwable -> L1eb
            if (r0 == 0) goto L880
            java.lang.Object r0 = r14.next()     // Catch: java.lang.Throwable -> L1eb
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L1eb
            java.lang.Object r25 = r0.getKey()     // Catch: java.lang.Throwable -> L1eb
            r26 = r14
            r14 = r25
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L1eb
            r52 = r8
            java.lang.String r8 = "measurement.id."
            boolean r8 = r14.startsWith(r8)     // Catch: java.lang.Throwable -> L1eb
            if (r8 == 0) goto L869
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L867
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L867
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L867
            if (r0 == 0) goto L869
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L867
            r9.add(r0)     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L867
            int r0 = r9.size()     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L867
            if (r0 < r13) goto L869
            java.lang.Object r0 = r6.f4346r     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L867
            O3.t0 r0 = (O3.C0323t0) r0     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L867
            O3.X r0 = r0.b()     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L867
            O3.V r0 = r0.t()     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L867
            java.lang.String r8 = "Too many experiment IDs. Number of IDs"
            int r14 = r9.size()     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L867
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L867
            r0.c(r14, r8)     // Catch: java.lang.Throwable -> L1eb java.lang.NumberFormatException -> L867
            goto L882
        L867:
            r0 = move-exception
            goto L86e
        L869:
            r14 = r26
            r8 = r52
            goto L814
        L86e:
            java.lang.Object r8 = r6.f4346r     // Catch: java.lang.Throwable -> L1eb
            O3.t0 r8 = (O3.C0323t0) r8     // Catch: java.lang.Throwable -> L1eb
            O3.X r8 = r8.b()     // Catch: java.lang.Throwable -> L1eb
            O3.V r8 = r8.t()     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r14 = "Experiment ID NumberFormatException"
            r8.c(r0, r14)     // Catch: java.lang.Throwable -> L1eb
            goto L869
        L880:
            r52 = r8
        L882:
            boolean r0 = r9.isEmpty()     // Catch: java.lang.Throwable -> L1eb
            if (r0 == 0) goto L88a
            goto L7f7
        L88a:
            if (r9 == 0) goto L88f
            r4.N(r9)     // Catch: java.lang.Throwable -> L1eb
        L88f:
            O3.g r0 = r1.d0()     // Catch: java.lang.Throwable -> L1eb
            O3.E r6 = O3.F.f4417b1     // Catch: java.lang.Throwable -> L1eb
            r14 = 0
            boolean r0 = r0.y(r14, r6)     // Catch: java.lang.Throwable -> L1eb
            if (r0 == 0) goto L89f
            r4.D()     // Catch: java.lang.Throwable -> L1eb
        L89f:
            O3.J0 r0 = r1.a(r12)     // Catch: java.lang.Throwable -> L1eb
            r9 = 100
            O3.J0 r6 = O3.J0.c(r9, r11)     // Catch: java.lang.Throwable -> L1eb
            O3.J0 r0 = r0.j(r6)     // Catch: java.lang.Throwable -> L1eb
            boolean r6 = r0.i(r7)     // Catch: java.lang.Throwable -> L1eb
            if (r6 == 0) goto L96b
            if (r17 == 0) goto L96b
            O3.y1 r6 = r1.f4615y     // Catch: java.lang.Throwable -> L944
            r6.getClass()     // Catch: java.lang.Throwable -> L944
            boolean r8 = r0.i(r7)     // Catch: java.lang.Throwable -> L944
            if (r8 == 0) goto L8c5
            android.util.Pair r6 = r6.s(r12)     // Catch: java.lang.Throwable -> L944
            goto L8ce
        L8c5:
            android.util.Pair r6 = new android.util.Pair     // Catch: java.lang.Throwable -> L944
            java.lang.String r8 = ""
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L944
            r6.<init>(r8, r9)     // Catch: java.lang.Throwable -> L944
        L8ce:
            java.lang.Object r8 = r6.first     // Catch: java.lang.Throwable -> L944
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch: java.lang.Throwable -> L944
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L944
            if (r8 != 0) goto L96b
            java.lang.Object r8 = r6.first     // Catch: java.lang.Throwable -> L944
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L944
            r4.t(r8)     // Catch: java.lang.Throwable -> L944
            java.lang.Object r8 = r6.second     // Catch: java.lang.Throwable -> L944
            if (r8 == 0) goto L8ec
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L1eb
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L1eb
            r4.u(r8)     // Catch: java.lang.Throwable -> L1eb
        L8ec:
            java.lang.String r8 = r3.f5032b     // Catch: java.lang.Throwable -> L944
            r9 = r21
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Throwable -> L944
            if (r8 != 0) goto L96b
            java.lang.Object r6 = r6.first     // Catch: java.lang.Throwable -> L944
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L944
            java.lang.String r8 = "00000000-0000-0000-0000-000000000000"
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Throwable -> L944
            if (r6 != 0) goto L96b
            O3.n r6 = r1.f0()     // Catch: java.lang.Throwable -> L944
            O3.c0 r6 = r6.s0(r12)     // Catch: java.lang.Throwable -> L944
            if (r6 == 0) goto L96b
            O3.t0 r8 = r6.f4793a     // Catch: java.lang.Throwable -> L944
            O3.p0 r8 = r8.f5078w     // Catch: java.lang.Throwable -> L944
            O3.C0323t0.l(r8)     // Catch: java.lang.Throwable -> L944
            r8.o()     // Catch: java.lang.Throwable -> L944
            boolean r8 = r6.f4814y     // Catch: java.lang.Throwable -> L944
            if (r8 == 0) goto L96b
            r11 = 0
            r14 = 0
            r1.u(r12, r11, r14, r14)     // Catch: java.lang.Throwable -> L944
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L944
            r8.<init>()     // Catch: java.lang.Throwable -> L944
            O3.t0 r11 = r6.f4793a     // Catch: java.lang.Throwable -> L944
            O3.p0 r11 = r11.f5078w     // Catch: java.lang.Throwable -> L944
            O3.C0323t0.l(r11)     // Catch: java.lang.Throwable -> L944
            r11.o()     // Catch: java.lang.Throwable -> L944
            java.lang.Long r11 = r6.f4815z     // Catch: java.lang.Throwable -> L944
            if (r11 == 0) goto L949
            java.lang.String r13 = "_pfo"
            r45 = r15
            long r14 = r11.longValue()     // Catch: java.lang.Throwable -> L944
            r1 = r55
            long r14 = java.lang.Math.max(r1, r14)     // Catch: java.lang.Throwable -> L944
            r8.putLong(r13, r14)     // Catch: java.lang.Throwable -> L944
            goto L94b
        L944:
            r0 = move-exception
            r5 = r59
            goto Lcb4
        L949:
            r45 = r15
        L94b:
            O3.t0 r1 = r6.f4793a     // Catch: java.lang.Throwable -> L944
            O3.p0 r1 = r1.f5078w     // Catch: java.lang.Throwable -> L944
            O3.C0323t0.l(r1)     // Catch: java.lang.Throwable -> L944
            r1.o()     // Catch: java.lang.Throwable -> L944
            java.lang.Long r1 = r6.f4774A     // Catch: java.lang.Throwable -> L944
            if (r1 == 0) goto L962
            java.lang.String r2 = "_uwa"
            long r13 = r1.longValue()     // Catch: java.lang.Throwable -> L944
            r8.putLong(r2, r13)     // Catch: java.lang.Throwable -> L944
        L962:
            r1 = r57
            r8.putLong(r10, r1)     // Catch: java.lang.Throwable -> L944
            r5.zza(r12, r9, r8)     // Catch: java.lang.Throwable -> L944
            goto L96d
        L96b:
            r45 = r15
        L96d:
            O3.q r1 = r48.p()     // Catch: java.lang.Throwable -> L944
            r1.q()     // Catch: java.lang.Throwable -> L944
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L944
            r4.k()     // Catch: java.lang.Throwable -> L944
            O3.q r1 = r48.p()     // Catch: java.lang.Throwable -> L944
            r1.q()     // Catch: java.lang.Throwable -> L944
            java.lang.String r1 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L944
            r4.b()     // Catch: java.lang.Throwable -> L944
            com.google.android.gms.internal.measurement.q2 r2 = r4.f11012r     // Catch: java.lang.Throwable -> L944
            com.google.android.gms.internal.measurement.s1 r2 = (com.google.android.gms.internal.measurement.C0859s1) r2     // Catch: java.lang.Throwable -> L944
            r2.o0(r1)     // Catch: java.lang.Throwable -> L944
            O3.q r1 = r48.p()     // Catch: java.lang.Throwable -> L944
            long r1 = r1.s()     // Catch: java.lang.Throwable -> L944
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L944
            r4.m(r1)     // Catch: java.lang.Throwable -> L944
            O3.q r1 = r48.p()     // Catch: java.lang.Throwable -> L944
            java.lang.String r1 = r1.t()     // Catch: java.lang.Throwable -> L944
            r4.l(r1)     // Catch: java.lang.Throwable -> L944
            r2 = r61
            long r5 = r2.f4720M     // Catch: java.lang.Throwable -> L944
            r4.S(r5)     // Catch: java.lang.Throwable -> L944
            boolean r1 = r48.a()     // Catch: java.lang.Throwable -> L944
            if (r1 == 0) goto L9c6
            r4.o()     // Catch: java.lang.Throwable -> L944
            r14 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L944
            if (r1 == 0) goto L9bb
            goto L9c6
        L9bb:
            r4.b()     // Catch: java.lang.Throwable -> L944
            com.google.android.gms.internal.measurement.q2 r0 = r4.f11012r     // Catch: java.lang.Throwable -> L944
            com.google.android.gms.internal.measurement.s1 r0 = (com.google.android.gms.internal.measurement.C0859s1) r0     // Catch: java.lang.Throwable -> L944
            r0.R0(r14)     // Catch: java.lang.Throwable -> L944
            throw r14     // Catch: java.lang.Throwable -> L944
        L9c6:
            O3.n r1 = r59.f0()     // Catch: java.lang.Throwable -> L944
            O3.c0 r1 = r1.s0(r12)     // Catch: java.lang.Throwable -> L944
            if (r1 != 0) goto La36
            O3.c0 r1 = new O3.c0     // Catch: java.lang.Throwable -> L944
            r5 = r48
            r1.<init>(r5, r12)     // Catch: java.lang.Throwable -> L944
            r5 = r59
            java.lang.String r6 = r5.o(r0)     // Catch: java.lang.Throwable -> L9fe
            r1.F(r6)     // Catch: java.lang.Throwable -> L9fe
            java.lang.String r2 = r2.f4708A     // Catch: java.lang.Throwable -> L9fe
            r1.K(r2)     // Catch: java.lang.Throwable -> L9fe
            r15 = r45
            r1.H(r15)     // Catch: java.lang.Throwable -> L9fe
            boolean r2 = r0.i(r7)     // Catch: java.lang.Throwable -> L9fe
            if (r2 == 0) goto L9fb
            O3.y1 r2 = r5.f4615y     // Catch: java.lang.Throwable -> L9fe
            r6 = r17
            java.lang.String r2 = r2.t(r12, r6)     // Catch: java.lang.Throwable -> L9fe
            r1.I(r2)     // Catch: java.lang.Throwable -> L9fe
        L9fb:
            r6 = 0
            goto La01
        L9fe:
            r0 = move-exception
            goto Lcb4
        La01:
            r1.e(r6)     // Catch: java.lang.Throwable -> L9fe
            r1.L(r6)     // Catch: java.lang.Throwable -> L9fe
            r1.M(r6)     // Catch: java.lang.Throwable -> L9fe
            r8 = r52
            r1.O(r8)     // Catch: java.lang.Throwable -> L9fe
            r13 = r49
            r1.Q(r13)     // Catch: java.lang.Throwable -> L9fe
            r6 = r53
            r1.R(r6)     // Catch: java.lang.Throwable -> L9fe
            r6 = r46
            r1.S(r6)     // Catch: java.lang.Throwable -> L9fe
            r13 = r22
            r1.a(r13)     // Catch: java.lang.Throwable -> L9fe
            r2 = r43
            r1.d(r2)     // Catch: java.lang.Throwable -> L9fe
            r13 = r18
            r1.c(r13)     // Catch: java.lang.Throwable -> L9fe
            O3.n r2 = r5.f0()     // Catch: java.lang.Throwable -> L9fe
            r11 = 0
            r2.t0(r1, r11)     // Catch: java.lang.Throwable -> L9fe
            goto La39
        La36:
            r11 = 0
            r5 = r59
        La39:
            O3.I0 r2 = O3.I0.ANALYTICS_STORAGE     // Catch: java.lang.Throwable -> L9fe
            boolean r0 = r0.i(r2)     // Catch: java.lang.Throwable -> L9fe
            if (r0 == 0) goto La55
            java.lang.String r0 = r1.E()     // Catch: java.lang.Throwable -> L9fe
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L9fe
            if (r0 != 0) goto La55
            java.lang.String r0 = r1.E()     // Catch: java.lang.Throwable -> L9fe
            x3.AbstractC1887A.g(r0)     // Catch: java.lang.Throwable -> L9fe
            r4.v(r0)     // Catch: java.lang.Throwable -> L9fe
        La55:
            java.lang.String r0 = r1.J()     // Catch: java.lang.Throwable -> L9fe
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L9fe
            if (r0 != 0) goto La69
            java.lang.String r0 = r1.J()     // Catch: java.lang.Throwable -> L9fe
            x3.AbstractC1887A.g(r0)     // Catch: java.lang.Throwable -> L9fe
            r4.K(r0)     // Catch: java.lang.Throwable -> L9fe
        La69:
            O3.n r0 = r5.f0()     // Catch: java.lang.Throwable -> L9fe
            java.util.List r0 = r0.l0(r12)     // Catch: java.lang.Throwable -> L9fe
            r2 = r11
        La72:
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L9fe
            if (r2 >= r6) goto Lb16
            com.google.android.gms.internal.measurement.A1 r6 = com.google.android.gms.internal.measurement.B1.A()     // Catch: java.lang.Throwable -> L9fe
            java.lang.Object r7 = r0.get(r2)     // Catch: java.lang.Throwable -> L9fe
            O3.W1 r7 = (O3.W1) r7     // Catch: java.lang.Throwable -> L9fe
            java.lang.String r7 = r7.f4659c     // Catch: java.lang.Throwable -> L9fe
            r6.b()     // Catch: java.lang.Throwable -> L9fe
            com.google.android.gms.internal.measurement.q2 r8 = r6.f11012r     // Catch: java.lang.Throwable -> L9fe
            com.google.android.gms.internal.measurement.B1 r8 = (com.google.android.gms.internal.measurement.B1) r8     // Catch: java.lang.Throwable -> L9fe
            r8.C(r7)     // Catch: java.lang.Throwable -> L9fe
            java.lang.Object r7 = r0.get(r2)     // Catch: java.lang.Throwable -> L9fe
            O3.W1 r7 = (O3.W1) r7     // Catch: java.lang.Throwable -> L9fe
            long r7 = r7.f4660d     // Catch: java.lang.Throwable -> L9fe
            r6.b()     // Catch: java.lang.Throwable -> L9fe
            com.google.android.gms.internal.measurement.q2 r9 = r6.f11012r     // Catch: java.lang.Throwable -> L9fe
            com.google.android.gms.internal.measurement.B1 r9 = (com.google.android.gms.internal.measurement.B1) r9     // Catch: java.lang.Throwable -> L9fe
            r9.B(r7)     // Catch: java.lang.Throwable -> L9fe
            O3.b0 r7 = r5.i0()     // Catch: java.lang.Throwable -> L9fe
            java.lang.Object r8 = r0.get(r2)     // Catch: java.lang.Throwable -> L9fe
            O3.W1 r8 = (O3.W1) r8     // Catch: java.lang.Throwable -> L9fe
            java.lang.Object r8 = r8.f4661e     // Catch: java.lang.Throwable -> L9fe
            r7.M(r6, r8)     // Catch: java.lang.Throwable -> L9fe
            r4.a0(r6)     // Catch: java.lang.Throwable -> L9fe
            java.lang.String r6 = "_sid"
            java.lang.Object r7 = r0.get(r2)     // Catch: java.lang.Throwable -> L9fe
            O3.W1 r7 = (O3.W1) r7     // Catch: java.lang.Throwable -> L9fe
            java.lang.String r7 = r7.f4659c     // Catch: java.lang.Throwable -> L9fe
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L9fe
            if (r6 == 0) goto Lb0e
            O3.t0 r6 = r1.f4793a     // Catch: java.lang.Throwable -> L9fe
            O3.p0 r6 = r6.f5078w     // Catch: java.lang.Throwable -> L9fe
            O3.C0323t0.l(r6)     // Catch: java.lang.Throwable -> L9fe
            r6.o()     // Catch: java.lang.Throwable -> L9fe
            long r6 = r1.f4812w     // Catch: java.lang.Throwable -> L9fe
            r55 = 0
            int r6 = (r6 > r55 ? 1 : (r6 == r55 ? 0 : -1))
            if (r6 == 0) goto Lb0e
            O3.b0 r6 = r5.i0()     // Catch: java.lang.Throwable -> L9fe
            boolean r7 = android.text.TextUtils.isEmpty(r51)     // Catch: java.lang.Throwable -> L9fe
            if (r7 == 0) goto Lae3
            r9 = r51
            r6 = 0
            goto Laf3
        Lae3:
            java.lang.String r7 = "UTF-8"
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)     // Catch: java.lang.Throwable -> L9fe
            r9 = r51
            byte[] r7 = r9.getBytes(r7)     // Catch: java.lang.Throwable -> L9fe
            long r6 = r6.Z(r7)     // Catch: java.lang.Throwable -> L9fe
        Laf3:
            O3.t0 r8 = r1.f4793a     // Catch: java.lang.Throwable -> L9fe
            O3.p0 r8 = r8.f5078w     // Catch: java.lang.Throwable -> L9fe
            O3.C0323t0.l(r8)     // Catch: java.lang.Throwable -> L9fe
            r8.o()     // Catch: java.lang.Throwable -> L9fe
            long r12 = r1.f4812w     // Catch: java.lang.Throwable -> L9fe
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 == 0) goto Lb10
            r4.b()     // Catch: java.lang.Throwable -> L9fe
            com.google.android.gms.internal.measurement.q2 r6 = r4.f11012r     // Catch: java.lang.Throwable -> L9fe
            com.google.android.gms.internal.measurement.s1 r6 = (com.google.android.gms.internal.measurement.C0859s1) r6     // Catch: java.lang.Throwable -> L9fe
            r6.Z0()     // Catch: java.lang.Throwable -> L9fe
            goto Lb10
        Lb0e:
            r9 = r51
        Lb10:
            int r2 = r2 + 1
            r51 = r9
            goto La72
        Lb16:
            O3.n r1 = r5.f0()     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            com.google.android.gms.internal.measurement.q2 r0 = r4.e()     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            r2 = r0
            com.google.android.gms.internal.measurement.s1 r2 = (com.google.android.gms.internal.measurement.C0859s1) r2     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            r1.o()     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            r1.p()     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            java.lang.String r0 = r2.p()     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            x3.AbstractC1887A.d(r0)     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            byte[] r0 = r2.a()     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            O3.T1 r6 = r1.f4510s     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            O3.b0 r6 = r6.i0()     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            long r6 = r6.Z(r0)     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            r8.<init>()     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            java.lang.String r9 = r2.p()     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            r12 = r16
            r8.put(r12, r9)     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            java.lang.Long r9 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            r15 = r20
            r8.put(r15, r9)     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            java.lang.String r9 = "metadata"
            r8.put(r9, r0)     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            android.database.sqlite.SQLiteDatabase r0 = r1.f0()     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51 android.database.sqlite.SQLiteException -> Lc53
            java.lang.String r9 = "raw_events_metadata"
            r13 = 4
            r14 = 0
            r0.insertWithOnConflict(r9, r14, r8, r13)     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51 android.database.sqlite.SQLiteException -> Lc53
            O3.n r1 = r5.f0()     // Catch: java.lang.Throwable -> L9fe
            O3.u r0 = r3.f     // Catch: java.lang.Throwable -> L9fe
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L9fe
            android.os.Bundle r0 = r0.f5085q     // Catch: java.lang.Throwable -> L9fe
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L9fe
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L9fe
        Lb76:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L9fe
            if (r2 == 0) goto Lb8a
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L9fe
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L9fe
            boolean r2 = r10.equals(r2)     // Catch: java.lang.Throwable -> L9fe
            if (r2 == 0) goto Lb76
        Lb88:
            r13 = 1
            goto Lbc3
        Lb8a:
            O3.l0 r0 = r5.e0()     // Catch: java.lang.Throwable -> L9fe
            java.lang.String r2 = r3.f5031a     // Catch: java.lang.Throwable -> L9fe
            java.lang.String r4 = r3.f5032b     // Catch: java.lang.Throwable -> L9fe
            boolean r0 = r0.E(r2, r4)     // Catch: java.lang.Throwable -> L9fe
            O3.n r16 = r5.f0()     // Catch: java.lang.Throwable -> L9fe
            long r17 = r5.f()     // Catch: java.lang.Throwable -> L9fe
            r22 = 0
            r23 = 0
            r20 = 0
            r21 = 0
            r19 = r2
            O3.j r2 = r16.u0(r17, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L9fe
            r4 = r19
            if (r0 == 0) goto Lbc2
            long r8 = r2.f4921e     // Catch: java.lang.Throwable -> L9fe
            O3.g r0 = r5.d0()     // Catch: java.lang.Throwable -> L9fe
            O3.E r2 = O3.F.f4449p     // Catch: java.lang.Throwable -> L9fe
            int r0 = r0.w(r4, r2)     // Catch: java.lang.Throwable -> L9fe
            long r13 = (long) r0     // Catch: java.lang.Throwable -> L9fe
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 >= 0) goto Lbc2
            goto Lb88
        Lbc2:
            r13 = r11
        Lbc3:
            r1.o()     // Catch: java.lang.Throwable -> L9fe
            r1.p()     // Catch: java.lang.Throwable -> L9fe
            java.lang.String r0 = r3.f5031a     // Catch: java.lang.Throwable -> L9fe
            x3.AbstractC1887A.d(r0)     // Catch: java.lang.Throwable -> L9fe
            O3.T1 r2 = r1.f4510s     // Catch: java.lang.Throwable -> L9fe
            O3.b0 r2 = r2.i0()     // Catch: java.lang.Throwable -> L9fe
            com.google.android.gms.internal.measurement.k1 r2 = r2.Q(r3)     // Catch: java.lang.Throwable -> L9fe
            byte[] r2 = r2.a()     // Catch: java.lang.Throwable -> L9fe
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L9fe
            r4.<init>()     // Catch: java.lang.Throwable -> L9fe
            r4.put(r12, r0)     // Catch: java.lang.Throwable -> L9fe
            java.lang.String r8 = "name"
            java.lang.String r9 = r3.f5032b     // Catch: java.lang.Throwable -> L9fe
            r4.put(r8, r9)     // Catch: java.lang.Throwable -> L9fe
            java.lang.String r8 = "timestamp"
            long r9 = r3.f5034d     // Catch: java.lang.Throwable -> L9fe
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L9fe
            r4.put(r8, r9)     // Catch: java.lang.Throwable -> L9fe
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L9fe
            r4.put(r15, r6)     // Catch: java.lang.Throwable -> L9fe
            java.lang.String r6 = "data"
            r4.put(r6, r2)     // Catch: java.lang.Throwable -> L9fe
            java.lang.String r2 = "realtime"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L9fe
            r4.put(r2, r6)     // Catch: java.lang.Throwable -> L9fe
            android.database.sqlite.SQLiteDatabase r2 = r1.f0()     // Catch: java.lang.Throwable -> L9fe android.database.sqlite.SQLiteException -> Lc32
            r11 = r24
            r14 = 0
            long r6 = r2.insert(r11, r14, r4)     // Catch: java.lang.Throwable -> L9fe android.database.sqlite.SQLiteException -> Lc32
            r8 = -1
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto Lc34
            java.lang.Object r2 = r1.f4346r     // Catch: java.lang.Throwable -> L9fe android.database.sqlite.SQLiteException -> Lc32
            O3.t0 r2 = (O3.C0323t0) r2     // Catch: java.lang.Throwable -> L9fe android.database.sqlite.SQLiteException -> Lc32
            O3.X r2 = r2.b()     // Catch: java.lang.Throwable -> L9fe android.database.sqlite.SQLiteException -> Lc32
            O3.V r2 = r2.s()     // Catch: java.lang.Throwable -> L9fe android.database.sqlite.SQLiteException -> Lc32
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            O3.W r0 = O3.X.w(r0)     // Catch: java.lang.Throwable -> L9fe android.database.sqlite.SQLiteException -> Lc32
            r2.c(r0, r4)     // Catch: java.lang.Throwable -> L9fe android.database.sqlite.SQLiteException -> Lc32
            goto Lc83
        Lc32:
            r0 = move-exception
            goto Lc39
        Lc34:
            r6 = 0
            r5.f4585E = r6     // Catch: java.lang.Throwable -> L9fe
            goto Lc83
        Lc39:
            java.lang.Object r1 = r1.f4346r     // Catch: java.lang.Throwable -> L9fe
            O3.t0 r1 = (O3.C0323t0) r1     // Catch: java.lang.Throwable -> L9fe
            O3.X r1 = r1.b()     // Catch: java.lang.Throwable -> L9fe
            O3.V r1 = r1.s()     // Catch: java.lang.Throwable -> L9fe
            java.lang.String r2 = "Error storing raw event. appId"
            java.lang.String r3 = r3.f5031a     // Catch: java.lang.Throwable -> L9fe
            O3.W r3 = O3.X.w(r3)     // Catch: java.lang.Throwable -> L9fe
            r1.d(r3, r0, r2)     // Catch: java.lang.Throwable -> L9fe
            goto Lc83
        Lc51:
            r0 = move-exception
            goto Lc6e
        Lc53:
            r0 = move-exception
            java.lang.Object r1 = r1.f4346r     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            O3.t0 r1 = (O3.C0323t0) r1     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            O3.X r1 = r1.b()     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            O3.V r1 = r1.s()     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            java.lang.String r3 = "Error storing raw event metadata. appId"
            java.lang.String r2 = r2.p()     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            O3.W r2 = O3.X.w(r2)     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            r1.d(r2, r0, r3)     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
            throw r0     // Catch: java.lang.Throwable -> L9fe java.io.IOException -> Lc51
        Lc6e:
            O3.X r1 = r5.b()     // Catch: java.lang.Throwable -> L9fe
            O3.V r1 = r1.s()     // Catch: java.lang.Throwable -> L9fe
            java.lang.String r2 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r3 = r4.o()     // Catch: java.lang.Throwable -> L9fe
            O3.W r3 = O3.X.w(r3)     // Catch: java.lang.Throwable -> L9fe
            r1.d(r3, r0, r2)     // Catch: java.lang.Throwable -> L9fe
        Lc83:
            O3.n r0 = r5.f0()     // Catch: java.lang.Throwable -> L9fe
            r0.d0()     // Catch: java.lang.Throwable -> L9fe
            O3.n r0 = r5.f0()
            r0.e0()
            r5.L()
            O3.X r0 = r5.b()
            O3.V r0 = r0.v()
            long r1 = java.lang.System.nanoTime()
            long r1 = r1 - r41
            r3 = 500000(0x7a120, double:2.47033E-318)
            long r1 = r1 + r3
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 / r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Background event processing time, ms"
            r0.c(r1, r2)
            return
        Lcb4:
            O3.n r1 = r5.f0()
            r1.e0()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T1.l(O3.v, O3.a2):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l0(a2 a2Var) {
        c().o();
        k0();
        String str = a2Var.f4729q;
        AbstractC1887A.d(str);
        J0 j0C = J0.c(a2Var.f4721N, a2Var.f4716I);
        a(str);
        b().f4666E.d(str, j0C, "Setting storage consent for package");
        c().o();
        k0();
        this.f4598R.put(str, j0C);
        C0305n c0305n = this.f4609s;
        S(c0305n);
        c0305n.V(str, j0C);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(C0273c0 c0273c0, C0854r1 c0854r1) {
        k3.d dVar;
        com.google.android.gms.internal.measurement.B1 b12;
        EnumC0287h enumC0287h;
        c().o();
        k0();
        String strB0 = ((C0859s1) c0854r1.f11012r).B0();
        EnumMap enumMap = new EnumMap(I0.class);
        int length = strB0.length();
        int length2 = I0.values().length;
        EnumC0287h enumC0287h2 = EnumC0287h.UNSET;
        int i = 0;
        if (length < length2 || strB0.charAt(0) != '1') {
            dVar = new k3.d(10);
        } else {
            I0[] i0ArrValues = I0.values();
            int length3 = i0ArrValues.length;
            int i7 = 0;
            int i8 = 1;
            while (i7 < length3) {
                I0 i02 = i0ArrValues[i7];
                int i9 = i8 + 1;
                char cCharAt = strB0.charAt(i8);
                EnumC0287h[] enumC0287hArrValues = EnumC0287h.values();
                int length4 = enumC0287hArrValues.length;
                int i10 = i;
                while (true) {
                    if (i10 >= length4) {
                        enumC0287h = enumC0287h2;
                        break;
                    }
                    enumC0287h = enumC0287hArrValues[i10];
                    if (enumC0287h.f4875q == cCharAt) {
                        break;
                    } else {
                        i10++;
                    }
                }
                enumMap.put(i02, enumC0287h);
                i7++;
                i8 = i9;
                i = 0;
            }
            dVar = new k3.d(enumMap);
        }
        String strD = c0273c0.D();
        c().o();
        k0();
        J0 j0A = a(strD);
        EnumMap enumMap2 = j0A.f4497a;
        I0 i03 = I0.AD_STORAGE;
        G0 g02 = (G0) enumMap2.get(i03);
        G0 g03 = G0.UNINITIALIZED;
        if (g02 == null) {
            g02 = g03;
        }
        int i11 = j0A.f4498b;
        int iOrdinal = g02.ordinal();
        EnumC0287h enumC0287h3 = EnumC0287h.REMOTE_ENFORCED_DEFAULT;
        EnumC0287h enumC0287h4 = EnumC0287h.FAILSAFE;
        if (iOrdinal == 1) {
            dVar.J(i03, enumC0287h3);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            dVar.I(i03, i11);
        } else {
            dVar.J(i03, enumC0287h4);
        }
        I0 i04 = I0.ANALYTICS_STORAGE;
        G0 g04 = (G0) enumMap2.get(i04);
        if (g04 != null) {
            g03 = g04;
        }
        int iOrdinal2 = g03.ordinal();
        if (iOrdinal2 == 1) {
            dVar.J(i04, enumC0287h3);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            dVar.I(i04, i11);
        } else {
            dVar.J(i04, enumC0287h4);
        }
        String strD2 = c0273c0.D();
        c().o();
        k0();
        C0311p c0311pP0 = p0(strD2, n0(strD2), a(strD2), dVar);
        String str = c0311pP0.f5008d;
        Boolean bool = c0311pP0.f5007c;
        AbstractC1887A.g(bool);
        boolean zBooleanValue = bool.booleanValue();
        c0854r1.b();
        ((C0859s1) c0854r1.f11012r).f1(zBooleanValue);
        if (!TextUtils.isEmpty(str)) {
            c0854r1.b();
            ((C0859s1) c0854r1.f11012r).g1(str);
        }
        c().o();
        k0();
        Iterator it = Collections.unmodifiableList(((C0859s1) c0854r1.f11012r).U1()).iterator();
        while (true) {
            if (it.hasNext()) {
                b12 = (com.google.android.gms.internal.measurement.B1) it.next();
                if ("_npa".equals(b12.r())) {
                    break;
                }
            } else {
                b12 = null;
                break;
            }
        }
        if (b12 != null) {
            EnumMap enumMap3 = (EnumMap) dVar.f14122r;
            I0 i05 = I0.AD_PERSONALIZATION;
            EnumC0287h enumC0287h5 = (EnumC0287h) enumMap3.get(i05);
            if (enumC0287h5 == null) {
                enumC0287h5 = enumC0287h2;
            }
            if (enumC0287h5 == enumC0287h2) {
                C0305n c0305n = this.f4609s;
                S(c0305n);
                W1 w1K0 = c0305n.k0(c0273c0.D(), "_npa");
                EnumC0287h enumC0287h6 = EnumC0287h.MANIFEST;
                EnumC0287h enumC0287h7 = EnumC0287h.API;
                if (w1K0 != null) {
                    String str2 = w1K0.f4658b;
                    if ("tcf".equals(str2)) {
                        dVar.J(i05, EnumC0287h.TCF);
                    } else if ("app".equals(str2)) {
                        dVar.J(i05, enumC0287h7);
                    } else {
                        dVar.J(i05, enumC0287h6);
                    }
                } else {
                    Boolean boolW = c0273c0.w();
                    if (boolW == null || ((boolW.booleanValue() && b12.v() != 1) || !(boolW.booleanValue() || b12.v() == 0))) {
                        dVar.J(i05, enumC0287h7);
                    } else {
                        dVar.J(i05, enumC0287h6);
                    }
                }
            }
        } else {
            int iD = D(c0273c0.D(), dVar);
            com.google.android.gms.internal.measurement.A1 a1A = com.google.android.gms.internal.measurement.B1.A();
            a1A.b();
            ((com.google.android.gms.internal.measurement.B1) a1A.f11012r).C("_npa");
            e().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            a1A.b();
            ((com.google.android.gms.internal.measurement.B1) a1A.f11012r).B(jCurrentTimeMillis);
            a1A.b();
            ((com.google.android.gms.internal.measurement.B1) a1A.f11012r).F(iD);
            com.google.android.gms.internal.measurement.B1 b13 = (com.google.android.gms.internal.measurement.B1) a1A.e();
            c0854r1.b();
            ((C0859s1) c0854r1.f11012r).d0(b13);
            b().f4666E.d("non_personalized_ads(_npa)", Integer.valueOf(iD), "Setting user property");
        }
        String string = dVar.toString();
        c0854r1.b();
        ((C0859s1) c0854r1.f11012r).e1(string);
        String strD3 = c0273c0.D();
        C0300l0 c0300l0 = this.f4607q;
        c0300l0.o();
        c0300l0.u(strD3);
        com.google.android.gms.internal.measurement.J0 j0J = c0300l0.J(strD3);
        boolean z5 = j0J == null || !j0J.s() || j0J.t();
        List listU = c0854r1.U();
        for (int i12 = 0; i12 < listU.size(); i12++) {
            if ("_tcf".equals(((C0820k1) listU.get(i12)).s())) {
                C0815j1 c0815j1 = (C0815j1) ((C0820k1) listU.get(i12)).i();
                List listH = c0815j1.h();
                int i13 = 0;
                while (true) {
                    if (i13 >= listH.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((C0835n1) listH.get(i13)).q())) {
                        String strS = ((C0835n1) listH.get(i13)).s();
                        if (z5 && strS.length() > 4) {
                            char[] charArray = strS.toCharArray();
                            int i14 = 1;
                            while (true) {
                                if (i14 >= 64) {
                                    i14 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i14)) {
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i14 | 1);
                            strS = String.valueOf(charArray);
                        }
                        C0830m1 c0830m1B = C0835n1.B();
                        c0830m1B.h("_tcfd");
                        c0830m1B.i(strS);
                        c0815j1.b();
                        ((C0820k1) c0815j1.f11012r).A(i13, (C0835n1) c0830m1B.e());
                    } else {
                        i13++;
                    }
                }
                c0854r1.X(i12, c0815j1);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m0(a2 a2Var) {
        c().o();
        k0();
        String str = a2Var.f4729q;
        AbstractC1887A.d(str);
        C0311p c0311pB = C0311p.b(a2Var.f4722O);
        b().f4666E.d(str, c0311pB, "Setting DMA consent for package");
        c().o();
        k0();
        G0 g0A = C0311p.c(100, o0(str)).a();
        this.f4599S.put(str, c0311pB);
        C0305n c0305n = this.f4609s;
        S(c0305n);
        AbstractC1887A.g(str);
        AbstractC1887A.g(c0311pB);
        c0305n.o();
        c0305n.p();
        J0 j0J = c0305n.J(str);
        J0 j02 = J0.f4496c;
        if (j0J == j02) {
            c0305n.V(str, j02);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", c0311pB.f5006b);
        c0305n.N(contentValues);
        G0 g0A2 = C0311p.c(100, o0(str)).a();
        c().o();
        k0();
        G0 g02 = G0.GRANTED;
        G0 g03 = G0.DENIED;
        boolean z5 = g0A == g03 && g0A2 == g02;
        boolean z6 = g0A == g02 && g0A2 == g03;
        if (z5 || z6) {
            b().f4666E.c(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            C0305n c0305n2 = this.f4609s;
            S(c0305n2);
            if (c0305n2.u0(f(), str, false, false, false, false).f < d0().w(str, F.f4444m0)) {
                bundle.putLong("_r", 1L);
                C0305n c0305n3 = this.f4609s;
                S(c0305n3);
                b().f4666E.d(str, Long.valueOf(c0305n3.u0(f(), str, false, false, true, false).f), "_dcu realtime event count");
            }
            this.f4606Z.zza(str, "_dcu", bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(C0273c0 c0273c0, C0854r1 c0854r1) {
        Serializable serializableD;
        c().o();
        k0();
        com.google.android.gms.internal.measurement.U0 u0O = com.google.android.gms.internal.measurement.X0.O();
        C0323t0 c0323t0 = c0273c0.f4793a;
        C0312p0 c0312p0 = c0323t0.f5078w;
        C0323t0.l(c0312p0);
        c0312p0.o();
        byte[] bArr = c0273c0.f4781H;
        if (bArr != null) {
            try {
                u0O = (com.google.android.gms.internal.measurement.U0) C0270b0.b0(u0O, bArr);
            } catch (C0895z2 unused) {
                b().f4673z.c(X.w(c0273c0.D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = c0854r1.U().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0820k1 c0820k1 = (C0820k1) it.next();
            if (c0820k1.s().equals("_cmp")) {
                C0835n1 c0835n1W = C0270b0.w(c0820k1, "gclid");
                Serializable serializableD2 = c0835n1W == null ? null : C0270b0.D(c0835n1W);
                if (serializableD2 == null) {
                    serializableD2 = "";
                }
                String str = (String) serializableD2;
                C0835n1 c0835n1W2 = C0270b0.w(c0820k1, "gbraid");
                Serializable serializableD3 = c0835n1W2 == null ? null : C0270b0.D(c0835n1W2);
                if (serializableD3 == null) {
                    serializableD3 = "";
                }
                String str2 = (String) serializableD3;
                C0835n1 c0835n1W3 = C0270b0.w(c0820k1, "gad_source");
                Serializable serializableD4 = c0835n1W3 == null ? null : C0270b0.D(c0835n1W3);
                String str3 = (String) (serializableD4 != null ? serializableD4 : "");
                String[] strArrSplit = ((String) F.f4434h1.a(null)).split(",");
                i0();
                HashMap map = new HashMap();
                for (C0835n1 c0835n1 : c0820k1.p()) {
                    if (Arrays.asList(strArrSplit).contains(c0835n1.q()) && (serializableD = C0270b0.D(c0835n1)) != null) {
                        map.put(c0835n1.q(), serializableD);
                    }
                }
                if (!map.isEmpty()) {
                    C0835n1 c0835n1W4 = C0270b0.w(c0820k1, "click_timestamp");
                    Serializable serializableD5 = c0835n1W4 == null ? null : C0270b0.D(c0835n1W4);
                    long jLongValue = ((Long) (serializableD5 != null ? serializableD5 : 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = c0820k1.u();
                    }
                    C0835n1 c0835n1W5 = C0270b0.w(c0820k1, "_cis");
                    if ("referrer API v2".equals(c0835n1W5 != null ? C0270b0.D(c0835n1W5) : null)) {
                        if (jLongValue > ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).N()) {
                            if (str.isEmpty()) {
                                u0O.b();
                                ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).q();
                            } else {
                                u0O.b();
                                ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).p(str);
                            }
                            if (str2.isEmpty()) {
                                u0O.b();
                                ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).s();
                            } else {
                                u0O.b();
                                ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).r(str2);
                            }
                            if (str3.isEmpty()) {
                                u0O.b();
                                ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).u();
                            } else {
                                u0O.b();
                                ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).t(str3);
                            }
                            u0O.b();
                            ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).v(jLongValue);
                            u0O.b();
                            ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).x().clear();
                            HashMap mapE = E(c0820k1);
                            u0O.b();
                            ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).x().putAll(mapE);
                        }
                    } else if (jLongValue > ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).F()) {
                        if (str.isEmpty()) {
                            u0O.b();
                            ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).R();
                        } else {
                            u0O.b();
                            ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).Q(str);
                        }
                        if (str2.isEmpty()) {
                            u0O.b();
                            ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).T();
                        } else {
                            u0O.b();
                            ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).S(str2);
                        }
                        if (str3.isEmpty()) {
                            u0O.b();
                            ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).V();
                        } else {
                            u0O.b();
                            ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).U(str3);
                        }
                        u0O.b();
                        ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).W(jLongValue);
                        u0O.b();
                        ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).w().clear();
                        HashMap mapE2 = E(c0820k1);
                        u0O.b();
                        ((com.google.android.gms.internal.measurement.X0) u0O.f11012r).w().putAll(mapE2);
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.X0) u0O.e()).equals(com.google.android.gms.internal.measurement.X0.P())) {
            com.google.android.gms.internal.measurement.X0 x02 = (com.google.android.gms.internal.measurement.X0) u0O.e();
            c0854r1.b();
            ((C0859s1) c0854r1.f11012r).k1(x02);
        }
        byte[] bArrA = ((com.google.android.gms.internal.measurement.X0) u0O.e()).a();
        C0312p0 c0312p02 = c0323t0.f5078w;
        C0323t0.l(c0312p02);
        c0312p02.o();
        c0273c0.f4790Q |= c0273c0.f4781H != bArrA;
        c0273c0.f4781H = bArrA;
        if (c0273c0.o()) {
            C0305n c0305n = this.f4609s;
            S(c0305n);
            c0305n.t0(c0273c0, false);
        }
        if (d0().y(null, F.f4431g1)) {
            C0305n c0305n2 = this.f4609s;
            S(c0305n2);
            c0305n2.i0(c0273c0.D(), "_lgclid");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0311p n0(String str) {
        c().o();
        k0();
        HashMap map = this.f4599S;
        C0311p c0311p = (C0311p) map.get(str);
        if (c0311p != null) {
            return c0311p;
        }
        C0305n c0305n = this.f4609s;
        S(c0305n);
        AbstractC1887A.g(str);
        c0305n.o();
        c0305n.p();
        C0311p c0311pB = C0311p.b(c0305n.M("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, c0311pB);
        return c0311pB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String o(J0 j02) {
        if (!j02.i(I0.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        j0().l0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final Bundle o0(String str) {
        c().o();
        k0();
        C0300l0 c0300l0 = this.f4607q;
        S(c0300l0);
        if (c0300l0.J(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        J0 j0A = a(str);
        Bundle bundle2 = new Bundle();
        Iterator it = j0A.f4497a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iOrdinal = ((G0) entry.getValue()).ordinal();
            String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((I0) entry.getKey()).f4492q, str2);
            }
        }
        bundle.putAll(bundle2);
        C0311p c0311pP0 = p0(str, n0(str), j0A, new k3.d(10));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : c0311pP0.f5009e.entrySet()) {
            int iOrdinal2 = ((G0) entry2.getValue()).ordinal();
            String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((I0) entry2.getKey()).f4492q, str3);
            }
        }
        Boolean bool = c0311pP0.f5007c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = c0311pP0.f5008d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        C0305n c0305n = this.f4609s;
        S(c0305n);
        W1 w1K0 = c0305n.k0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (w1K0 != null ? w1K0.f4661e.equals(1L) : D(str, new k3.d(10))) ? "granted" : "denied");
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(ArrayList arrayList) {
        AbstractC1887A.a(!arrayList.isEmpty());
        if (this.f4595O != null) {
            b().f4670w.b("Set uploading progress before finishing the previous upload");
        } else {
            this.f4595O = new ArrayList(arrayList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O3.C0311p p0(java.lang.String r12, O3.C0311p r13, O3.J0 r14, k3.d r15) {
        /*
            r11 = this;
            O3.l0 r0 = r11.f4607q
            S(r0)
            com.google.android.gms.internal.measurement.J0 r1 = r0.J(r12)
            java.lang.String r2 = "-"
            r3 = 90
            O3.G0 r4 = O3.G0.DENIED
            O3.I0 r5 = O3.I0.AD_USER_DATA
            if (r1 != 0) goto L2e
            O3.G0 r12 = r13.a()
            if (r12 != r4) goto L1f
            int r3 = r13.f5005a
            r15.I(r5, r3)
            goto L24
        L1f:
            O3.h r12 = O3.EnumC0287h.FAILSAFE
            r15.J(r5, r12)
        L24:
            O3.p r12 = new O3.p
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r12.<init>(r13, r3, r14, r2)
            return r12
        L2e:
            O3.G0 r1 = r13.a()
            r6 = 0
            r7 = 1
            O3.G0 r8 = O3.G0.GRANTED
            if (r1 == r8) goto Lb4
            if (r1 != r4) goto L3c
            goto Lb4
        L3c:
            O3.G0 r13 = O3.G0.POLICY
            O3.G0 r9 = O3.G0.UNINITIALIZED
            if (r1 != r13) goto L50
            O3.G0 r13 = r0.s(r12, r5)
            if (r13 == r9) goto L50
            O3.h r14 = O3.EnumC0287h.REMOTE_ENFORCED_DEFAULT
            r15.J(r5, r14)
            r1 = r13
            goto Lb9
        L50:
            r0.o()
            r0.u(r12)
            com.google.android.gms.internal.measurement.J0 r13 = r0.J(r12)
            if (r13 != 0) goto L5d
            goto L84
        L5d:
            java.util.List r13 = r13.q()
            java.util.Iterator r13 = r13.iterator()
        L65:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r1 = r13.next()
            com.google.android.gms.internal.measurement.H0 r1 = (com.google.android.gms.internal.measurement.H0) r1
            int r10 = r1.p()
            O3.I0 r10 = O3.C0300l0.z(r10)
            if (r5 != r10) goto L65
            int r13 = r1.q()
            O3.I0 r13 = O3.C0300l0.z(r13)
            goto L85
        L84:
            r13 = 0
        L85:
            java.util.EnumMap r14 = r14.f4497a
            O3.I0 r1 = O3.I0.AD_STORAGE
            java.lang.Object r14 = r14.get(r1)
            O3.G0 r14 = (O3.G0) r14
            if (r14 != 0) goto L92
            goto L93
        L92:
            r9 = r14
        L93:
            if (r9 == r8) goto L97
            if (r9 != r4) goto L99
        L97:
            r14 = r7
            goto L9a
        L99:
            r14 = r6
        L9a:
            if (r13 != r1) goto La5
            if (r14 == 0) goto La5
            O3.h r13 = O3.EnumC0287h.REMOTE_DELEGATION
            r15.J(r5, r13)
            r1 = r9
            goto Lb9
        La5:
            O3.h r13 = O3.EnumC0287h.REMOTE_DEFAULT
            r15.J(r5, r13)
            boolean r13 = r0.I(r12, r5)
            if (r7 == r13) goto Lb2
            r1 = r4
            goto Lb9
        Lb2:
            r1 = r8
            goto Lb9
        Lb4:
            int r3 = r13.f5005a
            r15.I(r5, r3)
        Lb9:
            r0.o()
            r0.u(r12)
            com.google.android.gms.internal.measurement.J0 r13 = r0.J(r12)
            if (r13 != 0) goto Lc6
            goto Ld2
        Lc6:
            boolean r14 = r13.s()
            if (r14 == 0) goto Ld2
            boolean r13 = r13.t()
            if (r13 == 0) goto Ld3
        Ld2:
            r6 = r7
        Ld3:
            S(r0)
            r0.o()
            r0.u(r12)
            java.util.TreeSet r13 = new java.util.TreeSet
            r13.<init>()
            com.google.android.gms.internal.measurement.J0 r12 = r0.J(r12)
            if (r12 != 0) goto Le8
            goto L104
        Le8:
            java.util.List r12 = r12.r()
            java.util.Iterator r12 = r12.iterator()
        Lf0:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L104
            java.lang.Object r14 = r12.next()
            com.google.android.gms.internal.measurement.I0 r14 = (com.google.android.gms.internal.measurement.I0) r14
            java.lang.String r14 = r14.p()
            r13.add(r14)
            goto Lf0
        L104:
            if (r1 == r4) goto L121
            boolean r12 = r13.isEmpty()
            if (r12 == 0) goto L10d
            goto L121
        L10d:
            O3.p r12 = new O3.p
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = ""
            if (r6 == 0) goto L11d
            java.lang.String r0 = android.text.TextUtils.join(r0, r13)
        L11d:
            r12.<init>(r14, r3, r15, r0)
            return r12
        L121:
            O3.p r12 = new O3.p
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r6)
            r12.<init>(r13, r3, r14, r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T1.p0(java.lang.String, O3.p, O3.J0, k3.d):O3.p");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x0183 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x0138 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x017d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab A[Catch: all -> 0x0028, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [O3.T1] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            r11 = this;
            O3.p0 r0 = r11.c()
            r0.o()
            r11.k0()
            r0 = 1
            r11.f4592L = r0
            r0 = 0
            O3.t0 r1 = r11.f4582B     // Catch: java.lang.Throwable -> L28
            r1.getClass()     // Catch: java.lang.Throwable -> L28
            O3.w1 r1 = r1.o()     // Catch: java.lang.Throwable -> L28
            java.lang.Boolean r1 = r1.f5110v     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L2b
            O3.X r1 = r11.b()     // Catch: java.lang.Throwable -> L28
            O3.V r1 = r1.f4673z     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r1.b(r2)     // Catch: java.lang.Throwable -> L28
            goto L1b9
        L28:
            r1 = move-exception
            goto L1c5
        L2b:
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L3e
            O3.X r1 = r11.b()     // Catch: java.lang.Throwable -> L28
            O3.V r1 = r1.f4670w     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r1.b(r2)     // Catch: java.lang.Throwable -> L28
            goto L1b9
        L3e:
            long r1 = r11.f4585E     // Catch: java.lang.Throwable -> L28
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L4b
            r11.L()     // Catch: java.lang.Throwable -> L28
            goto L1b9
        L4b:
            O3.p0 r1 = r11.c()     // Catch: java.lang.Throwable -> L28
            r1.o()     // Catch: java.lang.Throwable -> L28
            java.util.ArrayList r1 = r11.f4595O     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L63
            O3.X r1 = r11.b()     // Catch: java.lang.Throwable -> L28
            O3.V r1 = r1.f4666E     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "Uploading requested multiple times"
            r1.b(r2)     // Catch: java.lang.Throwable -> L28
            goto L1b9
        L63:
            O3.b0 r1 = r11.f4608r     // Catch: java.lang.Throwable -> L28
            S(r1)     // Catch: java.lang.Throwable -> L28
            boolean r1 = r1.I()     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L7e
            O3.X r1 = r11.b()     // Catch: java.lang.Throwable -> L28
            O3.V r1 = r1.f4666E     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r1.b(r2)     // Catch: java.lang.Throwable -> L28
            r11.L()     // Catch: java.lang.Throwable -> L28
            goto L1b9
        L7e:
            B3.a r1 = r11.e()     // Catch: java.lang.Throwable -> L28
            r1.getClass()     // Catch: java.lang.Throwable -> L28
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L28
            O3.g r5 = r11.d0()     // Catch: java.lang.Throwable -> L28
            O3.E r6 = O3.F.f4435i0     // Catch: java.lang.Throwable -> L28
            r7 = 0
            int r5 = r5.w(r7, r6)     // Catch: java.lang.Throwable -> L28
            r11.d0()     // Catch: java.lang.Throwable -> L28
            O3.E r6 = O3.F.f4424e     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = r6.a(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L28
            long r8 = r6.longValue()     // Catch: java.lang.Throwable -> L28
            long r8 = r1 - r8
            r6 = r0
        La6:
            if (r6 >= r5) goto Lb1
            boolean r10 = r11.G(r7, r8)     // Catch: java.lang.Throwable -> L28
            if (r10 == 0) goto Lb1
            int r6 = r6 + 1
            goto La6
        Lb1:
            com.google.android.gms.internal.measurement.Y3.a()     // Catch: java.lang.Throwable -> L28
            O3.p0 r5 = r11.c()     // Catch: java.lang.Throwable -> L28
            r5.o()     // Catch: java.lang.Throwable -> L28
            r11.F()     // Catch: java.lang.Throwable -> L28
            O3.y1 r5 = r11.f4615y     // Catch: java.lang.Throwable -> L28
            O3.f0 r5 = r5.f5166y     // Catch: java.lang.Throwable -> L28
            long r5 = r5.a()     // Catch: java.lang.Throwable -> L28
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto Ldf
            O3.X r3 = r11.b()     // Catch: java.lang.Throwable -> L28
            O3.V r3 = r3.f4665D     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r5 = r1 - r5
            long r5 = java.lang.Math.abs(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L28
            r3.c(r5, r4)     // Catch: java.lang.Throwable -> L28
        Ldf:
            O3.n r3 = r11.f4609s     // Catch: java.lang.Throwable -> L28
            S(r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = r3.w()     // Catch: java.lang.Throwable -> L28
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L28
            r5 = -1
            if (r4 != 0) goto L138
            long r8 = r11.f4597Q     // Catch: java.lang.Throwable -> L28
            int r4 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r4 != 0) goto L133
            O3.n r4 = r11.f4609s     // Catch: java.lang.Throwable -> L28
            S(r4)     // Catch: java.lang.Throwable -> L28
            android.database.sqlite.SQLiteDatabase r8 = r4.f0()     // Catch: java.lang.Throwable -> L114 android.database.sqlite.SQLiteException -> L116
            java.lang.String r9 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r7 = r8.rawQuery(r9, r7)     // Catch: java.lang.Throwable -> L114 android.database.sqlite.SQLiteException -> L116
            boolean r8 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L114 android.database.sqlite.SQLiteException -> L116
            if (r8 != 0) goto L10f
        L10b:
            r7.close()     // Catch: java.lang.Throwable -> L28
            goto L12a
        L10f:
            long r5 = r7.getLong(r0)     // Catch: java.lang.Throwable -> L114 android.database.sqlite.SQLiteException -> L116
            goto L10b
        L114:
            r1 = move-exception
            goto L12d
        L116:
            r8 = move-exception
            java.lang.Object r4 = r4.f4346r     // Catch: java.lang.Throwable -> L114
            O3.t0 r4 = (O3.C0323t0) r4     // Catch: java.lang.Throwable -> L114
            O3.X r4 = r4.f5077v     // Catch: java.lang.Throwable -> L114
            O3.C0323t0.l(r4)     // Catch: java.lang.Throwable -> L114
            O3.V r4 = r4.f4670w     // Catch: java.lang.Throwable -> L114
            java.lang.String r9 = "Error querying raw events"
            r4.c(r8, r9)     // Catch: java.lang.Throwable -> L114
            if (r7 == 0) goto L12a
            goto L10b
        L12a:
            r11.f4597Q = r5     // Catch: java.lang.Throwable -> L28
            goto L133
        L12d:
            if (r7 == 0) goto L132
            r7.close()     // Catch: java.lang.Throwable -> L28
        L132:
            throw r1     // Catch: java.lang.Throwable -> L28
        L133:
            r11.r(r3, r1)     // Catch: java.lang.Throwable -> L28
            goto L1b9
        L138:
            r11.f4597Q = r5     // Catch: java.lang.Throwable -> L28
            O3.n r3 = r11.f4609s     // Catch: java.lang.Throwable -> L28
            S(r3)     // Catch: java.lang.Throwable -> L28
            r11.d0()     // Catch: java.lang.Throwable -> L28
            O3.E r4 = O3.F.f4424e     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r4.a(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L28
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L28
            long r1 = r1 - r4
            r3.o()     // Catch: java.lang.Throwable -> L28
            r3.p()     // Catch: java.lang.Throwable -> L28
            android.database.sqlite.SQLiteDatabase r4 = r3.f0()     // Catch: java.lang.Throwable -> L18c android.database.sqlite.SQLiteException -> L18f
            java.lang.String r5 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L18c android.database.sqlite.SQLiteException -> L18f
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L18c android.database.sqlite.SQLiteException -> L18f
            android.database.Cursor r1 = r4.rawQuery(r5, r1)     // Catch: java.lang.Throwable -> L18c android.database.sqlite.SQLiteException -> L18f
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L181 android.database.sqlite.SQLiteException -> L183
            if (r2 != 0) goto L185
            java.lang.Object r2 = r3.f4346r     // Catch: java.lang.Throwable -> L181 android.database.sqlite.SQLiteException -> L183
            O3.t0 r2 = (O3.C0323t0) r2     // Catch: java.lang.Throwable -> L181 android.database.sqlite.SQLiteException -> L183
            O3.X r2 = r2.f5077v     // Catch: java.lang.Throwable -> L181 android.database.sqlite.SQLiteException -> L183
            O3.C0323t0.l(r2)     // Catch: java.lang.Throwable -> L181 android.database.sqlite.SQLiteException -> L183
            O3.V r2 = r2.f4666E     // Catch: java.lang.Throwable -> L181 android.database.sqlite.SQLiteException -> L183
            java.lang.String r4 = "No expired configs for apps with pending events"
            r2.b(r4)     // Catch: java.lang.Throwable -> L181 android.database.sqlite.SQLiteException -> L183
        L17d:
            r1.close()     // Catch: java.lang.Throwable -> L28
            goto L1a5
        L181:
            r2 = move-exception
            goto L18a
        L183:
            r2 = move-exception
            goto L192
        L185:
            java.lang.String r7 = r1.getString(r0)     // Catch: java.lang.Throwable -> L181 android.database.sqlite.SQLiteException -> L183
            goto L17d
        L18a:
            r7 = r1
            goto L1bf
        L18c:
            r1 = move-exception
            r2 = r1
            goto L1bf
        L18f:
            r1 = move-exception
            r2 = r1
            r1 = r7
        L192:
            java.lang.Object r3 = r3.f4346r     // Catch: java.lang.Throwable -> L181
            O3.t0 r3 = (O3.C0323t0) r3     // Catch: java.lang.Throwable -> L181
            O3.X r3 = r3.f5077v     // Catch: java.lang.Throwable -> L181
            O3.C0323t0.l(r3)     // Catch: java.lang.Throwable -> L181
            O3.V r3 = r3.f4670w     // Catch: java.lang.Throwable -> L181
            java.lang.String r4 = "Error selecting expired configs"
            r3.c(r2, r4)     // Catch: java.lang.Throwable -> L181
            if (r1 == 0) goto L1a5
            goto L17d
        L1a5:
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L1b9
            O3.n r1 = r11.f4609s     // Catch: java.lang.Throwable -> L28
            S(r1)     // Catch: java.lang.Throwable -> L28
            O3.c0 r1 = r1.s0(r7)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L1b9
            r11.y(r1)     // Catch: java.lang.Throwable -> L28
        L1b9:
            r11.f4592L = r0
            r11.M()
            return
        L1bf:
            if (r7 == 0) goto L1c4
            r7.close()     // Catch: java.lang.Throwable -> L28
        L1c4:
            throw r2     // Catch: java.lang.Throwable -> L28
        L1c5:
            r11.f4592L = r0
            r11.M()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T1.q():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:175:0x0464 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:304:0x07a8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:429:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:454:0x0720 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:456:0x0720 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:476:0x01fb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x01aa */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x01b8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:85:0x01d0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x01d2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[PHI: r0 r11 r22 r24
  0x006f: PHI (r0v114 java.util.List) = (r0v8 java.util.List), (r0v136 java.util.List) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r11v47 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v49 android.database.Cursor) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r22v28 ??) = (r22v40 ??), (r22v41 ??) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r24v7 long) = (r24v2 long), (r24v8 long) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x08ad A[LOOP:7: B:345:0x08a7->B:347:0x08ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0801 A[EDGE_INSN: B:447:0x0801->B:317:0x0801 BREAK  A[LOOP:4: B:263:0x0658->B:316:0x07f3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x07f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0864 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:484:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:489:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v13, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r22v28 */
    /* JADX WARN: Type inference failed for: r22v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v31 */
    /* JADX WARN: Type inference failed for: r22v32 */
    /* JADX WARN: Type inference failed for: r22v33 */
    /* JADX WARN: Type inference failed for: r22v34 */
    /* JADX WARN: Type inference failed for: r22v35 */
    /* JADX WARN: Type inference failed for: r22v36 */
    /* JADX WARN: Type inference failed for: r22v37 */
    /* JADX WARN: Type inference failed for: r22v38 */
    /* JADX WARN: Type inference failed for: r22v39 */
    /* JADX WARN: Type inference failed for: r22v40 */
    /* JADX WARN: Type inference failed for: r22v41 */
    /* JADX WARN: Type inference failed for: r22v42 */
    /* JADX WARN: Type inference failed for: r22v43 */
    /* JADX WARN: Type inference failed for: r22v44 */
    /* JADX WARN: Type inference failed for: r22v45 */
    /* JADX WARN: Type inference failed for: r22v46 */
    /* JADX WARN: Type inference failed for: r22v47 */
    /* JADX WARN: Type inference failed for: r33v0, types: [O3.T1] */
    /* JADX WARN: Type inference failed for: r8v64, types: [O3.K1] */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v86 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.lang.String r34, long r35) throws java.lang.Throwable {
        /*
            r33 = this;
            r1 = r33
            r6 = r34
            r2 = r35
            java.lang.String r4 = "data"
            O3.g r0 = r1.d0()
            O3.E r5 = O3.F.f4432h
            int r0 = r0.w(r6, r5)
            O3.g r5 = r1.d0()
            O3.E r7 = O3.F.i
            int r5 = r5.w(r6, r7)
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            O3.n r8 = r1.f0()
            java.lang.Object r9 = r8.f4346r
            O3.t0 r9 = (O3.C0323t0) r9
            r8.o()
            r8.p()
            r10 = 1
            if (r0 <= 0) goto L34
            r11 = r10
            goto L35
        L34:
            r11 = r7
        L35:
            x3.AbstractC1887A.a(r11)
            if (r5 <= 0) goto L3c
            r11 = r10
            goto L3d
        L3c:
            r11 = r7
        L3d:
            x3.AbstractC1887A.a(r11)
            x3.AbstractC1887A.d(r6)
            android.database.sqlite.SQLiteDatabase r15 = r8.f0()     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L208
            java.lang.String r16 = "queue"
            r24 = -1
            java.lang.String r11 = "rowid"
            java.lang.String r12 = "retry_count"
            java.lang.String[] r17 = new java.lang.String[]{r11, r4, r12}     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204
            java.lang.String r18 = "app_id=?"
            java.lang.String[] r19 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204
            java.lang.String r22 = "rowid"
            java.lang.String r23 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204
            r20 = 0
            r21 = 0
            android.database.Cursor r11 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            if (r0 != 0) goto L7d
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
        L6f:
            r11.close()
        L72:
            r12 = r0
            goto L229
        L75:
            r0 = move-exception
            goto L1ff
        L78:
            r0 = move-exception
            r23 = r9
            goto L212
        L7d:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            r12.<init>()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            r15 = r7
        L83:
            long r16 = r11.getLong(r7)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            byte[] r0 = r11.getBlob(r10)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L1d4
            O3.T1 r10 = r8.f4510s     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L1d4
            O3.b0 r10 = r10.i0()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L1d4
            java.io.ByteArrayInputStream r14 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L1ba
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L1ba
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L1ba
            r0.<init>(r14)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L1ba
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L1ba
            r13.<init>()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L1ba
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L1ba
            r22 = r8
        La6:
            int r8 = r0.read(r7)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L1aa
            if (r8 > 0) goto L1ae
            r0.close()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L1aa
            r14.close()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L1aa
            byte[] r0 = r13.toByteArray()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L1aa
            boolean r7 = r12.isEmpty()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            if (r7 != 0) goto Lc2
            int r7 = r0.length     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            int r7 = r7 + r15
            if (r7 <= r5) goto Lc2
            goto L1fb
        Lc2:
            com.google.android.gms.internal.measurement.r1 r7 = com.google.android.gms.internal.measurement.C0859s1.U()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L197
            com.google.android.gms.internal.measurement.p2 r7 = O3.C0270b0.b0(r7, r0)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L197
            com.google.android.gms.internal.measurement.r1 r7 = (com.google.android.gms.internal.measurement.C0854r1) r7     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78 java.io.IOException -> L197
            boolean r8 = r12.isEmpty()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            if (r8 != 0) goto L16c
            r8 = 0
            java.lang.Object r10 = r12.get(r8)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            android.util.Pair r10 = (android.util.Pair) r10     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.lang.Object r8 = r10.first     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            com.google.android.gms.internal.measurement.s1 r8 = (com.google.android.gms.internal.measurement.C0859s1) r8     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            com.google.android.gms.internal.measurement.q2 r10 = r7.e()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            com.google.android.gms.internal.measurement.s1 r10 = (com.google.android.gms.internal.measurement.C0859s1) r10     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.lang.String r13 = r8.u0()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.lang.String r14 = r10.u0()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            boolean r13 = r13.equals(r14)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            if (r13 == 0) goto L1fb
            java.lang.String r13 = r8.B0()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.lang.String r14 = r10.B0()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            boolean r13 = r13.equals(r14)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            if (r13 == 0) goto L1fb
            boolean r13 = r8.D0()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            boolean r14 = r10.D0()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            if (r13 != r14) goto L1fb
            java.lang.String r13 = r8.F0()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.lang.String r14 = r10.F0()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            boolean r13 = r13.equals(r14)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            if (r13 == 0) goto L1fb
            com.google.android.gms.internal.measurement.w2 r8 = r8.U1()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
        L11f:
            boolean r13 = r8.hasNext()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.lang.String r14 = "_npa"
            if (r13 == 0) goto L141
            java.lang.Object r13 = r8.next()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            com.google.android.gms.internal.measurement.B1 r13 = (com.google.android.gms.internal.measurement.B1) r13     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            r23 = r8
            java.lang.String r8 = r13.r()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            boolean r8 = r14.equals(r8)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            if (r8 == 0) goto L13e
            long r26 = r13.v()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            goto L143
        L13e:
            r8 = r23
            goto L11f
        L141:
            r26 = r24
        L143:
            com.google.android.gms.internal.measurement.w2 r8 = r10.U1()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
        L14b:
            boolean r10 = r8.hasNext()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            if (r10 == 0) goto L166
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            com.google.android.gms.internal.measurement.B1 r10 = (com.google.android.gms.internal.measurement.B1) r10     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.lang.String r13 = r10.r()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            boolean r13 = r14.equals(r13)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            if (r13 == 0) goto L14b
            long r13 = r10.v()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            goto L168
        L166:
            r13 = r24
        L168:
            int r8 = (r26 > r13 ? 1 : (r26 == r13 ? 0 : -1))
            if (r8 != 0) goto L1fb
        L16c:
            r8 = 2
            boolean r10 = r11.isNull(r8)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            if (r10 != 0) goto L181
            int r10 = r11.getInt(r8)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            r7.b()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            com.google.android.gms.internal.measurement.q2 r8 = r7.f11012r     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            com.google.android.gms.internal.measurement.s1 r8 = (com.google.android.gms.internal.measurement.C0859s1) r8     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            r8.T0(r10)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
        L181:
            int r0 = r0.length     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            int r15 = r15 + r0
            com.google.android.gms.internal.measurement.q2 r0 = r7.e()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            com.google.android.gms.internal.measurement.s1 r0 = (com.google.android.gms.internal.measurement.C0859s1) r0     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.lang.Long r7 = java.lang.Long.valueOf(r16)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            android.util.Pair r0 = android.util.Pair.create(r0, r7)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            r12.add(r0)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
        L194:
            r23 = r9
            goto L1ea
        L197:
            r0 = move-exception
            O3.X r7 = r9.b()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            O3.V r7 = r7.s()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.lang.String r8 = "Failed to merge queued bundle. appId"
            O3.W r10 = O3.X.w(r6)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            r7.d(r10, r0, r8)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            goto L194
        L1aa:
            r0 = move-exception
        L1ab:
            r23 = r9
            goto L1be
        L1ae:
            r23 = r9
            r9 = 0
            r13.write(r7, r9, r8)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L1b8 android.database.sqlite.SQLiteException -> L1d2
            r9 = r23
            goto La6
        L1b8:
            r0 = move-exception
            goto L1be
        L1ba:
            r0 = move-exception
            r22 = r8
            goto L1ab
        L1be:
            java.lang.Object r7 = r10.f4346r     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L1d0 android.database.sqlite.SQLiteException -> L1d2
            O3.t0 r7 = (O3.C0323t0) r7     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L1d0 android.database.sqlite.SQLiteException -> L1d2
            O3.X r7 = r7.b()     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L1d0 android.database.sqlite.SQLiteException -> L1d2
            O3.V r7 = r7.s()     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L1d0 android.database.sqlite.SQLiteException -> L1d2
            java.lang.String r8 = "Failed to ungzip content"
            r7.c(r0, r8)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L1d0 android.database.sqlite.SQLiteException -> L1d2
            throw r0     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L1d0 android.database.sqlite.SQLiteException -> L1d2
        L1d0:
            r0 = move-exception
            goto L1d9
        L1d2:
            r0 = move-exception
            goto L212
        L1d4:
            r0 = move-exception
            r22 = r8
            r23 = r9
        L1d9:
            O3.X r7 = r23.b()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L1d2
            O3.V r7 = r7.s()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L1d2
            java.lang.String r8 = "Failed to unzip queued bundle. appId"
            O3.W r9 = O3.X.w(r6)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L1d2
            r7.d(r9, r0, r8)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L1d2
        L1ea:
            boolean r0 = r11.moveToNext()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L1d2
            if (r0 == 0) goto L1fb
            if (r15 <= r5) goto L1f3
            goto L1fb
        L1f3:
            r8 = r22
            r9 = r23
            r7 = 0
            r10 = 1
            goto L83
        L1fb:
            r11.close()
            goto L229
        L1ff:
            r14 = r11
            goto Laeb
        L202:
            r0 = move-exception
            goto L20e
        L204:
            r0 = move-exception
            r23 = r9
            goto L211
        L208:
            r0 = move-exception
            r23 = r9
            r24 = -1
            goto L211
        L20e:
            r14 = 0
            goto Laeb
        L211:
            r11 = 0
        L212:
            O3.X r5 = r23.b()     // Catch: java.lang.Throwable -> L75
            O3.V r5 = r5.s()     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = "Error querying bundles. appId"
            O3.W r8 = O3.X.w(r6)     // Catch: java.lang.Throwable -> L75
            r5.d(r8, r0, r7)     // Catch: java.lang.Throwable -> L75
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L75
            if (r11 == 0) goto L72
            goto L6f
        L229:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L231
            goto Laea
        L231:
            com.google.android.gms.internal.measurement.x3 r0 = com.google.android.gms.internal.measurement.C0886x3.f11124r
            G4.g r5 = r0.f11125q
            java.lang.Object r5 = r5.f2014q
            com.google.android.gms.internal.measurement.y3 r5 = (com.google.android.gms.internal.measurement.InterfaceC0891y3) r5
            O3.g r5 = r1.d0()
            O3.E r7 = O3.F.f4436i1
            r8 = 0
            boolean r5 = r5.y(r8, r7)
            java.lang.String r10 = "_f"
            O3.I0 r11 = O3.I0.ANALYTICS_STORAGE
            if (r5 == 0) goto L5a1
            G4.g r0 = r0.f11125q
            java.lang.Object r0 = r0.f2014q
            com.google.android.gms.internal.measurement.y3 r0 = (com.google.android.gms.internal.measurement.InterfaceC0891y3) r0
            O3.g r0 = r1.d0()
            boolean r0 = r0.y(r8, r7)
            if (r0 == 0) goto L598
            O3.J0 r0 = r33.a(r34)
            boolean r0 = r0.i(r11)
            java.lang.String r5 = "no_data_mode_events"
            if (r0 != 0) goto L38c
            O3.l0 r0 = r1.e0()
            boolean r0 = r0.t(r6)
            if (r0 == 0) goto L38c
            O3.E r0 = O3.F.f4438j1
            java.lang.Object r0 = r0.a(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = ","
            java.lang.String[] r0 = r0.split(r7)
            java.util.List r7 = java.util.Arrays.asList(r0)
            java.util.Iterator r8 = r12.iterator()
        L286:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L386
            java.lang.Object r0 = r8.next()
            android.util.Pair r0 = (android.util.Pair) r0
            O3.n r12 = r1.f0()     // Catch: android.database.sqlite.SQLiteException -> L2da
            java.lang.Object r13 = r0.second     // Catch: android.database.sqlite.SQLiteException -> L2da
            java.lang.Long r13 = (java.lang.Long) r13     // Catch: android.database.sqlite.SQLiteException -> L2da
            long r13 = r13.longValue()     // Catch: android.database.sqlite.SQLiteException -> L2da
            r12.x(r13)     // Catch: android.database.sqlite.SQLiteException -> L2da
            java.lang.Object r0 = r0.first     // Catch: android.database.sqlite.SQLiteException -> L2da
            com.google.android.gms.internal.measurement.s1 r0 = (com.google.android.gms.internal.measurement.C0859s1) r0     // Catch: android.database.sqlite.SQLiteException -> L2da
            java.util.List r0 = r0.P1()     // Catch: android.database.sqlite.SQLiteException -> L2da
            java.util.Iterator r12 = r0.iterator()     // Catch: android.database.sqlite.SQLiteException -> L2da
        L2ad:
            boolean r0 = r12.hasNext()     // Catch: android.database.sqlite.SQLiteException -> L2da
            if (r0 == 0) goto L286
            java.lang.Object r0 = r12.next()     // Catch: android.database.sqlite.SQLiteException -> L2da
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0     // Catch: android.database.sqlite.SQLiteException -> L2da
            java.lang.String r13 = r0.s()     // Catch: android.database.sqlite.SQLiteException -> L2da
            boolean r13 = r7.contains(r13)     // Catch: android.database.sqlite.SQLiteException -> L2da
            if (r13 == 0) goto L2ad
            java.lang.String r13 = r0.s()     // Catch: android.database.sqlite.SQLiteException -> L2da
            boolean r13 = r13.equals(r10)     // Catch: android.database.sqlite.SQLiteException -> L2da
            if (r13 != 0) goto L2de
            java.lang.String r13 = r0.s()     // Catch: android.database.sqlite.SQLiteException -> L2da
            java.lang.String r14 = "_v"
            boolean r13 = r13.equals(r14)     // Catch: android.database.sqlite.SQLiteException -> L2da
            if (r13 == 0) goto L2f8
            goto L2de
        L2da:
            r16 = 34
            goto L379
        L2de:
            com.google.android.gms.internal.measurement.p2 r0 = r0.i()     // Catch: android.database.sqlite.SQLiteException -> L2da
            com.google.android.gms.internal.measurement.j1 r0 = (com.google.android.gms.internal.measurement.C0815j1) r0     // Catch: android.database.sqlite.SQLiteException -> L2da
            r1.i0()     // Catch: android.database.sqlite.SQLiteException -> L2da
            java.lang.String r13 = "_dac"
            r14 = 1
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch: android.database.sqlite.SQLiteException -> L2da
            O3.C0270b0.u(r0, r13, r14)     // Catch: android.database.sqlite.SQLiteException -> L2da
            com.google.android.gms.internal.measurement.q2 r0 = r0.e()     // Catch: android.database.sqlite.SQLiteException -> L2da
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0     // Catch: android.database.sqlite.SQLiteException -> L2da
        L2f8:
            O3.n r13 = r1.f0()     // Catch: android.database.sqlite.SQLiteException -> L2da
            r13.o()     // Catch: android.database.sqlite.SQLiteException -> L2da
            r13.p()     // Catch: android.database.sqlite.SQLiteException -> L2da
            x3.AbstractC1887A.d(r6)     // Catch: android.database.sqlite.SQLiteException -> L2da
            java.lang.Object r14 = r13.f4346r     // Catch: android.database.sqlite.SQLiteException -> L2da
            O3.t0 r14 = (O3.C0323t0) r14     // Catch: android.database.sqlite.SQLiteException -> L2da
            O3.X r15 = r14.b()     // Catch: android.database.sqlite.SQLiteException -> L2da
            O3.V r15 = r15.v()     // Catch: android.database.sqlite.SQLiteException -> L2da
            r16 = 34
            java.lang.String r9 = "Caching events in NO_DATA mode"
            r15.c(r0, r9)     // Catch: android.database.sqlite.SQLiteException -> L379
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch: android.database.sqlite.SQLiteException -> L379
            r9.<init>()     // Catch: android.database.sqlite.SQLiteException -> L379
            java.lang.String r15 = "app_id"
            r9.put(r15, r6)     // Catch: android.database.sqlite.SQLiteException -> L379
            java.lang.String r15 = "name"
            r17 = r0
            java.lang.String r0 = r17.s()     // Catch: android.database.sqlite.SQLiteException -> L379
            r9.put(r15, r0)     // Catch: android.database.sqlite.SQLiteException -> L379
            byte[] r0 = r17.a()     // Catch: android.database.sqlite.SQLiteException -> L379
            r9.put(r4, r0)     // Catch: android.database.sqlite.SQLiteException -> L379
            java.lang.String r0 = "timestamp_millis"
            long r22 = r17.u()     // Catch: android.database.sqlite.SQLiteException -> L379
            java.lang.Long r15 = java.lang.Long.valueOf(r22)     // Catch: android.database.sqlite.SQLiteException -> L379
            r9.put(r0, r15)     // Catch: android.database.sqlite.SQLiteException -> L379
            android.database.sqlite.SQLiteDatabase r0 = r13.f0()     // Catch: android.database.sqlite.SQLiteException -> L361
            r15 = 0
            long r22 = r0.insert(r5, r15, r9)     // Catch: android.database.sqlite.SQLiteException -> L361
            int r0 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r0 != 0) goto L2ad
            O3.X r0 = r14.b()     // Catch: android.database.sqlite.SQLiteException -> L361
            O3.V r0 = r0.s()     // Catch: android.database.sqlite.SQLiteException -> L361
            java.lang.String r9 = "Failed to insert NO_DATA mode event (got -1). appId"
            O3.W r14 = O3.X.w(r6)     // Catch: android.database.sqlite.SQLiteException -> L361
            r0.c(r14, r9)     // Catch: android.database.sqlite.SQLiteException -> L361
            goto L2ad
        L361:
            r0 = move-exception
            java.lang.Object r9 = r13.f4346r     // Catch: android.database.sqlite.SQLiteException -> L379
            O3.t0 r9 = (O3.C0323t0) r9     // Catch: android.database.sqlite.SQLiteException -> L379
            O3.X r9 = r9.b()     // Catch: android.database.sqlite.SQLiteException -> L379
            O3.V r9 = r9.s()     // Catch: android.database.sqlite.SQLiteException -> L379
            java.lang.String r13 = "Error storing NO_DATA mode event. appId"
            O3.W r14 = O3.X.w(r6)     // Catch: android.database.sqlite.SQLiteException -> L379
            r9.d(r14, r0, r13)     // Catch: android.database.sqlite.SQLiteException -> L379
            goto L2ad
        L379:
            O3.X r0 = r1.b()
            O3.V r0 = r0.f4663B
            java.lang.String r9 = "Failed handling NO_DATA mode bundles. appId"
            r0.c(r6, r9)
            goto L286
        L386:
            r16 = 34
            java.util.List r12 = java.util.Collections.EMPTY_LIST
            goto L59a
        L38c:
            r16 = 34
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r12.size()
            r7.<init>(r0)
            O3.n r0 = r1.f0()
            java.lang.Object r8 = r0.f4346r
            O3.t0 r8 = (O3.C0323t0) r8
            x3.AbstractC1887A.d(r6)
            r0.o()
            r0.p()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.String r13 = " NO_DATA mode events. appId"
            java.lang.String r14 = "Pruned "
            android.database.sqlite.SQLiteDatabase r22 = r0.f0()     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L482
            B3.a r0 = r8.e()     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L482
            r0.getClass()     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L482
            long r31 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L482
            java.lang.String r23 = "no_data_mode_events"
            java.lang.String[] r24 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L482
            java.lang.String r25 = "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)"
            java.lang.String r0 = java.lang.String.valueOf(r31)     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L482
            java.lang.String[] r26 = new java.lang.String[]{r6, r0}     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L482
            java.lang.String r29 = "rowid"
            r30 = 0
            r27 = 0
            r28 = 0
            android.database.Cursor r4 = r22.query(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L482
            r15 = r22
            boolean r0 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L403 android.database.sqlite.SQLiteException -> L47c
            if (r0 == 0) goto L46e
            r17 = r8
        L3e6:
            r8 = 0
            byte[] r0 = r4.getBlob(r8)     // Catch: java.lang.Throwable -> L403 android.database.sqlite.SQLiteException -> L408 com.google.android.gms.internal.measurement.C0895z2 -> L40d
            com.google.android.gms.internal.measurement.j1 r8 = com.google.android.gms.internal.measurement.C0820k1.z()     // Catch: java.lang.Throwable -> L403 android.database.sqlite.SQLiteException -> L408 com.google.android.gms.internal.measurement.C0895z2 -> L40d
            com.google.android.gms.internal.measurement.p2 r0 = O3.C0270b0.b0(r8, r0)     // Catch: java.lang.Throwable -> L403 android.database.sqlite.SQLiteException -> L408 com.google.android.gms.internal.measurement.C0895z2 -> L40d
            com.google.android.gms.internal.measurement.j1 r0 = (com.google.android.gms.internal.measurement.C0815j1) r0     // Catch: java.lang.Throwable -> L403 android.database.sqlite.SQLiteException -> L408 com.google.android.gms.internal.measurement.C0895z2 -> L40d
            com.google.android.gms.internal.measurement.q2 r0 = r0.e()     // Catch: java.lang.Throwable -> L403 android.database.sqlite.SQLiteException -> L408 com.google.android.gms.internal.measurement.C0895z2 -> L40d
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0     // Catch: java.lang.Throwable -> L403 android.database.sqlite.SQLiteException -> L408 com.google.android.gms.internal.measurement.C0895z2 -> L40d
            r9.add(r0)     // Catch: java.lang.Throwable -> L403 android.database.sqlite.SQLiteException -> L408 com.google.android.gms.internal.measurement.C0895z2 -> L40d
            r22 = r4
            r23 = r9
            goto L421
        L403:
            r0 = move-exception
            r22 = r4
            goto L478
        L408:
            r0 = move-exception
            r22 = r4
            goto L48b
        L40d:
            r0 = move-exception
            O3.X r8 = r17.b()     // Catch: java.lang.Throwable -> L403 android.database.sqlite.SQLiteException -> L408
            O3.V r8 = r8.f4663B     // Catch: java.lang.Throwable -> L403 android.database.sqlite.SQLiteException -> L408
            r22 = r4
            java.lang.String r4 = "Failed to parse stored NO_DATA mode event, appId"
            r23 = r9
            O3.W r9 = O3.X.w(r6)     // Catch: java.lang.Throwable -> L464 android.database.sqlite.SQLiteException -> L466
            r8.d(r9, r0, r4)     // Catch: java.lang.Throwable -> L464 android.database.sqlite.SQLiteException -> L466
        L421:
            boolean r0 = r22.moveToNext()     // Catch: java.lang.Throwable -> L464 android.database.sqlite.SQLiteException -> L466
            if (r0 != 0) goto L468
            r22.close()     // Catch: java.lang.Throwable -> L464 android.database.sqlite.SQLiteException -> L466
            java.lang.String r0 = "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)"
            java.lang.String r4 = java.lang.String.valueOf(r31)     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L462
            java.lang.String[] r4 = new java.lang.String[]{r6, r4}     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L462
            int r0 = r15.delete(r5, r0, r4)     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L462
            O3.X r4 = r17.b()     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L462
            O3.V r4 = r4.v()     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L462
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L462
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L462
            int r5 = r5 + 34
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L462
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L462
            r8.append(r14)     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L462
            r8.append(r0)     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L462
            r8.append(r13)     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L462
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L462
            r4.c(r6, r0)     // Catch: java.lang.Throwable -> L460 android.database.sqlite.SQLiteException -> L462
            goto L475
        L460:
            r0 = move-exception
            goto L486
        L462:
            r0 = move-exception
            goto L489
        L464:
            r0 = move-exception
            goto L478
        L466:
            r0 = move-exception
            goto L48b
        L468:
            r4 = r22
            r9 = r23
            goto L3e6
        L46e:
            r22 = r4
            r23 = r9
            r22.close()
        L475:
            r9 = r23
            goto L4a3
        L478:
            r14 = r22
            goto L592
        L47c:
            r0 = move-exception
            r22 = r4
            r17 = r8
            goto L48b
        L482:
            r0 = move-exception
            r17 = r8
            goto L489
        L486:
            r14 = 0
            goto L592
        L489:
            r22 = 0
        L48b:
            O3.X r4 = r17.b()     // Catch: java.lang.Throwable -> L464
            O3.V r4 = r4.s()     // Catch: java.lang.Throwable -> L464
            java.lang.String r5 = "Error flushing NO_DATA mode events. appId"
            O3.W r8 = O3.X.w(r6)     // Catch: java.lang.Throwable -> L464
            r4.d(r8, r0, r5)     // Catch: java.lang.Throwable -> L464
            java.util.List r9 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L464
            if (r22 == 0) goto L4a3
            r22.close()
        L4a3:
            java.util.Iterator r0 = r12.iterator()
            r4 = 1
        L4a8:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L590
            java.lang.Object r5 = r0.next()
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r8 = r5.first
            com.google.android.gms.internal.measurement.s1 r8 = (com.google.android.gms.internal.measurement.C0859s1) r8
            com.google.android.gms.internal.measurement.p2 r8 = r8.i()
            com.google.android.gms.internal.measurement.r1 r8 = (com.google.android.gms.internal.measurement.C0854r1) r8
            if (r4 == 0) goto L4ee
            boolean r12 = r9.isEmpty()
            if (r12 != 0) goto L4ee
            java.util.List r4 = r8.U()
            r8.b()
            com.google.android.gms.internal.measurement.q2 r12 = r8.f11012r
            com.google.android.gms.internal.measurement.s1 r12 = (com.google.android.gms.internal.measurement.C0859s1) r12
            r12.a0()
            r12 = r9
            java.util.List r12 = (java.util.List) r12
            r8.b()
            com.google.android.gms.internal.measurement.q2 r13 = r8.f11012r
            com.google.android.gms.internal.measurement.s1 r13 = (com.google.android.gms.internal.measurement.C0859s1) r13
            r13.Z(r12)
            java.util.List r4 = (java.util.List) r4
            r8.b()
            com.google.android.gms.internal.measurement.q2 r12 = r8.f11012r
            com.google.android.gms.internal.measurement.s1 r12 = (com.google.android.gms.internal.measurement.C0859s1) r12
            r12.Z(r4)
            r4 = 0
        L4ee:
            com.google.android.gms.internal.measurement.d1 r12 = com.google.android.gms.internal.measurement.C0800g1.q()
            O3.l0 r13 = r1.e0()
            com.google.android.gms.internal.measurement.J0 r13 = r13.J(r6)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            if (r13 != 0) goto L509
        L501:
            r17 = r0
            r23 = r4
            r22 = r9
            goto L571
        L509:
            java.util.List r13 = r13.p()
            java.util.Iterator r13 = r13.iterator()
        L511:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L501
            java.lang.Object r15 = r13.next()
            com.google.android.gms.internal.measurement.G0 r15 = (com.google.android.gms.internal.measurement.G0) r15
            r17 = r0
            com.google.android.gms.internal.measurement.e1 r0 = com.google.android.gms.internal.measurement.C0795f1.p()
            int r22 = r15.p()
            r23 = r4
            int r4 = r22 + (-1)
            r22 = r9
            r9 = 1
            if (r4 == r9) goto L546
            r9 = 2
            if (r4 == r9) goto L541
            r9 = 4
            r25 = r13
            r13 = 3
            if (r4 == r13) goto L53f
            if (r4 == r9) goto L53d
            r4 = 1
            goto L54a
        L53d:
            r4 = 5
            goto L54a
        L53f:
            r4 = r9
            goto L54a
        L541:
            r25 = r13
            r13 = 3
            r4 = r13
            goto L54a
        L546:
            r25 = r13
            r13 = 3
            r4 = 2
        L54a:
            r0.h(r4)
            int r4 = r15.r()
            int r4 = r4 + (-1)
            r9 = 1
            if (r4 == r9) goto L55b
            r9 = 2
            if (r4 == r9) goto L55c
            r13 = 1
            goto L55c
        L55b:
            r13 = 2
        L55c:
            r0.i(r13)
            com.google.android.gms.internal.measurement.q2 r0 = r0.e()
            com.google.android.gms.internal.measurement.f1 r0 = (com.google.android.gms.internal.measurement.C0795f1) r0
            r14.add(r0)
            r0 = r17
            r9 = r22
            r4 = r23
            r13 = r25
            goto L511
        L571:
            r12.h(r14)
            r8.E(r12)
            com.google.android.gms.internal.measurement.q2 r0 = r8.e()
            com.google.android.gms.internal.measurement.s1 r0 = (com.google.android.gms.internal.measurement.C0859s1) r0
            java.lang.Object r4 = r5.second
            java.lang.Long r4 = (java.lang.Long) r4
            android.util.Pair r0 = android.util.Pair.create(r0, r4)
            r7.add(r0)
            r0 = r17
            r9 = r22
            r4 = r23
            goto L4a8
        L590:
            r12 = r7
            goto L59a
        L592:
            if (r14 == 0) goto L597
            r14.close()
        L597:
            throw r0
        L598:
            r16 = 34
        L59a:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto Laea
            goto L5a3
        L5a1:
            r16 = 34
        L5a3:
            O3.J0 r0 = r33.a(r34)
            O3.I0 r4 = O3.I0.AD_STORAGE
            boolean r0 = r0.i(r4)
            if (r0 == 0) goto L605
            java.util.Iterator r0 = r12.iterator()
        L5b3:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L5d2
            java.lang.Object r5 = r0.next()
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r5 = r5.first
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5
            java.lang.String r7 = r5.v()
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L5b3
            java.lang.String r0 = r5.v()
            goto L5d3
        L5d2:
            r0 = 0
        L5d3:
            if (r0 == 0) goto L605
            r8 = 0
        L5d6:
            int r5 = r12.size()
            if (r8 >= r5) goto L605
            java.lang.Object r5 = r12.get(r8)
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r5 = r5.first
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5
            java.lang.String r7 = r5.v()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L5f2
        L5f0:
            r9 = 0
            goto L602
        L5f2:
            java.lang.String r5 = r5.v()
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5f0
            r9 = 0
            java.util.List r12 = r12.subList(r9, r8)
            goto L606
        L602:
            int r8 = r8 + 1
            goto L5d6
        L605:
            r9 = 0
        L606:
            com.google.android.gms.internal.measurement.p1 r0 = com.google.android.gms.internal.measurement.C0850q1.w()
            int r5 = r12.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = r12.size()
            r7.<init>(r8)
            O3.g r8 = r1.d0()
            boolean r8 = r8.p(r6)
            if (r8 == 0) goto L62d
            O3.J0 r8 = r33.a(r34)
            boolean r8 = r8.i(r4)
            if (r8 == 0) goto L62d
            r8 = 1
            goto L62e
        L62d:
            r8 = r9
        L62e:
            O3.J0 r13 = r33.a(r34)
            boolean r4 = r13.i(r4)
            O3.J0 r13 = r33.a(r34)
            boolean r11 = r13.i(r11)
            com.google.android.gms.internal.measurement.h4 r13 = com.google.android.gms.internal.measurement.h4.f10870r
            G4.g r13 = r13.f10871q
            java.lang.Object r13 = r13.f2014q
            com.google.android.gms.internal.measurement.i4 r13 = (com.google.android.gms.internal.measurement.i4) r13
            O3.g r13 = r1.d0()
            O3.E r14 = O3.F.f4386M0
            boolean r13 = r13.y(r6, r14)
            O3.Q1 r14 = r1.f4616z
            O3.P1 r15 = r14.p(r6)
            r17 = r4
        L658:
            O3.t0 r4 = r1.f4582B
            if (r9 >= r5) goto L801
            java.lang.Object r22 = r12.get(r9)
            r23 = r4
            r4 = r22
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r4 = r4.first
            com.google.android.gms.internal.measurement.s1 r4 = (com.google.android.gms.internal.measurement.C0859s1) r4
            com.google.android.gms.internal.measurement.p2 r4 = r4.i()
            com.google.android.gms.internal.measurement.r1 r4 = (com.google.android.gms.internal.measurement.C0854r1) r4
            java.lang.Object r22 = r12.get(r9)
            r24 = r5
            r5 = r22
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            r7.add(r5)
            O3.g r5 = r1.d0()
            r5.t()
            r4.s()
            r4.b()
            com.google.android.gms.internal.measurement.q2 r5 = r4.f11012r
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5
            r5.f0(r2)
            r23.getClass()
            r4.I()
            if (r8 != 0) goto L6a7
            r4.b()
            com.google.android.gms.internal.measurement.q2 r5 = r4.f11012r
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5
            r5.S0()
        L6a7:
            if (r17 != 0) goto L6bd
            r4.b()
            com.google.android.gms.internal.measurement.q2 r5 = r4.f11012r
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5
            r5.z1()
            r4.b()
            com.google.android.gms.internal.measurement.q2 r5 = r4.f11012r
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5
            r5.B1()
        L6bd:
            if (r11 != 0) goto L6c9
            r4.b()
            com.google.android.gms.internal.measurement.q2 r5 = r4.f11012r
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5
            r5.D1()
        L6c9:
            r1.v(r4, r6)
            if (r13 != 0) goto L6d8
            r4.b()
            com.google.android.gms.internal.measurement.q2 r5 = r4.f11012r
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5
            r5.Z0()
        L6d8:
            if (r11 != 0) goto L6e4
            r4.b()
            com.google.android.gms.internal.measurement.q2 r5 = r4.f11012r
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5
            r5.L1()
        L6e4:
            com.google.android.gms.internal.measurement.q2 r5 = r4.f11012r
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5
            java.lang.String r5 = r5.v()
            boolean r22 = android.text.TextUtils.isEmpty(r5)
            if (r22 != 0) goto L707
            r22 = r8
            java.lang.String r8 = "00000000-0000-0000-0000-000000000000"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L6fd
            goto L709
        L6fd:
            r27 = r9
            r29 = r11
            r28 = r12
            r30 = r13
            goto L7b2
        L707:
            r22 = r8
        L709:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r8 = r4.U()
            r5.<init>(r8)
            java.util.Iterator r8 = r5.iterator()
            r26 = r8
            r27 = r9
            r8 = 0
            r9 = 0
            r23 = 0
            r25 = 0
        L720:
            boolean r28 = r26.hasNext()
            if (r28 == 0) goto L78c
            java.lang.Object r28 = r26.next()
            r29 = r11
            r11 = r28
            com.google.android.gms.internal.measurement.k1 r11 = (com.google.android.gms.internal.measurement.C0820k1) r11
            r28 = r12
            java.lang.String r12 = r11.s()
            r30 = r13
            java.lang.String r13 = "_fx"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L74e
            r26.remove()
            r12 = r28
            r11 = r29
            r13 = r30
            r23 = 1
        L74b:
            r25 = 1
            goto L720
        L74e:
            java.lang.String r12 = r11.s()
            boolean r12 = r10.equals(r12)
            if (r12 == 0) goto L785
            r1.i0()
            java.lang.String r12 = "_pfo"
            com.google.android.gms.internal.measurement.n1 r12 = O3.C0270b0.w(r11, r12)
            if (r12 == 0) goto L76b
            long r12 = r12.u()
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
        L76b:
            r1.i0()
            java.lang.String r12 = "_uwa"
            com.google.android.gms.internal.measurement.n1 r11 = O3.C0270b0.w(r11, r12)
            if (r11 == 0) goto L77e
            long r11 = r11.u()
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
        L77e:
            r12 = r28
            r11 = r29
            r13 = r30
            goto L74b
        L785:
            r12 = r28
            r11 = r29
            r13 = r30
            goto L720
        L78c:
            r29 = r11
            r28 = r12
            r30 = r13
            if (r23 == 0) goto L7a8
            r4.b()
            com.google.android.gms.internal.measurement.q2 r11 = r4.f11012r
            com.google.android.gms.internal.measurement.s1 r11 = (com.google.android.gms.internal.measurement.C0859s1) r11
            r11.a0()
            r4.b()
            com.google.android.gms.internal.measurement.q2 r11 = r4.f11012r
            com.google.android.gms.internal.measurement.s1 r11 = (com.google.android.gms.internal.measurement.C0859s1) r11
            r11.Z(r5)
        L7a8:
            if (r25 == 0) goto L7b2
            java.lang.String r5 = r4.o()
            r11 = 1
            r1.u(r5, r11, r8, r9)
        L7b2:
            int r5 = r4.V()
            if (r5 != 0) goto L7b9
            goto L7f3
        L7b9:
            O3.g r5 = r1.d0()
            O3.E r8 = O3.F.f4367C0
            boolean r5 = r5.y(r6, r8)
            if (r5 == 0) goto L7da
            com.google.android.gms.internal.measurement.q2 r5 = r4.e()
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C0859s1) r5
            byte[] r5 = r5.a()
            O3.b0 r8 = r1.i0()
            long r8 = r8.Z(r5)
            r4.P(r8)
        L7da:
            com.google.android.gms.internal.measurement.z1 r5 = r15.b()
            if (r5 == 0) goto L7e3
            r4.B(r5)
        L7e3:
            r0.b()
            com.google.android.gms.internal.measurement.q2 r5 = r0.f11012r
            com.google.android.gms.internal.measurement.q1 r5 = (com.google.android.gms.internal.measurement.C0850q1) r5
            com.google.android.gms.internal.measurement.q2 r4 = r4.e()
            com.google.android.gms.internal.measurement.s1 r4 = (com.google.android.gms.internal.measurement.C0859s1) r4
            r5.z(r4)
        L7f3:
            int r9 = r27 + 1
            r8 = r22
            r5 = r24
            r12 = r28
            r11 = r29
            r13 = r30
            goto L658
        L801:
            r23 = r4
            com.google.android.gms.internal.measurement.q2 r4 = r0.f11012r
            com.google.android.gms.internal.measurement.q1 r4 = (com.google.android.gms.internal.measurement.C0850q1) r4
            int r4 = r4.q()
            if (r4 != 0) goto L81b
            r1.p(r7)
            r5 = 0
            java.util.List r7 = java.util.Collections.EMPTY_LIST
            r2 = 0
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r1.x(r2, r3, r4, r5, r6, r7)
            return
        L81b:
            com.google.android.gms.internal.measurement.q2 r4 = r0.e()
            com.google.android.gms.internal.measurement.q1 r4 = (com.google.android.gms.internal.measurement.C0850q1) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            O3.i1 r8 = r15.f4553c
            O3.i1 r9 = O3.EnumC0292i1.SGTM_CLIENT
            if (r8 != r9) goto L82e
            r9 = 1
            goto L82f
        L82e:
            r9 = 0
        L82f:
            O3.i1 r10 = O3.EnumC0292i1.SGTM
            if (r8 == r10) goto L83b
            if (r9 == 0) goto L837
            r9 = 1
            goto L83b
        L837:
            r13 = 0
        L838:
            r0 = r5
            goto La95
        L83b:
            com.google.android.gms.internal.measurement.q2 r4 = r0.e()
            com.google.android.gms.internal.measurement.q1 r4 = (com.google.android.gms.internal.measurement.C0850q1) r4
            java.util.List r4 = r4.p()
            java.util.Iterator r4 = r4.iterator()
        L849:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L864
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.measurement.s1 r8 = (com.google.android.gms.internal.measurement.C0859s1) r8
            boolean r8 = r8.N()
            if (r8 == 0) goto L849
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            goto L865
        L864:
            r4 = 0
        L865:
            com.google.android.gms.internal.measurement.q2 r8 = r0.e()
            com.google.android.gms.internal.measurement.q1 r8 = (com.google.android.gms.internal.measurement.C0850q1) r8
            O3.p0 r10 = r1.c()
            r10.o()
            r1.k0()
            com.google.android.gms.internal.measurement.p1 r10 = com.google.android.gms.internal.measurement.C0850q1.x(r8)
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 != 0) goto L889
            r10.b()
            com.google.android.gms.internal.measurement.q2 r11 = r10.f11012r
            com.google.android.gms.internal.measurement.q1 r11 = (com.google.android.gms.internal.measurement.C0850q1) r11
            r11.C(r4)
        L889:
            O3.l0 r11 = r1.e0()
            java.lang.String r11 = r11.B(r6)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L89a
            r10.i(r11)
        L89a:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r8 = r8.p()
            java.util.Iterator r8 = r8.iterator()
        L8a7:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L8cb
            java.lang.Object r12 = r8.next()
            com.google.android.gms.internal.measurement.s1 r12 = (com.google.android.gms.internal.measurement.C0859s1) r12
            com.google.android.gms.internal.measurement.r1 r12 = com.google.android.gms.internal.measurement.C0859s1.V(r12)
            r12.b()
            com.google.android.gms.internal.measurement.q2 r13 = r12.f11012r
            com.google.android.gms.internal.measurement.s1 r13 = (com.google.android.gms.internal.measurement.C0859s1) r13
            r13.S0()
            com.google.android.gms.internal.measurement.q2 r12 = r12.e()
            com.google.android.gms.internal.measurement.s1 r12 = (com.google.android.gms.internal.measurement.C0859s1) r12
            r11.add(r12)
            goto L8a7
        L8cb:
            r10.b()
            com.google.android.gms.internal.measurement.q2 r8 = r10.f11012r
            com.google.android.gms.internal.measurement.q1 r8 = (com.google.android.gms.internal.measurement.C0850q1) r8
            r8.B()
            r10.b()
            com.google.android.gms.internal.measurement.q2 r8 = r10.f11012r
            com.google.android.gms.internal.measurement.q1 r8 = (com.google.android.gms.internal.measurement.C0850q1) r8
            r8.A(r11)
            O3.X r8 = r1.b()
            O3.V r8 = r8.v()
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 == 0) goto L8f0
            java.lang.String r11 = "null"
            goto L8f4
        L8f0:
            java.lang.String r11 = r10.h()
        L8f4:
            java.lang.String r12 = "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: "
            r8.c(r11, r12)
            com.google.android.gms.internal.measurement.q2 r8 = r10.e()
            com.google.android.gms.internal.measurement.q1 r8 = (com.google.android.gms.internal.measurement.C0850q1) r8
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            if (r10 != 0) goto La00
            com.google.android.gms.internal.measurement.q2 r0 = r0.e()
            com.google.android.gms.internal.measurement.q1 r0 = (com.google.android.gms.internal.measurement.C0850q1) r0
            O3.p0 r10 = r1.c()
            r10.o()
            r1.k0()
            com.google.android.gms.internal.measurement.p1 r10 = com.google.android.gms.internal.measurement.C0850q1.w()
            O3.X r11 = r1.b()
            O3.V r11 = r11.v()
            java.lang.String r12 = "[sgtm] Processing Google Signal, sgtmJoinId:"
            r11.c(r4, r12)
            r10.b()
            com.google.android.gms.internal.measurement.q2 r11 = r10.f11012r
            com.google.android.gms.internal.measurement.q1 r11 = (com.google.android.gms.internal.measurement.C0850q1) r11
            r11.C(r4)
            java.util.List r0 = r0.p()
            java.util.Iterator r0 = r0.iterator()
        L938:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L975
            java.lang.Object r4 = r0.next()
            com.google.android.gms.internal.measurement.s1 r4 = (com.google.android.gms.internal.measurement.C0859s1) r4
            com.google.android.gms.internal.measurement.r1 r11 = com.google.android.gms.internal.measurement.C0859s1.U()
            java.lang.String r12 = r4.O()
            r11.b()
            com.google.android.gms.internal.measurement.q2 r13 = r11.f11012r
            com.google.android.gms.internal.measurement.s1 r13 = (com.google.android.gms.internal.measurement.C0859s1) r13
            r13.R0(r12)
            int r4 = r4.K0()
            r11.b()
            com.google.android.gms.internal.measurement.q2 r12 = r11.f11012r
            com.google.android.gms.internal.measurement.s1 r12 = (com.google.android.gms.internal.measurement.C0859s1) r12
            r12.j1(r4)
            r10.b()
            com.google.android.gms.internal.measurement.q2 r4 = r10.f11012r
            com.google.android.gms.internal.measurement.q1 r4 = (com.google.android.gms.internal.measurement.C0850q1) r4
            com.google.android.gms.internal.measurement.q2 r11 = r11.e()
            com.google.android.gms.internal.measurement.s1 r11 = (com.google.android.gms.internal.measurement.C0859s1) r11
            r4.z(r11)
            goto L938
        L975:
            com.google.android.gms.internal.measurement.q2 r0 = r10.e()
            com.google.android.gms.internal.measurement.q1 r0 = (com.google.android.gms.internal.measurement.C0850q1) r0
            O3.T1 r4 = r14.f4510s
            O3.l0 r4 = r4.e0()
            java.lang.String r4 = r4.B(r6)
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            O3.i1 r11 = O3.EnumC0292i1.GOOGLE_SIGNAL
            O3.i1 r12 = O3.EnumC0292i1.GOOGLE_SIGNAL_PENDING
            if (r10 != 0) goto L9e5
            O3.E r10 = O3.F.f4455s
            r13 = 0
            java.lang.Object r10 = r10.a(r13)
            java.lang.String r10 = (java.lang.String) r10
            android.net.Uri r10 = android.net.Uri.parse(r10)
            android.net.Uri$Builder r13 = r10.buildUpon()
            java.lang.String r10 = r10.getAuthority()
            java.lang.String r14 = java.lang.String.valueOf(r4)
            int r14 = r14.length()
            java.lang.String r17 = java.lang.String.valueOf(r10)
            r18 = 1
            int r14 = r14 + 1
            int r17 = r17.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r14 = r14 + r17
            r6.<init>(r14)
            r6.append(r4)
            java.lang.String r4 = "."
            r6.append(r4)
            r6.append(r10)
            java.lang.String r4 = r6.toString()
            r13.authority(r4)
            O3.P1 r4 = new O3.P1
            android.net.Uri r6 = r13.build()
            java.lang.String r6 = r6.toString()
            if (r9 == 0) goto L9de
            r11 = r12
        L9de:
            java.util.Map r10 = java.util.Collections.EMPTY_MAP
            r13 = 0
            r4.<init>(r6, r10, r11, r13)
            goto L9f8
        L9e5:
            r13 = 0
            O3.P1 r4 = new O3.P1
            O3.E r6 = O3.F.f4455s
            java.lang.Object r6 = r6.a(r13)
            java.lang.String r6 = (java.lang.String) r6
            if (r9 == 0) goto L9f3
            r11 = r12
        L9f3:
            java.util.Map r10 = java.util.Collections.EMPTY_MAP
            r4.<init>(r6, r10, r11, r13)
        L9f8:
            android.util.Pair r0 = android.util.Pair.create(r0, r4)
            r5.add(r0)
            goto La01
        La00:
            r13 = 0
        La01:
            if (r9 == 0) goto La90
            com.google.android.gms.internal.measurement.p2 r0 = r8.i()
            com.google.android.gms.internal.measurement.p1 r0 = (com.google.android.gms.internal.measurement.C0845p1) r0
            r4 = 0
        La0a:
            int r6 = r8.q()
            if (r4 >= r6) goto La33
            com.google.android.gms.internal.measurement.s1 r6 = r8.r(r4)
            com.google.android.gms.internal.measurement.p2 r6 = r6.i()
            com.google.android.gms.internal.measurement.r1 r6 = (com.google.android.gms.internal.measurement.C0854r1) r6
            r6.b0()
            r6.C(r2)
            r0.b()
            com.google.android.gms.internal.measurement.q2 r9 = r0.f11012r
            com.google.android.gms.internal.measurement.q1 r9 = (com.google.android.gms.internal.measurement.C0850q1) r9
            com.google.android.gms.internal.measurement.q2 r6 = r6.e()
            com.google.android.gms.internal.measurement.s1 r6 = (com.google.android.gms.internal.measurement.C0859s1) r6
            r9.y(r4, r6)
            int r4 = r4 + 1
            goto La0a
        La33:
            com.google.android.gms.internal.measurement.q2 r0 = r0.e()
            com.google.android.gms.internal.measurement.q1 r0 = (com.google.android.gms.internal.measurement.C0850q1) r0
            android.util.Pair r0 = android.util.Pair.create(r0, r15)
            r5.add(r0)
            r1.p(r7)
            r4 = 0
            r7 = r5
            r5 = 0
            r2 = 0
            r3 = 204(0xcc, float:2.86E-43)
            r6 = r34
            r1.x(r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = r15.a()
            boolean r0 = r1.s(r6, r0)
            if (r0 == 0) goto Laea
            O3.X r0 = r1.b()
            O3.V r0 = r0.v()
            java.lang.String r2 = "[sgtm] Sending sgtm batches available notification to app"
            r0.c(r6, r2)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = "com.google.android.gms.measurement.BATCHES_AVAILABLE"
            r0.setAction(r2)
            r0.setPackage(r6)
            android.content.Context r2 = r23.d()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = r16
            if (r3 >= r4) goto La80
            r2.sendBroadcast(r0)
            goto Laea
        La80:
            android.app.BroadcastOptions r3 = O3.AbstractC0320s0.d()
            android.app.BroadcastOptions r3 = O3.AbstractC0320s0.e(r3)
            android.os.Bundle r3 = O3.AbstractC0320s0.h(r3)
            O3.AbstractC0320s0.m(r2, r0, r3)
            goto Laea
        La90:
            r6 = r34
            r4 = r8
            goto L838
        La95:
            O3.b0 r5 = r1.f4608r
            S(r5)
            boolean r8 = r5.I()
            if (r8 == 0) goto Laea
            O3.X r8 = r1.b()
            java.lang.String r8 = r8.y()
            r9 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r9)
            if (r8 == 0) goto Lab8
            O3.b0 r8 = r1.i0()
            java.lang.String r14 = r8.R(r4)
            goto Lab9
        Lab8:
            r14 = r13
        Lab9:
            r1.i0()
            byte[] r8 = r4.a()
            r1.p(r7)
            O3.y1 r7 = r1.f4615y
            O3.f0 r7 = r7.f5167z
            r7.b(r2)
            O3.X r2 = r1.b()
            O3.V r2 = r2.v()
            int r3 = r8.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            r2.e(r7, r6, r3, r14)
            r9 = 1
            r1.f4591K = r9
            S(r5)
            B0.G0 r2 = new B0.G0
            r2.<init>(r1, r6, r0)
            r5.N(r6, r15, r4, r2)
        Laea:
            return
        Laeb:
            if (r14 == 0) goto Laf0
            r14.close()
        Laf0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T1.r(java.lang.String, long):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean s(String str, String str2) {
        C0305n c0305n = this.f4609s;
        S(c0305n);
        C0273c0 c0273c0S0 = c0305n.s0(str);
        HashMap map = this.f4601U;
        if (c0273c0S0 != null && j0().O(str, c0273c0S0.C())) {
            map.remove(str2);
            return true;
        }
        S1 s12 = (S1) map.get(str2);
        if (s12 != null) {
            s12.f4568a.e().getClass();
            if (System.currentTimeMillis() < s12.f4570c) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(String str) {
        c().o();
        k0();
        this.f4592L = true;
        try {
            C0323t0 c0323t0 = this.f4582B;
            c0323t0.getClass();
            Boolean bool = c0323t0.o().f5110v;
            if (bool == null) {
                b().f4673z.b("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                b().f4670w.b("Upload called in the client side when service should be used");
            } else if (this.f4585E > 0) {
                L();
            } else {
                C0270b0 c0270b0 = this.f4608r;
                S(c0270b0);
                if (c0270b0.I()) {
                    C0305n c0305n = this.f4609s;
                    S(c0305n);
                    if (c0305n.u(str)) {
                        C0305n c0305n2 = this.f4609s;
                        S(c0305n2);
                        AbstractC1887A.d(str);
                        c0305n2.o();
                        c0305n2.p();
                        List listT = c0305n2.t(str, M1.W(EnumC0292i1.GOOGLE_SIGNAL), 1);
                        U1 u12 = listT.isEmpty() ? null : (U1) listT.get(0);
                        if (u12 != null) {
                            C0850q1 c0850q1 = u12.f4633b;
                            b().f4666E.e("[sgtm] Uploading data from upload queue. appId, type, url", str, u12.f4636e, u12.f4634c);
                            byte[] bArrA = c0850q1.a();
                            if (Log.isLoggable(b().y(), 2)) {
                                C0270b0 c0270b02 = this.f4613w;
                                S(c0270b02);
                                b().f4666E.e("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrA.length), c0270b02.R(c0850q1));
                            }
                            P1 p12 = new P1(u12.f4634c, u12.f4635d, u12.f4636e, null);
                            this.f4591K = true;
                            C0270b0 c0270b03 = this.f4608r;
                            S(c0270b03);
                            c0270b03.N(str, p12, c0850q1, new B0.G0(this, str, u12));
                        }
                    } else {
                        b().f4666E.c(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    b().f4666E.b("Network not connected, ignoring upload request");
                    L();
                }
            }
            this.f4592L = false;
            M();
        } catch (Throwable th) {
            this.f4592L = false;
            M();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(String str, boolean z5, Long l7, Long l8) {
        C0305n c0305n = this.f4609s;
        S(c0305n);
        C0273c0 c0273c0S0 = c0305n.s0(str);
        if (c0273c0S0 != null) {
            C0323t0 c0323t0 = c0273c0S0.f4793a;
            C0312p0 c0312p0 = c0323t0.f5078w;
            C0323t0.l(c0312p0);
            c0312p0.o();
            c0273c0S0.f4790Q |= c0273c0S0.f4814y != z5;
            c0273c0S0.f4814y = z5;
            C0312p0 c0312p02 = c0323t0.f5078w;
            C0323t0.l(c0312p02);
            c0312p02.o();
            c0273c0S0.f4790Q |= !Objects.equals(c0273c0S0.f4815z, l7);
            c0273c0S0.f4815z = l7;
            C0312p0 c0312p03 = c0323t0.f5078w;
            C0323t0.l(c0312p03);
            c0312p03.o();
            c0273c0S0.f4790Q |= !Objects.equals(c0273c0S0.f4774A, l8);
            c0273c0S0.f4774A = l8;
            if (c0273c0S0.o()) {
                C0305n c0305n2 = this.f4609s;
                S(c0305n2);
                c0305n2.t0(c0273c0S0, false);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(com.google.android.gms.internal.measurement.C0854r1 r9, java.lang.String r10) {
        /*
            r8 = this;
            O3.l0 r0 = r8.f4607q
            S(r0)
            r0.o()
            r0.u(r10)
            r.e r1 = r0.f4951v
            java.lang.Object r2 = r1.get(r10)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L21
            r9.b()
            com.google.android.gms.internal.measurement.q2 r3 = r9.f11012r
            com.google.android.gms.internal.measurement.s1 r3 = (com.google.android.gms.internal.measurement.C0859s1) r3
            java.util.Set r2 = (java.util.Set) r2
            r3.a1(r2)
        L21:
            S(r0)
            r0.o()
            r0.u(r10)
            java.lang.Object r2 = r1.get(r10)
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.get(r10)
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r3 = "device_model"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L4d
            java.lang.Object r2 = r1.get(r10)
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r3 = "device_info"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L4d
            goto L57
        L4d:
            r9.b()
            com.google.android.gms.internal.measurement.q2 r2 = r9.f11012r
            com.google.android.gms.internal.measurement.s1 r2 = (com.google.android.gms.internal.measurement.C0859s1) r2
            r2.q1()
        L57:
            S(r0)
            boolean r2 = r0.G(r10)
            r3 = -1
            if (r2 == 0) goto L86
            com.google.android.gms.internal.measurement.q2 r2 = r9.f11012r
            com.google.android.gms.internal.measurement.s1 r2 = (com.google.android.gms.internal.measurement.C0859s1) r2
            java.lang.String r2 = r2.i2()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L86
            java.lang.String r4 = "."
            int r4 = r2.indexOf(r4)
            if (r4 == r3) goto L86
            r5 = 0
            java.lang.String r2 = r2.substring(r5, r4)
            r9.b()
            com.google.android.gms.internal.measurement.q2 r4 = r9.f11012r
            com.google.android.gms.internal.measurement.s1 r4 = (com.google.android.gms.internal.measurement.C0859s1) r4
            r4.o0(r2)
        L86:
            S(r0)
            r0.o()
            r0.u(r10)
            java.lang.Object r2 = r1.get(r10)
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r1.get(r10)
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r4 = "user_id"
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto Lb5
            java.lang.String r2 = "_id"
            int r2 = O3.C0270b0.c0(r9, r2)
            if (r2 == r3) goto Lb5
            r9.b()
            com.google.android.gms.internal.measurement.q2 r3 = r9.f11012r
            com.google.android.gms.internal.measurement.s1 r3 = (com.google.android.gms.internal.measurement.C0859s1) r3
            r3.e0(r2)
        Lb5:
            S(r0)
            r0.o()
            r0.u(r10)
            java.lang.Object r2 = r1.get(r10)
            if (r2 == 0) goto Ldc
            java.lang.Object r2 = r1.get(r10)
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r3 = "google_signals"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto Ldc
            r9.b()
            com.google.android.gms.internal.measurement.q2 r2 = r9.f11012r
            com.google.android.gms.internal.measurement.s1 r2 = (com.google.android.gms.internal.measurement.C0859s1) r2
            r2.S0()
        Ldc:
            S(r0)
            boolean r2 = r0.H(r10)
            if (r2 == 0) goto L13d
            r9.b()
            com.google.android.gms.internal.measurement.q2 r2 = r9.f11012r
            com.google.android.gms.internal.measurement.s1 r2 = (com.google.android.gms.internal.measurement.C0859s1) r2
            r2.D1()
            O3.J0 r2 = r8.a(r10)
            O3.I0 r3 = O3.I0.ANALYTICS_STORAGE
            boolean r2 = r2.i(r3)
            if (r2 == 0) goto L13d
            java.util.HashMap r2 = r8.f4600T
            java.lang.Object r3 = r2.get(r10)
            O3.R1 r3 = (O3.R1) r3
            if (r3 == 0) goto L121
            long r4 = r3.f4564b
            O3.g r6 = r8.d0()
            O3.E r7 = O3.F.f4440k0
            long r6 = r6.v(r10, r7)
            long r6 = r6 + r4
            B3.a r4 = r8.e()
            r4.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 >= 0) goto L131
        L121:
            O3.R1 r3 = new O3.R1
            O3.Y1 r4 = r8.j0()
            java.lang.String r4 = r4.g0()
            r3.<init>(r8, r4)
            r2.put(r10, r3)
        L131:
            java.lang.String r2 = r3.f4563a
            r9.b()
            com.google.android.gms.internal.measurement.q2 r3 = r9.f11012r
            com.google.android.gms.internal.measurement.s1 r3 = (com.google.android.gms.internal.measurement.C0859s1) r3
            r3.b1(r2)
        L13d:
            S(r0)
            r0.o()
            r0.u(r10)
            java.lang.Object r0 = r1.get(r10)
            if (r0 == 0) goto L164
            java.lang.Object r10 = r1.get(r10)
            java.util.Set r10 = (java.util.Set) r10
            java.lang.String r0 = "enhanced_user_id"
            boolean r10 = r10.contains(r0)
            if (r10 == 0) goto L164
            r9.b()
            com.google.android.gms.internal.measurement.q2 r9 = r9.f11012r
            com.google.android.gms.internal.measurement.s1 r9 = (com.google.android.gms.internal.measurement.C0859s1) r9
            r9.Z0()
        L164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T1.v(com.google.android.gms.internal.measurement.r1, java.lang.String):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w(String str, C0830m1 c0830m1, Bundle bundle, String str2) {
        int iMax;
        List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (Y1.M(((C0835n1) c0830m1.f11012r).q()) || Y1.M(str)) {
            C0284g c0284gD0 = d0();
            c0284gD0.getClass();
            iMax = Math.max(Math.max(Math.min(c0284gD0.w(str2, F.f4433h0), 500), 100), 256);
        } else {
            C0284g c0284gD02 = d0();
            c0284gD02.getClass();
            iMax = Math.max(Math.min(c0284gD02.w(str2, F.f4433h0), 500), 100);
        }
        long j = iMax;
        long jCodePointCount = ((C0835n1) c0830m1.f11012r).s().codePointCount(0, ((C0835n1) c0830m1.f11012r).s().length());
        j0();
        String strQ = ((C0835n1) c0830m1.f11012r).q();
        d0();
        String strT = Y1.t(strQ, true, 40);
        if (jCodePointCount <= j || listUnmodifiableList.contains(((C0835n1) c0830m1.f11012r).q())) {
            return;
        }
        if ("_ev".equals(((C0835n1) c0830m1.f11012r).q())) {
            j0();
            String strS = ((C0835n1) c0830m1.f11012r).s();
            C0284g c0284gD03 = d0();
            c0284gD03.getClass();
            bundle.putString("_ev", Y1.t(strS, true, Math.max(Math.max(Math.min(c0284gD03.w(str2, F.f4433h0), 500), 100), 256)));
            return;
        }
        b().f4663B.d(strT, Long.valueOf(jCodePointCount), "Param value is too long; discarded. Name, value length");
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strT);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((C0835n1) c0830m1.f11012r).q());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0153 A[EDGE_INSN: B:105:0x0153->B:52:0x0153 BREAK  A[LOOP:0: B:33:0x00f5->B:107:0x00f5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[Catch: all -> 0x0018, TryCatch #3 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:16:0x0032, B:21:0x0082, B:20:0x0070, B:22:0x008f, B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9, B:95:0x0266), top: B:104:0x0015, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f A[Catch: all -> 0x0018, PHI: r0
  0x008f: PHI (r0v2 int) = (r0v0 int), (r0v36 int) binds: [B:9:0x0025, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:16:0x0032, B:21:0x0082, B:20:0x0070, B:22:0x008f, B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9, B:95:0x0266), top: B:104:0x0015, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff A[Catch: all -> 0x0150, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b8 A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f2 A[Catch: all -> 0x0150, TRY_LEAVE, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0230 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0241 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(boolean r18, int r19, java.lang.Throwable r20, byte[] r21, java.lang.String r22, java.util.List r23) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            O3.b0 r9 = r1.f4608r
            O3.p0 r3 = r1.c()
            r3.o()
            r1.k0()
            r10 = 0
            if (r21 != 0) goto L1b
            byte[] r3 = new byte[r10]     // Catch: java.lang.Throwable -> L18
            goto L1d
        L18:
            r0 = move-exception
            goto L295
        L1b:
            r3 = r21
        L1d:
            java.util.ArrayList r11 = r1.f4595O     // Catch: java.lang.Throwable -> L18
            x3.AbstractC1887A.g(r11)     // Catch: java.lang.Throwable -> L18
            r12 = 0
            r1.f4595O = r12     // Catch: java.lang.Throwable -> L18
            if (r18 == 0) goto L8f
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 == r4) goto L30
            r4 = 204(0xcc, float:2.86E-43)
            if (r0 != r4) goto L32
            r0 = r4
        L30:
            if (r2 == 0) goto L8f
        L32:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L18
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L18
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L18
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L18
            r5 = 32
            int r3 = java.lang.Math.min(r5, r3)     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r4.substring(r10, r3)     // Catch: java.lang.Throwable -> L18
            O3.X r4 = r1.b()     // Catch: java.lang.Throwable -> L18
            O3.V r4 = r4.f4663B     // Catch: java.lang.Throwable -> L18
            java.lang.String r5 = "Network upload failed. Will retry later. code, error"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L18
            r4.e(r5, r6, r2, r3)     // Catch: java.lang.Throwable -> L18
            O3.y1 r2 = r1.f4615y     // Catch: java.lang.Throwable -> L18
            O3.f0 r2 = r2.f5167z     // Catch: java.lang.Throwable -> L18
            B3.a r3 = r1.e()     // Catch: java.lang.Throwable -> L18
            r3.getClass()     // Catch: java.lang.Throwable -> L18
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L18
            r2.b(r3)     // Catch: java.lang.Throwable -> L18
            r2 = 503(0x1f7, float:7.05E-43)
            if (r0 == r2) goto L70
            r2 = 429(0x1ad, float:6.01E-43)
            if (r0 != r2) goto L82
        L70:
            O3.y1 r0 = r1.f4615y     // Catch: java.lang.Throwable -> L18
            O3.f0 r0 = r0.f5165x     // Catch: java.lang.Throwable -> L18
            B3.a r2 = r1.e()     // Catch: java.lang.Throwable -> L18
            r2.getClass()     // Catch: java.lang.Throwable -> L18
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L18
            r0.b(r2)     // Catch: java.lang.Throwable -> L18
        L82:
            O3.n r0 = r1.f4609s     // Catch: java.lang.Throwable -> L18
            S(r0)     // Catch: java.lang.Throwable -> L18
            r0.z(r11)     // Catch: java.lang.Throwable -> L18
            r1.L()     // Catch: java.lang.Throwable -> L18
            goto L28f
        L8f:
            O3.X r2 = r1.b()     // Catch: java.lang.Throwable -> L18
            O3.V r2 = r2.f4666E     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "Network upload successful with code, uploadAttempted"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L18
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r18)     // Catch: java.lang.Throwable -> L18
            r2.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L18
            if (r18 == 0) goto Lba
            O3.y1 r2 = r1.f4615y     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            O3.f0 r2 = r2.f5166y     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            B3.a r4 = r1.e()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            r4.getClass()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            r2.b(r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            goto Lba
        Lb7:
            r0 = move-exception
            goto L266
        Lba:
            O3.y1 r2 = r1.f4615y     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            O3.f0 r2 = r2.f5167z     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            r13 = 0
            r2.b(r13)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            r1.L()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            if (r18 == 0) goto Ld9
            O3.X r2 = r1.b()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            O3.V r2 = r2.f4666E     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r4 = "Successful upload. Got network response. code, size"
            int r3 = r3.length     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            r2.d(r0, r3, r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            goto Le4
        Ld9:
            O3.X r0 = r1.b()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            O3.V r0 = r0.f4666E     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r2 = "Purged empty bundles"
            r0.b(r2)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
        Le4:
            O3.n r0 = r1.f4609s     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            S(r0)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            r0.c0()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L150
            r0.<init>()     // Catch: java.lang.Throwable -> L150
            java.util.Iterator r15 = r23.iterator()     // Catch: java.lang.Throwable -> L150
        Lf5:
            boolean r2 = r15.hasNext()     // Catch: java.lang.Throwable -> L150
            r3 = -1
            O3.i1 r5 = O3.EnumC0292i1.SGTM_CLIENT
            if (r2 == 0) goto L153
            java.lang.Object r2 = r15.next()     // Catch: java.lang.Throwable -> L150
            android.util.Pair r2 = (android.util.Pair) r2     // Catch: java.lang.Throwable -> L150
            java.lang.Object r6 = r2.first     // Catch: java.lang.Throwable -> L150
            com.google.android.gms.internal.measurement.q1 r6 = (com.google.android.gms.internal.measurement.C0850q1) r6     // Catch: java.lang.Throwable -> L150
            java.lang.Object r2 = r2.second     // Catch: java.lang.Throwable -> L150
            O3.P1 r2 = (O3.P1) r2     // Catch: java.lang.Throwable -> L150
            O3.i1 r7 = r2.f4553c     // Catch: java.lang.Throwable -> L150
            O3.i1 r8 = r2.f4553c
            if (r7 == r5) goto Lf5
            O3.n r5 = r1.f4609s     // Catch: java.lang.Throwable -> L150
            S(r5)     // Catch: java.lang.Throwable -> L150
            r7 = r5
            java.lang.String r5 = r2.f4551a     // Catch: java.lang.Throwable -> L150
            java.util.Map r2 = r2.f4552b     // Catch: java.lang.Throwable -> L150
            if (r2 != 0) goto L121
            java.util.Map r2 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L150
        L121:
            r16 = r7
            r7 = r8
            r8 = 0
            r13 = r3
            r4 = r6
            r3 = r22
            r6 = r2
            r2 = r16
            long r5 = r2.s(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L150
            O3.i1 r2 = O3.EnumC0292i1.GOOGLE_SIGNAL_PENDING     // Catch: java.lang.Throwable -> L150
            if (r7 != r2) goto L14d
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 == 0) goto L14d
            java.lang.String r2 = r4.t()     // Catch: java.lang.Throwable -> L150
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L150
            if (r2 != 0) goto L14d
            java.lang.String r2 = r4.t()     // Catch: java.lang.Throwable -> L150
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L150
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L150
        L14d:
            r13 = 0
            goto Lf5
        L150:
            r0 = move-exception
            goto L25d
        L153:
            r13 = r3
            java.util.Iterator r15 = r23.iterator()     // Catch: java.lang.Throwable -> L150
        L158:
            boolean r2 = r15.hasNext()     // Catch: java.lang.Throwable -> L150
            if (r2 == 0) goto L19c
            java.lang.Object r2 = r15.next()     // Catch: java.lang.Throwable -> L150
            android.util.Pair r2 = (android.util.Pair) r2     // Catch: java.lang.Throwable -> L150
            java.lang.Object r3 = r2.first     // Catch: java.lang.Throwable -> L150
            r4 = r3
            com.google.android.gms.internal.measurement.q1 r4 = (com.google.android.gms.internal.measurement.C0850q1) r4     // Catch: java.lang.Throwable -> L150
            java.lang.Object r2 = r2.second     // Catch: java.lang.Throwable -> L150
            O3.P1 r2 = (O3.P1) r2     // Catch: java.lang.Throwable -> L150
            O3.i1 r3 = r2.f4553c     // Catch: java.lang.Throwable -> L150
            if (r3 != r5) goto L199
            java.lang.String r3 = r4.t()     // Catch: java.lang.Throwable -> L150
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L150
            r8 = r3
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L150
            O3.n r3 = r1.f4609s     // Catch: java.lang.Throwable -> L150
            S(r3)     // Catch: java.lang.Throwable -> L150
            r6 = r5
            java.lang.String r5 = r2.f4551a     // Catch: java.lang.Throwable -> L150
            java.util.Map r7 = r2.f4552b     // Catch: java.lang.Throwable -> L150
            if (r7 != 0) goto L18a
            java.util.Map r7 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L150
        L18a:
            O3.i1 r2 = r2.f4553c     // Catch: java.lang.Throwable -> L150
            r16 = r6
            r6 = r7
            r7 = r2
            r2 = r3
            r3 = r22
            r2.s(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L150
            r5 = r16
            goto L158
        L199:
            r3 = r22
            goto L158
        L19c:
            r3 = r22
            r16 = r5
            O3.n r0 = r1.f4609s     // Catch: java.lang.Throwable -> L150
            S(r0)     // Catch: java.lang.Throwable -> L150
            O3.i1[] r2 = new O3.EnumC0292i1[]{r16}     // Catch: java.lang.Throwable -> L150
            O3.M1 r2 = O3.M1.W(r2)     // Catch: java.lang.Throwable -> L150
            r4 = 1
            java.util.List r0 = r0.t(r3, r2, r4)     // Catch: java.lang.Throwable -> L150
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L150
            if (r2 != 0) goto L1eb
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> L150
            O3.U1 r0 = (O3.U1) r0     // Catch: java.lang.Throwable -> L150
            long r4 = r0.f     // Catch: java.lang.Throwable -> L150
            B3.a r0 = r1.e()     // Catch: java.lang.Throwable -> L150
            r0.getClass()     // Catch: java.lang.Throwable -> L150
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L150
            O3.E r0 = O3.F.f4371F     // Catch: java.lang.Throwable -> L150
            java.lang.Object r0 = r0.a(r12)     // Catch: java.lang.Throwable -> L150
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L150
            long r15 = r0.longValue()     // Catch: java.lang.Throwable -> L150
            long r15 = r15 + r4
            int r0 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r0 <= 0) goto L1eb
            O3.X r0 = r1.b()     // Catch: java.lang.Throwable -> L150
            O3.V r0 = r0.f4673z     // Catch: java.lang.Throwable -> L150
            java.lang.String r2 = "[sgtm] client batches are queued too long. appId, creationTime"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L150
            r0.d(r3, r4, r2)     // Catch: java.lang.Throwable -> L150
        L1eb:
            int r2 = r11.size()     // Catch: java.lang.Throwable -> L150
            r0 = r10
        L1f0:
            if (r0 >= r2) goto L215
            java.lang.Object r4 = r11.get(r0)     // Catch: java.lang.Throwable -> L150
            int r5 = r0 + 1
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L150
            O3.n r0 = r1.f4609s     // Catch: java.lang.Throwable -> L150 android.database.sqlite.SQLiteException -> L208
            S(r0)     // Catch: java.lang.Throwable -> L150 android.database.sqlite.SQLiteException -> L208
            long r6 = r4.longValue()     // Catch: java.lang.Throwable -> L150 android.database.sqlite.SQLiteException -> L208
            r0.x(r6)     // Catch: java.lang.Throwable -> L150 android.database.sqlite.SQLiteException -> L208
        L206:
            r0 = r5
            goto L1f0
        L208:
            r0 = move-exception
            java.util.ArrayList r6 = r1.f4596P     // Catch: java.lang.Throwable -> L150
            if (r6 == 0) goto L214
            boolean r4 = r6.contains(r4)     // Catch: java.lang.Throwable -> L150
            if (r4 == 0) goto L214
            goto L206
        L214:
            throw r0     // Catch: java.lang.Throwable -> L150
        L215:
            O3.n r0 = r1.f4609s     // Catch: java.lang.Throwable -> L150
            S(r0)     // Catch: java.lang.Throwable -> L150
            r0.d0()     // Catch: java.lang.Throwable -> L150
            O3.n r0 = r1.f4609s     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            S(r0)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            r0.e0()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            r1.f4596P = r12     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            S(r9)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            boolean r0 = r9.I()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            if (r0 == 0) goto L241
            O3.n r0 = r1.f4609s     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            S(r0)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            boolean r0 = r0.u(r3)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            if (r0 == 0) goto L241
            r1.t(r3)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
        L23e:
            r2 = 0
            goto L25a
        L241:
            S(r9)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            boolean r0 = r9.I()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            if (r0 == 0) goto L254
            boolean r0 = r1.J()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            if (r0 == 0) goto L254
            r1.q()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            goto L23e
        L254:
            r1.f4597Q = r13     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            r1.L()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            goto L23e
        L25a:
            r1.f4585E = r2     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            goto L28f
        L25d:
            O3.n r2 = r1.f4609s     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            S(r2)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            r2.e0()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
            throw r0     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> Lb7
        L266:
            O3.X r2 = r1.b()     // Catch: java.lang.Throwable -> L18
            O3.V r2 = r2.f4670w     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "Database error while trying to delete uploaded bundles"
            r2.c(r0, r3)     // Catch: java.lang.Throwable -> L18
            B3.a r0 = r1.e()     // Catch: java.lang.Throwable -> L18
            r0.getClass()     // Catch: java.lang.Throwable -> L18
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L18
            r1.f4585E = r2     // Catch: java.lang.Throwable -> L18
            O3.X r0 = r1.b()     // Catch: java.lang.Throwable -> L18
            O3.V r0 = r0.f4666E     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "Disable upload, time"
            long r3 = r1.f4585E     // Catch: java.lang.Throwable -> L18
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L18
            r0.c(r3, r2)     // Catch: java.lang.Throwable -> L18
        L28f:
            r1.f4591K = r10
            r1.M()
            return
        L295:
            r1.f4591K = r10
            r1.M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T1.x(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(C0273c0 c0273c0) {
        C1554e c1554e;
        C1554e c1554e2;
        c().o();
        if (TextUtils.isEmpty(c0273c0.G())) {
            String strD = c0273c0.D();
            AbstractC1887A.g(strD);
            z(strD, 204, null, null, null);
            return;
        }
        String strD2 = c0273c0.D();
        AbstractC1887A.g(strD2);
        b().f4666E.c(strD2, "Fetching remote configuration");
        C0300l0 c0300l0 = this.f4607q;
        S(c0300l0);
        com.google.android.gms.internal.measurement.O0 o0A = c0300l0.A(strD2);
        S(c0300l0);
        c0300l0.o();
        String str = (String) c0300l0.f4948D.get(strD2);
        if (o0A != null) {
            if (TextUtils.isEmpty(str)) {
                c1554e2 = null;
            } else {
                c1554e2 = new C1554e(0);
                c1554e2.put("If-Modified-Since", str);
            }
            S(c0300l0);
            c0300l0.o();
            String str2 = (String) c0300l0.f4949E.get(strD2);
            if (!TextUtils.isEmpty(str2)) {
                if (c1554e2 == null) {
                    c1554e2 = new C1554e(0);
                }
                c1554e2.put("If-None-Match", str2);
            }
            c1554e = c1554e2;
        } else {
            c1554e = null;
        }
        this.f4590J = true;
        C0270b0 c0270b0 = this.f4608r;
        S(c0270b0);
        k3.c cVar = new k3.c(this);
        C0323t0 c0323t0 = (C0323t0) c0270b0.f4346r;
        c0270b0.o();
        c0270b0.p();
        Q1 q1 = c0270b0.f4510s.f4616z;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) F.f.a(null)).encodedAuthority((String) F.f4429g.a(null)).path("config/app/".concat(String.valueOf(c0273c0.G()))).appendQueryParameter("platform", "android");
        ((C0323t0) q1.f4346r).f5075t.t();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(130000L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            C0312p0 c0312p0 = c0323t0.f5078w;
            C0323t0.l(c0312p0);
            c0312p0.A(new RunnableC0267a0(c0270b0, c0273c0.D(), url, (byte[]) null, c1554e, cVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.d(X.w(c0273c0.D()), string, "Failed to parse config URL. Not fetching. appId");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:8:0x0030, B:18:0x004e, B:55:0x015d, B:26:0x006c, B:31:0x00c8, B:30:0x00b6, B:32:0x00cd, B:36:0x00de, B:40:0x00f4, B:42:0x010c, B:44:0x0127, B:46:0x0130, B:48:0x0136, B:49:0x013a, B:51:0x0143, B:53:0x0152, B:54:0x015a, B:43:0x0118, B:37:0x00e5, B:39:0x00ee), top: B:64:0x0030, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map r14) {
        /*
            r9 = this;
            O3.b0 r0 = r9.f4608r
            O3.p0 r1 = r9.c()
            r1.o()
            r9.k0()
            x3.AbstractC1887A.d(r10)
            r1 = 0
            if (r13 != 0) goto L18
            byte[] r13 = new byte[r1]     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r10 = move-exception
            goto L17c
        L18:
            O3.X r2 = r9.b()     // Catch: java.lang.Throwable -> L15
            O3.V r2 = r2.f4666E     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = "onConfigFetched. Response size"
            int r4 = r13.length     // Catch: java.lang.Throwable -> L15
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L15
            r2.c(r4, r3)     // Catch: java.lang.Throwable -> L15
            O3.n r2 = r9.f4609s     // Catch: java.lang.Throwable -> L15
            S(r2)     // Catch: java.lang.Throwable -> L15
            r2.c0()     // Catch: java.lang.Throwable -> L15
            O3.n r2 = r9.f4609s     // Catch: java.lang.Throwable -> L5f
            S(r2)     // Catch: java.lang.Throwable -> L5f
            O3.c0 r2 = r2.s0(r10)     // Catch: java.lang.Throwable -> L5f
            r3 = 200(0xc8, float:2.8E-43)
            r5 = 304(0x130, float:4.26E-43)
            if (r11 == r3) goto L49
            r3 = 204(0xcc, float:2.86E-43)
            if (r11 == r3) goto L49
            if (r11 != r5) goto L47
            r11 = r5
            goto L49
        L47:
            r3 = r1
            goto L4c
        L49:
            if (r12 != 0) goto L47
            r3 = 1
        L4c:
            if (r2 != 0) goto L62
            O3.X r11 = r9.b()     // Catch: java.lang.Throwable -> L5f
            O3.V r11 = r11.f4673z     // Catch: java.lang.Throwable -> L5f
            java.lang.String r12 = "App does not exist in onConfigFetched. appId"
            O3.W r10 = O3.X.w(r10)     // Catch: java.lang.Throwable -> L5f
            r11.c(r10, r12)     // Catch: java.lang.Throwable -> L5f
            goto L15d
        L5f:
            r10 = move-exception
            goto L173
        L62:
            r6 = 404(0x194, float:5.66E-43)
            r7 = 0
            O3.l0 r8 = r9.f4607q
            if (r3 != 0) goto Lcd
            if (r11 != r6) goto L6c
            goto Lcd
        L6c:
            B3.a r13 = r9.e()     // Catch: java.lang.Throwable -> L5f
            r13.getClass()     // Catch: java.lang.Throwable -> L5f
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5f
            r2.g(r13)     // Catch: java.lang.Throwable -> L5f
            O3.n r13 = r9.f4609s     // Catch: java.lang.Throwable -> L5f
            S(r13)     // Catch: java.lang.Throwable -> L5f
            r13.t0(r2, r1)     // Catch: java.lang.Throwable -> L5f
            O3.X r13 = r9.b()     // Catch: java.lang.Throwable -> L5f
            O3.V r13 = r13.f4666E     // Catch: java.lang.Throwable -> L5f
            java.lang.String r14 = "Fetching config failed. code, error"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L5f
            r13.d(r0, r12, r14)     // Catch: java.lang.Throwable -> L5f
            S(r8)     // Catch: java.lang.Throwable -> L5f
            r8.o()     // Catch: java.lang.Throwable -> L5f
            r.e r12 = r8.f4948D     // Catch: java.lang.Throwable -> L5f
            r12.put(r10, r7)     // Catch: java.lang.Throwable -> L5f
            O3.y1 r10 = r9.f4615y     // Catch: java.lang.Throwable -> L5f
            O3.f0 r10 = r10.f5167z     // Catch: java.lang.Throwable -> L5f
            B3.a r12 = r9.e()     // Catch: java.lang.Throwable -> L5f
            r12.getClass()     // Catch: java.lang.Throwable -> L5f
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5f
            r10.b(r12)     // Catch: java.lang.Throwable -> L5f
            r10 = 503(0x1f7, float:7.05E-43)
            if (r11 == r10) goto Lb6
            r10 = 429(0x1ad, float:6.01E-43)
            if (r11 != r10) goto Lc8
        Lb6:
            O3.y1 r10 = r9.f4615y     // Catch: java.lang.Throwable -> L5f
            O3.f0 r10 = r10.f5165x     // Catch: java.lang.Throwable -> L5f
            B3.a r11 = r9.e()     // Catch: java.lang.Throwable -> L5f
            r11.getClass()     // Catch: java.lang.Throwable -> L5f
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5f
            r10.b(r11)     // Catch: java.lang.Throwable -> L5f
        Lc8:
            r9.L()     // Catch: java.lang.Throwable -> L5f
            goto L15d
        Lcd:
            java.lang.String r12 = "Last-Modified"
            java.lang.String r12 = K(r12, r14)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = "ETag"
            java.lang.String r14 = K(r3, r14)     // Catch: java.lang.Throwable -> L5f
            if (r11 == r6) goto Le5
            if (r11 != r5) goto Lde
            goto Le5
        Lde:
            S(r8)     // Catch: java.lang.Throwable -> L5f
            r8.C(r10, r13, r12, r14)     // Catch: java.lang.Throwable -> L5f
            goto Lf4
        Le5:
            S(r8)     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.measurement.O0 r12 = r8.A(r10)     // Catch: java.lang.Throwable -> L5f
            if (r12 != 0) goto Lf4
            S(r8)     // Catch: java.lang.Throwable -> L5f
            r8.C(r10, r7, r7, r7)     // Catch: java.lang.Throwable -> L5f
        Lf4:
            B3.a r12 = r9.e()     // Catch: java.lang.Throwable -> L5f
            r12.getClass()     // Catch: java.lang.Throwable -> L5f
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5f
            r2.f(r12)     // Catch: java.lang.Throwable -> L5f
            O3.n r12 = r9.f4609s     // Catch: java.lang.Throwable -> L5f
            S(r12)     // Catch: java.lang.Throwable -> L5f
            r12.t0(r2, r1)     // Catch: java.lang.Throwable -> L5f
            if (r11 != r6) goto L118
            O3.X r11 = r9.b()     // Catch: java.lang.Throwable -> L5f
            O3.V r11 = r11.f4663B     // Catch: java.lang.Throwable -> L5f
            java.lang.String r12 = "Config not found. Using empty config. appId"
            r11.c(r10, r12)     // Catch: java.lang.Throwable -> L5f
            goto L127
        L118:
            O3.X r10 = r9.b()     // Catch: java.lang.Throwable -> L5f
            O3.V r10 = r10.f4666E     // Catch: java.lang.Throwable -> L5f
            java.lang.String r12 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L5f
            r10.d(r11, r4, r12)     // Catch: java.lang.Throwable -> L5f
        L127:
            S(r0)     // Catch: java.lang.Throwable -> L5f
            boolean r10 = r0.I()     // Catch: java.lang.Throwable -> L5f
            if (r10 == 0) goto L13a
            boolean r10 = r9.J()     // Catch: java.lang.Throwable -> L5f
            if (r10 == 0) goto L13a
            r9.q()     // Catch: java.lang.Throwable -> L5f
            goto L15d
        L13a:
            S(r0)     // Catch: java.lang.Throwable -> L5f
            boolean r10 = r0.I()     // Catch: java.lang.Throwable -> L5f
            if (r10 == 0) goto L15a
            O3.n r10 = r9.f4609s     // Catch: java.lang.Throwable -> L5f
            S(r10)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r11 = r2.D()     // Catch: java.lang.Throwable -> L5f
            boolean r10 = r10.u(r11)     // Catch: java.lang.Throwable -> L5f
            if (r10 == 0) goto L15a
            java.lang.String r10 = r2.D()     // Catch: java.lang.Throwable -> L5f
            r9.t(r10)     // Catch: java.lang.Throwable -> L5f
            goto L15d
        L15a:
            r9.L()     // Catch: java.lang.Throwable -> L5f
        L15d:
            O3.n r10 = r9.f4609s     // Catch: java.lang.Throwable -> L5f
            S(r10)     // Catch: java.lang.Throwable -> L5f
            r10.d0()     // Catch: java.lang.Throwable -> L5f
            O3.n r10 = r9.f4609s     // Catch: java.lang.Throwable -> L15
            S(r10)     // Catch: java.lang.Throwable -> L15
            r10.e0()     // Catch: java.lang.Throwable -> L15
            r9.f4590J = r1
            r9.M()
            return
        L173:
            O3.n r11 = r9.f4609s     // Catch: java.lang.Throwable -> L15
            S(r11)     // Catch: java.lang.Throwable -> L15
            r11.e0()     // Catch: java.lang.Throwable -> L15
            throw r10     // Catch: java.lang.Throwable -> L15
        L17c:
            r9.f4590J = r1
            r9.M()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T1.z(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }
}
