package com.google.firebase;

import B3.d;
import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import v3.l;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseOptions {
    private static final String API_KEY_RESOURCE_NAME = "google_api_key";
    private static final String APP_ID_RESOURCE_NAME = "google_app_id";
    private static final String DATABASE_URL_RESOURCE_NAME = "firebase_database_url";
    private static final String GA_TRACKING_ID_RESOURCE_NAME = "ga_trackingId";
    private static final String GCM_SENDER_ID_RESOURCE_NAME = "gcm_defaultSenderId";
    private static final String PROJECT_ID_RESOURCE_NAME = "project_id";
    private static final String STORAGE_BUCKET_RESOURCE_NAME = "google_storage_bucket";
    private final String apiKey;
    private final String applicationId;
    private final String databaseUrl;
    private final String gaTrackingId;
    private final String gcmSenderId;
    private final String projectId;
    private final String storageBucket;

    public static final class Builder {
        private String apiKey;
        private String applicationId;
        private String databaseUrl;
        private String gaTrackingId;
        private String gcmSenderId;
        private String projectId;
        private String storageBucket;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public FirebaseOptions build() {
            return new FirebaseOptions(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder setApiKey(String str) {
            AbstractC1887A.e(str, "ApiKey must be set.");
            this.apiKey = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder setApplicationId(String str) {
            AbstractC1887A.e(str, "ApplicationId must be set.");
            this.applicationId = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder setDatabaseUrl(String str) {
            this.databaseUrl = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder setGaTrackingId(String str) {
            this.gaTrackingId = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder setGcmSenderId(String str) {
            this.gcmSenderId = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder setProjectId(String str) {
            this.projectId = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder setStorageBucket(String str) {
            this.storageBucket = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Builder(FirebaseOptions firebaseOptions) {
            this.applicationId = firebaseOptions.applicationId;
            this.apiKey = firebaseOptions.apiKey;
            this.databaseUrl = firebaseOptions.databaseUrl;
            this.gaTrackingId = firebaseOptions.gaTrackingId;
            this.gcmSenderId = firebaseOptions.gcmSenderId;
            this.storageBucket = firebaseOptions.storageBucket;
            this.projectId = firebaseOptions.projectId;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static FirebaseOptions fromResource(Context context) {
        l lVar = new l(context);
        String strB = lVar.b(APP_ID_RESOURCE_NAME);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        return new FirebaseOptions(strB, lVar.b(API_KEY_RESOURCE_NAME), lVar.b(DATABASE_URL_RESOURCE_NAME), lVar.b(GA_TRACKING_ID_RESOURCE_NAME), lVar.b(GCM_SENDER_ID_RESOURCE_NAME), lVar.b(STORAGE_BUCKET_RESOURCE_NAME), lVar.b(PROJECT_ID_RESOURCE_NAME));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return AbstractC1887A.j(this.applicationId, firebaseOptions.applicationId) && AbstractC1887A.j(this.apiKey, firebaseOptions.apiKey) && AbstractC1887A.j(this.databaseUrl, firebaseOptions.databaseUrl) && AbstractC1887A.j(this.gaTrackingId, firebaseOptions.gaTrackingId) && AbstractC1887A.j(this.gcmSenderId, firebaseOptions.gcmSenderId) && AbstractC1887A.j(this.storageBucket, firebaseOptions.storageBucket) && AbstractC1887A.j(this.projectId, firebaseOptions.projectId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getApiKey() {
        return this.apiKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getApplicationId() {
        return this.applicationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getDatabaseUrl() {
        return this.databaseUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getGaTrackingId() {
        return this.gaTrackingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getGcmSenderId() {
        return this.gcmSenderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getStorageBucket() {
        return this.storageBucket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        l lVar = new l(this);
        lVar.a(this.applicationId, "applicationId");
        lVar.a(this.apiKey, "apiKey");
        lVar.a(this.databaseUrl, "databaseUrl");
        lVar.a(this.gcmSenderId, "gcmSenderId");
        lVar.a(this.storageBucket, "storageBucket");
        lVar.a(this.projectId, "projectId");
        return lVar.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = d.f559a;
        AbstractC1887A.i(true ^ (str == null || str.trim().isEmpty()), "ApplicationId must be set.");
        this.applicationId = str;
        this.apiKey = str2;
        this.databaseUrl = str3;
        this.gaTrackingId = str4;
        this.gcmSenderId = str5;
        this.storageBucket = str6;
        this.projectId = str7;
    }
}
