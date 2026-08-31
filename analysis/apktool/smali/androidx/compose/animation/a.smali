.class public abstract Landroidx/compose/animation/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final synthetic b:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const/16 v2, 0x20

    .line 5
    .line 6
    shl-long v2, v0, v2

    .line 7
    .line 8
    const-wide v4, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    and-long/2addr v0, v4

    .line 14
    or-long/2addr v0, v2

    .line 15
    sput-wide v0, Landroidx/compose/animation/a;->a:J

    .line 16
    .line 17
    return-void
.end method

.method public static final a(Lu/v0;Lc0/m;LB5/c;Lc0/e;LB5/c;LX/e;LP/o;I)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v8, p3

    .line 8
    .line 9
    move-object/from16 v9, p4

    .line 10
    .line 11
    move-object/from16 v10, p6

    .line 12
    .line 13
    move/from16 v11, p7

    .line 14
    .line 15
    const v0, -0x6d60584

    .line 16
    .line 17
    .line 18
    invoke-virtual {v10, v0}, LP/o;->U(I)LP/o;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v0, v11, 0x6

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v10, v1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    move v0, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v0, 0x2

    .line 35
    :goto_0
    or-int/2addr v0, v11

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v0, v11

    .line 38
    :goto_1
    and-int/lit8 v4, v11, 0x30

    .line 39
    .line 40
    if-nez v4, :cond_3

    .line 41
    .line 42
    invoke-virtual {v10, v7}, LP/o;->g(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    const/16 v4, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v4, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v0, v4

    .line 54
    :cond_3
    and-int/lit16 v4, v11, 0x180

    .line 55
    .line 56
    if-nez v4, :cond_5

    .line 57
    .line 58
    invoke-virtual {v10, v3}, LP/o;->i(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_4

    .line 63
    .line 64
    const/16 v4, 0x100

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/16 v4, 0x80

    .line 68
    .line 69
    :goto_3
    or-int/2addr v0, v4

    .line 70
    :cond_5
    and-int/lit16 v4, v11, 0xc00

    .line 71
    .line 72
    if-nez v4, :cond_7

    .line 73
    .line 74
    invoke-virtual {v10, v8}, LP/o;->g(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_6

    .line 79
    .line 80
    const/16 v4, 0x800

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    const/16 v4, 0x400

    .line 84
    .line 85
    :goto_4
    or-int/2addr v0, v4

    .line 86
    :cond_7
    and-int/lit16 v4, v11, 0x6000

    .line 87
    .line 88
    if-nez v4, :cond_9

    .line 89
    .line 90
    invoke-virtual {v10, v9}, LP/o;->i(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_8

    .line 95
    .line 96
    const/16 v4, 0x4000

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_8
    const/16 v4, 0x2000

    .line 100
    .line 101
    :goto_5
    or-int/2addr v0, v4

    .line 102
    :cond_9
    const/high16 v4, 0x30000

    .line 103
    .line 104
    and-int/2addr v4, v11

    .line 105
    move-object/from16 v6, p5

    .line 106
    .line 107
    if-nez v4, :cond_b

    .line 108
    .line 109
    invoke-virtual {v10, v6}, LP/o;->i(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_a

    .line 114
    .line 115
    const/high16 v4, 0x20000

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_a
    const/high16 v4, 0x10000

    .line 119
    .line 120
    :goto_6
    or-int/2addr v0, v4

    .line 121
    :cond_b
    const v4, 0x12493

    .line 122
    .line 123
    .line 124
    and-int/2addr v4, v0

    .line 125
    const v5, 0x12492

    .line 126
    .line 127
    .line 128
    if-eq v4, v5, :cond_c

    .line 129
    .line 130
    const/4 v4, 0x1

    .line 131
    goto :goto_7

    .line 132
    :cond_c
    const/4 v4, 0x0

    .line 133
    :goto_7
    and-int/lit8 v5, v0, 0x1

    .line 134
    .line 135
    invoke-virtual {v10, v5, v4}, LP/o;->K(IZ)Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-eqz v4, :cond_32

    .line 140
    .line 141
    sget-object v4, LC0/t0;->n:LP/T0;

    .line 142
    .line 143
    invoke-virtual {v10, v4}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    check-cast v4, LW0/l;

    .line 148
    .line 149
    and-int/lit8 v0, v0, 0xe

    .line 150
    .line 151
    if-ne v0, v2, :cond_d

    .line 152
    .line 153
    const/4 v4, 0x1

    .line 154
    goto :goto_8

    .line 155
    :cond_d
    const/4 v4, 0x0

    .line 156
    :goto_8
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    sget-object v14, LP/k;->a:LP/S;

    .line 161
    .line 162
    if-nez v4, :cond_e

    .line 163
    .line 164
    if-ne v5, v14, :cond_f

    .line 165
    .line 166
    :cond_e
    new-instance v5, Lt/l;

    .line 167
    .line 168
    invoke-direct {v5, v1, v8}, Lt/l;-><init>(Lu/v0;Lc0/e;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v10, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_f
    move-object v4, v5

    .line 175
    check-cast v4, Lt/l;

    .line 176
    .line 177
    if-ne v0, v2, :cond_10

    .line 178
    .line 179
    const/4 v5, 0x1

    .line 180
    goto :goto_9

    .line 181
    :cond_10
    const/4 v5, 0x0

    .line 182
    :goto_9
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v15

    .line 186
    if-nez v5, :cond_11

    .line 187
    .line 188
    if-ne v15, v14, :cond_12

    .line 189
    .line 190
    :cond_11
    iget-object v5, v1, Lu/v0;->a:LO3/D0;

    .line 191
    .line 192
    invoke-virtual {v5}, LO3/D0;->j()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    new-instance v15, La0/q;

    .line 201
    .line 202
    invoke-direct {v15}, La0/q;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-static {v5}, Ln5/k;->R0([Ljava/lang/Object;)Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    check-cast v5, Ljava/util/Collection;

    .line 210
    .line 211
    invoke-virtual {v15, v5}, La0/q;->addAll(Ljava/util/Collection;)Z

    .line 212
    .line 213
    .line 214
    invoke-virtual {v10, v15}, LP/o;->d0(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_12
    move-object v5, v15

    .line 218
    check-cast v5, La0/q;

    .line 219
    .line 220
    if-ne v0, v2, :cond_13

    .line 221
    .line 222
    const/4 v0, 0x1

    .line 223
    goto :goto_a

    .line 224
    :cond_13
    const/4 v0, 0x0

    .line 225
    :goto_a
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    if-nez v0, :cond_14

    .line 230
    .line 231
    if-ne v2, v14, :cond_15

    .line 232
    .line 233
    :cond_14
    sget-object v0, Lr/O;->a:[J

    .line 234
    .line 235
    new-instance v2, Lr/G;

    .line 236
    .line 237
    invoke-direct {v2}, Lr/G;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v10, v2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    :cond_15
    move-object v15, v2

    .line 244
    check-cast v15, Lr/G;

    .line 245
    .line 246
    iget-object v0, v1, Lu/v0;->a:LO3/D0;

    .line 247
    .line 248
    iget-object v2, v1, Lu/v0;->d:LP/f0;

    .line 249
    .line 250
    invoke-virtual {v0}, LO3/D0;->j()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v13

    .line 254
    invoke-virtual {v5, v13}, La0/q;->contains(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v13

    .line 258
    if-nez v13, :cond_16

    .line 259
    .line 260
    invoke-virtual {v5}, La0/q;->clear()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, LO3/D0;->j()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v13

    .line 267
    invoke-virtual {v5, v13}, La0/q;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    :cond_16
    invoke-virtual {v0}, LO3/D0;->j()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v13

    .line 274
    invoke-virtual {v2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v12

    .line 278
    invoke-static {v13, v12}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v12

    .line 282
    if-eqz v12, :cond_1b

    .line 283
    .line 284
    invoke-virtual {v5}, La0/q;->size()I

    .line 285
    .line 286
    .line 287
    move-result v12

    .line 288
    const/4 v13, 0x1

    .line 289
    if-ne v12, v13, :cond_17

    .line 290
    .line 291
    const/4 v12, 0x0

    .line 292
    invoke-virtual {v5, v12}, La0/q;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v13

    .line 296
    invoke-virtual {v0}, LO3/D0;->j()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v12

    .line 300
    invoke-static {v13, v12}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v12

    .line 304
    if-nez v12, :cond_18

    .line 305
    .line 306
    :cond_17
    invoke-virtual {v5}, La0/q;->clear()V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0}, LO3/D0;->j()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v12

    .line 313
    invoke-virtual {v5, v12}, La0/q;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    :cond_18
    iget v12, v15, Lr/G;->e:I

    .line 317
    .line 318
    const/4 v13, 0x1

    .line 319
    if-ne v12, v13, :cond_19

    .line 320
    .line 321
    invoke-virtual {v0}, LO3/D0;->j()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v12

    .line 325
    invoke-virtual {v15, v12}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v12

    .line 329
    if-eqz v12, :cond_1a

    .line 330
    .line 331
    :cond_19
    invoke-virtual {v15}, Lr/G;->a()V

    .line 332
    .line 333
    .line 334
    :cond_1a
    iput-object v8, v4, Lt/l;->b:Lc0/e;

    .line 335
    .line 336
    :cond_1b
    invoke-virtual {v0}, LO3/D0;->j()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v12

    .line 340
    invoke-virtual {v2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v13

    .line 344
    invoke-static {v12, v13}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v12

    .line 348
    if-nez v12, :cond_1f

    .line 349
    .line 350
    invoke-virtual {v2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v12

    .line 354
    invoke-virtual {v5, v12}, La0/q;->contains(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v12

    .line 358
    if-nez v12, :cond_1f

    .line 359
    .line 360
    invoke-virtual {v5}, La0/q;->listIterator()Ljava/util/ListIterator;

    .line 361
    .line 362
    .line 363
    move-result-object v12

    .line 364
    const/4 v13, 0x0

    .line 365
    :goto_b
    move-object/from16 v16, v12

    .line 366
    .line 367
    check-cast v16, LB0/r;

    .line 368
    .line 369
    invoke-virtual/range {v16 .. v16}, LB0/r;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v17

    .line 373
    move-object/from16 v18, v0

    .line 374
    .line 375
    if-eqz v17, :cond_1d

    .line 376
    .line 377
    invoke-virtual/range {v16 .. v16}, LB0/r;->next()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-interface {v9, v0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-virtual {v2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-interface {v9, v1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    if-eqz v0, :cond_1c

    .line 398
    .line 399
    :goto_c
    const/4 v0, -0x1

    .line 400
    goto :goto_d

    .line 401
    :cond_1c
    add-int/lit8 v13, v13, 0x1

    .line 402
    .line 403
    move-object/from16 v1, p0

    .line 404
    .line 405
    move-object/from16 v0, v18

    .line 406
    .line 407
    goto :goto_b

    .line 408
    :cond_1d
    const/4 v13, -0x1

    .line 409
    goto :goto_c

    .line 410
    :goto_d
    if-ne v13, v0, :cond_1e

    .line 411
    .line 412
    invoke-virtual {v2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-virtual {v5, v0}, La0/q;->add(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    goto :goto_e

    .line 420
    :cond_1e
    invoke-virtual {v2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-virtual {v5, v13, v0}, La0/q;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    goto :goto_e

    .line 428
    :cond_1f
    move-object/from16 v18, v0

    .line 429
    .line 430
    :goto_e
    invoke-virtual {v2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-virtual {v15, v0}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    if-eqz v0, :cond_21

    .line 439
    .line 440
    invoke-virtual/range {v18 .. v18}, LO3/D0;->j()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-virtual {v15, v0}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    if-nez v0, :cond_20

    .line 449
    .line 450
    goto :goto_f

    .line 451
    :cond_20
    const v0, 0x36ce4d57

    .line 452
    .line 453
    .line 454
    invoke-virtual {v10, v0}, LP/o;->S(I)V

    .line 455
    .line 456
    .line 457
    const/4 v12, 0x0

    .line 458
    invoke-virtual {v10, v12}, LP/o;->p(Z)V

    .line 459
    .line 460
    .line 461
    move-object v6, v3

    .line 462
    move-object v0, v4

    .line 463
    goto :goto_11

    .line 464
    :cond_21
    :goto_f
    const v0, 0x36a6df16

    .line 465
    .line 466
    .line 467
    invoke-virtual {v10, v0}, LP/o;->S(I)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v15}, Lr/G;->a()V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v5}, La0/q;->size()I

    .line 474
    .line 475
    .line 476
    move-result v12

    .line 477
    const/4 v13, 0x0

    .line 478
    :goto_10
    if-ge v13, v12, :cond_22

    .line 479
    .line 480
    invoke-virtual {v5, v13}, La0/q;->get(I)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    new-instance v0, Lt/d;

    .line 485
    .line 486
    move-object/from16 v1, p0

    .line 487
    .line 488
    invoke-direct/range {v0 .. v6}, Lt/d;-><init>(Lu/v0;Ljava/lang/Object;LB5/c;Lt/l;La0/q;LX/e;)V

    .line 489
    .line 490
    .line 491
    move-object v1, v0

    .line 492
    move-object v6, v3

    .line 493
    move-object v0, v4

    .line 494
    const v3, 0x34c9ce26

    .line 495
    .line 496
    .line 497
    invoke-static {v3, v1, v10}, LX/k;->d(ILm5/e;LP/o;)LX/e;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    invoke-virtual {v15, v2, v1}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    add-int/lit8 v13, v13, 0x1

    .line 505
    .line 506
    move-object v3, v6

    .line 507
    move-object/from16 v6, p5

    .line 508
    .line 509
    goto :goto_10

    .line 510
    :cond_22
    move-object v6, v3

    .line 511
    move-object v0, v4

    .line 512
    const/4 v1, 0x0

    .line 513
    invoke-virtual {v10, v1}, LP/o;->p(Z)V

    .line 514
    .line 515
    .line 516
    :goto_11
    invoke-virtual/range {p0 .. p0}, Lu/v0;->f()Lu/q0;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    invoke-virtual {v10, v0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v2

    .line 524
    invoke-virtual {v10, v1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    or-int/2addr v1, v2

    .line 529
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    if-nez v1, :cond_23

    .line 534
    .line 535
    if-ne v2, v14, :cond_24

    .line 536
    .line 537
    :cond_23
    invoke-interface {v6, v0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    move-object v2, v1

    .line 542
    check-cast v2, Lt/s;

    .line 543
    .line 544
    invoke-virtual {v10, v2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    :cond_24
    check-cast v2, Lt/s;

    .line 548
    .line 549
    iget-object v1, v0, Lt/l;->a:Lu/v0;

    .line 550
    .line 551
    invoke-virtual {v10, v0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v4

    .line 559
    if-nez v3, :cond_25

    .line 560
    .line 561
    if-ne v4, v14, :cond_26

    .line 562
    .line 563
    :cond_25
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 564
    .line 565
    invoke-static {v3}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 566
    .line 567
    .line 568
    move-result-object v4

    .line 569
    invoke-virtual {v10, v4}, LP/o;->d0(Ljava/lang/Object;)V

    .line 570
    .line 571
    .line 572
    :cond_26
    check-cast v4, LP/W;

    .line 573
    .line 574
    iget-object v2, v2, Lt/s;->d:Lt/J;

    .line 575
    .line 576
    invoke-static {v2, v10}, LP/b;->t(Ljava/lang/Object;LP/o;)LP/W;

    .line 577
    .line 578
    .line 579
    move-result-object v12

    .line 580
    iget-object v2, v1, Lu/v0;->a:LO3/D0;

    .line 581
    .line 582
    invoke-virtual {v2}, LO3/D0;->j()Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    iget-object v1, v1, Lu/v0;->d:LP/f0;

    .line 587
    .line 588
    invoke-virtual {v1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    move-result v1

    .line 596
    if-eqz v1, :cond_27

    .line 597
    .line 598
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 599
    .line 600
    invoke-interface {v4, v1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    goto :goto_12

    .line 604
    :cond_27
    invoke-interface {v12}, LP/S0;->getValue()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    if-eqz v1, :cond_28

    .line 609
    .line 610
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 611
    .line 612
    invoke-interface {v4, v1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    :cond_28
    :goto_12
    invoke-interface {v4}, LP/S0;->getValue()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    check-cast v1, Ljava/lang/Boolean;

    .line 620
    .line 621
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    sget-object v13, Lc0/j;->q:Lc0/j;

    .line 626
    .line 627
    const/4 v2, 0x0

    .line 628
    if-eqz v1, :cond_2b

    .line 629
    .line 630
    const v1, 0xee1c2b3

    .line 631
    .line 632
    .line 633
    invoke-virtual {v10, v1}, LP/o;->S(I)V

    .line 634
    .line 635
    .line 636
    move-object v4, v0

    .line 637
    iget-object v0, v4, Lt/l;->a:Lu/v0;

    .line 638
    .line 639
    sget-object v1, Lu/A0;->h:LZ/m;

    .line 640
    .line 641
    move-object v3, v4

    .line 642
    const/4 v4, 0x0

    .line 643
    move-object/from16 v16, v5

    .line 644
    .line 645
    const/4 v5, 0x2

    .line 646
    move-object/from16 v17, v2

    .line 647
    .line 648
    const/4 v2, 0x0

    .line 649
    move-object/from16 v19, v10

    .line 650
    .line 651
    move-object v10, v3

    .line 652
    move-object/from16 v3, v19

    .line 653
    .line 654
    invoke-static/range {v0 .. v5}, Lu/y0;->a(Lu/v0;LZ/m;Ljava/lang/String;LP/o;II)Lu/p0;

    .line 655
    .line 656
    .line 657
    move-result-object v2

    .line 658
    invoke-virtual {v3, v2}, LP/o;->g(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    invoke-virtual {v3}, LP/o;->H()Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    if-nez v0, :cond_29

    .line 667
    .line 668
    if-ne v1, v14, :cond_2a

    .line 669
    .line 670
    :cond_29
    invoke-interface {v12}, LP/S0;->getValue()Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    check-cast v0, Lt/J;

    .line 675
    .line 676
    invoke-static {v13}, La/a;->o(Lc0/m;)Lc0/m;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    invoke-virtual {v3, v1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    :cond_2a
    move-object v13, v1

    .line 684
    check-cast v13, Lc0/m;

    .line 685
    .line 686
    const/4 v1, 0x0

    .line 687
    invoke-virtual {v3, v1}, LP/o;->p(Z)V

    .line 688
    .line 689
    .line 690
    goto :goto_13

    .line 691
    :cond_2b
    move-object/from16 v16, v5

    .line 692
    .line 693
    move-object v3, v10

    .line 694
    const/4 v1, 0x0

    .line 695
    move-object v10, v0

    .line 696
    const v0, 0xee5d1ed

    .line 697
    .line 698
    .line 699
    invoke-virtual {v3, v0}, LP/o;->S(I)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v3, v1}, LP/o;->p(Z)V

    .line 703
    .line 704
    .line 705
    const/4 v2, 0x0

    .line 706
    :goto_13
    new-instance v0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;

    .line 707
    .line 708
    invoke-direct {v0, v2, v12, v10}, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;-><init>(Lu/p0;LP/W;Lt/l;)V

    .line 709
    .line 710
    .line 711
    invoke-interface {v13, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    invoke-interface {v7, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    invoke-virtual {v3}, LP/o;->H()Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    if-ne v1, v14, :cond_2c

    .line 724
    .line 725
    new-instance v1, Lt/f;

    .line 726
    .line 727
    invoke-direct {v1, v10}, Lt/f;-><init>(Lt/l;)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {v3, v1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 731
    .line 732
    .line 733
    :cond_2c
    check-cast v1, Lt/f;

    .line 734
    .line 735
    iget v2, v3, LP/o;->P:I

    .line 736
    .line 737
    invoke-virtual {v3}, LP/o;->m()LP/i0;

    .line 738
    .line 739
    .line 740
    move-result-object v4

    .line 741
    invoke-static {v3, v0}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    sget-object v5, LB0/k;->a:LB0/j;

    .line 746
    .line 747
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    sget-object v5, LB0/j;->b:LB0/D;

    .line 751
    .line 752
    invoke-virtual {v3}, LP/o;->W()V

    .line 753
    .line 754
    .line 755
    iget-boolean v10, v3, LP/o;->O:Z

    .line 756
    .line 757
    if-eqz v10, :cond_2d

    .line 758
    .line 759
    invoke-virtual {v3, v5}, LP/o;->l(LB5/a;)V

    .line 760
    .line 761
    .line 762
    goto :goto_14

    .line 763
    :cond_2d
    invoke-virtual {v3}, LP/o;->g0()V

    .line 764
    .line 765
    .line 766
    :goto_14
    sget-object v5, LB0/j;->e:LB0/i;

    .line 767
    .line 768
    invoke-static {v5, v3, v1}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 769
    .line 770
    .line 771
    sget-object v1, LB0/j;->d:LB0/i;

    .line 772
    .line 773
    invoke-static {v1, v3, v4}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 774
    .line 775
    .line 776
    sget-object v1, LB0/j;->f:LB0/i;

    .line 777
    .line 778
    iget-boolean v4, v3, LP/o;->O:Z

    .line 779
    .line 780
    if-nez v4, :cond_2e

    .line 781
    .line 782
    invoke-virtual {v3}, LP/o;->H()Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v4

    .line 786
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 787
    .line 788
    .line 789
    move-result-object v5

    .line 790
    invoke-static {v4, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 791
    .line 792
    .line 793
    move-result v4

    .line 794
    if-nez v4, :cond_2f

    .line 795
    .line 796
    :cond_2e
    invoke-static {v2, v3, v2, v1}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 797
    .line 798
    .line 799
    :cond_2f
    sget-object v1, LB0/j;->c:LB0/i;

    .line 800
    .line 801
    invoke-static {v1, v3, v0}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 802
    .line 803
    .line 804
    const v0, -0x58dcefd6

    .line 805
    .line 806
    .line 807
    invoke-virtual {v3, v0}, LP/o;->S(I)V

    .line 808
    .line 809
    .line 810
    invoke-virtual/range {v16 .. v16}, La0/q;->size()I

    .line 811
    .line 812
    .line 813
    move-result v0

    .line 814
    const/4 v12, 0x0

    .line 815
    :goto_15
    if-ge v12, v0, :cond_31

    .line 816
    .line 817
    move-object/from16 v5, v16

    .line 818
    .line 819
    invoke-virtual {v5, v12}, La0/q;->get(I)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    const v2, 0x71c084d9

    .line 824
    .line 825
    .line 826
    invoke-interface {v9, v1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v4

    .line 830
    const/4 v10, 0x0

    .line 831
    const/4 v13, 0x0

    .line 832
    invoke-virtual {v3, v2, v13, v4, v10}, LP/o;->O(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v15, v1}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v1

    .line 839
    check-cast v1, LB5/e;

    .line 840
    .line 841
    if-nez v1, :cond_30

    .line 842
    .line 843
    const v1, -0x39af5b50

    .line 844
    .line 845
    .line 846
    invoke-virtual {v3, v1}, LP/o;->S(I)V

    .line 847
    .line 848
    .line 849
    :goto_16
    invoke-virtual {v3, v13}, LP/o;->p(Z)V

    .line 850
    .line 851
    .line 852
    goto :goto_17

    .line 853
    :cond_30
    const v2, 0x71c08971

    .line 854
    .line 855
    .line 856
    invoke-virtual {v3, v2}, LP/o;->S(I)V

    .line 857
    .line 858
    .line 859
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    invoke-interface {v1, v3, v2}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    goto :goto_16

    .line 867
    :goto_17
    invoke-virtual {v3, v13}, LP/o;->p(Z)V

    .line 868
    .line 869
    .line 870
    add-int/lit8 v12, v12, 0x1

    .line 871
    .line 872
    move-object/from16 v16, v5

    .line 873
    .line 874
    goto :goto_15

    .line 875
    :cond_31
    const/4 v13, 0x0

    .line 876
    invoke-virtual {v3, v13}, LP/o;->p(Z)V

    .line 877
    .line 878
    .line 879
    const/4 v13, 0x1

    .line 880
    invoke-virtual {v3, v13}, LP/o;->p(Z)V

    .line 881
    .line 882
    .line 883
    goto :goto_18

    .line 884
    :cond_32
    move-object v6, v3

    .line 885
    move-object v3, v10

    .line 886
    invoke-virtual {v3}, LP/o;->N()V

    .line 887
    .line 888
    .line 889
    :goto_18
    invoke-virtual {v3}, LP/o;->r()LP/o0;

    .line 890
    .line 891
    .line 892
    move-result-object v10

    .line 893
    if-eqz v10, :cond_33

    .line 894
    .line 895
    new-instance v0, LM/v0;

    .line 896
    .line 897
    move-object/from16 v1, p0

    .line 898
    .line 899
    move-object v3, v6

    .line 900
    move-object v2, v7

    .line 901
    move-object v4, v8

    .line 902
    move-object v5, v9

    .line 903
    move v7, v11

    .line 904
    move-object/from16 v6, p5

    .line 905
    .line 906
    invoke-direct/range {v0 .. v7}, LM/v0;-><init>(Lu/v0;Lc0/m;LB5/c;Lc0/e;LB5/c;LX/e;I)V

    .line 907
    .line 908
    .line 909
    iput-object v0, v10, LP/o0;->d:LB5/e;

    .line 910
    .line 911
    :cond_33
    return-void
.end method
