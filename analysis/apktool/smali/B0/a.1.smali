.class public final LB0/a;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LB0/a;->q:I

    iput-object p2, p0, LB0/a;->r:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(LF/U;Lw/i0;)V
    .locals 0

    const/16 p2, 0xc

    iput p2, p0, LB0/a;->q:I

    .line 2
    iput-object p1, p0, LB0/a;->r:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, LB0/a;->q:I

    .line 6
    .line 7
    const/high16 v3, 0x3f000000    # 0.5f

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x1

    .line 14
    packed-switch v2, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v0, Lj0/C;

    .line 18
    .line 19
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lj0/F;

    .line 22
    .line 23
    iget v3, v2, Lj0/F;->E:F

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Lj0/C;->c(F)V

    .line 26
    .line 27
    .line 28
    iget v3, v2, Lj0/F;->F:F

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Lj0/C;->e(F)V

    .line 31
    .line 32
    .line 33
    iget v3, v2, Lj0/F;->G:F

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Lj0/C;->a(F)V

    .line 36
    .line 37
    .line 38
    iget v3, v2, Lj0/F;->H:F

    .line 39
    .line 40
    iget v4, v0, Lj0/C;->u:F

    .line 41
    .line 42
    cmpg-float v4, v4, v3

    .line 43
    .line 44
    if-nez v4, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget v4, v0, Lj0/C;->q:I

    .line 48
    .line 49
    or-int/lit8 v4, v4, 0x20

    .line 50
    .line 51
    iput v4, v0, Lj0/C;->q:I

    .line 52
    .line 53
    iput v3, v0, Lj0/C;->u:F

    .line 54
    .line 55
    :goto_0
    iget v3, v2, Lj0/F;->I:F

    .line 56
    .line 57
    iget v4, v0, Lj0/C;->x:F

    .line 58
    .line 59
    cmpg-float v4, v4, v3

    .line 60
    .line 61
    if-nez v4, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    iget v4, v0, Lj0/C;->q:I

    .line 65
    .line 66
    or-int/lit16 v4, v4, 0x800

    .line 67
    .line 68
    iput v4, v0, Lj0/C;->q:I

    .line 69
    .line 70
    iput v3, v0, Lj0/C;->x:F

    .line 71
    .line 72
    :goto_1
    iget-wide v3, v2, Lj0/F;->J:J

    .line 73
    .line 74
    invoke-virtual {v0, v3, v4}, Lj0/C;->g(J)V

    .line 75
    .line 76
    .line 77
    iget-object v3, v2, Lj0/F;->K:Lj0/E;

    .line 78
    .line 79
    iget-object v4, v0, Lj0/C;->z:Lj0/E;

    .line 80
    .line 81
    invoke-static {v4, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-nez v4, :cond_2

    .line 86
    .line 87
    iget v4, v0, Lj0/C;->q:I

    .line 88
    .line 89
    or-int/lit16 v4, v4, 0x2000

    .line 90
    .line 91
    iput v4, v0, Lj0/C;->q:I

    .line 92
    .line 93
    iput-object v3, v0, Lj0/C;->z:Lj0/E;

    .line 94
    .line 95
    :cond_2
    iget-boolean v3, v2, Lj0/F;->L:Z

    .line 96
    .line 97
    iget-boolean v4, v0, Lj0/C;->A:Z

    .line 98
    .line 99
    if-eq v4, v3, :cond_3

    .line 100
    .line 101
    iget v4, v0, Lj0/C;->q:I

    .line 102
    .line 103
    or-int/lit16 v4, v4, 0x4000

    .line 104
    .line 105
    iput v4, v0, Lj0/C;->q:I

    .line 106
    .line 107
    iput-boolean v3, v0, Lj0/C;->A:Z

    .line 108
    .line 109
    :cond_3
    iget-wide v3, v2, Lj0/F;->M:J

    .line 110
    .line 111
    iget-wide v5, v0, Lj0/C;->v:J

    .line 112
    .line 113
    invoke-static {v5, v6, v3, v4}, Lj0/o;->c(JJ)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-nez v5, :cond_4

    .line 118
    .line 119
    iget v5, v0, Lj0/C;->q:I

    .line 120
    .line 121
    or-int/lit8 v5, v5, 0x40

    .line 122
    .line 123
    iput v5, v0, Lj0/C;->q:I

    .line 124
    .line 125
    iput-wide v3, v0, Lj0/C;->v:J

    .line 126
    .line 127
    :cond_4
    iget-wide v2, v2, Lj0/F;->N:J

    .line 128
    .line 129
    iget-wide v4, v0, Lj0/C;->w:J

    .line 130
    .line 131
    invoke-static {v4, v5, v2, v3}, Lj0/o;->c(JJ)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-nez v4, :cond_5

    .line 136
    .line 137
    iget v4, v0, Lj0/C;->q:I

    .line 138
    .line 139
    or-int/lit16 v4, v4, 0x80

    .line 140
    .line 141
    iput v4, v0, Lj0/C;->q:I

    .line 142
    .line 143
    iput-wide v2, v0, Lj0/C;->w:J

    .line 144
    .line 145
    :cond_5
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 146
    .line 147
    return-object v0

    .line 148
    :pswitch_0
    sget-object v2, LB0/D0;->q:LB0/D0;

    .line 149
    .line 150
    check-cast v0, Lf0/f;

    .line 151
    .line 152
    iget-object v3, v0, Lc0/l;->q:Lc0/l;

    .line 153
    .line 154
    iget-boolean v3, v3, Lc0/l;->D:Z

    .line 155
    .line 156
    if-nez v3, :cond_6

    .line 157
    .line 158
    sget-object v2, LB0/D0;->r:LB0/D0;

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_6
    iget-object v3, v0, Lf0/f;->F:Lf0/f;

    .line 162
    .line 163
    if-eqz v3, :cond_8

    .line 164
    .line 165
    iget-object v4, v1, LB0/a;->r:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v4, Lk3/c;

    .line 168
    .line 169
    new-instance v5, LB0/a;

    .line 170
    .line 171
    const/16 v6, 0x1c

    .line 172
    .line 173
    invoke-direct {v5, v6, v4}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5, v3}, LB0/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    if-eq v4, v2, :cond_7

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_7
    invoke-static {v3, v5}, LB0/g;->y(LB0/E0;LB5/c;)V

    .line 184
    .line 185
    .line 186
    :cond_8
    :goto_2
    iput-object v7, v0, Lf0/f;->F:Lf0/f;

    .line 187
    .line 188
    iput-object v7, v0, Lf0/f;->E:Lf0/f;

    .line 189
    .line 190
    :goto_3
    return-object v2

    .line 191
    :pswitch_1
    check-cast v0, Ljava/lang/Throwable;

    .line 192
    .line 193
    iget-object v0, v1, LB0/a;->r:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, LI4/b;

    .line 196
    .line 197
    invoke-interface {v0, v6}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 198
    .line 199
    .line 200
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 201
    .line 202
    return-object v0

    .line 203
    :pswitch_2
    check-cast v0, Landroid/content/Context;

    .line 204
    .line 205
    const-string v2, "it"

    .line 206
    .line 207
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    new-instance v0, La2/b;

    .line 211
    .line 212
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v2, Landroid/content/Context;

    .line 215
    .line 216
    const-string v3, "context"

    .line 217
    .line 218
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v2}, LO3/s0;->b(Landroid/content/Context;)Landroid/adservices/measurement/MeasurementManager;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    const-string v3, "get(context)"

    .line 226
    .line 227
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-direct {v0, v2}, La2/e;-><init>(Landroid/adservices/measurement/MeasurementManager;)V

    .line 231
    .line 232
    .line 233
    return-object v0

    .line 234
    :pswitch_3
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v2, La0/t;

    .line 237
    .line 238
    iget-object v3, v2, La0/t;->g:Ljava/lang/Object;

    .line 239
    .line 240
    monitor-enter v3

    .line 241
    :try_start_0
    iget-object v2, v2, La0/t;->i:La0/s;

    .line 242
    .line 243
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    iget-object v4, v2, La0/s;->b:Ljava/lang/Object;

    .line 247
    .line 248
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    iget v5, v2, La0/s;->d:I

    .line 252
    .line 253
    iget-object v6, v2, La0/s;->c:Lr/B;

    .line 254
    .line 255
    if-nez v6, :cond_9

    .line 256
    .line 257
    new-instance v6, Lr/B;

    .line 258
    .line 259
    invoke-direct {v6}, Lr/B;-><init>()V

    .line 260
    .line 261
    .line 262
    iput-object v6, v2, La0/s;->c:Lr/B;

    .line 263
    .line 264
    iget-object v7, v2, La0/s;->f:Lr/G;

    .line 265
    .line 266
    invoke-virtual {v7, v4, v6}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    :cond_9
    invoke-virtual {v2, v0, v5, v4, v6}, La0/s;->c(Ljava/lang/Object;ILjava/lang/Object;Lr/B;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    .line 271
    .line 272
    monitor-exit v3

    .line 273
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 274
    .line 275
    return-object v0

    .line 276
    :catchall_0
    move-exception v0

    .line 277
    monitor-exit v3

    .line 278
    throw v0

    .line 279
    :pswitch_4
    check-cast v0, La0/l;

    .line 280
    .line 281
    sget-object v2, La0/n;->b:Ljava/lang/Object;

    .line 282
    .line 283
    monitor-enter v2

    .line 284
    :try_start_1
    sget-wide v3, La0/n;->d:J

    .line 285
    .line 286
    const-wide/16 v5, 0x1

    .line 287
    .line 288
    add-long/2addr v5, v3

    .line 289
    sput-wide v5, La0/n;->d:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 290
    .line 291
    monitor-exit v2

    .line 292
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v2, LB5/c;

    .line 295
    .line 296
    new-instance v5, La0/g;

    .line 297
    .line 298
    invoke-direct {v5, v3, v4, v0, v2}, La0/g;-><init>(JLa0/l;LB5/c;)V

    .line 299
    .line 300
    .line 301
    return-object v5

    .line 302
    :catchall_1
    move-exception v0

    .line 303
    monitor-exit v2

    .line 304
    throw v0

    .line 305
    :pswitch_5
    check-cast v0, LW0/c;

    .line 306
    .line 307
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v2, LB0/L;

    .line 310
    .line 311
    invoke-virtual {v2, v0}, LB0/L;->V(LW0/c;)V

    .line 312
    .line 313
    .line 314
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 315
    .line 316
    return-object v0

    .line 317
    :pswitch_6
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v2, LZ/f;

    .line 320
    .line 321
    iget-object v2, v2, LZ/f;->c:LZ/i;

    .line 322
    .line 323
    if-eqz v2, :cond_a

    .line 324
    .line 325
    invoke-interface {v2, v0}, LZ/i;->a(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v8

    .line 329
    :cond_a
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    return-object v0

    .line 334
    :pswitch_7
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v2, LP/u;

    .line 337
    .line 338
    invoke-virtual {v2, v0}, LP/u;->x(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 342
    .line 343
    return-object v0

    .line 344
    :pswitch_8
    check-cast v0, Ljava/lang/Throwable;

    .line 345
    .line 346
    const-string v2, "Recomposer effect job completed"

    .line 347
    .line 348
    new-instance v3, Ljava/util/concurrent/CancellationException;

    .line 349
    .line 350
    invoke-direct {v3, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 354
    .line 355
    .line 356
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v2, LP/v0;

    .line 359
    .line 360
    iget-object v4, v2, LP/v0;->b:Ljava/lang/Object;

    .line 361
    .line 362
    monitor-enter v4

    .line 363
    :try_start_2
    iget-object v5, v2, LP/v0;->c:LM5/b0;

    .line 364
    .line 365
    if-eqz v5, :cond_b

    .line 366
    .line 367
    iget-object v6, v2, LP/v0;->t:LP5/S;

    .line 368
    .line 369
    sget-object v8, LP/p0;->r:LP/p0;

    .line 370
    .line 371
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v6, v7, v8}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    sget-object v6, LP/v0;->x:LP5/S;

    .line 378
    .line 379
    invoke-interface {v5, v3}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 380
    .line 381
    .line 382
    iput-object v7, v2, LP/v0;->q:LM5/h;

    .line 383
    .line 384
    new-instance v3, LA/Y;

    .line 385
    .line 386
    const/16 v6, 0x12

    .line 387
    .line 388
    invoke-direct {v3, v6, v2, v0}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    invoke-interface {v5, v3}, LM5/b0;->G(LB5/c;)LM5/J;

    .line 392
    .line 393
    .line 394
    goto :goto_4

    .line 395
    :catchall_2
    move-exception v0

    .line 396
    goto :goto_5

    .line 397
    :cond_b
    iput-object v3, v2, LP/v0;->d:Ljava/lang/Throwable;

    .line 398
    .line 399
    iget-object v0, v2, LP/v0;->t:LP5/S;

    .line 400
    .line 401
    sget-object v2, LP/p0;->q:LP/p0;

    .line 402
    .line 403
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0, v7, v2}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 407
    .line 408
    .line 409
    :goto_4
    monitor-exit v4

    .line 410
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 411
    .line 412
    return-object v0

    .line 413
    :goto_5
    monitor-exit v4

    .line 414
    throw v0

    .line 415
    :pswitch_9
    check-cast v0, LO0/q;

    .line 416
    .line 417
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v2, LO0/e;

    .line 420
    .line 421
    iget-object v5, v0, LO0/q;->b:LO0/j;

    .line 422
    .line 423
    iget v6, v0, LO0/q;->c:I

    .line 424
    .line 425
    iget v7, v0, LO0/q;->d:I

    .line 426
    .line 427
    iget-object v8, v0, LO0/q;->e:Ljava/lang/Object;

    .line 428
    .line 429
    new-instance v3, LO0/q;

    .line 430
    .line 431
    const/4 v4, 0x0

    .line 432
    invoke-direct/range {v3 .. v8}, LO0/q;-><init>(LO0/p;LO0/j;IILjava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2, v3}, LO0/e;->a(LO0/q;)LO0/r;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    iget-object v0, v0, LO0/r;->q:Ljava/lang/Object;

    .line 440
    .line 441
    return-object v0

    .line 442
    :pswitch_a
    const-string v2, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 443
    .line 444
    const-string v3, "Iconics.init() not yet executed, icon will be missing"

    .line 445
    .line 446
    const-string v5, "A \'Iconics.init(context)\' has to happen first. Call from your application. Usually this happens via an \'IconicsDrawable\' usage."

    .line 447
    .line 448
    const-string v9, "IconicsDrawable"

    .line 449
    .line 450
    move-object v10, v0

    .line 451
    check-cast v10, LK4/d;

    .line 452
    .line 453
    const-string v0, "$this$apply"

    .line 454
    .line 455
    invoke-static {v10, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    iget-object v0, v1, LB0/a;->r:Ljava/lang/Object;

    .line 459
    .line 460
    move-object v11, v0

    .line 461
    check-cast v11, Lk3/d;

    .line 462
    .line 463
    iget-object v0, v11, Lk3/d;->r:Ljava/lang/Object;

    .line 464
    .line 465
    move-object v12, v0

    .line 466
    check-cast v12, Landroid/content/res/TypedArray;

    .line 467
    .line 468
    const/16 v0, 0x9

    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v13

    .line 474
    if-eqz v13, :cond_12

    .line 475
    .line 476
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    if-nez v0, :cond_c

    .line 481
    .line 482
    goto/16 :goto_8

    .line 483
    .line 484
    :cond_c
    const-string v14, "No font identified matching the given `"

    .line 485
    .line 486
    sget-object v0, LK4/a;->a:Ljava/util/HashMap;

    .line 487
    .line 488
    :try_start_3
    sget-object v0, LO4/c;->b:Landroid/content/Context;

    .line 489
    .line 490
    if-eqz v0, :cond_d

    .line 491
    .line 492
    goto :goto_6

    .line 493
    :cond_d
    new-instance v0, Ljava/lang/RuntimeException;

    .line 494
    .line 495
    invoke-direct {v0, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 499
    :catchall_3
    move-exception v0

    .line 500
    invoke-static {v0}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    :goto_6
    instance-of v0, v0, Lm5/l;

    .line 505
    .line 506
    if-eqz v0, :cond_e

    .line 507
    .line 508
    invoke-static {v9, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 509
    .line 510
    .line 511
    :cond_e
    :try_start_4
    invoke-virtual {v13, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    sget-object v15, LO4/c;->c:Ljava/util/HashMap;

    .line 519
    .line 520
    invoke-virtual {v15, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    check-cast v0, LO4/b;

    .line 525
    .line 526
    if-nez v0, :cond_f

    .line 527
    .line 528
    new-instance v0, Ljava/lang/StringBuilder;

    .line 529
    .line 530
    invoke-direct {v0, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v13, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v3

    .line 537
    invoke-static {v3, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    const-string v2, "` prefix"

    .line 544
    .line 545
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-static {v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 553
    .line 554
    .line 555
    goto :goto_8

    .line 556
    :cond_f
    const-string v2, "-"

    .line 557
    .line 558
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    const-string v14, "compile(...)"

    .line 563
    .line 564
    invoke-static {v2, v14}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    const-string v14, "_"

    .line 568
    .line 569
    invoke-virtual {v2, v13}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    invoke-virtual {v2, v14}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v2

    .line 577
    const-string v14, "replaceAll(...)"

    .line 578
    .line 579
    invoke-static {v2, v14}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    invoke-interface {v0, v2}, LO4/b;->getIcon(Ljava/lang/String;)LO4/a;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    const-string v0, "icon"

    .line 587
    .line 588
    invoke-static {v2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    sget-object v0, LK4/a;->a:Ljava/util/HashMap;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 592
    .line 593
    :try_start_5
    sget-object v0, LO4/c;->b:Landroid/content/Context;

    .line 594
    .line 595
    if-eqz v0, :cond_10

    .line 596
    .line 597
    goto :goto_7

    .line 598
    :cond_10
    new-instance v0, Ljava/lang/RuntimeException;

    .line 599
    .line 600
    invoke-direct {v0, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 604
    :catchall_4
    move-exception v0

    .line 605
    :try_start_6
    invoke-static {v0}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    :goto_7
    instance-of v0, v0, Lm5/l;

    .line 610
    .line 611
    if-eqz v0, :cond_11

    .line 612
    .line 613
    invoke-static {v9, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 614
    .line 615
    .line 616
    :cond_11
    invoke-virtual {v10, v2}, LK4/d;->e(LO4/a;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 617
    .line 618
    .line 619
    goto :goto_8

    .line 620
    :catch_0
    sget-object v0, LK4/a;->c:LQ4/a;

    .line 621
    .line 622
    sget-object v2, LK4/a;->b:Ljava/lang/String;

    .line 623
    .line 624
    const-string v3, "TAG"

    .line 625
    .line 626
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    const-string v3, "Wrong icon name: "

    .line 630
    .line 631
    invoke-virtual {v3, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    invoke-virtual {v0, v2, v3, v7}, LQ4/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ReflectiveOperationException;)V

    .line 636
    .line 637
    .line 638
    :cond_12
    :goto_8
    const/4 v0, 0x5

    .line 639
    invoke-virtual {v12, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    if-eqz v0, :cond_13

    .line 644
    .line 645
    iget-object v2, v10, LK4/d;->c:LK4/b;

    .line 646
    .line 647
    iput-object v0, v2, LK4/b;->c:Landroid/content/res/ColorStateList;

    .line 648
    .line 649
    invoke-virtual {v10}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-virtual {v2, v0}, LK4/b;->a([I)Z

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    if-eqz v0, :cond_13

    .line 658
    .line 659
    invoke-virtual {v10}, LK4/d;->a()V

    .line 660
    .line 661
    .line 662
    :cond_13
    const/16 v0, 0x11

    .line 663
    .line 664
    invoke-static {v11, v12, v0}, Lk3/d;->r(Lk3/d;Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    if-eqz v0, :cond_14

    .line 669
    .line 670
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    iput v0, v10, LK4/d;->o:I

    .line 675
    .line 676
    iget v2, v10, LK4/d;->p:I

    .line 677
    .line 678
    invoke-virtual {v10, v6, v6, v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 679
    .line 680
    .line 681
    iput v0, v10, LK4/d;->p:I

    .line 682
    .line 683
    iget v2, v10, LK4/d;->o:I

    .line 684
    .line 685
    invoke-virtual {v10, v6, v6, v2, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 686
    .line 687
    .line 688
    :cond_14
    const/16 v0, 0xc

    .line 689
    .line 690
    invoke-static {v11, v12, v0}, Lk3/d;->r(Lk3/d;Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    if-eqz v0, :cond_15

    .line 695
    .line 696
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 697
    .line 698
    .line 699
    move-result v0

    .line 700
    invoke-virtual {v10, v0}, LK4/d;->f(I)V

    .line 701
    .line 702
    .line 703
    :cond_15
    const/4 v0, 0x6

    .line 704
    invoke-virtual {v12, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    if-eqz v0, :cond_16

    .line 709
    .line 710
    iget-object v2, v10, LK4/d;->f:LK4/b;

    .line 711
    .line 712
    iput-object v0, v2, LK4/b;->c:Landroid/content/res/ColorStateList;

    .line 713
    .line 714
    invoke-virtual {v10}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    invoke-virtual {v2, v0}, LK4/b;->a([I)Z

    .line 719
    .line 720
    .line 721
    move-result v0

    .line 722
    if-eqz v0, :cond_16

    .line 723
    .line 724
    invoke-virtual {v10}, LK4/d;->a()V

    .line 725
    .line 726
    .line 727
    :cond_16
    const/4 v0, 0x7

    .line 728
    invoke-static {v11, v12, v0}, Lk3/d;->r(Lk3/d;Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    if-eqz v0, :cond_18

    .line 733
    .line 734
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 735
    .line 736
    .line 737
    move-result v0

    .line 738
    iput v0, v10, LK4/d;->v:I

    .line 739
    .line 740
    iget-object v2, v10, LK4/d;->f:LK4/b;

    .line 741
    .line 742
    iget-object v2, v2, LK4/b;->a:Landroid/graphics/Paint;

    .line 743
    .line 744
    int-to-float v0, v0

    .line 745
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 746
    .line 747
    .line 748
    iget-boolean v0, v10, LK4/d;->q:Z

    .line 749
    .line 750
    if-eq v8, v0, :cond_17

    .line 751
    .line 752
    iput-boolean v8, v10, LK4/d;->q:Z

    .line 753
    .line 754
    iget v0, v10, LK4/d;->u:I

    .line 755
    .line 756
    iget v2, v10, LK4/d;->v:I

    .line 757
    .line 758
    add-int/2addr v2, v0

    .line 759
    invoke-virtual {v10, v2}, LK4/d;->f(I)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v10}, LK4/d;->a()V

    .line 763
    .line 764
    .line 765
    :cond_17
    invoke-virtual {v10}, LK4/d;->a()V

    .line 766
    .line 767
    .line 768
    :cond_18
    const/4 v0, 0x2

    .line 769
    invoke-virtual {v12, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    if-eqz v0, :cond_19

    .line 774
    .line 775
    invoke-virtual {v10, v0}, LK4/d;->c(Landroid/content/res/ColorStateList;)V

    .line 776
    .line 777
    .line 778
    :cond_19
    const/16 v0, 0x8

    .line 779
    .line 780
    invoke-static {v11, v12, v0}, Lk3/d;->r(Lk3/d;Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    if-eqz v0, :cond_1a

    .line 785
    .line 786
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 787
    .line 788
    .line 789
    move-result v0

    .line 790
    int-to-float v0, v0

    .line 791
    iput v0, v10, LK4/d;->s:F

    .line 792
    .line 793
    invoke-virtual {v10}, LK4/d;->a()V

    .line 794
    .line 795
    .line 796
    iput v0, v10, LK4/d;->t:F

    .line 797
    .line 798
    invoke-virtual {v10}, LK4/d;->a()V

    .line 799
    .line 800
    .line 801
    :cond_1a
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    if-eqz v0, :cond_1b

    .line 806
    .line 807
    iget-object v2, v10, LK4/d;->d:LK4/b;

    .line 808
    .line 809
    iput-object v0, v2, LK4/b;->c:Landroid/content/res/ColorStateList;

    .line 810
    .line 811
    invoke-virtual {v10}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    invoke-virtual {v2, v0}, LK4/b;->a([I)Z

    .line 816
    .line 817
    .line 818
    move-result v0

    .line 819
    if-eqz v0, :cond_1b

    .line 820
    .line 821
    invoke-virtual {v10}, LK4/d;->a()V

    .line 822
    .line 823
    .line 824
    :cond_1b
    const/4 v0, 0x4

    .line 825
    invoke-static {v11, v12, v0}, Lk3/d;->r(Lk3/d;Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    if-eqz v0, :cond_1c

    .line 830
    .line 831
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 832
    .line 833
    .line 834
    move-result v0

    .line 835
    iput v0, v10, LK4/d;->w:I

    .line 836
    .line 837
    iget-object v2, v10, LK4/d;->d:LK4/b;

    .line 838
    .line 839
    iget-object v2, v2, LK4/b;->a:Landroid/graphics/Paint;

    .line 840
    .line 841
    int-to-float v0, v0

    .line 842
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 843
    .line 844
    .line 845
    invoke-virtual {v10, v8}, LK4/d;->d(Z)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v10}, LK4/d;->a()V

    .line 849
    .line 850
    .line 851
    :cond_1c
    const/16 v0, 0x10

    .line 852
    .line 853
    invoke-static {v11, v12, v0}, Lk3/d;->r(Lk3/d;Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    .line 854
    .line 855
    .line 856
    move-result-object v14

    .line 857
    const/16 v0, 0xe

    .line 858
    .line 859
    invoke-static {v11, v12, v0}, Lk3/d;->r(Lk3/d;Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    .line 860
    .line 861
    .line 862
    move-result-object v15

    .line 863
    const/16 v0, 0xf

    .line 864
    .line 865
    invoke-static {v11, v12, v0}, Lk3/d;->r(Lk3/d;Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    .line 866
    .line 867
    .line 868
    move-result-object v16

    .line 869
    const/16 v0, 0xd

    .line 870
    .line 871
    const/high16 v2, -0x80000000

    .line 872
    .line 873
    invoke-virtual {v12, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 874
    .line 875
    .line 876
    move-result v0

    .line 877
    if-eqz v14, :cond_1d

    .line 878
    .line 879
    if-eqz v15, :cond_1d

    .line 880
    .line 881
    if-eqz v16, :cond_1d

    .line 882
    .line 883
    if-eq v0, v2, :cond_1d

    .line 884
    .line 885
    new-instance v13, LA/P;

    .line 886
    .line 887
    const/16 v18, 0x1

    .line 888
    .line 889
    move/from16 v17, v0

    .line 890
    .line 891
    invoke-direct/range {v13 .. v18}, LA/P;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 892
    .line 893
    .line 894
    iput-boolean v6, v10, LK4/d;->n:Z

    .line 895
    .line 896
    invoke-virtual {v13, v10}, LA/P;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    iput-boolean v8, v10, LK4/d;->n:Z

    .line 900
    .line 901
    invoke-virtual {v10}, LK4/d;->j()V

    .line 902
    .line 903
    .line 904
    :cond_1d
    invoke-virtual {v12, v8, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 905
    .line 906
    .line 907
    move-result v0

    .line 908
    iput-boolean v0, v10, LK4/d;->l:Z

    .line 909
    .line 910
    invoke-virtual {v10, v0}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v10}, LK4/d;->a()V

    .line 914
    .line 915
    .line 916
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 917
    .line 918
    return-object v0

    .line 919
    :pswitch_b
    check-cast v0, Ljava/lang/Number;

    .line 920
    .line 921
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 922
    .line 923
    .line 924
    iget-object v0, v1, LB0/a;->r:Ljava/lang/Object;

    .line 925
    .line 926
    check-cast v0, LW0/c;

    .line 927
    .line 928
    const/16 v2, 0x38

    .line 929
    .line 930
    int-to-float v2, v2

    .line 931
    invoke-interface {v0, v2}, LW0/c;->u(F)F

    .line 932
    .line 933
    .line 934
    move-result v0

    .line 935
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 936
    .line 937
    .line 938
    move-result-object v0

    .line 939
    return-object v0

    .line 940
    :pswitch_c
    check-cast v0, Lj0/C;

    .line 941
    .line 942
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 943
    .line 944
    check-cast v2, Lu/c;

    .line 945
    .line 946
    invoke-virtual {v2}, Lu/c;->d()Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    move-result-object v2

    .line 950
    check-cast v2, Ljava/lang/Number;

    .line 951
    .line 952
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 953
    .line 954
    .line 955
    move-result v2

    .line 956
    invoke-static {v0, v2}, LM/g0;->d(Lj0/C;F)F

    .line 957
    .line 958
    .line 959
    move-result v3

    .line 960
    invoke-static {v0, v2}, LM/g0;->e(Lj0/C;F)F

    .line 961
    .line 962
    .line 963
    move-result v2

    .line 964
    cmpg-float v4, v2, v5

    .line 965
    .line 966
    if-nez v4, :cond_1e

    .line 967
    .line 968
    const/high16 v2, 0x3f800000    # 1.0f

    .line 969
    .line 970
    goto :goto_9

    .line 971
    :cond_1e
    div-float v2, v3, v2

    .line 972
    .line 973
    :goto_9
    invoke-virtual {v0, v2}, Lj0/C;->e(F)V

    .line 974
    .line 975
    .line 976
    sget-wide v2, LM/g0;->c:J

    .line 977
    .line 978
    invoke-virtual {v0, v2, v3}, Lj0/C;->g(J)V

    .line 979
    .line 980
    .line 981
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 982
    .line 983
    return-object v0

    .line 984
    :pswitch_d
    check-cast v0, Ljava/util/List;

    .line 985
    .line 986
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 987
    .line 988
    check-cast v2, LE/Q;

    .line 989
    .line 990
    invoke-virtual {v2}, LE/Q;->invoke()Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v2

    .line 994
    check-cast v2, Ljava/lang/Float;

    .line 995
    .line 996
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 997
    .line 998
    .line 999
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0

    .line 1003
    return-object v0

    .line 1004
    :pswitch_e
    check-cast v0, LI0/i;

    .line 1005
    .line 1006
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 1007
    .line 1008
    check-cast v2, LI0/f;

    .line 1009
    .line 1010
    iget v2, v2, LI0/f;->a:I

    .line 1011
    .line 1012
    invoke-static {v0, v2}, LI0/r;->d(LI0/i;I)V

    .line 1013
    .line 1014
    .line 1015
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 1016
    .line 1017
    return-object v0

    .line 1018
    :pswitch_f
    check-cast v0, Ljava/lang/Throwable;

    .line 1019
    .line 1020
    if-eqz v0, :cond_1f

    .line 1021
    .line 1022
    iget-object v0, v1, LB0/a;->r:Ljava/lang/Object;

    .line 1023
    .line 1024
    check-cast v0, Landroid/os/CancellationSignal;

    .line 1025
    .line 1026
    invoke-virtual {v0}, Landroid/os/CancellationSignal;->cancel()V

    .line 1027
    .line 1028
    .line 1029
    :cond_1f
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 1030
    .line 1031
    return-object v0

    .line 1032
    :pswitch_10
    check-cast v0, Ljava/lang/Number;

    .line 1033
    .line 1034
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 1035
    .line 1036
    .line 1037
    move-result v0

    .line 1038
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 1039
    .line 1040
    check-cast v2, LF/U;

    .line 1041
    .line 1042
    iget-object v2, v2, LF/U;->b:LF/e;

    .line 1043
    .line 1044
    invoke-virtual {v2}, LF/N;->n()I

    .line 1045
    .line 1046
    .line 1047
    move-result v3

    .line 1048
    if-eqz v3, :cond_20

    .line 1049
    .line 1050
    invoke-virtual {v2}, LF/N;->n()I

    .line 1051
    .line 1052
    .line 1053
    move-result v3

    .line 1054
    int-to-float v3, v3

    .line 1055
    div-float v5, v0, v3

    .line 1056
    .line 1057
    :cond_20
    invoke-static {v5}, LD5/a;->G(F)I

    .line 1058
    .line 1059
    .line 1060
    move-result v0

    .line 1061
    invoke-virtual {v2}, LF/N;->j()I

    .line 1062
    .line 1063
    .line 1064
    move-result v3

    .line 1065
    add-int/2addr v3, v0

    .line 1066
    invoke-virtual {v2, v3}, LF/N;->i(I)I

    .line 1067
    .line 1068
    .line 1069
    move-result v0

    .line 1070
    iget-object v2, v2, LF/N;->s:LP/c0;

    .line 1071
    .line 1072
    invoke-virtual {v2, v0}, LP/c0;->f(I)V

    .line 1073
    .line 1074
    .line 1075
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 1076
    .line 1077
    return-object v0

    .line 1078
    :pswitch_11
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 1079
    .line 1080
    check-cast v2, LZ/i;

    .line 1081
    .line 1082
    if-eqz v2, :cond_21

    .line 1083
    .line 1084
    invoke-interface {v2, v0}, LZ/i;->a(Ljava/lang/Object;)Z

    .line 1085
    .line 1086
    .line 1087
    move-result v8

    .line 1088
    :cond_21
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v0

    .line 1092
    return-object v0

    .line 1093
    :pswitch_12
    check-cast v0, LP/F;

    .line 1094
    .line 1095
    iget-object v0, v1, LB0/a;->r:Ljava/lang/Object;

    .line 1096
    .line 1097
    check-cast v0, LE/G;

    .line 1098
    .line 1099
    new-instance v2, LC0/Y;

    .line 1100
    .line 1101
    invoke-direct {v2, v4, v0}, LC0/Y;-><init>(ILjava/lang/Object;)V

    .line 1102
    .line 1103
    .line 1104
    return-object v2

    .line 1105
    :pswitch_13
    check-cast v0, LP/F;

    .line 1106
    .line 1107
    iget-object v0, v1, LB0/a;->r:Ljava/lang/Object;

    .line 1108
    .line 1109
    check-cast v0, LE/t;

    .line 1110
    .line 1111
    new-instance v2, LC0/Y;

    .line 1112
    .line 1113
    invoke-direct {v2, v8, v0}, LC0/Y;-><init>(ILjava/lang/Object;)V

    .line 1114
    .line 1115
    .line 1116
    return-object v2

    .line 1117
    :pswitch_14
    check-cast v0, Ljava/lang/Number;

    .line 1118
    .line 1119
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 1120
    .line 1121
    .line 1122
    move-result v0

    .line 1123
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 1124
    .line 1125
    check-cast v2, LD/y;

    .line 1126
    .line 1127
    neg-float v0, v0

    .line 1128
    cmpg-float v4, v0, v5

    .line 1129
    .line 1130
    if-gez v4, :cond_22

    .line 1131
    .line 1132
    invoke-virtual {v2}, LD/y;->c()Z

    .line 1133
    .line 1134
    .line 1135
    move-result v4

    .line 1136
    if-eqz v4, :cond_2b

    .line 1137
    .line 1138
    :cond_22
    cmpl-float v4, v0, v5

    .line 1139
    .line 1140
    if-lez v4, :cond_23

    .line 1141
    .line 1142
    invoke-virtual {v2}, LD/y;->a()Z

    .line 1143
    .line 1144
    .line 1145
    move-result v4

    .line 1146
    if-nez v4, :cond_23

    .line 1147
    .line 1148
    goto/16 :goto_d

    .line 1149
    .line 1150
    :cond_23
    iget v4, v2, LD/y;->g:F

    .line 1151
    .line 1152
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 1153
    .line 1154
    .line 1155
    move-result v4

    .line 1156
    cmpg-float v4, v4, v3

    .line 1157
    .line 1158
    if-gtz v4, :cond_24

    .line 1159
    .line 1160
    goto :goto_a

    .line 1161
    :cond_24
    const-string v4, "entered drag with non-zero pending scroll"

    .line 1162
    .line 1163
    invoke-static {v4}, Lz/a;->c(Ljava/lang/String;)V

    .line 1164
    .line 1165
    .line 1166
    :goto_a
    iget v4, v2, LD/y;->g:F

    .line 1167
    .line 1168
    add-float/2addr v4, v0

    .line 1169
    iput v4, v2, LD/y;->g:F

    .line 1170
    .line 1171
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 1172
    .line 1173
    .line 1174
    move-result v4

    .line 1175
    cmpl-float v4, v4, v3

    .line 1176
    .line 1177
    if-lez v4, :cond_29

    .line 1178
    .line 1179
    iget v4, v2, LD/y;->g:F

    .line 1180
    .line 1181
    invoke-static {v4}, LD5/a;->G(F)I

    .line 1182
    .line 1183
    .line 1184
    move-result v6

    .line 1185
    iget-object v9, v2, LD/y;->e:LP/f0;

    .line 1186
    .line 1187
    invoke-virtual {v9}, LP/f0;->getValue()Ljava/lang/Object;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v9

    .line 1191
    check-cast v9, LD/o;

    .line 1192
    .line 1193
    iget-boolean v10, v2, LD/y;->b:Z

    .line 1194
    .line 1195
    xor-int/2addr v10, v8

    .line 1196
    invoke-virtual {v9, v6, v10}, LD/o;->f(IZ)LD/o;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v9

    .line 1200
    if-eqz v9, :cond_25

    .line 1201
    .line 1202
    iget-object v10, v2, LD/y;->c:LD/o;

    .line 1203
    .line 1204
    if-eqz v10, :cond_25

    .line 1205
    .line 1206
    invoke-virtual {v10, v6, v8}, LD/o;->f(IZ)LD/o;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v6

    .line 1210
    if-eqz v6, :cond_26

    .line 1211
    .line 1212
    iput-object v6, v2, LD/y;->c:LD/o;

    .line 1213
    .line 1214
    :cond_25
    move-object v7, v9

    .line 1215
    :cond_26
    if-eqz v7, :cond_27

    .line 1216
    .line 1217
    iget-boolean v6, v2, LD/y;->b:Z

    .line 1218
    .line 1219
    invoke-virtual {v2, v7, v6, v8}, LD/y;->f(LD/o;ZZ)V

    .line 1220
    .line 1221
    .line 1222
    iget-object v6, v2, LD/y;->r:LP/W;

    .line 1223
    .line 1224
    sget-object v8, Lm5/y;->a:Lm5/y;

    .line 1225
    .line 1226
    invoke-interface {v6, v8}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 1227
    .line 1228
    .line 1229
    iget v6, v2, LD/y;->g:F

    .line 1230
    .line 1231
    sub-float/2addr v4, v6

    .line 1232
    invoke-virtual {v2, v4, v7}, LD/y;->h(FLD/o;)V

    .line 1233
    .line 1234
    .line 1235
    goto :goto_b

    .line 1236
    :cond_27
    iget-object v6, v2, LD/y;->j:LB0/L;

    .line 1237
    .line 1238
    if-eqz v6, :cond_28

    .line 1239
    .line 1240
    invoke-virtual {v6}, LB0/L;->l()V

    .line 1241
    .line 1242
    .line 1243
    :cond_28
    iget v6, v2, LD/y;->g:F

    .line 1244
    .line 1245
    sub-float/2addr v4, v6

    .line 1246
    invoke-virtual {v2}, LD/y;->g()LD/o;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v6

    .line 1250
    invoke-virtual {v2, v4, v6}, LD/y;->h(FLD/o;)V

    .line 1251
    .line 1252
    .line 1253
    :cond_29
    :goto_b
    iget v4, v2, LD/y;->g:F

    .line 1254
    .line 1255
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 1256
    .line 1257
    .line 1258
    move-result v4

    .line 1259
    cmpg-float v3, v4, v3

    .line 1260
    .line 1261
    if-gtz v3, :cond_2a

    .line 1262
    .line 1263
    :goto_c
    move v5, v0

    .line 1264
    goto :goto_d

    .line 1265
    :cond_2a
    iget v3, v2, LD/y;->g:F

    .line 1266
    .line 1267
    sub-float/2addr v0, v3

    .line 1268
    iput v5, v2, LD/y;->g:F

    .line 1269
    .line 1270
    goto :goto_c

    .line 1271
    :cond_2b
    :goto_d
    neg-float v0, v5

    .line 1272
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v0

    .line 1276
    return-object v0

    .line 1277
    :pswitch_15
    check-cast v0, Ll0/d;

    .line 1278
    .line 1279
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 1280
    .line 1281
    check-cast v2, LC0/C0;

    .line 1282
    .line 1283
    invoke-interface {v0}, Ll0/d;->z()LB0/G0;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v3

    .line 1287
    invoke-virtual {v3}, LB0/G0;->t()Lj0/m;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v3

    .line 1291
    iget-object v2, v2, LC0/C0;->t:LB5/e;

    .line 1292
    .line 1293
    if-eqz v2, :cond_2c

    .line 1294
    .line 1295
    invoke-interface {v0}, Ll0/d;->z()LB0/G0;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v0

    .line 1299
    iget-object v0, v0, LB0/G0;->s:Ljava/lang/Object;

    .line 1300
    .line 1301
    check-cast v0, Lm0/c;

    .line 1302
    .line 1303
    invoke-interface {v2, v3, v0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1304
    .line 1305
    .line 1306
    :cond_2c
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 1307
    .line 1308
    return-object v0

    .line 1309
    :pswitch_16
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 1310
    .line 1311
    sget-object v2, LC0/B0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1312
    .line 1313
    invoke-virtual {v2, v6, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1314
    .line 1315
    .line 1316
    move-result v2

    .line 1317
    if-eqz v2, :cond_2d

    .line 1318
    .line 1319
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 1320
    .line 1321
    check-cast v2, LO5/e;

    .line 1322
    .line 1323
    invoke-interface {v2, v0}, LO5/w;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1324
    .line 1325
    .line 1326
    :cond_2d
    return-object v0

    .line 1327
    :pswitch_17
    check-cast v0, LP/F;

    .line 1328
    .line 1329
    iget-object v0, v1, LB0/a;->r:Ljava/lang/Object;

    .line 1330
    .line 1331
    check-cast v0, LC0/w0;

    .line 1332
    .line 1333
    new-instance v2, LC0/Y;

    .line 1334
    .line 1335
    invoke-direct {v2, v6, v0}, LC0/Y;-><init>(ILjava/lang/Object;)V

    .line 1336
    .line 1337
    .line 1338
    return-object v2

    .line 1339
    :pswitch_18
    check-cast v0, Landroid/content/res/Configuration;

    .line 1340
    .line 1341
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 1342
    .line 1343
    check-cast v2, LP/W;

    .line 1344
    .line 1345
    new-instance v3, Landroid/content/res/Configuration;

    .line 1346
    .line 1347
    invoke-direct {v3, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 1348
    .line 1349
    .line 1350
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:LP/z;

    .line 1351
    .line 1352
    invoke-interface {v2, v3}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 1353
    .line 1354
    .line 1355
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 1356
    .line 1357
    return-object v0

    .line 1358
    :pswitch_19
    check-cast v0, Ljava/lang/Number;

    .line 1359
    .line 1360
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 1361
    .line 1362
    .line 1363
    move-result v0

    .line 1364
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 1365
    .line 1366
    check-cast v2, LC/A;

    .line 1367
    .line 1368
    neg-float v0, v0

    .line 1369
    cmpg-float v4, v0, v5

    .line 1370
    .line 1371
    if-gez v4, :cond_2e

    .line 1372
    .line 1373
    invoke-virtual {v2}, LC/A;->c()Z

    .line 1374
    .line 1375
    .line 1376
    move-result v4

    .line 1377
    if-eqz v4, :cond_37

    .line 1378
    .line 1379
    :cond_2e
    cmpl-float v4, v0, v5

    .line 1380
    .line 1381
    if-lez v4, :cond_2f

    .line 1382
    .line 1383
    invoke-virtual {v2}, LC/A;->a()Z

    .line 1384
    .line 1385
    .line 1386
    move-result v4

    .line 1387
    if-nez v4, :cond_2f

    .line 1388
    .line 1389
    goto/16 :goto_11

    .line 1390
    .line 1391
    :cond_2f
    iget v4, v2, LC/A;->g:F

    .line 1392
    .line 1393
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 1394
    .line 1395
    .line 1396
    move-result v4

    .line 1397
    cmpg-float v4, v4, v3

    .line 1398
    .line 1399
    if-gtz v4, :cond_30

    .line 1400
    .line 1401
    goto :goto_e

    .line 1402
    :cond_30
    const-string v4, "entered drag with non-zero pending scroll"

    .line 1403
    .line 1404
    invoke-static {v4}, Lz/a;->c(Ljava/lang/String;)V

    .line 1405
    .line 1406
    .line 1407
    :goto_e
    iget v4, v2, LC/A;->g:F

    .line 1408
    .line 1409
    add-float/2addr v4, v0

    .line 1410
    iput v4, v2, LC/A;->g:F

    .line 1411
    .line 1412
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 1413
    .line 1414
    .line 1415
    move-result v4

    .line 1416
    cmpl-float v4, v4, v3

    .line 1417
    .line 1418
    if-lez v4, :cond_35

    .line 1419
    .line 1420
    iget v4, v2, LC/A;->g:F

    .line 1421
    .line 1422
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 1423
    .line 1424
    .line 1425
    move-result v6

    .line 1426
    iget-object v9, v2, LC/A;->e:LP/f0;

    .line 1427
    .line 1428
    invoke-virtual {v9}, LP/f0;->getValue()Ljava/lang/Object;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v9

    .line 1432
    check-cast v9, LC/s;

    .line 1433
    .line 1434
    iget-boolean v10, v2, LC/A;->b:Z

    .line 1435
    .line 1436
    xor-int/2addr v10, v8

    .line 1437
    invoke-virtual {v9, v6, v10}, LC/s;->f(IZ)LC/s;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v9

    .line 1441
    if-eqz v9, :cond_31

    .line 1442
    .line 1443
    iget-object v10, v2, LC/A;->c:LC/s;

    .line 1444
    .line 1445
    if-eqz v10, :cond_31

    .line 1446
    .line 1447
    invoke-virtual {v10, v6, v8}, LC/s;->f(IZ)LC/s;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v6

    .line 1451
    if-eqz v6, :cond_32

    .line 1452
    .line 1453
    iput-object v6, v2, LC/A;->c:LC/s;

    .line 1454
    .line 1455
    :cond_31
    move-object v7, v9

    .line 1456
    :cond_32
    if-eqz v7, :cond_33

    .line 1457
    .line 1458
    iget-boolean v6, v2, LC/A;->b:Z

    .line 1459
    .line 1460
    invoke-virtual {v2, v7, v6, v8}, LC/A;->f(LC/s;ZZ)V

    .line 1461
    .line 1462
    .line 1463
    iget-object v6, v2, LC/A;->u:LP/W;

    .line 1464
    .line 1465
    sget-object v8, Lm5/y;->a:Lm5/y;

    .line 1466
    .line 1467
    invoke-interface {v6, v8}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 1468
    .line 1469
    .line 1470
    iget v6, v2, LC/A;->g:F

    .line 1471
    .line 1472
    sub-float/2addr v4, v6

    .line 1473
    invoke-virtual {v2, v4, v7}, LC/A;->h(FLC/s;)V

    .line 1474
    .line 1475
    .line 1476
    goto :goto_f

    .line 1477
    :cond_33
    iget-object v6, v2, LC/A;->j:LB0/L;

    .line 1478
    .line 1479
    if-eqz v6, :cond_34

    .line 1480
    .line 1481
    invoke-virtual {v6}, LB0/L;->l()V

    .line 1482
    .line 1483
    .line 1484
    :cond_34
    iget v6, v2, LC/A;->g:F

    .line 1485
    .line 1486
    sub-float/2addr v4, v6

    .line 1487
    invoke-virtual {v2}, LC/A;->g()LC/s;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v6

    .line 1491
    invoke-virtual {v2, v4, v6}, LC/A;->h(FLC/s;)V

    .line 1492
    .line 1493
    .line 1494
    :cond_35
    :goto_f
    iget v4, v2, LC/A;->g:F

    .line 1495
    .line 1496
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 1497
    .line 1498
    .line 1499
    move-result v4

    .line 1500
    cmpg-float v3, v4, v3

    .line 1501
    .line 1502
    if-gtz v3, :cond_36

    .line 1503
    .line 1504
    :goto_10
    move v5, v0

    .line 1505
    goto :goto_11

    .line 1506
    :cond_36
    iget v3, v2, LC/A;->g:F

    .line 1507
    .line 1508
    sub-float/2addr v0, v3

    .line 1509
    iput v5, v2, LC/A;->g:F

    .line 1510
    .line 1511
    goto :goto_10

    .line 1512
    :cond_37
    :goto_11
    neg-float v0, v5

    .line 1513
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v0

    .line 1517
    return-object v0

    .line 1518
    :pswitch_1a
    check-cast v0, Ljava/lang/Number;

    .line 1519
    .line 1520
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1521
    .line 1522
    .line 1523
    move-result v0

    .line 1524
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 1525
    .line 1526
    check-cast v2, LC/n;

    .line 1527
    .line 1528
    iget-wide v3, v2, LC/n;->c:J

    .line 1529
    .line 1530
    invoke-virtual {v2, v0, v3, v4}, LC/n;->a(IJ)LC/t;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v0

    .line 1534
    return-object v0

    .line 1535
    :pswitch_1b
    check-cast v0, Lc0/k;

    .line 1536
    .line 1537
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 1538
    .line 1539
    check-cast v2, LR/e;

    .line 1540
    .line 1541
    invoke-virtual {v2, v0}, LR/e;->c(Ljava/lang/Object;)V

    .line 1542
    .line 1543
    .line 1544
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1545
    .line 1546
    return-object v0

    .line 1547
    :pswitch_1c
    check-cast v0, LB0/b;

    .line 1548
    .line 1549
    iget-object v2, v1, LB0/a;->r:Ljava/lang/Object;

    .line 1550
    .line 1551
    check-cast v2, LB0/M;

    .line 1552
    .line 1553
    invoke-interface {v0}, LB0/b;->A()Z

    .line 1554
    .line 1555
    .line 1556
    move-result v3

    .line 1557
    if-nez v3, :cond_38

    .line 1558
    .line 1559
    goto/16 :goto_15

    .line 1560
    .line 1561
    :cond_38
    invoke-interface {v0}, LB0/b;->c()LB0/M;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v3

    .line 1565
    iget-boolean v3, v3, LB0/M;->b:Z

    .line 1566
    .line 1567
    if-eqz v3, :cond_39

    .line 1568
    .line 1569
    invoke-interface {v0}, LB0/b;->t()V

    .line 1570
    .line 1571
    .line 1572
    :cond_39
    invoke-interface {v0}, LB0/b;->c()LB0/M;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v3

    .line 1576
    iget-object v3, v3, LB0/M;->g:Ljava/util/HashMap;

    .line 1577
    .line 1578
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v3

    .line 1582
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v3

    .line 1586
    :goto_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1587
    .line 1588
    .line 1589
    move-result v4

    .line 1590
    if-eqz v4, :cond_3a

    .line 1591
    .line 1592
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v4

    .line 1596
    check-cast v4, Ljava/util/Map$Entry;

    .line 1597
    .line 1598
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v5

    .line 1602
    check-cast v5, Lz0/l;

    .line 1603
    .line 1604
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v4

    .line 1608
    check-cast v4, Ljava/lang/Number;

    .line 1609
    .line 1610
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 1611
    .line 1612
    .line 1613
    move-result v4

    .line 1614
    invoke-interface {v0}, LB0/b;->n()LB0/v;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v6

    .line 1618
    invoke-static {v2, v5, v4, v6}, LB0/M;->a(LB0/M;Lz0/l;ILB0/n0;)V

    .line 1619
    .line 1620
    .line 1621
    goto :goto_12

    .line 1622
    :cond_3a
    invoke-interface {v0}, LB0/b;->n()LB0/v;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v0

    .line 1626
    iget-object v0, v0, LB0/n0;->D:LB0/n0;

    .line 1627
    .line 1628
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 1629
    .line 1630
    .line 1631
    :goto_13
    iget-object v3, v2, LB0/M;->a:Lz0/J;

    .line 1632
    .line 1633
    invoke-interface {v3}, LB0/b;->n()LB0/v;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v3

    .line 1637
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1638
    .line 1639
    .line 1640
    move-result v3

    .line 1641
    if-nez v3, :cond_3c

    .line 1642
    .line 1643
    invoke-virtual {v2, v0}, LB0/M;->b(LB0/n0;)Ljava/util/Map;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v3

    .line 1647
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v3

    .line 1651
    check-cast v3, Ljava/lang/Iterable;

    .line 1652
    .line 1653
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1654
    .line 1655
    .line 1656
    move-result-object v3

    .line 1657
    :goto_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1658
    .line 1659
    .line 1660
    move-result v4

    .line 1661
    if-eqz v4, :cond_3b

    .line 1662
    .line 1663
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v4

    .line 1667
    check-cast v4, Lz0/l;

    .line 1668
    .line 1669
    invoke-virtual {v2, v0, v4}, LB0/M;->c(LB0/n0;Lz0/l;)I

    .line 1670
    .line 1671
    .line 1672
    move-result v5

    .line 1673
    invoke-static {v2, v4, v5, v0}, LB0/M;->a(LB0/M;Lz0/l;ILB0/n0;)V

    .line 1674
    .line 1675
    .line 1676
    goto :goto_14

    .line 1677
    :cond_3b
    iget-object v0, v0, LB0/n0;->D:LB0/n0;

    .line 1678
    .line 1679
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 1680
    .line 1681
    .line 1682
    goto :goto_13

    .line 1683
    :cond_3c
    :goto_15
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 1684
    .line 1685
    return-object v0

    .line 1686
    nop

    .line 1687
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
