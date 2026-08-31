package p3;

import C.C0061a;
import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import i0.C1129a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B0.G0 f15672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W f15673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15676e;
    public H0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public StringBuilder f15677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15678h;
    public StringBuilder i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x058a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void D(p3.S r16, java.lang.String r17, java.lang.String r18) {
        /*
            r0 = r16
            r1 = r18
            int r2 = r1.length()
            if (r2 != 0) goto Lc
            goto L6b0
        Lc:
            java.lang.String r2 = "inherit"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L16
            goto L6b0
        L16:
            p3.G0 r2 = p3.G0.a(r17)
            int r2 = r2.ordinal()
            java.lang.String r3 = "auto"
            r4 = 5
            r5 = 1
            if (r2 == r5) goto L64d
            r7 = 2
            if (r2 == r7) goto L63e
            java.lang.String r8 = "evenodd"
            java.lang.String r9 = "nonzero"
            r10 = 4
            if (r2 == r10) goto L61e
            if (r2 == r4) goto L610
            r12 = 8
            if (r2 == r12) goto L5e8
            r12 = 35
            if (r2 == r12) goto L5d9
            r12 = 40
            if (r2 == r12) goto L5cb
            r12 = 42
            java.lang.String r13 = "visible"
            if (r2 == r12) goto L57f
            r12 = 78
            r17 = r5
            java.lang.String r5 = "none"
            if (r2 == r12) goto L55b
            r12 = 58
            java.lang.String r7 = "SVGParser"
            p3.u r10 = p3.C1474u.f15847q
            java.lang.String r14 = "currentColor"
            if (r2 == r12) goto L537
            r12 = 59
            if (r2 == r12) goto L526
            r12 = 74
            if (r2 == r12) goto L4e3
            r12 = 75
            if (r2 == r12) goto L48a
            java.lang.String r4 = "italic"
            java.lang.String r12 = "oblique"
            java.lang.String r15 = "normal"
            java.lang.String r11 = "|"
            r6 = 124(0x7c, float:1.74E-43)
            switch(r2) {
                case 14: goto L456;
                case 15: goto L446;
                case 16: goto L427;
                case 17: goto L417;
                case 18: goto L32b;
                case 19: goto L31b;
                case 20: goto L2fc;
                case 21: goto L2e7;
                case 22: goto L2ab;
                default: goto L6d;
            }
        L6d:
            switch(r2) {
                case 27: goto L269;
                case 28: goto L256;
                case 29: goto L247;
                case 30: goto L238;
                case 31: goto L229;
                default: goto L70;
            }
        L70:
            java.lang.String r3 = "round"
            switch(r2) {
                case 62: goto L207;
                case 63: goto L1f8;
                case 64: goto L1e8;
                case 65: goto L173;
                case 66: goto L165;
                case 67: goto L13b;
                case 68: goto L111;
                case 69: goto Lff;
                case 70: goto Lef;
                case 71: goto Le1;
                default: goto L75;
            }
        L75:
            switch(r2) {
                case 88: goto Lbd;
                case 89: goto Lac;
                case 90: goto L7a;
                default: goto L78;
            }
        L78:
            goto L6b0
        L7a:
            int r2 = r1.indexOf(r6)
            if (r2 >= 0) goto L6b0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "|visible|hidden|collapse|"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L99
            goto L6b0
        L99:
            boolean r1 = r1.equals(r13)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.f15705K = r1
            long r1 = r0.f15724q
            r3 = 33554432(0x2000000, double:1.6578092E-316)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        Lac:
            java.lang.Float r1 = v(r1)
            r0.f15713S = r1
            long r1 = r0.f15724q
            r3 = 17179869184(0x400000000, double:8.4879831639E-314)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        Lbd:
            boolean r2 = r1.equals(r14)
            if (r2 == 0) goto Lc6
            r0.f15712R = r10
            goto Lcc
        Lc6:
            p3.t r1 = n(r1)     // Catch: p3.A0 -> Ld7
            r0.f15712R = r1     // Catch: p3.A0 -> Ld7
        Lcc:
            long r1 = r0.f15724q
            r3 = 8589934592(0x200000000, double:4.243991582E-314)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        Ld7:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            android.util.Log.w(r7, r0)
            goto L6b0
        Le1:
            p3.C r1 = s(r1)     // Catch: p3.A0 -> L6b0
            r0.f15729v = r1     // Catch: p3.A0 -> L6b0
            long r1 = r0.f15724q     // Catch: p3.A0 -> L6b0
            r3 = 32
            long r1 = r1 | r3
            r0.f15724q = r1     // Catch: p3.A0 -> L6b0
            return
        Lef:
            java.lang.Float r1 = v(r1)
            r0.f15728u = r1
            if (r1 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 16
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        Lff:
            float r1 = p(r1)     // Catch: p3.A0 -> L6b0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: p3.A0 -> L6b0
            r0.f15730w = r1     // Catch: p3.A0 -> L6b0
            long r1 = r0.f15724q     // Catch: p3.A0 -> L6b0
            r3 = 256(0x100, double:1.265E-321)
            long r1 = r1 | r3
            r0.f15724q = r1     // Catch: p3.A0 -> L6b0
            return
        L111:
            java.lang.String r2 = "miter"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L11c
            r5 = r17
            goto L12f
        L11c:
            boolean r2 = r3.equals(r1)
            if (r2 == 0) goto L124
            r5 = 2
            goto L12f
        L124:
            java.lang.String r2 = "bevel"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L12e
            r5 = 3
            goto L12f
        L12e:
            r5 = 0
        L12f:
            r0.f15716V = r5
            if (r5 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 128(0x80, double:6.32E-322)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L13b:
            java.lang.String r2 = "butt"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L146
            r5 = r17
            goto L159
        L146:
            boolean r2 = r3.equals(r1)
            if (r2 == 0) goto L14e
            r5 = 2
            goto L159
        L14e:
            java.lang.String r2 = "square"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L158
            r5 = 3
            goto L159
        L158:
            r5 = 0
        L159:
            r0.f15715U = r5
            if (r5 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 64
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L165:
            p3.C r1 = s(r1)     // Catch: p3.A0 -> L6b0
            r0.f15732y = r1     // Catch: p3.A0 -> L6b0
            long r1 = r0.f15724q     // Catch: p3.A0 -> L6b0
            r3 = 1024(0x400, double:5.06E-321)
            long r1 = r1 | r3
            r0.f15724q = r1     // Catch: p3.A0 -> L6b0
            return
        L173:
            boolean r2 = r5.equals(r1)
            r3 = 512(0x200, double:2.53E-321)
            if (r2 == 0) goto L184
            r2 = 0
            r0.f15731x = r2
            long r1 = r0.f15724q
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L184:
            r2 = 0
            p3.J r5 = new p3.J
            r5.<init>(r1)
            r5.y()
            boolean r1 = r5.m()
            if (r1 == 0) goto L195
        L193:
            r6 = r2
            goto L1de
        L195:
            p3.C r1 = r5.r()
            if (r1 != 0) goto L19c
            goto L193
        L19c:
            boolean r6 = r1.f()
            if (r6 == 0) goto L1a3
            goto L193
        L1a3:
            float r6 = r1.f15632q
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r1)
        L1ad:
            boolean r1 = r5.m()
            if (r1 != 0) goto L1cb
            r5.x()
            p3.C r1 = r5.r()
            if (r1 != 0) goto L1bd
            goto L193
        L1bd:
            boolean r8 = r1.f()
            if (r8 == 0) goto L1c4
            goto L193
        L1c4:
            r7.add(r1)
            float r1 = r1.f15632q
            float r6 = r6 + r1
            goto L1ad
        L1cb:
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L1d1
            goto L193
        L1d1:
            int r1 = r7.size()
            p3.C[] r1 = new p3.C[r1]
            java.lang.Object[] r1 = r7.toArray(r1)
            r6 = r1
            p3.C[] r6 = (p3.C[]) r6
        L1de:
            r0.f15731x = r6
            if (r6 == 0) goto L6b0
            long r1 = r0.f15724q
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L1e8:
            p3.b0 r1 = w(r1)
            r0.f15727t = r1
            if (r1 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 8
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L1f8:
            java.lang.Float r1 = v(r1)
            r0.f15707M = r1
            long r1 = r0.f15724q
            r3 = 134217728(0x8000000, double:6.63123685E-316)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L207:
            boolean r2 = r1.equals(r14)
            if (r2 == 0) goto L210
            r0.f15706L = r10
            goto L216
        L210:
            p3.t r1 = n(r1)     // Catch: p3.A0 -> L21f
            r0.f15706L = r1     // Catch: p3.A0 -> L21f
        L216:
            long r1 = r0.f15724q
            r3 = 67108864(0x4000000, double:3.31561842E-316)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L21f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            android.util.Log.w(r7, r0)
            goto L6b0
        L229:
            java.lang.String r1 = r(r1)
            r0.f15703I = r1
            long r1 = r0.f15724q
            r3 = 8388608(0x800000, double:4.144523E-317)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L238:
            java.lang.String r1 = r(r1)
            r0.f15702H = r1
            long r1 = r0.f15724q
            r3 = 4194304(0x400000, double:2.0722615E-317)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L247:
            java.lang.String r1 = r(r1)
            r0.f15701G = r1
            long r1 = r0.f15724q
            r3 = 2097152(0x200000, double:1.0361308E-317)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L256:
            java.lang.String r1 = r(r1)
            r0.f15701G = r1
            r0.f15702H = r1
            r0.f15703I = r1
            long r1 = r0.f15724q
            r3 = 14680064(0xe00000, double:7.2529153E-317)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L269:
            int r2 = r1.hashCode()
            switch(r2) {
                case -933002398: goto L287;
                case 3005871: goto L27d;
                case 362741610: goto L272;
                default: goto L270;
            }
        L270:
            r14 = -1
            goto L291
        L272:
            java.lang.String r2 = "optimizeSpeed"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L27b
            goto L270
        L27b:
            r14 = 2
            goto L291
        L27d:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L284
            goto L270
        L284:
            r14 = r17
            goto L291
        L287:
            java.lang.String r2 = "optimizeQuality"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L290
            goto L270
        L290:
            r14 = 0
        L291:
            switch(r14) {
                case 0: goto L29b;
                case 1: goto L298;
                case 2: goto L296;
                default: goto L294;
            }
        L294:
            r5 = 0
            goto L29c
        L296:
            r5 = 3
            goto L29c
        L298:
            r5 = r17
            goto L29c
        L29b:
            r5 = 2
        L29c:
            r0.f15723c0 = r5
            if (r5 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 137438953472(0x2000000000, double:6.7903865311E-313)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L2ab:
            int r2 = r1.hashCode()
            switch(r2) {
                case -1657669071: goto L2c7;
                case -1178781136: goto L2bd;
                case -1039745817: goto L2b4;
                default: goto L2b2;
            }
        L2b2:
            r14 = -1
            goto L2cf
        L2b4:
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L2bb
            goto L2b2
        L2bb:
            r14 = 2
            goto L2cf
        L2bd:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L2c4
            goto L2b2
        L2c4:
            r14 = r17
            goto L2cf
        L2c7:
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L2ce
            goto L2b2
        L2ce:
            r14 = 0
        L2cf:
            switch(r14) {
                case 0: goto L2d9;
                case 1: goto L2d7;
                case 2: goto L2d4;
                default: goto L2d2;
            }
        L2d2:
            r5 = 0
            goto L2da
        L2d4:
            r5 = r17
            goto L2da
        L2d7:
            r5 = 2
            goto L2da
        L2d9:
            r5 = 3
        L2da:
            r0.f15717W = r5
            if (r5 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 65536(0x10000, double:3.2379E-319)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L2e7:
            java.util.HashMap r2 = p3.E0.f15646a
            java.lang.Object r1 = r2.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0.f15698D = r1
            if (r1 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 32768(0x8000, double:1.61895E-319)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L2fc:
            r2 = 0
            java.util.HashMap r3 = p3.D0.f15639a     // Catch: p3.A0 -> L30e
            java.lang.Object r3 = r3.get(r1)     // Catch: p3.A0 -> L30e
            p3.C r3 = (p3.C) r3     // Catch: p3.A0 -> L30e
            if (r3 != 0) goto L30c
            p3.C r6 = s(r1)     // Catch: p3.A0 -> L30e
            goto L30f
        L30c:
            r6 = r3
            goto L30f
        L30e:
            r6 = r2
        L30f:
            r0.f15697C = r6
            if (r6 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 16384(0x4000, double:8.0948E-320)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L31b:
            java.util.ArrayList r1 = q(r1)
            r0.f15696B = r1
            if (r1 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 8192(0x2000, double:4.0474E-320)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L32b:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r11)
            r3.append(r1)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "|caption|icon|menu|message-box|small-caption|status-bar|"
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L345
            goto L6b0
        L345:
            p3.J r3 = new p3.J
            r3.<init>(r1)
            r1 = r2
            r6 = r1
            r5 = 0
        L34d:
            r7 = 47
            r10 = 0
            java.lang.String r8 = r3.u(r7, r10)
            r3.y()
            if (r8 != 0) goto L35b
            goto L6b0
        L35b:
            if (r1 == 0) goto L361
            if (r5 == 0) goto L361
            goto L3b5
        L361:
            boolean r9 = r8.equals(r15)
            if (r9 == 0) goto L368
            goto L34d
        L368:
            if (r1 != 0) goto L375
            java.util.HashMap r1 = p3.E0.f15646a
            java.lang.Object r1 = r1.get(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L375
            goto L34d
        L375:
            if (r5 != 0) goto L3a9
            int r5 = r8.hashCode()
            switch(r5) {
                case -1657669071: goto L393;
                case -1178781136: goto L389;
                case -1039745817: goto L380;
                default: goto L37e;
            }
        L37e:
            r5 = -1
            goto L39b
        L380:
            boolean r5 = r8.equals(r15)
            if (r5 != 0) goto L387
            goto L37e
        L387:
            r5 = 2
            goto L39b
        L389:
            boolean r5 = r8.equals(r4)
            if (r5 != 0) goto L390
            goto L37e
        L390:
            r5 = r17
            goto L39b
        L393:
            boolean r5 = r8.equals(r12)
            if (r5 != 0) goto L39a
            goto L37e
        L39a:
            r5 = r10
        L39b:
            switch(r5) {
                case 0: goto L3a5;
                case 1: goto L3a3;
                case 2: goto L3a0;
                default: goto L39e;
            }
        L39e:
            r5 = r10
            goto L3a6
        L3a0:
            r5 = r17
            goto L3a6
        L3a3:
            r5 = 2
            goto L3a6
        L3a5:
            r5 = 3
        L3a6:
            if (r5 == 0) goto L3a9
            goto L34d
        L3a9:
            if (r6 != 0) goto L3b5
            java.lang.String r6 = "small-caps"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L3b5
            r6 = r8
            goto L34d
        L3b5:
            java.util.HashMap r4 = p3.D0.f15639a     // Catch: p3.A0 -> L3c4
            java.lang.Object r4 = r4.get(r8)     // Catch: p3.A0 -> L3c4
            p3.C r4 = (p3.C) r4     // Catch: p3.A0 -> L3c4
            if (r4 != 0) goto L3c5
            p3.C r4 = s(r8)     // Catch: p3.A0 -> L3c4
            goto L3c5
        L3c4:
            r4 = r2
        L3c5:
            boolean r6 = r3.j(r7)
            if (r6 == 0) goto L3da
            r3.y()
            java.lang.String r6 = r3.t()
            if (r6 == 0) goto L3d7
            s(r6)     // Catch: p3.A0 -> L6b0
        L3d7:
            r3.y()
        L3da:
            boolean r6 = r3.m()
            if (r6 == 0) goto L3e2
            r6 = r2
            goto L3f0
        L3e2:
            int r2 = r3.f15668a
            int r6 = r3.f15669b
            r3.f15668a = r6
            java.lang.Object r3 = r3.f15670c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r6 = r3.substring(r2)
        L3f0:
            java.util.ArrayList r2 = q(r6)
            r0.f15696B = r2
            r0.f15697C = r4
            if (r1 != 0) goto L3fd
            r1 = 400(0x190, float:5.6E-43)
            goto L401
        L3fd:
            int r1 = r1.intValue()
        L401:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f15698D = r1
            if (r5 != 0) goto L40b
            r5 = r17
        L40b:
            r0.f15717W = r5
            long r1 = r0.f15724q
            r3 = 122880(0x1e000, double:6.0711E-319)
            long r1 = r1 | r3
            r0.f15724q = r1
            goto L6b0
        L417:
            java.lang.Float r1 = v(r1)
            r0.f15726s = r1
            if (r1 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 4
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L427:
            r10 = 0
            boolean r2 = r9.equals(r1)
            if (r2 == 0) goto L431
            r5 = r17
            goto L43a
        L431:
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L439
            r5 = 2
            goto L43a
        L439:
            r5 = r10
        L43a:
            r0.f15714T = r5
            if (r5 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 2
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L446:
            p3.b0 r1 = w(r1)
            r0.f15725r = r1
            if (r1 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 1
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L456:
            int r2 = r1.indexOf(r6)
            if (r2 >= 0) goto L6b0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L475
            goto L6b0
        L475:
            boolean r1 = r1.equals(r5)
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.f15704J = r1
            long r1 = r0.f15724q
            r3 = 16777216(0x1000000, double:8.289046E-317)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L48a:
            r10 = 0
            int r2 = r1.hashCode()
            switch(r2) {
                case -1171789332: goto L4bf;
                case -1026963764: goto L4b3;
                case 3387192: goto L4aa;
                case 93826908: goto L49f;
                case 529818312: goto L494;
                default: goto L492;
            }
        L492:
            r14 = -1
            goto L4c9
        L494:
            java.lang.String r2 = "overline"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L49d
            goto L492
        L49d:
            r14 = 4
            goto L4c9
        L49f:
            java.lang.String r2 = "blink"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4a8
            goto L492
        L4a8:
            r14 = 3
            goto L4c9
        L4aa:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L4b1
            goto L492
        L4b1:
            r14 = 2
            goto L4c9
        L4b3:
            java.lang.String r2 = "underline"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4bc
            goto L492
        L4bc:
            r14 = r17
            goto L4c9
        L4bf:
            java.lang.String r2 = "line-through"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4c8
            goto L492
        L4c8:
            r14 = r10
        L4c9:
            switch(r14) {
                case 0: goto L4d5;
                case 1: goto L4d3;
                case 2: goto L4d0;
                case 3: goto L4d6;
                case 4: goto L4ce;
                default: goto L4cc;
            }
        L4cc:
            r4 = r10
            goto L4d6
        L4ce:
            r4 = 3
            goto L4d6
        L4d0:
            r4 = r17
            goto L4d6
        L4d3:
            r4 = 2
            goto L4d6
        L4d5:
            r4 = 4
        L4d6:
            r0.f15718X = r4
            if (r4 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 131072(0x20000, double:6.47582E-319)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L4e3:
            r10 = 0
            int r2 = r1.hashCode()
            switch(r2) {
                case -1074341483: goto L504;
                case 100571: goto L4f8;
                case 109757538: goto L4ed;
                default: goto L4eb;
            }
        L4eb:
            r14 = -1
            goto L50e
        L4ed:
            java.lang.String r2 = "start"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4f6
            goto L4eb
        L4f6:
            r14 = 2
            goto L50e
        L4f8:
            java.lang.String r2 = "end"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L501
            goto L4eb
        L501:
            r14 = r17
            goto L50e
        L504:
            java.lang.String r2 = "middle"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L50d
            goto L4eb
        L50d:
            r14 = r10
        L50e:
            switch(r14) {
                case 0: goto L518;
                case 1: goto L516;
                case 2: goto L513;
                default: goto L511;
            }
        L511:
            r5 = r10
            goto L519
        L513:
            r5 = r17
            goto L519
        L516:
            r5 = 3
            goto L519
        L518:
            r5 = 2
        L519:
            r0.f15720Z = r5
            if (r5 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 262144(0x40000, double:1.295163E-318)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L526:
            java.lang.Float r1 = v(r1)
            r0.f15711Q = r1
            long r1 = r0.f15724q
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L537:
            boolean r2 = r1.equals(r14)
            if (r2 == 0) goto L540
            r0.f15710P = r10
            goto L546
        L540:
            p3.t r1 = n(r1)     // Catch: p3.A0 -> L551
            r0.f15710P = r1     // Catch: p3.A0 -> L551
        L546:
            long r1 = r0.f15724q
            r3 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L551:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            android.util.Log.w(r7, r0)
            goto L6b0
        L55b:
            r10 = 0
            boolean r2 = r1.equals(r5)
            if (r2 != 0) goto L56e
            java.lang.String r2 = "non-scaling-stroke"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L56c
            r5 = r10
            goto L570
        L56c:
            r5 = 2
            goto L570
        L56e:
            r5 = r17
        L570:
            r0.f15722b0 = r5
            if (r5 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 34359738368(0x800000000, double:1.69759663277E-313)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L57f:
            r17 = r5
            r2 = 0
            r10 = 0
            int r4 = r1.hashCode()
            switch(r4) {
                case -1217487446: goto L5aa;
                case -907680051: goto L59e;
                case 3005871: goto L595;
                case 466743410: goto L58c;
                default: goto L58a;
            }
        L58a:
            r5 = -1
            goto L5b4
        L58c:
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L593
            goto L58a
        L593:
            r5 = 3
            goto L5b4
        L595:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L59c
            goto L58a
        L59c:
            r5 = 2
            goto L5b4
        L59e:
            java.lang.String r3 = "scroll"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L5a7
            goto L58a
        L5a7:
            r5 = r17
            goto L5b4
        L5aa:
            java.lang.String r3 = "hidden"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L5b3
            goto L58a
        L5b3:
            r5 = r10
        L5b4:
            switch(r5) {
                case 0: goto L5bc;
                case 1: goto L5bc;
                case 2: goto L5b9;
                case 3: goto L5b9;
                default: goto L5b7;
            }
        L5b7:
            r6 = r2
            goto L5be
        L5b9:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            goto L5be
        L5bc:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        L5be:
            r0.f15699E = r6
            if (r6 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 524288(0x80000, double:2.590327E-318)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L5cb:
            java.lang.Float r1 = v(r1)
            r0.f15733z = r1
            long r1 = r0.f15724q
            r3 = 2048(0x800, double:1.0118E-320)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L5d9:
            java.lang.String r1 = r(r1)
            r0.f15709O = r1
            long r1 = r0.f15724q
            r3 = 1073741824(0x40000000, double:5.304989477E-315)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L5e8:
            r17 = r5
            r10 = 0
            java.lang.String r2 = "ltr"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L5ff
            java.lang.String r2 = "rtl"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L5fd
            r5 = r10
            goto L601
        L5fd:
            r5 = 2
            goto L601
        L5ff:
            r5 = r17
        L601:
            r0.f15719Y = r5
            if (r5 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L610:
            p3.t r1 = n(r1)     // Catch: p3.A0 -> L6b0
            r0.f15695A = r1     // Catch: p3.A0 -> L6b0
            long r1 = r0.f15724q     // Catch: p3.A0 -> L6b0
            r3 = 4096(0x1000, double:2.0237E-320)
            long r1 = r1 | r3
            r0.f15724q = r1     // Catch: p3.A0 -> L6b0
            return
        L61e:
            r17 = r5
            r10 = 0
            boolean r2 = r9.equals(r1)
            if (r2 == 0) goto L62a
            r5 = r17
            goto L633
        L62a:
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L632
            r5 = 2
            goto L633
        L632:
            r5 = r10
        L633:
            r0.f15721a0 = r5
            long r1 = r0.f15724q
            r3 = 536870912(0x20000000, double:2.652494739E-315)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L63e:
            java.lang.String r1 = r(r1)
            r0.f15708N = r1
            long r1 = r0.f15724q
            r3 = 268435456(0x10000000, double:1.32624737E-315)
            long r1 = r1 | r3
            r0.f15724q = r1
            return
        L64d:
            r2 = 0
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L656
        L654:
            r6 = r2
            goto L6a4
        L656:
            java.lang.String r3 = "rect("
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L65f
            goto L654
        L65f:
            p3.J r3 = new p3.J
            java.lang.String r1 = r1.substring(r4)
            r3.<init>(r1)
            r3.y()
            p3.C r1 = u(r3)
            r3.x()
            p3.C r4 = u(r3)
            r3.x()
            p3.C r5 = u(r3)
            r3.x()
            p3.C r6 = u(r3)
            r3.y()
            r7 = 41
            boolean r7 = r3.j(r7)
            if (r7 != 0) goto L696
            boolean r3 = r3.m()
            if (r3 != 0) goto L696
            goto L654
        L696:
            E.c0 r2 = new E.c0
            r2.<init>()
            r2.f1552q = r1
            r2.f1553r = r4
            r2.f1554s = r5
            r2.f1555t = r6
            goto L654
        L6a4:
            r0.f15700F = r6
            if (r6 == 0) goto L6b0
            long r1 = r0.f15724q
            r3 = 1048576(0x100000, double:5.180654E-318)
            long r1 = r1 | r3
            r0.f15724q = r1
        L6b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.J0.D(p3.S, java.lang.String, java.lang.String):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int b(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int d(float f, float f7, float f8) {
        float f9 = f % 360.0f;
        if (f < 0.0f) {
            f9 += 360.0f;
        }
        float f10 = f9 / 60.0f;
        float f11 = f7 / 100.0f;
        float f12 = f8 / 100.0f;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        } else if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        float f13 = f12 >= 0.0f ? f12 > 1.0f ? 1.0f : f12 : 0.0f;
        float f14 = f13 <= 0.5f ? (f11 + 1.0f) * f13 : (f13 + f11) - (f11 * f13);
        float f15 = (f13 * 2.0f) - f14;
        return b(e(f15, f14, f10 - 2.0f) * 256.0f) | (b(e(f15, f14, f10 + 2.0f) * 256.0f) << 16) | (b(e(f15, f14, f10) * 256.0f) << 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float e(float f, float f7, float f8) {
        if (f8 < 0.0f) {
            f8 += 6.0f;
        }
        if (f8 >= 6.0f) {
            f8 -= 6.0f;
        }
        return f8 < 1.0f ? k1.i.a(f7, f, f8, f) : f8 < 3.0f ? f7 : f8 < 4.0f ? k1.i.a(4.0f, f8, f7 - f, f) : f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(U u6, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iF = k1.i.f(attributes, i);
            if (iF != 73) {
                switch (iF) {
                    case 52:
                        J j = new J(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!j.m()) {
                            String strT = j.t();
                            if (strT.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strT.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            j.y();
                        }
                        u6.l(hashSet);
                        break;
                    case 53:
                        u6.c(strTrim);
                        break;
                    case 54:
                        J j7 = new J(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!j7.m()) {
                            hashSet2.add(j7.t());
                            j7.y();
                        }
                        u6.d(hashSet2);
                        break;
                    case 55:
                        ArrayList arrayListQ = q(strTrim);
                        u6.b(arrayListQ != null ? new HashSet(arrayListQ) : new HashSet(0));
                        break;
                }
            } else {
                J j8 = new J(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!j8.m()) {
                    String strT2 = j8.t();
                    int iIndexOf = strT2.indexOf(45);
                    if (iIndexOf != -1) {
                        strT2 = strT2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strT2, "", "").getLanguage());
                    j8.y();
                }
                u6.e(hashSet3);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(Y y6, Attributes attributes) throws A0 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                y6.f15742c = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    y6.f15743d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new A0(C0.S.w("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    y6.f15743d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(AbstractC1477x abstractC1477x, Attributes attributes) throws A0 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iF = k1.i.f(attributes, i);
            if (iF == 23) {
                abstractC1477x.j = z(strTrim);
            } else if (iF != 24) {
                if (iF != 26) {
                    if (iF != 60) {
                        continue;
                    } else {
                        try {
                            abstractC1477x.f15859k = k1.i.u(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new A0(C0.S.n("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                        }
                    }
                } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    abstractC1477x.f15860l = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                abstractC1477x.i = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new A0("Invalid value for attribute gradientUnits");
                }
                abstractC1477x.i = Boolean.TRUE;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(M m4, Attributes attributes, String str) throws A0 {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (G0.a(attributes.getLocalName(i)) == G0.f15653r) {
                J j = new J(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                j.y();
                while (!j.m()) {
                    float fQ = j.q();
                    if (Float.isNaN(fQ)) {
                        throw new A0(C0.S.n("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    j.x();
                    float fQ2 = j.q();
                    if (Float.isNaN(fQ2)) {
                        throw new A0(C0.S.n("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    j.x();
                    arrayList.add(Float.valueOf(fQ));
                    arrayList.add(Float.valueOf(fQ2));
                }
                m4.f15687o = new float[arrayList.size()];
                int size = arrayList.size();
                int i7 = 0;
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    m4.f15687o[i7] = ((Float) obj).floatValue();
                    i7++;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(Y y6, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iF = k1.i.f(attributes, i);
                if (iF == 0) {
                    C1449c c1449c = new C1449c(strTrim);
                    ArrayList arrayList = null;
                    while (!c1449c.m()) {
                        String strT = c1449c.t();
                        if (strT != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strT);
                            c1449c.y();
                        }
                    }
                    y6.f15745g = arrayList;
                } else if (iF != 72) {
                    if (y6.f15744e == null) {
                        y6.f15744e = new S();
                    }
                    D(y6.f15744e, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    J j = new J(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strU = j.u(':', false);
                        j.y();
                        if (!j.j(':')) {
                            break;
                        }
                        j.y();
                        String strU2 = j.u(';', true);
                        if (strU2 == null) {
                            break;
                        }
                        j.y();
                        if (j.m() || j.j(';')) {
                            if (y6.f == null) {
                                y6.f = new S();
                            }
                            D(y6.f, strU, strU2);
                            j.y();
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k(n0 n0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iF = k1.i.f(attributes, i);
            if (iF == 9) {
                n0Var.f15799p = t(strTrim);
            } else if (iF == 10) {
                n0Var.f15800q = t(strTrim);
            } else if (iF == 82) {
                n0Var.f15797n = t(strTrim);
            } else if (iF == 83) {
                n0Var.f15798o = t(strTrim);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l(InterfaceC1444A interfaceC1444A, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (G0.a(attributes.getLocalName(i)) == G0.f15654s) {
                interfaceC1444A.g(z(attributes.getValue(i)));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(AbstractC1454e0 abstractC1454e0, Attributes attributes) throws A0 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iF = k1.i.f(attributes, i);
            if (iF == 48) {
                x(abstractC1454e0, strTrim);
            } else if (iF != 80) {
                continue;
            } else {
                J j = new J(strTrim);
                j.y();
                float fQ = j.q();
                j.x();
                float fQ2 = j.q();
                j.x();
                float fQ3 = j.q();
                j.x();
                float fQ4 = j.q();
                if (Float.isNaN(fQ) || Float.isNaN(fQ2) || Float.isNaN(fQ3) || Float.isNaN(fQ4)) {
                    throw new A0("Invalid viewBox definition - should have four numbers");
                }
                if (fQ3 < 0.0f) {
                    throw new A0("Invalid viewBox. width cannot be negative");
                }
                if (fQ4 < 0.0f) {
                    throw new A0("Invalid viewBox. height cannot be negative");
                }
                abstractC1454e0.f15764o = new C1129a(fQ, fQ2, fQ3, fQ4);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1473t n(String str) throws A0 {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            K5.h hVar = null;
            if (1 < length) {
                long j7 = 0;
                int i7 = 1;
                while (i7 < length) {
                    char cCharAt = str.charAt(i7);
                    if (cCharAt < '0' || cCharAt > '9') {
                        if (cCharAt >= 'A' && cCharAt <= 'F') {
                            j = j7 * 16;
                            i = cCharAt - 'A';
                        } else {
                            if (cCharAt < 'a' || cCharAt > 'f') {
                                break;
                            }
                            j = j7 * 16;
                            i = cCharAt - 'a';
                        }
                        j7 = j + ((long) i) + 10;
                    } else {
                        j7 = (j7 * 16) + ((long) (cCharAt - '0'));
                    }
                    if (j7 > 4294967295L) {
                        break;
                    }
                    i7++;
                }
                if (i7 != 1) {
                    hVar = new K5.h(j7, i7);
                }
            }
            if (hVar == null) {
                throw new A0("Bad hex colour value: ".concat(str));
            }
            long j8 = hVar.f2990b;
            int i8 = hVar.f2989a;
            if (i8 == 4) {
                int i9 = (int) j8;
                int i10 = i9 & 3840;
                int i11 = i9 & 240;
                int i12 = i9 & 15;
                return new C1473t(i12 | (i10 << 8) | (-16777216) | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4));
            }
            if (i8 != 5) {
                if (i8 == 7) {
                    return new C1473t(((int) j8) | (-16777216));
                }
                if (i8 != 9) {
                    throw new A0("Bad hex colour value: ".concat(str));
                }
                int i13 = (int) j8;
                return new C1473t((i13 >>> 8) | (i13 << 24));
            }
            int i14 = (int) j8;
            int i15 = 61440 & i14;
            int i16 = i14 & 3840;
            int i17 = i14 & 240;
            int i18 = i14 & 15;
            return new C1473t((i18 << 24) | (i18 << 28) | (i15 << 8) | (i15 << 4) | (i16 << 4) | i16 | i17 | (i17 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            J j9 = new J(str.substring(zStartsWith ? 5 : 4));
            j9.y();
            float fQ = j9.q();
            if (!Float.isNaN(fQ) && j9.j('%')) {
                fQ = (fQ * 256.0f) / 100.0f;
            }
            float fI = j9.i(fQ);
            if (!Float.isNaN(fI) && j9.j('%')) {
                fI = (fI * 256.0f) / 100.0f;
            }
            float fI2 = j9.i(fI);
            if (!Float.isNaN(fI2) && j9.j('%')) {
                fI2 = (fI2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                j9.y();
                if (Float.isNaN(fI2) || !j9.j(')')) {
                    throw new A0("Bad rgb() colour value: ".concat(str));
                }
                return new C1473t((b(fQ) << 16) | (-16777216) | (b(fI) << 8) | b(fI2));
            }
            float fI3 = j9.i(fI2);
            j9.y();
            if (Float.isNaN(fI3) || !j9.j(')')) {
                throw new A0("Bad rgba() colour value: ".concat(str));
            }
            return new C1473t((b(fI3 * 256.0f) << 24) | (b(fQ) << 16) | (b(fI) << 8) | b(fI2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) C0.f15634a.get(lowerCase);
            if (num != null) {
                return new C1473t(num.intValue());
            }
            throw new A0("Invalid colour keyword: ".concat(lowerCase));
        }
        J j10 = new J(str.substring(zStartsWith2 ? 5 : 4));
        j10.y();
        float fQ2 = j10.q();
        float fI4 = j10.i(fQ2);
        if (!Float.isNaN(fI4)) {
            j10.j('%');
        }
        float fI5 = j10.i(fI4);
        if (!Float.isNaN(fI5)) {
            j10.j('%');
        }
        if (!zStartsWith2) {
            j10.y();
            if (Float.isNaN(fI5) || !j10.j(')')) {
                throw new A0("Bad hsl() colour value: ".concat(str));
            }
            return new C1473t(d(fQ2, fI4, fI5) | (-16777216));
        }
        float fI6 = j10.i(fI5);
        j10.y();
        if (Float.isNaN(fI6) || !j10.j(')')) {
            throw new A0("Bad hsla() colour value: ".concat(str));
        }
        return new C1473t((b(fI6 * 256.0f) << 24) | d(fQ2, fI4, fI5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float o(int i, String str) throws A0 {
        float fA = new C1469o().a(str, 0, i);
        if (Float.isNaN(fA)) {
            throw new A0(C0.S.w("Invalid float value: ", str));
        }
        return fA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float p(String str) throws A0 {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        throw new A0("Invalid float value (empty string)");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList q(String str) {
        J j = new J(str);
        ArrayList arrayList = null;
        do {
            String strS = j.s();
            if (strS == null) {
                strS = j.u(',', true);
            }
            if (strS == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strS);
            j.x();
        } while (!j.m());
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String r(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C s(String str) throws A0 {
        int iV;
        if (str.length() == 0) {
            throw new A0("Invalid length value (empty string)");
        }
        int length = str.length();
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            iV = 9;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                iV = k1.i.v(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new A0("Invalid length unit specifier: ".concat(str));
            }
        } else {
            iV = 1;
        }
        try {
            return new C(iV, o(length, str));
        } catch (NumberFormatException e7) {
            throw new A0("Invalid length value: ".concat(str), e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList t(String str) throws A0 {
        if (str.length() == 0) {
            throw new A0("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        J j = new J(str);
        j.y();
        while (!j.m()) {
            float fQ = j.q();
            if (Float.isNaN(fQ)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = (String) j.f15670c;
                int i = j.f15668a;
                while (!j.m() && !J.o(str2.charAt(j.f15668a))) {
                    j.f15668a++;
                }
                String strSubstring = str2.substring(i, j.f15668a);
                j.f15668a = i;
                sb.append(strSubstring);
                throw new A0(sb.toString());
            }
            int iV = j.v();
            if (iV == 0) {
                iV = 1;
            }
            arrayList.add(new C(iV, fQ));
            j.x();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C u(J j) {
        return j.k("auto") ? new C(0.0f) : j.r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Float v(String str) {
        try {
            float fP = p(str);
            float f = 0.0f;
            if (fP < 0.0f) {
                fP = f;
            } else {
                f = 1.0f;
                if (fP > 1.0f) {
                    fP = f;
                }
            }
            return Float.valueOf(fP);
        } catch (A0 unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AbstractC1448b0 w(String str) {
        boolean zStartsWith = str.startsWith("url(");
        AbstractC1448b0 abstractC1448b0N = C1473t.f15842s;
        C1474u c1474u = C1474u.f15847q;
        AbstractC1448b0 abstractC1448b0 = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return abstractC1448b0N;
            }
            if (str.equals("currentColor")) {
                return c1474u;
            }
            try {
                return n(str);
            } catch (A0 unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new H(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    abstractC1448b0N = c1474u;
                } else {
                    try {
                        abstractC1448b0N = n(strTrim2);
                    } catch (A0 unused2) {
                        abstractC1448b0N = null;
                    }
                }
            }
            abstractC1448b0 = abstractC1448b0N;
        }
        return new H(strTrim, abstractC1448b0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void x(AbstractC1450c0 abstractC1450c0, String str) throws A0 {
        int i;
        J j = new J(str);
        j.y();
        String strT = j.t();
        if ("defer".equals(strT)) {
            j.y();
            strT = j.t();
        }
        EnumC1470p enumC1470p = (EnumC1470p) B0.f15631a.get(strT);
        j.y();
        if (j.m()) {
            i = 0;
        } else {
            String strT2 = j.t();
            strT2.getClass();
            if (strT2.equals("meet")) {
                i = 1;
            } else {
                if (!strT2.equals("slice")) {
                    throw new A0("Invalid preserveAspectRatio definition: ".concat(str));
                }
                i = 2;
            }
        }
        abstractC1450c0.f15755n = new C1471q(enumC1470p, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static HashMap y(J j) {
        HashMap map = new HashMap();
        j.y();
        String strU = j.u('=', false);
        while (strU != null) {
            j.j('=');
            map.put(strU, j.s());
            j.y();
            strU = j.u('=', false);
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Matrix z(String str) throws A0 {
        Matrix matrix = new Matrix();
        J j = new J(str);
        j.y();
        while (!j.m()) {
            String str2 = (String) j.f15670c;
            String strSubstring = null;
            if (!j.m()) {
                int i = j.f15668a;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = j.g();
                    }
                }
                int i7 = j.f15668a;
                while (J.o(iCharAt)) {
                    iCharAt = j.g();
                }
                if (iCharAt == 40) {
                    j.f15668a++;
                    strSubstring = str2.substring(i, i7);
                } else {
                    j.f15668a = i;
                }
            }
            if (strSubstring == null) {
                throw new A0("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    j.y();
                    float fQ = j.q();
                    j.x();
                    float fQ2 = j.q();
                    j.x();
                    float fQ3 = j.q();
                    j.x();
                    float fQ4 = j.q();
                    j.x();
                    float fQ5 = j.q();
                    j.x();
                    float fQ6 = j.q();
                    j.y();
                    if (Float.isNaN(fQ6) || !j.j(')')) {
                        throw new A0("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fQ, fQ3, fQ5, fQ2, fQ4, fQ6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    j.y();
                    float fQ7 = j.q();
                    float fW = j.w();
                    float fW2 = j.w();
                    j.y();
                    if (Float.isNaN(fQ7) || !j.j(')')) {
                        throw new A0("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fW)) {
                        matrix.preRotate(fQ7);
                    } else {
                        if (Float.isNaN(fW2)) {
                            throw new A0("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fQ7, fW, fW2);
                    }
                    break;
                    break;
                case "scale":
                    j.y();
                    float fQ8 = j.q();
                    float fW3 = j.w();
                    j.y();
                    if (Float.isNaN(fQ8) || !j.j(')')) {
                        throw new A0("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fW3)) {
                        matrix.preScale(fQ8, fW3);
                    } else {
                        matrix.preScale(fQ8, fQ8);
                    }
                    break;
                    break;
                case "skewX":
                    j.y();
                    float fQ9 = j.q();
                    j.y();
                    if (Float.isNaN(fQ9) || !j.j(')')) {
                        throw new A0("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fQ9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    j.y();
                    float fQ10 = j.q();
                    j.y();
                    if (Float.isNaN(fQ10) || !j.j(')')) {
                        throw new A0("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fQ10)));
                    break;
                    break;
                case "translate":
                    j.y();
                    float fQ11 = j.q();
                    float fW4 = j.w();
                    j.y();
                    if (Float.isNaN(fQ11) || !j.j(')')) {
                        throw new A0("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fW4)) {
                        matrix.preTranslate(fQ11, fW4);
                    } else {
                        matrix.preTranslate(fQ11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new A0(C0.S.n("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (j.m()) {
                return matrix;
            }
            j.x();
        }
        return matrix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(InputStream inputStream) throws A0 {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            F0 f02 = new F0(this);
            xMLReader.setContentHandler(f02);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", f02);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e7) {
            throw new A0("Stream error", e7);
        } catch (ParserConfigurationException e8) {
            throw new A0("XML parser problem", e8);
        } catch (SAXException e9) {
            throw new A0("SVG parse error", e9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(InputStream inputStream) throws A0 {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                I0 i02 = new I0();
                i02.f15667a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        E();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        J j = new J(xmlPullParserNewPullParser.getText());
                        String strT = j.t();
                        y(j);
                        strT.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (((T) this.f15672a.f234r) == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                A(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        F(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, i02);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        H(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        G(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (XmlPullParserException e7) {
                throw new A0("XML parser problem", e7);
            }
        } catch (IOException e8) {
            throw new A0("Stream error", e8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0343, code lost:
    
        android.util.Log.e("SVGParser", "Bad path coords for " + ((char) r5) + " path segment");
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0356 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(org.xml.sax.Attributes r25) throws p3.A0 {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            p3.W r2 = r0.f15673b
            if (r2 == 0) goto L365
            p3.I r3 = new p3.I
            r3.<init>()
            B0.G0 r4 = r0.f15672a
            r3.f15750a = r4
            r3.f15751b = r2
            g(r3, r1)
            j(r3, r1)
            l(r3, r1)
            f(r3, r1)
            r2 = 0
            r4 = r2
        L21:
            int r5 = r1.getLength()
            if (r4 >= r5) goto L35f
            java.lang.String r5 = r1.getValue(r4)
            java.lang.String r5 = r5.trim()
            int r6 = k1.i.f(r1, r4)
            r7 = 13
            r8 = 0
            if (r6 == r7) goto L51
            r7 = 43
            if (r6 == r7) goto L40
        L3c:
            r22 = r4
            goto L358
        L40:
            float r5 = p(r5)
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 < 0) goto L49
            goto L3c
        L49:
            p3.A0 r1 = new p3.A0
            java.lang.String r2 = "Invalid <path> element. pathLength cannot be negative"
            r1.<init>(r2)
            throw r1
        L51:
            p3.J r6 = new p3.J
            r6.<init>(r5)
            p3.J r9 = new p3.J
            r9.<init>()
            r9.f15668a = r2
            r9.f15669b = r2
            r5 = 8
            byte[] r5 = new byte[r5]
            r9.f15670c = r5
            r5 = 16
            float[] r5 = new float[r5]
            r9.f15671d = r5
            boolean r5 = r6.m()
            if (r5 == 0) goto L72
        L71:
            goto Lca
        L72:
            java.lang.Integer r5 = r6.p()
            int r5 = r5.intValue()
            r7 = 77
            r10 = 109(0x6d, float:1.53E-43)
            if (r5 == r7) goto L83
            if (r5 == r10) goto L83
            goto L71
        L83:
            r7 = r8
            r11 = r7
            r12 = r11
            r13 = r12
            r17 = r13
            r18 = r17
        L8b:
            r6.y()
            r15 = 108(0x6c, float:1.51E-43)
            r16 = 1073741824(0x40000000, float:2.0)
            java.lang.String r2 = " path segment"
            r19 = r8
            java.lang.String r8 = "Bad path coords for "
            java.lang.String r10 = "SVGParser"
            switch(r5) {
                case 65: goto L2a9;
                case 67: goto L259;
                case 72: goto L228;
                case 76: goto L1f0;
                case 77: goto L1a8;
                case 81: goto L162;
                case 83: goto L114;
                case 84: goto Lda;
                case 86: goto Lad;
                case 90: goto L9e;
                case 97: goto L2a9;
                case 99: goto L259;
                case 104: goto L228;
                case 108: goto L1f0;
                case 109: goto L1a8;
                case 113: goto L162;
                case 115: goto L114;
                case 116: goto Lda;
                case 118: goto Lad;
                case 122: goto L9e;
                default: goto L9d;
            }
        L9d:
            goto L71
        L9e:
            r9.close()
            r22 = r4
            r7 = r17
            r11 = r7
            r12 = r18
        La8:
            r13 = r12
        La9:
            r20 = 109(0x6d, float:1.53E-43)
            goto L307
        Lad:
            float r13 = r6.q()
            boolean r15 = java.lang.Float.isNaN(r13)
            if (r15 == 0) goto Lce
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            char r5 = (char) r5
            r6.append(r5)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.util.Log.e(r10, r2)
        Lca:
            r22 = r4
            goto L356
        Lce:
            r2 = 118(0x76, float:1.65E-43)
            if (r5 != r2) goto Ld3
            float r13 = r13 + r12
        Ld3:
            r12 = r13
            r9.e(r7, r12)
            r22 = r4
            goto La8
        Lda:
            float r15 = r7 * r16
            float r11 = r15 - r11
            float r16 = r16 * r12
            float r13 = r16 - r13
            float r15 = r6.q()
            float r16 = r6.i(r15)
            boolean r21 = java.lang.Float.isNaN(r16)
            if (r21 == 0) goto L104
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            char r5 = (char) r5
            r6.append(r5)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.util.Log.e(r10, r2)
            goto Lca
        L104:
            r2 = 116(0x74, float:1.63E-43)
            if (r5 != r2) goto L10b
            float r15 = r15 + r7
            float r16 = r16 + r12
        L10b:
            r7 = r15
            r12 = r16
            r9.d(r11, r13, r7, r12)
            r22 = r4
            goto La9
        L114:
            float r15 = r7 * r16
            float r15 = r15 - r11
            float r16 = r16 * r12
            float r11 = r16 - r13
            float r13 = r6.q()
            float r14 = r6.i(r13)
            float r1 = r6.i(r14)
            float r21 = r6.i(r1)
            boolean r22 = java.lang.Float.isNaN(r21)
            if (r22 == 0) goto L145
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            char r5 = (char) r5
            r1.append(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r10, r1)
            goto Lca
        L145:
            r2 = 115(0x73, float:1.61E-43)
            if (r5 != r2) goto L14e
            float r1 = r1 + r7
            float r21 = r21 + r12
            float r13 = r13 + r7
            float r14 = r14 + r12
        L14e:
            r12 = r13
            r13 = r14
            r10 = r15
            r15 = r21
            r20 = 109(0x6d, float:1.53E-43)
            r14 = r1
            r1 = 97
            r9.b(r10, r11, r12, r13, r14, r15)
        L15b:
            r11 = r12
            r7 = r14
            r12 = r15
            r22 = r4
            goto L307
        L162:
            r1 = 97
            r11 = 109(0x6d, float:1.53E-43)
            float r13 = r6.q()
            float r14 = r6.i(r13)
            float r15 = r6.i(r14)
            float r16 = r6.i(r15)
            boolean r20 = java.lang.Float.isNaN(r16)
            if (r20 == 0) goto L191
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            char r5 = (char) r5
            r1.append(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r10, r1)
            goto Lca
        L191:
            r2 = 113(0x71, float:1.58E-43)
            if (r5 != r2) goto L19a
            float r15 = r15 + r7
            float r16 = r16 + r12
            float r13 = r13 + r7
            float r14 = r14 + r12
        L19a:
            r7 = r15
            r12 = r16
            r9.d(r13, r14, r7, r12)
            r22 = r4
            r20 = r11
            r11 = r13
            r13 = r14
            goto L307
        L1a8:
            r1 = 97
            r11 = 109(0x6d, float:1.53E-43)
            float r13 = r6.q()
            float r14 = r6.i(r13)
            boolean r16 = java.lang.Float.isNaN(r14)
            if (r16 == 0) goto L1cf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            char r5 = (char) r5
            r1.append(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r10, r1)
            goto Lca
        L1cf:
            if (r5 != r11) goto L1d8
            int r2 = r9.f15668a
            if (r2 != 0) goto L1d6
            goto L1d8
        L1d6:
            float r13 = r13 + r7
            float r14 = r14 + r12
        L1d8:
            r7 = r13
            r12 = r14
            r9.a(r7, r12)
            if (r5 != r11) goto L1e0
            goto L1e2
        L1e0:
            r15 = 76
        L1e2:
            r22 = r4
            r17 = r7
            r20 = r11
            r13 = r12
            r18 = r13
            r5 = r15
            r11 = r17
            goto L307
        L1f0:
            r1 = 97
            r11 = 109(0x6d, float:1.53E-43)
            float r13 = r6.q()
            float r14 = r6.i(r13)
            boolean r16 = java.lang.Float.isNaN(r14)
            if (r16 == 0) goto L217
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            char r5 = (char) r5
            r1.append(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r10, r1)
            goto Lca
        L217:
            if (r5 != r15) goto L21b
            float r13 = r13 + r7
            float r14 = r14 + r12
        L21b:
            r7 = r13
            r12 = r14
            r9.e(r7, r12)
            r22 = r4
            r20 = r11
            r13 = r12
        L225:
            r11 = r7
            goto L307
        L228:
            r1 = 97
            r11 = 109(0x6d, float:1.53E-43)
            float r14 = r6.q()
            boolean r15 = java.lang.Float.isNaN(r14)
            if (r15 == 0) goto L24b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            char r5 = (char) r5
            r1.append(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r10, r1)
            goto Lca
        L24b:
            r2 = 104(0x68, float:1.46E-43)
            if (r5 != r2) goto L250
            float r14 = r14 + r7
        L250:
            r7 = r14
            r9.e(r7, r12)
            r22 = r4
            r20 = r11
            goto L225
        L259:
            r1 = 97
            r11 = 109(0x6d, float:1.53E-43)
            float r13 = r6.q()
            float r14 = r6.i(r13)
            float r15 = r6.i(r14)
            float r11 = r6.i(r15)
            float r1 = r6.i(r11)
            float r16 = r6.i(r1)
            boolean r22 = java.lang.Float.isNaN(r16)
            if (r22 == 0) goto L290
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            char r5 = (char) r5
            r1.append(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r10, r1)
            goto Lca
        L290:
            r2 = 99
            if (r5 != r2) goto L29b
            float r1 = r1 + r7
            float r16 = r16 + r12
            float r13 = r13 + r7
            float r14 = r14 + r12
            float r15 = r15 + r7
            float r11 = r11 + r12
        L29b:
            r10 = r13
            r12 = r15
            r15 = r16
            r20 = 109(0x6d, float:1.53E-43)
            r13 = r11
            r11 = r14
            r14 = r1
            r9.b(r10, r11, r12, r13, r14, r15)
            goto L15b
        L2a9:
            r1 = r10
            r20 = 109(0x6d, float:1.53E-43)
            float r10 = r6.q()
            float r11 = r6.i(r10)
            r13 = r12
            float r12 = r6.i(r11)
            java.lang.Float r14 = java.lang.Float.valueOf(r12)
            java.lang.Boolean r14 = r6.h(r14)
            java.lang.Boolean r15 = r6.h(r14)
            if (r15 != 0) goto L2ce
            r16 = 2143289344(0x7fc00000, float:NaN)
        L2c9:
            r22 = r4
            r4 = r16
            goto L2d6
        L2ce:
            r6.x()
            float r16 = r6.q()
            goto L2c9
        L2d6:
            float r16 = r6.i(r4)
            boolean r23 = java.lang.Float.isNaN(r16)
            if (r23 != 0) goto L343
            int r23 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r23 < 0) goto L343
            int r23 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r23 >= 0) goto L2e9
            goto L343
        L2e9:
            r23 = r4
            r4 = 97
            if (r5 != r4) goto L2f4
            float r4 = r23 + r7
            float r16 = r16 + r13
            goto L2f6
        L2f4:
            r4 = r23
        L2f6:
            boolean r13 = r14.booleanValue()
            boolean r14 = r15.booleanValue()
            r15 = r4
            r9.c(r10, r11, r12, r13, r14, r15, r16)
            r7 = r15
            r11 = r7
            r12 = r16
            r13 = r12
        L307:
            r6.x()
            boolean r1 = r6.m()
            if (r1 == 0) goto L311
            goto L356
        L311:
            int r1 = r6.f15668a
            int r2 = r6.f15669b
            if (r1 != r2) goto L318
            goto L338
        L318:
            java.lang.Object r2 = r6.f15670c
            java.lang.String r2 = (java.lang.String) r2
            char r1 = r2.charAt(r1)
            r4 = 97
            if (r1 < r4) goto L328
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 <= r2) goto L330
        L328:
            r2 = 65
            if (r1 < r2) goto L338
            r2 = 90
            if (r1 > r2) goto L338
        L330:
            java.lang.Integer r1 = r6.p()
            int r5 = r1.intValue()
        L338:
            r1 = r25
            r8 = r19
            r10 = r20
            r4 = r22
            r2 = 0
            goto L8b
        L343:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r8)
            char r5 = (char) r5
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.e(r1, r2)
        L356:
            r3.f15666o = r9
        L358:
            int r4 = r22 + 1
            r1 = r25
            r2 = 0
            goto L21
        L35f:
            p3.W r1 = r0.f15673b
            r1.j(r3)
            return
        L365:
            p3.A0 r1 = new p3.A0
            java.lang.String r2 = "Invalid document. Root element must be <svg>"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.J0.C(org.xml.sax.Attributes):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E() {
        B0.G0 g02 = new B0.G0(29, false);
        g02.f234r = null;
        g02.f235s = new F3.c(2);
        g02.f236t = new HashMap();
        this.f15672a = g02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x00fe, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x0478, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0630, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x06ec, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x090f, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x0b3f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(java.lang.String r17, java.lang.String r18, java.lang.String r19, org.xml.sax.Attributes r20) throws p3.A0 {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r20
            boolean r3 = r1.f15674c
            r4 = 1
            if (r3 == 0) goto L11
            int r0 = r1.f15675d
            int r0 = r0 + r4
            r1.f15675d = r0
            return
        L11:
            java.lang.String r3 = "http://www.w3.org/2000/svg"
            boolean r3 = r3.equals(r0)
            java.lang.String r5 = ""
            if (r3 != 0) goto L22
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L22
            return
        L22:
            int r0 = r18.length()
            if (r0 <= 0) goto L2b
            r0 = r18
            goto L2d
        L2b:
            r0 = r19
        L2d:
            java.util.HashMap r3 = p3.H0.f15664u
            java.lang.Object r0 = r3.get(r0)
            p3.H0 r0 = (p3.H0) r0
            if (r0 == 0) goto L38
            goto L3a
        L38:
            p3.H0 r0 = p3.H0.f15663t
        L3a:
            int r3 = r0.ordinal()
            r7 = 56
            java.lang.String r9 = "Invalid <use> element. height cannot be negative"
            java.lang.String r10 = "Invalid <use> element. width cannot be negative"
            r11 = 37
            java.lang.String r14 = "objectBoundingBox"
            java.lang.String r15 = "userSpaceOnUse"
            java.lang.String r8 = "http://www.w3.org/1999/xlink"
            r12 = 26
            r13 = 25
            java.lang.String r6 = "Invalid document. Root element must be <svg>"
            switch(r3) {
                case 0: goto Lad9;
                case 1: goto Laae;
                case 2: goto La3e;
                case 3: goto L9db;
                case 4: goto L9b3;
                case 5: goto L9ae;
                case 6: goto L926;
                case 7: goto Laae;
                case 8: goto L88a;
                case 9: goto L82d;
                case 10: goto L7cf;
                case 11: goto L706;
                case 12: goto L64e;
                case 13: goto L64a;
                case 14: goto L568;
                case 15: goto L53c;
                case 16: goto L510;
                case 17: goto L48f;
                case 18: goto L3e5;
                case 19: goto L3c2;
                case 20: goto L32d;
                case 21: goto L2cc;
                case 22: goto L2a1;
                case 23: goto L276;
                case 24: goto L248;
                case 25: goto L1d3;
                case 26: goto L9ae;
                case 27: goto L15f;
                case 28: goto L115;
                case 29: goto L82;
                case 30: goto L5a;
                default: goto L55;
            }
        L55:
            r1.f15674c = r4
            r1.f15675d = r4
            return
        L5a:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L7c
            p3.q0 r0 = new p3.q0
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            f(r0, r2)
            m(r0, r2)
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            return
        L7c:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L82:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L10f
            p3.p0 r0 = new p3.p0
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            l(r0, r2)
            f(r0, r2)
            r6 = 0
        La0:
            int r3 = r2.getLength()
            if (r6 >= r3) goto L107
            java.lang.String r3 = r2.getValue(r6)
            java.lang.String r3 = r3.trim()
            int r4 = k1.i.f(r2, r6)
            if (r4 == r13) goto Lf2
            if (r4 == r12) goto Ldb
            switch(r4) {
                case 81: goto Lc8;
                case 82: goto Lc1;
                case 83: goto Lba;
                default: goto Lb9;
            }
        Lb9:
            goto Lfe
        Lba:
            p3.C r3 = s(r3)
            r0.f15818q = r3
            goto Lfe
        Lc1:
            p3.C r3 = s(r3)
            r0.f15817p = r3
            goto Lfe
        Lc8:
            p3.C r3 = s(r3)
            r0.f15819r = r3
            boolean r3 = r3.f()
            if (r3 != 0) goto Ld5
            goto Lfe
        Ld5:
            p3.A0 r0 = new p3.A0
            r0.<init>(r10)
            throw r0
        Ldb:
            java.lang.String r4 = r2.getURI(r6)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto Lef
            java.lang.String r4 = r2.getURI(r6)
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto Lfe
        Lef:
            r0.f15816o = r3
            goto Lfe
        Lf2:
            p3.C r3 = s(r3)
            r0.f15820s = r3
            boolean r3 = r3.f()
            if (r3 != 0) goto L101
        Lfe:
            int r6 = r6 + 1
            goto La0
        L101:
            p3.A0 r0 = new p3.A0
            r0.<init>(r9)
            throw r0
        L107:
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            return
        L10f:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L115:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L159
            boolean r0 = r0 instanceof p3.l0
            if (r0 == 0) goto L151
            p3.i0 r0 = new p3.i0
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            f(r0, r2)
            k(r0, r2)
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            p3.W r2 = r0.f15751b
            boolean r3 = r2 instanceof p3.C1464j0
            if (r3 == 0) goto L148
            p3.j0 r2 = (p3.C1464j0) r2
            r0.f15780r = r2
            return
        L148:
            p3.k0 r2 = (p3.k0) r2
            p3.j0 r2 = r2.k()
            r0.f15780r = r2
            return
        L151:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements."
            r0.<init>(r2)
            throw r0
        L159:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L15f:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L1cd
            boolean r0 = r0 instanceof p3.l0
            if (r0 == 0) goto L1c5
            p3.h0 r0 = new p3.h0
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            f(r0, r2)
            r6 = 0
        L17e:
            int r3 = r2.getLength()
            if (r6 >= r3) goto L1ac
            java.lang.String r3 = r2.getValue(r6)
            java.lang.String r3 = r3.trim()
            int r4 = k1.i.f(r2, r6)
            if (r4 == r12) goto L193
            goto L1a9
        L193:
            java.lang.String r4 = r2.getURI(r6)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L1a7
            java.lang.String r4 = r2.getURI(r6)
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L1a9
        L1a7:
            r0.f15777n = r3
        L1a9:
            int r6 = r6 + 1
            goto L17e
        L1ac:
            p3.W r2 = r1.f15673b
            r2.j(r0)
            p3.W r2 = r0.f15751b
            boolean r3 = r2 instanceof p3.C1464j0
            if (r3 == 0) goto L1bc
            p3.j0 r2 = (p3.C1464j0) r2
            r0.f15778o = r2
            return
        L1bc:
            p3.k0 r2 = (p3.k0) r2
            p3.j0 r2 = r2.k()
            r0.f15778o = r2
            return
        L1c5:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid document. <tref> elements are only valid inside <text> or <tspan> elements."
            r0.<init>(r2)
            throw r0
        L1cd:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L1d3:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L242
            p3.m0 r0 = new p3.m0
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            f(r0, r2)
            r6 = 0
        L1ee:
            int r3 = r2.getLength()
            if (r6 >= r3) goto L227
            java.lang.String r3 = r2.getValue(r6)
            java.lang.String r3 = r3.trim()
            int r4 = k1.i.f(r2, r6)
            if (r4 == r12) goto L20e
            r7 = 61
            if (r4 == r7) goto L207
            goto L224
        L207:
            p3.C r3 = s(r3)
            r0.f15791o = r3
            goto L224
        L20e:
            java.lang.String r4 = r2.getURI(r6)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L222
            java.lang.String r4 = r2.getURI(r6)
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L224
        L222:
            r0.f15790n = r3
        L224:
            int r6 = r6 + 1
            goto L1ee
        L227:
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            p3.W r2 = r0.f15751b
            boolean r3 = r2 instanceof p3.C1464j0
            if (r3 == 0) goto L239
            p3.j0 r2 = (p3.C1464j0) r2
            r0.f15792p = r2
            return
        L239:
            p3.k0 r2 = (p3.k0) r2
            p3.j0 r2 = r2.k()
            r0.f15792p = r2
            return
        L242:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L248:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L270
            p3.j0 r0 = new p3.j0
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            l(r0, r2)
            f(r0, r2)
            k(r0, r2)
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            return
        L270:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L276:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L29b
            p3.g0 r0 = new p3.g0
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            f(r0, r2)
            m(r0, r2)
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            return
        L29b:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L2a1:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L2c6
            p3.f0 r0 = new p3.f0
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            l(r0, r2)
            f(r0, r2)
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            return
        L2c6:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L2cc:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L327
            java.lang.String r0 = "all"
            r5 = r4
            r3 = 0
        L2d4:
            int r6 = r2.getLength()
            if (r3 >= r6) goto L2fa
            java.lang.String r6 = r2.getValue(r3)
            java.lang.String r6 = r6.trim()
            int r7 = k1.i.f(r2, r3)
            r8 = 38
            if (r7 == r8) goto L2f6
            r8 = 77
            if (r7 == r8) goto L2ef
            goto L2f7
        L2ef:
            java.lang.String r5 = "text/css"
            boolean r5 = r6.equals(r5)
            goto L2f7
        L2f6:
            r0 = r6
        L2f7:
            int r3 = r3 + 1
            goto L2d4
        L2fa:
            if (r5 == 0) goto L322
            p3.c r2 = new p3.c
            r2.<init>(r0)
            r2.y()
            java.util.ArrayList r0 = C.C0061a.f(r2)
            int r2 = r0.size()
            r6 = 0
        L30d:
            if (r6 >= r2) goto L322
            java.lang.Object r3 = r0.get(r6)
            int r6 = r6 + 1
            p3.d r3 = (p3.EnumC1451d) r3
            p3.d r5 = p3.EnumC1451d.f15756q
            if (r3 == r5) goto L31f
            p3.d r5 = p3.EnumC1451d.f15757r
            if (r3 != r5) goto L30d
        L31f:
            r1.f15678h = r4
            return
        L322:
            r1.f15674c = r4
            r1.f15675d = r4
            return
        L327:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L32d:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L3bc
            boolean r3 = r0 instanceof p3.AbstractC1477x
            if (r3 == 0) goto L3b4
            p3.Q r3 = new p3.Q
            r3.<init>()
            B0.G0 r5 = r1.f15672a
            r3.f15750a = r5
            r3.f15751b = r0
            g(r3, r2)
            j(r3, r2)
            r0 = 0
        L347:
            int r5 = r2.getLength()
            if (r0 >= r5) goto L3ac
            java.lang.String r5 = r2.getValue(r0)
            java.lang.String r5 = r5.trim()
            int r6 = k1.i.f(r2, r0)
            r7 = 39
            if (r6 == r7) goto L35e
            goto L394
        L35e:
            int r6 = r5.length()
            if (r6 == 0) goto L3a4
            int r6 = r5.length()
            int r7 = r5.length()
            int r7 = r7 - r4
            char r7 = r5.charAt(r7)
            if (r7 != r11) goto L377
            int r6 = r6 + (-1)
            r7 = r4
            goto L378
        L377:
            r7 = 0
        L378:
            float r6 = o(r6, r5)     // Catch: java.lang.NumberFormatException -> L397
            r8 = 1120403456(0x42c80000, float:100.0)
            if (r7 == 0) goto L381
            float r6 = r6 / r8
        L381:
            r7 = 0
            int r9 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r9 >= 0) goto L388
            r8 = r7
            goto L38e
        L388:
            int r7 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r7 <= 0) goto L38d
            goto L38e
        L38d:
            r8 = r6
        L38e:
            java.lang.Float r5 = java.lang.Float.valueOf(r8)     // Catch: java.lang.NumberFormatException -> L397
            r3.f15694h = r5
        L394:
            int r0 = r0 + 1
            goto L347
        L397:
            r0 = move-exception
            p3.A0 r2 = new p3.A0
            java.lang.String r3 = "Invalid offset value in <stop>: "
            java.lang.String r3 = r3.concat(r5)
            r2.<init>(r3, r0)
            throw r2
        L3a4:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid offset value in <stop> (empty string)"
            r0.<init>(r2)
            throw r0
        L3ac:
            p3.W r0 = r1.f15673b
            r0.j(r3)
            r1.f15673b = r3
            return
        L3b4:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements."
            r0.<init>(r2)
            throw r0
        L3bc:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L3c2:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L3df
            p3.P r3 = new p3.P
            r3.<init>()
            B0.G0 r4 = r1.f15672a
            r3.f15750a = r4
            r3.f15751b = r0
            g(r3, r2)
            j(r3, r2)
            p3.W r0 = r1.f15673b
            r0.j(r3)
            r1.f15673b = r3
            return
        L3df:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L3e5:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L489
            p3.O r3 = new p3.O
            r3.<init>()
            B0.G0 r4 = r1.f15672a
            r3.f15750a = r4
            r3.f15751b = r0
            g(r3, r2)
            j(r3, r2)
            l(r3, r2)
            f(r3, r2)
            r6 = 0
        L401:
            int r0 = r2.getLength()
            if (r6 >= r0) goto L483
            java.lang.String r0 = r2.getValue(r6)
            java.lang.String r0 = r0.trim()
            int r4 = k1.i.f(r2, r6)
            if (r4 == r13) goto L46c
            if (r4 == r7) goto L457
            r5 = 57
            if (r4 == r5) goto L442
            switch(r4) {
                case 81: goto L42d;
                case 82: goto L426;
                case 83: goto L41f;
                default: goto L41e;
            }
        L41e:
            goto L478
        L41f:
            p3.C r0 = s(r0)
            r3.f15689p = r0
            goto L478
        L426:
            p3.C r0 = s(r0)
            r3.f15688o = r0
            goto L478
        L42d:
            p3.C r0 = s(r0)
            r3.f15690q = r0
            boolean r0 = r0.f()
            if (r0 != 0) goto L43a
            goto L478
        L43a:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <rect> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L442:
            p3.C r0 = s(r0)
            r3.f15693t = r0
            boolean r0 = r0.f()
            if (r0 != 0) goto L44f
            goto L478
        L44f:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <rect> element. ry cannot be negative"
            r0.<init>(r2)
            throw r0
        L457:
            p3.C r0 = s(r0)
            r3.f15692s = r0
            boolean r0 = r0.f()
            if (r0 != 0) goto L464
            goto L478
        L464:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <rect> element. rx cannot be negative"
            r0.<init>(r2)
            throw r0
        L46c:
            p3.C r0 = s(r0)
            r3.f15691r = r0
            boolean r0 = r0.f()
            if (r0 != 0) goto L47b
        L478:
            int r6 = r6 + 1
            goto L401
        L47b:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <rect> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L483:
            p3.W r0 = r1.f15673b
            r0.j(r3)
            return
        L489:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L48f:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L50a
            p3.d0 r0 = new p3.d0
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            h(r0, r2)
            r6 = 0
        L4aa:
            int r3 = r2.getLength()
            if (r6 >= r3) goto L502
            java.lang.String r3 = r2.getValue(r6)
            java.lang.String r3 = r3.trim()
            int r4 = k1.i.f(r2, r6)
            r5 = 6
            if (r4 == r5) goto L4f9
            r5 = 7
            if (r4 == r5) goto L4f2
            r5 = 11
            if (r4 == r5) goto L4eb
            r5 = 12
            if (r4 == r5) goto L4e4
            r5 = 49
            if (r4 == r5) goto L4cf
            goto L4ff
        L4cf:
            p3.C r3 = s(r3)
            r0.f15761o = r3
            boolean r3 = r3.f()
            if (r3 != 0) goto L4dc
            goto L4ff
        L4dc:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <radialGradient> element. r cannot be negative"
            r0.<init>(r2)
            throw r0
        L4e4:
            p3.C r3 = s(r3)
            r0.f15763q = r3
            goto L4ff
        L4eb:
            p3.C r3 = s(r3)
            r0.f15762p = r3
            goto L4ff
        L4f2:
            p3.C r3 = s(r3)
            r0.f15760n = r3
            goto L4ff
        L4f9:
            p3.C r3 = s(r3)
            r0.f15759m = r3
        L4ff:
            int r6 = r6 + 1
            goto L4aa
        L502:
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            return
        L50a:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L510:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L536
            p3.M r3 = new p3.M
            r3.<init>()
            B0.G0 r4 = r1.f15672a
            r3.f15750a = r4
            r3.f15751b = r0
            g(r3, r2)
            j(r3, r2)
            l(r3, r2)
            f(r3, r2)
            java.lang.String r0 = "polyline"
            i(r3, r2, r0)
            p3.W r0 = r1.f15673b
            r0.j(r3)
            return
        L536:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L53c:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L562
            p3.N r3 = new p3.N
            r3.<init>()
            B0.G0 r4 = r1.f15672a
            r3.f15750a = r4
            r3.f15751b = r0
            g(r3, r2)
            j(r3, r2)
            l(r3, r2)
            f(r3, r2)
            java.lang.String r0 = "polygon"
            i(r3, r2, r0)
            p3.W r0 = r1.f15673b
            r0.j(r3)
            return
        L562:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L568:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L644
            p3.L r0 = new p3.L
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            f(r0, r2)
            m(r0, r2)
            r6 = 0
        L586:
            int r3 = r2.getLength()
            if (r6 >= r3) goto L63c
            java.lang.String r3 = r2.getValue(r6)
            java.lang.String r3 = r3.trim()
            int r4 = k1.i.f(r2, r6)
            if (r4 == r13) goto L624
            if (r4 == r12) goto L60d
            switch(r4) {
                case 44: goto L5ef;
                case 45: goto L5e8;
                case 46: goto L5ca;
                default: goto L59f;
            }
        L59f:
            switch(r4) {
                case 81: goto L5b4;
                case 82: goto L5ac;
                case 83: goto L5a4;
                default: goto L5a2;
            }
        L5a2:
            goto L630
        L5a4:
            p3.C r3 = s(r3)
            r0.f15683t = r3
            goto L630
        L5ac:
            p3.C r3 = s(r3)
            r0.f15682s = r3
            goto L630
        L5b4:
            p3.C r3 = s(r3)
            r0.f15684u = r3
            boolean r3 = r3.f()
            if (r3 != 0) goto L5c2
            goto L630
        L5c2:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <pattern> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L5ca:
            boolean r4 = r14.equals(r3)
            if (r4 == 0) goto L5d5
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.f15679p = r3
            goto L630
        L5d5:
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L5e0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.f15679p = r3
            goto L630
        L5e0:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid value for attribute patternUnits"
            r0.<init>(r2)
            throw r0
        L5e8:
            android.graphics.Matrix r3 = z(r3)
            r0.f15681r = r3
            goto L630
        L5ef:
            boolean r4 = r14.equals(r3)
            if (r4 == 0) goto L5fa
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.f15680q = r3
            goto L630
        L5fa:
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L605
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.f15680q = r3
            goto L630
        L605:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid value for attribute patternContentUnits"
            r0.<init>(r2)
            throw r0
        L60d:
            java.lang.String r4 = r2.getURI(r6)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L621
            java.lang.String r4 = r2.getURI(r6)
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L630
        L621:
            r0.f15686w = r3
            goto L630
        L624:
            p3.C r3 = s(r3)
            r0.f15685v = r3
            boolean r3 = r3.f()
            if (r3 != 0) goto L634
        L630:
            int r6 = r6 + 1
            goto L586
        L634:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <pattern> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L63c:
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            return
        L644:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L64a:
            r1.C(r2)
            return
        L64e:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L700
            p3.F r0 = new p3.F
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            f(r0, r2)
            r6 = 0
        L669:
            int r3 = r2.getLength()
            if (r6 >= r3) goto L6f8
            java.lang.String r3 = r2.getValue(r6)
            java.lang.String r3 = r3.trim()
            int r4 = k1.i.f(r2, r6)
            if (r4 == r13) goto L6e0
            r5 = 36
            if (r4 == r5) goto L6c2
            if (r4 == r11) goto L6a4
            switch(r4) {
                case 81: goto L68f;
                case 82: goto L68b;
                case 83: goto L687;
                default: goto L686;
            }
        L686:
            goto L6ec
        L687:
            s(r3)
            goto L6ec
        L68b:
            s(r3)
            goto L6ec
        L68f:
            p3.C r3 = s(r3)
            r0.f15649p = r3
            boolean r3 = r3.f()
            if (r3 != 0) goto L69c
            goto L6ec
        L69c:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <mask> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L6a4:
            boolean r4 = r14.equals(r3)
            if (r4 == 0) goto L6af
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.f15647n = r3
            goto L6ec
        L6af:
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L6ba
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.f15647n = r3
            goto L6ec
        L6ba:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid value for attribute maskUnits"
            r0.<init>(r2)
            throw r0
        L6c2:
            boolean r4 = r14.equals(r3)
            if (r4 == 0) goto L6cd
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.f15648o = r3
            goto L6ec
        L6cd:
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L6d8
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.f15648o = r3
            goto L6ec
        L6d8:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid value for attribute maskContentUnits"
            r0.<init>(r2)
            throw r0
        L6e0:
            p3.C r3 = s(r3)
            r0.f15650q = r3
            boolean r3 = r3.f()
            if (r3 != 0) goto L6f0
        L6ec:
            int r6 = r6 + 1
            goto L669
        L6f0:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <mask> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L6f8:
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            return
        L700:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L706:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L7c9
            p3.E r0 = new p3.E
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            f(r0, r2)
            m(r0, r2)
            r3 = 0
        L724:
            int r5 = r2.getLength()
            if (r3 >= r5) goto L7c1
            java.lang.String r5 = r2.getValue(r3)
            java.lang.String r5 = r5.trim()
            int r6 = k1.i.f(r2, r3)
            r7 = 41
            if (r6 == r7) goto L7a1
            r7 = 50
            if (r6 == r7) goto L799
            r7 = 51
            if (r6 == r7) goto L791
            switch(r6) {
                case 32: goto L77b;
                case 33: goto L75d;
                case 34: goto L748;
                default: goto L745;
            }
        L745:
            r11 = 0
            goto L7bd
        L748:
            p3.C r5 = s(r5)
            r0.f15643s = r5
            boolean r5 = r5.f()
            if (r5 != 0) goto L755
            goto L745
        L755:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <marker> element. markerWidth cannot be negative"
            r0.<init>(r2)
            throw r0
        L75d:
            java.lang.String r6 = "strokeWidth"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L769
            r11 = 0
            r0.f15640p = r11
            goto L7bd
        L769:
            r11 = 0
            boolean r5 = r15.equals(r5)
            if (r5 == 0) goto L773
            r0.f15640p = r4
            goto L7bd
        L773:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid value for attribute markerUnits"
            r0.<init>(r2)
            throw r0
        L77b:
            r11 = 0
            p3.C r5 = s(r5)
            r0.f15644t = r5
            boolean r5 = r5.f()
            if (r5 != 0) goto L789
            goto L7bd
        L789:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <marker> element. markerHeight cannot be negative"
            r0.<init>(r2)
            throw r0
        L791:
            r11 = 0
            p3.C r5 = s(r5)
            r0.f15642r = r5
            goto L7bd
        L799:
            r11 = 0
            p3.C r5 = s(r5)
            r0.f15641q = r5
            goto L7bd
        L7a1:
            r11 = 0
            java.lang.String r6 = "auto"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L7b3
            r5 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r0.f15645u = r5
            goto L7bd
        L7b3:
            float r5 = p(r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r0.f15645u = r5
        L7bd:
            int r3 = r3 + 1
            goto L724
        L7c1:
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            return
        L7c9:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L7cf:
            r11 = 0
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L827
            p3.Z r0 = new p3.Z
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            h(r0, r2)
            r6 = r11
        L7eb:
            int r3 = r2.getLength()
            if (r6 >= r3) goto L81f
            java.lang.String r3 = r2.getValue(r6)
            java.lang.String r3 = r3.trim()
            int r4 = k1.i.f(r2, r6)
            switch(r4) {
                case 84: goto L816;
                case 85: goto L80f;
                case 86: goto L808;
                case 87: goto L801;
                default: goto L800;
            }
        L800:
            goto L81c
        L801:
            p3.C r3 = s(r3)
            r0.f15749p = r3
            goto L81c
        L808:
            p3.C r3 = s(r3)
            r0.f15748o = r3
            goto L81c
        L80f:
            p3.C r3 = s(r3)
            r0.f15747n = r3
            goto L81c
        L816:
            p3.C r3 = s(r3)
            r0.f15746m = r3
        L81c:
            int r6 = r6 + 1
            goto L7eb
        L81f:
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            return
        L827:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L82d:
            r11 = 0
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L884
            p3.D r3 = new p3.D
            r3.<init>()
            B0.G0 r4 = r1.f15672a
            r3.f15750a = r4
            r3.f15751b = r0
            g(r3, r2)
            j(r3, r2)
            l(r3, r2)
            f(r3, r2)
            r6 = r11
        L84a:
            int r0 = r2.getLength()
            if (r6 >= r0) goto L87e
            java.lang.String r0 = r2.getValue(r6)
            java.lang.String r0 = r0.trim()
            int r4 = k1.i.f(r2, r6)
            switch(r4) {
                case 84: goto L875;
                case 85: goto L86e;
                case 86: goto L867;
                case 87: goto L860;
                default: goto L85f;
            }
        L85f:
            goto L87b
        L860:
            p3.C r0 = s(r0)
            r3.f15638r = r0
            goto L87b
        L867:
            p3.C r0 = s(r0)
            r3.f15637q = r0
            goto L87b
        L86e:
            p3.C r0 = s(r0)
            r3.f15636p = r0
            goto L87b
        L875:
            p3.C r0 = s(r0)
            r3.f15635o = r0
        L87b:
            int r6 = r6 + 1
            goto L84a
        L87e:
            p3.W r0 = r1.f15673b
            r0.j(r3)
            return
        L884:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L88a:
            r11 = 0
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L920
            p3.B r0 = new p3.B
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            l(r0, r2)
            f(r0, r2)
            r6 = r11
        L8a9:
            int r3 = r2.getLength()
            if (r6 >= r3) goto L918
            java.lang.String r3 = r2.getValue(r6)
            java.lang.String r3 = r3.trim()
            int r4 = k1.i.f(r2, r6)
            if (r4 == r13) goto L903
            if (r4 == r12) goto L8ec
            r7 = 48
            if (r4 == r7) goto L8e8
            switch(r4) {
                case 81: goto L8d5;
                case 82: goto L8ce;
                case 83: goto L8c7;
                default: goto L8c6;
            }
        L8c6:
            goto L90f
        L8c7:
            p3.C r3 = s(r3)
            r0.f15627q = r3
            goto L90f
        L8ce:
            p3.C r3 = s(r3)
            r0.f15626p = r3
            goto L90f
        L8d5:
            p3.C r3 = s(r3)
            r0.f15628r = r3
            boolean r3 = r3.f()
            if (r3 != 0) goto L8e2
            goto L90f
        L8e2:
            p3.A0 r0 = new p3.A0
            r0.<init>(r10)
            throw r0
        L8e8:
            x(r0, r3)
            goto L90f
        L8ec:
            java.lang.String r4 = r2.getURI(r6)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L900
            java.lang.String r4 = r2.getURI(r6)
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L90f
        L900:
            r0.f15625o = r3
            goto L90f
        L903:
            p3.C r3 = s(r3)
            r0.f15629s = r3
            boolean r3 = r3.f()
            if (r3 != 0) goto L912
        L90f:
            int r6 = r6 + 1
            goto L8a9
        L912:
            p3.A0 r0 = new p3.A0
            r0.<init>(r9)
            throw r0
        L918:
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            return
        L920:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L926:
            r11 = 0
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L9a8
            p3.w r3 = new p3.w
            r3.<init>()
            B0.G0 r4 = r1.f15672a
            r3.f15750a = r4
            r3.f15751b = r0
            g(r3, r2)
            j(r3, r2)
            l(r3, r2)
            f(r3, r2)
            r6 = r11
        L943:
            int r0 = r2.getLength()
            if (r6 >= r0) goto L9a2
            java.lang.String r0 = r2.getValue(r6)
            java.lang.String r0 = r0.trim()
            int r4 = k1.i.f(r2, r6)
            r5 = 6
            if (r4 == r5) goto L997
            r5 = 7
            if (r4 == r5) goto L98e
            if (r4 == r7) goto L977
            r5 = 57
            if (r4 == r5) goto L962
            goto L99f
        L962:
            p3.C r0 = s(r0)
            r3.f15854r = r0
            boolean r0 = r0.f()
            if (r0 != 0) goto L96f
            goto L99f
        L96f:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <ellipse> element. ry cannot be negative"
            r0.<init>(r2)
            throw r0
        L977:
            r5 = 57
            p3.C r0 = s(r0)
            r3.f15853q = r0
            boolean r0 = r0.f()
            if (r0 != 0) goto L986
            goto L99f
        L986:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <ellipse> element. rx cannot be negative"
            r0.<init>(r2)
            throw r0
        L98e:
            r5 = 57
            p3.C r0 = s(r0)
            r3.f15852p = r0
            goto L99f
        L997:
            r5 = 57
            p3.C r0 = s(r0)
            r3.f15851o = r0
        L99f:
            int r6 = r6 + 1
            goto L943
        L9a2:
            p3.W r0 = r1.f15673b
            r0.j(r3)
            return
        L9a8:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L9ae:
            r1.f15676e = r4
            r1.f = r0
            return
        L9b3:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto L9d5
            p3.v r0 = new p3.v
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            l(r0, r2)
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            return
        L9d5:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        L9db:
            r11 = 0
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto La38
            p3.s r0 = new p3.s
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            l(r0, r2)
            f(r0, r2)
            r6 = r11
        L9fa:
            int r3 = r2.getLength()
            if (r6 >= r3) goto La30
            java.lang.String r3 = r2.getValue(r6)
            java.lang.String r3 = r3.trim()
            int r4 = k1.i.f(r2, r6)
            r5 = 3
            if (r4 == r5) goto La10
            goto La25
        La10:
            boolean r4 = r14.equals(r3)
            if (r4 == 0) goto La1b
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.f15835o = r3
            goto La25
        La1b:
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto La28
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.f15835o = r3
        La25:
            int r6 = r6 + 1
            goto L9fa
        La28:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid value for attribute clipPathUnits"
            r0.<init>(r2)
            throw r0
        La30:
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            return
        La38:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        La3e:
            r11 = 0
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto Laa8
            p3.r r3 = new p3.r
            r3.<init>()
            B0.G0 r4 = r1.f15672a
            r3.f15750a = r4
            r3.f15751b = r0
            g(r3, r2)
            j(r3, r2)
            l(r3, r2)
            f(r3, r2)
            r6 = r11
        La5b:
            int r0 = r2.getLength()
            if (r6 >= r0) goto Laa2
            java.lang.String r0 = r2.getValue(r6)
            java.lang.String r0 = r0.trim()
            int r4 = k1.i.f(r2, r6)
            r5 = 6
            if (r4 == r5) goto La96
            r7 = 7
            if (r4 == r7) goto La8d
            r8 = 49
            if (r4 == r8) goto La78
            goto La9f
        La78:
            p3.C r0 = s(r0)
            r3.f15827q = r0
            boolean r0 = r0.f()
            if (r0 != 0) goto La85
            goto La9f
        La85:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <circle> element. r cannot be negative"
            r0.<init>(r2)
            throw r0
        La8d:
            r8 = 49
            p3.C r0 = s(r0)
            r3.f15826p = r0
            goto La9f
        La96:
            r7 = 7
            r8 = 49
            p3.C r0 = s(r0)
            r3.f15825o = r0
        La9f:
            int r6 = r6 + 1
            goto La5b
        Laa2:
            p3.W r0 = r1.f15673b
            r0.j(r3)
            return
        Laa8:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        Laae:
            p3.W r0 = r1.f15673b
            if (r0 == 0) goto Lad3
            p3.z r0 = new p3.z
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            l(r0, r2)
            f(r0, r2)
            p3.W r2 = r1.f15673b
            r2.j(r0)
            r1.f15673b = r0
            return
        Lad3:
            p3.A0 r0 = new p3.A0
            r0.<init>(r6)
            throw r0
        Lad9:
            r11 = 0
            p3.T r0 = new p3.T
            r0.<init>()
            B0.G0 r3 = r1.f15672a
            r0.f15750a = r3
            p3.W r3 = r1.f15673b
            r0.f15751b = r3
            g(r0, r2)
            j(r0, r2)
            f(r0, r2)
            m(r0, r2)
            r6 = r11
        Laf4:
            int r3 = r2.getLength()
            if (r6 >= r3) goto Lb4a
            java.lang.String r3 = r2.getValue(r6)
            java.lang.String r3 = r3.trim()
            int r4 = k1.i.f(r2, r6)
            if (r4 == r13) goto Lb33
            r5 = 79
            if (r4 == r5) goto Lb3f
            switch(r4) {
                case 81: goto Lb1e;
                case 82: goto Lb17;
                case 83: goto Lb10;
                default: goto Lb0f;
            }
        Lb0f:
            goto Lb3f
        Lb10:
            p3.C r3 = s(r3)
            r0.f15735q = r3
            goto Lb3f
        Lb17:
            p3.C r3 = s(r3)
            r0.f15734p = r3
            goto Lb3f
        Lb1e:
            p3.C r3 = s(r3)
            r0.f15736r = r3
            boolean r3 = r3.f()
            if (r3 != 0) goto Lb2b
            goto Lb3f
        Lb2b:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <svg> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        Lb33:
            p3.C r3 = s(r3)
            r0.f15737s = r3
            boolean r3 = r3.f()
            if (r3 != 0) goto Lb42
        Lb3f:
            int r6 = r6 + 1
            goto Laf4
        Lb42:
            p3.A0 r0 = new p3.A0
            java.lang.String r2 = "Invalid <svg> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        Lb4a:
            p3.W r2 = r1.f15673b
            if (r2 != 0) goto Lb53
            B0.G0 r2 = r1.f15672a
            r2.f234r = r0
            goto Lb56
        Lb53:
            r2.j(r0)
        Lb56:
            r1.f15673b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.J0.F(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G(String str) {
        if (this.f15674c) {
            return;
        }
        if (this.f15676e) {
            if (this.f15677g == null) {
                this.f15677g = new StringBuilder(str.length());
            }
            this.f15677g.append(str);
        } else if (this.f15678h) {
            if (this.i == null) {
                this.i = new StringBuilder(str.length());
            }
            this.i.append(str);
        } else if (this.f15673b instanceof l0) {
            a(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(char[] cArr, int i, int i7) {
        if (this.f15674c) {
            return;
        }
        if (this.f15676e) {
            if (this.f15677g == null) {
                this.f15677g = new StringBuilder(i7);
            }
            this.f15677g.append(cArr, i, i7);
        } else if (this.f15678h) {
            if (this.i == null) {
                this.i = new StringBuilder(i7);
            }
            this.i.append(cArr, i, i7);
        } else if (this.f15673b instanceof l0) {
            a(new String(cArr, i, i7));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(String str) {
        V v6 = (V) this.f15673b;
        int size = v6.i.size();
        AbstractC1446a0 abstractC1446a0 = size == 0 ? null : (AbstractC1446a0) v6.i.get(size - 1);
        if (abstractC1446a0 instanceof o0) {
            o0 o0Var = (o0) abstractC1446a0;
            o0Var.f15804c = k1.i.k(new StringBuilder(), o0Var.f15804c, str);
        } else {
            W w3 = this.f15673b;
            o0 o0Var2 = new o0();
            o0Var2.f15804c = str;
            w3.j(o0Var2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(String str, String str2, String str3) {
        if (this.f15674c) {
            int i = this.f15675d - 1;
            this.f15675d = i;
            if (i == 0) {
                this.f15674c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            H0 h02 = (H0) H0.f15664u.get(str2);
            if (h02 == null) {
                h02 = H0.f15663t;
            }
            switch (h02.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case WorkDatabaseVersions.VERSION_17 /* 17 */:
                case WorkDatabaseVersions.VERSION_19 /* 19 */:
                case 20:
                case 22:
                case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.f15673b = ((AbstractC1446a0) this.f15673b).f15751b;
                    break;
                case 5:
                case 26:
                    this.f15676e = false;
                    if (this.f15677g != null) {
                        H0 h03 = this.f;
                        if (h03 == H0.f15662s || h03 == H0.f15660q) {
                            this.f15672a.getClass();
                        }
                        this.f15677g.setLength(0);
                    }
                    break;
                case WorkDatabaseVersions.VERSION_21 /* 21 */:
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        this.f15678h = false;
                        String string = sb.toString();
                        C0061a c0061a = new C0061a(1);
                        B0.G0 g02 = this.f15672a;
                        C1449c c1449c = new C1449c(string);
                        c1449c.y();
                        ((F3.c) g02.f235s).b(c0061a.h(c1449c));
                        this.i.setLength(0);
                    }
                    break;
            }
        }
    }
}
