.class public abstract Ld1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Z

    .line 3
    .line 4
    sput-object v0, Ld1/j;->a:[Z

    .line 5
    .line 6
    return-void
.end method

.method public static a(Ld1/e;Lb1/c;Ljava/util/ArrayList;I)V
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v10, p2

    .line 6
    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    iget v2, v0, Ld1/e;->z0:I

    .line 10
    .line 11
    iget-object v3, v0, Ld1/e;->C0:[Ld1/b;

    .line 12
    .line 13
    const/4 v15, 0x0

    .line 14
    :goto_0
    move v13, v2

    .line 15
    move-object v14, v3

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    iget v2, v0, Ld1/e;->A0:I

    .line 18
    .line 19
    iget-object v3, v0, Ld1/e;->B0:[Ld1/b;

    .line 20
    .line 21
    const/4 v15, 0x2

    .line 22
    goto :goto_0

    .line 23
    :goto_1
    const/4 v2, 0x0

    .line 24
    :goto_2
    if-ge v2, v13, :cond_71

    .line 25
    .line 26
    aget-object v3, v14, v2

    .line 27
    .line 28
    iget-boolean v4, v3, Ld1/b;->q:Z

    .line 29
    .line 30
    iget-object v5, v3, Ld1/b;->a:Ld1/d;

    .line 31
    .line 32
    const/4 v6, 0x3

    .line 33
    const/16 v16, 0x0

    .line 34
    .line 35
    const/16 v7, 0x8

    .line 36
    .line 37
    if-nez v4, :cond_19

    .line 38
    .line 39
    iget v4, v3, Ld1/b;->l:I

    .line 40
    .line 41
    mul-int/lit8 v17, v4, 0x2

    .line 42
    .line 43
    move-object v8, v5

    .line 44
    move-object v12, v8

    .line 45
    const/16 v18, 0x0

    .line 46
    .line 47
    const/16 v19, 0x0

    .line 48
    .line 49
    :goto_3
    if-nez v18, :cond_14

    .line 50
    .line 51
    const/16 v21, 0x1

    .line 52
    .line 53
    iget v9, v3, Ld1/b;->i:I

    .line 54
    .line 55
    add-int/lit8 v9, v9, 0x1

    .line 56
    .line 57
    iput v9, v3, Ld1/b;->i:I

    .line 58
    .line 59
    iget-object v9, v8, Ld1/d;->m0:[Ld1/d;

    .line 60
    .line 61
    iget-object v11, v8, Ld1/d;->Q:[Ld1/c;

    .line 62
    .line 63
    aput-object v16, v9, v4

    .line 64
    .line 65
    iget-object v9, v8, Ld1/d;->l0:[Ld1/d;

    .line 66
    .line 67
    aput-object v16, v9, v4

    .line 68
    .line 69
    iget v9, v8, Ld1/d;->g0:I

    .line 70
    .line 71
    if-eq v9, v7, :cond_e

    .line 72
    .line 73
    invoke-virtual {v8, v4}, Ld1/d;->j(I)I

    .line 74
    .line 75
    .line 76
    aget-object v9, v11, v17

    .line 77
    .line 78
    invoke-virtual {v9}, Ld1/c;->e()I

    .line 79
    .line 80
    .line 81
    add-int/lit8 v9, v17, 0x1

    .line 82
    .line 83
    aget-object v23, v11, v9

    .line 84
    .line 85
    invoke-virtual/range {v23 .. v23}, Ld1/c;->e()I

    .line 86
    .line 87
    .line 88
    aget-object v23, v11, v17

    .line 89
    .line 90
    invoke-virtual/range {v23 .. v23}, Ld1/c;->e()I

    .line 91
    .line 92
    .line 93
    aget-object v9, v11, v9

    .line 94
    .line 95
    invoke-virtual {v9}, Ld1/c;->e()I

    .line 96
    .line 97
    .line 98
    iget-object v9, v3, Ld1/b;->b:Ld1/d;

    .line 99
    .line 100
    if-nez v9, :cond_1

    .line 101
    .line 102
    iput-object v8, v3, Ld1/b;->b:Ld1/d;

    .line 103
    .line 104
    :cond_1
    iput-object v8, v3, Ld1/b;->d:Ld1/d;

    .line 105
    .line 106
    iget-object v9, v8, Ld1/d;->p0:[I

    .line 107
    .line 108
    aget v9, v9, v4

    .line 109
    .line 110
    if-ne v9, v6, :cond_e

    .line 111
    .line 112
    iget-object v7, v8, Ld1/d;->t:[I

    .line 113
    .line 114
    aget v7, v7, v4

    .line 115
    .line 116
    if-eqz v7, :cond_3

    .line 117
    .line 118
    if-eq v7, v6, :cond_3

    .line 119
    .line 120
    const/4 v6, 0x2

    .line 121
    if-ne v7, v6, :cond_2

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_2
    move/from16 v25, v2

    .line 125
    .line 126
    move/from16 v26, v4

    .line 127
    .line 128
    goto :goto_7

    .line 129
    :cond_3
    :goto_4
    iget v6, v3, Ld1/b;->j:I

    .line 130
    .line 131
    add-int/lit8 v6, v6, 0x1

    .line 132
    .line 133
    iput v6, v3, Ld1/b;->j:I

    .line 134
    .line 135
    iget-object v6, v8, Ld1/d;->k0:[F

    .line 136
    .line 137
    aget v6, v6, v4

    .line 138
    .line 139
    cmpl-float v25, v6, v19

    .line 140
    .line 141
    if-lez v25, :cond_4

    .line 142
    .line 143
    move/from16 v25, v2

    .line 144
    .line 145
    iget v2, v3, Ld1/b;->k:F

    .line 146
    .line 147
    add-float/2addr v2, v6

    .line 148
    iput v2, v3, Ld1/b;->k:F

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_4
    move/from16 v25, v2

    .line 152
    .line 153
    :goto_5
    iget v2, v8, Ld1/d;->g0:I

    .line 154
    .line 155
    move/from16 v26, v4

    .line 156
    .line 157
    const/16 v4, 0x8

    .line 158
    .line 159
    if-eq v2, v4, :cond_8

    .line 160
    .line 161
    const/4 v2, 0x3

    .line 162
    if-ne v9, v2, :cond_8

    .line 163
    .line 164
    if-eqz v7, :cond_5

    .line 165
    .line 166
    if-ne v7, v2, :cond_8

    .line 167
    .line 168
    :cond_5
    cmpg-float v2, v6, v19

    .line 169
    .line 170
    if-gez v2, :cond_6

    .line 171
    .line 172
    move/from16 v2, v21

    .line 173
    .line 174
    iput-boolean v2, v3, Ld1/b;->n:Z

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_6
    move/from16 v2, v21

    .line 178
    .line 179
    iput-boolean v2, v3, Ld1/b;->o:Z

    .line 180
    .line 181
    :goto_6
    iget-object v2, v3, Ld1/b;->h:Ljava/util/ArrayList;

    .line 182
    .line 183
    if-nez v2, :cond_7

    .line 184
    .line 185
    new-instance v2, Ljava/util/ArrayList;

    .line 186
    .line 187
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 188
    .line 189
    .line 190
    iput-object v2, v3, Ld1/b;->h:Ljava/util/ArrayList;

    .line 191
    .line 192
    :cond_7
    iget-object v2, v3, Ld1/b;->h:Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    :cond_8
    iget-object v2, v3, Ld1/b;->f:Ld1/d;

    .line 198
    .line 199
    if-nez v2, :cond_9

    .line 200
    .line 201
    iput-object v8, v3, Ld1/b;->f:Ld1/d;

    .line 202
    .line 203
    :cond_9
    iget-object v2, v3, Ld1/b;->g:Ld1/d;

    .line 204
    .line 205
    if-eqz v2, :cond_a

    .line 206
    .line 207
    iget-object v2, v2, Ld1/d;->l0:[Ld1/d;

    .line 208
    .line 209
    aput-object v8, v2, v26

    .line 210
    .line 211
    :cond_a
    iput-object v8, v3, Ld1/b;->g:Ld1/d;

    .line 212
    .line 213
    :goto_7
    if-nez v26, :cond_c

    .line 214
    .line 215
    iget v2, v8, Ld1/d;->r:I

    .line 216
    .line 217
    if-eqz v2, :cond_b

    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_b
    iget v2, v8, Ld1/d;->u:I

    .line 221
    .line 222
    if-nez v2, :cond_f

    .line 223
    .line 224
    iget v2, v8, Ld1/d;->v:I

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_c
    iget v2, v8, Ld1/d;->s:I

    .line 228
    .line 229
    if-eqz v2, :cond_d

    .line 230
    .line 231
    goto :goto_8

    .line 232
    :cond_d
    iget v2, v8, Ld1/d;->x:I

    .line 233
    .line 234
    if-nez v2, :cond_f

    .line 235
    .line 236
    iget v2, v8, Ld1/d;->y:I

    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_e
    move/from16 v25, v2

    .line 240
    .line 241
    move/from16 v26, v4

    .line 242
    .line 243
    :cond_f
    :goto_8
    if-eq v12, v8, :cond_10

    .line 244
    .line 245
    iget-object v2, v12, Ld1/d;->m0:[Ld1/d;

    .line 246
    .line 247
    aput-object v8, v2, v26

    .line 248
    .line 249
    :cond_10
    add-int/lit8 v2, v17, 0x1

    .line 250
    .line 251
    aget-object v2, v11, v2

    .line 252
    .line 253
    iget-object v2, v2, Ld1/c;->f:Ld1/c;

    .line 254
    .line 255
    if-eqz v2, :cond_11

    .line 256
    .line 257
    iget-object v2, v2, Ld1/c;->d:Ld1/d;

    .line 258
    .line 259
    iget-object v4, v2, Ld1/d;->Q:[Ld1/c;

    .line 260
    .line 261
    aget-object v4, v4, v17

    .line 262
    .line 263
    iget-object v4, v4, Ld1/c;->f:Ld1/c;

    .line 264
    .line 265
    if-eqz v4, :cond_11

    .line 266
    .line 267
    iget-object v4, v4, Ld1/c;->d:Ld1/d;

    .line 268
    .line 269
    if-eq v4, v8, :cond_12

    .line 270
    .line 271
    :cond_11
    move-object/from16 v2, v16

    .line 272
    .line 273
    :cond_12
    if-eqz v2, :cond_13

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_13
    move-object v2, v8

    .line 277
    const/16 v18, 0x1

    .line 278
    .line 279
    :goto_9
    move-object v12, v8

    .line 280
    move/from16 v4, v26

    .line 281
    .line 282
    const/4 v6, 0x3

    .line 283
    const/16 v7, 0x8

    .line 284
    .line 285
    move-object v8, v2

    .line 286
    move/from16 v2, v25

    .line 287
    .line 288
    goto/16 :goto_3

    .line 289
    .line 290
    :cond_14
    move/from16 v25, v2

    .line 291
    .line 292
    move/from16 v26, v4

    .line 293
    .line 294
    iget-object v2, v3, Ld1/b;->b:Ld1/d;

    .line 295
    .line 296
    if-eqz v2, :cond_15

    .line 297
    .line 298
    iget-object v2, v2, Ld1/d;->Q:[Ld1/c;

    .line 299
    .line 300
    aget-object v2, v2, v17

    .line 301
    .line 302
    invoke-virtual {v2}, Ld1/c;->e()I

    .line 303
    .line 304
    .line 305
    :cond_15
    iget-object v2, v3, Ld1/b;->d:Ld1/d;

    .line 306
    .line 307
    if-eqz v2, :cond_16

    .line 308
    .line 309
    iget-object v2, v2, Ld1/d;->Q:[Ld1/c;

    .line 310
    .line 311
    add-int/lit8 v17, v17, 0x1

    .line 312
    .line 313
    aget-object v2, v2, v17

    .line 314
    .line 315
    invoke-virtual {v2}, Ld1/c;->e()I

    .line 316
    .line 317
    .line 318
    :cond_16
    iput-object v8, v3, Ld1/b;->c:Ld1/d;

    .line 319
    .line 320
    if-nez v26, :cond_17

    .line 321
    .line 322
    iget-boolean v2, v3, Ld1/b;->m:Z

    .line 323
    .line 324
    if-eqz v2, :cond_17

    .line 325
    .line 326
    iput-object v8, v3, Ld1/b;->e:Ld1/d;

    .line 327
    .line 328
    goto :goto_a

    .line 329
    :cond_17
    iput-object v5, v3, Ld1/b;->e:Ld1/d;

    .line 330
    .line 331
    :goto_a
    iget-boolean v2, v3, Ld1/b;->o:Z

    .line 332
    .line 333
    if-eqz v2, :cond_18

    .line 334
    .line 335
    iget-boolean v2, v3, Ld1/b;->n:Z

    .line 336
    .line 337
    if-eqz v2, :cond_18

    .line 338
    .line 339
    const/4 v2, 0x1

    .line 340
    goto :goto_b

    .line 341
    :cond_18
    const/4 v2, 0x0

    .line 342
    :goto_b
    iput-boolean v2, v3, Ld1/b;->p:Z

    .line 343
    .line 344
    :goto_c
    const/4 v2, 0x1

    .line 345
    goto :goto_d

    .line 346
    :cond_19
    move/from16 v25, v2

    .line 347
    .line 348
    const/16 v19, 0x0

    .line 349
    .line 350
    goto :goto_c

    .line 351
    :goto_d
    iput-boolean v2, v3, Ld1/b;->q:Z

    .line 352
    .line 353
    if-eqz v10, :cond_1b

    .line 354
    .line 355
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    if-eqz v2, :cond_1a

    .line 360
    .line 361
    goto :goto_e

    .line 362
    :cond_1a
    move/from16 v37, v13

    .line 363
    .line 364
    move-object/from16 v19, v14

    .line 365
    .line 366
    const/16 v20, 0x0

    .line 367
    .line 368
    const/16 v27, 0x2

    .line 369
    .line 370
    goto/16 :goto_48

    .line 371
    .line 372
    :cond_1b
    :goto_e
    iget-object v11, v3, Ld1/b;->c:Ld1/d;

    .line 373
    .line 374
    iget-object v12, v3, Ld1/b;->b:Ld1/d;

    .line 375
    .line 376
    iget-object v2, v3, Ld1/b;->d:Ld1/d;

    .line 377
    .line 378
    iget-object v4, v3, Ld1/b;->e:Ld1/d;

    .line 379
    .line 380
    iget v6, v3, Ld1/b;->k:F

    .line 381
    .line 382
    iget-object v7, v0, Ld1/d;->p0:[I

    .line 383
    .line 384
    iget-object v8, v0, Ld1/d;->Q:[Ld1/c;

    .line 385
    .line 386
    aget v7, v7, p3

    .line 387
    .line 388
    const/4 v9, 0x2

    .line 389
    if-ne v7, v9, :cond_1c

    .line 390
    .line 391
    const/4 v7, 0x1

    .line 392
    goto :goto_f

    .line 393
    :cond_1c
    const/4 v7, 0x0

    .line 394
    :goto_f
    if-nez p3, :cond_20

    .line 395
    .line 396
    iget v9, v4, Ld1/d;->i0:I

    .line 397
    .line 398
    if-nez v9, :cond_1d

    .line 399
    .line 400
    const/16 v21, 0x1

    .line 401
    .line 402
    :goto_10
    move/from16 v17, v6

    .line 403
    .line 404
    const/4 v6, 0x1

    .line 405
    goto :goto_11

    .line 406
    :cond_1d
    const/16 v21, 0x0

    .line 407
    .line 408
    goto :goto_10

    .line 409
    :goto_11
    if-ne v9, v6, :cond_1e

    .line 410
    .line 411
    move/from16 v18, v6

    .line 412
    .line 413
    :goto_12
    const/4 v6, 0x2

    .line 414
    goto :goto_13

    .line 415
    :cond_1e
    const/16 v18, 0x0

    .line 416
    .line 417
    goto :goto_12

    .line 418
    :goto_13
    if-ne v9, v6, :cond_1f

    .line 419
    .line 420
    const/4 v9, 0x1

    .line 421
    goto :goto_14

    .line 422
    :cond_1f
    const/4 v9, 0x0

    .line 423
    :goto_14
    move-object v6, v5

    .line 424
    move/from16 v28, v7

    .line 425
    .line 426
    move/from16 v26, v21

    .line 427
    .line 428
    :goto_15
    const/16 v22, 0x0

    .line 429
    .line 430
    goto :goto_1b

    .line 431
    :cond_20
    move/from16 v17, v6

    .line 432
    .line 433
    move v6, v9

    .line 434
    iget v9, v4, Ld1/d;->j0:I

    .line 435
    .line 436
    if-nez v9, :cond_21

    .line 437
    .line 438
    const/16 v22, 0x1

    .line 439
    .line 440
    :goto_16
    const/4 v6, 0x1

    .line 441
    goto :goto_17

    .line 442
    :cond_21
    const/16 v22, 0x0

    .line 443
    .line 444
    goto :goto_16

    .line 445
    :goto_17
    if-ne v9, v6, :cond_22

    .line 446
    .line 447
    const/16 v18, 0x1

    .line 448
    .line 449
    :goto_18
    const/4 v6, 0x2

    .line 450
    goto :goto_19

    .line 451
    :cond_22
    const/16 v18, 0x0

    .line 452
    .line 453
    goto :goto_18

    .line 454
    :goto_19
    if-ne v9, v6, :cond_23

    .line 455
    .line 456
    const/4 v9, 0x1

    .line 457
    goto :goto_1a

    .line 458
    :cond_23
    const/4 v9, 0x0

    .line 459
    :goto_1a
    move-object v6, v5

    .line 460
    move/from16 v28, v7

    .line 461
    .line 462
    move/from16 v26, v22

    .line 463
    .line 464
    goto :goto_15

    .line 465
    :goto_1b
    if-nez v22, :cond_31

    .line 466
    .line 467
    iget-object v7, v6, Ld1/d;->Q:[Ld1/c;

    .line 468
    .line 469
    move-object/from16 v32, v7

    .line 470
    .line 471
    iget-object v7, v6, Ld1/d;->p0:[I

    .line 472
    .line 473
    move-object/from16 v33, v7

    .line 474
    .line 475
    aget-object v7, v32, v15

    .line 476
    .line 477
    if-eqz v9, :cond_24

    .line 478
    .line 479
    const/16 v30, 0x1

    .line 480
    .line 481
    goto :goto_1c

    .line 482
    :cond_24
    const/16 v30, 0x4

    .line 483
    .line 484
    :goto_1c
    invoke-virtual {v7}, Ld1/c;->e()I

    .line 485
    .line 486
    .line 487
    move-result v34

    .line 488
    move-object/from16 v35, v8

    .line 489
    .line 490
    aget v8, v33, p3

    .line 491
    .line 492
    move/from16 v36, v9

    .line 493
    .line 494
    const/4 v9, 0x3

    .line 495
    if-ne v8, v9, :cond_25

    .line 496
    .line 497
    iget-object v8, v6, Ld1/d;->t:[I

    .line 498
    .line 499
    aget v8, v8, p3

    .line 500
    .line 501
    if-nez v8, :cond_25

    .line 502
    .line 503
    const/4 v8, 0x1

    .line 504
    goto :goto_1d

    .line 505
    :cond_25
    const/4 v8, 0x0

    .line 506
    :goto_1d
    iget-object v9, v7, Ld1/c;->f:Ld1/c;

    .line 507
    .line 508
    if-eqz v9, :cond_26

    .line 509
    .line 510
    if-eq v6, v5, :cond_26

    .line 511
    .line 512
    invoke-virtual {v9}, Ld1/c;->e()I

    .line 513
    .line 514
    .line 515
    move-result v9

    .line 516
    add-int v34, v9, v34

    .line 517
    .line 518
    :cond_26
    move/from16 v9, v34

    .line 519
    .line 520
    if-eqz v36, :cond_27

    .line 521
    .line 522
    if-eq v6, v5, :cond_27

    .line 523
    .line 524
    if-eq v6, v12, :cond_27

    .line 525
    .line 526
    const/16 v30, 0x8

    .line 527
    .line 528
    :cond_27
    move/from16 v34, v8

    .line 529
    .line 530
    iget-object v8, v7, Ld1/c;->f:Ld1/c;

    .line 531
    .line 532
    if-eqz v8, :cond_2b

    .line 533
    .line 534
    if-ne v6, v12, :cond_28

    .line 535
    .line 536
    iget-object v10, v7, Ld1/c;->i:Lb1/f;

    .line 537
    .line 538
    iget-object v8, v8, Ld1/c;->i:Lb1/f;

    .line 539
    .line 540
    move/from16 v37, v13

    .line 541
    .line 542
    const/4 v13, 0x6

    .line 543
    invoke-virtual {v1, v10, v8, v9, v13}, Lb1/c;->f(Lb1/f;Lb1/f;II)V

    .line 544
    .line 545
    .line 546
    goto :goto_1e

    .line 547
    :cond_28
    move/from16 v37, v13

    .line 548
    .line 549
    iget-object v10, v7, Ld1/c;->i:Lb1/f;

    .line 550
    .line 551
    iget-object v8, v8, Ld1/c;->i:Lb1/f;

    .line 552
    .line 553
    const/16 v13, 0x8

    .line 554
    .line 555
    invoke-virtual {v1, v10, v8, v9, v13}, Lb1/c;->f(Lb1/f;Lb1/f;II)V

    .line 556
    .line 557
    .line 558
    :goto_1e
    if-eqz v34, :cond_29

    .line 559
    .line 560
    if-nez v36, :cond_29

    .line 561
    .line 562
    const/16 v30, 0x5

    .line 563
    .line 564
    :cond_29
    if-ne v6, v12, :cond_2a

    .line 565
    .line 566
    if-eqz v36, :cond_2a

    .line 567
    .line 568
    iget-object v8, v6, Ld1/d;->S:[Z

    .line 569
    .line 570
    aget-boolean v8, v8, p3

    .line 571
    .line 572
    if-eqz v8, :cond_2a

    .line 573
    .line 574
    const/4 v8, 0x5

    .line 575
    goto :goto_1f

    .line 576
    :cond_2a
    move/from16 v8, v30

    .line 577
    .line 578
    :goto_1f
    iget-object v10, v7, Ld1/c;->i:Lb1/f;

    .line 579
    .line 580
    iget-object v7, v7, Ld1/c;->f:Ld1/c;

    .line 581
    .line 582
    iget-object v7, v7, Ld1/c;->i:Lb1/f;

    .line 583
    .line 584
    invoke-virtual {v1, v10, v7, v9, v8}, Lb1/c;->e(Lb1/f;Lb1/f;II)V

    .line 585
    .line 586
    .line 587
    goto :goto_20

    .line 588
    :cond_2b
    move/from16 v37, v13

    .line 589
    .line 590
    :goto_20
    if-eqz v28, :cond_2d

    .line 591
    .line 592
    iget v7, v6, Ld1/d;->g0:I

    .line 593
    .line 594
    const/16 v13, 0x8

    .line 595
    .line 596
    if-eq v7, v13, :cond_2c

    .line 597
    .line 598
    aget v7, v33, p3

    .line 599
    .line 600
    const/4 v9, 0x3

    .line 601
    if-ne v7, v9, :cond_2c

    .line 602
    .line 603
    add-int/lit8 v7, v15, 0x1

    .line 604
    .line 605
    aget-object v7, v32, v7

    .line 606
    .line 607
    iget-object v7, v7, Ld1/c;->i:Lb1/f;

    .line 608
    .line 609
    aget-object v8, v32, v15

    .line 610
    .line 611
    iget-object v8, v8, Ld1/c;->i:Lb1/f;

    .line 612
    .line 613
    const/4 v9, 0x0

    .line 614
    const/4 v10, 0x5

    .line 615
    invoke-virtual {v1, v7, v8, v9, v10}, Lb1/c;->f(Lb1/f;Lb1/f;II)V

    .line 616
    .line 617
    .line 618
    goto :goto_21

    .line 619
    :cond_2c
    const/4 v9, 0x0

    .line 620
    :goto_21
    aget-object v7, v32, v15

    .line 621
    .line 622
    iget-object v7, v7, Ld1/c;->i:Lb1/f;

    .line 623
    .line 624
    aget-object v8, v35, v15

    .line 625
    .line 626
    iget-object v8, v8, Ld1/c;->i:Lb1/f;

    .line 627
    .line 628
    const/16 v13, 0x8

    .line 629
    .line 630
    invoke-virtual {v1, v7, v8, v9, v13}, Lb1/c;->f(Lb1/f;Lb1/f;II)V

    .line 631
    .line 632
    .line 633
    :cond_2d
    add-int/lit8 v7, v15, 0x1

    .line 634
    .line 635
    aget-object v7, v32, v7

    .line 636
    .line 637
    iget-object v7, v7, Ld1/c;->f:Ld1/c;

    .line 638
    .line 639
    if-eqz v7, :cond_2e

    .line 640
    .line 641
    iget-object v7, v7, Ld1/c;->d:Ld1/d;

    .line 642
    .line 643
    iget-object v8, v7, Ld1/d;->Q:[Ld1/c;

    .line 644
    .line 645
    aget-object v8, v8, v15

    .line 646
    .line 647
    iget-object v8, v8, Ld1/c;->f:Ld1/c;

    .line 648
    .line 649
    if-eqz v8, :cond_2e

    .line 650
    .line 651
    iget-object v8, v8, Ld1/c;->d:Ld1/d;

    .line 652
    .line 653
    if-eq v8, v6, :cond_2f

    .line 654
    .line 655
    :cond_2e
    move-object/from16 v7, v16

    .line 656
    .line 657
    :cond_2f
    if-eqz v7, :cond_30

    .line 658
    .line 659
    move-object v6, v7

    .line 660
    goto :goto_22

    .line 661
    :cond_30
    const/16 v22, 0x1

    .line 662
    .line 663
    :goto_22
    move-object/from16 v10, p2

    .line 664
    .line 665
    move-object/from16 v8, v35

    .line 666
    .line 667
    move/from16 v9, v36

    .line 668
    .line 669
    move/from16 v13, v37

    .line 670
    .line 671
    goto/16 :goto_1b

    .line 672
    .line 673
    :cond_31
    move-object/from16 v35, v8

    .line 674
    .line 675
    move/from16 v36, v9

    .line 676
    .line 677
    move/from16 v37, v13

    .line 678
    .line 679
    if-eqz v2, :cond_34

    .line 680
    .line 681
    iget-object v6, v11, Ld1/d;->Q:[Ld1/c;

    .line 682
    .line 683
    add-int/lit8 v7, v15, 0x1

    .line 684
    .line 685
    aget-object v6, v6, v7

    .line 686
    .line 687
    iget-object v6, v6, Ld1/c;->f:Ld1/c;

    .line 688
    .line 689
    if-eqz v6, :cond_34

    .line 690
    .line 691
    iget-object v6, v2, Ld1/d;->Q:[Ld1/c;

    .line 692
    .line 693
    aget-object v6, v6, v7

    .line 694
    .line 695
    iget-object v8, v2, Ld1/d;->p0:[I

    .line 696
    .line 697
    aget v8, v8, p3

    .line 698
    .line 699
    const/4 v9, 0x3

    .line 700
    if-ne v8, v9, :cond_32

    .line 701
    .line 702
    iget-object v8, v2, Ld1/d;->t:[I

    .line 703
    .line 704
    aget v8, v8, p3

    .line 705
    .line 706
    if-nez v8, :cond_32

    .line 707
    .line 708
    if-nez v36, :cond_32

    .line 709
    .line 710
    iget-object v8, v6, Ld1/c;->f:Ld1/c;

    .line 711
    .line 712
    iget-object v9, v8, Ld1/c;->d:Ld1/d;

    .line 713
    .line 714
    if-ne v9, v0, :cond_32

    .line 715
    .line 716
    iget-object v9, v6, Ld1/c;->i:Lb1/f;

    .line 717
    .line 718
    iget-object v8, v8, Ld1/c;->i:Lb1/f;

    .line 719
    .line 720
    invoke-virtual {v6}, Ld1/c;->e()I

    .line 721
    .line 722
    .line 723
    move-result v10

    .line 724
    neg-int v10, v10

    .line 725
    const/4 v13, 0x5

    .line 726
    invoke-virtual {v1, v9, v8, v10, v13}, Lb1/c;->e(Lb1/f;Lb1/f;II)V

    .line 727
    .line 728
    .line 729
    goto :goto_23

    .line 730
    :cond_32
    const/4 v13, 0x5

    .line 731
    if-eqz v36, :cond_33

    .line 732
    .line 733
    iget-object v8, v6, Ld1/c;->f:Ld1/c;

    .line 734
    .line 735
    iget-object v9, v8, Ld1/c;->d:Ld1/d;

    .line 736
    .line 737
    if-ne v9, v0, :cond_33

    .line 738
    .line 739
    iget-object v9, v6, Ld1/c;->i:Lb1/f;

    .line 740
    .line 741
    iget-object v8, v8, Ld1/c;->i:Lb1/f;

    .line 742
    .line 743
    invoke-virtual {v6}, Ld1/c;->e()I

    .line 744
    .line 745
    .line 746
    move-result v10

    .line 747
    neg-int v10, v10

    .line 748
    const/4 v13, 0x4

    .line 749
    invoke-virtual {v1, v9, v8, v10, v13}, Lb1/c;->e(Lb1/f;Lb1/f;II)V

    .line 750
    .line 751
    .line 752
    :cond_33
    :goto_23
    iget-object v8, v6, Ld1/c;->i:Lb1/f;

    .line 753
    .line 754
    iget-object v9, v11, Ld1/d;->Q:[Ld1/c;

    .line 755
    .line 756
    aget-object v7, v9, v7

    .line 757
    .line 758
    iget-object v7, v7, Ld1/c;->f:Ld1/c;

    .line 759
    .line 760
    iget-object v7, v7, Ld1/c;->i:Lb1/f;

    .line 761
    .line 762
    invoke-virtual {v6}, Ld1/c;->e()I

    .line 763
    .line 764
    .line 765
    move-result v6

    .line 766
    neg-int v6, v6

    .line 767
    const/4 v13, 0x6

    .line 768
    invoke-virtual {v1, v8, v7, v6, v13}, Lb1/c;->g(Lb1/f;Lb1/f;II)V

    .line 769
    .line 770
    .line 771
    :cond_34
    if-eqz v28, :cond_35

    .line 772
    .line 773
    add-int/lit8 v6, v15, 0x1

    .line 774
    .line 775
    aget-object v7, v35, v6

    .line 776
    .line 777
    iget-object v7, v7, Ld1/c;->i:Lb1/f;

    .line 778
    .line 779
    iget-object v8, v11, Ld1/d;->Q:[Ld1/c;

    .line 780
    .line 781
    aget-object v6, v8, v6

    .line 782
    .line 783
    iget-object v8, v6, Ld1/c;->i:Lb1/f;

    .line 784
    .line 785
    invoke-virtual {v6}, Ld1/c;->e()I

    .line 786
    .line 787
    .line 788
    move-result v6

    .line 789
    const/16 v13, 0x8

    .line 790
    .line 791
    invoke-virtual {v1, v7, v8, v6, v13}, Lb1/c;->f(Lb1/f;Lb1/f;II)V

    .line 792
    .line 793
    .line 794
    :cond_35
    iget-object v6, v3, Ld1/b;->h:Ljava/util/ArrayList;

    .line 795
    .line 796
    if-eqz v6, :cond_3f

    .line 797
    .line 798
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 799
    .line 800
    .line 801
    move-result v7

    .line 802
    const/4 v8, 0x1

    .line 803
    if-le v7, v8, :cond_3f

    .line 804
    .line 805
    iget-boolean v9, v3, Ld1/b;->n:Z

    .line 806
    .line 807
    if-eqz v9, :cond_36

    .line 808
    .line 809
    iget-boolean v9, v3, Ld1/b;->p:Z

    .line 810
    .line 811
    if-nez v9, :cond_36

    .line 812
    .line 813
    iget v9, v3, Ld1/b;->j:I

    .line 814
    .line 815
    int-to-float v9, v9

    .line 816
    move/from16 v17, v9

    .line 817
    .line 818
    :cond_36
    move-object/from16 v10, v16

    .line 819
    .line 820
    move/from16 v13, v19

    .line 821
    .line 822
    const/4 v9, 0x0

    .line 823
    :goto_24
    if-ge v9, v7, :cond_3f

    .line 824
    .line 825
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v21

    .line 829
    move-object/from16 v8, v21

    .line 830
    .line 831
    check-cast v8, Ld1/d;

    .line 832
    .line 833
    iget-object v0, v8, Ld1/d;->k0:[F

    .line 834
    .line 835
    move-object/from16 v21, v0

    .line 836
    .line 837
    iget-object v0, v8, Ld1/d;->Q:[Ld1/c;

    .line 838
    .line 839
    aget v21, v21, p3

    .line 840
    .line 841
    cmpg-float v24, v21, v19

    .line 842
    .line 843
    move-object/from16 v28, v0

    .line 844
    .line 845
    if-gez v24, :cond_38

    .line 846
    .line 847
    iget-boolean v0, v3, Ld1/b;->p:Z

    .line 848
    .line 849
    if-eqz v0, :cond_37

    .line 850
    .line 851
    add-int/lit8 v0, v15, 0x1

    .line 852
    .line 853
    aget-object v0, v28, v0

    .line 854
    .line 855
    iget-object v0, v0, Ld1/c;->i:Lb1/f;

    .line 856
    .line 857
    aget-object v8, v28, v15

    .line 858
    .line 859
    iget-object v8, v8, Ld1/c;->i:Lb1/f;

    .line 860
    .line 861
    move-object/from16 v29, v6

    .line 862
    .line 863
    move/from16 v30, v7

    .line 864
    .line 865
    const/4 v6, 0x0

    .line 866
    const/4 v7, 0x4

    .line 867
    invoke-virtual {v1, v0, v8, v6, v7}, Lb1/c;->e(Lb1/f;Lb1/f;II)V

    .line 868
    .line 869
    .line 870
    move/from16 v20, v9

    .line 871
    .line 872
    move v9, v6

    .line 873
    goto :goto_25

    .line 874
    :cond_37
    const/high16 v21, 0x3f800000    # 1.0f

    .line 875
    .line 876
    :cond_38
    move-object/from16 v29, v6

    .line 877
    .line 878
    move/from16 v30, v7

    .line 879
    .line 880
    const/4 v7, 0x4

    .line 881
    cmpl-float v0, v21, v19

    .line 882
    .line 883
    if-nez v0, :cond_39

    .line 884
    .line 885
    add-int/lit8 v0, v15, 0x1

    .line 886
    .line 887
    aget-object v0, v28, v0

    .line 888
    .line 889
    iget-object v0, v0, Ld1/c;->i:Lb1/f;

    .line 890
    .line 891
    aget-object v6, v28, v15

    .line 892
    .line 893
    iget-object v6, v6, Ld1/c;->i:Lb1/f;

    .line 894
    .line 895
    move/from16 v20, v9

    .line 896
    .line 897
    const/16 v8, 0x8

    .line 898
    .line 899
    const/4 v9, 0x0

    .line 900
    invoke-virtual {v1, v0, v6, v9, v8}, Lb1/c;->e(Lb1/f;Lb1/f;II)V

    .line 901
    .line 902
    .line 903
    :goto_25
    move/from16 v35, v19

    .line 904
    .line 905
    move-object/from16 v19, v14

    .line 906
    .line 907
    goto/16 :goto_2a

    .line 908
    .line 909
    :cond_39
    move/from16 v20, v9

    .line 910
    .line 911
    const/4 v9, 0x0

    .line 912
    if-eqz v10, :cond_3e

    .line 913
    .line 914
    iget-object v6, v10, Ld1/d;->Q:[Ld1/c;

    .line 915
    .line 916
    aget-object v10, v6, v15

    .line 917
    .line 918
    iget-object v10, v10, Ld1/c;->i:Lb1/f;

    .line 919
    .line 920
    add-int/lit8 v32, v15, 0x1

    .line 921
    .line 922
    aget-object v6, v6, v32

    .line 923
    .line 924
    iget-object v6, v6, Ld1/c;->i:Lb1/f;

    .line 925
    .line 926
    aget-object v7, v28, v15

    .line 927
    .line 928
    iget-object v7, v7, Ld1/c;->i:Lb1/f;

    .line 929
    .line 930
    aget-object v9, v28, v32

    .line 931
    .line 932
    iget-object v9, v9, Ld1/c;->i:Lb1/f;

    .line 933
    .line 934
    move/from16 v28, v0

    .line 935
    .line 936
    invoke-virtual {v1}, Lb1/c;->l()Lb1/b;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    move-object/from16 v32, v8

    .line 941
    .line 942
    move/from16 v8, v19

    .line 943
    .line 944
    iput v8, v0, Lb1/b;->b:F

    .line 945
    .line 946
    cmpl-float v19, v17, v8

    .line 947
    .line 948
    move/from16 v35, v8

    .line 949
    .line 950
    const/high16 v8, -0x40800000    # -1.0f

    .line 951
    .line 952
    if-eqz v19, :cond_3a

    .line 953
    .line 954
    cmpl-float v19, v13, v21

    .line 955
    .line 956
    if-nez v19, :cond_3b

    .line 957
    .line 958
    :cond_3a
    move-object/from16 v19, v14

    .line 959
    .line 960
    move v14, v8

    .line 961
    const/high16 v8, 0x3f800000    # 1.0f

    .line 962
    .line 963
    goto :goto_27

    .line 964
    :cond_3b
    cmpl-float v19, v13, v35

    .line 965
    .line 966
    if-nez v19, :cond_3c

    .line 967
    .line 968
    iget-object v7, v0, Lb1/b;->d:Lb1/a;

    .line 969
    .line 970
    const/high16 v9, 0x3f800000    # 1.0f

    .line 971
    .line 972
    invoke-virtual {v7, v10, v9}, Lb1/a;->g(Lb1/f;F)V

    .line 973
    .line 974
    .line 975
    iget-object v7, v0, Lb1/b;->d:Lb1/a;

    .line 976
    .line 977
    invoke-virtual {v7, v6, v8}, Lb1/a;->g(Lb1/f;F)V

    .line 978
    .line 979
    .line 980
    :goto_26
    move-object/from16 v19, v14

    .line 981
    .line 982
    goto :goto_28

    .line 983
    :cond_3c
    const/high16 v8, 0x3f800000    # 1.0f

    .line 984
    .line 985
    if-nez v28, :cond_3d

    .line 986
    .line 987
    iget-object v6, v0, Lb1/b;->d:Lb1/a;

    .line 988
    .line 989
    invoke-virtual {v6, v7, v8}, Lb1/a;->g(Lb1/f;F)V

    .line 990
    .line 991
    .line 992
    iget-object v6, v0, Lb1/b;->d:Lb1/a;

    .line 993
    .line 994
    const/high16 v7, -0x40800000    # -1.0f

    .line 995
    .line 996
    invoke-virtual {v6, v9, v7}, Lb1/a;->g(Lb1/f;F)V

    .line 997
    .line 998
    .line 999
    goto :goto_26

    .line 1000
    :cond_3d
    div-float v13, v13, v17

    .line 1001
    .line 1002
    div-float v19, v21, v17

    .line 1003
    .line 1004
    div-float v13, v13, v19

    .line 1005
    .line 1006
    move-object/from16 v19, v14

    .line 1007
    .line 1008
    iget-object v14, v0, Lb1/b;->d:Lb1/a;

    .line 1009
    .line 1010
    invoke-virtual {v14, v10, v8}, Lb1/a;->g(Lb1/f;F)V

    .line 1011
    .line 1012
    .line 1013
    iget-object v8, v0, Lb1/b;->d:Lb1/a;

    .line 1014
    .line 1015
    const/high16 v14, -0x40800000    # -1.0f

    .line 1016
    .line 1017
    invoke-virtual {v8, v6, v14}, Lb1/a;->g(Lb1/f;F)V

    .line 1018
    .line 1019
    .line 1020
    iget-object v6, v0, Lb1/b;->d:Lb1/a;

    .line 1021
    .line 1022
    invoke-virtual {v6, v9, v13}, Lb1/a;->g(Lb1/f;F)V

    .line 1023
    .line 1024
    .line 1025
    iget-object v6, v0, Lb1/b;->d:Lb1/a;

    .line 1026
    .line 1027
    neg-float v8, v13

    .line 1028
    invoke-virtual {v6, v7, v8}, Lb1/a;->g(Lb1/f;F)V

    .line 1029
    .line 1030
    .line 1031
    goto :goto_28

    .line 1032
    :goto_27
    iget-object v13, v0, Lb1/b;->d:Lb1/a;

    .line 1033
    .line 1034
    invoke-virtual {v13, v10, v8}, Lb1/a;->g(Lb1/f;F)V

    .line 1035
    .line 1036
    .line 1037
    iget-object v10, v0, Lb1/b;->d:Lb1/a;

    .line 1038
    .line 1039
    invoke-virtual {v10, v6, v14}, Lb1/a;->g(Lb1/f;F)V

    .line 1040
    .line 1041
    .line 1042
    iget-object v6, v0, Lb1/b;->d:Lb1/a;

    .line 1043
    .line 1044
    invoke-virtual {v6, v9, v8}, Lb1/a;->g(Lb1/f;F)V

    .line 1045
    .line 1046
    .line 1047
    iget-object v6, v0, Lb1/b;->d:Lb1/a;

    .line 1048
    .line 1049
    invoke-virtual {v6, v7, v14}, Lb1/a;->g(Lb1/f;F)V

    .line 1050
    .line 1051
    .line 1052
    :goto_28
    invoke-virtual {v1, v0}, Lb1/c;->c(Lb1/b;)V

    .line 1053
    .line 1054
    .line 1055
    goto :goto_29

    .line 1056
    :cond_3e
    move-object/from16 v32, v8

    .line 1057
    .line 1058
    move/from16 v35, v19

    .line 1059
    .line 1060
    move-object/from16 v19, v14

    .line 1061
    .line 1062
    :goto_29
    move/from16 v13, v21

    .line 1063
    .line 1064
    move-object/from16 v10, v32

    .line 1065
    .line 1066
    :goto_2a
    add-int/lit8 v9, v20, 0x1

    .line 1067
    .line 1068
    const/4 v8, 0x1

    .line 1069
    move-object/from16 v0, p0

    .line 1070
    .line 1071
    move-object/from16 v14, v19

    .line 1072
    .line 1073
    move-object/from16 v6, v29

    .line 1074
    .line 1075
    move/from16 v7, v30

    .line 1076
    .line 1077
    move/from16 v19, v35

    .line 1078
    .line 1079
    goto/16 :goto_24

    .line 1080
    .line 1081
    :cond_3f
    move-object/from16 v19, v14

    .line 1082
    .line 1083
    if-eqz v12, :cond_40

    .line 1084
    .line 1085
    if-eq v12, v2, :cond_41

    .line 1086
    .line 1087
    if-eqz v36, :cond_40

    .line 1088
    .line 1089
    goto :goto_2b

    .line 1090
    :cond_40
    move-object v0, v2

    .line 1091
    const/16 v20, 0x0

    .line 1092
    .line 1093
    const/16 v27, 0x2

    .line 1094
    .line 1095
    goto :goto_31

    .line 1096
    :cond_41
    :goto_2b
    iget-object v0, v5, Ld1/d;->Q:[Ld1/c;

    .line 1097
    .line 1098
    aget-object v0, v0, v15

    .line 1099
    .line 1100
    iget-object v3, v11, Ld1/d;->Q:[Ld1/c;

    .line 1101
    .line 1102
    add-int/lit8 v5, v15, 0x1

    .line 1103
    .line 1104
    aget-object v3, v3, v5

    .line 1105
    .line 1106
    iget-object v0, v0, Ld1/c;->f:Ld1/c;

    .line 1107
    .line 1108
    if-eqz v0, :cond_42

    .line 1109
    .line 1110
    iget-object v0, v0, Ld1/c;->i:Lb1/f;

    .line 1111
    .line 1112
    goto :goto_2c

    .line 1113
    :cond_42
    move-object/from16 v0, v16

    .line 1114
    .line 1115
    :goto_2c
    iget-object v6, v3, Ld1/c;->f:Ld1/c;

    .line 1116
    .line 1117
    if-eqz v6, :cond_43

    .line 1118
    .line 1119
    iget-object v6, v6, Ld1/c;->i:Lb1/f;

    .line 1120
    .line 1121
    goto :goto_2d

    .line 1122
    :cond_43
    move-object/from16 v6, v16

    .line 1123
    .line 1124
    :goto_2d
    iget-object v7, v12, Ld1/d;->Q:[Ld1/c;

    .line 1125
    .line 1126
    aget-object v7, v7, v15

    .line 1127
    .line 1128
    if-eqz v2, :cond_44

    .line 1129
    .line 1130
    iget-object v3, v2, Ld1/d;->Q:[Ld1/c;

    .line 1131
    .line 1132
    aget-object v3, v3, v5

    .line 1133
    .line 1134
    :cond_44
    if-eqz v0, :cond_46

    .line 1135
    .line 1136
    if-eqz v6, :cond_46

    .line 1137
    .line 1138
    if-nez p3, :cond_45

    .line 1139
    .line 1140
    iget v4, v4, Ld1/d;->d0:F

    .line 1141
    .line 1142
    :goto_2e
    move v5, v4

    .line 1143
    goto :goto_2f

    .line 1144
    :cond_45
    iget v4, v4, Ld1/d;->e0:F

    .line 1145
    .line 1146
    goto :goto_2e

    .line 1147
    :goto_2f
    invoke-virtual {v7}, Ld1/c;->e()I

    .line 1148
    .line 1149
    .line 1150
    move-result v4

    .line 1151
    invoke-virtual {v3}, Ld1/c;->e()I

    .line 1152
    .line 1153
    .line 1154
    move-result v8

    .line 1155
    iget-object v7, v7, Ld1/c;->i:Lb1/f;

    .line 1156
    .line 1157
    iget-object v3, v3, Ld1/c;->i:Lb1/f;

    .line 1158
    .line 1159
    const/4 v9, 0x7

    .line 1160
    move-object/from16 v20, v3

    .line 1161
    .line 1162
    move-object v3, v0

    .line 1163
    move-object v0, v2

    .line 1164
    move-object v2, v7

    .line 1165
    move-object/from16 v7, v20

    .line 1166
    .line 1167
    const/16 v20, 0x0

    .line 1168
    .line 1169
    const/16 v27, 0x2

    .line 1170
    .line 1171
    invoke-virtual/range {v1 .. v9}, Lb1/c;->b(Lb1/f;Lb1/f;IFLb1/f;Lb1/f;II)V

    .line 1172
    .line 1173
    .line 1174
    goto :goto_30

    .line 1175
    :cond_46
    move-object v0, v2

    .line 1176
    const/16 v20, 0x0

    .line 1177
    .line 1178
    const/16 v27, 0x2

    .line 1179
    .line 1180
    :cond_47
    :goto_30
    move-object/from16 v1, p1

    .line 1181
    .line 1182
    goto/16 :goto_45

    .line 1183
    .line 1184
    :goto_31
    if-eqz v26, :cond_59

    .line 1185
    .line 1186
    if-eqz v12, :cond_59

    .line 1187
    .line 1188
    iget v1, v3, Ld1/b;->j:I

    .line 1189
    .line 1190
    if-lez v1, :cond_48

    .line 1191
    .line 1192
    iget v2, v3, Ld1/b;->i:I

    .line 1193
    .line 1194
    if-ne v2, v1, :cond_48

    .line 1195
    .line 1196
    const/16 v22, 0x1

    .line 1197
    .line 1198
    goto :goto_32

    .line 1199
    :cond_48
    move/from16 v22, v20

    .line 1200
    .line 1201
    :goto_32
    move-object v10, v12

    .line 1202
    move-object v13, v10

    .line 1203
    :goto_33
    if-eqz v10, :cond_47

    .line 1204
    .line 1205
    iget-object v1, v10, Ld1/d;->Q:[Ld1/c;

    .line 1206
    .line 1207
    iget-object v2, v10, Ld1/d;->m0:[Ld1/d;

    .line 1208
    .line 1209
    aget-object v2, v2, p3

    .line 1210
    .line 1211
    move-object v14, v2

    .line 1212
    :goto_34
    if-eqz v14, :cond_49

    .line 1213
    .line 1214
    iget v2, v14, Ld1/d;->g0:I

    .line 1215
    .line 1216
    const/16 v4, 0x8

    .line 1217
    .line 1218
    if-ne v2, v4, :cond_4a

    .line 1219
    .line 1220
    iget-object v2, v14, Ld1/d;->m0:[Ld1/d;

    .line 1221
    .line 1222
    aget-object v14, v2, p3

    .line 1223
    .line 1224
    goto :goto_34

    .line 1225
    :cond_49
    const/16 v4, 0x8

    .line 1226
    .line 1227
    :cond_4a
    if-nez v14, :cond_4c

    .line 1228
    .line 1229
    if-ne v10, v0, :cond_4b

    .line 1230
    .line 1231
    goto :goto_35

    .line 1232
    :cond_4b
    move-object/from16 v38, v5

    .line 1233
    .line 1234
    move-object/from16 v17, v13

    .line 1235
    .line 1236
    const/16 v31, 0x5

    .line 1237
    .line 1238
    move v13, v4

    .line 1239
    goto/16 :goto_3b

    .line 1240
    .line 1241
    :cond_4c
    :goto_35
    aget-object v2, v1, v15

    .line 1242
    .line 1243
    iget-object v3, v2, Ld1/c;->i:Lb1/f;

    .line 1244
    .line 1245
    iget-object v6, v2, Ld1/c;->f:Ld1/c;

    .line 1246
    .line 1247
    if-eqz v6, :cond_4d

    .line 1248
    .line 1249
    iget-object v6, v6, Ld1/c;->i:Lb1/f;

    .line 1250
    .line 1251
    goto :goto_36

    .line 1252
    :cond_4d
    move-object/from16 v6, v16

    .line 1253
    .line 1254
    :goto_36
    if-eq v13, v10, :cond_4e

    .line 1255
    .line 1256
    iget-object v6, v13, Ld1/d;->Q:[Ld1/c;

    .line 1257
    .line 1258
    add-int/lit8 v7, v15, 0x1

    .line 1259
    .line 1260
    aget-object v6, v6, v7

    .line 1261
    .line 1262
    iget-object v6, v6, Ld1/c;->i:Lb1/f;

    .line 1263
    .line 1264
    goto :goto_37

    .line 1265
    :cond_4e
    if-ne v10, v12, :cond_50

    .line 1266
    .line 1267
    iget-object v6, v5, Ld1/d;->Q:[Ld1/c;

    .line 1268
    .line 1269
    aget-object v6, v6, v15

    .line 1270
    .line 1271
    iget-object v6, v6, Ld1/c;->f:Ld1/c;

    .line 1272
    .line 1273
    if-eqz v6, :cond_4f

    .line 1274
    .line 1275
    iget-object v6, v6, Ld1/c;->i:Lb1/f;

    .line 1276
    .line 1277
    goto :goto_37

    .line 1278
    :cond_4f
    move-object/from16 v6, v16

    .line 1279
    .line 1280
    :cond_50
    :goto_37
    invoke-virtual {v2}, Ld1/c;->e()I

    .line 1281
    .line 1282
    .line 1283
    move-result v2

    .line 1284
    add-int/lit8 v7, v15, 0x1

    .line 1285
    .line 1286
    aget-object v8, v1, v7

    .line 1287
    .line 1288
    invoke-virtual {v8}, Ld1/c;->e()I

    .line 1289
    .line 1290
    .line 1291
    move-result v8

    .line 1292
    if-eqz v14, :cond_51

    .line 1293
    .line 1294
    iget-object v9, v14, Ld1/d;->Q:[Ld1/c;

    .line 1295
    .line 1296
    aget-object v9, v9, v15

    .line 1297
    .line 1298
    iget-object v4, v9, Ld1/c;->i:Lb1/f;

    .line 1299
    .line 1300
    goto :goto_38

    .line 1301
    :cond_51
    iget-object v4, v11, Ld1/d;->Q:[Ld1/c;

    .line 1302
    .line 1303
    aget-object v4, v4, v7

    .line 1304
    .line 1305
    iget-object v9, v4, Ld1/c;->f:Ld1/c;

    .line 1306
    .line 1307
    if-eqz v9, :cond_52

    .line 1308
    .line 1309
    iget-object v4, v9, Ld1/c;->i:Lb1/f;

    .line 1310
    .line 1311
    goto :goto_38

    .line 1312
    :cond_52
    move-object/from16 v4, v16

    .line 1313
    .line 1314
    :goto_38
    aget-object v1, v1, v7

    .line 1315
    .line 1316
    iget-object v1, v1, Ld1/c;->i:Lb1/f;

    .line 1317
    .line 1318
    if-eqz v9, :cond_53

    .line 1319
    .line 1320
    invoke-virtual {v9}, Ld1/c;->e()I

    .line 1321
    .line 1322
    .line 1323
    move-result v9

    .line 1324
    add-int/2addr v8, v9

    .line 1325
    :cond_53
    iget-object v9, v13, Ld1/d;->Q:[Ld1/c;

    .line 1326
    .line 1327
    aget-object v9, v9, v7

    .line 1328
    .line 1329
    invoke-virtual {v9}, Ld1/c;->e()I

    .line 1330
    .line 1331
    .line 1332
    move-result v9

    .line 1333
    add-int/2addr v9, v2

    .line 1334
    if-eqz v3, :cond_57

    .line 1335
    .line 1336
    if-eqz v6, :cond_57

    .line 1337
    .line 1338
    if-eqz v4, :cond_57

    .line 1339
    .line 1340
    if-eqz v1, :cond_57

    .line 1341
    .line 1342
    if-ne v10, v12, :cond_54

    .line 1343
    .line 1344
    iget-object v2, v12, Ld1/d;->Q:[Ld1/c;

    .line 1345
    .line 1346
    aget-object v2, v2, v15

    .line 1347
    .line 1348
    invoke-virtual {v2}, Ld1/c;->e()I

    .line 1349
    .line 1350
    .line 1351
    move-result v9

    .line 1352
    :cond_54
    if-ne v10, v0, :cond_55

    .line 1353
    .line 1354
    iget-object v2, v0, Ld1/d;->Q:[Ld1/c;

    .line 1355
    .line 1356
    aget-object v2, v2, v7

    .line 1357
    .line 1358
    invoke-virtual {v2}, Ld1/c;->e()I

    .line 1359
    .line 1360
    .line 1361
    move-result v8

    .line 1362
    :cond_55
    move-object v2, v3

    .line 1363
    move-object v3, v6

    .line 1364
    move-object v6, v4

    .line 1365
    move v4, v9

    .line 1366
    if-eqz v22, :cond_56

    .line 1367
    .line 1368
    const/16 v9, 0x8

    .line 1369
    .line 1370
    :goto_39
    move-object v7, v5

    .line 1371
    goto :goto_3a

    .line 1372
    :cond_56
    const/4 v9, 0x5

    .line 1373
    goto :goto_39

    .line 1374
    :goto_3a
    const/high16 v5, 0x3f000000    # 0.5f

    .line 1375
    .line 1376
    move-object/from16 v38, v7

    .line 1377
    .line 1378
    move-object/from16 v17, v13

    .line 1379
    .line 1380
    const/16 v13, 0x8

    .line 1381
    .line 1382
    const/16 v31, 0x5

    .line 1383
    .line 1384
    move-object v7, v1

    .line 1385
    move-object/from16 v1, p1

    .line 1386
    .line 1387
    invoke-virtual/range {v1 .. v9}, Lb1/c;->b(Lb1/f;Lb1/f;IFLb1/f;Lb1/f;II)V

    .line 1388
    .line 1389
    .line 1390
    goto :goto_3b

    .line 1391
    :cond_57
    move-object/from16 v38, v5

    .line 1392
    .line 1393
    move-object/from16 v17, v13

    .line 1394
    .line 1395
    const/16 v13, 0x8

    .line 1396
    .line 1397
    const/16 v31, 0x5

    .line 1398
    .line 1399
    :goto_3b
    iget v1, v10, Ld1/d;->g0:I

    .line 1400
    .line 1401
    if-eq v1, v13, :cond_58

    .line 1402
    .line 1403
    move-object/from16 v17, v10

    .line 1404
    .line 1405
    :cond_58
    move-object v10, v14

    .line 1406
    move-object/from16 v13, v17

    .line 1407
    .line 1408
    move-object/from16 v5, v38

    .line 1409
    .line 1410
    goto/16 :goto_33

    .line 1411
    .line 1412
    :cond_59
    move-object/from16 v38, v5

    .line 1413
    .line 1414
    const/16 v13, 0x8

    .line 1415
    .line 1416
    if-eqz v18, :cond_47

    .line 1417
    .line 1418
    if-eqz v12, :cond_47

    .line 1419
    .line 1420
    iget v1, v3, Ld1/b;->j:I

    .line 1421
    .line 1422
    if-lez v1, :cond_5a

    .line 1423
    .line 1424
    iget v2, v3, Ld1/b;->i:I

    .line 1425
    .line 1426
    if-ne v2, v1, :cond_5a

    .line 1427
    .line 1428
    const/16 v22, 0x1

    .line 1429
    .line 1430
    goto :goto_3c

    .line 1431
    :cond_5a
    move/from16 v22, v20

    .line 1432
    .line 1433
    :goto_3c
    move-object v10, v12

    .line 1434
    move-object v14, v10

    .line 1435
    :goto_3d
    if-eqz v10, :cond_65

    .line 1436
    .line 1437
    iget-object v1, v10, Ld1/d;->Q:[Ld1/c;

    .line 1438
    .line 1439
    iget-object v2, v10, Ld1/d;->m0:[Ld1/d;

    .line 1440
    .line 1441
    aget-object v2, v2, p3

    .line 1442
    .line 1443
    :goto_3e
    if-eqz v2, :cond_5b

    .line 1444
    .line 1445
    iget v3, v2, Ld1/d;->g0:I

    .line 1446
    .line 1447
    if-ne v3, v13, :cond_5b

    .line 1448
    .line 1449
    iget-object v2, v2, Ld1/d;->m0:[Ld1/d;

    .line 1450
    .line 1451
    aget-object v2, v2, p3

    .line 1452
    .line 1453
    goto :goto_3e

    .line 1454
    :cond_5b
    if-eq v10, v12, :cond_63

    .line 1455
    .line 1456
    if-eq v10, v0, :cond_63

    .line 1457
    .line 1458
    if-eqz v2, :cond_63

    .line 1459
    .line 1460
    if-ne v2, v0, :cond_5c

    .line 1461
    .line 1462
    move-object/from16 v2, v16

    .line 1463
    .line 1464
    :cond_5c
    aget-object v3, v1, v15

    .line 1465
    .line 1466
    iget-object v4, v3, Ld1/c;->i:Lb1/f;

    .line 1467
    .line 1468
    iget-object v5, v14, Ld1/d;->Q:[Ld1/c;

    .line 1469
    .line 1470
    add-int/lit8 v6, v15, 0x1

    .line 1471
    .line 1472
    aget-object v5, v5, v6

    .line 1473
    .line 1474
    iget-object v5, v5, Ld1/c;->i:Lb1/f;

    .line 1475
    .line 1476
    invoke-virtual {v3}, Ld1/c;->e()I

    .line 1477
    .line 1478
    .line 1479
    move-result v3

    .line 1480
    aget-object v7, v1, v6

    .line 1481
    .line 1482
    invoke-virtual {v7}, Ld1/c;->e()I

    .line 1483
    .line 1484
    .line 1485
    move-result v7

    .line 1486
    if-eqz v2, :cond_5e

    .line 1487
    .line 1488
    iget-object v1, v2, Ld1/d;->Q:[Ld1/c;

    .line 1489
    .line 1490
    aget-object v1, v1, v15

    .line 1491
    .line 1492
    iget-object v8, v1, Ld1/c;->i:Lb1/f;

    .line 1493
    .line 1494
    iget-object v9, v1, Ld1/c;->f:Ld1/c;

    .line 1495
    .line 1496
    if-eqz v9, :cond_5d

    .line 1497
    .line 1498
    iget-object v9, v9, Ld1/c;->i:Lb1/f;

    .line 1499
    .line 1500
    goto :goto_40

    .line 1501
    :cond_5d
    move-object/from16 v9, v16

    .line 1502
    .line 1503
    goto :goto_40

    .line 1504
    :cond_5e
    iget-object v8, v0, Ld1/d;->Q:[Ld1/c;

    .line 1505
    .line 1506
    aget-object v8, v8, v15

    .line 1507
    .line 1508
    if-eqz v8, :cond_5f

    .line 1509
    .line 1510
    iget-object v9, v8, Ld1/c;->i:Lb1/f;

    .line 1511
    .line 1512
    goto :goto_3f

    .line 1513
    :cond_5f
    move-object/from16 v9, v16

    .line 1514
    .line 1515
    :goto_3f
    aget-object v1, v1, v6

    .line 1516
    .line 1517
    iget-object v1, v1, Ld1/c;->i:Lb1/f;

    .line 1518
    .line 1519
    move-object/from16 v39, v9

    .line 1520
    .line 1521
    move-object v9, v1

    .line 1522
    move-object v1, v8

    .line 1523
    move-object/from16 v8, v39

    .line 1524
    .line 1525
    :goto_40
    if-eqz v1, :cond_60

    .line 1526
    .line 1527
    invoke-virtual {v1}, Ld1/c;->e()I

    .line 1528
    .line 1529
    .line 1530
    move-result v1

    .line 1531
    add-int/2addr v7, v1

    .line 1532
    :cond_60
    iget-object v1, v14, Ld1/d;->Q:[Ld1/c;

    .line 1533
    .line 1534
    aget-object v1, v1, v6

    .line 1535
    .line 1536
    invoke-virtual {v1}, Ld1/c;->e()I

    .line 1537
    .line 1538
    .line 1539
    move-result v1

    .line 1540
    add-int/2addr v1, v3

    .line 1541
    move-object v6, v8

    .line 1542
    move v8, v7

    .line 1543
    move-object v7, v9

    .line 1544
    if-eqz v22, :cond_61

    .line 1545
    .line 1546
    move v9, v13

    .line 1547
    goto :goto_41

    .line 1548
    :cond_61
    const/4 v9, 0x4

    .line 1549
    :goto_41
    if-eqz v4, :cond_62

    .line 1550
    .line 1551
    if-eqz v5, :cond_62

    .line 1552
    .line 1553
    if-eqz v6, :cond_62

    .line 1554
    .line 1555
    if-eqz v7, :cond_62

    .line 1556
    .line 1557
    move-object v3, v5

    .line 1558
    const/high16 v5, 0x3f000000    # 0.5f

    .line 1559
    .line 1560
    move-object/from16 v17, v2

    .line 1561
    .line 1562
    move-object v2, v4

    .line 1563
    const/16 v30, 0x4

    .line 1564
    .line 1565
    move v4, v1

    .line 1566
    move-object/from16 v1, p1

    .line 1567
    .line 1568
    invoke-virtual/range {v1 .. v9}, Lb1/c;->b(Lb1/f;Lb1/f;IFLb1/f;Lb1/f;II)V

    .line 1569
    .line 1570
    .line 1571
    goto :goto_42

    .line 1572
    :cond_62
    move-object/from16 v1, p1

    .line 1573
    .line 1574
    move-object/from16 v17, v2

    .line 1575
    .line 1576
    const/16 v30, 0x4

    .line 1577
    .line 1578
    :goto_42
    move-object/from16 v2, v17

    .line 1579
    .line 1580
    goto :goto_43

    .line 1581
    :cond_63
    move-object/from16 v1, p1

    .line 1582
    .line 1583
    const/16 v30, 0x4

    .line 1584
    .line 1585
    :goto_43
    iget v3, v10, Ld1/d;->g0:I

    .line 1586
    .line 1587
    if-eq v3, v13, :cond_64

    .line 1588
    .line 1589
    move-object v14, v10

    .line 1590
    :cond_64
    move-object v10, v2

    .line 1591
    goto/16 :goto_3d

    .line 1592
    .line 1593
    :cond_65
    move-object/from16 v1, p1

    .line 1594
    .line 1595
    iget-object v2, v12, Ld1/d;->Q:[Ld1/c;

    .line 1596
    .line 1597
    aget-object v2, v2, v15

    .line 1598
    .line 1599
    move-object/from16 v7, v38

    .line 1600
    .line 1601
    iget-object v3, v7, Ld1/d;->Q:[Ld1/c;

    .line 1602
    .line 1603
    aget-object v3, v3, v15

    .line 1604
    .line 1605
    iget-object v3, v3, Ld1/c;->f:Ld1/c;

    .line 1606
    .line 1607
    iget-object v4, v0, Ld1/d;->Q:[Ld1/c;

    .line 1608
    .line 1609
    add-int/lit8 v5, v15, 0x1

    .line 1610
    .line 1611
    aget-object v10, v4, v5

    .line 1612
    .line 1613
    iget-object v4, v11, Ld1/d;->Q:[Ld1/c;

    .line 1614
    .line 1615
    aget-object v4, v4, v5

    .line 1616
    .line 1617
    iget-object v13, v4, Ld1/c;->f:Ld1/c;

    .line 1618
    .line 1619
    const/4 v9, 0x5

    .line 1620
    if-eqz v3, :cond_67

    .line 1621
    .line 1622
    if-eq v12, v0, :cond_66

    .line 1623
    .line 1624
    iget-object v4, v2, Ld1/c;->i:Lb1/f;

    .line 1625
    .line 1626
    iget-object v3, v3, Ld1/c;->i:Lb1/f;

    .line 1627
    .line 1628
    invoke-virtual {v2}, Ld1/c;->e()I

    .line 1629
    .line 1630
    .line 1631
    move-result v2

    .line 1632
    invoke-virtual {v1, v4, v3, v2, v9}, Lb1/c;->e(Lb1/f;Lb1/f;II)V

    .line 1633
    .line 1634
    .line 1635
    goto :goto_44

    .line 1636
    :cond_66
    if-eqz v13, :cond_67

    .line 1637
    .line 1638
    move-object v4, v2

    .line 1639
    iget-object v2, v4, Ld1/c;->i:Lb1/f;

    .line 1640
    .line 1641
    iget-object v3, v3, Ld1/c;->i:Lb1/f;

    .line 1642
    .line 1643
    invoke-virtual {v4}, Ld1/c;->e()I

    .line 1644
    .line 1645
    .line 1646
    move-result v4

    .line 1647
    iget-object v6, v10, Ld1/c;->i:Lb1/f;

    .line 1648
    .line 1649
    iget-object v7, v13, Ld1/c;->i:Lb1/f;

    .line 1650
    .line 1651
    invoke-virtual {v10}, Ld1/c;->e()I

    .line 1652
    .line 1653
    .line 1654
    move-result v8

    .line 1655
    const/high16 v5, 0x3f000000    # 0.5f

    .line 1656
    .line 1657
    invoke-virtual/range {v1 .. v9}, Lb1/c;->b(Lb1/f;Lb1/f;IFLb1/f;Lb1/f;II)V

    .line 1658
    .line 1659
    .line 1660
    :cond_67
    :goto_44
    if-eqz v13, :cond_68

    .line 1661
    .line 1662
    if-eq v12, v0, :cond_68

    .line 1663
    .line 1664
    iget-object v2, v10, Ld1/c;->i:Lb1/f;

    .line 1665
    .line 1666
    iget-object v3, v13, Ld1/c;->i:Lb1/f;

    .line 1667
    .line 1668
    invoke-virtual {v10}, Ld1/c;->e()I

    .line 1669
    .line 1670
    .line 1671
    move-result v4

    .line 1672
    neg-int v4, v4

    .line 1673
    invoke-virtual {v1, v2, v3, v4, v9}, Lb1/c;->e(Lb1/f;Lb1/f;II)V

    .line 1674
    .line 1675
    .line 1676
    :cond_68
    :goto_45
    if-nez v26, :cond_69

    .line 1677
    .line 1678
    if-eqz v18, :cond_70

    .line 1679
    .line 1680
    :cond_69
    if-eqz v12, :cond_70

    .line 1681
    .line 1682
    if-eq v12, v0, :cond_70

    .line 1683
    .line 1684
    iget-object v2, v12, Ld1/d;->Q:[Ld1/c;

    .line 1685
    .line 1686
    aget-object v3, v2, v15

    .line 1687
    .line 1688
    if-nez v0, :cond_6a

    .line 1689
    .line 1690
    move-object v0, v12

    .line 1691
    :cond_6a
    iget-object v4, v0, Ld1/d;->Q:[Ld1/c;

    .line 1692
    .line 1693
    add-int/lit8 v5, v15, 0x1

    .line 1694
    .line 1695
    aget-object v6, v4, v5

    .line 1696
    .line 1697
    iget-object v7, v3, Ld1/c;->f:Ld1/c;

    .line 1698
    .line 1699
    if-eqz v7, :cond_6b

    .line 1700
    .line 1701
    iget-object v7, v7, Ld1/c;->i:Lb1/f;

    .line 1702
    .line 1703
    goto :goto_46

    .line 1704
    :cond_6b
    move-object/from16 v7, v16

    .line 1705
    .line 1706
    :goto_46
    iget-object v8, v6, Ld1/c;->f:Ld1/c;

    .line 1707
    .line 1708
    if-eqz v8, :cond_6c

    .line 1709
    .line 1710
    iget-object v8, v8, Ld1/c;->i:Lb1/f;

    .line 1711
    .line 1712
    goto :goto_47

    .line 1713
    :cond_6c
    move-object/from16 v8, v16

    .line 1714
    .line 1715
    :goto_47
    if-eq v11, v0, :cond_6e

    .line 1716
    .line 1717
    iget-object v8, v11, Ld1/d;->Q:[Ld1/c;

    .line 1718
    .line 1719
    aget-object v8, v8, v5

    .line 1720
    .line 1721
    iget-object v8, v8, Ld1/c;->f:Ld1/c;

    .line 1722
    .line 1723
    if-eqz v8, :cond_6d

    .line 1724
    .line 1725
    iget-object v8, v8, Ld1/c;->i:Lb1/f;

    .line 1726
    .line 1727
    move-object/from16 v16, v8

    .line 1728
    .line 1729
    :cond_6d
    move-object/from16 v8, v16

    .line 1730
    .line 1731
    :cond_6e
    if-ne v12, v0, :cond_6f

    .line 1732
    .line 1733
    aget-object v6, v2, v5

    .line 1734
    .line 1735
    :cond_6f
    if-eqz v7, :cond_70

    .line 1736
    .line 1737
    if-eqz v8, :cond_70

    .line 1738
    .line 1739
    move-object v0, v4

    .line 1740
    invoke-virtual {v3}, Ld1/c;->e()I

    .line 1741
    .line 1742
    .line 1743
    move-result v4

    .line 1744
    aget-object v0, v0, v5

    .line 1745
    .line 1746
    invoke-virtual {v0}, Ld1/c;->e()I

    .line 1747
    .line 1748
    .line 1749
    move-result v0

    .line 1750
    iget-object v2, v3, Ld1/c;->i:Lb1/f;

    .line 1751
    .line 1752
    iget-object v3, v6, Ld1/c;->i:Lb1/f;

    .line 1753
    .line 1754
    const/4 v9, 0x5

    .line 1755
    const/high16 v5, 0x3f000000    # 0.5f

    .line 1756
    .line 1757
    move-object v6, v7

    .line 1758
    move-object v7, v3

    .line 1759
    move-object v3, v6

    .line 1760
    move-object v6, v8

    .line 1761
    move v8, v0

    .line 1762
    invoke-virtual/range {v1 .. v9}, Lb1/c;->b(Lb1/f;Lb1/f;IFLb1/f;Lb1/f;II)V

    .line 1763
    .line 1764
    .line 1765
    :cond_70
    :goto_48
    add-int/lit8 v2, v25, 0x1

    .line 1766
    .line 1767
    move-object/from16 v0, p0

    .line 1768
    .line 1769
    move-object/from16 v1, p1

    .line 1770
    .line 1771
    move-object/from16 v10, p2

    .line 1772
    .line 1773
    move-object/from16 v14, v19

    .line 1774
    .line 1775
    move/from16 v13, v37

    .line 1776
    .line 1777
    goto/16 :goto_2

    .line 1778
    .line 1779
    :cond_71
    return-void
.end method

.method public static b(Ld1/e;Lb1/c;Ld1/d;)V
    .locals 11

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p2, Ld1/d;->o:I

    .line 3
    .line 4
    iget-object v1, p2, Ld1/d;->M:Ld1/c;

    .line 5
    .line 6
    iget-object v2, p2, Ld1/d;->p0:[I

    .line 7
    .line 8
    iget-object v3, p2, Ld1/d;->L:Ld1/c;

    .line 9
    .line 10
    iget-object v4, p2, Ld1/d;->J:Ld1/c;

    .line 11
    .line 12
    iget-object v5, p2, Ld1/d;->K:Ld1/c;

    .line 13
    .line 14
    iget-object v6, p2, Ld1/d;->I:Ld1/c;

    .line 15
    .line 16
    iput v0, p2, Ld1/d;->p:I

    .line 17
    .line 18
    iget-object v0, p0, Ld1/d;->p0:[I

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    aget v0, v0, v7

    .line 22
    .line 23
    const/4 v8, 0x2

    .line 24
    const/4 v9, 0x4

    .line 25
    if-eq v0, v8, :cond_0

    .line 26
    .line 27
    aget v0, v2, v7

    .line 28
    .line 29
    if-ne v0, v9, :cond_0

    .line 30
    .line 31
    iget v0, v6, Ld1/c;->g:I

    .line 32
    .line 33
    invoke-virtual {p0}, Ld1/d;->q()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    iget v10, v5, Ld1/c;->g:I

    .line 38
    .line 39
    sub-int/2addr v7, v10

    .line 40
    invoke-virtual {p1, v6}, Lb1/c;->k(Ljava/lang/Object;)Lb1/f;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    iput-object v10, v6, Ld1/c;->i:Lb1/f;

    .line 45
    .line 46
    invoke-virtual {p1, v5}, Lb1/c;->k(Ljava/lang/Object;)Lb1/f;

    .line 47
    .line 48
    .line 49
    move-result-object v10

    .line 50
    iput-object v10, v5, Ld1/c;->i:Lb1/f;

    .line 51
    .line 52
    iget-object v6, v6, Ld1/c;->i:Lb1/f;

    .line 53
    .line 54
    invoke-virtual {p1, v6, v0}, Lb1/c;->d(Lb1/f;I)V

    .line 55
    .line 56
    .line 57
    iget-object v5, v5, Ld1/c;->i:Lb1/f;

    .line 58
    .line 59
    invoke-virtual {p1, v5, v7}, Lb1/c;->d(Lb1/f;I)V

    .line 60
    .line 61
    .line 62
    iput v8, p2, Ld1/d;->o:I

    .line 63
    .line 64
    iput v0, p2, Ld1/d;->Y:I

    .line 65
    .line 66
    sub-int/2addr v7, v0

    .line 67
    iput v7, p2, Ld1/d;->U:I

    .line 68
    .line 69
    iget v0, p2, Ld1/d;->b0:I

    .line 70
    .line 71
    if-ge v7, v0, :cond_0

    .line 72
    .line 73
    iput v0, p2, Ld1/d;->U:I

    .line 74
    .line 75
    :cond_0
    iget-object v0, p0, Ld1/d;->p0:[I

    .line 76
    .line 77
    const/4 v5, 0x1

    .line 78
    aget v0, v0, v5

    .line 79
    .line 80
    if-eq v0, v8, :cond_3

    .line 81
    .line 82
    aget v0, v2, v5

    .line 83
    .line 84
    if-ne v0, v9, :cond_3

    .line 85
    .line 86
    iget v0, v4, Ld1/c;->g:I

    .line 87
    .line 88
    invoke-virtual {p0}, Ld1/d;->k()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    iget v2, v3, Ld1/c;->g:I

    .line 93
    .line 94
    sub-int/2addr p0, v2

    .line 95
    invoke-virtual {p1, v4}, Lb1/c;->k(Ljava/lang/Object;)Lb1/f;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    iput-object v2, v4, Ld1/c;->i:Lb1/f;

    .line 100
    .line 101
    invoke-virtual {p1, v3}, Lb1/c;->k(Ljava/lang/Object;)Lb1/f;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    iput-object v2, v3, Ld1/c;->i:Lb1/f;

    .line 106
    .line 107
    iget-object v2, v4, Ld1/c;->i:Lb1/f;

    .line 108
    .line 109
    invoke-virtual {p1, v2, v0}, Lb1/c;->d(Lb1/f;I)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v3, Ld1/c;->i:Lb1/f;

    .line 113
    .line 114
    invoke-virtual {p1, v2, p0}, Lb1/c;->d(Lb1/f;I)V

    .line 115
    .line 116
    .line 117
    iget v2, p2, Ld1/d;->a0:I

    .line 118
    .line 119
    if-gtz v2, :cond_1

    .line 120
    .line 121
    iget v2, p2, Ld1/d;->g0:I

    .line 122
    .line 123
    const/16 v3, 0x8

    .line 124
    .line 125
    if-ne v2, v3, :cond_2

    .line 126
    .line 127
    :cond_1
    invoke-virtual {p1, v1}, Lb1/c;->k(Ljava/lang/Object;)Lb1/f;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iput-object v2, v1, Ld1/c;->i:Lb1/f;

    .line 132
    .line 133
    iget v1, p2, Ld1/d;->a0:I

    .line 134
    .line 135
    add-int/2addr v1, v0

    .line 136
    invoke-virtual {p1, v2, v1}, Lb1/c;->d(Lb1/f;I)V

    .line 137
    .line 138
    .line 139
    :cond_2
    iput v8, p2, Ld1/d;->p:I

    .line 140
    .line 141
    iput v0, p2, Ld1/d;->Z:I

    .line 142
    .line 143
    sub-int/2addr p0, v0

    .line 144
    iput p0, p2, Ld1/d;->V:I

    .line 145
    .line 146
    iget p1, p2, Ld1/d;->c0:I

    .line 147
    .line 148
    if-ge p0, p1, :cond_3

    .line 149
    .line 150
    iput p1, p2, Ld1/d;->V:I

    .line 151
    .line 152
    :cond_3
    return-void
.end method

.method public static final c(II)Z
    .locals 0

    .line 1
    and-int/2addr p0, p1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method
