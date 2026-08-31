.class public final Lk6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/G;


# instance fields
.field public final q:J

.field public r:Z

.field public final s:Lq6/g;

.field public final t:Lq6/g;

.field public u:Z

.field public final synthetic v:Lk6/v;


# direct methods
.method public constructor <init>(Lk6/v;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk6/t;->v:Lk6/v;

    .line 5
    .line 6
    iput-wide p2, p0, Lk6/t;->q:J

    .line 7
    .line 8
    iput-boolean p4, p0, Lk6/t;->r:Z

    .line 9
    .line 10
    new-instance p1, Lq6/g;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lk6/t;->s:Lq6/g;

    .line 16
    .line 17
    new-instance p1, Lq6/g;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lk6/t;->t:Lq6/g;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final F(JLq6/g;)J
    .locals 14

    .line 1
    move-wide v1, p1

    .line 2
    move-object/from16 v0, p3

    .line 3
    .line 4
    const-string v3, "sink"

    .line 5
    .line 6
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    cmp-long v5, v1, v3

    .line 12
    .line 13
    if-ltz v5, :cond_9

    .line 14
    .line 15
    :goto_0
    iget-object v5, p0, Lk6/t;->v:Lk6/v;

    .line 16
    .line 17
    monitor-enter v5

    .line 18
    :try_start_0
    iget-object v6, v5, Lk6/v;->k:Lk6/u;

    .line 19
    .line 20
    invoke-virtual {v6}, Lq6/d;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 21
    .line 22
    .line 23
    :try_start_1
    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    :try_start_2
    iget v6, v5, Lk6/v;->m:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 25
    .line 26
    :try_start_3
    monitor-exit v5

    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    iget-boolean v6, p0, Lk6/t;->r:Z

    .line 30
    .line 31
    if-nez v6, :cond_0

    .line 32
    .line 33
    iget-object v6, v5, Lk6/v;->n:Ljava/io/IOException;

    .line 34
    .line 35
    if-nez v6, :cond_1

    .line 36
    .line 37
    new-instance v6, Lk6/A;

    .line 38
    .line 39
    monitor-enter v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 40
    :try_start_4
    iget v7, v5, Lk6/v;->m:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 41
    .line 42
    :try_start_5
    monitor-exit v5

    .line 43
    invoke-static {v7}, Lk1/i;->m(I)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v6, v7}, Lk6/A;-><init>(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :catchall_1
    move-exception v0

    .line 54
    :try_start_6
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 55
    :try_start_7
    throw v0

    .line 56
    :cond_0
    const/4 v6, 0x0

    .line 57
    :cond_1
    :goto_1
    iget-boolean v7, p0, Lk6/t;->u:Z

    .line 58
    .line 59
    if-nez v7, :cond_8

    .line 60
    .line 61
    iget-object v7, p0, Lk6/t;->t:Lq6/g;

    .line 62
    .line 63
    iget-wide v8, v7, Lq6/g;->r:J

    .line 64
    .line 65
    cmp-long v10, v8, v3

    .line 66
    .line 67
    const-wide/16 v11, -0x1

    .line 68
    .line 69
    const/4 v13, 0x0

    .line 70
    if-lez v10, :cond_2

    .line 71
    .line 72
    invoke-static {v1, v2, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide v8

    .line 76
    invoke-virtual {v7, v8, v9, v0}, Lq6/g;->F(JLq6/g;)J

    .line 77
    .line 78
    .line 79
    move-result-wide v7

    .line 80
    iget-wide v9, v5, Lk6/v;->c:J

    .line 81
    .line 82
    add-long/2addr v9, v7

    .line 83
    iput-wide v9, v5, Lk6/v;->c:J

    .line 84
    .line 85
    iget-wide v3, v5, Lk6/v;->d:J

    .line 86
    .line 87
    sub-long/2addr v9, v3

    .line 88
    if-nez v6, :cond_4

    .line 89
    .line 90
    iget-object v3, v5, Lk6/v;->b:Lk6/n;

    .line 91
    .line 92
    iget-object v3, v3, Lk6/n;->F:Lk6/z;

    .line 93
    .line 94
    invoke-virtual {v3}, Lk6/z;->a()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    div-int/lit8 v3, v3, 0x2

    .line 99
    .line 100
    int-to-long v3, v3

    .line 101
    cmp-long v3, v9, v3

    .line 102
    .line 103
    if-ltz v3, :cond_4

    .line 104
    .line 105
    iget-object v3, v5, Lk6/v;->b:Lk6/n;

    .line 106
    .line 107
    iget v4, v5, Lk6/v;->a:I

    .line 108
    .line 109
    invoke-virtual {v3, v4, v9, v10}, Lk6/n;->z(IJ)V

    .line 110
    .line 111
    .line 112
    iget-wide v3, v5, Lk6/v;->c:J

    .line 113
    .line 114
    iput-wide v3, v5, Lk6/v;->d:J

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_2
    iget-boolean v3, p0, Lk6/t;->r:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 118
    .line 119
    if-nez v3, :cond_3

    .line 120
    .line 121
    if-nez v6, :cond_3

    .line 122
    .line 123
    :try_start_8
    invoke-virtual {v5}, Ljava/lang/Object;->wait()V
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 124
    .line 125
    .line 126
    const/4 v13, 0x1

    .line 127
    :cond_3
    move-wide v7, v11

    .line 128
    goto :goto_2

    .line 129
    :catch_0
    :try_start_9
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 134
    .line 135
    .line 136
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 137
    .line 138
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 139
    .line 140
    .line 141
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 142
    :cond_4
    :goto_2
    :try_start_a
    iget-object v3, v5, Lk6/v;->k:Lk6/u;

    .line 143
    .line 144
    invoke-virtual {v3}, Lk6/u;->k()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 145
    .line 146
    .line 147
    monitor-exit v5

    .line 148
    if-eqz v13, :cond_5

    .line 149
    .line 150
    const-wide/16 v3, 0x0

    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :cond_5
    cmp-long v0, v7, v11

    .line 155
    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    return-wide v7

    .line 159
    :cond_6
    if-nez v6, :cond_7

    .line 160
    .line 161
    return-wide v11

    .line 162
    :cond_7
    throw v6

    .line 163
    :catchall_2
    move-exception v0

    .line 164
    goto :goto_4

    .line 165
    :cond_8
    :try_start_b
    new-instance v0, Ljava/io/IOException;

    .line 166
    .line 167
    const-string v1, "stream closed"

    .line 168
    .line 169
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 173
    :catchall_3
    move-exception v0

    .line 174
    :try_start_c
    monitor-exit v5
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 175
    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 176
    :goto_3
    :try_start_e
    iget-object v1, v5, Lk6/v;->k:Lk6/u;

    .line 177
    .line 178
    invoke-virtual {v1}, Lk6/u;->k()V

    .line 179
    .line 180
    .line 181
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 182
    :goto_4
    monitor-exit v5

    .line 183
    throw v0

    .line 184
    :cond_9
    const-string v0, "byteCount < 0: "

    .line 185
    .line 186
    invoke-static {v0, v1, v2}, LC0/S;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v1
.end method

.method public final close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lk6/t;->v:Lk6/v;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lk6/t;->u:Z

    .line 6
    .line 7
    iget-object v1, p0, Lk6/t;->t:Lq6/g;

    .line 8
    .line 9
    iget-wide v2, v1, Lq6/g;->r:J

    .line 10
    .line 11
    invoke-virtual {v1}, Lq6/g;->a()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    cmp-long v0, v2, v0

    .line 21
    .line 22
    if-lez v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lk6/t;->v:Lk6/v;

    .line 25
    .line 26
    sget-object v1, Le6/b;->a:[B

    .line 27
    .line 28
    iget-object v0, v0, Lk6/v;->b:Lk6/n;

    .line 29
    .line 30
    invoke-virtual {v0, v2, v3}, Lk6/n;->f(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lk6/t;->v:Lk6/v;

    .line 34
    .line 35
    invoke-virtual {v0}, Lk6/v;->a()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception v1

    .line 40
    monitor-exit v0

    .line 41
    throw v1
.end method

.method public final d()Lq6/I;
    .locals 1

    .line 1
    iget-object v0, p0, Lk6/t;->v:Lk6/v;

    .line 2
    .line 3
    iget-object v0, v0, Lk6/v;->k:Lk6/u;

    .line 4
    .line 5
    return-object v0
.end method
