package R4;

import C0.RunnableC0089m;
import android.os.Environment;
import android.view.View;
import com.web2native.MainActivity;
import i1.C1134a;
import j5.C1166c;
import java.io.File;
import java.util.WeakHashMap;
import w1.AbstractC1826B;
import w1.AbstractC1835K;

/* JADX INFO: renamed from: R4.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0498s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f7180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0468k1 f7181b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0498s0(MainActivity mainActivity, C0468k1 dataObject, int i) {
        androidx.lifecycle.J j;
        switch (i) {
            case 1:
                kotlin.jvm.internal.m.e(dataObject, "dataObject");
                this.f7180a = mainActivity;
                this.f7181b = dataObject;
                MainActivity mainActivity2 = dataObject.f7067a;
                dataObject.f7065Y = new C1134a(mainActivity2.getWindow(), mainActivity2.getWindow().getDecorView());
                mainActivity2.runOnUiThread(new RunnableC0089m(5, this));
                C1166c c1166c = dataObject.f7097s;
                if (c1166c != null && (j = c1166c.f13865h) != null) {
                    j.e(dataObject.f7069b, new N(new K0(this, 0), 1));
                    break;
                }
                break;
            default:
                kotlin.jvm.internal.m.e(dataObject, "dataObject");
                this.f7180a = mainActivity;
                this.f7181b = dataObject;
                dataObject.f7059S.h();
                break;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(R4.C0498s0 r16, com.web2native.MainActivity r17, java.io.InputStream r18, byte[] r19, java.lang.String r20, java.lang.String r21, int r22) {
        /*
            r1 = r16
            r0 = r20
            r2 = r21
            r3 = r22 & 2
            r4 = 0
            if (r3 == 0) goto Ld
            r3 = r4
            goto Lf
        Ld:
            r3 = r18
        Lf:
            r5 = r22 & 4
            if (r5 == 0) goto L15
            r5 = r4
            goto L17
        L15:
            r5 = r19
        L17:
            R4.k1 r6 = r1.f7181b
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 1
            java.lang.String r9 = "."
            java.lang.String r10 = "/"
            r11 = 29
            if (r7 < r11) goto L1ae
            java.lang.String r12 = "mime_type"
            java.lang.String r13 = "_display_name"
            java.lang.String r14 = "relative_path"
            if (r3 == 0) goto Lbe
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            r4.put(r13, r0)
            r4.put(r12, r2)
            if (r7 < r11) goto L73
            R4.i r0 = r6.f7073d
            if (r0 == 0) goto L4a
            R4.Y r0 = r0.f7020z
            if (r0 == 0) goto L4a
            java.lang.Boolean r0 = r0.f6884a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r15 = kotlin.jvm.internal.m.a(r0, r2)
            goto L4b
        L4a:
            r15 = 0
        L4b:
            if (r15 == 0) goto L73
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS
            com.web2native.MainActivity r2 = r6.f7067a
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            android.content.pm.PackageManager r5 = r17.getPackageManager()
            java.lang.CharSequence r2 = r2.loadLabel(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r10)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r4.put(r14, r0)
            goto L78
        L73:
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS
            r4.put(r14, r0)
        L78:
            android.content.ContentResolver r0 = r17.getContentResolver()
            android.net.Uri r2 = A3.a.f()
            android.net.Uri r2 = r0.insert(r2, r4)
            if (r2 == 0) goto L251
            java.io.OutputStream r2 = r0.openOutputStream(r2)     // Catch: java.lang.Throwable -> La2
            kotlin.jvm.internal.m.b(r2)     // Catch: java.lang.Throwable -> La5
            a.AbstractC0597a.r(r3, r2)     // Catch: java.lang.Throwable -> La5
            r2.close()     // Catch: java.lang.Throwable -> La2
            r3.close()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
        L96:
            r3.close()
            r1.f()
            goto L251
        L9e:
            r0 = move-exception
            goto Lb7
        La0:
            r0 = move-exception
            goto Lb3
        La2:
            r0 = move-exception
            r2 = r0
            goto Lad
        La5:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch: java.lang.Throwable -> La8
        La8:
            r0 = move-exception
            com.google.android.gms.internal.measurement.I1.N(r2, r4)     // Catch: java.lang.Throwable -> La2
            throw r0     // Catch: java.lang.Throwable -> La2
        Lad:
            throw r2     // Catch: java.lang.Throwable -> Lae
        Lae:
            r0 = move-exception
            com.google.android.gms.internal.measurement.I1.N(r3, r2)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            throw r0     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
        Lb3:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L9e
            goto L96
        Lb7:
            r3.close()
            r1.f()
            throw r0
        Lbe:
            if (r5 == 0) goto L251
            boolean r1 = J5.m.K0(r2, r10)
            if (r1 != 0) goto Le0
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r2.toLowerCase(r3)
            r18 = 0
            java.lang.String r15 = "toLowerCase(...)"
            kotlin.jvm.internal.m.d(r3, r15)
            java.lang.String r1 = r1.getMimeTypeFromExtension(r3)
            if (r1 != 0) goto Le3
            java.lang.String r1 = "application/octet-stream"
            goto Le3
        Le0:
            r18 = 0
            r1 = r2
        Le3:
            boolean r3 = J5.m.K0(r2, r10)
            if (r3 == 0) goto Lf1
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r2 = r2.getExtensionFromMimeType(r1)
        Lf1:
            boolean r3 = J5.m.K0(r0, r9)
            if (r3 != 0) goto Lf8
            goto L10a
        Lf8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r9)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
        L10a:
            android.content.ContentResolver r2 = r17.getContentResolver()
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            r3.put(r13, r0)
            r3.put(r12, r1)
            R4.i r0 = r6.f7073d
            if (r0 == 0) goto L12a
            R4.Y r0 = r0.f7020z
            if (r0 == 0) goto L12a
            java.lang.Boolean r0 = r0.f6884a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.m.a(r0, r1)
            goto L12c
        L12a:
            r0 = r18
        L12c:
            if (r0 == 0) goto L154
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS
            com.web2native.MainActivity r1 = r6.f7067a
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            android.content.pm.PackageManager r6 = r17.getPackageManager()
            java.lang.CharSequence r1 = r1.loadLabel(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r10)
            r6.append(r1)
            java.lang.String r0 = r6.toString()
            r3.put(r14, r0)
            goto L159
        L154:
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS
            r3.put(r14, r0)
        L159:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.String r1 = "is_pending"
            r3.put(r1, r0)
            android.net.Uri r0 = A3.a.w()
            java.lang.String r6 = "getContentUri(...)"
            kotlin.jvm.internal.m.d(r0, r6)
            android.net.Uri r6 = r2.insert(r0, r3)
            if (r6 == 0) goto L1a6
            java.io.OutputStream r8 = r2.openOutputStream(r6)     // Catch: java.io.IOException -> L190
            if (r8 == 0) goto L19a
            r8.write(r5)     // Catch: java.lang.Throwable -> L192
            r8.flush()     // Catch: java.lang.Throwable -> L192
            r8.close()     // Catch: java.io.IOException -> L190
            if (r7 < r11) goto L251
            r3.clear()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r3.put(r1, r0)
            r2.update(r6, r3, r4, r4)
            return
        L190:
            r0 = move-exception
            goto L1a2
        L192:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L195
        L195:
            r0 = move-exception
            com.google.android.gms.internal.measurement.I1.N(r8, r1)     // Catch: java.io.IOException -> L190
            throw r0     // Catch: java.io.IOException -> L190
        L19a:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.IOException -> L190
            java.lang.String r1 = "Failed to open output stream"
            r0.<init>(r1)     // Catch: java.io.IOException -> L190
            throw r0     // Catch: java.io.IOException -> L190
        L1a2:
            r2.delete(r6, r4, r4)
            throw r0
        L1a6:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to insert file into MediaStore"
            r0.<init>(r1)
            throw r0
        L1ae:
            if (r3 == 0) goto L251
            java.lang.String[] r5 = new java.lang.String[]{r10}
            java.util.List r2 = J5.m.d1(r2, r5)
            java.lang.Object r2 = r2.get(r8)
            java.lang.String r2 = (java.lang.String) r2
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r6 = J5.m.K0(r0, r9)
            java.lang.String r7 = "._"
            if (r6 == 0) goto L1e1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r7)
            r6.append(r0)
        L1dc:
            java.lang.String r0 = r6.toString()
            goto L1f6
        L1e1:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r7)
            r6.append(r0)
            r6.append(r9)
            r6.append(r2)
            goto L1dc
        L1f6:
            java.io.File r0 = r1.b(r0)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L216 java.lang.Exception -> L218
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L216 java.lang.Exception -> L218
            a.AbstractC0597a.r(r3, r5)     // Catch: java.lang.Throwable -> L238
            r5.close()     // Catch: java.lang.Throwable -> L216 java.lang.Exception -> L218
            java.lang.String r5 = "png"
            boolean r5 = J5.m.K0(r2, r5)     // Catch: java.lang.Throwable -> L216 java.lang.Exception -> L218
            if (r5 != 0) goto L21a
            java.lang.String r5 = "jpg"
            boolean r2 = J5.m.K0(r2, r5)     // Catch: java.lang.Throwable -> L216 java.lang.Exception -> L218
            if (r2 == 0) goto L231
            goto L21a
        L216:
            r0 = move-exception
            goto L24a
        L218:
            r0 = move-exception
            goto L240
        L21a:
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L216 java.lang.Exception -> L218
            java.lang.String r2 = "getPath(...)"
            kotlin.jvm.internal.m.d(r0, r2)     // Catch: java.lang.Throwable -> L216 java.lang.Exception -> L218
            com.web2native.MainActivity r2 = r1.f7180a     // Catch: java.lang.Throwable -> L216 java.lang.Exception -> L218
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L216 java.lang.Exception -> L218
            R4.l0 r5 = new R4.l0     // Catch: java.lang.Throwable -> L216 java.lang.Exception -> L218
            r5.<init>()     // Catch: java.lang.Throwable -> L216 java.lang.Exception -> L218
            android.media.MediaScannerConnection.scanFile(r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L216 java.lang.Exception -> L218
        L231:
            r3.close()
            r1.f()
            return
        L238:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L23b
        L23b:
            r0 = move-exception
            com.google.android.gms.internal.measurement.I1.N(r5, r2)     // Catch: java.lang.Throwable -> L216 java.lang.Exception -> L218
            throw r0     // Catch: java.lang.Throwable -> L216 java.lang.Exception -> L218
        L240:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L216
            r3.close()
            r1.f()
            goto L251
        L24a:
            r3.close()
            r1.f()
            throw r0
        L251:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.C0498s0.e(R4.s0, com.web2native.MainActivity, java.io.InputStream, byte[], java.lang.String, java.lang.String, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r17, java.lang.String r18, s5.c r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r19
            java.lang.String r3 = "input"
            java.lang.String r4 = "UTF-8"
            java.lang.String r5 = "data:"
            boolean r6 = r2 instanceof R4.C0479n0
            if (r6 == 0) goto L20
            r6 = r2
            R4.n0 r6 = (R4.C0479n0) r6
            int r7 = r6.f7135s
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L20
            int r7 = r7 - r8
            r6.f7135s = r7
        L1e:
            r7 = r6
            goto L26
        L20:
            R4.n0 r6 = new R4.n0
            r6.<init>(r1, r2)
            goto L1e
        L26:
            java.lang.Object r2 = r7.f7133q
            int r6 = r7.f7135s
            m5.y r8 = m5.C1386y.f15098a
            r9 = 1
            if (r6 == 0) goto L40
            if (r6 != r9) goto L38
            m5.AbstractC1362a.e(r2)     // Catch: java.io.IOException -> L35
            return r8
        L35:
            r0 = move-exception
            goto L30a
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L40:
            m5.AbstractC1362a.e(r2)
            java.lang.String r2 = ";base64"
            boolean r2 = J5.m.K0(r0, r2)     // Catch: java.io.IOException -> L35
            r6 = 10
            java.lang.String r10 = "compile(...)"
            n5.s r11 = n5.s.f15299q
            java.lang.String r12 = ","
            r13 = 0
            if (r2 == 0) goto Ldb
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r12)     // Catch: java.io.IOException -> L35
            kotlin.jvm.internal.m.d(r12, r10)     // Catch: java.io.IOException -> L35
            java.util.regex.Matcher r12 = r12.matcher(r0)     // Catch: java.io.IOException -> L35
            boolean r14 = r12.find()     // Catch: java.io.IOException -> L35
            if (r14 != 0) goto L70
            java.lang.String r12 = r0.toString()     // Catch: java.io.IOException -> L35
            java.util.List r12 = com.google.android.gms.internal.measurement.AbstractC0836n2.z(r12)     // Catch: java.io.IOException -> L35
            r19 = r9
            goto La1
        L70:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.io.IOException -> L35
            r14.<init>(r6)     // Catch: java.io.IOException -> L35
            r19 = r9
            r15 = r13
        L78:
            int r9 = r12.start()     // Catch: java.io.IOException -> L35
            java.lang.CharSequence r9 = r0.subSequence(r15, r9)     // Catch: java.io.IOException -> L35
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> L35
            r14.add(r9)     // Catch: java.io.IOException -> L35
            int r15 = r12.end()     // Catch: java.io.IOException -> L35
            boolean r9 = r12.find()     // Catch: java.io.IOException -> L35
            if (r9 != 0) goto L78
            int r9 = r0.length()     // Catch: java.io.IOException -> L35
            java.lang.CharSequence r9 = r0.subSequence(r15, r9)     // Catch: java.io.IOException -> L35
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> L35
            r14.add(r9)     // Catch: java.io.IOException -> L35
            r12 = r14
        La1:
            boolean r9 = r12.isEmpty()     // Catch: java.io.IOException -> L35
            if (r9 != 0) goto Lcf
            int r9 = r12.size()     // Catch: java.io.IOException -> L35
            java.util.ListIterator r9 = r12.listIterator(r9)     // Catch: java.io.IOException -> L35
        Laf:
            boolean r14 = r9.hasPrevious()     // Catch: java.io.IOException -> L35
            if (r14 == 0) goto Lcf
            java.lang.Object r14 = r9.previous()     // Catch: java.io.IOException -> L35
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.io.IOException -> L35
            int r14 = r14.length()     // Catch: java.io.IOException -> L35
            if (r14 != 0) goto Lc2
            goto Laf
        Lc2:
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch: java.io.IOException -> L35
            int r9 = r9.nextIndex()     // Catch: java.io.IOException -> L35
            int r9 = r9 + 1
            java.util.List r9 = n5.l.y0(r12, r9)     // Catch: java.io.IOException -> L35
            goto Ld0
        Lcf:
            r9 = r11
        Ld0:
            java.util.Collection r9 = (java.util.Collection) r9     // Catch: java.io.IOException -> L35
            java.lang.String[] r12 = new java.lang.String[r13]     // Catch: java.io.IOException -> L35
            java.lang.Object[] r9 = r9.toArray(r12)     // Catch: java.io.IOException -> L35
            java.lang.String[] r9 = (java.lang.String[]) r9     // Catch: java.io.IOException -> L35
            goto Le9
        Ldb:
            r19 = r9
            java.lang.String r9 = J5.m.k1(r0, r12)     // Catch: java.io.IOException -> L35
            java.lang.String r12 = J5.m.h1(r0, r12)     // Catch: java.io.IOException -> L35
            java.lang.String[] r9 = new java.lang.String[]{r9, r12}     // Catch: java.io.IOException -> L35
        Le9:
            int r12 = r9.length     // Catch: java.io.IOException -> L35
            if (r12 != 0) goto Lee
            goto L305
        Lee:
            if (r2 == 0) goto Lf7
            r2 = r9[r19]     // Catch: java.io.IOException -> L35
            byte[] r2 = android.util.Base64.decode(r2, r13)     // Catch: java.io.IOException -> L35
            goto L114
        Lf7:
            r2 = r9[r19]     // Catch: java.io.IOException -> L35
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r4)     // Catch: java.io.IOException -> L35
            java.lang.String r12 = "decode(...)"
            kotlin.jvm.internal.m.d(r2, r12)     // Catch: java.io.IOException -> L35
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch: java.io.IOException -> L35
            java.lang.String r12 = "forName(...)"
            kotlin.jvm.internal.m.d(r4, r12)     // Catch: java.io.IOException -> L35
            byte[] r2 = r2.getBytes(r4)     // Catch: java.io.IOException -> L35
            java.lang.String r4 = "getBytes(...)"
            kotlin.jvm.internal.m.d(r2, r4)     // Catch: java.io.IOException -> L35
        L114:
            com.web2native.MainActivity r4 = r1.f7180a     // Catch: java.io.IOException -> L35
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.io.IOException -> L35
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: java.io.IOException -> L35
            java.lang.CharSequence r4 = r4.nonLocalizedLabel     // Catch: java.io.IOException -> L35
            java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> L35
            boolean r12 = J5.t.G0(r0, r5, r13)     // Catch: java.io.IOException -> L35
            if (r12 == 0) goto L13c
            r3 = r9[r13]     // Catch: java.io.IOException -> L35
            java.lang.String r3 = J5.m.h1(r3, r5)     // Catch: java.io.IOException -> L35
            java.lang.String r6 = ";"
            java.lang.String r3 = J5.m.k1(r3, r6)     // Catch: java.io.IOException -> L35
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.io.IOException -> L35
            goto L1c3
        L13c:
            r12 = r9[r13]     // Catch: java.io.IOException -> L35
            java.lang.String r14 = "="
            java.util.regex.Pattern r14 = java.util.regex.Pattern.compile(r14)     // Catch: java.io.IOException -> L35
            kotlin.jvm.internal.m.d(r14, r10)     // Catch: java.io.IOException -> L35
            kotlin.jvm.internal.m.e(r12, r3)     // Catch: java.io.IOException -> L35
            java.util.regex.Matcher r3 = r14.matcher(r12)     // Catch: java.io.IOException -> L35
            boolean r10 = r3.find()     // Catch: java.io.IOException -> L35
            if (r10 != 0) goto L15d
            java.lang.String r3 = r12.toString()     // Catch: java.io.IOException -> L35
            java.util.List r3 = com.google.android.gms.internal.measurement.AbstractC0836n2.z(r3)     // Catch: java.io.IOException -> L35
            goto L18c
        L15d:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.io.IOException -> L35
            r10.<init>(r6)     // Catch: java.io.IOException -> L35
            r6 = r13
        L163:
            int r14 = r3.start()     // Catch: java.io.IOException -> L35
            java.lang.CharSequence r6 = r12.subSequence(r6, r14)     // Catch: java.io.IOException -> L35
            java.lang.String r6 = r6.toString()     // Catch: java.io.IOException -> L35
            r10.add(r6)     // Catch: java.io.IOException -> L35
            int r6 = r3.end()     // Catch: java.io.IOException -> L35
            boolean r14 = r3.find()     // Catch: java.io.IOException -> L35
            if (r14 != 0) goto L306
            int r3 = r12.length()     // Catch: java.io.IOException -> L35
            java.lang.CharSequence r3 = r12.subSequence(r6, r3)     // Catch: java.io.IOException -> L35
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> L35
            r10.add(r3)     // Catch: java.io.IOException -> L35
            r3 = r10
        L18c:
            boolean r6 = r3.isEmpty()     // Catch: java.io.IOException -> L35
            if (r6 != 0) goto L1b9
            int r6 = r3.size()     // Catch: java.io.IOException -> L35
            java.util.ListIterator r6 = r3.listIterator(r6)     // Catch: java.io.IOException -> L35
        L19a:
            boolean r10 = r6.hasPrevious()     // Catch: java.io.IOException -> L35
            if (r10 == 0) goto L1b9
            java.lang.Object r10 = r6.previous()     // Catch: java.io.IOException -> L35
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.io.IOException -> L35
            int r10 = r10.length()     // Catch: java.io.IOException -> L35
            if (r10 != 0) goto L1ad
            goto L19a
        L1ad:
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.io.IOException -> L35
            int r6 = r6.nextIndex()     // Catch: java.io.IOException -> L35
            int r6 = r6 + 1
            java.util.List r11 = n5.l.y0(r3, r6)     // Catch: java.io.IOException -> L35
        L1b9:
            java.util.Collection r11 = (java.util.Collection) r11     // Catch: java.io.IOException -> L35
            java.lang.String[] r3 = new java.lang.String[r13]     // Catch: java.io.IOException -> L35
            java.lang.Object[] r3 = r11.toArray(r3)     // Catch: java.io.IOException -> L35
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch: java.io.IOException -> L35
        L1c3:
            android.webkit.MimeTypeMap r6 = android.webkit.MimeTypeMap.getSingleton()     // Catch: java.io.IOException -> L35
            boolean r5 = J5.t.G0(r0, r5, r13)     // Catch: java.io.IOException -> L35
            java.lang.String r10 = ""
            if (r5 == 0) goto L1da
            int r5 = r3.length     // Catch: java.io.IOException -> L35
            if (r5 != 0) goto L1d3
            goto L1da
        L1d3:
            r3 = r3[r13]     // Catch: java.io.IOException -> L35
            if (r3 != 0) goto L1d8
            goto L1e1
        L1d8:
            r10 = r3
            goto L1e1
        L1da:
            int r5 = r3.length     // Catch: java.io.IOException -> L35
            r11 = r19
            if (r5 <= r11) goto L1e1
            r10 = r3[r11]     // Catch: java.io.IOException -> L35
        L1e1:
            java.lang.String r3 = r6.getExtensionFromMimeType(r10)     // Catch: java.io.IOException -> L35
            kotlin.jvm.internal.y r5 = new kotlin.jvm.internal.y     // Catch: java.io.IOException -> L35
            r5.<init>()     // Catch: java.io.IOException -> L35
            java.lang.String r6 = "_"
            if (r18 != 0) goto L20d
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L35
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L35
            r12.<init>()     // Catch: java.io.IOException -> L35
            r12.append(r4)     // Catch: java.io.IOException -> L35
            r12.append(r6)     // Catch: java.io.IOException -> L35
            r12.append(r10)     // Catch: java.io.IOException -> L35
            java.lang.String r10 = "."
            r12.append(r10)     // Catch: java.io.IOException -> L35
            r12.append(r3)     // Catch: java.io.IOException -> L35
            java.lang.String r10 = r12.toString()     // Catch: java.io.IOException -> L35
            goto L20f
        L20d:
            r10 = r18
        L20f:
            r5.f14268q = r10     // Catch: java.io.IOException -> L35
            if (r3 != 0) goto L23f
            java.lang.String r10 = "data:text/json"
            boolean r10 = J5.m.K0(r0, r10)     // Catch: java.io.IOException -> L35
            if (r10 == 0) goto L23f
            if (r18 != 0) goto L239
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L35
            r0.<init>()     // Catch: java.io.IOException -> L35
            r0.append(r4)     // Catch: java.io.IOException -> L35
            r0.append(r6)     // Catch: java.io.IOException -> L35
            r0.append(r10)     // Catch: java.io.IOException -> L35
            java.lang.String r4 = ".json"
            r0.append(r4)     // Catch: java.io.IOException -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L35
            goto L23b
        L239:
            r0 = r18
        L23b:
            r5.f14268q = r0     // Catch: java.io.IOException -> L35
            goto L2ec
        L23f:
            if (r3 != 0) goto L26d
            java.lang.String r10 = "data:application/pdf"
            boolean r10 = J5.m.K0(r0, r10)     // Catch: java.io.IOException -> L35
            if (r10 == 0) goto L26d
            if (r18 != 0) goto L267
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L35
            r0.<init>()     // Catch: java.io.IOException -> L35
            r0.append(r4)     // Catch: java.io.IOException -> L35
            r0.append(r6)     // Catch: java.io.IOException -> L35
            r0.append(r10)     // Catch: java.io.IOException -> L35
            java.lang.String r4 = ".pdf"
            r0.append(r4)     // Catch: java.io.IOException -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L35
            goto L269
        L267:
            r0 = r18
        L269:
            r5.f14268q = r0     // Catch: java.io.IOException -> L35
            goto L2ec
        L26d:
            if (r3 != 0) goto L2c0
            java.lang.String r10 = "data:image/"
            boolean r10 = J5.m.K0(r0, r10)     // Catch: java.io.IOException -> L35
            if (r10 == 0) goto L2c0
            if (r18 != 0) goto L2bb
            r0 = r9[r13]     // Catch: java.io.IOException -> L35
            java.lang.String r10 = "png"
            boolean r0 = J5.m.K0(r0, r10)     // Catch: java.io.IOException -> L35
            if (r0 == 0) goto L29f
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L35
            r0.<init>()     // Catch: java.io.IOException -> L35
            r0.append(r4)     // Catch: java.io.IOException -> L35
            r0.append(r6)     // Catch: java.io.IOException -> L35
            r0.append(r10)     // Catch: java.io.IOException -> L35
            java.lang.String r4 = ".png"
            r0.append(r4)     // Catch: java.io.IOException -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L35
            goto L2bd
        L29f:
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L35
            r0.<init>()     // Catch: java.io.IOException -> L35
            r0.append(r4)     // Catch: java.io.IOException -> L35
            r0.append(r6)     // Catch: java.io.IOException -> L35
            r0.append(r10)     // Catch: java.io.IOException -> L35
            java.lang.String r4 = ".jpg"
            r0.append(r4)     // Catch: java.io.IOException -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L35
            goto L2bd
        L2bb:
            r0 = r18
        L2bd:
            r5.f14268q = r0     // Catch: java.io.IOException -> L35
            goto L2ec
        L2c0:
            if (r3 != 0) goto L2ec
            java.lang.String r10 = "data:text/csv"
            boolean r0 = J5.m.K0(r0, r10)     // Catch: java.io.IOException -> L35
            if (r0 == 0) goto L2ec
            if (r18 != 0) goto L2e8
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L35
            r0.<init>()     // Catch: java.io.IOException -> L35
            r0.append(r4)     // Catch: java.io.IOException -> L35
            r0.append(r6)     // Catch: java.io.IOException -> L35
            r0.append(r10)     // Catch: java.io.IOException -> L35
            java.lang.String r4 = ".csv"
            r0.append(r4)     // Catch: java.io.IOException -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L35
            goto L2ea
        L2e8:
            r0 = r18
        L2ea:
            r5.f14268q = r0     // Catch: java.io.IOException -> L35
        L2ec:
            T5.e r0 = M5.H.f3811a     // Catch: java.io.IOException -> L35
            T5.d r10 = T5.d.f7468q     // Catch: java.io.IOException -> L35
            R4.o0 r0 = new R4.o0     // Catch: java.io.IOException -> L35
            r6 = 0
            r4 = r3
            r3 = r5
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L35
            r1 = 1
            r7.f7135s = r1     // Catch: java.io.IOException -> L35
            java.lang.Object r0 = M5.AbstractC0263y.B(r10, r0, r7)     // Catch: java.io.IOException -> L35
            r5.a r1 = r5.EnumC1580a.f16356q
            if (r0 != r1) goto L305
            return r1
        L305:
            return r8
        L306:
            r1 = r16
            goto L163
        L30a:
            r0.printStackTrace()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.C0498s0.a(java.lang.String, java.lang.String, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public File b(String str) {
        Y y6;
        C0468k1 c0468k1 = this.f7181b;
        C0458i c0458i = c0468k1.f7073d;
        if (!((c0458i == null || (y6 = c0458i.f7020z) == null) ? false : kotlin.jvm.internal.m.a(y6.f6884a, Boolean.TRUE))) {
            return new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str);
        }
        return new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS + "/" + ((Object) c0468k1.f7067a.getApplicationInfo().loadLabel(this.f7180a.getPackageManager()))), str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c() {
        C0468k1 c0468k1 = this.f7181b;
        c0468k1.f7098t.f13869D.e(c0468k1.f7069b, new N(new K0(this, 1), 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d() {
        C0468k1 c0468k1 = this.f7181b;
        View decorView = c0468k1.f7067a.getWindow().getDecorView();
        L0 l02 = new L0(0, this);
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        AbstractC1826B.l(decorView, l02);
        C1134a c1134a = c0468k1.f7065Y;
        if (c1134a != null) {
            ((C3.a) c1134a.f13535r).R();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f() {
        this.f7180a.runOnUiThread(new RunnableC0467k0(this, 0));
    }
}
