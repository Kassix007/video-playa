.class public final LO3/V0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic s:LO3/b1;


# direct methods
.method public constructor <init>(LO3/b1;Ljava/util/concurrent/atomic/AtomicReference;I)V
    .locals 0

    iput p3, p0, LO3/V0;->q:I

    packed-switch p3, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LO3/V0;->s:LO3/b1;

    return-void

    .line 3
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LO3/V0;->s:LO3/b1;

    return-void

    .line 4
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LO3/V0;->s:LO3/b1;

    return-void

    .line 5
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LO3/V0;->s:LO3/b1;

    return-void

    .line 6
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LO3/V0;->s:LO3/b1;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(LO3/b1;Ljava/util/concurrent/atomic/AtomicReference;IZ)V
    .locals 0

    .line 1
    iput p3, p0, LO3/V0;->q:I

    iput-object p1, p0, LO3/V0;->s:LO3/b1;

    iput-object p2, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 4

    .line 1
    iget-object v0, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LO3/V0;->s:LO3/b1;

    .line 5
    .line 6
    iget-object v1, v1, LO3/D0;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, LO3/t0;

    .line 9
    .line 10
    iget-object v2, v1, LO3/t0;->t:LO3/g;

    .line 11
    .line 12
    invoke-virtual {v1}, LO3/t0;->q()LO3/N;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, LO3/N;->u()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v3, LO3/F;->e0:LO3/E;

    .line 21
    .line 22
    invoke-virtual {v2, v1, v3}, LO3/g;->x(Ljava/lang/String;LO3/E;)D

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    .line 32
    .line 33
    :try_start_1
    iget-object v1, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 36
    .line 37
    .line 38
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    goto :goto_0

    .line 42
    :catchall_1
    move-exception v1

    .line 43
    iget-object v2, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 46
    .line 47
    .line 48
    throw v1

    .line 49
    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, LO3/V0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/V0;->s:LO3/b1;

    .line 7
    .line 8
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LO3/t0;

    .line 11
    .line 12
    invoke-virtual {v0}, LO3/t0;->o()LO3/w1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, LO3/i1;->u:LO3/i1;

    .line 17
    .line 18
    filled-new-array {v1}, [LO3/i1;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, LO3/M1;->W([LO3/i1;)LO3/M1;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    invoke-virtual {v0}, LO3/C;->o()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, LO3/H;->p()V

    .line 32
    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-virtual {v0, v3}, LO3/w1;->E(Z)LO3/a2;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    new-instance v4, LO3/B0;

    .line 40
    .line 41
    invoke-direct {v4, v0, v2, v3, v1}, LO3/B0;-><init>(LO3/w1;Ljava/util/concurrent/atomic/AtomicReference;LO3/a2;LO3/M1;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v4}, LO3/w1;->C(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_0
    iget-object v0, p0, LO3/V0;->s:LO3/b1;

    .line 49
    .line 50
    iget-object v1, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, LO3/t0;

    .line 53
    .line 54
    iget-object v1, v1, LO3/t0;->u:LO3/h0;

    .line 55
    .line 56
    invoke-static {v1}, LO3/t0;->j(LO3/D0;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, v1, LO3/h0;->E:LE/c0;

    .line 60
    .line 61
    invoke-virtual {v1}, LE/c0;->B()Landroid/os/Bundle;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, LO3/t0;

    .line 68
    .line 69
    invoke-virtual {v0}, LO3/t0;->o()LO3/w1;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    iget-object v4, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 74
    .line 75
    invoke-virtual {v3}, LO3/C;->o()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, LO3/H;->p()V

    .line 79
    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    invoke-virtual {v3, v0}, LO3/w1;->E(Z)LO3/a2;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    new-instance v2, LO3/B0;

    .line 87
    .line 88
    const/4 v7, 0x6

    .line 89
    invoke-direct/range {v2 .. v7}, LO3/B0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v2}, LO3/w1;->C(Ljava/lang/Runnable;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_1
    invoke-direct {p0}, LO3/V0;->a()V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_2
    iget-object v1, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 101
    .line 102
    monitor-enter v1

    .line 103
    :try_start_0
    iget-object v0, p0, LO3/V0;->s:LO3/b1;

    .line 104
    .line 105
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, LO3/t0;

    .line 108
    .line 109
    iget-object v2, v0, LO3/t0;->t:LO3/g;

    .line 110
    .line 111
    invoke-virtual {v0}, LO3/t0;->q()LO3/N;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, LO3/N;->u()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sget-object v3, LO3/F;->d0:LO3/E;

    .line 120
    .line 121
    invoke-virtual {v2, v0, v3}, LO3/g;->w(Ljava/lang/String;LO3/E;)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 130
    .line 131
    .line 132
    :try_start_1
    iget-object v0, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 135
    .line 136
    .line 137
    monitor-exit v1

    .line 138
    return-void

    .line 139
    :catchall_0
    move-exception v0

    .line 140
    goto :goto_0

    .line 141
    :catchall_1
    move-exception v0

    .line 142
    iget-object v2, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 145
    .line 146
    .line 147
    throw v0

    .line 148
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    throw v0

    .line 150
    :pswitch_3
    iget-object v1, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 151
    .line 152
    monitor-enter v1

    .line 153
    :try_start_2
    iget-object v0, p0, LO3/V0;->s:LO3/b1;

    .line 154
    .line 155
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, LO3/t0;

    .line 158
    .line 159
    iget-object v2, v0, LO3/t0;->t:LO3/g;

    .line 160
    .line 161
    invoke-virtual {v0}, LO3/t0;->q()LO3/N;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v0}, LO3/N;->u()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    sget-object v3, LO3/F;->c0:LO3/E;

    .line 170
    .line 171
    invoke-virtual {v2, v0, v3}, LO3/g;->v(Ljava/lang/String;LO3/E;)J

    .line 172
    .line 173
    .line 174
    move-result-wide v2

    .line 175
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 180
    .line 181
    .line 182
    :try_start_3
    iget-object v0, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 185
    .line 186
    .line 187
    monitor-exit v1

    .line 188
    return-void

    .line 189
    :catchall_2
    move-exception v0

    .line 190
    goto :goto_1

    .line 191
    :catchall_3
    move-exception v0

    .line 192
    iget-object v2, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 193
    .line 194
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 195
    .line 196
    .line 197
    throw v0

    .line 198
    :goto_1
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 199
    throw v0

    .line 200
    :pswitch_4
    iget-object v1, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 201
    .line 202
    monitor-enter v1

    .line 203
    :try_start_4
    iget-object v0, p0, LO3/V0;->s:LO3/b1;

    .line 204
    .line 205
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, LO3/t0;

    .line 208
    .line 209
    iget-object v2, v0, LO3/t0;->t:LO3/g;

    .line 210
    .line 211
    invoke-virtual {v0}, LO3/t0;->q()LO3/N;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v0}, LO3/N;->u()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    sget-object v3, LO3/F;->b0:LO3/E;

    .line 220
    .line 221
    invoke-virtual {v2, v0, v3}, LO3/g;->u(Ljava/lang/String;LO3/E;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 226
    .line 227
    .line 228
    :try_start_5
    iget-object v0, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 231
    .line 232
    .line 233
    monitor-exit v1

    .line 234
    return-void

    .line 235
    :catchall_4
    move-exception v0

    .line 236
    goto :goto_2

    .line 237
    :catchall_5
    move-exception v0

    .line 238
    iget-object v2, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 239
    .line 240
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 241
    .line 242
    .line 243
    throw v0

    .line 244
    :goto_2
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 245
    throw v0

    .line 246
    :pswitch_5
    iget-object v1, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 247
    .line 248
    monitor-enter v1

    .line 249
    :try_start_6
    iget-object v0, p0, LO3/V0;->s:LO3/b1;

    .line 250
    .line 251
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, LO3/t0;

    .line 254
    .line 255
    iget-object v2, v0, LO3/t0;->t:LO3/g;

    .line 256
    .line 257
    invoke-virtual {v0}, LO3/t0;->q()LO3/N;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v0}, LO3/N;->u()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    sget-object v3, LO3/F;->a0:LO3/E;

    .line 266
    .line 267
    invoke-virtual {v2, v0, v3}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 276
    .line 277
    .line 278
    :try_start_7
    iget-object v0, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 281
    .line 282
    .line 283
    monitor-exit v1

    .line 284
    return-void

    .line 285
    :catchall_6
    move-exception v0

    .line 286
    goto :goto_3

    .line 287
    :catchall_7
    move-exception v0

    .line 288
    iget-object v2, p0, LO3/V0;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 289
    .line 290
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 291
    .line 292
    .line 293
    throw v0

    .line 294
    :goto_3
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 295
    throw v0

    .line 296
    nop

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
