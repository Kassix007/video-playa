.class public final LY4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/web2native/MainActivity;

.field public final b:Ly4/b;

.field public final c:LR4/Z0;

.field public final d:LY4/c;

.field public final e:Lorg/json/JSONObject;

.field public f:Z

.field public final g:Ly4/e;

.field public final h:Lk3/c;

.field public i:Z

.field public j:Ly4/m;


# direct methods
.method public constructor <init>(Lcom/web2native/MainActivity;Le/g;LR4/Z0;)V
    .locals 4

    .line 1
    const-string v0, "flexible"

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LY4/d;->a:Lcom/web2native/MainActivity;

    .line 7
    .line 8
    iput-object p2, p0, LY4/d;->b:Ly4/b;

    .line 9
    .line 10
    iput-object p3, p0, LY4/d;->c:LR4/Z0;

    .line 11
    .line 12
    new-instance p2, LY4/c;

    .line 13
    .line 14
    invoke-direct {p2, p0}, LY4/c;-><init>(LY4/d;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, LY4/d;->d:LY4/c;

    .line 18
    .line 19
    new-instance p3, Lorg/json/JSONObject;

    .line 20
    .line 21
    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p3, p0, LY4/d;->e:Lorg/json/JSONObject;

    .line 25
    .line 26
    const-class p3, Ly4/b;

    .line 27
    .line 28
    monitor-enter p3

    .line 29
    :try_start_0
    sget-object v1, Ly4/b;->a:Li1/a;

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    new-instance v1, LC3/b;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v2, p1

    .line 43
    :goto_0
    invoke-direct {v1, v2}, LC3/b;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    new-instance v2, Li1/a;

    .line 47
    .line 48
    invoke-direct {v2, v1}, Li1/a;-><init>(LC3/b;)V

    .line 49
    .line 50
    .line 51
    sput-object v2, Ly4/b;->a:Li1/a;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    :cond_1
    :goto_1
    sget-object v1, Ly4/b;->a:Li1/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    monitor-exit p3

    .line 60
    iget-object p3, v1, Li1/a;->r:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p3, Lz4/c;

    .line 63
    .line 64
    invoke-interface {p3}, Lz4/c;->zza()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    move-object v1, p3

    .line 69
    check-cast v1, Ly4/e;

    .line 70
    .line 71
    const-string p3, "create(...)"

    .line 72
    .line 73
    invoke-static {v1, p3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iput-object v1, p0, LY4/d;->g:Ly4/e;

    .line 77
    .line 78
    new-instance p3, Lk3/c;

    .line 79
    .line 80
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-virtual {p1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const-string v2, "getSharedPreferences(...)"

    .line 93
    .line 94
    invoke-static {p1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iput-object p1, p3, Lk3/c;->q:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object p3, p0, LY4/d;->h:Lk3/c;

    .line 100
    .line 101
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 102
    .line 103
    invoke-virtual {v0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    const-string p3, "toLowerCase(...)"

    .line 108
    .line 109
    invoke-static {p1, p3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const-string p3, "immediate"

    .line 113
    .line 114
    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_2

    .line 119
    .line 120
    const/4 p1, 0x1

    .line 121
    invoke-static {p1}, Ly4/m;->a(I)Ly4/l;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p1}, Ly4/l;->a()Ly4/m;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    goto :goto_2

    .line 130
    :cond_2
    invoke-static {v3}, Ly4/m;->a(I)Ly4/l;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1}, Ly4/l;->a()Ly4/m;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    :goto_2
    iput-object p1, p0, LY4/d;->j:Ly4/m;

    .line 139
    .line 140
    invoke-virtual {v1}, Ly4/e;->b()LS3/k;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    new-instance p3, LY4/b;

    .line 145
    .line 146
    const/4 v0, 0x1

    .line 147
    invoke-direct {p3, p0, v0}, LY4/b;-><init>(LY4/d;I)V

    .line 148
    .line 149
    .line 150
    new-instance v0, LR4/L0;

    .line 151
    .line 152
    const/4 v2, 0x5

    .line 153
    invoke-direct {v0, v2, p3}, LR4/L0;-><init>(ILjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    sget-object p3, LS3/f;->a:LO3/Q0;

    .line 160
    .line 161
    invoke-virtual {p1, p3, v0}, LS3/k;->a(Ljava/util/concurrent/Executor;LS3/c;)LS3/k;

    .line 162
    .line 163
    .line 164
    monitor-enter v1

    .line 165
    :try_start_1
    iget-object p1, v1, Ly4/e;->b:Ly4/c;

    .line 166
    .line 167
    monitor-enter p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 168
    :try_start_2
    iget-object p3, p1, Ly4/c;->a:LE1/t;

    .line 169
    .line 170
    const-string v0, "registerListener"

    .line 171
    .line 172
    new-array v2, v3, [Ljava/lang/Object;

    .line 173
    .line 174
    invoke-virtual {p3, v0, v2}, LE1/t;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    iget-object p3, p1, Ly4/c;->d:Ljava/util/HashSet;

    .line 178
    .line 179
    invoke-virtual {p3, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Ly4/c;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 183
    .line 184
    .line 185
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 186
    monitor-exit v1

    .line 187
    return-void

    .line 188
    :catchall_1
    move-exception p2

    .line 189
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 190
    :try_start_5
    throw p2

    .line 191
    :catchall_2
    move-exception p1

    .line 192
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 193
    throw p1

    .line 194
    :goto_3
    :try_start_6
    monitor-exit p3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 195
    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    new-instance v0, LU/l;

    .line 2
    .line 3
    iget-object v1, p0, LY4/d;->a:Lcom/web2native/MainActivity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LU/l;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LU/l;->r:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lh/b;

    .line 11
    .line 12
    const-string v2, "An update has just been downloaded."

    .line 13
    .line 14
    iput-object v2, v1, Lh/b;->f:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v2, LY4/a;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v2, p0, v3}, LY4/a;-><init>(LY4/d;I)V

    .line 20
    .line 21
    .line 22
    const-string v3, "RESTART"

    .line 23
    .line 24
    iput-object v3, v1, Lh/b;->g:Ljava/lang/String;

    .line 25
    .line 26
    iput-object v2, v1, Lh/b;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 27
    .line 28
    new-instance v2, LY4/a;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-direct {v2, p0, v3}, LY4/a;-><init>(LY4/d;I)V

    .line 32
    .line 33
    .line 34
    const-string v3, "LATER"

    .line 35
    .line 36
    iput-object v3, v1, Lh/b;->i:Ljava/lang/String;

    .line 37
    .line 38
    iput-object v2, v1, Lh/b;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    iput-boolean v2, v1, Lh/b;->m:Z

    .line 42
    .line 43
    invoke-virtual {v0}, LU/l;->f()Lh/f;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final b(Ly4/a;Ly4/m;)V
    .locals 3

    .line 1
    iget-object v0, p0, LY4/d;->b:Ly4/b;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, LY4/d;->g:Ly4/e;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ly4/a;->a(Ly4/m;)Landroid/app/PendingIntent;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget-boolean v1, p1, Ly4/a;->f:Z

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x1

    .line 26
    iput-boolean v1, p1, Ly4/a;->f:Z

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Ly4/a;->a(Ly4/m;)Landroid/app/PendingIntent;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string p2, "intentSender"

    .line 37
    .line 38
    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance p2, Le/h;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-direct {p2, p1, v1, v2, v2}, Le/h;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p2}, Ly4/b;->u(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    return-void
.end method
