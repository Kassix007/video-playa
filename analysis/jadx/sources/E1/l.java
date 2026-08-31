package E1;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import r.C1555f;
import x3.C1899k;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final Object j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile l f1638k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f1639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1555f f1640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f1641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f1642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f1643e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1899k f1644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1645h;
    public final C0146d i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l(w wVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1639a = reentrantReadWriteLock;
        this.f1641c = 3;
        k kVar = (k) wVar.f1633b;
        this.f = kVar;
        int i = wVar.f1632a;
        this.f1645h = i;
        this.i = (C0146d) wVar.f1634c;
        this.f1642d = new Handler(Looper.getMainLooper());
        this.f1640b = new C1555f(0);
        this.f1644g = new C1899k(3);
        f fVar = new f(this);
        this.f1643e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f1641c = 0;
            } catch (Throwable th) {
                this.f1639a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                kVar.a(new e(fVar));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static l a() {
        l lVar;
        synchronized (j) {
            try {
                lVar = f1638k;
                if (!(lVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean c() {
        return f1638k != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        this.f1639a.readLock().lock();
        try {
            return this.f1641c;
        } finally {
            this.f1639a.readLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        if (!(this.f1645h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f1639a.writeLock().lock();
        try {
            if (this.f1641c == 0) {
                return;
            }
            this.f1641c = 0;
            this.f1639a.writeLock().unlock();
            f fVar = this.f1643e;
            l lVar = fVar.f1629a;
            try {
                lVar.f.a(new e(fVar));
            } catch (Throwable th) {
                lVar.e(th);
            }
        } finally {
            this.f1639a.writeLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1639a.writeLock().lock();
        try {
            this.f1641c = 2;
            arrayList.addAll(this.f1640b);
            this.f1640b.clear();
            this.f1639a.writeLock().unlock();
            this.f1642d.post(new j(arrayList, this.f1641c, th));
        } catch (Throwable th2) {
            this.f1639a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095 A[Catch: all -> 0x0088, TRY_ENTER, TryCatch #0 {all -> 0x0088, blocks: (B:35:0x0060, B:38:0x0065, B:40:0x0069, B:42:0x0076, B:49:0x0095, B:51:0x009f, B:53:0x00a2, B:55:0x00a5, B:57:0x00b5, B:58:0x00b8), top: B:92:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:35:0x0060, B:38:0x0065, B:40:0x0069, B:42:0x0076, B:49:0x0095, B:51:0x009f, B:53:0x00a2, B:55:0x00a5, B:57:0x00b5, B:58:0x00b8), top: B:92:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7 A[Catch: all -> 0x00fb, TRY_ENTER, TryCatch #1 {all -> 0x00fb, blocks: (B:62:0x00c7, B:65:0x00cf, B:47:0x008b), top: B:94:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence f(int r12, int r13, int r14, java.lang.CharSequence r15) throws java.lang.Throwable {
        /*
            r11 = this;
            int r0 = r11.b()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == 0) goto L11b
            if (r12 < 0) goto L113
            if (r13 < 0) goto L10b
            if (r12 > r13) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            java.lang.String r3 = "start should be <= than end"
            E3.h.m(r0, r3)
            r0 = 0
            if (r15 != 0) goto L1f
            return r0
        L1f:
            int r3 = r15.length()
            if (r12 > r3) goto L27
            r3 = r2
            goto L28
        L27:
            r3 = r1
        L28:
            java.lang.String r4 = "start should be < than charSequence length"
            E3.h.m(r3, r4)
            int r3 = r15.length()
            if (r13 > r3) goto L35
            r3 = r2
            goto L36
        L35:
            r3 = r1
        L36:
            java.lang.String r4 = "end should be < than charSequence length"
            E3.h.m(r3, r4)
            int r3 = r15.length()
            if (r3 == 0) goto L43
            if (r12 != r13) goto L46
        L43:
            r5 = r15
            goto L10a
        L46:
            if (r14 == r2) goto L4a
            r9 = r1
            goto L4b
        L4a:
            r9 = r2
        L4b:
            E1.f r14 = r11.f1643e
            B0.G0 r4 = r14.f1630b
            r4.getClass()
            boolean r14 = r15 instanceof E1.z
            if (r14 == 0) goto L5c
            r2 = r15
            E1.z r2 = (E1.z) r2
            r2.a()
        L5c:
            java.lang.Class<E1.B> r2 = E1.B.class
            if (r14 != 0) goto L8b
            boolean r3 = r15 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L88
            if (r3 == 0) goto L65
            goto L8b
        L65:
            boolean r3 = r15 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L88
            if (r3 == 0) goto L93
            r3 = r15
            android.text.Spanned r3 = (android.text.Spanned) r3     // Catch: java.lang.Throwable -> L88
            int r5 = r12 + (-1)
            int r6 = r13 + 1
            int r3 = r3.nextSpanTransition(r5, r6, r2)     // Catch: java.lang.Throwable -> L88
            if (r3 > r13) goto L93
            E1.D r0 = new E1.D     // Catch: java.lang.Throwable -> L88
            r0.<init>()     // Catch: java.lang.Throwable -> L88
            r0.f1623q = r1     // Catch: java.lang.Throwable -> L88
            android.text.SpannableString r3 = new android.text.SpannableString     // Catch: java.lang.Throwable -> L88
            r3.<init>(r15)     // Catch: java.lang.Throwable -> L88
            r0.f1624r = r3     // Catch: java.lang.Throwable -> L88
            goto L93
        L85:
            r5 = r15
            goto L101
        L88:
            r0 = move-exception
            r12 = r0
            goto L85
        L8b:
            E1.D r0 = new E1.D     // Catch: java.lang.Throwable -> Lfb
            r3 = r15
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> Lfb
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lfb
        L93:
            if (r0 == 0) goto Lc3
            android.text.Spannable r3 = r0.f1624r     // Catch: java.lang.Throwable -> L88
            java.lang.Object[] r2 = r3.getSpans(r12, r13, r2)     // Catch: java.lang.Throwable -> L88
            E1.B[] r2 = (E1.B[]) r2     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto Lc3
            int r3 = r2.length     // Catch: java.lang.Throwable -> L88
            if (r3 <= 0) goto Lc3
            int r3 = r2.length     // Catch: java.lang.Throwable -> L88
        La3:
            if (r1 >= r3) goto Lc3
            r5 = r2[r1]     // Catch: java.lang.Throwable -> L88
            android.text.Spannable r6 = r0.f1624r     // Catch: java.lang.Throwable -> L88
            int r6 = r6.getSpanStart(r5)     // Catch: java.lang.Throwable -> L88
            android.text.Spannable r7 = r0.f1624r     // Catch: java.lang.Throwable -> L88
            int r7 = r7.getSpanEnd(r5)     // Catch: java.lang.Throwable -> L88
            if (r6 == r13) goto Lb8
            r0.removeSpan(r5)     // Catch: java.lang.Throwable -> L88
        Lb8:
            int r12 = java.lang.Math.min(r6, r12)     // Catch: java.lang.Throwable -> L88
            int r13 = java.lang.Math.max(r7, r13)     // Catch: java.lang.Throwable -> L88
            int r1 = r1 + 1
            goto La3
        Lc3:
            r6 = r12
            r7 = r13
            if (r6 == r7) goto Lcd
            int r12 = r15.length()     // Catch: java.lang.Throwable -> Lfb
            if (r6 < r12) goto Lcf
        Lcd:
            r5 = r15
            goto Lfe
        Lcf:
            B0.o r10 = new B0.o     // Catch: java.lang.Throwable -> Lfb
            java.lang.Object r12 = r4.f234r     // Catch: java.lang.Throwable -> Lfb
            x3.k r12 = (x3.C1899k) r12     // Catch: java.lang.Throwable -> Lfb
            r10.<init>(r0, r12)     // Catch: java.lang.Throwable -> Lfb
            r8 = 2147483647(0x7fffffff, float:NaN)
            r5 = r15
            java.lang.Object r12 = r4.Q(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lef
            E1.D r12 = (E1.D) r12     // Catch: java.lang.Throwable -> Lef
            if (r12 == 0) goto Lf2
            android.text.Spannable r12 = r12.f1624r     // Catch: java.lang.Throwable -> Lef
            if (r14 == 0) goto Lee
            r15 = r5
            E1.z r15 = (E1.z) r15
            r15.b()
        Lee:
            return r12
        Lef:
            r0 = move-exception
        Lf0:
            r12 = r0
            goto L101
        Lf2:
            if (r14 == 0) goto L10a
        Lf4:
            r15 = r5
            E1.z r15 = (E1.z) r15
            r15.b()
            return r5
        Lfb:
            r0 = move-exception
            r5 = r15
            goto Lf0
        Lfe:
            if (r14 == 0) goto L10a
            goto Lf4
        L101:
            if (r14 == 0) goto L109
            r15 = r5
            E1.z r15 = (E1.z) r15
            r15.b()
        L109:
            throw r12
        L10a:
            return r5
        L10b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "end cannot be negative"
            r12.<init>(r13)
            throw r12
        L113:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "start cannot be negative"
            r12.<init>(r13)
            throw r12
        L11b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Not initialized yet"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.l.f(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(i iVar) {
        E3.h.p(iVar, "initCallback cannot be null");
        this.f1639a.writeLock().lock();
        try {
            if (this.f1641c == 1 || this.f1641c == 2) {
                this.f1642d.post(new j(Arrays.asList(iVar), this.f1641c, (Throwable) null));
            } else {
                this.f1640b.add(iVar);
            }
            this.f1639a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1639a.writeLock().unlock();
            throw th;
        }
    }
}
