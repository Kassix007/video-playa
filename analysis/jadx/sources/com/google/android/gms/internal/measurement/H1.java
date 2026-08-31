package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class H1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f10640a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f10641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f10642c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f10641b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f10642c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
