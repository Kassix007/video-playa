package a3;

import android.content.Context;
import androidx.work.impl.Processor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f8849d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ l(Context context, String str, String str2, int i) {
        this.f8846a = i;
        this.f8847b = context;
        this.f8848c = str;
        this.f8849d = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(4:64|(6:100|65|66|(2:107|67)|(1:70)|(1:72)(1:77))|101|78) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0143, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0144, code lost:
    
        n3.c.c("LottieFetchResult close failed ", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            r11 = this;
            int r0 = r11.f8846a
            switch(r0) {
                case 0: goto L23;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r11.f8847b
            androidx.work.impl.Processor r0 = (androidx.work.impl.Processor) r0
            java.io.Serializable r1 = r11.f8849d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.String r2 = r11.f8848c
            androidx.work.impl.model.WorkSpec r0 = androidx.work.impl.Processor.a(r0, r1, r2)
            return r0
        L14:
            java.lang.Object r0 = r11.f8847b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = r11.f8848c
            java.io.Serializable r2 = r11.f8849d
            java.lang.String r2 = (java.lang.String) r2
            a3.D r0 = a3.o.b(r0, r1, r2)
            return r0
        L23:
            java.lang.Object r0 = r11.f8847b
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = r11.f8848c
            java.io.Serializable r0 = r11.f8849d
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            k3.d r0 = y4.AbstractC1918b.f18624b
            if (r0 != 0) goto L70
            java.lang.Class<k3.d> r1 = k3.d.class
            monitor-enter(r1)
            k3.d r0 = y4.AbstractC1918b.f18624b     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L6f
            k3.d r0 = new k3.d     // Catch: java.lang.Throwable -> L6d
            android.content.Context r4 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L6d
            k3.c r5 = y4.AbstractC1918b.f18625c     // Catch: java.lang.Throwable -> L6d
            if (r5 != 0) goto L5f
            java.lang.Class<k3.c> r5 = k3.c.class
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L6d
            k3.c r7 = y4.AbstractC1918b.f18625c     // Catch: java.lang.Throwable -> L58
            if (r7 != 0) goto L5a
            k3.c r7 = new k3.c     // Catch: java.lang.Throwable -> L58
            a3.d r8 = new a3.d     // Catch: java.lang.Throwable -> L58
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L58
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L58
            y4.AbstractC1918b.f18625c = r7     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r0 = move-exception
            goto L5d
        L5a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L58
            r5 = r7
            goto L5f
        L5d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L6d
        L5f:
            O3.D r4 = new O3.D     // Catch: java.lang.Throwable -> L6d
            r7 = 23
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L6d
            r7 = 0
            r0.<init>(r7, r5, r4)     // Catch: java.lang.Throwable -> L6d
            y4.AbstractC1918b.f18624b = r0     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r0 = move-exception
            goto L72
        L6f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
        L70:
            r1 = r0
            goto L74
        L72:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
            throw r0
        L74:
            r4 = 2
            r5 = 1
            r7 = 0
            if (r6 == 0) goto Lb7
            java.lang.Object r0 = r1.f14122r
            k3.c r0 = (k3.c) r0
            java.io.File r0 = r0.k(r3)     // Catch: java.io.FileNotFoundException -> L83
            if (r0 != 0) goto L85
        L83:
            r0 = r7
            goto Lb5
        L85:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L83
            r8.<init>(r0)     // Catch: java.io.FileNotFoundException -> L83
            java.lang.String r9 = r0.getAbsolutePath()
            java.lang.String r10 = ".zip"
            boolean r9 = r9.endsWith(r10)
            if (r9 == 0) goto L99
            k3.b r9 = k3.EnumC1187b.ZIP
            goto Laa
        L99:
            java.lang.String r9 = r0.getAbsolutePath()
            java.lang.String r10 = ".gz"
            boolean r9 = r9.endsWith(r10)
            if (r9 == 0) goto La8
            k3.b r9 = k3.EnumC1187b.GZIP
            goto Laa
        La8:
            k3.b r9 = k3.EnumC1187b.JSON
        Laa:
            r0.getAbsolutePath()
            n3.c.a()
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r9, r8)
        Lb5:
            if (r0 != 0) goto Lb9
        Lb7:
            r0 = r7
            goto Led
        Lb9:
            java.lang.Object r8 = r0.first
            k3.b r8 = (k3.EnumC1187b) r8
            java.lang.Object r0 = r0.second
            java.io.InputStream r0 = (java.io.InputStream) r0
            int r8 = r8.ordinal()
            if (r8 == r5) goto Le0
            if (r8 == r4) goto Lce
            a3.D r0 = a3.o.d(r0, r6)
            goto Le9
        Lce:
            java.util.zip.GZIPInputStream r8 = new java.util.zip.GZIPInputStream     // Catch: java.io.IOException -> Ld8
            r8.<init>(r0)     // Catch: java.io.IOException -> Ld8
            a3.D r0 = a3.o.d(r8, r6)     // Catch: java.io.IOException -> Ld8
            goto Le9
        Ld8:
            r0 = move-exception
            a3.D r8 = new a3.D
            r8.<init>(r0)
            r0 = r8
            goto Le9
        Le0:
            java.util.zip.ZipInputStream r8 = new java.util.zip.ZipInputStream
            r8.<init>(r0)
            a3.D r0 = a3.o.h(r2, r8, r6)
        Le9:
            a3.k r0 = r0.f8793a
            if (r0 == 0) goto Lb7
        Led:
            if (r0 == 0) goto Lf5
            a3.D r1 = new a3.D
            r1.<init>(r0)
            goto L147
        Lf5:
            n3.c.a()
            java.lang.String r8 = "LottieFetchResult close failed "
            n3.c.a()
            k3.a r7 = O3.D.q(r3)     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L127
            java.lang.Object r0 = r7.f14114r     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L127
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L127
            r9 = 0
            int r10 = r0.getResponseCode()     // Catch: java.io.IOException -> L10f java.lang.Throwable -> L124 java.lang.Exception -> L127
            int r10 = r10 / 100
            if (r10 != r4) goto L10f
            goto L110
        L10f:
            r5 = r9
        L110:
            if (r5 == 0) goto L129
            java.io.InputStream r4 = r0.getInputStream()     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L127
            java.lang.String r5 = r0.getContentType()     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L127
            a3.D r1 = r1.t(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L127
            a3.k r0 = r1.f8793a     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L127
            n3.c.a()     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L127
            goto L137
        L124:
            r0 = move-exception
            r1 = r0
            goto L155
        L127:
            r0 = move-exception
            goto L13b
        L129:
            a3.D r1 = new a3.D     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L127
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L127
            java.lang.String r2 = r7.a()     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L127
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L127
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L127
        L137:
            r7.close()     // Catch: java.io.IOException -> L143
            goto L147
        L13b:
            a3.D r1 = new a3.D     // Catch: java.lang.Throwable -> L124
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L124
            if (r7 == 0) goto L147
            goto L137
        L143:
            r0 = move-exception
            n3.c.c(r8, r0)
        L147:
            if (r6 == 0) goto L154
            a3.k r0 = r1.f8793a
            if (r0 == 0) goto L154
            g3.g r2 = g3.g.f13063b
            d2.d0 r2 = r2.f13064a
            r2.l(r6, r0)
        L154:
            return r1
        L155:
            if (r7 == 0) goto L15f
            r7.close()     // Catch: java.io.IOException -> L15b
            goto L15f
        L15b:
            r0 = move-exception
            n3.c.c(r8, r0)
        L15f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.l.call():java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ l(Processor processor, ArrayList arrayList, String str) {
        this.f8846a = 2;
        this.f8847b = processor;
        this.f8849d = arrayList;
        this.f8848c = str;
    }
}
