.class public final LE/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE/J;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:LE/c0;

.field public d:Lz0/P;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:LE/a0;

.field public i:Z

.field public j:J

.field public k:J

.field public l:J

.field public final synthetic m:LB0/G0;


# direct methods
.method public constructor <init>(LB0/G0;IJLE/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE/b0;->m:LB0/G0;

    .line 5
    .line 6
    iput p2, p0, LE/b0;->a:I

    .line 7
    .line 8
    iput-wide p3, p0, LE/b0;->b:J

    .line 9
    .line 10
    iput-object p5, p0, LE/b0;->c:LE/c0;

    .line 11
    .line 12
    sget p1, LK5/j;->b:I

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    sget-wide p3, LK5/j;->a:J

    .line 19
    .line 20
    sub-long/2addr p1, p3

    .line 21
    iput-wide p1, p0, LE/b0;->l:J

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LE/b0;->i:Z

    .line 3
    .line 4
    return-void
.end method

.method public final b(LE/a;)Z
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-wide v2, v0, LE/a;->a:J

    .line 6
    .line 7
    iget-object v4, v1, LE/b0;->m:LB0/G0;

    .line 8
    .line 9
    iget-object v5, v4, LB0/G0;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v5, LE/u;

    .line 12
    .line 13
    iget-object v5, v5, LE/u;->b:LC/j;

    .line 14
    .line 15
    invoke-virtual {v5}, LC/j;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    check-cast v5, LE/x;

    .line 20
    .line 21
    iget-boolean v6, v1, LE/b0;->f:Z

    .line 22
    .line 23
    if-nez v6, :cond_16

    .line 24
    .line 25
    invoke-interface {v5}, LE/x;->a()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    iget v8, v1, LE/b0;->a:I

    .line 30
    .line 31
    if-ltz v8, :cond_16

    .line 32
    .line 33
    if-ge v8, v6, :cond_16

    .line 34
    .line 35
    invoke-interface {v5, v8}, LE/x;->c(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v9

    .line 43
    sub-long v9, v2, v9

    .line 44
    .line 45
    const-wide/16 v11, 0x0

    .line 46
    .line 47
    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide v9

    .line 51
    iput-wide v9, v1, LE/b0;->j:J

    .line 52
    .line 53
    sget v9, LK5/j;->b:I

    .line 54
    .line 55
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 56
    .line 57
    .line 58
    move-result-wide v9

    .line 59
    sget-wide v13, LK5/j;->a:J

    .line 60
    .line 61
    sub-long/2addr v9, v13

    .line 62
    iput-wide v9, v1, LE/b0;->l:J

    .line 63
    .line 64
    iput-wide v11, v1, LE/b0;->k:J

    .line 65
    .line 66
    iget-object v9, v1, LE/b0;->d:Lz0/P;

    .line 67
    .line 68
    const/4 v13, 0x4

    .line 69
    iget-object v14, v1, LE/b0;->c:LE/c0;

    .line 70
    .line 71
    const/4 v15, 0x1

    .line 72
    if-eqz v9, :cond_0

    .line 73
    .line 74
    move-wide/from16 v20, v2

    .line 75
    .line 76
    move-wide/from16 v16, v11

    .line 77
    .line 78
    move-object v7, v14

    .line 79
    goto/16 :goto_3

    .line 80
    .line 81
    :cond_0
    move-wide/from16 v16, v11

    .line 82
    .line 83
    iget-wide v11, v1, LE/b0;->j:J

    .line 84
    .line 85
    invoke-virtual {v14, v6}, LE/c0;->r(Ljava/lang/Object;)LE/c;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    move-wide/from16 v18, v11

    .line 90
    .line 91
    iget-wide v10, v9, LE/c;->a:J

    .line 92
    .line 93
    iget-boolean v9, v1, LE/b0;->i:Z

    .line 94
    .line 95
    if-eqz v9, :cond_1

    .line 96
    .line 97
    cmp-long v9, v18, v16

    .line 98
    .line 99
    if-gtz v9, :cond_2

    .line 100
    .line 101
    :cond_1
    cmp-long v9, v10, v18

    .line 102
    .line 103
    if-gez v9, :cond_17

    .line 104
    .line 105
    :cond_2
    const-string v9, "compose:lazy:prefetch:compose"

    .line 106
    .line 107
    invoke-static {v9}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :try_start_0
    iget-object v9, v1, LE/b0;->d:Lz0/P;

    .line 111
    .line 112
    if-nez v9, :cond_3

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    const-string v9, "Request was already composed!"

    .line 116
    .line 117
    invoke-static {v9}, Lz/a;->a(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :goto_0
    invoke-interface {v5, v8}, LE/x;->b(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    iget-object v9, v4, LB0/G0;->r:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v9, LE/u;

    .line 127
    .line 128
    invoke-virtual {v9, v8, v5, v6}, LE/u;->a(ILjava/lang/Object;Ljava/lang/Object;)LB5/e;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    iget-object v4, v4, LB0/G0;->s:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v4, Lz0/S;

    .line 135
    .line 136
    invoke-virtual {v4}, Lz0/S;->a()Lz0/y;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-virtual {v4, v5, v8}, Lz0/y;->d(Ljava/lang/Object;LB5/e;)Lz0/P;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    iput-object v4, v1, LE/b0;->d:Lz0/P;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 145
    .line 146
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, LE/b0;->e()V

    .line 150
    .line 151
    .line 152
    iget-wide v4, v1, LE/b0;->k:J

    .line 153
    .line 154
    iget-object v8, v14, LE/c0;->q:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v8, LE/c;

    .line 157
    .line 158
    iget-wide v9, v8, LE/c;->a:J

    .line 159
    .line 160
    cmp-long v11, v9, v16

    .line 161
    .line 162
    if-nez v11, :cond_4

    .line 163
    .line 164
    move-wide v11, v4

    .line 165
    move-object/from16 v20, v14

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_4
    int-to-long v11, v13

    .line 169
    div-long/2addr v9, v11

    .line 170
    move-object/from16 v20, v14

    .line 171
    .line 172
    const/4 v7, 0x3

    .line 173
    int-to-long v13, v7

    .line 174
    mul-long/2addr v9, v13

    .line 175
    div-long v11, v4, v11

    .line 176
    .line 177
    add-long/2addr v11, v9

    .line 178
    :goto_1
    iput-wide v11, v8, LE/c;->a:J

    .line 179
    .line 180
    move-object/from16 v7, v20

    .line 181
    .line 182
    invoke-virtual {v7, v6}, LE/c0;->r(Ljava/lang/Object;)LE/c;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    iget-wide v9, v8, LE/c;->a:J

    .line 187
    .line 188
    cmp-long v11, v9, v16

    .line 189
    .line 190
    if-nez v11, :cond_5

    .line 191
    .line 192
    move-wide/from16 v20, v2

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_5
    const/4 v11, 0x4

    .line 196
    int-to-long v12, v11

    .line 197
    div-long/2addr v9, v12

    .line 198
    move-wide/from16 v20, v2

    .line 199
    .line 200
    const/4 v11, 0x3

    .line 201
    int-to-long v2, v11

    .line 202
    mul-long/2addr v9, v2

    .line 203
    div-long/2addr v4, v12

    .line 204
    add-long/2addr v4, v9

    .line 205
    :goto_2
    iput-wide v4, v8, LE/c;->a:J

    .line 206
    .line 207
    :goto_3
    iget-boolean v2, v1, LE/b0;->i:Z

    .line 208
    .line 209
    if-nez v2, :cond_10

    .line 210
    .line 211
    iget-boolean v2, v1, LE/b0;->g:Z

    .line 212
    .line 213
    if-nez v2, :cond_7

    .line 214
    .line 215
    iget-wide v2, v1, LE/b0;->j:J

    .line 216
    .line 217
    cmp-long v2, v2, v16

    .line 218
    .line 219
    if-lez v2, :cond_6

    .line 220
    .line 221
    const-string v2, "compose:lazy:prefetch:resolve-nested"

    .line 222
    .line 223
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :try_start_1
    invoke-virtual {v1}, LE/b0;->d()LE/a0;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    iput-object v2, v1, LE/b0;->h:LE/a0;

    .line 231
    .line 232
    iput-boolean v15, v1, LE/b0;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 233
    .line 234
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 235
    .line 236
    .line 237
    goto :goto_4

    .line 238
    :catchall_0
    move-exception v0

    .line 239
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 240
    .line 241
    .line 242
    throw v0

    .line 243
    :cond_6
    return v15

    .line 244
    :cond_7
    :goto_4
    iget-object v2, v1, LE/b0;->h:LE/a0;

    .line 245
    .line 246
    if-eqz v2, :cond_f

    .line 247
    .line 248
    iget-object v3, v2, LE/a0;->d:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v3, [Ljava/util/List;

    .line 251
    .line 252
    iget v4, v2, LE/a0;->a:I

    .line 253
    .line 254
    iget-object v5, v2, LE/a0;->c:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v5, Ljava/util/List;

    .line 257
    .line 258
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    if-lt v4, v8, :cond_8

    .line 263
    .line 264
    goto/16 :goto_9

    .line 265
    .line 266
    :cond_8
    iget-object v4, v2, LE/a0;->e:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v4, LE/b0;

    .line 269
    .line 270
    iget-boolean v4, v4, LE/b0;->f:Z

    .line 271
    .line 272
    if-eqz v4, :cond_9

    .line 273
    .line 274
    const-string v4, "Should not execute nested prefetch on canceled request"

    .line 275
    .line 276
    invoke-static {v4}, Lz/a;->c(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    :cond_9
    const-string v4, "compose:lazy:prefetch:nested"

    .line 280
    .line 281
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    :goto_5
    :try_start_2
    iget v4, v2, LE/a0;->a:I

    .line 285
    .line 286
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 287
    .line 288
    .line 289
    move-result v8

    .line 290
    if-ge v4, v8, :cond_e

    .line 291
    .line 292
    iget v4, v2, LE/a0;->a:I

    .line 293
    .line 294
    aget-object v4, v3, v4

    .line 295
    .line 296
    if-nez v4, :cond_b

    .line 297
    .line 298
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 299
    .line 300
    .line 301
    move-result-wide v8

    .line 302
    sub-long v8, v20, v8

    .line 303
    .line 304
    move-wide/from16 v10, v16

    .line 305
    .line 306
    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 307
    .line 308
    .line 309
    move-result-wide v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 310
    cmp-long v4, v8, v10

    .line 311
    .line 312
    if-gtz v4, :cond_a

    .line 313
    .line 314
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 315
    .line 316
    .line 317
    return v15

    .line 318
    :cond_a
    :try_start_3
    iget v4, v2, LE/a0;->a:I

    .line 319
    .line 320
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    check-cast v8, LE/K;

    .line 325
    .line 326
    iget-object v9, v8, LE/K;->a:Lkotlin/jvm/internal/n;

    .line 327
    .line 328
    new-instance v10, LE/I;

    .line 329
    .line 330
    invoke-direct {v10, v8}, LE/I;-><init>(LE/K;)V

    .line 331
    .line 332
    .line 333
    invoke-interface {v9, v10}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    iget-object v8, v10, LE/I;->a:Ljava/util/ArrayList;

    .line 337
    .line 338
    aput-object v8, v3, v4

    .line 339
    .line 340
    goto :goto_6

    .line 341
    :catchall_1
    move-exception v0

    .line 342
    goto :goto_8

    .line 343
    :cond_b
    :goto_6
    iget v4, v2, LE/a0;->a:I

    .line 344
    .line 345
    aget-object v4, v3, v4

    .line 346
    .line 347
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    :goto_7
    iget v8, v2, LE/a0;->b:I

    .line 351
    .line 352
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 353
    .line 354
    .line 355
    move-result v9

    .line 356
    if-ge v8, v9, :cond_d

    .line 357
    .line 358
    iget v8, v2, LE/a0;->b:I

    .line 359
    .line 360
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v8

    .line 364
    check-cast v8, LE/b0;

    .line 365
    .line 366
    invoke-virtual {v8, v0}, LE/b0;->b(LE/a;)Z

    .line 367
    .line 368
    .line 369
    move-result v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 370
    if-eqz v8, :cond_c

    .line 371
    .line 372
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 373
    .line 374
    .line 375
    return v15

    .line 376
    :cond_c
    :try_start_4
    iget v8, v2, LE/a0;->b:I

    .line 377
    .line 378
    add-int/2addr v8, v15

    .line 379
    iput v8, v2, LE/a0;->b:I

    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_d
    const/4 v4, 0x0

    .line 383
    iput v4, v2, LE/a0;->b:I

    .line 384
    .line 385
    iget v4, v2, LE/a0;->a:I

    .line 386
    .line 387
    add-int/2addr v4, v15

    .line 388
    iput v4, v2, LE/a0;->a:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 389
    .line 390
    const-wide/16 v16, 0x0

    .line 391
    .line 392
    goto :goto_5

    .line 393
    :cond_e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 394
    .line 395
    .line 396
    goto :goto_9

    .line 397
    :goto_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 398
    .line 399
    .line 400
    throw v0

    .line 401
    :cond_f
    :goto_9
    invoke-virtual {v1}, LE/b0;->e()V

    .line 402
    .line 403
    .line 404
    :cond_10
    iget-boolean v0, v1, LE/b0;->e:Z

    .line 405
    .line 406
    if-nez v0, :cond_16

    .line 407
    .line 408
    iget-wide v2, v1, LE/b0;->b:J

    .line 409
    .line 410
    invoke-static {v2, v3}, LW0/a;->k(J)Z

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    if-nez v0, :cond_16

    .line 415
    .line 416
    iget-wide v4, v1, LE/b0;->j:J

    .line 417
    .line 418
    invoke-virtual {v7, v6}, LE/c0;->r(Ljava/lang/Object;)LE/c;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    iget-wide v8, v0, LE/c;->b:J

    .line 423
    .line 424
    iget-boolean v0, v1, LE/b0;->i:Z

    .line 425
    .line 426
    if-eqz v0, :cond_11

    .line 427
    .line 428
    const-wide/16 v16, 0x0

    .line 429
    .line 430
    cmp-long v0, v4, v16

    .line 431
    .line 432
    if-gtz v0, :cond_12

    .line 433
    .line 434
    :cond_11
    cmp-long v0, v8, v4

    .line 435
    .line 436
    if-gez v0, :cond_15

    .line 437
    .line 438
    :cond_12
    const-string v0, "compose:lazy:prefetch:measure"

    .line 439
    .line 440
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    :try_start_5
    invoke-virtual {v1, v2, v3}, LE/b0;->c(J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 444
    .line 445
    .line 446
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v1}, LE/b0;->e()V

    .line 450
    .line 451
    .line 452
    iget-wide v2, v1, LE/b0;->k:J

    .line 453
    .line 454
    iget-object v0, v7, LE/c0;->q:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v0, LE/c;

    .line 457
    .line 458
    iget-wide v4, v0, LE/c;->b:J

    .line 459
    .line 460
    const-wide/16 v16, 0x0

    .line 461
    .line 462
    cmp-long v8, v4, v16

    .line 463
    .line 464
    if-nez v8, :cond_13

    .line 465
    .line 466
    move-wide v8, v2

    .line 467
    goto :goto_a

    .line 468
    :cond_13
    const/4 v11, 0x4

    .line 469
    int-to-long v8, v11

    .line 470
    div-long/2addr v4, v8

    .line 471
    const/4 v11, 0x3

    .line 472
    int-to-long v12, v11

    .line 473
    mul-long/2addr v4, v12

    .line 474
    div-long v8, v2, v8

    .line 475
    .line 476
    add-long/2addr v8, v4

    .line 477
    :goto_a
    iput-wide v8, v0, LE/c;->b:J

    .line 478
    .line 479
    invoke-virtual {v7, v6}, LE/c0;->r(Ljava/lang/Object;)LE/c;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    iget-wide v4, v0, LE/c;->b:J

    .line 484
    .line 485
    const-wide/16 v16, 0x0

    .line 486
    .line 487
    cmp-long v6, v4, v16

    .line 488
    .line 489
    if-nez v6, :cond_14

    .line 490
    .line 491
    goto :goto_b

    .line 492
    :cond_14
    const/4 v11, 0x4

    .line 493
    int-to-long v6, v11

    .line 494
    div-long/2addr v4, v6

    .line 495
    const/4 v11, 0x3

    .line 496
    int-to-long v8, v11

    .line 497
    mul-long/2addr v4, v8

    .line 498
    div-long/2addr v2, v6

    .line 499
    add-long/2addr v2, v4

    .line 500
    :goto_b
    iput-wide v2, v0, LE/c;->b:J

    .line 501
    .line 502
    const/16 v18, 0x0

    .line 503
    .line 504
    return v18

    .line 505
    :catchall_2
    move-exception v0

    .line 506
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 507
    .line 508
    .line 509
    throw v0

    .line 510
    :cond_15
    return v15

    .line 511
    :cond_16
    const/16 v18, 0x0

    .line 512
    .line 513
    goto :goto_c

    .line 514
    :catchall_3
    move-exception v0

    .line 515
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 516
    .line 517
    .line 518
    throw v0

    .line 519
    :cond_17
    return v15

    .line 520
    :goto_c
    return v18
.end method

.method public final c(J)V
    .locals 3

    .line 1
    iget-boolean v0, p0, LE/b0;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Callers should check whether the request is still valid before calling performMeasure()"

    .line 6
    .line 7
    invoke-static {v0}, Lz/a;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, LE/b0;->e:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-string v0, "Request was already measured!"

    .line 15
    .line 16
    invoke-static {v0}, Lz/a;->a(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, LE/b0;->e:Z

    .line 21
    .line 22
    iget-object v0, p0, LE/b0;->d:Lz0/P;

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    invoke-interface {v0}, Lz0/P;->b()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/4 v2, 0x0

    .line 31
    :goto_0
    if-ge v2, v1, :cond_2

    .line 32
    .line 33
    invoke-interface {v0, v2, p1, p2}, Lz0/P;->d(IJ)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return-void

    .line 40
    :cond_3
    const-string p1, "performComposition() must be called before performMeasure()"

    .line 41
    .line 42
    invoke-static {p1}, Lz/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 43
    .line 44
    .line 45
    new-instance p1, LC2/e;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 48
    .line 49
    .line 50
    throw p1
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LE/b0;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LE/b0;->f:Z

    .line 7
    .line 8
    iget-object v0, p0, LE/b0;->d:Lz0/P;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Lz0/P;->a()V

    .line 13
    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, LE/b0;->d:Lz0/P;

    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final d()LE/a0;
    .locals 4

    .line 1
    iget-object v0, p0, LE/b0;->d:Lz0/P;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    new-instance v1, Lkotlin/jvm/internal/y;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, LC0/v;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v2, v1, v3}, LC0/v;-><init>(Lkotlin/jvm/internal/y;I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2}, Lz0/P;->c(LC0/v;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/List;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance v1, LE/a0;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p0, v1, LE/a0;->e:Ljava/lang/Object;

    .line 31
    .line 32
    iput-object v0, v1, LE/a0;->c:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    new-array v2, v2, [Ljava/util/List;

    .line 39
    .line 40
    iput-object v2, v1, LE/a0;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/util/Collection;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    const-string v0, "NestedPrefetchController shouldn\'t be created with no states"

    .line 51
    .line 52
    invoke-static {v0}, Lz/a;->a(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-object v1

    .line 56
    :cond_1
    const/4 v0, 0x0

    .line 57
    return-object v0

    .line 58
    :cond_2
    const-string v0, "Should precompose before resolving nested prefetch states"

    .line 59
    .line 60
    invoke-static {v0}, Lz/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 61
    .line 62
    .line 63
    new-instance v0, LC2/e;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 66
    .line 67
    .line 68
    throw v0
.end method

.method public final e()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget v1, LK5/j;->b:I

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    sget-wide v3, LK5/j;->a:J

    .line 10
    .line 11
    sub-long/2addr v1, v3

    .line 12
    iget-wide v3, v0, LE/b0;->l:J

    .line 13
    .line 14
    sget-object v5, LK5/c;->r:LK5/c;

    .line 15
    .line 16
    const-string v6, "unit"

    .line 17
    .line 18
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-wide/16 v6, 0x1

    .line 22
    .line 23
    sub-long v8, v3, v6

    .line 24
    .line 25
    or-long/2addr v8, v6

    .line 26
    const-wide v10, 0x7fffffffffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmp-long v8, v8, v10

    .line 32
    .line 33
    const-wide/16 v12, 0x0

    .line 34
    .line 35
    if-nez v8, :cond_2

    .line 36
    .line 37
    cmp-long v5, v1, v3

    .line 38
    .line 39
    if-nez v5, :cond_0

    .line 40
    .line 41
    sget v3, LK5/a;->t:I

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_0
    cmp-long v3, v3, v12

    .line 45
    .line 46
    if-gez v3, :cond_1

    .line 47
    .line 48
    sget-wide v3, LK5/a;->s:J

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    sget-wide v3, LK5/a;->r:J

    .line 52
    .line 53
    :goto_0
    invoke-static {v3, v4}, LK5/a;->f(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide v12

    .line 57
    goto :goto_3

    .line 58
    :cond_2
    sub-long v8, v1, v6

    .line 59
    .line 60
    or-long/2addr v8, v6

    .line 61
    cmp-long v8, v8, v10

    .line 62
    .line 63
    if-nez v8, :cond_4

    .line 64
    .line 65
    cmp-long v3, v1, v12

    .line 66
    .line 67
    if-gez v3, :cond_3

    .line 68
    .line 69
    sget-wide v3, LK5/a;->s:J

    .line 70
    .line 71
    :goto_1
    move-wide v12, v3

    .line 72
    goto :goto_3

    .line 73
    :cond_3
    sget-wide v3, LK5/a;->r:J

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    sub-long v8, v1, v3

    .line 77
    .line 78
    xor-long v14, v8, v1

    .line 79
    .line 80
    xor-long v10, v8, v3

    .line 81
    .line 82
    not-long v10, v10

    .line 83
    and-long/2addr v10, v14

    .line 84
    cmp-long v10, v10, v12

    .line 85
    .line 86
    if-gez v10, :cond_7

    .line 87
    .line 88
    sget-object v10, LK5/c;->s:LK5/c;

    .line 89
    .line 90
    invoke-virtual {v5, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    if-gez v11, :cond_5

    .line 95
    .line 96
    invoke-static {v6, v7, v10, v5}, LK5/f;->c(JLK5/c;LK5/c;)J

    .line 97
    .line 98
    .line 99
    move-result-wide v6

    .line 100
    div-long v8, v1, v6

    .line 101
    .line 102
    div-long v11, v3, v6

    .line 103
    .line 104
    sub-long/2addr v8, v11

    .line 105
    rem-long v11, v1, v6

    .line 106
    .line 107
    rem-long/2addr v3, v6

    .line 108
    sub-long/2addr v11, v3

    .line 109
    sget v3, LK5/a;->t:I

    .line 110
    .line 111
    invoke-static {v8, v9, v10}, LK5/f;->k(JLK5/c;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v3

    .line 115
    invoke-static {v11, v12, v5}, LK5/f;->k(JLK5/c;)J

    .line 116
    .line 117
    .line 118
    move-result-wide v5

    .line 119
    invoke-static {v3, v4, v5, v6}, LK5/a;->d(JJ)J

    .line 120
    .line 121
    .line 122
    move-result-wide v12

    .line 123
    goto :goto_3

    .line 124
    :cond_5
    cmp-long v3, v8, v12

    .line 125
    .line 126
    if-gez v3, :cond_6

    .line 127
    .line 128
    sget-wide v3, LK5/a;->s:J

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_6
    sget-wide v3, LK5/a;->r:J

    .line 132
    .line 133
    :goto_2
    invoke-static {v3, v4}, LK5/a;->f(J)J

    .line 134
    .line 135
    .line 136
    move-result-wide v12

    .line 137
    goto :goto_3

    .line 138
    :cond_7
    invoke-static {v8, v9, v5}, LK5/f;->k(JLK5/c;)J

    .line 139
    .line 140
    .line 141
    move-result-wide v12

    .line 142
    :goto_3
    const/4 v3, 0x1

    .line 143
    shr-long v4, v12, v3

    .line 144
    .line 145
    sget v6, LK5/a;->t:I

    .line 146
    .line 147
    long-to-int v6, v12

    .line 148
    and-int/2addr v3, v6

    .line 149
    if-nez v3, :cond_8

    .line 150
    .line 151
    move-wide v10, v4

    .line 152
    goto :goto_4

    .line 153
    :cond_8
    const-wide v6, 0x8637bd05af6L

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    cmp-long v3, v4, v6

    .line 159
    .line 160
    if-lez v3, :cond_9

    .line 161
    .line 162
    const-wide v10, 0x7fffffffffffffffL

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_9
    const-wide v6, -0x8637bd05af6L

    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    cmp-long v3, v4, v6

    .line 174
    .line 175
    if-gez v3, :cond_a

    .line 176
    .line 177
    const-wide/high16 v10, -0x8000000000000000L

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_a
    const v3, 0xf4240

    .line 181
    .line 182
    .line 183
    int-to-long v6, v3

    .line 184
    mul-long v10, v4, v6

    .line 185
    .line 186
    :goto_4
    iput-wide v10, v0, LE/b0;->k:J

    .line 187
    .line 188
    iget-wide v3, v0, LE/b0;->j:J

    .line 189
    .line 190
    sub-long/2addr v3, v10

    .line 191
    iput-wide v3, v0, LE/b0;->j:J

    .line 192
    .line 193
    iput-wide v1, v0, LE/b0;->l:J

    .line 194
    .line 195
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HandleAndRequestImpl { index = "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, LE/b0;->a:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", constraints = "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, LE/b0;->b:J

    .line 19
    .line 20
    invoke-static {v1, v2}, LW0/a;->l(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", isComposed = "

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, LE/b0;->d:Lz0/P;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v1, 0x0

    .line 39
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", isMeasured = "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-boolean v1, p0, LE/b0;->e:Z

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", isCanceled = "

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-boolean v1, p0, LE/b0;->f:Z

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, " }"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0
.end method
