package com.google.android.gms.internal.measurement;

import E1.C0145c;
import P.C0371o;
import a3.C0632k;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.wnapp.smspariaz.R;
import h3.C1122a;
import h3.C1123b;
import i0.C1131c;
import i3.C1139d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import m3.AbstractC1360a;
import m3.C1361b;
import m5.AbstractC1362a;
import m5.C1373l;
import m5.C1379r;
import o3.C1415a;
import o5.C1420b;
import w1.AbstractC1835K;
import w1.C1834J;
import w1.InterfaceC1846i;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0836n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f10919a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f10920b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f10921c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f10922d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List A(Object... elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        return elements.length > 0 ? n5.k.x0(elements) : n5.s.f15299q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ArrayList B(Map map, B5.c cVar) {
        kotlin.jvm.internal.m.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() != null) {
                throw new ClassCastException();
            }
            kotlin.jvm.internal.m.b(null);
            throw null;
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) cVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList C(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new n5.i(objArr, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List D(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : z(list.get(0)) : n5.s.f15299q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long E(long j, float f) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        W0.o[] oVarArr = W0.n.f8026b;
        return jFloatToRawIntBits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:130:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014c  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:62:0x0199
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final o0.AbstractC1412b F(int r62, P.C0371o r63, int r64) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r62
            r1 = r63
            P.T0 r2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f9341b
            java.lang.Object r2 = r1.k(r2)
            android.content.Context r2 = (android.content.Context) r2
            P.z r3 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f9340a
            r1.k(r3)
            android.content.res.Resources r3 = r2.getResources()
            P.T0 r4 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f9343d
            java.lang.Object r4 = r1.k(r4)
            G0.d r4 = (G0.d) r4
            monitor-enter(r4)
            r.v r5 = r4.f1976a     // Catch: java.lang.Throwable -> L42
            java.lang.Object r5 = r5.b(r0)     // Catch: java.lang.Throwable -> L42
            android.util.TypedValue r5 = (android.util.TypedValue) r5     // Catch: java.lang.Throwable -> L42
            r6 = 1
            if (r5 != 0) goto L45
            android.util.TypedValue r5 = new android.util.TypedValue     // Catch: java.lang.Throwable -> L42
            r5.<init>()     // Catch: java.lang.Throwable -> L42
            r3.getValue(r0, r5, r6)     // Catch: java.lang.Throwable -> L42
            r.v r7 = r4.f1976a     // Catch: java.lang.Throwable -> L42
            int r8 = r7.d(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.Object[] r9 = r7.f16218c     // Catch: java.lang.Throwable -> L42
            r10 = r9[r8]     // Catch: java.lang.Throwable -> L42
            int[] r7 = r7.f16217b     // Catch: java.lang.Throwable -> L42
            r7[r8] = r0     // Catch: java.lang.Throwable -> L42
            r9[r8] = r5     // Catch: java.lang.Throwable -> L42
            goto L45
        L42:
            r0 = move-exception
            goto L700
        L45:
            monitor-exit(r4)
            java.lang.CharSequence r4 = r5.string
            r8 = 6
            r10 = 0
            if (r4 == 0) goto L692
            java.lang.String r11 = ".xml"
            boolean r11 = J5.m.N0(r4, r11)
            if (r11 != r6) goto L692
            r4 = -803043333(0xffffffffd02287fb, float:-1.09072824E10)
            r1.S(r4)
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int r4 = r5.changingConfigurations
            P.T0 r5 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f9342c
            java.lang.Object r5 = r1.k(r5)
            G0.c r5 = (G0.c) r5
            G0.b r11 = new G0.b
            r11.<init>(r2, r0)
            java.util.HashMap r12 = r5.f1975a
            java.lang.Object r12 = r12.get(r11)
            java.lang.ref.WeakReference r12 = (java.lang.ref.WeakReference) r12
            if (r12 == 0) goto L7e
            java.lang.Object r12 = r12.get()
            G0.a r12 = (G0.a) r12
            goto L7f
        L7e:
            r12 = 0
        L7f:
            if (r12 != 0) goto L5c2
            android.content.res.XmlResourceParser r0 = r3.getXml(r0)
            int r12 = r0.next()
        L89:
            r13 = 2
            if (r12 == r13) goto L93
            if (r12 == r6) goto L93
            int r12 = r0.next()
            goto L89
        L93:
            if (r12 != r13) goto L5ba
            java.lang.String r12 = r0.getName()
            java.lang.String r14 = "vector"
            boolean r12 = kotlin.jvm.internal.m.a(r12, r14)
            if (r12 == 0) goto L5b2
            android.util.AttributeSet r12 = android.util.Xml.asAttributeSet(r0)
            q0.a r14 = new q0.a
            r14.<init>(r0)
            int[] r15 = q0.b.f15907a
            android.content.res.TypedArray r15 = m1.b.g(r3, r2, r12, r15)
            int r9 = r15.getChangingConfigurations()
            r14.b(r9)
            java.lang.String r9 = "autoMirrored"
            boolean r9 = m1.b.d(r0, r9)
            r7 = 5
            if (r9 != 0) goto Lc3
            r26 = r10
            goto Lc9
        Lc3:
            boolean r9 = r15.getBoolean(r7, r10)
            r26 = r9
        Lc9:
            int r9 = r15.getChangingConfigurations()
            r14.b(r9)
            java.lang.String r9 = "viewportWidth"
            r10 = 7
            r7 = 0
            float r20 = r14.a(r15, r9, r10, r7)
            java.lang.String r9 = "viewportHeight"
            r10 = 8
            float r21 = r14.a(r15, r9, r10, r7)
            int r9 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r9 <= 0) goto L597
            int r9 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1))
            if (r9 <= 0) goto L57c
            r9 = 3
            float r16 = r15.getDimension(r9, r7)
            int r10 = r15.getChangingConfigurations()
            r14.b(r10)
            float r10 = r15.getDimension(r13, r7)
            int r7 = r15.getChangingConfigurations()
            r14.b(r7)
            boolean r7 = r15.hasValue(r6)
            if (r7 == 0) goto L12f
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            r15.getValue(r6, r7)
            int r7 = r7.type
            if (r7 != r13) goto L116
            long r22 = j0.o.f13722g
        L113:
            r23 = r22
            goto L132
        L116:
            android.content.res.ColorStateList r7 = m1.b.b(r15, r0, r2)
            int r13 = r15.getChangingConfigurations()
            r14.b(r13)
            if (r7 == 0) goto L12c
            int r7 = r7.getDefaultColor()
            long r22 = j0.AbstractC1145B.b(r7)
            goto L113
        L12c:
            long r22 = j0.o.f13722g
            goto L113
        L12f:
            long r22 = j0.o.f13722g
            goto L113
        L132:
            r7 = -1
            int r13 = r15.getInt(r8, r7)
            int r8 = r15.getChangingConfigurations()
            r14.b(r8)
            r8 = 9
            if (r13 == r7) goto L14c
            if (r13 == r9) goto L159
            r7 = 5
            if (r13 == r7) goto L14c
            if (r13 == r8) goto L157
            switch(r13) {
                case 14: goto L154;
                case 15: goto L151;
                case 16: goto L14e;
                default: goto L14c;
            }
        L14c:
            r7 = 5
            goto L15a
        L14e:
            r7 = 12
            goto L15a
        L151:
            r7 = 14
            goto L15a
        L154:
            r7 = 13
            goto L15a
        L157:
            r7 = r8
            goto L15a
        L159:
            r7 = r9
        L15a:
            android.util.DisplayMetrics r13 = r3.getDisplayMetrics()
            float r13 = r13.density
            float r16 = r16 / r13
            android.util.DisplayMetrics r13 = r3.getDisplayMetrics()
            float r13 = r13.density
            float r10 = r10 / r13
            r15.recycle()
            r13 = 8
            java.lang.String r17 = ""
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            p0.d r29 = new p0.d
            r38 = 0
            r39 = 1023(0x3ff, float:1.434E-42)
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r13 = r29
            r15.add(r13)
            r29 = 0
        L195:
            int r8 = r0.getEventType()
            if (r8 == r6) goto L1a7
            int r8 = r0.getDepth()
            if (r8 >= r6) goto L1ad
            int r8 = r0.getEventType()
            if (r8 != r9) goto L1ad
        L1a7:
            r45 = r7
            r46 = r10
            goto L4de
        L1ad:
            java.lang.String r8 = "group"
            n5.s r41 = n5.s.f15299q
            java.lang.String r32 = ""
            r43 = r6
            org.xmlpull.v1.XmlPullParser r6 = r14.f15904a
            i3.a r9 = r14.f15906c
            r44 = r0
            int r0 = r6.getEventType()
            r45 = r7
            r7 = 2
            if (r0 == r7) goto L241
            r7 = 3
            if (r0 == r7) goto L1d0
            r46 = r10
            r18 = 0
            r19 = 2
            r10 = r7
            goto L4cf
        L1d0:
            java.lang.String r0 = r6.getName()
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L23d
            int r0 = r29 + 1
            r6 = 0
        L1dd:
            if (r6 >= r0) goto L232
            int r7 = r15.size()
            int r7 = r7 + (-1)
            java.lang.Object r7 = r15.remove(r7)
            p0.d r7 = (p0.C1436d) r7
            int r8 = r15.size()
            int r8 = r8 + (-1)
            java.lang.Object r8 = r15.get(r8)
            p0.d r8 = (p0.C1436d) r8
            java.util.ArrayList r8 = r8.j
            p0.E r32 = new p0.E
            java.lang.String r9 = r7.f15541a
            r29 = r0
            float r0 = r7.f15542b
            r34 = r0
            float r0 = r7.f15543c
            r35 = r0
            float r0 = r7.f15544d
            r36 = r0
            float r0 = r7.f15545e
            r37 = r0
            float r0 = r7.f
            r38 = r0
            float r0 = r7.f15546g
            r39 = r0
            float r0 = r7.f15547h
            r40 = r0
            java.util.List r0 = r7.i
            java.util.ArrayList r7 = r7.j
            r41 = r0
            r42 = r7
            r33 = r9
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r0 = r32
            r8.add(r0)
            int r6 = r6 + 1
            r0 = r29
            goto L1dd
        L232:
            r46 = r10
            r10 = 3
            r18 = 0
            r19 = 2
            r29 = 0
            goto L4cf
        L23d:
            r46 = r10
            goto L2d5
        L241:
            java.lang.String r0 = r6.getName()
            if (r0 == 0) goto L23d
            int r7 = r0.hashCode()
            r46 = r10
            r10 = -1649314686(0xffffffff9db17482, float:-4.6971976E-21)
            if (r7 == r10) goto L469
            r10 = 3433509(0x346425, float:4.811371E-39)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r7 == r10) goto L2dc
            r6 = 98629247(0x5e0f67f, float:2.1155407E-35)
            if (r7 == r6) goto L260
        L25e:
            goto L2d5
        L260:
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L267
            goto L25e
        L267:
            int[] r0 = q0.b.f15908b
            android.content.res.TypedArray r0 = m1.b.g(r3, r2, r12, r0)
            int r6 = r0.getChangingConfigurations()
            r14.b(r6)
            java.lang.String r6 = "rotation"
            r7 = 5
            r8 = 0
            float r34 = r14.a(r0, r6, r7, r8)
            r6 = r43
            float r35 = r0.getFloat(r6, r8)
            int r6 = r0.getChangingConfigurations()
            r14.b(r6)
            r7 = 2
            float r36 = r0.getFloat(r7, r8)
            int r6 = r0.getChangingConfigurations()
            r14.b(r6)
            java.lang.String r6 = "scaleX"
            r7 = 3
            float r37 = r14.a(r0, r6, r7, r1)
            java.lang.String r6 = "scaleY"
            r7 = 4
            float r38 = r14.a(r0, r6, r7, r1)
            java.lang.String r1 = "translateX"
            r6 = 6
            float r39 = r14.a(r0, r1, r6, r8)
            java.lang.String r1 = "translateY"
            r6 = 7
            float r40 = r14.a(r0, r1, r6, r8)
            r1 = 0
            java.lang.String r6 = r0.getString(r1)
            int r1 = r0.getChangingConfigurations()
            r14.b(r1)
            if (r6 != 0) goto L2c2
            r33 = r32
            goto L2c4
        L2c2:
            r33 = r6
        L2c4:
            r0.recycle()
            int r0 = p0.AbstractC1432F.f15497a
            p0.d r32 = new p0.d
            r42 = 512(0x200, float:7.175E-43)
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r0 = r32
            r15.add(r0)
        L2d5:
            r10 = 3
        L2d6:
            r18 = 0
            r19 = 2
            goto L4cf
        L2dc:
            java.lang.String r7 = "path"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L2e6
            goto L25e
        L2e6:
            int[] r0 = q0.b.f15909c
            android.content.res.TypedArray r0 = m1.b.g(r3, r2, r12, r0)
            int r7 = r0.getChangingConfigurations()
            r14.b(r7)
            java.lang.String r7 = "pathData"
            java.lang.String r8 = "http://schemas.android.com/apk/res/android"
            java.lang.String r6 = r6.getAttributeValue(r8, r7)
            if (r6 == 0) goto L461
            r6 = 0
            java.lang.String r7 = r0.getString(r6)
            int r6 = r0.getChangingConfigurations()
            r14.b(r6)
            if (r7 != 0) goto L30f
            r48 = r32
        L30d:
            r7 = 2
            goto L312
        L30f:
            r48 = r7
            goto L30d
        L312:
            java.lang.String r6 = r0.getString(r7)
            int r7 = r0.getChangingConfigurations()
            r14.b(r7)
            if (r6 != 0) goto L324
            int r6 = p0.AbstractC1432F.f15497a
        L321:
            r49 = r41
            goto L329
        L324:
            java.util.ArrayList r41 = i3.C1136a.r(r9, r6)
            goto L321
        L329:
            java.lang.String r6 = "fillColor"
            org.xmlpull.v1.XmlPullParser r7 = r14.f15904a
            r8 = 1
            E.Y r6 = m1.b.c(r0, r7, r2, r6, r8)
            int r7 = r0.getChangingConfigurations()
            r14.b(r7)
            java.lang.String r7 = "fillAlpha"
            r8 = 12
            float r52 = r14.a(r0, r7, r8, r1)
            java.lang.String r7 = "strokeLineCap"
            org.xmlpull.v1.XmlPullParser r9 = r14.f15904a
            boolean r7 = m1.b.d(r9, r7)
            if (r7 != 0) goto L34f
            r7 = -1
            r10 = 8
            goto L357
        L34f:
            r7 = -1
            r10 = 8
            int r9 = r0.getInt(r10, r7)
            r7 = r9
        L357:
            int r9 = r0.getChangingConfigurations()
            r14.b(r9)
            if (r7 == 0) goto L370
            r9 = 1
            if (r7 == r9) goto L36c
            r9 = 2
            if (r7 == r9) goto L369
        L366:
            r56 = 0
            goto L372
        L369:
            r56 = r9
            goto L372
        L36c:
            r9 = 2
            r56 = 1
            goto L372
        L370:
            r9 = 2
            goto L366
        L372:
            java.lang.String r7 = "strokeLineJoin"
            org.xmlpull.v1.XmlPullParser r8 = r14.f15904a
            boolean r7 = m1.b.d(r8, r7)
            if (r7 != 0) goto L37e
            r7 = -1
            goto L387
        L37e:
            r7 = 9
            r8 = -1
            int r19 = r0.getInt(r7, r8)
            r7 = r19
        L387:
            int r8 = r0.getChangingConfigurations()
            r14.b(r8)
            if (r7 == 0) goto L399
            r8 = 1
            if (r7 == r8) goto L396
            r57 = r9
            goto L39b
        L396:
            r57 = 1
            goto L39b
        L399:
            r57 = 0
        L39b:
            java.lang.String r7 = "strokeMiterLimit"
            r8 = 10
            float r58 = r14.a(r0, r7, r8, r1)
            java.lang.String r7 = "strokeColor"
            org.xmlpull.v1.XmlPullParser r8 = r14.f15904a
            r10 = 3
            E.Y r7 = m1.b.c(r0, r8, r2, r7, r10)
            int r8 = r0.getChangingConfigurations()
            r14.b(r8)
            java.lang.String r8 = "strokeAlpha"
            r9 = 11
            float r54 = r14.a(r0, r8, r9, r1)
            java.lang.String r8 = "strokeWidth"
            r9 = 4
            float r55 = r14.a(r0, r8, r9, r1)
            java.lang.String r8 = "trimPathEnd"
            r9 = 6
            float r60 = r14.a(r0, r8, r9, r1)
            java.lang.String r1 = "trimPathOffset"
            r8 = 7
            r9 = 0
            float r61 = r14.a(r0, r1, r8, r9)
            java.lang.String r1 = "trimPathStart"
            r8 = 5
            float r59 = r14.a(r0, r1, r8, r9)
            java.lang.String r1 = "fillType"
            org.xmlpull.v1.XmlPullParser r8 = r14.f15904a
            boolean r1 = m1.b.d(r8, r1)
            if (r1 != 0) goto L3e7
            r8 = 13
            r18 = 0
            goto L3ee
        L3e7:
            r1 = 0
            r8 = 13
            int r18 = r0.getInt(r8, r1)
        L3ee:
            int r1 = r0.getChangingConfigurations()
            r14.b(r1)
            r0.recycle()
            java.lang.Object r0 = r6.f1520c
            android.graphics.Shader r0 = (android.graphics.Shader) r0
            if (r0 == 0) goto L3ff
            goto L403
        L3ff:
            int r1 = r6.f1519b
            if (r1 == 0) goto L419
        L403:
            if (r0 == 0) goto L40d
            j0.l r1 = new j0.l
            r1.<init>(r0)
        L40a:
            r51 = r1
            goto L41b
        L40d:
            j0.G r1 = new j0.G
            int r0 = r6.f1519b
            long r8 = j0.AbstractC1145B.b(r0)
            r1.<init>(r8)
            goto L40a
        L419:
            r51 = 0
        L41b:
            java.lang.Object r0 = r7.f1520c
            android.graphics.Shader r0 = (android.graphics.Shader) r0
            if (r0 == 0) goto L422
            goto L426
        L422:
            int r1 = r7.f1519b
            if (r1 == 0) goto L43c
        L426:
            if (r0 == 0) goto L430
            j0.l r1 = new j0.l
            r1.<init>(r0)
        L42d:
            r53 = r1
            goto L43e
        L430:
            j0.G r1 = new j0.G
            int r0 = r7.f1519b
            long r7 = j0.AbstractC1145B.b(r0)
            r1.<init>(r7)
            goto L42d
        L43c:
            r53 = 0
        L43e:
            if (r18 != 0) goto L443
            r50 = 0
            goto L445
        L443:
            r50 = 1
        L445:
            int r0 = r15.size()
            r43 = 1
            int r0 = r0 + (-1)
            java.lang.Object r0 = r15.get(r0)
            p0.d r0 = (p0.C1436d) r0
            java.util.ArrayList r0 = r0.j
            p0.I r47 = new p0.I
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            r1 = r47
            r0.add(r1)
            goto L2d6
        L461:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No path data available"
            r0.<init>(r1)
            throw r0
        L469:
            r10 = 3
            r18 = 0
            r19 = 2
            java.lang.String r1 = "clip-path"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L477
            goto L4cf
        L477:
            int[] r0 = q0.b.f15910d
            android.content.res.TypedArray r0 = m1.b.g(r3, r2, r12, r0)
            int r1 = r0.getChangingConfigurations()
            r14.b(r1)
            r1 = 0
            java.lang.String r6 = r0.getString(r1)
            int r1 = r0.getChangingConfigurations()
            r14.b(r1)
            if (r6 != 0) goto L496
            r48 = r32
        L494:
            r8 = 1
            goto L499
        L496:
            r48 = r6
            goto L494
        L499:
            java.lang.String r1 = r0.getString(r8)
            int r6 = r0.getChangingConfigurations()
            r14.b(r6)
            if (r1 != 0) goto L4ab
            int r1 = p0.AbstractC1432F.f15497a
        L4a8:
            r56 = r41
            goto L4b0
        L4ab:
            java.util.ArrayList r41 = i3.C1136a.r(r9, r1)
            goto L4a8
        L4b0:
            r0.recycle()
            p0.d r47 = new p0.d
            r57 = 512(0x200, float:7.175E-43)
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 1065353216(0x3f800000, float:1.0)
            r53 = 1065353216(0x3f800000, float:1.0)
            r54 = 0
            r55 = 0
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            r0 = r47
            r15.add(r0)
            int r29 = r29 + 1
        L4cf:
            r44.next()
            r1 = r63
            r9 = r10
            r0 = r44
            r7 = r45
            r10 = r46
            r6 = 1
            goto L195
        L4de:
            G0.a r12 = new G0.a
        L4e0:
            int r0 = r15.size()
            r8 = 1
            if (r0 <= r8) goto L532
            int r0 = r15.size()
            int r0 = r0 - r8
            java.lang.Object r0 = r15.remove(r0)
            p0.d r0 = (p0.C1436d) r0
            int r1 = r15.size()
            int r1 = r1 - r8
            java.lang.Object r1 = r15.get(r1)
            p0.d r1 = (p0.C1436d) r1
            java.util.ArrayList r1 = r1.j
            p0.E r27 = new p0.E
            java.lang.String r2 = r0.f15541a
            float r3 = r0.f15542b
            float r6 = r0.f15543c
            float r7 = r0.f15544d
            float r9 = r0.f15545e
            float r10 = r0.f
            float r14 = r0.f15546g
            float r8 = r0.f15547h
            r28 = r2
            java.util.List r2 = r0.i
            java.util.ArrayList r0 = r0.j
            r37 = r0
            r36 = r2
            r29 = r3
            r30 = r6
            r31 = r7
            r35 = r8
            r32 = r9
            r33 = r10
            r34 = r14
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r0 = r27
            r1.add(r0)
            goto L4e0
        L532:
            p0.e r0 = new p0.e
            p0.E r27 = new p0.E
            java.lang.String r1 = r13.f15541a
            float r2 = r13.f15542b
            float r3 = r13.f15543c
            float r6 = r13.f15544d
            float r7 = r13.f15545e
            float r8 = r13.f
            float r9 = r13.f15546g
            float r10 = r13.f15547h
            java.util.List r14 = r13.i
            java.util.ArrayList r13 = r13.j
            r28 = r1
            r29 = r2
            r30 = r3
            r31 = r6
            r32 = r7
            r33 = r8
            r34 = r9
            r35 = r10
            r37 = r13
            r36 = r14
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r18 = r16
            r22 = r27
            r25 = r45
            r19 = r46
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25, r26)
            r12.<init>(r0, r4)
            java.util.HashMap r0 = r5.f1975a
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r12)
            r0.put(r11, r1)
            goto L5c2
        L57c:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r15.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = "<VectorGraphic> tag requires viewportHeight > 0"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L597:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r15.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = "<VectorGraphic> tag requires viewportWidth > 0"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5b2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP"
            r0.<init>(r1)
            throw r0
        L5ba:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        L5c2:
            p0.e r0 = r12.f1971a
            P.T0 r1 = C0.AbstractC0103t0.f1116h
            r5 = r63
            java.lang.Object r1 = r5.k(r1)
            W0.c r1 = (W0.c) r1
            int r2 = r0.j
            float r2 = (float) r2
            float r3 = r1.b()
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r6 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r3)
            long r2 = (long) r2
            r4 = 32
            long r6 = r6 << r4
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r8
            long r2 = r2 | r6
            boolean r2 = r5.f(r2)
            java.lang.Object r3 = r5.H()
            if (r2 != 0) goto L5f7
            P.S r2 = P.C0363k.f5418a
            if (r3 != r2) goto L68b
        L5f7:
            p0.c r2 = new p0.c
            r2.<init>()
            p0.E r3 = r0.f
            p0.AbstractC1434b.a(r2, r3)
            float r3 = r0.f15551b
            float r6 = r0.f15552c
            float r3 = r1.u(r3)
            float r1 = r1.u(r6)
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r3
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r10 = (long) r1
            long r6 = r6 << r4
            long r10 = r10 & r8
            long r6 = r6 | r10
            float r1 = r0.f15553d
            float r3 = r0.f15554e
            boolean r10 = java.lang.Float.isNaN(r1)
            if (r10 == 0) goto L62b
            long r10 = r6 >> r4
            int r1 = (int) r10
            float r1 = java.lang.Float.intBitsToFloat(r1)
        L62b:
            boolean r10 = java.lang.Float.isNaN(r3)
            if (r10 == 0) goto L638
            long r10 = r6 & r8
            int r3 = (int) r10
            float r3 = java.lang.Float.intBitsToFloat(r3)
        L638:
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r10 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r3)
            long r12 = (long) r1
            long r3 = r10 << r4
            long r8 = r8 & r12
            long r3 = r3 | r8
            p0.H r1 = new p0.H
            r1.<init>(r2)
            java.lang.String r2 = r0.f15550a
            long r8 = r0.f15555g
            int r10 = r0.f15556h
            r11 = 16
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 == 0) goto L65e
            j0.j r11 = new j0.j
            r11.<init>(r8, r10)
            r9 = r11
            goto L65f
        L65e:
            r9 = 0
        L65f:
            boolean r0 = r0.i
            P.f0 r8 = r1.f15500v
            i0.e r10 = new i0.e
            r10.<init>(r6)
            r8.setValue(r10)
            P.f0 r6 = r1.f15501w
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.setValue(r0)
            p0.D r0 = r1.f15502x
            P.f0 r6 = r0.f15482g
            r6.setValue(r9)
            P.f0 r6 = r0.i
            i0.e r7 = new i0.e
            r7.<init>(r3)
            r6.setValue(r7)
            r0.f15479c = r2
            r5.d0(r1)
            r3 = r1
        L68b:
            p0.H r3 = (p0.H) r3
            r1 = 0
            r5.p(r1)
            return r3
        L692:
            r5 = r1
            r1 = -802887899(0xffffffffd024e725, float:-1.10664468E10)
            r5.S(r1)
            android.content.res.Resources$Theme r1 = r2.getTheme()
            boolean r2 = r5.g(r4)
            r6 = r64 & 14
            r22 = 6
            r6 = r6 ^ 6
            r7 = 4
            if (r6 <= r7) goto L6b0
            boolean r6 = r5.e(r0)
            if (r6 != 0) goto L6b4
        L6b0:
            r6 = r64 & 6
            if (r6 != r7) goto L6b6
        L6b4:
            r6 = 1
            goto L6b7
        L6b6:
            r6 = 0
        L6b7:
            r2 = r2 | r6
            boolean r1 = r5.g(r1)
            r1 = r1 | r2
            java.lang.Object r2 = r5.H()
            if (r1 != 0) goto L6c7
            P.S r1 = P.C0363k.f5418a
            if (r2 != r1) goto L6df
        L6c7:
            r1 = 0
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0, r1)     // Catch: java.lang.Exception -> L6eb
            java.lang.String r1 = "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable"
            kotlin.jvm.internal.m.c(r0, r1)     // Catch: java.lang.Exception -> L6eb
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0     // Catch: java.lang.Exception -> L6eb
            android.graphics.Bitmap r0 = r0.getBitmap()     // Catch: java.lang.Exception -> L6eb
            j0.e r2 = new j0.e     // Catch: java.lang.Exception -> L6eb
            r2.<init>(r0)     // Catch: java.lang.Exception -> L6eb
            r5.d0(r2)
        L6df:
            j0.e r2 = (j0.C1150e) r2
            o0.a r0 = new o0.a
            r0.<init>(r2)
            r1 = 0
            r5.p(r1)
            return r0
        L6eb:
            r0 = move-exception
            C2.e r1 = new C2.e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error attempting to load resource: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L700:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0836n2.F(int, P.o, int):o0.b");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1122a G(C1361b c1361b, C0632k c0632k) {
        return new C1122a(0, l3.p.a(c1361b, c0632k, 1.0f, l3.f.f14454r, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1123b H(AbstractC1360a abstractC1360a, C0632k c0632k, boolean z5) {
        return new C1123b(l3.p.a(abstractC1360a, c0632k, z5 ? n3.i.c() : 1.0f, l3.f.f14455s, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1122a I(C1361b c1361b, C0632k c0632k, int i) {
        E3.k kVar = new E3.k();
        kVar.f1724q = i;
        ArrayList arrayListA = l3.p.a(c1361b, c0632k, 1.0f, kVar, false);
        for (int i7 = 0; i7 < arrayListA.size(); i7++) {
            C1415a c1415a = (C1415a) arrayListA.get(i7);
            C1139d c1139d = (C1139d) c1415a.f15413b;
            C1139d c1139d2 = (C1139d) c1415a.f15414c;
            if (c1139d != null && c1139d2 != null) {
                float[] fArr = c1139d.f13568a;
                int length = fArr.length;
                float[] fArr2 = c1139d2.f13568a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i8 = 0;
                    for (int i9 = 0; i9 < length2; i9++) {
                        float f7 = fArr3[i9];
                        if (f7 != f) {
                            fArr3[i8] = f7;
                            i8++;
                            f = fArr3[i9];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i8);
                    c1415a = new C1415a(c1139d.b(fArrCopyOfRange), c1139d2.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i7, c1415a);
        }
        return new C1122a(1, arrayListA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1122a J(AbstractC1360a abstractC1360a, C0632k c0632k) {
        return new C1122a(2, l3.p.a(abstractC1360a, c0632k, 1.0f, l3.f.f14456t, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1122a K(C1361b c1361b, C0632k c0632k) {
        return new C1122a(3, l3.p.a(c1361b, c0632k, n3.i.c(), l3.f.f14458v, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Z.f L(C0371o c0371o) {
        c0371o.S(-796079677);
        Z.f fVar = (Z.f) P1.P(new Object[0], Z.f.f8299e, Z.g.f8304r, c0371o, 3072, 4);
        fVar.f8302c = (Z.i) c0371o.k(Z.k.f8310a);
        c0371o.p(false);
        return fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void M(View view, g2.e eVar) {
        kotlin.jvm.internal.m.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void N() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1379r O(String str) {
        int i;
        I1.M(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.m.f(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i8 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i9 = i7 ^ Integer.MIN_VALUE;
            if (Integer.compare(i9, i8 ^ Integer.MIN_VALUE) > 0) {
                if (i8 != 119304647) {
                    return null;
                }
                i8 = (int) ((((long) (-1)) & 4294967295L) / (4294967295L & ((long) 10)));
                if (Integer.compare(i9, i8 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i10 = i7 * 10;
            int i11 = iDigit + i10;
            if (Integer.compare(i11 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i7 = i11;
        }
        return new C1379r(i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void P(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iY = Y(parcel, i);
        parcel.writeBundle(bundle);
        a0(parcel, iY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void Q(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iY = Y(parcel, i);
        parcel.writeByteArray(bArr);
        a0(parcel, iY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void R(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iY = Y(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        a0(parcel, iY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void S(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iY = Y(parcel, i);
        parcel.writeStrongBinder(iBinder);
        a0(parcel, iY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void T(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iY = Y(parcel, i);
        parcel.writeIntArray(iArr);
        a0(parcel, iY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void U(Parcel parcel, int i, Parcelable parcelable, int i7) {
        if (parcelable == null) {
            return;
        }
        int iY = Y(parcel, i);
        parcelable.writeToParcel(parcel, i7);
        a0(parcel, iY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void V(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iY = Y(parcel, i);
        parcel.writeString(str);
        a0(parcel, iY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void W(Parcel parcel, int i, Parcelable[] parcelableArr, int i7) {
        if (parcelableArr == null) {
            return;
        }
        int iY = Y(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i7);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        a0(parcel, iY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void X(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iY = Y(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i7 = 0; i7 < size; i7++) {
            Parcelable parcelable = (Parcelable) list.get(i7);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        a0(parcel, iY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int Y(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0811i2 Z() {
        String str;
        ClassLoader classLoader = AbstractC0836n2.class.getClassLoader();
        if (C0811i2.class.equals(C0811i2.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!C0811i2.class.getPackage().equals(AbstractC0836n2.class.getPackage())) {
                throw new IllegalArgumentException(C0811i2.class.getName());
            }
            str = C0811i2.class.getPackage().getName() + ".BlazeGenerated" + C0811i2.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    C0.S.t(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(e8);
                }
            } catch (InstantiationException e9) {
                throw new IllegalStateException(e9);
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new AbstractC0836n2[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e11) {
                        Logger.getLogger(C0801g2.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(C0811i2.class.getSimpleName()), (Throwable) e11);
                    }
                }
                if (arrayList.size() == 1) {
                    return (C0811i2) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (C0811i2) C0811i2.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e12) {
                    throw new IllegalStateException(e12);
                } catch (NoSuchMethodException e13) {
                    throw new IllegalStateException(e13);
                } catch (InvocationTargetException e14) {
                    throw new IllegalStateException(e14);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.compose.foundation.a.c(c0.m, y.i, v.P, boolean, I0.f, B5.a, int):c0.m */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(R4.C0468k1 r27, P.C0371o r28, int r29) throws java.io.IOException {
        /*
            r0 = r27
            r8 = r28
            r11 = r29
            java.lang.String r1 = "dataObject"
            kotlin.jvm.internal.m.e(r0, r1)
            r1 = 841585321(0x322992a9, float:9.870441E-9)
            r8.U(r1)
            boolean r1 = r8.i(r0)
            r2 = 2
            if (r1 == 0) goto L1a
            r1 = 4
            goto L1b
        L1a:
            r1 = r2
        L1b:
            r1 = r1 | r11
            r3 = r1 & 3
            r12 = 1
            r13 = 0
            if (r3 == r2) goto L24
            r2 = r12
            goto L25
        L24:
            r2 = r13
        L25:
            r1 = r1 & r12
            boolean r1 = r8.K(r1, r2)
            if (r1 == 0) goto L255
            java.lang.Object r1 = r8.H()
            r2 = -1
            P.S r3 = P.C0363k.f5418a
            if (r1 != r3) goto L3d
            P.c0 r1 = new P.c0
            r1.<init>(r2)
            r8.d0(r1)
        L3d:
            P.c0 r1 = (P.C0348c0) r1
            j5.d r4 = r0.f7098t
            P5.S r4 = r4.i
            P.W r4 = P.C0345b.j(r4, r8)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r6 = r8.i(r0)
            java.lang.Object r7 = r8.H()
            r9 = 0
            if (r6 != 0) goto L56
            if (r7 != r3) goto L5e
        L56:
            R4.I0 r7 = new R4.I0
            r7.<init>(r0, r1, r9)
            r8.d0(r7)
        L5e:
            B5.e r7 = (B5.e) r7
            P.C0345b.e(r7, r8, r5)
            int r5 = r1.e()
            if (r5 == r2) goto L24d
            java.lang.Object r2 = r4.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L24d
            r2 = 1309663537(0x4e0fe131, float:6.0347501E8)
            r8.S(r2)
            R4.i r2 = r0.f7073d
            if (r2 == 0) goto L8e
            java.util.List r2 = r2.i
            if (r2 == 0) goto L8e
            int r1 = r1.e()
            java.lang.Object r1 = r2.get(r1)
            R4.A r1 = (R4.A) r1
            goto L8f
        L8e:
            r1 = r9
        L8f:
            if (r1 != 0) goto L9d
            r1 = 1944954132(0x73eda514, float:3.7656327E31)
            r8.S(r1)
            r8.p(r13)
            r5 = r13
            goto L249
        L9d:
            java.lang.String r2 = r1.f6718b
            r4 = 1944954133(0x73eda515, float:3.765633E31)
            r8.S(r4)
            boolean r4 = r8.g(r2)
            java.lang.Object r5 = r8.H()
            if (r4 != 0) goto Lb1
            if (r5 != r3) goto Ldc
        Lb1:
            if (r2 == 0) goto Ld8
            com.web2native.MainActivity r4 = r0.f7071c     // Catch: java.io.FileNotFoundException -> Lc7
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.io.FileNotFoundException -> Lc7
            java.io.InputStream r2 = r4.open(r2)     // Catch: java.io.FileNotFoundException -> Lc7
            java.lang.String r4 = "open(...)"
            kotlin.jvm.internal.m.d(r2, r4)     // Catch: java.io.FileNotFoundException -> Lc7
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r2, r9)     // Catch: java.io.FileNotFoundException -> Lc7
            goto Lc8
        Lc7:
            r2 = r9
        Lc8:
            if (r2 == 0) goto Ld8
            o0.a r9 = new o0.a
            android.graphics.Bitmap r2 = C3.a.U(r2)
            j0.e r4 = new j0.e
            r4.<init>(r2)
            r9.<init>(r4)
        Ld8:
            r8.d0(r9)
            r5 = r9
        Ldc:
            o0.a r5 = (o0.C1411a) r5
            if (r5 != 0) goto Lec
            r1 = 1308564186(0x4dff1ada, float:5.34993728E8)
            r8.S(r1)
            r8.p(r13)
            r5 = r13
            goto L246
        Lec:
            r2 = 1308564187(0x4dff1adb, float:5.3499376E8)
            r8.S(r2)
            java.lang.String r2 = r1.f6720d
            java.lang.String r4 = "LEFT"
            boolean r4 = kotlin.jvm.internal.m.a(r2, r4)
            if (r4 == 0) goto Lff
            c0.e r2 = c0.C0714b.f10082w
            goto L10c
        Lff:
            java.lang.String r4 = "CENTER"
            boolean r2 = kotlin.jvm.internal.m.a(r2, r4)
            if (r2 == 0) goto L10a
            c0.e r2 = c0.C0714b.f10083x
            goto L10c
        L10a:
            c0.e r2 = c0.C0714b.f10084y
        L10c:
            java.lang.String r4 = r1.f6717a
            if (r4 == 0) goto L119
            int r4 = android.graphics.Color.parseColor(r4)
            long r6 = j0.AbstractC1145B.b(r4)
            goto L11b
        L119:
            long r6 = j0.o.f
        L11b:
            java.lang.String r4 = r1.f6719c
            java.lang.String r9 = "SQUARE"
            boolean r4 = kotlin.jvm.internal.m.a(r4, r9)
            if (r4 == 0) goto L128
            r4 = 5
        L126:
            float r4 = (float) r4
            goto L12b
        L128:
            r4 = 100
            goto L126
        L12b:
            androidx.compose.foundation.layout.FillElement r14 = androidx.compose.foundation.layout.c.f9279c
            r9 = 7
            float r15 = (float) r9
            r9 = 10
            float r9 = (float) r9
            r19 = 2
            r16 = 0
            r17 = r15
            r18 = r9
            c0.m r9 = androidx.compose.foundation.layout.b.d(r14, r15, r16, r17, r18, r19)
            z0.C r2 = A.AbstractC0017n.d(r2, r13)
            int r10 = r8.f5454P
            P.i0 r15 = r8.m()
            c0.m r9 = c0.AbstractC0727o.c(r8, r9)
            B0.j r16 = B0.InterfaceC0046k.f452a
            r16.getClass()
            B0.D r12 = B0.C0045j.f445b
            r8.W()
            boolean r13 = r8.f5453O
            if (r13 == 0) goto L15e
            r8.l(r12)
            goto L161
        L15e:
            r8.g0()
        L161:
            B0.i r13 = B0.C0045j.f448e
            P.C0345b.u(r13, r8, r2)
            B0.i r2 = B0.C0045j.f447d
            P.C0345b.u(r2, r8, r15)
            B0.i r15 = B0.C0045j.f
            r18 = r4
            boolean r4 = r8.f5453O
            if (r4 != 0) goto L184
            java.lang.Object r4 = r8.H()
            r19 = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            boolean r4 = kotlin.jvm.internal.m.a(r4, r5)
            if (r4 != 0) goto L189
            goto L186
        L184:
            r19 = r5
        L186:
            k1.i.o(r10, r8, r10, r15)
        L189:
            B0.i r4 = B0.C0045j.f446c
            P.C0345b.u(r4, r8, r9)
            c0.m r5 = androidx.compose.ui.layout.a.b()
            r9 = 56
            float r9 = (float) r9
            c0.m r5 = androidx.compose.foundation.layout.c.c(r5, r9)
            H.d r9 = H.e.b(r18)
            c0.m r5 = a.AbstractC0597a.n(r5, r9)
            O3.D r9 = j0.AbstractC1145B.f13658a
            c0.m r20 = androidx.compose.foundation.a.a(r5, r6, r9)
            java.lang.Object r5 = r8.H()
            if (r5 != r3) goto L1b5
            y.i r5 = new y.i
            r5.<init>()
            r8.d0(r5)
        L1b5:
            r21 = r5
            y.i r21 = (y.i) r21
            boolean r5 = r8.g(r1)
            boolean r10 = r8.i(r0)
            r5 = r5 | r10
            java.lang.Object r10 = r8.H()
            if (r5 != 0) goto L1ca
            if (r10 != r3) goto L1d3
        L1ca:
            I2.e r10 = new I2.e
            r3 = 1
            r10.<init>(r3, r1, r0)
            r8.d0(r10)
        L1d3:
            r25 = r10
            B5.a r25 = (B5.a) r25
            r26 = 28
            r22 = 0
            r23 = 0
            r24 = 0
            c0.m r1 = androidx.compose.foundation.a.c(r20, r21, r22, r23, r24, r25, r26)
            c0.e r3 = c0.C0714b.f10076q
            r5 = 0
            z0.C r3 = A.AbstractC0017n.d(r3, r5)
            int r5 = r8.f5454P
            P.i0 r10 = r8.m()
            c0.m r1 = c0.AbstractC0727o.c(r8, r1)
            r8.W()
            boolean r0 = r8.f5453O
            if (r0 == 0) goto L1ff
            r8.l(r12)
            goto L202
        L1ff:
            r8.g0()
        L202:
            P.C0345b.u(r13, r8, r3)
            P.C0345b.u(r2, r8, r10)
            boolean r0 = r8.f5453O
            if (r0 != 0) goto L21a
            java.lang.Object r0 = r8.H()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            boolean r0 = kotlin.jvm.internal.m.a(r0, r2)
            if (r0 != 0) goto L21d
        L21a:
            k1.i.o(r5, r8, r5, r15)
        L21d:
            P.C0345b.u(r4, r8, r1)
            c0.m r0 = androidx.compose.foundation.a.a(r14, r6, r9)
            H.d r1 = H.e.b(r18)
            c0.m r3 = a.AbstractC0597a.n(r0, r1)
            r9 = 24624(0x6030, float:3.4506E-41)
            r10 = 104(0x68, float:1.46E-43)
            r2 = 0
            r4 = 0
            z0.F r5 = z0.C1949i.f18697d
            r6 = 0
            r7 = 0
            r1 = r19
            D5.a.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r8.p(r0)
            r8.p(r0)
            r5 = 0
            r8.p(r5)
        L246:
            r8.p(r5)
        L249:
            r8.p(r5)
            goto L258
        L24d:
            r5 = r13
            r0 = 1942729945(0x73cbb4d9, float:3.2278573E31)
            r8.S(r0)
            goto L249
        L255:
            r8.N()
        L258:
            P.o0 r0 = r8.r()
            if (r0 == 0) goto L268
            R4.H0 r1 = new R4.H0
            r2 = 0
            r3 = r27
            r1.<init>(r11, r2, r3)
            r0.f5482d = r1
        L268:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0836n2.a(R4.k1, P.o, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a0(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(R4.C0468k1 r19, P.C0371o r20, int r21) {
        /*
            r1 = r19
            r6 = r20
            r7 = r21
            java.lang.String r0 = "dataObject"
            kotlin.jvm.internal.m.e(r1, r0)
            com.web2native.MainActivity r8 = r1.f7067a
            r0 = 366071017(0x15d1cce9, float:8.473772E-26)
            r6.U(r0)
            boolean r0 = r6.i(r1)
            r2 = 2
            if (r0 == 0) goto L1c
            r0 = 4
            goto L1d
        L1c:
            r0 = r2
        L1d:
            r0 = r0 | r7
            r3 = r0 & 3
            r9 = 1
            r10 = 0
            if (r3 == r2) goto L26
            r2 = r9
            goto L27
        L26:
            r2 = r10
        L27:
            r0 = r0 & r9
            boolean r0 = r6.K(r0, r2)
            if (r0 == 0) goto L253
            java.lang.Object r0 = r6.H()
            r2 = 0
            P.S r11 = P.C0363k.f5418a
            if (r0 != r11) goto L3e
            P.f0 r0 = P.C0345b.q(r2)
            r6.d0(r0)
        L3e:
            r3 = r0
            P.W r3 = (P.W) r3
            P.T0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f9341b
            java.lang.Object r0 = r6.k(r0)
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r4 = r6.H()
            if (r4 != r11) goto L61
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r4 = 2131492910(0x7f0c002e, float:1.8609285E38)
            android.view.View r0 = r0.inflate(r4, r2)
            P.f0 r4 = P.C0345b.q(r0)
            r6.d0(r4)
        L61:
            P.W r4 = (P.W) r4
            java.lang.Object r0 = r6.H()
            if (r0 != r11) goto L72
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            P.f0 r0 = P.C0345b.q(r0)
            r6.d0(r0)
        L72:
            P.W r0 = (P.W) r0
            java.lang.Object r5 = r6.H()
            if (r5 != r11) goto L8e
            int r5 = android.os.Build.VERSION.SDK_INT
            r12 = 35
            if (r5 < r12) goto L82
            r5 = r9
            goto L83
        L82:
            r5 = r10
        L83:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            P.f0 r5 = P.C0345b.q(r5)
            r6.d0(r5)
        L8e:
            r12 = r5
            P.W r12 = (P.W) r12
            P.T0 r5 = C0.AbstractC0103t0.f1116h
            java.lang.Object r5 = r6.k(r5)
            W0.c r5 = (W0.c) r5
            r5 = 700347734(0x29be7556, float:8.4580495E-14)
            r6.S(r5)
            r6.p(r10)
            P.T0 r5 = C0.AbstractC0103t0.f1120n
            java.lang.Object r5 = r6.k(r5)
            W0.l r5 = (W0.l) r5
            r5 = 700544150(0x29c17496, float:8.591146E-14)
            r6.S(r5)
            r6.p(r10)
            r5 = 700686006(0x29c39eb6, float:8.6872716E-14)
            r6.S(r5)
            r6.p(r10)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r13 = r6.i(r1)
            java.lang.Object r14 = r6.H()
            if (r13 != 0) goto Lca
            if (r14 != r11) goto Ld2
        Lca:
            b5.b r14 = new b5.b
            r14.<init>(r1, r2)
            r6.d0(r14)
        Ld2:
            B5.e r14 = (B5.e) r14
            P.C0345b.e(r14, r6, r5)
            boolean r2 = r6.i(r1)
            java.lang.Object r5 = r6.H()
            if (r2 != 0) goto Le3
            if (r5 != r11) goto Le6
        Le3:
            r2 = r4
            r4 = r0
            goto Leb
        Le6:
            r13 = r1
            r14 = r3
            r2 = r4
            r4 = r0
            goto Lf7
        Leb:
            b5.c r0 = new b5.c
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r13 = r1
            r14 = r3
            r6.d0(r0)
            r5 = r0
        Lf7:
            B5.e r5 = (B5.e) r5
            m5.y r0 = m5.C1386y.f15098a
            P.C0345b.e(r5, r6, r0)
            java.lang.Object r0 = r4.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24a
            r0 = 702708975(0x29e27cef, float:1.0058089E-13)
            r6.S(r0)
            androidx.compose.foundation.layout.FillElement r1 = androidx.compose.foundation.layout.c.f9279c
            c0.e r0 = c0.C0714b.f10076q
            z0.C r0 = A.AbstractC0017n.d(r0, r10)
            int r3 = r6.f5454P
            P.i0 r4 = r6.m()
            c0.m r5 = c0.AbstractC0727o.c(r6, r1)
            B0.j r15 = B0.InterfaceC0046k.f452a
            r15.getClass()
            B0.D r15 = B0.C0045j.f445b
            r6.W()
            boolean r10 = r6.f5453O
            if (r10 == 0) goto L134
            r6.l(r15)
            goto L137
        L134:
            r6.g0()
        L137:
            B0.i r10 = B0.C0045j.f448e
            P.C0345b.u(r10, r6, r0)
            B0.i r0 = B0.C0045j.f447d
            P.C0345b.u(r0, r6, r4)
            B0.i r4 = B0.C0045j.f
            boolean r9 = r6.f5453O
            if (r9 != 0) goto L158
            java.lang.Object r9 = r6.H()
            r16 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r1 = kotlin.jvm.internal.m.a(r9, r1)
            if (r1 != 0) goto L15d
            goto L15a
        L158:
            r16 = r1
        L15a:
            k1.i.o(r3, r6, r3, r4)
        L15d:
            B0.i r1 = B0.C0045j.f446c
            P.C0345b.u(r1, r6, r5)
            c0.j r3 = c0.C0722j.f10095q
            r5 = 1
            c0.m r3 = U4.AbstractC0534a.A(r3, r5)
            A.b r5 = A.AbstractC0012i.f108c
            c0.c r9 = c0.C0714b.f10073B
            r17 = r8
            r8 = 0
            A.t r5 = A.r.a(r5, r9, r6, r8)
            int r8 = r6.f5454P
            P.i0 r9 = r6.m()
            c0.m r3 = c0.AbstractC0727o.c(r6, r3)
            r6.W()
            r18 = r12
            boolean r12 = r6.f5453O
            if (r12 == 0) goto L18b
            r6.l(r15)
            goto L18e
        L18b:
            r6.g0()
        L18e:
            P.C0345b.u(r10, r6, r5)
            P.C0345b.u(r0, r6, r9)
            boolean r0 = r6.f5453O
            if (r0 != 0) goto L1a6
            java.lang.Object r0 = r6.H()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            boolean r0 = kotlin.jvm.internal.m.a(r0, r5)
            if (r0 != 0) goto L1a9
        L1a6:
            k1.i.o(r8, r6, r8, r4)
        L1a9:
            P.C0345b.u(r1, r6, r3)
            java.lang.Object r0 = r6.H()
            if (r0 != r11) goto L1bb
            U4.m r0 = new U4.m
            r1 = 5
            r0.<init>(r2, r1)
            r6.d0(r0)
        L1bb:
            B5.c r0 = (B5.c) r0
            r4 = 54
            r5 = 4
            r2 = 0
            r3 = r6
            r1 = r16
            androidx.compose.ui.viewinterop.a.b(r0, r1, r2, r3, r4, r5)
            r5 = 1
            r3.p(r5)
            java.lang.Object r0 = r18.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L220
            r0 = 538678747(0x201b95db, float:1.3178594E-19)
            r3.S(r0)
            r4 = 0
            r5 = 7
            r0 = 0
            r1 = 0
            r2 = 0
            U4.AbstractC0534a.t(r0, r1, r2, r3, r4, r5)
            r8 = 0
            float r0 = (float) r8
            android.content.res.Resources r1 = r17.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r0 / r1
            java.lang.String r2 = "BOTTOM"
            r4 = 3126(0xc36, float:4.38E-42)
            U4.AbstractC0534a.l(r8, r2, r1, r3, r4)
            android.content.res.Resources r1 = r17.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r0 / r1
            java.lang.String r2 = "START"
            U4.AbstractC0534a.l(r8, r2, r1, r3, r4)
            android.content.res.Resources r1 = r17.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 / r1
            java.lang.String r1 = "END"
            U4.AbstractC0534a.l(r8, r1, r0, r3, r4)
        L21b:
            r3.p(r8)
            r5 = 1
            goto L228
        L220:
            r8 = 0
            r0 = 533705882(0x1fcfb49a, float:8.796669E-20)
            r3.S(r0)
            goto L21b
        L228:
            r3.p(r5)
            boolean r0 = r3.i(r13)
            java.lang.Object r1 = r3.H()
            if (r0 != 0) goto L237
            if (r1 != r11) goto L240
        L237:
            U4.n r1 = new U4.n
            r0 = 3
            r1.<init>(r14, r13, r0)
            r3.d0(r1)
        L240:
            B5.a r1 = (B5.a) r1
            r8 = 0
            l6.d.d(r8, r1, r3, r8)
        L246:
            r3.p(r8)
            goto L258
        L24a:
            r3 = r6
            r8 = r10
            r0 = 698070073(0x299bb439, float:6.9146464E-14)
            r3.S(r0)
            goto L246
        L253:
            r13 = r1
            r3 = r6
            r3.N()
        L258:
            P.o0 r0 = r3.r()
            if (r0 == 0) goto L267
            R4.H0 r1 = new R4.H0
            r2 = 14
            r1.<init>(r7, r2, r13)
            r0.f5482d = r1
        L267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0836n2.b(R4.k1, P.o, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b0(Parcel parcel, int i, int i7) {
        parcel.writeInt(i | (i7 << 16));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1131c c(long j, long j7) {
        int i = (int) (j >> 32);
        int i7 = (int) (j & 4294967295L);
        return new C1131c(Float.intBitsToFloat(i), Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j7 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j7 & 4294967295L)) + Float.intBitsToFloat(i7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList d(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new n5.i(objArr, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static androidx.concurrent.futures.n e(M5.B b7) {
        return Q2.g.E(new R4.L0(3, b7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int f(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        kotlin.jvm.internal.m.e(arrayList, "<this>");
        int size2 = arrayList.size();
        if (size < 0) {
            throw new IllegalArgumentException(C0.S.m("fromIndex (0) is greater than toIndex (", ").", size));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i = size - 1;
        int i7 = 0;
        while (i7 <= i) {
            int i8 = (i7 + i) >>> 1;
            int iH = h((Comparable) arrayList.get(i8), comparable);
            if (iH < 0) {
                i7 = i8 + 1;
            } else {
                if (iH <= 0) {
                    return i8;
                }
                i = i8 - 1;
            }
        }
        return -(i7 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1420b g(C1420b c1420b) {
        c1420b.k();
        c1420b.f15444s = true;
        return c1420b.f15443r > 0 ? c1420b : C1420b.f15441t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int h(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (Q2.g.p(r9, r1, kotlin.jvm.internal.m.a(r7, r2) ? r0.getWidth() : H2.f.e(r7.f1688a, r8), kotlin.jvm.internal.m.a(r7, r2) ? r0.getHeight() : H2.f.e(r7.f1689b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap i(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, E2.h r7, E2.g r8, boolean r9) {
        /*
            boolean r0 = r5 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L58
            r0 = r5
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            if (r6 == 0) goto L1a
            boolean r2 = a.AbstractC0597a.H(r6)
            if (r2 == 0) goto L18
            goto L1a
        L18:
            r2 = r6
            goto L1c
        L1a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L1c:
            if (r1 != r2) goto L58
            if (r9 == 0) goto L21
            goto L57
        L21:
            int r9 = r0.getWidth()
            int r1 = r0.getHeight()
            E2.h r2 = E2.h.f1687c
            boolean r3 = kotlin.jvm.internal.m.a(r7, r2)
            if (r3 == 0) goto L36
            int r3 = r0.getWidth()
            goto L3c
        L36:
            C3.a r3 = r7.f1688a
            int r3 = H2.f.e(r3, r8)
        L3c:
            boolean r2 = kotlin.jvm.internal.m.a(r7, r2)
            if (r2 == 0) goto L47
            int r2 = r0.getHeight()
            goto L4d
        L47:
            C3.a r2 = r7.f1689b
            int r2 = H2.f.e(r2, r8)
        L4d:
            double r1 = Q2.g.p(r9, r1, r3, r2, r8)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 != 0) goto L58
        L57:
            return r0
        L58:
            android.graphics.drawable.Drawable r5 = r5.mutate()
            android.graphics.Bitmap$Config[] r9 = H2.f.f2137a
            boolean r9 = r5 instanceof android.graphics.drawable.BitmapDrawable
            r0 = 0
            if (r9 == 0) goto L67
            r1 = r5
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            goto L68
        L67:
            r1 = r0
        L68:
            if (r1 == 0) goto L75
            android.graphics.Bitmap r1 = r1.getBitmap()
            if (r1 == 0) goto L75
            int r1 = r1.getWidth()
            goto L79
        L75:
            int r1 = r5.getIntrinsicWidth()
        L79:
            r2 = 512(0x200, float:7.175E-43)
            if (r1 <= 0) goto L7e
            goto L7f
        L7e:
            r1 = r2
        L7f:
            if (r9 == 0) goto L84
            r0 = r5
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
        L84:
            if (r0 == 0) goto L91
            android.graphics.Bitmap r9 = r0.getBitmap()
            if (r9 == 0) goto L91
            int r9 = r9.getHeight()
            goto L95
        L91:
            int r9 = r5.getIntrinsicHeight()
        L95:
            if (r9 <= 0) goto L98
            r2 = r9
        L98:
            E2.h r9 = E2.h.f1687c
            boolean r0 = kotlin.jvm.internal.m.a(r7, r9)
            if (r0 == 0) goto La2
            r0 = r1
            goto La8
        La2:
            C3.a r0 = r7.f1688a
            int r0 = H2.f.e(r0, r8)
        La8:
            boolean r9 = kotlin.jvm.internal.m.a(r7, r9)
            if (r9 == 0) goto Lb0
            r7 = r2
            goto Lb6
        Lb0:
            C3.a r7 = r7.f1689b
            int r7 = H2.f.e(r7, r8)
        Lb6:
            double r7 = Q2.g.p(r1, r2, r0, r7, r8)
            double r0 = (double) r1
            double r0 = r0 * r7
            int r9 = D5.a.F(r0)
            double r0 = (double) r2
            double r7 = r7 * r0
            int r7 = D5.a.F(r7)
            if (r6 == 0) goto Lce
            boolean r8 = a.AbstractC0597a.H(r6)
            if (r8 == 0) goto Ld0
        Lce:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        Ld0:
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r9, r7, r6)
            android.graphics.Rect r8 = r5.getBounds()
            int r0 = r8.left
            int r1 = r8.top
            int r2 = r8.right
            int r8 = r8.bottom
            r3 = 0
            r5.setBounds(r3, r3, r9, r7)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r6)
            r5.draw(r7)
            r5.setBounds(r0, r1, r2, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0836n2.i(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, E2.h, E2.g, boolean):android.graphics.Bitmap");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static E1.w j(Context context) {
        ProviderInfo providerInfo;
        s1.c cVar;
        ApplicationInfo applicationInfo;
        s4.e c0145c = Build.VERSION.SDK_INT >= 28 ? new C0145c(3) : new s4.e(3);
        PackageManager packageManager = context.getPackageManager();
        E3.h.p(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            cVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrH = c0145c.h(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrH) {
                    arrayList.add(signature.toByteArray());
                }
                cVar = new s1.c(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e7) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e7);
                cVar = null;
            }
        }
        if (cVar == null) {
            return null;
        }
        return new E1.w(new E1.v(context, cVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Handler k(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return A1.k.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e7) {
            e = e7;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e8) {
            e = e8;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e9) {
            e = e9;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final T1.u l(Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        T1.u uVar = new T1.u(context);
        W1.j jVar = uVar.f7418b;
        T1.A a7 = jVar.f8081s;
        a7.a(new U1.g(a7));
        jVar.f8081s.a(new U1.i());
        jVar.f8081s.a(new U1.r());
        return uVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean m(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C1834J.f18145d;
        C1834J c1834j = (C1834J) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c1834j == null) {
            c1834j = new C1834J();
            c1834j.f18146a = null;
            c1834j.f18147b = null;
            c1834j.f18148c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c1834j);
        }
        WeakReference weakReference2 = c1834j.f18148c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c1834j.f18148c = new WeakReference(keyEvent);
        if (c1834j.f18147b == null) {
            c1834j.f18147b = new SparseArray();
        }
        SparseArray sparseArray = c1834j.f18147b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean n(InterfaceC1846i interfaceC1846i, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC1846i != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC1846i.c(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f10919a) {
                            try {
                                f10920b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f10919a = true;
                        }
                        Method method = f10920b;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (AbstractC1835K.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f10921c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f10922d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f10921c = true;
                }
                Field field = f10922d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (AbstractC1835K.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && AbstractC1835K.c(view, keyEvent)) || interfaceC1846i.c(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d6.p o(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        Matcher matcher = d6.p.f12375b.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String strGroup = matcher.group(1);
        kotlin.jvm.internal.m.d(strGroup, "typeSubtype.group(1)");
        Locale US = Locale.US;
        kotlin.jvm.internal.m.d(US, "US");
        kotlin.jvm.internal.m.d(strGroup.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        kotlin.jvm.internal.m.d(strGroup2, "typeSubtype.group(2)");
        kotlin.jvm.internal.m.d(strGroup2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = d6.p.f12376c.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(C0.S.p(sb, str, '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (J5.t.G0(strGroup4, "'", false) && J5.t.A0(strGroup4, "'", false) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    kotlin.jvm.internal.m.d(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new d6.p(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final g2.e p(View view) {
        kotlin.jvm.internal.m.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            g2.e eVar = tag instanceof g2.e ? (g2.e) tag : null;
            if (eVar != null) {
                return eVar;
            }
            Object objQ = l6.d.q(view);
            view = objQ instanceof View ? (View) objQ : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int q(Cursor c7, String str) {
        kotlin.jvm.internal.m.e(c7, "c");
        int columnIndex = c7.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c7.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = c7.getColumnNames();
        kotlin.jvm.internal.m.d(columnNames, "columnNames");
        String strConcat = ".".concat(str);
        String str2 = "." + str + '`';
        int length = columnNames.length;
        int i = 0;
        int i7 = 0;
        while (i < length) {
            String str3 = columnNames[i];
            int i8 = i7 + 1;
            if (str3.length() >= str.length() + 2 && (J5.t.A0(str3, strConcat, false) || (str3.charAt(0) == '`' && J5.t.A0(str3, str2, false)))) {
                return i7;
            }
            i++;
            i7 = i8;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int r(Cursor c7, String str) {
        String string;
        kotlin.jvm.internal.m.e(c7, "c");
        int iQ = q(c7, str);
        if (iQ >= 0) {
            return iQ;
        }
        try {
            String[] columnNames = c7.getColumnNames();
            kotlin.jvm.internal.m.d(columnNames, "c.columnNames");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i = 0;
            for (String str2 : columnNames) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                P1.e(sb, str2, null);
            }
            sb.append((CharSequence) "");
            string = sb.toString();
        } catch (Exception e7) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e7);
            string = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Class s(H5.c cVar) {
        kotlin.jvm.internal.m.e(cVar, "<this>");
        Class clsA = ((kotlin.jvm.internal.e) cVar).a();
        kotlin.jvm.internal.m.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class t(H5.c cVar) {
        kotlin.jvm.internal.m.e(cVar, "<this>");
        Class clsA = ((kotlin.jvm.internal.e) cVar).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int u(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        return list.size() - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int v(int i, int i7, int i8) {
        if (i8 > 0) {
            if (i < i7) {
                int i9 = i7 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i7 - i11;
            }
        } else {
            if (i8 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i7) {
                int i12 = -i8;
                int i13 = i % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i7 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i15 + i7;
            }
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Typeface w(O4.b bVar) {
        Object objB;
        Context context;
        try {
            context = O4.c.f5204b;
        } catch (Throwable th) {
            objB = AbstractC1362a.b(th);
        }
        if (context == null) {
            throw new RuntimeException("A 'Iconics.init(context)' has to happen first. Call from your application. Usually this happens via an 'IconicsDrawable' usage.");
        }
        int fontRes = bVar.getFontRes();
        ThreadLocal threadLocal = m1.l.f15039a;
        objB = context.isRestricted() ? null : m1.l.a(context, fontRes, new TypedValue(), 0, null, false, false);
        Typeface typeface = (Typeface) (objB instanceof C1373l ? null : objB);
        if (typeface != null) {
            return typeface;
        }
        Typeface DEFAULT = Typeface.DEFAULT;
        kotlin.jvm.internal.m.d(DEFAULT, "DEFAULT");
        return DEFAULT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long x(double d5) {
        return E(4294967296L, (float) d5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long y(int i) {
        return E(4294967296L, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List z(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.m.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }
}
