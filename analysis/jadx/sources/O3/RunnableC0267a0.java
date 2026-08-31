package O3;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0267a0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4700q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final URL f4701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[] f4702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f4703t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Map f4704u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f4705v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ D0 f4706w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0267a0(C0270b0 c0270b0, String str, URL url, byte[] bArr, Map map, Z z5) {
        Objects.requireNonNull(c0270b0);
        this.f4706w = c0270b0;
        AbstractC1887A.d(str);
        AbstractC1887A.g(url);
        this.f4701r = url;
        this.f4702s = bArr;
        this.f4705v = z5;
        this.f4703t = str;
        this.f4704u = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(int i, IOException iOException, byte[] bArr, Map map) {
        C0312p0 c0312p0 = ((C0323t0) ((C0283f1) this.f4706w).f4346r).f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new RunnableC0280e1(this, i, iOException, bArr, map));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0285: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:646), block:B:141:0x0283 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0288: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:649), block:B:142:0x0287 */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0176  */
    /* JADX WARN: Type inference failed for: r14v0, types: [O3.a0] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            r14 = this;
            int r0 = r14.f4700q
            switch(r0) {
                case 0: goto L17d;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = "Error closing HTTP compressed POST connection output stream. appId"
            java.lang.String r2 = r14.f4703t
            O3.D0 r0 = r14.f4706w
            O3.f1 r0 = (O3.C0283f1) r0
            java.lang.Object r3 = r0.f4346r
            O3.t0 r3 = (O3.C0323t0) r3
            java.lang.Object r0 = r0.f4346r
            r4 = r0
            O3.t0 r4 = (O3.C0323t0) r4
            O3.p0 r0 = r3.f5078w
            O3.C0323t0.l(r0)
            r0.s()
            r3 = 0
            r5 = 0
            java.net.URL r0 = r14.f4701r     // Catch: java.lang.Throwable -> L12d java.io.IOException -> L12f
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> L12d java.io.IOException -> L12f
            boolean r6 = r0 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L12d java.io.IOException -> L12f
            if (r6 == 0) goto L131
            r6 = r0
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> L12d java.io.IOException -> L12f
            r6.setDefaultUseCaches(r3)     // Catch: java.lang.Throwable -> L12d java.io.IOException -> L12f
            r4.getClass()     // Catch: java.lang.Throwable -> L12d java.io.IOException -> L12f
            r0 = 60000(0xea60, float:8.4078E-41)
            r6.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L12d java.io.IOException -> L12f
            r0 = 61000(0xee48, float:8.5479E-41)
            r6.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L12d java.io.IOException -> L12f
            r6.setInstanceFollowRedirects(r3)     // Catch: java.lang.Throwable -> L12d java.io.IOException -> L12f
            r0 = 1
            r6.setDoInput(r0)     // Catch: java.lang.Throwable -> L12d java.io.IOException -> L12f
            java.util.Map r7 = r14.f4704u     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            if (r7 == 0) goto L74
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
        L52:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            if (r8 == 0) goto L74
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.lang.Object r9 = r8.getKey()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            r6.addRequestProperty(r9, r8)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            goto L52
        L6e:
            r0 = move-exception
            goto L125
        L71:
            r0 = move-exception
            goto L129
        L74:
            byte[] r7 = r14.f4702s     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            if (r7 == 0) goto Ld7
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L6e java.io.IOException -> Lc9
            r8.<init>()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> Lc9
            java.util.zip.GZIPOutputStream r9 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L6e java.io.IOException -> Lc9
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> Lc9
            r9.write(r7)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> Lc9
            r9.close()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> Lc9
            r8.close()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> Lc9
            byte[] r7 = r8.toByteArray()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> Lc9
            O3.X r8 = r4.f5077v     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            O3.C0323t0.l(r8)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            O3.V r8 = r8.f4666E     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.lang.String r9 = "Uploading data. size"
            int r10 = r7.length     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            r8.c(r11, r9)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            r6.setDoOutput(r0)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r8 = "gzip"
            r6.addRequestProperty(r0, r8)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            r6.setFixedLengthStreamingMode(r10)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            r6.connect()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.io.OutputStream r8 = r6.getOutputStream()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            r8.write(r7)     // Catch: java.lang.Throwable -> Lbb java.io.IOException -> Lbd
            r8.close()     // Catch: java.lang.Throwable -> Lbb java.io.IOException -> Lbd
            goto Ld7
        Lbb:
            r0 = move-exception
            goto Lbf
        Lbd:
            r0 = move-exception
            goto Lc4
        Lbf:
            r7 = r3
            r9 = r5
        Lc1:
            r3 = r0
            goto L13d
        Lc4:
            r7 = r3
            r9 = r5
        Lc6:
            r3 = r0
            goto L15f
        Lc9:
            r0 = move-exception
            O3.X r7 = r4.f5077v     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            O3.C0323t0.l(r7)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            O3.V r7 = r7.f4670w     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.lang.String r8 = "Failed to gzip post request content"
            r7.c(r0, r8)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            throw r0     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
        Ld7:
            int r7 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.util.Map r8 = r6.getHeaderFields()     // Catch: java.lang.Throwable -> L11b java.io.IOException -> L120
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L10b
            r0.<init>()     // Catch: java.lang.Throwable -> L10b
            java.io.InputStream r9 = r6.getInputStream()     // Catch: java.lang.Throwable -> L10b
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> Lf6
        Lec:
            int r11 = r9.read(r10)     // Catch: java.lang.Throwable -> Lf6
            if (r11 <= 0) goto Lf8
            r0.write(r10, r3, r11)     // Catch: java.lang.Throwable -> Lf6
            goto Lec
        Lf6:
            r0 = move-exception
            goto L10d
        Lf8:
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> Lf6
            r9.close()     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L109
            r6.disconnect()
            r14.a(r7, r5, r0, r8)
            goto L17c
        L107:
            r0 = move-exception
            goto L113
        L109:
            r0 = move-exception
            goto L117
        L10b:
            r0 = move-exception
            r9 = r5
        L10d:
            if (r9 == 0) goto L112
            r9.close()     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L109
        L112:
            throw r0     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L109
        L113:
            r3 = r0
            r9 = r8
            r8 = r5
            goto L13d
        L117:
            r3 = r0
            r9 = r8
            r8 = r5
            goto L15f
        L11b:
            r0 = move-exception
            r3 = r0
            r8 = r5
            r9 = r8
            goto L13d
        L120:
            r0 = move-exception
            r3 = r0
            r8 = r5
            r9 = r8
            goto L15f
        L125:
            r7 = r3
            r8 = r5
        L127:
            r9 = r8
            goto Lc1
        L129:
            r7 = r3
            r8 = r5
        L12b:
            r9 = r8
            goto Lc6
        L12d:
            r0 = move-exception
            goto L139
        L12f:
            r0 = move-exception
            goto L15b
        L131:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L12d java.io.IOException -> L12f
            java.lang.String r6 = "Failed to obtain HTTP connection"
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L12d java.io.IOException -> L12f
            throw r0     // Catch: java.lang.Throwable -> L12d java.io.IOException -> L12f
        L139:
            r7 = r3
            r6 = r5
            r8 = r6
            goto L127
        L13d:
            if (r8 == 0) goto L152
            r8.close()     // Catch: java.io.IOException -> L143
            goto L152
        L143:
            r0 = move-exception
            O3.X r4 = r4.f5077v
            O3.C0323t0.l(r4)
            O3.V r4 = r4.f4670w
            O3.W r2 = O3.X.w(r2)
            r4.d(r2, r0, r1)
        L152:
            if (r6 == 0) goto L157
            r6.disconnect()
        L157:
            r14.a(r7, r5, r5, r9)
            throw r3
        L15b:
            r7 = r3
            r6 = r5
            r8 = r6
            goto L12b
        L15f:
            if (r8 == 0) goto L174
            r8.close()     // Catch: java.io.IOException -> L165
            goto L174
        L165:
            r0 = move-exception
            O3.X r4 = r4.f5077v
            O3.C0323t0.l(r4)
            O3.V r4 = r4.f4670w
            O3.W r2 = O3.X.w(r2)
            r4.d(r2, r0, r1)
        L174:
            if (r6 == 0) goto L179
            r6.disconnect()
        L179:
            r14.a(r7, r3, r5, r9)
        L17c:
            return
        L17d:
            java.lang.String r1 = "Error closing HTTP compressed POST connection output stream. appId"
            java.lang.String r2 = r14.f4703t
            O3.D0 r0 = r14.f4706w
            O3.b0 r0 = (O3.C0270b0) r0
            java.lang.Object r3 = r0.f4346r
            O3.t0 r3 = (O3.C0323t0) r3
            java.lang.Object r4 = r0.f4346r
            O3.t0 r4 = (O3.C0323t0) r4
            O3.p0 r3 = r3.f5078w
            O3.C0323t0.l(r3)
            r3.s()
            r3 = 0
            r5 = 0
            java.net.URL r6 = r14.f4701r     // Catch: java.lang.Throwable -> L29c java.io.IOException -> L29e
            java.net.URLConnection r6 = r6.openConnection()     // Catch: java.lang.Throwable -> L29c java.io.IOException -> L29e
            boolean r7 = r6 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L29c java.io.IOException -> L29e
            if (r7 == 0) goto L2a0
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> L29c java.io.IOException -> L29e
            r6.setDefaultUseCaches(r3)     // Catch: java.lang.Throwable -> L29c java.io.IOException -> L29e
            r4.getClass()     // Catch: java.lang.Throwable -> L29c java.io.IOException -> L29e
            r7 = 60000(0xea60, float:8.4078E-41)
            r6.setConnectTimeout(r7)     // Catch: java.lang.Throwable -> L29c java.io.IOException -> L29e
            r7 = 61000(0xee48, float:8.5479E-41)
            r6.setReadTimeout(r7)     // Catch: java.lang.Throwable -> L29c java.io.IOException -> L29e
            r6.setInstanceFollowRedirects(r3)     // Catch: java.lang.Throwable -> L29c java.io.IOException -> L29e
            r7 = 1
            r6.setDoInput(r7)     // Catch: java.lang.Throwable -> L29c java.io.IOException -> L29e
            java.util.Map r8 = r14.f4704u     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            if (r8 == 0) goto L1ea
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
        L1c8:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            if (r9 == 0) goto L1ea
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            java.lang.Object r10 = r9.getKey()     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            r6.addRequestProperty(r10, r9)     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            goto L1c8
        L1e4:
            r0 = move-exception
            goto L295
        L1e7:
            r0 = move-exception
            goto L298
        L1ea:
            byte[] r8 = r14.f4702s     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            if (r8 == 0) goto L235
            O3.T1 r0 = r0.f4510s     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            O3.b0 r0 = r0.f4613w     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            O3.T1.S(r0)     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            byte[] r0 = r0.a0(r8)     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            O3.X r8 = r4.f5077v     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            O3.C0323t0.l(r8)     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            O3.V r8 = r8.f4666E     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            java.lang.String r9 = "Uploading data. size"
            int r10 = r0.length     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            r8.c(r11, r9)     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            r6.setDoOutput(r7)     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            java.lang.String r7 = "Content-Encoding"
            java.lang.String r8 = "gzip"
            r6.addRequestProperty(r7, r8)     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            r6.setFixedLengthStreamingMode(r10)     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            r6.connect()     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            java.io.OutputStream r7 = r6.getOutputStream()     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            r7.write(r0)     // Catch: java.lang.Throwable -> L225 java.io.IOException -> L227
            r7.close()     // Catch: java.lang.Throwable -> L225 java.io.IOException -> L227
            goto L235
        L225:
            r0 = move-exception
            goto L229
        L227:
            r0 = move-exception
            goto L22f
        L229:
            r8 = r3
            r11 = r5
            r5 = r7
        L22c:
            r3 = r0
            goto L2ac
        L22f:
            r10 = r0
            r9 = r3
            r12 = r5
            r5 = r7
            goto L2e1
        L235:
            int r10 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L1e4 java.io.IOException -> L1e7
            java.util.Map r13 = r6.getHeaderFields()     // Catch: java.lang.Throwable -> L28c java.io.IOException -> L291
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L27b
            r0.<init>()     // Catch: java.lang.Throwable -> L27b
            java.io.InputStream r7 = r6.getInputStream()     // Catch: java.lang.Throwable -> L27b
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L254
        L24a:
            int r9 = r7.read(r8)     // Catch: java.lang.Throwable -> L254
            if (r9 <= 0) goto L256
            r0.write(r8, r3, r9)     // Catch: java.lang.Throwable -> L254
            goto L24a
        L254:
            r0 = move-exception
            goto L27d
        L256:
            byte[] r12 = r0.toByteArray()     // Catch: java.lang.Throwable -> L254
            r7.close()     // Catch: java.lang.Throwable -> L277 java.io.IOException -> L279
            r6.disconnect()
            java.lang.Object r0 = r14.f4705v
            r9 = r0
            O3.Z r9 = (O3.Z) r9
            O3.p0 r0 = r4.f5078w
            O3.C0323t0.l(r0)
            O3.U r7 = new O3.U
            r11 = 0
            java.lang.String r8 = r14.f4703t
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.x(r7)
            goto L310
        L277:
            r0 = move-exception
            goto L283
        L279:
            r0 = move-exception
            goto L287
        L27b:
            r0 = move-exception
            r7 = r5
        L27d:
            if (r7 == 0) goto L282
            r7.close()     // Catch: java.lang.Throwable -> L277 java.io.IOException -> L279
        L282:
            throw r0     // Catch: java.lang.Throwable -> L277 java.io.IOException -> L279
        L283:
            r3 = r0
            r8 = r10
            r11 = r13
            goto L2ac
        L287:
            r9 = r10
            r12 = r13
        L289:
            r10 = r0
            goto L2e1
        L28c:
            r0 = move-exception
            r3 = r0
            r11 = r5
            r8 = r10
            goto L2ac
        L291:
            r0 = move-exception
            r12 = r5
            r9 = r10
            goto L289
        L295:
            r8 = r3
            r11 = r5
            goto L22c
        L298:
            r10 = r0
            r9 = r3
            r12 = r5
            goto L2e1
        L29c:
            r0 = move-exception
            goto L2a8
        L29e:
            r0 = move-exception
            goto L2dd
        L2a0:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L29c java.io.IOException -> L29e
            java.lang.String r6 = "Failed to obtain HTTP connection"
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L29c java.io.IOException -> L29e
            throw r0     // Catch: java.lang.Throwable -> L29c java.io.IOException -> L29e
        L2a8:
            r8 = r3
            r6 = r5
            r11 = r6
            goto L22c
        L2ac:
            if (r5 == 0) goto L2c1
            r5.close()     // Catch: java.io.IOException -> L2b2
            goto L2c1
        L2b2:
            r0 = move-exception
            O3.X r5 = r4.f5077v
            O3.C0323t0.l(r5)
            O3.V r5 = r5.f4670w
            O3.W r2 = O3.X.w(r2)
            r5.d(r2, r0, r1)
        L2c1:
            if (r6 == 0) goto L2c6
            r6.disconnect()
        L2c6:
            java.lang.Object r0 = r14.f4705v
            r7 = r0
            O3.Z r7 = (O3.Z) r7
            O3.p0 r0 = r4.f5078w
            O3.C0323t0.l(r0)
            O3.U r5 = new O3.U
            r9 = 0
            r10 = 0
            java.lang.String r6 = r14.f4703t
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.x(r5)
            throw r3
        L2dd:
            r10 = r0
            r9 = r3
            r6 = r5
            r12 = r6
        L2e1:
            if (r5 == 0) goto L2f6
            r5.close()     // Catch: java.io.IOException -> L2e7
            goto L2f6
        L2e7:
            r0 = move-exception
            O3.X r3 = r4.f5077v
            O3.C0323t0.l(r3)
            O3.V r3 = r3.f4670w
            O3.W r2 = O3.X.w(r2)
            r3.d(r2, r0, r1)
        L2f6:
            if (r6 == 0) goto L2fb
            r6.disconnect()
        L2fb:
            java.lang.Object r0 = r14.f4705v
            r8 = r0
            O3.Z r8 = (O3.Z) r8
            O3.p0 r0 = r4.f5078w
            O3.C0323t0.l(r0)
            O3.U r6 = new O3.U
            r11 = 0
            java.lang.String r7 = r14.f4703t
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.x(r6)
        L310:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.RunnableC0267a0.run():void");
    }

    public RunnableC0267a0(C0283f1 c0283f1, String str, URL url, byte[] bArr, HashMap map, InterfaceC0277d1 interfaceC0277d1) {
        Objects.requireNonNull(c0283f1);
        this.f4706w = c0283f1;
        AbstractC1887A.d(str);
        this.f4701r = url;
        this.f4702s = bArr;
        this.f4705v = interfaceC0277d1;
        this.f4703t = str;
        this.f4704u = map;
    }
}
