.class public final LO3/h0;
.super LO3/E0;
.source "SourceFile"


# static fields
.field public static final Q:Landroid/util/Pair;


# instance fields
.field public A:J

.field public final B:LO3/f0;

.field public final C:LO3/e0;

.field public final D:LK2/a;

.field public final E:LE/c0;

.field public final F:LO3/e0;

.field public final G:LO3/f0;

.field public final H:LO3/f0;

.field public I:Z

.field public final J:LO3/e0;

.field public final K:LO3/e0;

.field public final L:LO3/f0;

.field public final M:LK2/a;

.field public final N:LK2/a;

.field public final O:LO3/f0;

.field public final P:LE/c0;

.field public t:Landroid/content/SharedPreferences;

.field public u:Landroid/content/SharedPreferences;

.field public v:LO3/g0;

.field public final w:LO3/f0;

.field public final x:LK2/a;

.field public y:Ljava/lang/String;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/Pair;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, ""

    .line 10
    .line 11
    invoke-direct {v0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LO3/h0;->Q:Landroid/util/Pair;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(LO3/t0;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, LO3/E0;-><init>(LO3/t0;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, LO3/f0;

    .line 5
    .line 6
    const-wide/32 v0, 0x1b7740

    .line 7
    .line 8
    .line 9
    const-string v2, "session_timeout"

    .line 10
    .line 11
    invoke-direct {p1, p0, v2, v0, v1}, LO3/f0;-><init>(LO3/h0;Ljava/lang/String;J)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LO3/h0;->B:LO3/f0;

    .line 15
    .line 16
    new-instance p1, LO3/e0;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    const-string v1, "start_new_session"

    .line 20
    .line 21
    invoke-direct {p1, p0, v1, v0}, LO3/e0;-><init>(LO3/h0;Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LO3/h0;->C:LO3/e0;

    .line 25
    .line 26
    new-instance p1, LO3/f0;

    .line 27
    .line 28
    const-string v0, "last_pause_time"

    .line 29
    .line 30
    const-wide/16 v1, 0x0

    .line 31
    .line 32
    invoke-direct {p1, p0, v0, v1, v2}, LO3/f0;-><init>(LO3/h0;Ljava/lang/String;J)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, LO3/h0;->G:LO3/f0;

    .line 36
    .line 37
    new-instance p1, LO3/f0;

    .line 38
    .line 39
    const-string v0, "session_id"

    .line 40
    .line 41
    invoke-direct {p1, p0, v0, v1, v2}, LO3/f0;-><init>(LO3/h0;Ljava/lang/String;J)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, LO3/h0;->H:LO3/f0;

    .line 45
    .line 46
    new-instance p1, LK2/a;

    .line 47
    .line 48
    const-string v0, "non_personalized_ads"

    .line 49
    .line 50
    invoke-direct {p1, p0, v0}, LK2/a;-><init>(LO3/h0;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, LO3/h0;->D:LK2/a;

    .line 54
    .line 55
    new-instance p1, LE/c0;

    .line 56
    .line 57
    const-string v0, "last_received_uri_timestamps_by_source"

    .line 58
    .line 59
    invoke-direct {p1, p0, v0}, LE/c0;-><init>(LO3/h0;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, LO3/h0;->E:LE/c0;

    .line 63
    .line 64
    new-instance p1, LO3/e0;

    .line 65
    .line 66
    const-string v0, "allow_remote_dynamite"

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-direct {p1, p0, v0, v3}, LO3/e0;-><init>(LO3/h0;Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, LO3/h0;->F:LO3/e0;

    .line 73
    .line 74
    new-instance p1, LO3/f0;

    .line 75
    .line 76
    const-string v0, "first_open_time"

    .line 77
    .line 78
    invoke-direct {p1, p0, v0, v1, v2}, LO3/f0;-><init>(LO3/h0;Ljava/lang/String;J)V

    .line 79
    .line 80
    .line 81
    iput-object p1, p0, LO3/h0;->w:LO3/f0;

    .line 82
    .line 83
    const-string p1, "app_install_time"

    .line 84
    .line 85
    invoke-static {p1}, Lx3/A;->d(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    new-instance p1, LK2/a;

    .line 89
    .line 90
    const-string v0, "app_instance_id"

    .line 91
    .line 92
    invoke-direct {p1, p0, v0}, LK2/a;-><init>(LO3/h0;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, LO3/h0;->x:LK2/a;

    .line 96
    .line 97
    new-instance p1, LO3/e0;

    .line 98
    .line 99
    const-string v0, "app_backgrounded"

    .line 100
    .line 101
    invoke-direct {p1, p0, v0, v3}, LO3/e0;-><init>(LO3/h0;Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, LO3/h0;->J:LO3/e0;

    .line 105
    .line 106
    new-instance p1, LO3/e0;

    .line 107
    .line 108
    const-string v0, "deep_link_retrieval_complete"

    .line 109
    .line 110
    invoke-direct {p1, p0, v0, v3}, LO3/e0;-><init>(LO3/h0;Ljava/lang/String;Z)V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, LO3/h0;->K:LO3/e0;

    .line 114
    .line 115
    new-instance p1, LO3/f0;

    .line 116
    .line 117
    const-string v0, "deep_link_retrieval_attempts"

    .line 118
    .line 119
    invoke-direct {p1, p0, v0, v1, v2}, LO3/f0;-><init>(LO3/h0;Ljava/lang/String;J)V

    .line 120
    .line 121
    .line 122
    iput-object p1, p0, LO3/h0;->L:LO3/f0;

    .line 123
    .line 124
    new-instance p1, LK2/a;

    .line 125
    .line 126
    const-string v0, "firebase_feature_rollouts"

    .line 127
    .line 128
    invoke-direct {p1, p0, v0}, LK2/a;-><init>(LO3/h0;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    iput-object p1, p0, LO3/h0;->M:LK2/a;

    .line 132
    .line 133
    new-instance p1, LK2/a;

    .line 134
    .line 135
    const-string v0, "deferred_attribution_cache"

    .line 136
    .line 137
    invoke-direct {p1, p0, v0}, LK2/a;-><init>(LO3/h0;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iput-object p1, p0, LO3/h0;->N:LK2/a;

    .line 141
    .line 142
    new-instance p1, LO3/f0;

    .line 143
    .line 144
    const-string v0, "deferred_attribution_cache_timestamp"

    .line 145
    .line 146
    invoke-direct {p1, p0, v0, v1, v2}, LO3/f0;-><init>(LO3/h0;Ljava/lang/String;J)V

    .line 147
    .line 148
    .line 149
    iput-object p1, p0, LO3/h0;->O:LO3/f0;

    .line 150
    .line 151
    new-instance p1, LE/c0;

    .line 152
    .line 153
    const-string v0, "default_event_parameters"

    .line 154
    .line 155
    invoke-direct {p1, p0, v0}, LE/c0;-><init>(LO3/h0;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iput-object p1, p0, LO3/h0;->P:LE/c0;

    .line 159
    .line 160
    return-void
.end method


# virtual methods
.method public final p()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final s()Landroid/content/SharedPreferences;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO3/D0;->o()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LO3/E0;->q()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LO3/h0;->t:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LO3/h0;->t:Landroid/content/SharedPreferences;

    .line 13
    .line 14
    return-object v0
.end method

.method public final t()Landroid/content/SharedPreferences;
    .locals 4

    .line 1
    invoke-virtual {p0}, LO3/D0;->o()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LO3/E0;->q()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LO3/h0;->u:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LO3/D0;->r:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, LO3/t0;

    .line 14
    .line 15
    iget-object v1, v0, LO3/t0;->q:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, v0, LO3/t0;->v:LO3/X;

    .line 26
    .line 27
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v2, LO3/X;->E:LO3/V;

    .line 31
    .line 32
    const-string v3, "_preferences"

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v3, "Default prefs file"

    .line 39
    .line 40
    invoke-virtual {v2, v1, v3}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, v0, LO3/t0;->q:Landroid/content/Context;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, LO3/h0;->u:Landroid/content/SharedPreferences;

    .line 51
    .line 52
    :cond_0
    iget-object v0, p0, LO3/h0;->u:Landroid/content/SharedPreferences;

    .line 53
    .line 54
    return-object v0
.end method

.method public final u()Landroid/util/SparseArray;
    .locals 7

    .line 1
    iget-object v0, p0, LO3/h0;->E:LE/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/c0;->B()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "uriSources"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "uriTimestamps"

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getLongArray(Ljava/lang/String;)[J

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    array-length v2, v0

    .line 25
    array-length v3, v1

    .line 26
    if-eq v3, v2, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, LO3/D0;->r:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, LO3/t0;

    .line 31
    .line 32
    iget-object v0, v0, LO3/t0;->v:LO3/X;

    .line 33
    .line 34
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 38
    .line 39
    const-string v1, "Trigger URI source and timestamp array lengths do not match"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, LO3/V;->b(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Landroid/util/SparseArray;

    .line 45
    .line 46
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_1
    new-instance v2, Landroid/util/SparseArray;

    .line 51
    .line 52
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 53
    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    :goto_0
    array-length v4, v1

    .line 57
    if-ge v3, v4, :cond_2

    .line 58
    .line 59
    aget v4, v1, v3

    .line 60
    .line 61
    aget-wide v5, v0, v3

    .line 62
    .line 63
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {v2, v4, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    return-object v2

    .line 74
    :cond_3
    :goto_1
    new-instance v0, Landroid/util/SparseArray;

    .line 75
    .line 76
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 77
    .line 78
    .line 79
    return-object v0
.end method

.method public final v()LO3/J0;
    .locals 4

    .line 1
    invoke-virtual {p0}, LO3/D0;->o()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "consent_settings"

    .line 9
    .line 10
    const-string v2, "G1"

    .line 11
    .line 12
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "consent_source"

    .line 21
    .line 22
    const/16 v3, 0x64

    .line 23
    .line 24
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1, v0}, LO3/J0;->c(ILjava/lang/String;)LO3/J0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method

.method public final w(LO3/F1;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, LO3/D0;->o()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, ""

    .line 9
    .line 10
    const-string v2, "stored_tcf_param"

    .line 11
    .line 12
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1}, LO3/F1;->a()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    return p1
.end method

.method public final x(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LO3/D0;->o()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LO3/D0;->r:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, LO3/t0;

    .line 7
    .line 8
    iget-object v0, v0, LO3/t0;->v:LO3/X;

    .line 9
    .line 10
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, LO3/X;->E:LO3/V;

    .line 14
    .line 15
    const-string v1, "App measurement setting deferred collection"

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v2, v1}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "deferred_analytics_collection"

    .line 33
    .line 34
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final y(J)Z
    .locals 2

    .line 1
    iget-object v0, p0, LO3/h0;->B:LO3/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LO3/f0;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sub-long/2addr p1, v0

    .line 8
    iget-object v0, p0, LO3/h0;->G:LO3/f0;

    .line 9
    .line 10
    invoke-virtual {v0}, LO3/f0;->a()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    cmp-long p1, p1, v0

    .line 15
    .line 16
    if-lez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method
