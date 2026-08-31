.class public final LO3/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO3/F0;


# static fields
.field public static volatile U:LO3/t0;


# instance fields
.field public final A:LB3/a;

.field public final B:LO3/m1;

.field public final C:LO3/b1;

.field public final D:LO3/A;

.field public final E:LO3/f1;

.field public final F:Ljava/lang/String;

.field public G:LO3/P;

.field public H:LO3/w1;

.field public I:LO3/q;

.field public J:LO3/N;

.field public K:LO3/g1;

.field public L:Z

.field public M:Ljava/lang/Boolean;

.field public N:J

.field public volatile O:Ljava/lang/Boolean;

.field public volatile P:Z

.field public Q:I

.field public R:I

.field public final S:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final T:J

.field public final q:Landroid/content/Context;

.field public final r:Z

.field public final s:Ls4/e;

.field public final t:LO3/g;

.field public final u:LO3/h0;

.field public final v:LO3/X;

.field public final w:LO3/p0;

.field public final x:LO3/E1;

.field public final y:LO3/Y1;

.field public final z:LO3/Q;


# direct methods
.method public constructor <init>(LO3/N0;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LO3/t0;->L:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, LO3/t0;->S:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    iget-object v1, p1, LO3/N0;->a:Landroid/content/Context;

    .line 15
    .line 16
    new-instance v2, Ls4/e;

    .line 17
    .line 18
    const/16 v3, 0xc

    .line 19
    .line 20
    invoke-direct {v2, v3}, Ls4/e;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, LO3/t0;->s:Ls4/e;

    .line 24
    .line 25
    sput-object v2, LO3/K0;->k:Ls4/e;

    .line 26
    .line 27
    iput-object v1, p0, LO3/t0;->q:Landroid/content/Context;

    .line 28
    .line 29
    iget-boolean v2, p1, LO3/N0;->e:Z

    .line 30
    .line 31
    iput-boolean v2, p0, LO3/t0;->r:Z

    .line 32
    .line 33
    iget-object v2, p1, LO3/N0;->b:Ljava/lang/Boolean;

    .line 34
    .line 35
    iput-object v2, p0, LO3/t0;->O:Ljava/lang/Boolean;

    .line 36
    .line 37
    iget-object v2, p1, LO3/N0;->g:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v2, p0, LO3/t0;->F:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    iput-boolean v2, p0, LO3/t0;->P:Z

    .line 43
    .line 44
    sget-object v3, Lcom/google/android/gms/internal/measurement/T1;->h:Lcom/google/android/gms/internal/measurement/L1;

    .line 45
    .line 46
    if-nez v3, :cond_8

    .line 47
    .line 48
    if-nez v1, :cond_0

    .line 49
    .line 50
    goto/16 :goto_9

    .line 51
    .line 52
    :cond_0
    sget-object v3, Lcom/google/android/gms/internal/measurement/T1;->g:Ljava/lang/Object;

    .line 53
    .line 54
    monitor-enter v3

    .line 55
    :try_start_0
    sget-object v4, Lcom/google/android/gms/internal/measurement/T1;->h:Lcom/google/android/gms/internal/measurement/L1;

    .line 56
    .line 57
    if-nez v4, :cond_7

    .line 58
    .line 59
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 60
    :try_start_1
    sget-object v4, Lcom/google/android/gms/internal/measurement/T1;->h:Lcom/google/android/gms/internal/measurement/L1;

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    if-eqz v5, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    move-object v5, v1

    .line 70
    :goto_0
    if-eqz v4, :cond_2

    .line 71
    .line 72
    iget-object v6, v4, Lcom/google/android/gms/internal/measurement/L1;->a:Landroid/content/Context;

    .line 73
    .line 74
    if-eq v6, v5, :cond_6

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    goto :goto_6

    .line 79
    :cond_2
    :goto_1
    if-eqz v4, :cond_4

    .line 80
    .line 81
    invoke-static {}, Lcom/google/android/gms/internal/measurement/M1;->c()V

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lcom/google/android/gms/internal/measurement/V1;->a()V

    .line 85
    .line 86
    .line 87
    const-class v4, Lcom/google/android/gms/internal/measurement/O1;

    .line 88
    .line 89
    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    :try_start_2
    sget-object v6, Lcom/google/android/gms/internal/measurement/O1;->d:Lcom/google/android/gms/internal/measurement/O1;

    .line 91
    .line 92
    if-eqz v6, :cond_3

    .line 93
    .line 94
    iget-object v7, v6, Lcom/google/android/gms/internal/measurement/O1;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v7, Landroid/content/Context;

    .line 97
    .line 98
    if-eqz v7, :cond_3

    .line 99
    .line 100
    iget-object v8, v6, Lcom/google/android/gms/internal/measurement/O1;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v8, Lcom/google/android/gms/internal/clearcut/F0;

    .line 103
    .line 104
    if-eqz v8, :cond_3

    .line 105
    .line 106
    iget-boolean v6, v6, Lcom/google/android/gms/internal/measurement/O1;->a:Z

    .line 107
    .line 108
    if-eqz v6, :cond_3

    .line 109
    .line 110
    invoke-virtual {v7}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    sget-object v7, Lcom/google/android/gms/internal/measurement/O1;->d:Lcom/google/android/gms/internal/measurement/O1;

    .line 115
    .line 116
    iget-object v7, v7, Lcom/google/android/gms/internal/measurement/O1;->c:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v7, Lcom/google/android/gms/internal/clearcut/F0;

    .line 119
    .line 120
    invoke-virtual {v6, v7}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :catchall_1
    move-exception p1

    .line 125
    goto :goto_3

    .line 126
    :cond_3
    :goto_2
    const/4 v6, 0x0

    .line 127
    sput-object v6, Lcom/google/android/gms/internal/measurement/O1;->d:Lcom/google/android/gms/internal/measurement/O1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 128
    .line 129
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 130
    goto :goto_4

    .line 131
    :goto_3
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 132
    :try_start_5
    throw p1

    .line 133
    :cond_4
    :goto_4
    new-instance v4, Lcom/google/android/gms/internal/measurement/F2;

    .line 134
    .line 135
    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/measurement/F2;-><init>(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    instance-of v6, v4, Ljava/io/Serializable;

    .line 139
    .line 140
    if-eqz v6, :cond_5

    .line 141
    .line 142
    new-instance v6, LG4/e;

    .line 143
    .line 144
    invoke-direct {v6, v4}, LG4/e;-><init>(Lcom/google/android/gms/internal/measurement/F2;)V

    .line 145
    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_5
    new-instance v6, LG4/f;

    .line 149
    .line 150
    invoke-direct {v6, v4}, LG4/f;-><init>(Lcom/google/android/gms/internal/measurement/F2;)V

    .line 151
    .line 152
    .line 153
    :goto_5
    new-instance v4, Lcom/google/android/gms/internal/measurement/L1;

    .line 154
    .line 155
    invoke-direct {v4, v5, v6}, Lcom/google/android/gms/internal/measurement/L1;-><init>(Landroid/content/Context;LG4/d;)V

    .line 156
    .line 157
    .line 158
    sput-object v4, Lcom/google/android/gms/internal/measurement/T1;->h:Lcom/google/android/gms/internal/measurement/L1;

    .line 159
    .line 160
    sget-object v4, Lcom/google/android/gms/internal/measurement/T1;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 161
    .line 162
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 163
    .line 164
    .line 165
    :cond_6
    monitor-exit v3

    .line 166
    goto :goto_7

    .line 167
    :goto_6
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 168
    :try_start_6
    throw p1

    .line 169
    :catchall_2
    move-exception p1

    .line 170
    goto :goto_8

    .line 171
    :cond_7
    :goto_7
    monitor-exit v3

    .line 172
    goto :goto_9

    .line 173
    :goto_8
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 174
    throw p1

    .line 175
    :cond_8
    :goto_9
    sget-object v3, LB3/a;->a:LB3/a;

    .line 176
    .line 177
    iput-object v3, p0, LO3/t0;->A:LB3/a;

    .line 178
    .line 179
    iget-object v3, p1, LO3/N0;->f:Ljava/lang/Long;

    .line 180
    .line 181
    if-eqz v3, :cond_9

    .line 182
    .line 183
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 184
    .line 185
    .line 186
    move-result-wide v3

    .line 187
    goto :goto_a

    .line 188
    :cond_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 189
    .line 190
    .line 191
    move-result-wide v3

    .line 192
    :goto_a
    iput-wide v3, p0, LO3/t0;->T:J

    .line 193
    .line 194
    new-instance v3, LO3/g;

    .line 195
    .line 196
    invoke-direct {v3, p0}, LO3/D0;-><init>(LO3/t0;)V

    .line 197
    .line 198
    .line 199
    sget-object v4, Lx3/k;->s:Lx3/k;

    .line 200
    .line 201
    iput-object v4, v3, LO3/g;->u:LO3/f;

    .line 202
    .line 203
    iput-object v3, p0, LO3/t0;->t:LO3/g;

    .line 204
    .line 205
    new-instance v3, LO3/h0;

    .line 206
    .line 207
    invoke-direct {v3, p0}, LO3/h0;-><init>(LO3/t0;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3}, LO3/E0;->r()V

    .line 211
    .line 212
    .line 213
    iput-object v3, p0, LO3/t0;->u:LO3/h0;

    .line 214
    .line 215
    new-instance v3, LO3/X;

    .line 216
    .line 217
    invoke-direct {v3, p0}, LO3/X;-><init>(LO3/t0;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3}, LO3/E0;->r()V

    .line 221
    .line 222
    .line 223
    iput-object v3, p0, LO3/t0;->v:LO3/X;

    .line 224
    .line 225
    new-instance v4, LO3/Y1;

    .line 226
    .line 227
    invoke-direct {v4, p0}, LO3/Y1;-><init>(LO3/t0;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4}, LO3/E0;->r()V

    .line 231
    .line 232
    .line 233
    iput-object v4, p0, LO3/t0;->y:LO3/Y1;

    .line 234
    .line 235
    new-instance v4, LO3/j0;

    .line 236
    .line 237
    invoke-direct {v4, p1, p0}, LO3/j0;-><init>(LO3/N0;LO3/t0;)V

    .line 238
    .line 239
    .line 240
    new-instance v5, LO3/Q;

    .line 241
    .line 242
    invoke-direct {v5, v4}, LO3/Q;-><init>(LO3/j0;)V

    .line 243
    .line 244
    .line 245
    iput-object v5, p0, LO3/t0;->z:LO3/Q;

    .line 246
    .line 247
    new-instance v4, LO3/A;

    .line 248
    .line 249
    invoke-direct {v4, p0}, LO3/A;-><init>(LO3/t0;)V

    .line 250
    .line 251
    .line 252
    iput-object v4, p0, LO3/t0;->D:LO3/A;

    .line 253
    .line 254
    new-instance v4, LO3/m1;

    .line 255
    .line 256
    invoke-direct {v4, p0}, LO3/m1;-><init>(LO3/t0;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v4}, LO3/H;->q()V

    .line 260
    .line 261
    .line 262
    iput-object v4, p0, LO3/t0;->B:LO3/m1;

    .line 263
    .line 264
    new-instance v4, LO3/b1;

    .line 265
    .line 266
    invoke-direct {v4, p0}, LO3/b1;-><init>(LO3/t0;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v4}, LO3/H;->q()V

    .line 270
    .line 271
    .line 272
    iput-object v4, p0, LO3/t0;->C:LO3/b1;

    .line 273
    .line 274
    new-instance v5, LO3/E1;

    .line 275
    .line 276
    invoke-direct {v5, p0}, LO3/E1;-><init>(LO3/t0;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v5}, LO3/H;->q()V

    .line 280
    .line 281
    .line 282
    iput-object v5, p0, LO3/t0;->x:LO3/E1;

    .line 283
    .line 284
    new-instance v5, LO3/f1;

    .line 285
    .line 286
    invoke-direct {v5, p0}, LO3/E0;-><init>(LO3/t0;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v5}, LO3/E0;->r()V

    .line 290
    .line 291
    .line 292
    iput-object v5, p0, LO3/t0;->E:LO3/f1;

    .line 293
    .line 294
    new-instance v5, LO3/p0;

    .line 295
    .line 296
    invoke-direct {v5, p0}, LO3/p0;-><init>(LO3/t0;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v5}, LO3/E0;->r()V

    .line 300
    .line 301
    .line 302
    iput-object v5, p0, LO3/t0;->w:LO3/p0;

    .line 303
    .line 304
    iget-object v6, p1, LO3/N0;->d:Lcom/google/android/gms/internal/measurement/V;

    .line 305
    .line 306
    if-eqz v6, :cond_a

    .line 307
    .line 308
    iget-wide v6, v6, Lcom/google/android/gms/internal/measurement/V;->r:J

    .line 309
    .line 310
    const-wide/16 v8, 0x0

    .line 311
    .line 312
    cmp-long v6, v6, v8

    .line 313
    .line 314
    if-eqz v6, :cond_a

    .line 315
    .line 316
    goto :goto_b

    .line 317
    :cond_a
    move v0, v2

    .line 318
    :goto_b
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    instance-of v1, v1, Landroid/app/Application;

    .line 323
    .line 324
    if-eqz v1, :cond_c

    .line 325
    .line 326
    invoke-static {v4}, LO3/t0;->k(LO3/H;)V

    .line 327
    .line 328
    .line 329
    iget-object v1, v4, LO3/D0;->r:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v1, LO3/t0;

    .line 332
    .line 333
    iget-object v1, v1, LO3/t0;->q:Landroid/content/Context;

    .line 334
    .line 335
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    instance-of v1, v1, Landroid/app/Application;

    .line 340
    .line 341
    if-eqz v1, :cond_d

    .line 342
    .line 343
    iget-object v1, v4, LO3/D0;->r:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v1, LO3/t0;

    .line 346
    .line 347
    iget-object v1, v1, LO3/t0;->q:Landroid/content/Context;

    .line 348
    .line 349
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    check-cast v1, Landroid/app/Application;

    .line 354
    .line 355
    iget-object v2, v4, LO3/b1;->t:LO3/Y0;

    .line 356
    .line 357
    if-nez v2, :cond_b

    .line 358
    .line 359
    new-instance v2, LO3/Y0;

    .line 360
    .line 361
    invoke-direct {v2, v4}, LO3/Y0;-><init>(LO3/b1;)V

    .line 362
    .line 363
    .line 364
    iput-object v2, v4, LO3/b1;->t:LO3/Y0;

    .line 365
    .line 366
    :cond_b
    if-eqz v0, :cond_d

    .line 367
    .line 368
    iget-object v0, v4, LO3/b1;->t:LO3/Y0;

    .line 369
    .line 370
    invoke-virtual {v1, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 371
    .line 372
    .line 373
    iget-object v0, v4, LO3/b1;->t:LO3/Y0;

    .line 374
    .line 375
    invoke-virtual {v1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 376
    .line 377
    .line 378
    iget-object v0, v4, LO3/D0;->r:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v0, LO3/t0;

    .line 381
    .line 382
    iget-object v0, v0, LO3/t0;->v:LO3/X;

    .line 383
    .line 384
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 385
    .line 386
    .line 387
    iget-object v0, v0, LO3/X;->E:LO3/V;

    .line 388
    .line 389
    const-string v1, "Registered activity lifecycle callback"

    .line 390
    .line 391
    invoke-virtual {v0, v1}, LO3/V;->b(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    goto :goto_c

    .line 395
    :cond_c
    invoke-static {v3}, LO3/t0;->l(LO3/E0;)V

    .line 396
    .line 397
    .line 398
    iget-object v0, v3, LO3/X;->z:LO3/V;

    .line 399
    .line 400
    const-string v1, "Application context is not an Application"

    .line 401
    .line 402
    invoke-virtual {v0, v1}, LO3/V;->b(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    :cond_d
    :goto_c
    new-instance v0, LI4/a;

    .line 406
    .line 407
    const/4 v1, 0x5

    .line 408
    const/4 v2, 0x0

    .line 409
    invoke-direct {v0, v1, p0, p1, v2}, LI4/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v5, v0}, LO3/p0;->x(Ljava/lang/Runnable;)V

    .line 413
    .line 414
    .line 415
    return-void
.end method

.method public static final i(LO3/C;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string v0, "Component not created"

    .line 7
    .line 8
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public static final j(LO3/D0;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string v0, "Component not created"

    .line 7
    .line 8
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public static final k(LO3/H;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, LO3/H;->s:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v1, "Component not initialized: "

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "Component not created"

    .line 31
    .line 32
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0
.end method

.method public static final l(LO3/E0;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, LO3/E0;->s:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v1, "Component not initialized: "

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "Component not created"

    .line 31
    .line 32
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0
.end method

.method public static r(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/V;Ljava/lang/Long;)LO3/t0;
    .locals 8

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v6, p1, Lcom/google/android/gms/internal/measurement/V;->t:Landroid/os/Bundle;

    .line 4
    .line 5
    iget-boolean v5, p1, Lcom/google/android/gms/internal/measurement/V;->s:Z

    .line 6
    .line 7
    iget-wide v3, p1, Lcom/google/android/gms/internal/measurement/V;->r:J

    .line 8
    .line 9
    iget-wide v1, p1, Lcom/google/android/gms/internal/measurement/V;->q:J

    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/internal/measurement/V;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/measurement/V;-><init>(JJZLandroid/os/Bundle;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    move-object p1, v0

    .line 18
    :cond_0
    invoke-static {p0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, LO3/t0;->U:LO3/t0;

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    const-class v1, LO3/t0;

    .line 33
    .line 34
    monitor-enter v1

    .line 35
    :try_start_0
    sget-object v0, LO3/t0;->U:LO3/t0;

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    new-instance v0, LO3/N0;

    .line 40
    .line 41
    invoke-direct {v0, p0, p1, p2}, LO3/N0;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/V;Ljava/lang/Long;)V

    .line 42
    .line 43
    .line 44
    new-instance p0, LO3/t0;

    .line 45
    .line 46
    invoke-direct {p0, v0}, LO3/t0;-><init>(LO3/N0;)V

    .line 47
    .line 48
    .line 49
    sput-object p0, LO3/t0;->U:LO3/t0;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    move-object p0, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    monitor-exit v1

    .line 56
    goto :goto_2

    .line 57
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    throw p0

    .line 59
    :cond_2
    if-eqz p1, :cond_3

    .line 60
    .line 61
    iget-object p0, p1, Lcom/google/android/gms/internal/measurement/V;->t:Landroid/os/Bundle;

    .line 62
    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    const-string p1, "dataCollectionDefaultEnabled"

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    sget-object p1, LO3/t0;->U:LO3/t0;

    .line 74
    .line 75
    invoke-static {p1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object p1, LO3/t0;->U:LO3/t0;

    .line 79
    .line 80
    const-string p2, "dataCollectionDefaultEnabled"

    .line 81
    .line 82
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    iput-object p0, p1, LO3/t0;->O:Ljava/lang/Boolean;

    .line 91
    .line 92
    :cond_3
    :goto_2
    sget-object p0, LO3/t0;->U:LO3/t0;

    .line 93
    .line 94
    invoke-static {p0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, LO3/t0;->U:LO3/t0;

    .line 98
    .line 99
    return-object p0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LO3/t0;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final b()LO3/X;
    .locals 1

    .line 1
    iget-object v0, p0, LO3/t0;->v:LO3/X;

    .line 2
    .line 3
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final c()LO3/p0;
    .locals 1

    .line 1
    iget-object v0, p0, LO3/t0;->w:LO3/p0;

    .line 2
    .line 3
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final d()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, LO3/t0;->q:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()LB3/a;
    .locals 1

    .line 1
    iget-object v0, p0, LO3/t0;->A:LB3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()I
    .locals 5

    .line 1
    iget-object v0, p0, LO3/t0;->w:LO3/p0;

    .line 2
    .line 3
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LO3/p0;->o()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, LO3/t0;->t:LO3/g;

    .line 10
    .line 11
    invoke-virtual {v1}, LO3/g;->B()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x1

    .line 16
    if-nez v2, :cond_8

    .line 17
    .line 18
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, LO3/p0;->o()V

    .line 22
    .line 23
    .line 24
    iget-boolean v0, p0, LO3/t0;->P:Z

    .line 25
    .line 26
    if-eqz v0, :cond_7

    .line 27
    .line 28
    iget-object v0, p0, LO3/t0;->u:LO3/h0;

    .line 29
    .line 30
    invoke-static {v0}, LO3/t0;->j(LO3/D0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, LO3/D0;->o()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v4, "measurement_enabled"

    .line 41
    .line 42
    invoke-interface {v2, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/4 v0, 0x0

    .line 62
    :goto_0
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    const/4 v0, 0x3

    .line 72
    return v0

    .line 73
    :cond_2
    iget-object v0, v1, LO3/D0;->r:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, LO3/t0;

    .line 76
    .line 77
    iget-object v0, v0, LO3/t0;->s:Ls4/e;

    .line 78
    .line 79
    const-string v0, "firebase_analytics_collection_enabled"

    .line 80
    .line 81
    invoke-virtual {v1, v0}, LO3/g;->A(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    const/4 v0, 0x4

    .line 95
    return v0

    .line 96
    :cond_4
    iget-object v0, p0, LO3/t0;->O:Ljava/lang/Boolean;

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    iget-object v0, p0, LO3/t0;->O:Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    const/4 v0, 0x7

    .line 110
    return v0

    .line 111
    :cond_6
    :goto_1
    const/4 v0, 0x0

    .line 112
    return v0

    .line 113
    :cond_7
    const/16 v0, 0x8

    .line 114
    .line 115
    return v0

    .line 116
    :cond_8
    return v3
.end method

.method public final g()Ls4/e;
    .locals 1

    .line 1
    iget-object v0, p0, LO3/t0;->s:Ls4/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Z
    .locals 6

    .line 1
    iget-boolean v0, p0, LO3/t0;->L:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, LO3/t0;->w:LO3/p0;

    .line 6
    .line 7
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, LO3/p0;->o()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LO3/t0;->M:Ljava/lang/Boolean;

    .line 14
    .line 15
    iget-object v1, p0, LO3/t0;->A:LB3/a;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-wide v2, p0, LO3/t0;->N:J

    .line 20
    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    iget-wide v4, p0, LO3/t0;->N:J

    .line 41
    .line 42
    sub-long/2addr v2, v4

    .line 43
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    const-wide/16 v4, 0x3e8

    .line 48
    .line 49
    cmp-long v0, v2, v4

    .line 50
    .line 51
    if-lez v0, :cond_3

    .line 52
    .line 53
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    iput-wide v0, p0, LO3/t0;->N:J

    .line 61
    .line 62
    iget-object v0, p0, LO3/t0;->y:LO3/Y1;

    .line 63
    .line 64
    invoke-static {v0}, LO3/t0;->j(LO3/D0;)V

    .line 65
    .line 66
    .line 67
    const-string v1, "android.permission.INTERNET"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, LO3/Y1;->L(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const/4 v2, 0x0

    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    .line 77
    .line 78
    invoke-virtual {v0, v1}, LO3/Y1;->L(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_2

    .line 83
    .line 84
    iget-object v1, p0, LO3/t0;->q:Landroid/content/Context;

    .line 85
    .line 86
    invoke-static {v1}, LC3/c;->a(Landroid/content/Context;)LC3/b;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v3}, LC3/b;->b()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    const/4 v4, 0x1

    .line 95
    if-nez v3, :cond_1

    .line 96
    .line 97
    iget-object v3, p0, LO3/t0;->t:LO3/g;

    .line 98
    .line 99
    invoke-virtual {v3}, LO3/g;->r()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-nez v3, :cond_1

    .line 104
    .line 105
    invoke-static {v1}, LO3/Y1;->e0(Landroid/content/Context;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_2

    .line 110
    .line 111
    invoke-static {v1}, LO3/Y1;->H(Landroid/content/Context;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_2

    .line 116
    .line 117
    :cond_1
    move v2, v4

    .line 118
    :cond_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iput-object v1, p0, LO3/t0;->M:Ljava/lang/Boolean;

    .line 123
    .line 124
    if-eqz v2, :cond_3

    .line 125
    .line 126
    invoke-virtual {p0}, LO3/t0;->q()LO3/N;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1}, LO3/N;->v()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0, v1}, LO3/Y1;->s(Ljava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iput-object v0, p0, LO3/t0;->M:Ljava/lang/Boolean;

    .line 143
    .line 144
    :cond_3
    iget-object v0, p0, LO3/t0;->M:Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    return v0

    .line 151
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 152
    .line 153
    const-string v1, "AppMeasurement is not initialized"

    .line 154
    .line 155
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v0
.end method

.method public final m()LO3/Q;
    .locals 1

    .line 1
    iget-object v0, p0, LO3/t0;->z:LO3/Q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()LO3/P;
    .locals 1

    .line 1
    iget-object v0, p0, LO3/t0;->G:LO3/P;

    .line 2
    .line 3
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/t0;->G:LO3/P;

    .line 7
    .line 8
    return-object v0
.end method

.method public final o()LO3/w1;
    .locals 1

    .line 1
    iget-object v0, p0, LO3/t0;->H:LO3/w1;

    .line 2
    .line 3
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/t0;->H:LO3/w1;

    .line 7
    .line 8
    return-object v0
.end method

.method public final p()LO3/q;
    .locals 1

    .line 1
    iget-object v0, p0, LO3/t0;->I:LO3/q;

    .line 2
    .line 3
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/t0;->I:LO3/q;

    .line 7
    .line 8
    return-object v0
.end method

.method public final q()LO3/N;
    .locals 1

    .line 1
    iget-object v0, p0, LO3/t0;->J:LO3/N;

    .line 2
    .line 3
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/t0;->J:LO3/N;

    .line 7
    .line 8
    return-object v0
.end method
