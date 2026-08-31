.class public final LO3/Y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final synthetic q:LO3/b1;


# direct methods
.method public constructor <init>(LO3/b1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO3/Y0;->q:LO3/b1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/measurement/X;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    iget-object v1, p0, LO3/Y0;->q:LO3/b1;

    .line 2
    .line 3
    :try_start_0
    iget-object v0, v1, LO3/D0;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LO3/t0;

    .line 6
    .line 7
    iget-object v2, v0, LO3/t0;->v:LO3/X;

    .line 8
    .line 9
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, v2, LO3/X;->E:LO3/V;

    .line 13
    .line 14
    const-string v3, "onActivityCreated"

    .line 15
    .line 16
    invoke-virtual {v2, v3}, LO3/V;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/X;->s:Landroid/content/Intent;

    .line 20
    .line 21
    if-eqz v2, :cond_7

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v3}, Landroid/net/Uri;->isHierarchical()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    :goto_0
    move-object v5, v3

    .line 37
    goto :goto_2

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto/16 :goto_c

    .line 40
    .line 41
    :catch_0
    move-exception v0

    .line 42
    goto/16 :goto_a

    .line 43
    .line 44
    :cond_1
    :goto_1
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const/4 v4, 0x0

    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    const-string v5, "com.android.vending.referral_url"

    .line 52
    .line 53
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-nez v5, :cond_2

    .line 62
    .line 63
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move-object v5, v4

    .line 69
    :goto_2
    if-eqz v5, :cond_7

    .line 70
    .line 71
    invoke-virtual {v5}, Landroid/net/Uri;->isHierarchical()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-nez v3, :cond_3

    .line 76
    .line 77
    goto :goto_8

    .line 78
    :cond_3
    iget-object v3, v0, LO3/t0;->y:LO3/Y1;

    .line 79
    .line 80
    invoke-static {v3}, LO3/t0;->j(LO3/D0;)V

    .line 81
    .line 82
    .line 83
    const-string v3, "android.intent.extra.REFERRER_NAME"

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    const-string v3, "android-app://com.google.android.googlequicksearchbox/https/www.google.com"

    .line 90
    .line 91
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-nez v3, :cond_5

    .line 96
    .line 97
    const-string v3, "https://www.google.com"

    .line 98
    .line 99
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-nez v3, :cond_5

    .line 104
    .line 105
    const-string v3, "android-app://com.google.appcrawler"

    .line 106
    .line 107
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_4

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_4
    const-string v2, "auto"

    .line 115
    .line 116
    :goto_3
    move-object v6, v2

    .line 117
    goto :goto_5

    .line 118
    :cond_5
    :goto_4
    const-string v2, "gs"

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :goto_5
    const-string v2, "referrer"

    .line 122
    .line 123
    invoke-virtual {v5, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    if-nez p2, :cond_6

    .line 128
    .line 129
    const/4 v2, 0x1

    .line 130
    :goto_6
    move v4, v2

    .line 131
    goto :goto_7

    .line 132
    :cond_6
    const/4 v2, 0x0

    .line 133
    goto :goto_6

    .line 134
    :goto_7
    iget-object v0, v0, LO3/t0;->w:LO3/p0;

    .line 135
    .line 136
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 137
    .line 138
    .line 139
    new-instance v2, LO3/T0;

    .line 140
    .line 141
    move-object v3, p0

    .line 142
    invoke-direct/range {v2 .. v7}, LO3/T0;-><init>(LO3/Y0;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v2}, LO3/p0;->x(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    .line 147
    .line 148
    goto :goto_b

    .line 149
    :cond_7
    :goto_8
    iget-object v0, v1, LO3/D0;->r:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, LO3/t0;

    .line 152
    .line 153
    :goto_9
    iget-object v0, v0, LO3/t0;->B:LO3/m1;

    .line 154
    .line 155
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, p1, p2}, LO3/m1;->w(Lcom/google/android/gms/internal/measurement/X;Landroid/os/Bundle;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :goto_a
    :try_start_1
    iget-object v2, v1, LO3/D0;->r:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v2, LO3/t0;

    .line 165
    .line 166
    iget-object v2, v2, LO3/t0;->v:LO3/X;

    .line 167
    .line 168
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 169
    .line 170
    .line 171
    iget-object v2, v2, LO3/X;->w:LO3/V;

    .line 172
    .line 173
    const-string v3, "Throwable caught in onActivityCreated"

    .line 174
    .line 175
    invoke-virtual {v2, v0, v3}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 176
    .line 177
    .line 178
    :goto_b
    iget-object v0, v1, LO3/D0;->r:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, LO3/t0;

    .line 181
    .line 182
    goto :goto_9

    .line 183
    :goto_c
    iget-object v1, v1, LO3/D0;->r:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v1, LO3/t0;

    .line 186
    .line 187
    iget-object v1, v1, LO3/t0;->B:LO3/m1;

    .line 188
    .line 189
    invoke-static {v1}, LO3/t0;->k(LO3/H;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, p1, p2}, LO3/m1;->w(Lcom/google/android/gms/internal/measurement/X;Landroid/os/Bundle;)V

    .line 193
    .line 194
    .line 195
    throw v0
.end method

.method public final b(Lcom/google/android/gms/internal/measurement/X;)V
    .locals 3

    .line 1
    iget-object v0, p0, LO3/Y0;->q:LO3/b1;

    .line 2
    .line 3
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LO3/t0;

    .line 6
    .line 7
    iget-object v0, v0, LO3/t0;->B:LO3/m1;

    .line 8
    .line 9
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, LO3/m1;->C:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v1

    .line 15
    :try_start_0
    iget-object v2, v0, LO3/m1;->x:Lcom/google/android/gms/internal/measurement/X;

    .line 16
    .line 17
    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iput-object v2, v0, LO3/m1;->x:Lcom/google/android/gms/internal/measurement/X;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    iget-object v1, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, LO3/t0;

    .line 33
    .line 34
    iget-object v1, v1, LO3/t0;->t:LO3/g;

    .line 35
    .line 36
    invoke-virtual {v1}, LO3/g;->C()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    iget-object v0, v0, LO3/m1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 44
    .line 45
    iget p1, p1, Lcom/google/android/gms/internal/measurement/X;->q:I

    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw p1
.end method

.method public final c(Lcom/google/android/gms/internal/measurement/X;)V
    .locals 7

    .line 1
    iget-object v0, p0, LO3/Y0;->q:LO3/b1;

    .line 2
    .line 3
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LO3/t0;

    .line 6
    .line 7
    iget-object v1, v0, LO3/t0;->B:LO3/m1;

    .line 8
    .line 9
    invoke-static {v1}, LO3/t0;->k(LO3/H;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, v1, LO3/m1;->C:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v2

    .line 15
    const/4 v3, 0x0

    .line 16
    :try_start_0
    iput-boolean v3, v1, LO3/m1;->B:Z

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    iput-boolean v3, v1, LO3/m1;->y:Z

    .line 20
    .line 21
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    iget-object v2, v1, LO3/D0;->r:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, LO3/t0;

    .line 25
    .line 26
    iget-object v3, v2, LO3/t0;->A:LB3/a;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    iget-object v5, v2, LO3/t0;->t:LO3/g;

    .line 36
    .line 37
    invoke-virtual {v5}, LO3/g;->C()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/4 v6, 0x0

    .line 42
    if-nez v5, :cond_0

    .line 43
    .line 44
    iput-object v6, v1, LO3/m1;->t:LO3/j1;

    .line 45
    .line 46
    iget-object p1, v2, LO3/t0;->w:LO3/p0;

    .line 47
    .line 48
    invoke-static {p1}, LO3/t0;->l(LO3/E0;)V

    .line 49
    .line 50
    .line 51
    new-instance v2, LO3/x;

    .line 52
    .line 53
    invoke-direct {v2, v1, v3, v4}, LO3/x;-><init>(LO3/m1;J)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v2}, LO3/p0;->x(Ljava/lang/Runnable;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {v1, p1}, LO3/m1;->t(Lcom/google/android/gms/internal/measurement/X;)LO3/j1;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object v5, v1, LO3/m1;->t:LO3/j1;

    .line 65
    .line 66
    iput-object v5, v1, LO3/m1;->u:LO3/j1;

    .line 67
    .line 68
    iput-object v6, v1, LO3/m1;->t:LO3/j1;

    .line 69
    .line 70
    iget-object v2, v2, LO3/t0;->w:LO3/p0;

    .line 71
    .line 72
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 73
    .line 74
    .line 75
    new-instance v5, LO3/a;

    .line 76
    .line 77
    invoke-direct {v5, v1, p1, v3, v4}, LO3/a;-><init>(LO3/m1;LO3/j1;J)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v5}, LO3/p0;->x(Ljava/lang/Runnable;)V

    .line 81
    .line 82
    .line 83
    :goto_0
    iget-object p1, v0, LO3/t0;->x:LO3/E1;

    .line 84
    .line 85
    invoke-static {p1}, LO3/t0;->k(LO3/H;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p1, LO3/D0;->r:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, LO3/t0;

    .line 91
    .line 92
    iget-object v1, v0, LO3/t0;->A:LB3/a;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 98
    .line 99
    .line 100
    move-result-wide v1

    .line 101
    iget-object v0, v0, LO3/t0;->w:LO3/p0;

    .line 102
    .line 103
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 104
    .line 105
    .line 106
    new-instance v3, LO3/A1;

    .line 107
    .line 108
    const/4 v4, 0x1

    .line 109
    invoke-direct {v3, p1, v1, v2, v4}, LO3/A1;-><init>(LO3/E1;JI)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v3}, LO3/p0;->x(Ljava/lang/Runnable;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :catchall_0
    move-exception p1

    .line 117
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    throw p1
.end method

.method public final d(Lcom/google/android/gms/internal/measurement/X;)V
    .locals 7

    .line 1
    iget-object v0, p0, LO3/Y0;->q:LO3/b1;

    .line 2
    .line 3
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LO3/t0;

    .line 6
    .line 7
    iget-object v1, v0, LO3/t0;->x:LO3/E1;

    .line 8
    .line 9
    invoke-static {v1}, LO3/t0;->k(LO3/H;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, v1, LO3/D0;->r:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, LO3/t0;

    .line 15
    .line 16
    iget-object v3, v2, LO3/t0;->A:LB3/a;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    iget-object v2, v2, LO3/t0;->w:LO3/p0;

    .line 26
    .line 27
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 28
    .line 29
    .line 30
    new-instance v5, LO3/A1;

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    invoke-direct {v5, v1, v3, v4, v6}, LO3/A1;-><init>(LO3/E1;JI)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v5}, LO3/p0;->x(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, v0, LO3/t0;->B:LO3/m1;

    .line 40
    .line 41
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, v0, LO3/m1;->C:Ljava/lang/Object;

    .line 45
    .line 46
    monitor-enter v1

    .line 47
    const/4 v2, 0x1

    .line 48
    :try_start_0
    iput-boolean v2, v0, LO3/m1;->B:Z

    .line 49
    .line 50
    iget-object v2, v0, LO3/m1;->x:Lcom/google/android/gms/internal/measurement/X;

    .line 51
    .line 52
    invoke-static {p1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    const/4 v3, 0x0

    .line 57
    if-nez v2, :cond_0

    .line 58
    .line 59
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    :try_start_1
    iput-object p1, v0, LO3/m1;->x:Lcom/google/android/gms/internal/measurement/X;

    .line 61
    .line 62
    iput-boolean v3, v0, LO3/m1;->y:Z

    .line 63
    .line 64
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    :try_start_2
    iget-object v2, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, LO3/t0;

    .line 68
    .line 69
    iget-object v4, v2, LO3/t0;->t:LO3/g;

    .line 70
    .line 71
    invoke-virtual {v4}, LO3/g;->C()Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_0

    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    iput-object v4, v0, LO3/m1;->z:LO3/j1;

    .line 79
    .line 80
    iget-object v2, v2, LO3/t0;->w:LO3/p0;

    .line 81
    .line 82
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 83
    .line 84
    .line 85
    new-instance v4, LO3/l1;

    .line 86
    .line 87
    const/4 v5, 0x1

    .line 88
    invoke-direct {v4, v0, v5}, LO3/l1;-><init>(LO3/m1;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v4}, LO3/p0;->x(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catchall_0
    move-exception p1

    .line 96
    goto :goto_1

    .line 97
    :catchall_1
    move-exception p1

    .line 98
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 99
    :try_start_4
    throw p1

    .line 100
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 101
    iget-object v1, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v1, LO3/t0;

    .line 104
    .line 105
    iget-object v2, v1, LO3/t0;->t:LO3/g;

    .line 106
    .line 107
    invoke-virtual {v2}, LO3/g;->C()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-nez v2, :cond_1

    .line 112
    .line 113
    iget-object p1, v0, LO3/m1;->z:LO3/j1;

    .line 114
    .line 115
    iput-object p1, v0, LO3/m1;->t:LO3/j1;

    .line 116
    .line 117
    iget-object p1, v1, LO3/t0;->w:LO3/p0;

    .line 118
    .line 119
    invoke-static {p1}, LO3/t0;->l(LO3/E0;)V

    .line 120
    .line 121
    .line 122
    new-instance v1, LO3/l1;

    .line 123
    .line 124
    const/4 v2, 0x0

    .line 125
    invoke-direct {v1, v0, v2}, LO3/l1;-><init>(LO3/m1;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v1}, LO3/p0;->x(Ljava/lang/Runnable;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_1
    invoke-virtual {v0, p1}, LO3/m1;->t(Lcom/google/android/gms/internal/measurement/X;)LO3/j1;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/X;->r:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v0, p1, v1, v3}, LO3/m1;->x(Ljava/lang/String;LO3/j1;Z)V

    .line 139
    .line 140
    .line 141
    iget-object p1, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p1, LO3/t0;

    .line 144
    .line 145
    iget-object p1, p1, LO3/t0;->D:LO3/A;

    .line 146
    .line 147
    invoke-static {p1}, LO3/t0;->i(LO3/C;)V

    .line 148
    .line 149
    .line 150
    iget-object v0, p1, LO3/D0;->r:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, LO3/t0;

    .line 153
    .line 154
    iget-object v1, v0, LO3/t0;->A:LB3/a;

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 160
    .line 161
    .line 162
    move-result-wide v1

    .line 163
    iget-object v0, v0, LO3/t0;->w:LO3/p0;

    .line 164
    .line 165
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 166
    .line 167
    .line 168
    new-instance v3, LO3/x;

    .line 169
    .line 170
    invoke-direct {v3, p1, v1, v2}, LO3/x;-><init>(LO3/A;J)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v3}, LO3/p0;->x(Ljava/lang/Runnable;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :goto_1
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 178
    throw p1
.end method

.method public final e(Lcom/google/android/gms/internal/measurement/X;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object v0, p0, LO3/Y0;->q:LO3/b1;

    .line 2
    .line 3
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LO3/t0;

    .line 6
    .line 7
    iget-object v0, v0, LO3/t0;->B:LO3/m1;

    .line 8
    .line 9
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LO3/t0;

    .line 15
    .line 16
    iget-object v1, v1, LO3/t0;->t:LO3/g;

    .line 17
    .line 18
    invoke-virtual {v1}, LO3/g;->C()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-eqz p2, :cond_1

    .line 26
    .line 27
    iget-object v0, v0, LO3/m1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    iget p1, p1, Lcom/google/android/gms/internal/measurement/X;->q:I

    .line 30
    .line 31
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, LO3/j1;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    new-instance v0, Landroid/os/Bundle;

    .line 44
    .line 45
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v1, "id"

    .line 49
    .line 50
    iget-wide v2, p1, LO3/j1;->c:J

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 53
    .line 54
    .line 55
    const-string v1, "name"

    .line 56
    .line 57
    iget-object v2, p1, LO3/j1;->a:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v1, "referrer_name"

    .line 63
    .line 64
    iget-object p1, p1, LO3/j1;->b:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const-string p1, "com.google.app_measurement.screen_service"

    .line 70
    .line 71
    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    :goto_0
    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/X;->W(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/X;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, LO3/Y0;->a(Lcom/google/android/gms/internal/measurement/X;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/X;->W(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/X;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, LO3/Y0;->b(Lcom/google/android/gms/internal/measurement/X;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/X;->W(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/X;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, LO3/Y0;->c(Lcom/google/android/gms/internal/measurement/X;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/X;->W(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/X;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, LO3/Y0;->d(Lcom/google/android/gms/internal/measurement/X;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/X;->W(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/X;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, LO3/Y0;->e(Lcom/google/android/gms/internal/measurement/X;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method
