.class public final LB0/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Z

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LB0/g0;Lc0/l;ILR/e;LR/e;Z)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0/f0;->f:Ljava/lang/Object;

    .line 25
    iput-object p2, p0, LB0/f0;->c:Ljava/lang/Object;

    .line 26
    iput p3, p0, LB0/f0;->a:I

    .line 27
    iput-object p4, p0, LB0/f0;->d:Ljava/lang/Object;

    .line 28
    iput-object p5, p0, LB0/f0;->e:Ljava/lang/Object;

    .line 29
    iput-boolean p6, p0, LB0/f0;->b:Z

    return-void
.end method

.method public constructor <init>(Lt3/a;[B)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0/f0;->f:Ljava/lang/Object;

    .line 2
    iget v0, p1, Lt3/a;->e:I

    .line 3
    iput v0, p0, LB0/f0;->a:I

    .line 4
    iget-object v0, p1, Lt3/a;->d:Ljava/lang/String;

    .line 5
    iput-object v0, p0, LB0/f0;->c:Ljava/lang/Object;

    .line 6
    iget-object v0, p1, Lt3/a;->f:Lcom/google/android/gms/internal/clearcut/p0;

    .line 7
    iput-object v0, p0, LB0/f0;->d:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/clearcut/w0;

    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, 0x0

    .line 9
    iput-wide v1, v0, Lcom/google/android/gms/internal/clearcut/w0;->q:J

    iput-wide v1, v0, Lcom/google/android/gms/internal/clearcut/w0;->r:J

    const/4 v1, 0x0

    iput v1, v0, Lcom/google/android/gms/internal/clearcut/w0;->s:I

    .line 10
    sget-object v2, Lcom/google/android/gms/internal/clearcut/x0;->q:[Lcom/google/android/gms/internal/clearcut/x0;

    if-nez v2, :cond_1

    sget-object v2, Lcom/google/android/gms/internal/clearcut/o0;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sget-object v3, Lcom/google/android/gms/internal/clearcut/x0;->q:[Lcom/google/android/gms/internal/clearcut/x0;

    if-nez v3, :cond_0

    new-array v3, v1, [Lcom/google/android/gms/internal/clearcut/x0;

    sput-object v3, Lcom/google/android/gms/internal/clearcut/x0;->q:[Lcom/google/android/gms/internal/clearcut/x0;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v2

    goto :goto_2

    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    sget-object v2, Lcom/google/android/gms/internal/clearcut/x0;->q:[Lcom/google/android/gms/internal/clearcut/x0;

    .line 11
    iput-object v2, v0, Lcom/google/android/gms/internal/clearcut/w0;->t:[Lcom/google/android/gms/internal/clearcut/x0;

    sget-object v2, Lcom/google/android/gms/internal/clearcut/l0;->f:[B

    iput-object v2, v0, Lcom/google/android/gms/internal/clearcut/w0;->u:[B

    iput-object v2, v0, Lcom/google/android/gms/internal/clearcut/w0;->v:[B

    const-string v3, ""

    iput-object v3, v0, Lcom/google/android/gms/internal/clearcut/w0;->w:Ljava/lang/String;

    const-string v3, ""

    iput-object v3, v0, Lcom/google/android/gms/internal/clearcut/w0;->x:Ljava/lang/String;

    const-string v3, ""

    iput-object v3, v0, Lcom/google/android/gms/internal/clearcut/w0;->y:Ljava/lang/String;

    const-wide/32 v3, 0x2bf20

    iput-wide v3, v0, Lcom/google/android/gms/internal/clearcut/w0;->z:J

    iput-object v2, v0, Lcom/google/android/gms/internal/clearcut/w0;->A:[B

    const-string v2, ""

    iput-object v2, v0, Lcom/google/android/gms/internal/clearcut/w0;->B:Ljava/lang/String;

    sget-object v2, Lcom/google/android/gms/internal/clearcut/l0;->e:[I

    iput-object v2, v0, Lcom/google/android/gms/internal/clearcut/w0;->C:[I

    iput-boolean v1, v0, Lcom/google/android/gms/internal/clearcut/w0;->D:Z

    .line 12
    iput-object v0, p0, LB0/f0;->e:Ljava/lang/Object;

    iput-boolean v1, p0, LB0/f0;->b:Z

    .line 13
    iget-object v1, p1, Lt3/a;->a:Landroid/content/Context;

    .line 14
    sget-boolean v2, Lcom/google/android/gms/internal/clearcut/l0;->c:Z

    const/4 v3, 0x1

    if-nez v2, :cond_5

    sget-object v2, Lcom/google/android/gms/internal/clearcut/l0;->b:Landroid/os/UserManager;

    if-nez v2, :cond_4

    const-class v4, Lcom/google/android/gms/internal/clearcut/l0;

    monitor-enter v4

    :try_start_1
    sget-object v2, Lcom/google/android/gms/internal/clearcut/l0;->b:Landroid/os/UserManager;

    if-nez v2, :cond_3

    const-class v2, Landroid/os/UserManager;

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/UserManager;

    sput-object v1, Lcom/google/android/gms/internal/clearcut/l0;->b:Landroid/os/UserManager;

    if-nez v1, :cond_2

    sput-boolean v3, Lcom/google/android/gms/internal/clearcut/l0;->c:Z

    monitor-exit v4

    move v2, v3

    goto :goto_5

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_2
    move-object v2, v1

    :cond_3
    monitor-exit v4

    goto :goto_4

    :goto_3
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    :cond_4
    :goto_4
    invoke-virtual {v2}, Landroid/os/UserManager;->isUserUnlocked()Z

    move-result v2

    sput-boolean v2, Lcom/google/android/gms/internal/clearcut/l0;->c:Z

    if-eqz v2, :cond_5

    const/4 v1, 0x0

    sput-object v1, Lcom/google/android/gms/internal/clearcut/l0;->b:Landroid/os/UserManager;

    :cond_5
    :goto_5
    xor-int/lit8 v1, v2, 0x1

    .line 15
    iput-boolean v1, v0, Lcom/google/android/gms/internal/clearcut/w0;->D:Z

    .line 16
    iget-object v1, p1, Lt3/a;->h:LB3/a;

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 19
    iput-wide v1, v0, Lcom/google/android/gms/internal/clearcut/w0;->q:J

    .line 20
    iget-object p1, p1, Lt3/a;->h:LB3/a;

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    .line 23
    iput-wide v1, v0, Lcom/google/android/gms/internal/clearcut/w0;->r:J

    iget-wide v1, v0, Lcom/google/android/gms/internal/clearcut/w0;->q:J

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Ljava/util/TimeZone;->getOffset(J)I

    move-result p1

    div-int/lit16 p1, p1, 0x3e8

    int-to-long v1, p1

    iput-wide v1, v0, Lcom/google/android/gms/internal/clearcut/w0;->z:J

    iput-object p2, v0, Lcom/google/android/gms/internal/clearcut/w0;->v:[B

    return-void
.end method


# virtual methods
.method public a(II)Z
    .locals 2

    .line 1
    iget-object v0, p0, LB0/f0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LR/e;

    .line 4
    .line 5
    iget v1, p0, LB0/f0;->a:I

    .line 6
    .line 7
    add-int/2addr p1, v1

    .line 8
    iget-object v0, v0, LR/e;->q:[Ljava/lang/Object;

    .line 9
    .line 10
    aget-object p1, v0, p1

    .line 11
    .line 12
    check-cast p1, Lc0/k;

    .line 13
    .line 14
    iget-object v0, p0, LB0/f0;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LR/e;

    .line 17
    .line 18
    add-int/2addr v1, p2

    .line 19
    iget-object p2, v0, LR/e;->q:[Ljava/lang/Object;

    .line 20
    .line 21
    aget-object p2, p2, v1

    .line 22
    .line 23
    check-cast p2, Lc0/k;

    .line 24
    .line 25
    sget-object v0, LB0/i0;->a:LB0/h0;

    .line 26
    .line 27
    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-ne p1, p2, :cond_1

    .line 43
    .line 44
    :goto_0
    const/4 p1, 0x1

    .line 45
    return p1

    .line 46
    :cond_1
    const/4 p1, 0x0

    .line 47
    return p1
.end method

.method public b()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LB0/f0;->f:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, Lt3/a;

    .line 7
    .line 8
    iget-boolean v0, v1, LB0/f0;->b:Z

    .line 9
    .line 10
    if-nez v0, :cond_1c

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    iput-boolean v3, v1, LB0/f0;->b:Z

    .line 14
    .line 15
    new-instance v4, Lt3/c;

    .line 16
    .line 17
    new-instance v5, Lcom/google/android/gms/internal/clearcut/C0;

    .line 18
    .line 19
    iget-object v6, v2, Lt3/a;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget v7, v2, Lt3/a;->c:I

    .line 22
    .line 23
    iget v8, v1, LB0/f0;->a:I

    .line 24
    .line 25
    iget-object v0, v1, LB0/f0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v9, v0

    .line 28
    check-cast v9, Ljava/lang/String;

    .line 29
    .line 30
    iget-object v0, v1, LB0/f0;->d:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v10, v0

    .line 33
    check-cast v10, Lcom/google/android/gms/internal/clearcut/p0;

    .line 34
    .line 35
    invoke-direct/range {v5 .. v10}, Lcom/google/android/gms/internal/clearcut/C0;-><init>(Ljava/lang/String;IILjava/lang/String;Lcom/google/android/gms/internal/clearcut/p0;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, v1, LB0/f0;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lcom/google/android/gms/internal/clearcut/w0;

    .line 41
    .line 42
    invoke-direct {v4, v5, v0}, Lt3/c;-><init>(Lcom/google/android/gms/internal/clearcut/C0;Lcom/google/android/gms/internal/clearcut/w0;)V

    .line 43
    .line 44
    .line 45
    iget-object v6, v2, Lt3/a;->i:Lcom/google/android/gms/internal/clearcut/B0;

    .line 46
    .line 47
    iget-object v6, v6, Lcom/google/android/gms/internal/clearcut/B0;->a:Landroid/content/Context;

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    iget v0, v0, Lcom/google/android/gms/internal/clearcut/w0;->s:I

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move v0, v7

    .line 56
    :goto_0
    sget-object v8, Lcom/google/android/gms/internal/clearcut/B0;->i:Lcom/google/android/gms/internal/clearcut/c;

    .line 57
    .line 58
    invoke-virtual {v8}, Lcom/google/android/gms/internal/clearcut/b;->a()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    check-cast v8, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    const/4 v9, 0x0

    .line 69
    iget-object v10, v5, Lcom/google/android/gms/internal/clearcut/C0;->w:Ljava/lang/String;

    .line 70
    .line 71
    iget v5, v5, Lcom/google/android/gms/internal/clearcut/C0;->s:I

    .line 72
    .line 73
    if-nez v8, :cond_10

    .line 74
    .line 75
    if-eqz v10, :cond_1

    .line 76
    .line 77
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    if-ltz v5, :cond_2

    .line 85
    .line 86
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    goto :goto_1

    .line 91
    :cond_2
    move-object v10, v9

    .line 92
    :goto_1
    if-eqz v10, :cond_18

    .line 93
    .line 94
    if-eqz v6, :cond_5

    .line 95
    .line 96
    invoke-static {v6}, Lcom/google/android/gms/internal/clearcut/B0;->c(Landroid/content/Context;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_3

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/clearcut/B0;->f:Ljava/util/HashMap;

    .line 104
    .line 105
    invoke-virtual {v0, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    check-cast v5, Lcom/google/android/gms/internal/clearcut/b;

    .line 110
    .line 111
    if-nez v5, :cond_4

    .line 112
    .line 113
    sget-object v5, Lcom/google/android/gms/internal/clearcut/B0;->d:Lcom/google/android/gms/internal/clearcut/f;

    .line 114
    .line 115
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    new-instance v8, Lcom/google/android/gms/internal/clearcut/c;

    .line 119
    .line 120
    const/4 v11, 0x1

    .line 121
    invoke-direct {v8, v5, v10, v9, v11}, Lcom/google/android/gms/internal/clearcut/c;-><init>(Lcom/google/android/gms/internal/clearcut/f;Ljava/lang/String;Ljava/lang/Object;I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v10, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-object v5, v8

    .line 128
    :cond_4
    invoke-virtual {v5}, Lcom/google/android/gms/internal/clearcut/b;->a()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Ljava/lang/String;

    .line 133
    .line 134
    move-object v5, v0

    .line 135
    goto :goto_3

    .line 136
    :cond_5
    :goto_2
    move-object v5, v9

    .line 137
    :goto_3
    if-nez v5, :cond_6

    .line 138
    .line 139
    :goto_4
    move-object v0, v9

    .line 140
    goto/16 :goto_a

    .line 141
    .line 142
    :cond_6
    const/16 v0, 0x2c

    .line 143
    .line 144
    invoke-virtual {v5, v0}, Ljava/lang/String;->indexOf(I)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-ltz v0, :cond_7

    .line 149
    .line 150
    invoke-virtual {v5, v7, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    add-int/2addr v0, v3

    .line 155
    goto :goto_5

    .line 156
    :cond_7
    const-string v8, ""

    .line 157
    .line 158
    move v0, v7

    .line 159
    :goto_5
    const/16 v10, 0x2f

    .line 160
    .line 161
    invoke-virtual {v5, v10, v0}, Ljava/lang/String;->indexOf(II)I

    .line 162
    .line 163
    .line 164
    move-result v10

    .line 165
    const-string v11, "LogSamplerImpl"

    .line 166
    .line 167
    if-gtz v10, :cond_9

    .line 168
    .line 169
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    const-string v8, "Failed to parse the rule: "

    .line 174
    .line 175
    if-eqz v0, :cond_8

    .line 176
    .line 177
    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    goto :goto_6

    .line 182
    :cond_8
    new-instance v0, Ljava/lang/String;

    .line 183
    .line 184
    invoke-direct {v0, v8}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    :goto_6
    invoke-static {v11, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_9
    :try_start_0
    invoke-virtual {v5, v0, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 196
    .line 197
    .line 198
    move-result-wide v12

    .line 199
    add-int/2addr v10, v3

    .line 200
    invoke-virtual {v5, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 205
    .line 206
    .line 207
    move-result-wide v14
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 208
    const-wide/16 v16, 0x0

    .line 209
    .line 210
    cmp-long v0, v12, v16

    .line 211
    .line 212
    if-ltz v0, :cond_e

    .line 213
    .line 214
    cmp-long v0, v14, v16

    .line 215
    .line 216
    if-gez v0, :cond_a

    .line 217
    .line 218
    goto :goto_8

    .line 219
    :cond_a
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/s0;->m()Lcom/google/android/gms/internal/clearcut/r0;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v0}, Lcom/google/android/gms/internal/clearcut/v;->b()V

    .line 224
    .line 225
    .line 226
    iget-object v5, v0, Lcom/google/android/gms/internal/clearcut/v;->r:Lcom/google/android/gms/internal/clearcut/x;

    .line 227
    .line 228
    check-cast v5, Lcom/google/android/gms/internal/clearcut/s0;

    .line 229
    .line 230
    invoke-static {v5, v8}, Lcom/google/android/gms/internal/clearcut/s0;->g(Lcom/google/android/gms/internal/clearcut/s0;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Lcom/google/android/gms/internal/clearcut/v;->b()V

    .line 234
    .line 235
    .line 236
    iget-object v5, v0, Lcom/google/android/gms/internal/clearcut/v;->r:Lcom/google/android/gms/internal/clearcut/x;

    .line 237
    .line 238
    check-cast v5, Lcom/google/android/gms/internal/clearcut/s0;

    .line 239
    .line 240
    invoke-static {v5, v12, v13}, Lcom/google/android/gms/internal/clearcut/s0;->f(Lcom/google/android/gms/internal/clearcut/s0;J)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0}, Lcom/google/android/gms/internal/clearcut/v;->b()V

    .line 244
    .line 245
    .line 246
    iget-object v5, v0, Lcom/google/android/gms/internal/clearcut/v;->r:Lcom/google/android/gms/internal/clearcut/x;

    .line 247
    .line 248
    check-cast v5, Lcom/google/android/gms/internal/clearcut/s0;

    .line 249
    .line 250
    invoke-static {v5, v14, v15}, Lcom/google/android/gms/internal/clearcut/s0;->h(Lcom/google/android/gms/internal/clearcut/s0;J)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Lcom/google/android/gms/internal/clearcut/v;->c()Lcom/google/android/gms/internal/clearcut/x;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/clearcut/x;->a(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    check-cast v5, Ljava/lang/Byte;

    .line 262
    .line 263
    invoke-virtual {v5}, Ljava/lang/Byte;->byteValue()B

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    if-ne v5, v3, :cond_b

    .line 268
    .line 269
    move v5, v3

    .line 270
    goto :goto_7

    .line 271
    :cond_b
    if-nez v5, :cond_c

    .line 272
    .line 273
    move v5, v7

    .line 274
    goto :goto_7

    .line 275
    :cond_c
    sget-object v5, Lcom/google/android/gms/internal/clearcut/V;->c:Lcom/google/android/gms/internal/clearcut/V;

    .line 276
    .line 277
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-virtual {v5, v8}, Lcom/google/android/gms/internal/clearcut/V;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/clearcut/Z;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    invoke-interface {v5, v0}, Lcom/google/android/gms/internal/clearcut/Z;->f(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    const/4 v8, 0x2

    .line 293
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/clearcut/x;->a(I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    :goto_7
    if-eqz v5, :cond_d

    .line 297
    .line 298
    check-cast v0, Lcom/google/android/gms/internal/clearcut/s0;

    .line 299
    .line 300
    goto :goto_a

    .line 301
    :cond_d
    new-instance v0, LC2/e;

    .line 302
    .line 303
    invoke-direct {v0}, LC2/e;-><init>()V

    .line 304
    .line 305
    .line 306
    throw v0

    .line 307
    :cond_e
    :goto_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    const/16 v5, 0x48

    .line 310
    .line 311
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 312
    .line 313
    .line 314
    const-string v5, "negative values not supported: "

    .line 315
    .line 316
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    const-string v5, "/"

    .line 323
    .line 324
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-static {v11, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 335
    .line 336
    .line 337
    goto/16 :goto_4

    .line 338
    .line 339
    :catch_0
    move-exception v0

    .line 340
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 341
    .line 342
    .line 343
    move-result v8

    .line 344
    const-string v10, "parseLong() failed while parsing: "

    .line 345
    .line 346
    if-eqz v8, :cond_f

    .line 347
    .line 348
    invoke-virtual {v10, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    goto :goto_9

    .line 353
    :cond_f
    new-instance v5, Ljava/lang/String;

    .line 354
    .line 355
    invoke-direct {v5, v10}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    :goto_9
    invoke-static {v11, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 359
    .line 360
    .line 361
    goto/16 :goto_4

    .line 362
    .line 363
    :goto_a
    if-eqz v0, :cond_18

    .line 364
    .line 365
    invoke-virtual {v0}, Lcom/google/android/gms/internal/clearcut/s0;->j()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    invoke-static {v6}, Lcom/google/android/gms/internal/clearcut/B0;->d(Landroid/content/Context;)J

    .line 370
    .line 371
    .line 372
    move-result-wide v10

    .line 373
    invoke-static {v5, v10, v11}, Lcom/google/android/gms/internal/clearcut/B0;->a(Ljava/lang/String;J)J

    .line 374
    .line 375
    .line 376
    move-result-wide v12

    .line 377
    invoke-virtual {v0}, Lcom/google/android/gms/internal/clearcut/s0;->k()J

    .line 378
    .line 379
    .line 380
    move-result-wide v14

    .line 381
    invoke-virtual {v0}, Lcom/google/android/gms/internal/clearcut/s0;->l()J

    .line 382
    .line 383
    .line 384
    move-result-wide v16

    .line 385
    invoke-static/range {v12 .. v17}, Lcom/google/android/gms/internal/clearcut/B0;->b(JJJ)Z

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    goto/16 :goto_e

    .line 390
    .line 391
    :cond_10
    if-eqz v10, :cond_11

    .line 392
    .line 393
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    .line 394
    .line 395
    .line 396
    move-result v8

    .line 397
    if-nez v8, :cond_11

    .line 398
    .line 399
    goto :goto_b

    .line 400
    :cond_11
    if-ltz v5, :cond_12

    .line 401
    .line 402
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v10

    .line 406
    goto :goto_b

    .line 407
    :cond_12
    move-object v10, v9

    .line 408
    :goto_b
    if-eqz v10, :cond_18

    .line 409
    .line 410
    if-nez v6, :cond_13

    .line 411
    .line 412
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 413
    .line 414
    goto :goto_d

    .line 415
    :cond_13
    sget-object v5, Lcom/google/android/gms/internal/clearcut/B0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 416
    .line 417
    invoke-virtual {v5, v10}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v8

    .line 421
    check-cast v8, Lcom/google/android/gms/internal/clearcut/b;

    .line 422
    .line 423
    if-nez v8, :cond_15

    .line 424
    .line 425
    sget-object v8, Lcom/google/android/gms/internal/clearcut/B0;->c:Lcom/google/android/gms/internal/clearcut/f;

    .line 426
    .line 427
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/t0;->f()Lcom/google/android/gms/internal/clearcut/t0;

    .line 428
    .line 429
    .line 430
    move-result-object v11

    .line 431
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    new-instance v12, Lcom/google/android/gms/internal/clearcut/d;

    .line 435
    .line 436
    invoke-direct {v12, v8, v10, v11}, Lcom/google/android/gms/internal/clearcut/d;-><init>(Lcom/google/android/gms/internal/clearcut/f;Ljava/lang/String;Lcom/google/android/gms/internal/clearcut/t0;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v5, v10, v12}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v5

    .line 443
    move-object v8, v5

    .line 444
    check-cast v8, Lcom/google/android/gms/internal/clearcut/b;

    .line 445
    .line 446
    if-eqz v8, :cond_14

    .line 447
    .line 448
    goto :goto_c

    .line 449
    :cond_14
    move-object v8, v12

    .line 450
    :cond_15
    :goto_c
    invoke-virtual {v8}, Lcom/google/android/gms/internal/clearcut/b;->a()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    check-cast v5, Lcom/google/android/gms/internal/clearcut/t0;

    .line 455
    .line 456
    invoke-virtual {v5}, Lcom/google/android/gms/internal/clearcut/t0;->e()Lcom/google/android/gms/internal/clearcut/A;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    :goto_d
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    :cond_16
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 465
    .line 466
    .line 467
    move-result v8

    .line 468
    if-eqz v8, :cond_18

    .line 469
    .line 470
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v8

    .line 474
    check-cast v8, Lcom/google/android/gms/internal/clearcut/s0;

    .line 475
    .line 476
    invoke-virtual {v8}, Lcom/google/android/gms/internal/clearcut/s0;->i()Z

    .line 477
    .line 478
    .line 479
    move-result v10

    .line 480
    if-eqz v10, :cond_17

    .line 481
    .line 482
    invoke-virtual {v8}, Lcom/google/android/gms/internal/clearcut/s0;->e()I

    .line 483
    .line 484
    .line 485
    move-result v10

    .line 486
    if-eqz v10, :cond_17

    .line 487
    .line 488
    invoke-virtual {v8}, Lcom/google/android/gms/internal/clearcut/s0;->e()I

    .line 489
    .line 490
    .line 491
    move-result v10

    .line 492
    if-ne v10, v0, :cond_16

    .line 493
    .line 494
    :cond_17
    invoke-virtual {v8}, Lcom/google/android/gms/internal/clearcut/s0;->j()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v10

    .line 498
    invoke-static {v6}, Lcom/google/android/gms/internal/clearcut/B0;->d(Landroid/content/Context;)J

    .line 499
    .line 500
    .line 501
    move-result-wide v11

    .line 502
    invoke-static {v10, v11, v12}, Lcom/google/android/gms/internal/clearcut/B0;->a(Ljava/lang/String;J)J

    .line 503
    .line 504
    .line 505
    move-result-wide v13

    .line 506
    invoke-virtual {v8}, Lcom/google/android/gms/internal/clearcut/s0;->k()J

    .line 507
    .line 508
    .line 509
    move-result-wide v15

    .line 510
    invoke-virtual {v8}, Lcom/google/android/gms/internal/clearcut/s0;->l()J

    .line 511
    .line 512
    .line 513
    move-result-wide v17

    .line 514
    invoke-static/range {v13 .. v18}, Lcom/google/android/gms/internal/clearcut/B0;->b(JJJ)Z

    .line 515
    .line 516
    .line 517
    move-result v8

    .line 518
    if-nez v8, :cond_16

    .line 519
    .line 520
    move v0, v7

    .line 521
    goto :goto_e

    .line 522
    :cond_18
    move v0, v3

    .line 523
    :goto_e
    if-eqz v0, :cond_1b

    .line 524
    .line 525
    iget-object v0, v2, Lt3/a;->g:Lcom/google/android/gms/internal/clearcut/U;

    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    new-instance v2, Lcom/google/android/gms/internal/clearcut/v0;

    .line 531
    .line 532
    iget-object v5, v0, Lu3/d;->h:Lv3/r;

    .line 533
    .line 534
    invoke-direct {v2, v4, v5}, Lcom/google/android/gms/internal/clearcut/v0;-><init>(Lt3/c;Lv3/r;)V

    .line 535
    .line 536
    .line 537
    iget-boolean v4, v2, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f:Z

    .line 538
    .line 539
    if-nez v4, :cond_1a

    .line 540
    .line 541
    sget-object v4, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g:LC0/d0;

    .line 542
    .line 543
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v4

    .line 547
    check-cast v4, Ljava/lang/Boolean;

    .line 548
    .line 549
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 550
    .line 551
    .line 552
    move-result v4

    .line 553
    if-eqz v4, :cond_19

    .line 554
    .line 555
    goto :goto_f

    .line 556
    :cond_19
    move v3, v7

    .line 557
    :cond_1a
    :goto_f
    iput-boolean v3, v2, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f:Z

    .line 558
    .line 559
    iget-object v3, v0, Lu3/d;->j:Lv3/e;

    .line 560
    .line 561
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    new-instance v4, Lv3/y;

    .line 565
    .line 566
    invoke-direct {v4, v2}, Lv3/y;-><init>(Lcom/google/android/gms/internal/clearcut/v0;)V

    .line 567
    .line 568
    .line 569
    iget-object v2, v3, Lv3/e;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 570
    .line 571
    new-instance v5, Lv3/w;

    .line 572
    .line 573
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 574
    .line 575
    .line 576
    move-result v2

    .line 577
    invoke-direct {v5, v4, v2, v0}, Lv3/w;-><init>(Lv3/B;ILu3/d;)V

    .line 578
    .line 579
    .line 580
    iget-object v0, v3, Lv3/e;->m:LI3/e;

    .line 581
    .line 582
    const/4 v2, 0x4

    .line 583
    invoke-virtual {v0, v2, v5}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 588
    .line 589
    .line 590
    return-void

    .line 591
    :cond_1b
    new-instance v0, Lv3/j;

    .line 592
    .line 593
    invoke-direct {v0, v9}, Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(Lu3/g;)V

    .line 594
    .line 595
    .line 596
    sget-object v2, Lcom/google/android/gms/common/api/Status;->u:Lcom/google/android/gms/common/api/Status;

    .line 597
    .line 598
    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->A0(Lu3/h;)V

    .line 599
    .line 600
    .line 601
    return-void

    .line 602
    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 603
    .line 604
    const-string v2, "do not reuse LogEventBuilder"

    .line 605
    .line 606
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    throw v0
.end method
