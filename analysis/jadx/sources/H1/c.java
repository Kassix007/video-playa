package H1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f2083d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(byte[] bArr, int i, int i7) {
        this(-1L, bArr, i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.f2093D[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new c(byteBufferWrap.array(), 4, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c b(e eVar, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.f2093D[5]]);
        byteBufferWrap.order(byteOrder);
        e eVar2 = new e[]{eVar}[0];
        byteBufferWrap.putInt((int) eVar2.f2088a);
        byteBufferWrap.putInt((int) eVar2.f2089b);
        return new c(byteBufferWrap.array(), 5, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c c(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.f2093D[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new c(byteBufferWrap.array(), 3, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final double d(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objG instanceof String) {
            return Double.parseDouble((String) objG);
        }
        if (objG instanceof long[]) {
            if (((long[]) objG).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof int[]) {
            if (((int[]) objG).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) objG;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f2088a / eVar.f2089b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objG instanceof String) {
            return Integer.parseInt((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objG;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String f(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            return null;
        }
        if (objG instanceof String) {
            return (String) objG;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objG instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) objG;
        while (i < eVarArr.length) {
            sb.append(eVarArr[i].f2088a);
            sb.append('/');
            sb.append(eVarArr[i].f2089b);
            i++;
            if (i != eVarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x00ac */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [H1.e[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [H1.e[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.nio.ByteOrder r14) throws java.lang.Throwable {
        /*
            r13 = this;
            byte[] r0 = r13.f2083d
            java.lang.String r1 = "IOException occurred while closing InputStream"
            java.lang.String r2 = "ExifInterface"
            r3 = 0
            H1.b r4 = new H1.b     // Catch: java.lang.Throwable -> L118 java.io.IOException -> L11a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L118 java.io.IOException -> L11a
            r4.f2077s = r14     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r14 = r13.f2080a     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = 0
            int r8 = r13.f2081b
            switch(r14) {
                case 1: goto Lf0;
                case 2: goto Lb7;
                case 3: goto Laa;
                case 4: goto L9b;
                case 5: goto L81;
                case 6: goto Lf0;
                case 7: goto Lb7;
                case 8: goto L74;
                case 9: goto L67;
                case 10: goto L4f;
                case 11: goto L41;
                case 12: goto L24;
                default: goto L1b;
            }
        L1b:
            r4.close()     // Catch: java.io.IOException -> L1f
            return r3
        L1f:
            r14 = move-exception
            android.util.Log.e(r2, r1, r14)
            return r3
        L24:
            double[] r14 = new double[r8]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        L26:
            if (r7 >= r8) goto L38
            double r5 = r4.readDouble()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r14[r7] = r5     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto L26
        L31:
            r14 = move-exception
            r3 = r4
            goto L12c
        L35:
            r14 = move-exception
            goto L11c
        L38:
            r4.close()     // Catch: java.io.IOException -> L3c
            return r14
        L3c:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
            return r14
        L41:
            double[] r14 = new double[r8]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        L43:
            if (r7 >= r8) goto L38
            float r0 = r4.readFloat()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            double r5 = (double) r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r14[r7] = r5     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto L43
        L4f:
            H1.e[] r14 = new H1.e[r8]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        L51:
            if (r7 >= r8) goto L38
            int r0 = r4.readInt()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r5 = (long) r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r0 = r4.readInt()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r9 = (long) r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            H1.e r0 = new H1.e     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r0.<init>(r5, r9)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r14[r7] = r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto L51
        L67:
            int[] r14 = new int[r8]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        L69:
            if (r7 >= r8) goto L38
            int r0 = r4.readInt()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r14[r7] = r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto L69
        L74:
            int[] r14 = new int[r8]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        L76:
            if (r7 >= r8) goto L38
            short r0 = r4.readShort()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r14[r7] = r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto L76
        L81:
            H1.e[] r14 = new H1.e[r8]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        L83:
            if (r7 >= r8) goto L38
            int r0 = r4.readInt()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r9 = (long) r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r9 = r9 & r5
            int r0 = r4.readInt()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r11 = (long) r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r11 = r11 & r5
            H1.e r0 = new H1.e     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r0.<init>(r9, r11)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r14[r7] = r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto L83
        L9b:
            long[] r14 = new long[r8]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        L9d:
            if (r7 >= r8) goto L38
            int r0 = r4.readInt()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r9 = (long) r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r9 = r9 & r5
            r14[r7] = r9     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto L9d
        Laa:
            int[] r14 = new int[r8]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        Lac:
            if (r7 >= r8) goto L38
            int r0 = r4.readUnsignedShort()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r14[r7] = r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto Lac
        Lb7:
            byte[] r14 = H1.g.f2094E     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r14 = r14.length     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            if (r8 < r14) goto Lcd
            r14 = r7
        Lbd:
            byte[] r5 = H1.g.f2094E     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r6 = r5.length     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            if (r14 >= r6) goto Lcc
            r6 = r0[r14]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r5 = r5[r14]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            if (r6 == r5) goto Lc9
            goto Lcd
        Lc9:
            int r14 = r14 + 1
            goto Lbd
        Lcc:
            int r7 = r5.length     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        Lcd:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r14.<init>()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        Ld2:
            if (r7 >= r8) goto Lea
            r5 = r0[r7]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            if (r5 != 0) goto Ld9
            goto Lea
        Ld9:
            r6 = 32
            if (r5 < r6) goto Le2
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r14.append(r5)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            goto Le7
        Le2:
            r5 = 63
            r14.append(r5)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        Le7:
            int r7 = r7 + 1
            goto Ld2
        Lea:
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            goto L38
        Lf0:
            int r14 = r0.length     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r5 = 1
            if (r14 != r5) goto L10f
            r14 = r0[r7]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            if (r14 < 0) goto L10f
            if (r14 > r5) goto L10f
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r14 = r14 + 48
            char r14 = (char) r14     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            char[] r5 = new char[r5]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r5[r7] = r14     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r4.close()     // Catch: java.io.IOException -> L10a
            return r0
        L10a:
            r14 = move-exception
            android.util.Log.e(r2, r1, r14)
            return r0
        L10f:
            java.lang.String r14 = new java.lang.String     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            java.nio.charset.Charset r5 = H1.g.f2102M     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r14.<init>(r0, r5)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            goto L38
        L118:
            r14 = move-exception
            goto L12c
        L11a:
            r14 = move-exception
            r4 = r3
        L11c:
            java.lang.String r0 = "IOException occurred during reading a value"
            android.util.Log.w(r2, r0, r14)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L12b
            r4.close()     // Catch: java.io.IOException -> L127
            goto L12b
        L127:
            r14 = move-exception
            android.util.Log.e(r2, r1, r14)
        L12b:
            return r3
        L12c:
            if (r3 == 0) goto L136
            r3.close()     // Catch: java.io.IOException -> L132
            goto L136
        L132:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
        L136:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.c.g(java.nio.ByteOrder):java.io.Serializable");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + g.f2092C[this.f2080a] + ", data length:" + this.f2083d.length + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public c(long j, byte[] bArr, int i, int i7) {
        this.f2080a = i;
        this.f2081b = i7;
        this.f2082c = j;
        this.f2083d = bArr;
    }
}
