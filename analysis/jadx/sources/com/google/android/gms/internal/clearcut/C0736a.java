package com.google.android.gms.internal.clearcut;

import C0.r1;
import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0736a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ConcurrentHashMap f10475h = new ConcurrentHashMap();
    public static final String[] i = {"key", FirebaseAnalytics.Param.VALUE};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f10476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f10477b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile HashMap f10480e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10479d = new Object();
    public final Object f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f10481g = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f10478c = new r1(1, this);

    public C0736a(ContentResolver contentResolver, Uri uri) {
        this.f10476a = contentResolver;
        this.f10477b = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HashMap a() {
        try {
            HashMap map = new HashMap();
            Cursor cursorQuery = this.f10476a.query(this.f10477b, i, null, null, null);
            if (cursorQuery == null) {
                return map;
            }
            while (cursorQuery.moveToNext()) {
                try {
                    map.put(cursorQuery.getString(0), cursorQuery.getString(1));
                } finally {
                    cursorQuery.close();
                }
            }
            return map;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }
}
