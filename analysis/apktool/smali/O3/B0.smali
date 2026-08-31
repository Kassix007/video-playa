.class public final synthetic LO3/B0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LO3/C0;Landroid/os/Bundle;Ljava/lang/String;LO3/a2;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LO3/B0;->q:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO3/B0;->s:Ljava/lang/Object;

    iput-object p2, p0, LO3/B0;->t:Ljava/lang/Object;

    iput-object p3, p0, LO3/B0;->r:Ljava/lang/Object;

    iput-object p4, p0, LO3/B0;->u:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LO3/b1;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LO3/B0;->q:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/B0;->s:Ljava/lang/Object;

    iput-object p3, p0, LO3/B0;->r:Ljava/lang/Object;

    iput-object p4, p0, LO3/B0;->t:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LO3/B0;->u:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(LO3/w1;Ljava/util/concurrent/atomic/AtomicReference;LO3/a2;LO3/M1;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, LO3/B0;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO3/B0;->s:Ljava/lang/Object;

    iput-object p2, p0, LO3/B0;->r:Ljava/lang/Object;

    iput-object p3, p0, LO3/B0;->u:Ljava/lang/Object;

    iput-object p4, p0, LO3/B0;->t:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/L;LO3/v;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LO3/B0;->q:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/B0;->s:Ljava/lang/Object;

    iput-object p3, p0, LO3/B0;->t:Ljava/lang/Object;

    iput-object p4, p0, LO3/B0;->r:Ljava/lang/Object;

    iput-object p1, p0, LO3/B0;->u:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p5, p0, LO3/B0;->q:I

    iput-object p1, p0, LO3/B0;->s:Ljava/lang/Object;

    iput-object p2, p0, LO3/B0;->r:Ljava/lang/Object;

    iput-object p3, p0, LO3/B0;->t:Ljava/lang/Object;

    iput-object p4, p0, LO3/B0;->u:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 4
    iput p5, p0, LO3/B0;->q:I

    iput-object p2, p0, LO3/B0;->s:Ljava/lang/Object;

    iput-object p3, p0, LO3/B0;->r:Ljava/lang/Object;

    iput-object p4, p0, LO3/B0;->t:Ljava/lang/Object;

    iput-object p1, p0, LO3/B0;->u:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lk3/d;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, LO3/B0;->q:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/B0;->r:Ljava/lang/Object;

    iput-object p3, p0, LO3/B0;->s:Ljava/lang/Object;

    iput-object p4, p0, LO3/B0;->t:Ljava/lang/Object;

    iput-object p1, p0, LO3/B0;->u:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LO3/B0;->q:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, LO3/B0;->s:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/view/View;

    .line 11
    .line 12
    iget-object v2, v1, LO3/B0;->r:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lw1/Z;

    .line 15
    .line 16
    iget-object v3, v1, LO3/B0;->t:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lv3/l;

    .line 19
    .line 20
    invoke-static {v0, v2, v3}, Lw1/U;->h(Landroid/view/View;Lw1/Z;Lv3/l;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v1, LO3/B0;->u:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroid/animation/ValueAnimator;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_0
    iget-object v0, v1, LO3/B0;->u:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Li1/a;

    .line 34
    .line 35
    iget-object v0, v0, Li1/a;->r:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ll/f;

    .line 38
    .line 39
    iget-object v2, v1, LO3/B0;->r:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Ll/n;

    .line 42
    .line 43
    iget-object v3, v1, LO3/B0;->s:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, Ll/e;

    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    iput-boolean v4, v0, Ll/f;->P:Z

    .line 51
    .line 52
    iget-object v3, v3, Ll/e;->b:Ll/l;

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    invoke-virtual {v3, v4}, Ll/l;->c(Z)V

    .line 56
    .line 57
    .line 58
    iput-boolean v4, v0, Ll/f;->P:Z

    .line 59
    .line 60
    :cond_0
    invoke-virtual {v2}, Ll/n;->isEnabled()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {v2}, Ll/n;->hasSubMenu()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    iget-object v0, v1, LO3/B0;->t:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Ll/l;

    .line 75
    .line 76
    const/4 v3, 0x4

    .line 77
    const/4 v4, 0x0

    .line 78
    invoke-virtual {v0, v2, v4, v3}, Ll/l;->q(Landroid/view/MenuItem;Ll/x;I)Z

    .line 79
    .line 80
    .line 81
    :cond_1
    return-void

    .line 82
    :pswitch_1
    iget-object v0, v1, LO3/B0;->u:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lk3/d;

    .line 85
    .line 86
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, LO3/T1;

    .line 89
    .line 90
    invoke-virtual {v0}, LO3/T1;->j0()LO3/Y1;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v0}, LO3/T1;->e()LB3/a;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 102
    .line 103
    .line 104
    move-result-wide v6

    .line 105
    iget-object v3, v1, LO3/B0;->r:Ljava/lang/Object;

    .line 106
    .line 107
    move-object v9, v3

    .line 108
    check-cast v9, Ljava/lang/String;

    .line 109
    .line 110
    iget-object v3, v1, LO3/B0;->s:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v3, Ljava/lang/String;

    .line 113
    .line 114
    iget-object v4, v1, LO3/B0;->t:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v4, Landroid/os/Bundle;

    .line 117
    .line 118
    const-string v5, "auto"

    .line 119
    .line 120
    const/4 v8, 0x0

    .line 121
    invoke-virtual/range {v2 .. v8}, LO3/Y1;->Q(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)LO3/v;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-static {v2}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v2, v9}, LO3/T1;->h(LO3/v;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :pswitch_2
    iget-object v0, v1, LO3/B0;->s:Ljava/lang/Object;

    .line 133
    .line 134
    move-object v2, v0

    .line 135
    check-cast v2, LO3/w1;

    .line 136
    .line 137
    iget-object v0, v1, LO3/B0;->r:Ljava/lang/Object;

    .line 138
    .line 139
    move-object v3, v0

    .line 140
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 141
    .line 142
    iget-object v0, v1, LO3/B0;->u:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, LO3/a2;

    .line 145
    .line 146
    iget-object v4, v1, LO3/B0;->t:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v4, LO3/M1;

    .line 149
    .line 150
    monitor-enter v3

    .line 151
    :try_start_0
    iget-object v5, v2, LO3/w1;->u:LO3/I;

    .line 152
    .line 153
    if-nez v5, :cond_2

    .line 154
    .line 155
    iget-object v0, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, LO3/t0;

    .line 158
    .line 159
    iget-object v0, v0, LO3/t0;->v:LO3/X;

    .line 160
    .line 161
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 162
    .line 163
    .line 164
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 165
    .line 166
    const-string v4, "[sgtm] Failed to get upload batches; not connected to service"

    .line 167
    .line 168
    invoke-virtual {v0, v4}, LO3/V;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    .line 170
    .line 171
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    goto :goto_2

    .line 173
    :catchall_0
    move-exception v0

    .line 174
    goto :goto_3

    .line 175
    :catch_0
    move-exception v0

    .line 176
    goto :goto_0

    .line 177
    :cond_2
    :try_start_2
    new-instance v6, LO3/p1;

    .line 178
    .line 179
    invoke-direct {v6, v2, v3}, LO3/p1;-><init>(LO3/w1;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v5, v0, v4, v6}, LO3/I;->D(LO3/a2;LO3/M1;LO3/M;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, LO3/w1;->B()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :goto_0
    :try_start_3
    iget-object v2, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v2, LO3/t0;

    .line 192
    .line 193
    iget-object v2, v2, LO3/t0;->v:LO3/X;

    .line 194
    .line 195
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 196
    .line 197
    .line 198
    iget-object v2, v2, LO3/X;->w:LO3/V;

    .line 199
    .line 200
    const-string v4, "[sgtm] Failed to get upload batches; remote exception"

    .line 201
    .line 202
    invoke-virtual {v2, v0, v4}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    .line 206
    .line 207
    .line 208
    :goto_1
    monitor-exit v3

    .line 209
    :goto_2
    return-void

    .line 210
    :goto_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 211
    throw v0

    .line 212
    :pswitch_3
    iget-object v0, v1, LO3/B0;->s:Ljava/lang/Object;

    .line 213
    .line 214
    move-object v2, v0

    .line 215
    check-cast v2, LO3/w1;

    .line 216
    .line 217
    iget-object v0, v1, LO3/B0;->r:Ljava/lang/Object;

    .line 218
    .line 219
    move-object v3, v0

    .line 220
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 221
    .line 222
    iget-object v0, v1, LO3/B0;->t:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, LO3/a2;

    .line 225
    .line 226
    iget-object v4, v1, LO3/B0;->u:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v4, Landroid/os/Bundle;

    .line 229
    .line 230
    monitor-enter v3

    .line 231
    :try_start_4
    iget-object v5, v2, LO3/w1;->u:LO3/I;

    .line 232
    .line 233
    if-nez v5, :cond_3

    .line 234
    .line 235
    iget-object v0, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v0, LO3/t0;

    .line 238
    .line 239
    iget-object v0, v0, LO3/t0;->v:LO3/X;

    .line 240
    .line 241
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 242
    .line 243
    .line 244
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 245
    .line 246
    const-string v4, "Failed to request trigger URIs; not connected to service"

    .line 247
    .line 248
    invoke-virtual {v0, v4}, LO3/V;->b(Ljava/lang/String;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 249
    .line 250
    .line 251
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 252
    goto :goto_6

    .line 253
    :catchall_1
    move-exception v0

    .line 254
    goto :goto_7

    .line 255
    :catch_1
    move-exception v0

    .line 256
    goto :goto_4

    .line 257
    :cond_3
    :try_start_6
    new-instance v6, LO3/o1;

    .line 258
    .line 259
    invoke-direct {v6, v2, v3}, LO3/o1;-><init>(LO3/w1;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 260
    .line 261
    .line 262
    invoke-interface {v5, v0, v4, v6}, LO3/I;->y(LO3/a2;Landroid/os/Bundle;LO3/K;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2}, LO3/w1;->B()V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 266
    .line 267
    .line 268
    goto :goto_5

    .line 269
    :goto_4
    :try_start_7
    iget-object v2, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v2, LO3/t0;

    .line 272
    .line 273
    iget-object v2, v2, LO3/t0;->v:LO3/X;

    .line 274
    .line 275
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 276
    .line 277
    .line 278
    iget-object v2, v2, LO3/X;->w:LO3/V;

    .line 279
    .line 280
    const-string v4, "Failed to request trigger URIs; remote exception"

    .line 281
    .line 282
    invoke-virtual {v2, v0, v4}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    .line 286
    .line 287
    .line 288
    :goto_5
    monitor-exit v3

    .line 289
    :goto_6
    return-void

    .line 290
    :goto_7
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 291
    throw v0

    .line 292
    :pswitch_4
    iget-object v0, v1, LO3/B0;->t:Ljava/lang/Object;

    .line 293
    .line 294
    move-object v2, v0

    .line 295
    check-cast v2, Lcom/google/android/gms/internal/measurement/L;

    .line 296
    .line 297
    iget-object v0, v1, LO3/B0;->u:Ljava/lang/Object;

    .line 298
    .line 299
    move-object v3, v0

    .line 300
    check-cast v3, LO3/w1;

    .line 301
    .line 302
    const/4 v4, 0x0

    .line 303
    :try_start_8
    iget-object v0, v3, LO3/w1;->u:LO3/I;

    .line 304
    .line 305
    if-nez v0, :cond_4

    .line 306
    .line 307
    iget-object v0, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v0, LO3/t0;

    .line 310
    .line 311
    iget-object v5, v0, LO3/t0;->v:LO3/X;

    .line 312
    .line 313
    invoke-static {v5}, LO3/t0;->l(LO3/E0;)V

    .line 314
    .line 315
    .line 316
    iget-object v5, v5, LO3/X;->w:LO3/V;

    .line 317
    .line 318
    const-string v6, "Discarding data. Failed to send event to service to bundle"

    .line 319
    .line 320
    invoke-virtual {v5, v6}, LO3/V;->b(Ljava/lang/String;)V
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 321
    .line 322
    .line 323
    iget-object v0, v0, LO3/t0;->y:LO3/Y1;

    .line 324
    .line 325
    invoke-static {v0}, LO3/t0;->j(LO3/D0;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0, v2, v4}, LO3/Y1;->Z(Lcom/google/android/gms/internal/measurement/L;[B)V

    .line 329
    .line 330
    .line 331
    goto :goto_9

    .line 332
    :cond_4
    :try_start_9
    iget-object v5, v1, LO3/B0;->s:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v5, LO3/v;

    .line 335
    .line 336
    iget-object v6, v1, LO3/B0;->r:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v6, Ljava/lang/String;

    .line 339
    .line 340
    invoke-interface {v0, v5, v6}, LO3/I;->m(LO3/v;Ljava/lang/String;)[B

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    invoke-virtual {v3}, LO3/w1;->B()V
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 345
    .line 346
    .line 347
    goto :goto_8

    .line 348
    :catchall_2
    move-exception v0

    .line 349
    goto :goto_a

    .line 350
    :catch_2
    move-exception v0

    .line 351
    :try_start_a
    iget-object v5, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v5, LO3/t0;

    .line 354
    .line 355
    iget-object v5, v5, LO3/t0;->v:LO3/X;

    .line 356
    .line 357
    invoke-static {v5}, LO3/t0;->l(LO3/E0;)V

    .line 358
    .line 359
    .line 360
    iget-object v5, v5, LO3/X;->w:LO3/V;

    .line 361
    .line 362
    const-string v6, "Failed to send event to the service to bundle"

    .line 363
    .line 364
    invoke-virtual {v5, v0, v6}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 365
    .line 366
    .line 367
    :goto_8
    iget-object v0, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v0, LO3/t0;

    .line 370
    .line 371
    iget-object v0, v0, LO3/t0;->y:LO3/Y1;

    .line 372
    .line 373
    invoke-static {v0}, LO3/t0;->j(LO3/D0;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0, v2, v4}, LO3/Y1;->Z(Lcom/google/android/gms/internal/measurement/L;[B)V

    .line 377
    .line 378
    .line 379
    :goto_9
    return-void

    .line 380
    :goto_a
    iget-object v3, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v3, LO3/t0;

    .line 383
    .line 384
    iget-object v3, v3, LO3/t0;->y:LO3/Y1;

    .line 385
    .line 386
    invoke-static {v3}, LO3/t0;->j(LO3/D0;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v3, v2, v4}, LO3/Y1;->Z(Lcom/google/android/gms/internal/measurement/L;[B)V

    .line 390
    .line 391
    .line 392
    throw v0

    .line 393
    :pswitch_5
    iget-object v0, v1, LO3/B0;->u:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 396
    .line 397
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c:LO3/t0;

    .line 398
    .line 399
    invoke-virtual {v0}, LO3/t0;->o()LO3/w1;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    iget-object v0, v1, LO3/B0;->s:Ljava/lang/Object;

    .line 404
    .line 405
    move-object v7, v0

    .line 406
    check-cast v7, Lcom/google/android/gms/internal/measurement/L;

    .line 407
    .line 408
    iget-object v0, v1, LO3/B0;->r:Ljava/lang/Object;

    .line 409
    .line 410
    move-object v4, v0

    .line 411
    check-cast v4, Ljava/lang/String;

    .line 412
    .line 413
    iget-object v0, v1, LO3/B0;->t:Ljava/lang/Object;

    .line 414
    .line 415
    move-object v5, v0

    .line 416
    check-cast v5, Ljava/lang/String;

    .line 417
    .line 418
    invoke-virtual {v3}, LO3/C;->o()V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v3}, LO3/H;->p()V

    .line 422
    .line 423
    .line 424
    const/4 v0, 0x0

    .line 425
    invoke-virtual {v3, v0}, LO3/w1;->E(Z)LO3/a2;

    .line 426
    .line 427
    .line 428
    move-result-object v6

    .line 429
    new-instance v2, LO3/A0;

    .line 430
    .line 431
    invoke-direct/range {v2 .. v7}, LO3/A0;-><init>(LO3/w1;Ljava/lang/String;Ljava/lang/String;LO3/a2;Lcom/google/android/gms/internal/measurement/L;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v3, v2}, LO3/w1;->C(Ljava/lang/Runnable;)V

    .line 435
    .line 436
    .line 437
    return-void

    .line 438
    :pswitch_6
    iget-object v0, v1, LO3/B0;->r:Ljava/lang/Object;

    .line 439
    .line 440
    move-object v5, v0

    .line 441
    check-cast v5, Ljava/lang/String;

    .line 442
    .line 443
    iget-object v0, v1, LO3/B0;->t:Ljava/lang/Object;

    .line 444
    .line 445
    move-object v6, v0

    .line 446
    check-cast v6, Ljava/lang/String;

    .line 447
    .line 448
    iget-object v0, v1, LO3/B0;->u:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v0, LO3/b1;

    .line 451
    .line 452
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v0, LO3/t0;

    .line 455
    .line 456
    invoke-virtual {v0}, LO3/t0;->o()LO3/w1;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    iget-object v0, v1, LO3/B0;->s:Ljava/lang/Object;

    .line 461
    .line 462
    move-object v4, v0

    .line 463
    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 464
    .line 465
    invoke-virtual {v3}, LO3/C;->o()V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v3}, LO3/H;->p()V

    .line 469
    .line 470
    .line 471
    const/4 v0, 0x0

    .line 472
    invoke-virtual {v3, v0}, LO3/w1;->E(Z)LO3/a2;

    .line 473
    .line 474
    .line 475
    move-result-object v7

    .line 476
    new-instance v2, LO3/A0;

    .line 477
    .line 478
    invoke-direct/range {v2 .. v7}, LO3/A0;-><init>(LO3/w1;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;LO3/a2;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v3, v2}, LO3/w1;->C(Ljava/lang/Runnable;)V

    .line 482
    .line 483
    .line 484
    return-void

    .line 485
    :pswitch_7
    iget-object v0, v1, LO3/B0;->s:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v0, LO3/C0;

    .line 488
    .line 489
    iget-object v2, v1, LO3/B0;->t:Ljava/lang/Object;

    .line 490
    .line 491
    move-object v12, v2

    .line 492
    check-cast v12, Landroid/os/Bundle;

    .line 493
    .line 494
    iget-object v2, v1, LO3/B0;->r:Ljava/lang/Object;

    .line 495
    .line 496
    move-object v6, v2

    .line 497
    check-cast v6, Ljava/lang/String;

    .line 498
    .line 499
    iget-object v2, v1, LO3/B0;->u:Ljava/lang/Object;

    .line 500
    .line 501
    check-cast v2, LO3/a2;

    .line 502
    .line 503
    iget-object v13, v0, LO3/C0;->c:LO3/T1;

    .line 504
    .line 505
    invoke-virtual {v13}, LO3/T1;->d0()LO3/g;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    sget-object v3, LO3/F;->V0:LO3/E;

    .line 510
    .line 511
    const/4 v14, 0x0

    .line 512
    invoke-virtual {v0, v14, v3}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    invoke-virtual {v12}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 517
    .line 518
    .line 519
    move-result v3

    .line 520
    if-eqz v3, :cond_5

    .line 521
    .line 522
    if-eqz v0, :cond_5

    .line 523
    .line 524
    iget-object v2, v13, LO3/T1;->s:LO3/n;

    .line 525
    .line 526
    invoke-static {v2}, LO3/T1;->S(LO3/O1;)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v2}, LO3/D0;->o()V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v2}, LO3/O1;->p()V

    .line 533
    .line 534
    .line 535
    :try_start_b
    invoke-virtual {v2}, LO3/n;->f0()Landroid/database/sqlite/SQLiteDatabase;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    const-string v3, "delete from default_event_params where app_id=?"

    .line 540
    .line 541
    filled-new-array {v6}, [Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    invoke-virtual {v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_3

    .line 546
    .line 547
    .line 548
    goto/16 :goto_c

    .line 549
    .line 550
    :catch_3
    move-exception v0

    .line 551
    iget-object v2, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 552
    .line 553
    check-cast v2, LO3/t0;

    .line 554
    .line 555
    iget-object v2, v2, LO3/t0;->v:LO3/X;

    .line 556
    .line 557
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 558
    .line 559
    .line 560
    iget-object v2, v2, LO3/X;->w:LO3/V;

    .line 561
    .line 562
    const-string v3, "Error clearing default event params"

    .line 563
    .line 564
    invoke-virtual {v2, v0, v3}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    goto/16 :goto_c

    .line 568
    .line 569
    :cond_5
    iget-object v0, v13, LO3/T1;->s:LO3/n;

    .line 570
    .line 571
    invoke-static {v0}, LO3/T1;->S(LO3/O1;)V

    .line 572
    .line 573
    .line 574
    iget-object v3, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 575
    .line 576
    move-object v15, v3

    .line 577
    check-cast v15, LO3/t0;

    .line 578
    .line 579
    invoke-virtual {v0}, LO3/D0;->o()V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v0}, LO3/O1;->p()V

    .line 583
    .line 584
    .line 585
    iget-object v3, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 586
    .line 587
    move-object v4, v3

    .line 588
    check-cast v4, LO3/t0;

    .line 589
    .line 590
    const-string v7, "dep"

    .line 591
    .line 592
    new-instance v3, LO3/r;

    .line 593
    .line 594
    const-string v5, ""

    .line 595
    .line 596
    const-wide/16 v8, 0x0

    .line 597
    .line 598
    const-wide/16 v10, 0x0

    .line 599
    .line 600
    invoke-direct/range {v3 .. v12}, LO3/r;-><init>(LO3/t0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    .line 601
    .line 602
    .line 603
    iget-object v4, v0, LO3/K1;->s:LO3/T1;

    .line 604
    .line 605
    iget-object v4, v4, LO3/T1;->w:LO3/b0;

    .line 606
    .line 607
    invoke-static {v4}, LO3/T1;->S(LO3/O1;)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v4, v3}, LO3/b0;->Q(LO3/r;)Lcom/google/android/gms/internal/measurement/k1;

    .line 611
    .line 612
    .line 613
    move-result-object v3

    .line 614
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/Y1;->a()[B

    .line 615
    .line 616
    .line 617
    move-result-object v3

    .line 618
    iget-object v4, v15, LO3/t0;->v:LO3/X;

    .line 619
    .line 620
    invoke-static {v4}, LO3/t0;->l(LO3/E0;)V

    .line 621
    .line 622
    .line 623
    iget-object v5, v4, LO3/X;->E:LO3/V;

    .line 624
    .line 625
    array-length v7, v3

    .line 626
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 627
    .line 628
    .line 629
    move-result-object v7

    .line 630
    const-string v8, "Saving default event parameters, appId, data size"

    .line 631
    .line 632
    invoke-virtual {v5, v6, v7, v8}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    new-instance v5, Landroid/content/ContentValues;

    .line 636
    .line 637
    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    .line 638
    .line 639
    .line 640
    const-string v7, "app_id"

    .line 641
    .line 642
    invoke-virtual {v5, v7, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    const-string v7, "parameters"

    .line 646
    .line 647
    invoke-virtual {v5, v7, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 648
    .line 649
    .line 650
    :try_start_c
    invoke-virtual {v0}, LO3/n;->f0()Landroid/database/sqlite/SQLiteDatabase;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    const-string v3, "default_event_params"

    .line 655
    .line 656
    const/4 v7, 0x5

    .line 657
    invoke-virtual {v0, v3, v14, v5, v7}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 658
    .line 659
    .line 660
    move-result-wide v7

    .line 661
    const-wide/16 v9, -0x1

    .line 662
    .line 663
    cmp-long v0, v7, v9

    .line 664
    .line 665
    if-nez v0, :cond_6

    .line 666
    .line 667
    invoke-static {v4}, LO3/t0;->l(LO3/E0;)V

    .line 668
    .line 669
    .line 670
    iget-object v0, v4, LO3/X;->w:LO3/V;

    .line 671
    .line 672
    const-string v3, "Failed to insert default event parameters (got -1). appId"

    .line 673
    .line 674
    invoke-static {v6}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 675
    .line 676
    .line 677
    move-result-object v5

    .line 678
    invoke-virtual {v0, v5, v3}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_4

    .line 679
    .line 680
    .line 681
    goto :goto_b

    .line 682
    :catch_4
    move-exception v0

    .line 683
    invoke-static {v4}, LO3/t0;->l(LO3/E0;)V

    .line 684
    .line 685
    .line 686
    iget-object v3, v4, LO3/X;->w:LO3/V;

    .line 687
    .line 688
    invoke-static {v6}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 689
    .line 690
    .line 691
    move-result-object v4

    .line 692
    const-string v5, "Error storing default event parameters. appId"

    .line 693
    .line 694
    invoke-virtual {v3, v4, v0, v5}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    :cond_6
    :goto_b
    iget-object v3, v13, LO3/T1;->s:LO3/n;

    .line 698
    .line 699
    invoke-static {v3}, LO3/T1;->S(LO3/O1;)V

    .line 700
    .line 701
    .line 702
    iget-wide v4, v2, LO3/a2;->T:J

    .line 703
    .line 704
    :try_start_d
    const-string v0, "select count(*) from raw_events where app_id=? and timestamp >= ? and name not like \'!_%\' escape \'!\' limit 1;"

    .line 705
    .line 706
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v2

    .line 710
    filled-new-array {v6, v2}, [Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    const-wide/16 v7, 0x0

    .line 715
    .line 716
    invoke-virtual {v3, v0, v2, v7, v8}, LO3/n;->L(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 717
    .line 718
    .line 719
    move-result-wide v9

    .line 720
    cmp-long v0, v9, v7

    .line 721
    .line 722
    if-lez v0, :cond_7

    .line 723
    .line 724
    goto :goto_c

    .line 725
    :cond_7
    const-string v0, "select count(*) from raw_events where app_id=? and timestamp >= ? and name like \'!_%\' escape \'!\' limit 1;"

    .line 726
    .line 727
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v2

    .line 731
    filled-new-array {v6, v2}, [Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v2

    .line 735
    invoke-virtual {v3, v0, v2, v7, v8}, LO3/n;->L(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 736
    .line 737
    .line 738
    move-result-wide v2
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_5

    .line 739
    cmp-long v0, v2, v7

    .line 740
    .line 741
    if-lez v0, :cond_8

    .line 742
    .line 743
    iget-object v0, v13, LO3/T1;->s:LO3/n;

    .line 744
    .line 745
    invoke-static {v0}, LO3/T1;->S(LO3/O1;)V

    .line 746
    .line 747
    .line 748
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    invoke-virtual {v0, v6, v2, v14, v12}, LO3/n;->I(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 753
    .line 754
    .line 755
    goto :goto_c

    .line 756
    :catch_5
    move-exception v0

    .line 757
    iget-object v2, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v2, LO3/t0;

    .line 760
    .line 761
    iget-object v2, v2, LO3/t0;->v:LO3/X;

    .line 762
    .line 763
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 764
    .line 765
    .line 766
    iget-object v2, v2, LO3/X;->w:LO3/V;

    .line 767
    .line 768
    const-string v3, "Error checking backfill conditions"

    .line 769
    .line 770
    invoke-virtual {v2, v0, v3}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 771
    .line 772
    .line 773
    :cond_8
    :goto_c
    return-void

    .line 774
    :pswitch_8
    iget-object v0, v1, LO3/B0;->u:Ljava/lang/Object;

    .line 775
    .line 776
    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 777
    .line 778
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c:LO3/t0;

    .line 779
    .line 780
    invoke-virtual {v0}, LO3/t0;->o()LO3/w1;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    iget-object v0, v1, LO3/B0;->s:Ljava/lang/Object;

    .line 785
    .line 786
    move-object v6, v0

    .line 787
    check-cast v6, Lcom/google/android/gms/internal/measurement/L;

    .line 788
    .line 789
    iget-object v0, v1, LO3/B0;->t:Ljava/lang/Object;

    .line 790
    .line 791
    move-object v4, v0

    .line 792
    check-cast v4, LO3/v;

    .line 793
    .line 794
    iget-object v0, v1, LO3/B0;->r:Ljava/lang/Object;

    .line 795
    .line 796
    move-object v5, v0

    .line 797
    check-cast v5, Ljava/lang/String;

    .line 798
    .line 799
    invoke-virtual {v3}, LO3/C;->o()V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v3}, LO3/H;->p()V

    .line 803
    .line 804
    .line 805
    iget-object v0, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 806
    .line 807
    check-cast v0, LO3/t0;

    .line 808
    .line 809
    iget-object v2, v0, LO3/t0;->y:LO3/Y1;

    .line 810
    .line 811
    invoke-static {v2}, LO3/t0;->j(LO3/D0;)V

    .line 812
    .line 813
    .line 814
    iget-object v2, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 815
    .line 816
    check-cast v2, LO3/t0;

    .line 817
    .line 818
    sget-object v7, Lcom/google/android/gms/common/f;->b:Lcom/google/android/gms/common/f;

    .line 819
    .line 820
    iget-object v2, v2, LO3/t0;->q:Landroid/content/Context;

    .line 821
    .line 822
    const v8, 0xbdfcb8

    .line 823
    .line 824
    .line 825
    invoke-virtual {v7, v2, v8}, Lcom/google/android/gms/common/f;->c(Landroid/content/Context;I)I

    .line 826
    .line 827
    .line 828
    move-result v2

    .line 829
    if-eqz v2, :cond_9

    .line 830
    .line 831
    iget-object v2, v0, LO3/t0;->v:LO3/X;

    .line 832
    .line 833
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 834
    .line 835
    .line 836
    iget-object v2, v2, LO3/X;->z:LO3/V;

    .line 837
    .line 838
    const-string v3, "Not bundling data. Service unavailable or out of date"

    .line 839
    .line 840
    invoke-virtual {v2, v3}, LO3/V;->b(Ljava/lang/String;)V

    .line 841
    .line 842
    .line 843
    iget-object v0, v0, LO3/t0;->y:LO3/Y1;

    .line 844
    .line 845
    invoke-static {v0}, LO3/t0;->j(LO3/D0;)V

    .line 846
    .line 847
    .line 848
    const/4 v2, 0x0

    .line 849
    new-array v2, v2, [B

    .line 850
    .line 851
    invoke-virtual {v0, v6, v2}, LO3/Y1;->Z(Lcom/google/android/gms/internal/measurement/L;[B)V

    .line 852
    .line 853
    .line 854
    goto :goto_d

    .line 855
    :cond_9
    new-instance v2, LO3/B0;

    .line 856
    .line 857
    const/4 v7, 0x5

    .line 858
    const/4 v8, 0x0

    .line 859
    invoke-direct/range {v2 .. v8}, LO3/B0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 860
    .line 861
    .line 862
    invoke-virtual {v3, v2}, LO3/w1;->C(Ljava/lang/Runnable;)V

    .line 863
    .line 864
    .line 865
    :goto_d
    return-void

    .line 866
    :pswitch_9
    iget-object v0, v1, LO3/B0;->s:Ljava/lang/Object;

    .line 867
    .line 868
    check-cast v0, LO3/C0;

    .line 869
    .line 870
    iget-object v2, v1, LO3/B0;->r:Ljava/lang/Object;

    .line 871
    .line 872
    check-cast v2, Ljava/lang/String;

    .line 873
    .line 874
    iget-object v3, v1, LO3/B0;->t:Ljava/lang/Object;

    .line 875
    .line 876
    check-cast v3, LO3/M1;

    .line 877
    .line 878
    iget-object v4, v1, LO3/B0;->u:Ljava/lang/Object;

    .line 879
    .line 880
    check-cast v4, LO3/M;

    .line 881
    .line 882
    iget-object v5, v0, LO3/C0;->c:LO3/T1;

    .line 883
    .line 884
    invoke-virtual {v5}, LO3/T1;->A()V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v5}, LO3/T1;->c()LO3/p0;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    invoke-virtual {v0}, LO3/p0;->o()V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v5}, LO3/T1;->k0()V

    .line 895
    .line 896
    .line 897
    iget-object v0, v5, LO3/T1;->s:LO3/n;

    .line 898
    .line 899
    invoke-static {v0}, LO3/T1;->S(LO3/O1;)V

    .line 900
    .line 901
    .line 902
    sget-object v6, LO3/F;->B:LO3/E;

    .line 903
    .line 904
    const/4 v7, 0x0

    .line 905
    invoke-virtual {v6, v7}, LO3/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v6

    .line 909
    check-cast v6, Ljava/lang/Integer;

    .line 910
    .line 911
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 912
    .line 913
    .line 914
    move-result v6

    .line 915
    invoke-virtual {v0, v2, v3, v6}, LO3/n;->t(Ljava/lang/String;LO3/M1;I)Ljava/util/List;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    new-instance v3, Ljava/util/ArrayList;

    .line 920
    .line 921
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 922
    .line 923
    .line 924
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 929
    .line 930
    .line 931
    move-result v6

    .line 932
    if-eqz v6, :cond_11

    .line 933
    .line 934
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    move-result-object v6

    .line 938
    check-cast v6, LO3/U1;

    .line 939
    .line 940
    iget-object v8, v6, LO3/U1;->c:Ljava/lang/String;

    .line 941
    .line 942
    iget-wide v9, v6, LO3/U1;->h:J

    .line 943
    .line 944
    iget-wide v11, v6, LO3/U1;->a:J

    .line 945
    .line 946
    invoke-virtual {v5, v2, v8}, LO3/T1;->s(Ljava/lang/String;Ljava/lang/String;)Z

    .line 947
    .line 948
    .line 949
    move-result v8

    .line 950
    if-nez v8, :cond_a

    .line 951
    .line 952
    invoke-virtual {v5}, LO3/T1;->b()LO3/X;

    .line 953
    .line 954
    .line 955
    move-result-object v8

    .line 956
    iget-object v8, v8, LO3/X;->E:LO3/V;

    .line 957
    .line 958
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 959
    .line 960
    .line 961
    move-result-object v9

    .line 962
    iget-object v6, v6, LO3/U1;->c:Ljava/lang/String;

    .line 963
    .line 964
    const-string v10, "[sgtm] batch skipped due to destination in backoff. appId, rowId, url"

    .line 965
    .line 966
    invoke-virtual {v8, v10, v2, v9, v6}, LO3/V;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 967
    .line 968
    .line 969
    goto :goto_e

    .line 970
    :cond_a
    iget v8, v6, LO3/U1;->i:I

    .line 971
    .line 972
    if-gtz v8, :cond_b

    .line 973
    .line 974
    goto :goto_f

    .line 975
    :cond_b
    sget-object v13, LO3/F;->z:LO3/E;

    .line 976
    .line 977
    invoke-virtual {v13, v7}, LO3/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object v13

    .line 981
    check-cast v13, Ljava/lang/Integer;

    .line 982
    .line 983
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 984
    .line 985
    .line 986
    move-result v13

    .line 987
    if-le v8, v13, :cond_c

    .line 988
    .line 989
    goto/16 :goto_13

    .line 990
    .line 991
    :cond_c
    sget-object v13, LO3/F;->x:LO3/E;

    .line 992
    .line 993
    invoke-virtual {v13, v7}, LO3/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 994
    .line 995
    .line 996
    move-result-object v13

    .line 997
    check-cast v13, Ljava/lang/Long;

    .line 998
    .line 999
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 1000
    .line 1001
    .line 1002
    move-result-wide v13

    .line 1003
    add-int/lit8 v8, v8, -0x1

    .line 1004
    .line 1005
    const-wide/16 v15, 0x1

    .line 1006
    .line 1007
    shl-long/2addr v15, v8

    .line 1008
    mul-long/2addr v13, v15

    .line 1009
    sget-object v8, LO3/F;->y:LO3/E;

    .line 1010
    .line 1011
    invoke-virtual {v8, v7}, LO3/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v8

    .line 1015
    check-cast v8, Ljava/lang/Long;

    .line 1016
    .line 1017
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 1018
    .line 1019
    .line 1020
    move-result-wide v7

    .line 1021
    invoke-static {v13, v14, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 1022
    .line 1023
    .line 1024
    move-result-wide v7

    .line 1025
    invoke-virtual {v5}, LO3/T1;->e()LB3/a;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v13

    .line 1029
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1030
    .line 1031
    .line 1032
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1033
    .line 1034
    .line 1035
    move-result-wide v13

    .line 1036
    add-long/2addr v7, v9

    .line 1037
    cmp-long v7, v13, v7

    .line 1038
    .line 1039
    if-ltz v7, :cond_10

    .line 1040
    .line 1041
    :goto_f
    new-instance v7, Landroid/os/Bundle;

    .line 1042
    .line 1043
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 1044
    .line 1045
    .line 1046
    iget-object v8, v6, LO3/U1;->d:Ljava/util/HashMap;

    .line 1047
    .line 1048
    invoke-virtual {v8}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v8

    .line 1052
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v8

    .line 1056
    :goto_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1057
    .line 1058
    .line 1059
    move-result v9

    .line 1060
    if-eqz v9, :cond_d

    .line 1061
    .line 1062
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v9

    .line 1066
    check-cast v9, Ljava/util/Map$Entry;

    .line 1067
    .line 1068
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v10

    .line 1072
    check-cast v10, Ljava/lang/String;

    .line 1073
    .line 1074
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v9

    .line 1078
    check-cast v9, Ljava/lang/String;

    .line 1079
    .line 1080
    invoke-virtual {v7, v10, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1081
    .line 1082
    .line 1083
    goto :goto_10

    .line 1084
    :cond_d
    iget-wide v8, v6, LO3/U1;->a:J

    .line 1085
    .line 1086
    iget-object v10, v6, LO3/U1;->b:Lcom/google/android/gms/internal/measurement/q1;

    .line 1087
    .line 1088
    iget-object v11, v6, LO3/U1;->c:Ljava/lang/String;

    .line 1089
    .line 1090
    iget-object v12, v6, LO3/U1;->e:LO3/i1;

    .line 1091
    .line 1092
    iget-wide v13, v6, LO3/U1;->g:J

    .line 1093
    .line 1094
    new-instance v16, LO3/L1;

    .line 1095
    .line 1096
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/Y1;->a()[B

    .line 1097
    .line 1098
    .line 1099
    move-result-object v19

    .line 1100
    iget v6, v12, LO3/i1;->q:I

    .line 1101
    .line 1102
    const-string v25, ""

    .line 1103
    .line 1104
    move/from16 v22, v6

    .line 1105
    .line 1106
    move-object/from16 v21, v7

    .line 1107
    .line 1108
    move-wide/from16 v17, v8

    .line 1109
    .line 1110
    move-object/from16 v20, v11

    .line 1111
    .line 1112
    move-wide/from16 v23, v13

    .line 1113
    .line 1114
    invoke-direct/range {v16 .. v25}, LO3/L1;-><init>(J[BLjava/lang/String;Landroid/os/Bundle;IJLjava/lang/String;)V

    .line 1115
    .line 1116
    .line 1117
    move-object/from16 v6, v16

    .line 1118
    .line 1119
    :try_start_e
    invoke-static {}, Lcom/google/android/gms/internal/measurement/q1;->w()Lcom/google/android/gms/internal/measurement/p1;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v7

    .line 1123
    iget-object v8, v6, LO3/L1;->r:[B

    .line 1124
    .line 1125
    invoke-static {v7, v8}, LO3/b0;->b0(Lcom/google/android/gms/internal/measurement/p2;[B)Lcom/google/android/gms/internal/measurement/p2;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v7

    .line 1129
    check-cast v7, Lcom/google/android/gms/internal/measurement/p1;

    .line 1130
    .line 1131
    const/4 v8, 0x0

    .line 1132
    :goto_11
    iget-object v9, v7, Lcom/google/android/gms/internal/measurement/p2;->r:Lcom/google/android/gms/internal/measurement/q2;

    .line 1133
    .line 1134
    check-cast v9, Lcom/google/android/gms/internal/measurement/q1;

    .line 1135
    .line 1136
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/q1;->q()I

    .line 1137
    .line 1138
    .line 1139
    move-result v9

    .line 1140
    if-ge v8, v9, :cond_e

    .line 1141
    .line 1142
    iget-object v9, v7, Lcom/google/android/gms/internal/measurement/p2;->r:Lcom/google/android/gms/internal/measurement/q2;

    .line 1143
    .line 1144
    check-cast v9, Lcom/google/android/gms/internal/measurement/q1;

    .line 1145
    .line 1146
    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/measurement/q1;->r(I)Lcom/google/android/gms/internal/measurement/s1;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v9

    .line 1150
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/q2;->i()Lcom/google/android/gms/internal/measurement/p2;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v9

    .line 1154
    check-cast v9, Lcom/google/android/gms/internal/measurement/r1;

    .line 1155
    .line 1156
    invoke-virtual {v5}, LO3/T1;->e()LB3/a;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v10

    .line 1160
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1161
    .line 1162
    .line 1163
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1164
    .line 1165
    .line 1166
    move-result-wide v10

    .line 1167
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/p2;->b()V

    .line 1168
    .line 1169
    .line 1170
    iget-object v12, v9, Lcom/google/android/gms/internal/measurement/p2;->r:Lcom/google/android/gms/internal/measurement/q2;

    .line 1171
    .line 1172
    check-cast v12, Lcom/google/android/gms/internal/measurement/s1;

    .line 1173
    .line 1174
    invoke-virtual {v12, v10, v11}, Lcom/google/android/gms/internal/measurement/s1;->f0(J)V

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/p2;->b()V

    .line 1178
    .line 1179
    .line 1180
    iget-object v10, v7, Lcom/google/android/gms/internal/measurement/p2;->r:Lcom/google/android/gms/internal/measurement/q2;

    .line 1181
    .line 1182
    check-cast v10, Lcom/google/android/gms/internal/measurement/q1;

    .line 1183
    .line 1184
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/p2;->e()Lcom/google/android/gms/internal/measurement/q2;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v9

    .line 1188
    check-cast v9, Lcom/google/android/gms/internal/measurement/s1;

    .line 1189
    .line 1190
    invoke-virtual {v10, v8, v9}, Lcom/google/android/gms/internal/measurement/q1;->y(ILcom/google/android/gms/internal/measurement/s1;)V

    .line 1191
    .line 1192
    .line 1193
    add-int/lit8 v8, v8, 0x1

    .line 1194
    .line 1195
    goto :goto_11

    .line 1196
    :cond_e
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/p2;->e()Lcom/google/android/gms/internal/measurement/q2;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v8

    .line 1200
    check-cast v8, Lcom/google/android/gms/internal/measurement/q1;

    .line 1201
    .line 1202
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/Y1;->a()[B

    .line 1203
    .line 1204
    .line 1205
    move-result-object v8

    .line 1206
    iput-object v8, v6, LO3/L1;->r:[B

    .line 1207
    .line 1208
    invoke-virtual {v5}, LO3/T1;->b()LO3/X;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v8

    .line 1212
    invoke-virtual {v8}, LO3/X;->y()Ljava/lang/String;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v8

    .line 1216
    const/4 v9, 0x2

    .line 1217
    invoke-static {v8, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1218
    .line 1219
    .line 1220
    move-result v8

    .line 1221
    if-eqz v8, :cond_f

    .line 1222
    .line 1223
    iget-object v8, v5, LO3/T1;->w:LO3/b0;

    .line 1224
    .line 1225
    invoke-static {v8}, LO3/T1;->S(LO3/O1;)V

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/p2;->e()Lcom/google/android/gms/internal/measurement/q2;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v7

    .line 1232
    check-cast v7, Lcom/google/android/gms/internal/measurement/q1;

    .line 1233
    .line 1234
    invoke-virtual {v8, v7}, LO3/b0;->R(Lcom/google/android/gms/internal/measurement/q1;)Ljava/lang/String;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v7

    .line 1238
    iput-object v7, v6, LO3/L1;->w:Ljava/lang/String;
    :try_end_e
    .catch Lcom/google/android/gms/internal/measurement/z2; {:try_start_e .. :try_end_e} :catch_6

    .line 1239
    .line 1240
    :cond_f
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1241
    .line 1242
    .line 1243
    :goto_12
    const/4 v7, 0x0

    .line 1244
    goto/16 :goto_e

    .line 1245
    .line 1246
    :catch_6
    invoke-virtual {v5}, LO3/T1;->b()LO3/X;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v6

    .line 1250
    iget-object v6, v6, LO3/X;->z:LO3/V;

    .line 1251
    .line 1252
    const-string v7, "Failed to parse queued batch. appId"

    .line 1253
    .line 1254
    invoke-virtual {v6, v2, v7}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1255
    .line 1256
    .line 1257
    goto :goto_12

    .line 1258
    :cond_10
    :goto_13
    invoke-virtual {v5}, LO3/T1;->b()LO3/X;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v6

    .line 1262
    iget-object v6, v6, LO3/X;->E:LO3/V;

    .line 1263
    .line 1264
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v7

    .line 1268
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v8

    .line 1272
    const-string v9, "[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis"

    .line 1273
    .line 1274
    invoke-virtual {v6, v9, v2, v7, v8}, LO3/V;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1275
    .line 1276
    .line 1277
    goto :goto_12

    .line 1278
    :cond_11
    new-instance v0, LO3/N1;

    .line 1279
    .line 1280
    invoke-direct {v0, v3}, LO3/N1;-><init>(Ljava/util/ArrayList;)V

    .line 1281
    .line 1282
    .line 1283
    :try_start_f
    invoke-interface {v4, v0}, LO3/M;->w(LO3/N1;)V

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual {v5}, LO3/T1;->b()LO3/X;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v0

    .line 1290
    iget-object v0, v0, LO3/X;->E:LO3/V;

    .line 1291
    .line 1292
    const-string v4, "[sgtm] Sending queued upload batches to client. appId, count"

    .line 1293
    .line 1294
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1295
    .line 1296
    .line 1297
    move-result v3

    .line 1298
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v3

    .line 1302
    invoke-virtual {v0, v2, v3, v4}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_f
    .catch Landroid/os/RemoteException; {:try_start_f .. :try_end_f} :catch_7

    .line 1303
    .line 1304
    .line 1305
    goto :goto_14

    .line 1306
    :catch_7
    move-exception v0

    .line 1307
    invoke-virtual {v5}, LO3/T1;->b()LO3/X;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v3

    .line 1311
    iget-object v3, v3, LO3/X;->w:LO3/V;

    .line 1312
    .line 1313
    const-string v4, "[sgtm] Failed to return upload batches for app"

    .line 1314
    .line 1315
    invoke-virtual {v3, v2, v0, v4}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1316
    .line 1317
    .line 1318
    :goto_14
    return-void

    .line 1319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
