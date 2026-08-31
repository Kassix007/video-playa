.class public final LL0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LS0/d;

.field public final b:I

.field public final c:J

.field public final d:LM0/j;

.field public final e:Ljava/lang/CharSequence;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LS0/d;IIJ)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v10, p1

    .line 4
    .line 5
    move/from16 v4, p2

    .line 6
    .line 7
    move/from16 v11, p3

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v10, v0, LL0/a;->a:LS0/d;

    .line 13
    .line 14
    iput v4, v0, LL0/a;->b:I

    .line 15
    .line 16
    move-wide/from16 v12, p4

    .line 17
    .line 18
    iput-wide v12, v0, LL0/a;->c:J

    .line 19
    .line 20
    invoke-static {v12, v13}, LW0/a;->i(J)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-static {v12, v13}, LW0/a;->j(J)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string v1, "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."

    .line 34
    .line 35
    invoke-static {v1}, LQ0/a;->a(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    const/4 v14, 0x1

    .line 39
    if-lt v4, v14, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string v1, "maxLines should be greater than 0"

    .line 43
    .line 44
    invoke-static {v1}, LQ0/a;->a(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_1
    iget-object v1, v10, LS0/d;->b:LL0/F;

    .line 48
    .line 49
    iget-object v2, v10, LS0/d;->h:Ljava/lang/CharSequence;

    .line 50
    .line 51
    const/4 v3, 0x5

    .line 52
    const/4 v5, 0x4

    .line 53
    const/4 v6, 0x2

    .line 54
    if-ne v11, v6, :cond_9

    .line 55
    .line 56
    iget-object v8, v1, LL0/F;->a:LL0/y;

    .line 57
    .line 58
    iget-wide v8, v8, LL0/y;->h:J

    .line 59
    .line 60
    const/16 v17, 0x0

    .line 61
    .line 62
    invoke-static/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/n2;->y(I)J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    invoke-static {v8, v9, v6, v7}, LW0/n;->a(JJ)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-nez v6, :cond_8

    .line 71
    .line 72
    iget-object v6, v1, LL0/F;->a:LL0/y;

    .line 73
    .line 74
    iget-wide v6, v6, LL0/y;->h:J

    .line 75
    .line 76
    sget-wide v8, LW0/n;->c:J

    .line 77
    .line 78
    invoke-static {v6, v7, v8, v9}, LW0/n;->a(JJ)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-nez v6, :cond_8

    .line 83
    .line 84
    iget-object v6, v1, LL0/F;->b:LL0/q;

    .line 85
    .line 86
    iget v6, v6, LL0/q;->a:I

    .line 87
    .line 88
    const/high16 v7, -0x80000000

    .line 89
    .line 90
    if-ne v6, v7, :cond_2

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_2
    if-ne v6, v3, :cond_3

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_3
    if-ne v6, v5, :cond_4

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-nez v6, :cond_5

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    instance-of v6, v2, Landroid/text/Spannable;

    .line 107
    .line 108
    if-eqz v6, :cond_6

    .line 109
    .line 110
    move-object v6, v2

    .line 111
    check-cast v6, Landroid/text/Spannable;

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_6
    const/4 v6, 0x0

    .line 115
    :goto_2
    if-nez v6, :cond_7

    .line 116
    .line 117
    new-instance v6, Landroid/text/SpannableString;

    .line 118
    .line 119
    invoke-direct {v6, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    .line 122
    :cond_7
    move-object v2, v6

    .line 123
    const-class v6, LN0/c;

    .line 124
    .line 125
    invoke-static {v2, v6}, LM0/g;->c(Landroid/text/Spanned;Ljava/lang/Class;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-nez v6, :cond_8

    .line 130
    .line 131
    new-instance v6, LN0/c;

    .line 132
    .line 133
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    sub-int/2addr v7, v14

    .line 141
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    sub-int/2addr v8, v14

    .line 146
    const/16 v9, 0x21

    .line 147
    .line 148
    invoke-interface {v2, v6, v7, v8, v9}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 149
    .line 150
    .line 151
    :cond_8
    :goto_3
    move-object v9, v2

    .line 152
    goto :goto_4

    .line 153
    :cond_9
    const/16 v17, 0x0

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :goto_4
    iput-object v9, v0, LL0/a;->e:Ljava/lang/CharSequence;

    .line 157
    .line 158
    iget-object v2, v1, LL0/F;->b:LL0/q;

    .line 159
    .line 160
    iget-object v1, v1, LL0/F;->a:LL0/y;

    .line 161
    .line 162
    iget v6, v2, LL0/q;->a:I

    .line 163
    .line 164
    const/4 v7, 0x3

    .line 165
    if-ne v6, v14, :cond_a

    .line 166
    .line 167
    move v8, v7

    .line 168
    goto :goto_6

    .line 169
    :cond_a
    const/4 v8, 0x2

    .line 170
    if-ne v6, v8, :cond_b

    .line 171
    .line 172
    move v8, v5

    .line 173
    goto :goto_6

    .line 174
    :cond_b
    if-ne v6, v7, :cond_c

    .line 175
    .line 176
    const/4 v8, 0x2

    .line 177
    goto :goto_6

    .line 178
    :cond_c
    if-ne v6, v3, :cond_d

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_d
    const/4 v8, 0x6

    .line 182
    if-ne v6, v8, :cond_e

    .line 183
    .line 184
    move v8, v14

    .line 185
    goto :goto_6

    .line 186
    :cond_e
    :goto_5
    move/from16 v8, v17

    .line 187
    .line 188
    :goto_6
    if-ne v6, v5, :cond_f

    .line 189
    .line 190
    move v6, v14

    .line 191
    goto :goto_7

    .line 192
    :cond_f
    move/from16 v6, v17

    .line 193
    .line 194
    :goto_7
    iget v15, v2, LL0/q;->h:I

    .line 195
    .line 196
    const/16 v3, 0x20

    .line 197
    .line 198
    const/4 v5, 0x2

    .line 199
    if-ne v15, v5, :cond_11

    .line 200
    .line 201
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 202
    .line 203
    if-gt v15, v3, :cond_10

    .line 204
    .line 205
    move v15, v5

    .line 206
    goto :goto_8

    .line 207
    :cond_10
    const/4 v15, 0x4

    .line 208
    goto :goto_8

    .line 209
    :cond_11
    move/from16 v15, v17

    .line 210
    .line 211
    :goto_8
    iget v2, v2, LL0/q;->g:I

    .line 212
    .line 213
    and-int/lit16 v3, v2, 0xff

    .line 214
    .line 215
    if-ne v3, v14, :cond_12

    .line 216
    .line 217
    goto :goto_9

    .line 218
    :cond_12
    if-ne v3, v5, :cond_13

    .line 219
    .line 220
    move v3, v2

    .line 221
    move v2, v6

    .line 222
    move v6, v14

    .line 223
    goto :goto_a

    .line 224
    :cond_13
    if-ne v3, v7, :cond_14

    .line 225
    .line 226
    move v3, v2

    .line 227
    move v2, v6

    .line 228
    const/4 v6, 0x2

    .line 229
    goto :goto_a

    .line 230
    :cond_14
    :goto_9
    move v3, v2

    .line 231
    move v2, v6

    .line 232
    move/from16 v6, v17

    .line 233
    .line 234
    :goto_a
    shr-int/lit8 v5, v3, 0x8

    .line 235
    .line 236
    and-int/lit16 v5, v5, 0xff

    .line 237
    .line 238
    if-ne v5, v14, :cond_15

    .line 239
    .line 240
    goto :goto_b

    .line 241
    :cond_15
    const/4 v14, 0x2

    .line 242
    if-ne v5, v14, :cond_16

    .line 243
    .line 244
    move v5, v7

    .line 245
    const/4 v7, 0x1

    .line 246
    goto :goto_c

    .line 247
    :cond_16
    if-ne v5, v7, :cond_17

    .line 248
    .line 249
    move v5, v7

    .line 250
    const/4 v7, 0x2

    .line 251
    goto :goto_c

    .line 252
    :cond_17
    const/4 v14, 0x4

    .line 253
    if-ne v5, v14, :cond_18

    .line 254
    .line 255
    move v5, v7

    .line 256
    goto :goto_c

    .line 257
    :cond_18
    :goto_b
    move v5, v7

    .line 258
    move/from16 v7, v17

    .line 259
    .line 260
    :goto_c
    shr-int/lit8 v3, v3, 0x10

    .line 261
    .line 262
    and-int/lit16 v3, v3, 0xff

    .line 263
    .line 264
    const/4 v14, 0x1

    .line 265
    if-ne v3, v14, :cond_19

    .line 266
    .line 267
    const/4 v14, 0x2

    .line 268
    goto :goto_d

    .line 269
    :cond_19
    const/4 v14, 0x2

    .line 270
    if-ne v3, v14, :cond_1a

    .line 271
    .line 272
    move-object v3, v1

    .line 273
    move v1, v8

    .line 274
    const/4 v8, 0x1

    .line 275
    goto :goto_e

    .line 276
    :cond_1a
    :goto_d
    move-object v3, v1

    .line 277
    move v1, v8

    .line 278
    move/from16 v8, v17

    .line 279
    .line 280
    :goto_e
    if-ne v11, v14, :cond_1b

    .line 281
    .line 282
    sget-object v16, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 283
    .line 284
    :goto_f
    move v5, v15

    .line 285
    const/16 v18, 0x20

    .line 286
    .line 287
    move-object v15, v3

    .line 288
    move-object/from16 v3, v16

    .line 289
    .line 290
    goto :goto_10

    .line 291
    :cond_1b
    const/4 v5, 0x5

    .line 292
    if-ne v11, v5, :cond_1c

    .line 293
    .line 294
    sget-object v16, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    .line 295
    .line 296
    goto :goto_f

    .line 297
    :cond_1c
    const/4 v5, 0x4

    .line 298
    if-ne v11, v5, :cond_1d

    .line 299
    .line 300
    sget-object v16, Landroid/text/TextUtils$TruncateAt;->START:Landroid/text/TextUtils$TruncateAt;

    .line 301
    .line 302
    goto :goto_f

    .line 303
    :cond_1d
    move v5, v15

    .line 304
    const/16 v18, 0x20

    .line 305
    .line 306
    move-object v15, v3

    .line 307
    const/4 v3, 0x0

    .line 308
    :goto_10
    invoke-virtual/range {v0 .. v9}, LL0/a;->a(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)LM0/j;

    .line 309
    .line 310
    .line 311
    move-result-object v14

    .line 312
    iget-object v0, v14, LM0/j;->e:Landroid/text/Layout;

    .line 313
    .line 314
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 315
    .line 316
    move/from16 v16, v1

    .line 317
    .line 318
    const/16 v1, 0x23

    .line 319
    .line 320
    if-ge v4, v1, :cond_1e

    .line 321
    .line 322
    iget-object v1, v10, LS0/d;->g:LS0/e;

    .line 323
    .line 324
    invoke-virtual {v1}, Landroid/graphics/Paint;->getLetterSpacing()F

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    const/4 v4, 0x0

    .line 329
    cmpg-float v1, v1, v4

    .line 330
    .line 331
    if-nez v1, :cond_1f

    .line 332
    .line 333
    :cond_1e
    move-object/from16 v0, p0

    .line 334
    .line 335
    move/from16 v4, p2

    .line 336
    .line 337
    move/from16 v1, v16

    .line 338
    .line 339
    const/4 v10, 0x2

    .line 340
    goto :goto_13

    .line 341
    :cond_1f
    const/4 v1, 0x4

    .line 342
    if-ne v11, v1, :cond_20

    .line 343
    .line 344
    :goto_11
    const/4 v1, 0x0

    .line 345
    goto :goto_12

    .line 346
    :cond_20
    const/4 v1, 0x5

    .line 347
    if-ne v11, v1, :cond_1e

    .line 348
    .line 349
    goto :goto_11

    .line 350
    :goto_12
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    if-lez v4, :cond_1e

    .line 355
    .line 356
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getEllipsisStart(I)I

    .line 357
    .line 358
    .line 359
    move-result v4

    .line 360
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    add-int/2addr v0, v4

    .line 365
    invoke-interface {v9, v1, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 370
    .line 371
    .line 372
    move-result v10

    .line 373
    invoke-interface {v9, v0, v10}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    const/4 v9, 0x3

    .line 378
    new-array v9, v9, [Ljava/lang/CharSequence;

    .line 379
    .line 380
    aput-object v4, v9, v1

    .line 381
    .line 382
    const-string v1, "\u2026"

    .line 383
    .line 384
    const/16 v19, 0x1

    .line 385
    .line 386
    aput-object v1, v9, v19

    .line 387
    .line 388
    const/4 v10, 0x2

    .line 389
    aput-object v0, v9, v10

    .line 390
    .line 391
    invoke-static {v9}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 392
    .line 393
    .line 394
    move-result-object v9

    .line 395
    move-object/from16 v0, p0

    .line 396
    .line 397
    move/from16 v4, p2

    .line 398
    .line 399
    move/from16 v1, v16

    .line 400
    .line 401
    invoke-virtual/range {v0 .. v9}, LL0/a;->a(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)LM0/j;

    .line 402
    .line 403
    .line 404
    move-result-object v14

    .line 405
    :goto_13
    iget v9, v14, LM0/j;->f:I

    .line 406
    .line 407
    if-ne v11, v10, :cond_25

    .line 408
    .line 409
    invoke-virtual {v14}, LM0/j;->a()I

    .line 410
    .line 411
    .line 412
    move-result v10

    .line 413
    invoke-static {v12, v13}, LW0/a;->g(J)I

    .line 414
    .line 415
    .line 416
    move-result v11

    .line 417
    if-le v10, v11, :cond_25

    .line 418
    .line 419
    const/4 v10, 0x1

    .line 420
    if-le v4, v10, :cond_25

    .line 421
    .line 422
    invoke-static {v12, v13}, LW0/a;->g(J)I

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    const/4 v10, 0x0

    .line 427
    :goto_14
    if-ge v10, v9, :cond_22

    .line 428
    .line 429
    invoke-virtual {v14, v10}, LM0/j;->d(I)F

    .line 430
    .line 431
    .line 432
    move-result v11

    .line 433
    int-to-float v12, v4

    .line 434
    cmpl-float v11, v11, v12

    .line 435
    .line 436
    if-lez v11, :cond_21

    .line 437
    .line 438
    goto :goto_15

    .line 439
    :cond_21
    add-int/lit8 v10, v10, 0x1

    .line 440
    .line 441
    goto :goto_14

    .line 442
    :cond_22
    move v10, v9

    .line 443
    :goto_15
    if-ltz v10, :cond_24

    .line 444
    .line 445
    iget v4, v0, LL0/a;->b:I

    .line 446
    .line 447
    if-eq v10, v4, :cond_24

    .line 448
    .line 449
    const/4 v4, 0x1

    .line 450
    if-ge v10, v4, :cond_23

    .line 451
    .line 452
    const/4 v4, 0x1

    .line 453
    goto :goto_16

    .line 454
    :cond_23
    move v4, v10

    .line 455
    :goto_16
    iget-object v9, v0, LL0/a;->e:Ljava/lang/CharSequence;

    .line 456
    .line 457
    invoke-virtual/range {v0 .. v9}, LL0/a;->a(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)LM0/j;

    .line 458
    .line 459
    .line 460
    move-result-object v14

    .line 461
    :cond_24
    iput-object v14, v0, LL0/a;->d:LM0/j;

    .line 462
    .line 463
    goto :goto_17

    .line 464
    :cond_25
    iput-object v14, v0, LL0/a;->d:LM0/j;

    .line 465
    .line 466
    :goto_17
    iget-object v1, v0, LL0/a;->a:LS0/d;

    .line 467
    .line 468
    iget-object v1, v1, LS0/d;->g:LS0/e;

    .line 469
    .line 470
    iget-object v2, v15, LL0/y;->a:LV0/p;

    .line 471
    .line 472
    invoke-interface {v2}, LV0/p;->b()Lj0/B;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    invoke-virtual {v0}, LL0/a;->c()F

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    invoke-virtual {v0}, LL0/a;->b()F

    .line 481
    .line 482
    .line 483
    move-result v4

    .line 484
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 485
    .line 486
    .line 487
    move-result v3

    .line 488
    int-to-long v5, v3

    .line 489
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    int-to-long v3, v3

    .line 494
    shl-long v5, v5, v18

    .line 495
    .line 496
    const-wide v7, 0xffffffffL

    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    and-long/2addr v3, v7

    .line 502
    or-long/2addr v3, v5

    .line 503
    iget-object v5, v15, LL0/y;->a:LV0/p;

    .line 504
    .line 505
    invoke-interface {v5}, LV0/p;->c()F

    .line 506
    .line 507
    .line 508
    move-result v5

    .line 509
    invoke-virtual {v1, v2, v3, v4, v5}, LS0/e;->c(Lj0/B;JF)V

    .line 510
    .line 511
    .line 512
    iget-object v1, v0, LL0/a;->d:LM0/j;

    .line 513
    .line 514
    iget-object v1, v1, LM0/j;->e:Landroid/text/Layout;

    .line 515
    .line 516
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    instance-of v2, v2, Landroid/text/Spanned;

    .line 521
    .line 522
    if-nez v2, :cond_27

    .line 523
    .line 524
    :cond_26
    const/4 v1, 0x0

    .line 525
    goto :goto_18

    .line 526
    :cond_27
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    const-string v3, "null cannot be cast to non-null type android.text.Spanned"

    .line 531
    .line 532
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    check-cast v2, Landroid/text/Spanned;

    .line 536
    .line 537
    const/4 v4, -0x1

    .line 538
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 539
    .line 540
    .line 541
    move-result v5

    .line 542
    const-class v6, LU0/b;

    .line 543
    .line 544
    invoke-interface {v2, v4, v5, v6}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 545
    .line 546
    .line 547
    move-result v4

    .line 548
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 549
    .line 550
    .line 551
    move-result v2

    .line 552
    if-eq v4, v2, :cond_26

    .line 553
    .line 554
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    check-cast v2, Landroid/text/Spanned;

    .line 562
    .line 563
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 568
    .line 569
    .line 570
    move-result v1

    .line 571
    const/4 v3, 0x0

    .line 572
    invoke-interface {v2, v3, v1, v6}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    check-cast v1, [LU0/b;

    .line 577
    .line 578
    :goto_18
    if-eqz v1, :cond_28

    .line 579
    .line 580
    invoke-static {v1}, Lkotlin/jvm/internal/m;->h([Ljava/lang/Object;)Lkotlin/jvm/internal/b;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    :goto_19
    invoke-virtual {v1}, Lkotlin/jvm/internal/b;->hasNext()Z

    .line 585
    .line 586
    .line 587
    move-result v2

    .line 588
    if-eqz v2, :cond_28

    .line 589
    .line 590
    invoke-virtual {v1}, Lkotlin/jvm/internal/b;->next()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v2

    .line 594
    check-cast v2, LU0/b;

    .line 595
    .line 596
    invoke-virtual {v0}, LL0/a;->c()F

    .line 597
    .line 598
    .line 599
    move-result v3

    .line 600
    invoke-virtual {v0}, LL0/a;->b()F

    .line 601
    .line 602
    .line 603
    move-result v4

    .line 604
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 605
    .line 606
    .line 607
    move-result v3

    .line 608
    int-to-long v5, v3

    .line 609
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 610
    .line 611
    .line 612
    move-result v3

    .line 613
    int-to-long v3, v3

    .line 614
    shl-long v5, v5, v18

    .line 615
    .line 616
    and-long/2addr v3, v7

    .line 617
    or-long/2addr v3, v5

    .line 618
    iget-object v2, v2, LU0/b;->s:LP/f0;

    .line 619
    .line 620
    new-instance v5, Li0/e;

    .line 621
    .line 622
    invoke-direct {v5, v3, v4}, Li0/e;-><init>(J)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v2, v5}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    goto :goto_19

    .line 629
    :cond_28
    iget-object v1, v0, LL0/a;->e:Ljava/lang/CharSequence;

    .line 630
    .line 631
    instance-of v2, v1, Landroid/text/Spanned;

    .line 632
    .line 633
    if-nez v2, :cond_29

    .line 634
    .line 635
    sget-object v1, Ln5/s;->q:Ln5/s;

    .line 636
    .line 637
    goto/16 :goto_22

    .line 638
    .line 639
    :cond_29
    move-object v2, v1

    .line 640
    check-cast v2, Landroid/text/Spanned;

    .line 641
    .line 642
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    const-class v3, LN0/i;

    .line 647
    .line 648
    const/4 v4, 0x0

    .line 649
    invoke-interface {v2, v4, v1, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    new-instance v3, Ljava/util/ArrayList;

    .line 654
    .line 655
    array-length v4, v1

    .line 656
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 657
    .line 658
    .line 659
    array-length v4, v1

    .line 660
    const/4 v7, 0x0

    .line 661
    :goto_1a
    if-ge v7, v4, :cond_34

    .line 662
    .line 663
    aget-object v5, v1, v7

    .line 664
    .line 665
    check-cast v5, LN0/i;

    .line 666
    .line 667
    invoke-interface {v2, v5}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 668
    .line 669
    .line 670
    move-result v6

    .line 671
    invoke-interface {v2, v5}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 672
    .line 673
    .line 674
    move-result v8

    .line 675
    iget-object v9, v0, LL0/a;->d:LM0/j;

    .line 676
    .line 677
    iget-object v9, v9, LM0/j;->e:Landroid/text/Layout;

    .line 678
    .line 679
    invoke-virtual {v9, v6}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 680
    .line 681
    .line 682
    move-result v9

    .line 683
    iget v10, v0, LL0/a;->b:I

    .line 684
    .line 685
    if-lt v9, v10, :cond_2a

    .line 686
    .line 687
    const/4 v10, 0x1

    .line 688
    goto :goto_1b

    .line 689
    :cond_2a
    const/4 v10, 0x0

    .line 690
    :goto_1b
    iget-object v11, v0, LL0/a;->d:LM0/j;

    .line 691
    .line 692
    iget-object v11, v11, LM0/j;->e:Landroid/text/Layout;

    .line 693
    .line 694
    invoke-virtual {v11, v9}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 695
    .line 696
    .line 697
    move-result v11

    .line 698
    if-lez v11, :cond_2b

    .line 699
    .line 700
    iget-object v11, v0, LL0/a;->d:LM0/j;

    .line 701
    .line 702
    iget-object v11, v11, LM0/j;->e:Landroid/text/Layout;

    .line 703
    .line 704
    invoke-virtual {v11, v9}, Landroid/text/Layout;->getEllipsisStart(I)I

    .line 705
    .line 706
    .line 707
    move-result v11

    .line 708
    if-le v8, v11, :cond_2b

    .line 709
    .line 710
    const/4 v11, 0x1

    .line 711
    goto :goto_1c

    .line 712
    :cond_2b
    const/4 v11, 0x0

    .line 713
    :goto_1c
    iget-object v12, v0, LL0/a;->d:LM0/j;

    .line 714
    .line 715
    invoke-virtual {v12, v9}, LM0/j;->e(I)I

    .line 716
    .line 717
    .line 718
    move-result v12

    .line 719
    if-le v8, v12, :cond_2c

    .line 720
    .line 721
    const/4 v8, 0x1

    .line 722
    goto :goto_1d

    .line 723
    :cond_2c
    const/4 v8, 0x0

    .line 724
    :goto_1d
    if-nez v11, :cond_2d

    .line 725
    .line 726
    if-nez v8, :cond_2d

    .line 727
    .line 728
    if-eqz v10, :cond_2e

    .line 729
    .line 730
    :cond_2d
    const/4 v11, 0x0

    .line 731
    const/4 v14, 0x1

    .line 732
    goto :goto_20

    .line 733
    :cond_2e
    iget-object v8, v0, LL0/a;->d:LM0/j;

    .line 734
    .line 735
    iget-object v8, v8, LM0/j;->e:Landroid/text/Layout;

    .line 736
    .line 737
    invoke-virtual {v8, v6}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 738
    .line 739
    .line 740
    move-result v8

    .line 741
    if-eqz v8, :cond_2f

    .line 742
    .line 743
    sget-object v8, LV0/j;->r:LV0/j;

    .line 744
    .line 745
    goto :goto_1e

    .line 746
    :cond_2f
    sget-object v8, LV0/j;->q:LV0/j;

    .line 747
    .line 748
    :goto_1e
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 749
    .line 750
    .line 751
    move-result v8

    .line 752
    const-string v10, "PlaceholderSpan is not laid out yet."

    .line 753
    .line 754
    if-eqz v8, :cond_32

    .line 755
    .line 756
    const/4 v14, 0x1

    .line 757
    if-ne v8, v14, :cond_31

    .line 758
    .line 759
    iget-object v8, v0, LL0/a;->d:LM0/j;

    .line 760
    .line 761
    const/4 v11, 0x0

    .line 762
    invoke-virtual {v8, v6, v11}, LM0/j;->g(IZ)F

    .line 763
    .line 764
    .line 765
    move-result v6

    .line 766
    iget-boolean v8, v5, LN0/i;->t:Z

    .line 767
    .line 768
    if-nez v8, :cond_30

    .line 769
    .line 770
    invoke-static {v10}, LQ0/a;->b(Ljava/lang/String;)V

    .line 771
    .line 772
    .line 773
    :cond_30
    iget v8, v5, LN0/i;->r:I

    .line 774
    .line 775
    int-to-float v8, v8

    .line 776
    sub-float/2addr v6, v8

    .line 777
    const/4 v11, 0x0

    .line 778
    goto :goto_1f

    .line 779
    :cond_31
    new-instance v1, LC2/e;

    .line 780
    .line 781
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 782
    .line 783
    .line 784
    throw v1

    .line 785
    :cond_32
    const/4 v14, 0x1

    .line 786
    iget-object v8, v0, LL0/a;->d:LM0/j;

    .line 787
    .line 788
    const/4 v11, 0x0

    .line 789
    invoke-virtual {v8, v6, v11}, LM0/j;->g(IZ)F

    .line 790
    .line 791
    .line 792
    move-result v6

    .line 793
    :goto_1f
    iget-boolean v8, v5, LN0/i;->t:Z

    .line 794
    .line 795
    if-nez v8, :cond_33

    .line 796
    .line 797
    invoke-static {v10}, LQ0/a;->b(Ljava/lang/String;)V

    .line 798
    .line 799
    .line 800
    :cond_33
    iget v8, v5, LN0/i;->r:I

    .line 801
    .line 802
    int-to-float v8, v8

    .line 803
    add-float/2addr v8, v6

    .line 804
    iget-object v10, v0, LL0/a;->d:LM0/j;

    .line 805
    .line 806
    invoke-virtual {v10, v9}, LM0/j;->c(I)F

    .line 807
    .line 808
    .line 809
    move-result v9

    .line 810
    invoke-virtual {v5}, LN0/i;->b()I

    .line 811
    .line 812
    .line 813
    move-result v10

    .line 814
    int-to-float v10, v10

    .line 815
    sub-float/2addr v9, v10

    .line 816
    invoke-virtual {v5}, LN0/i;->b()I

    .line 817
    .line 818
    .line 819
    move-result v5

    .line 820
    int-to-float v5, v5

    .line 821
    add-float/2addr v5, v9

    .line 822
    new-instance v10, Li0/c;

    .line 823
    .line 824
    invoke-direct {v10, v6, v9, v8, v5}, Li0/c;-><init>(FFFF)V

    .line 825
    .line 826
    .line 827
    goto :goto_21

    .line 828
    :goto_20
    const/4 v10, 0x0

    .line 829
    :goto_21
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    add-int/lit8 v7, v7, 0x1

    .line 833
    .line 834
    goto/16 :goto_1a

    .line 835
    .line 836
    :cond_34
    move-object v1, v3

    .line 837
    :goto_22
    iput-object v1, v0, LL0/a;->f:Ljava/lang/Object;

    .line 838
    .line 839
    return-void
.end method


# virtual methods
.method public final a(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)LM0/j;
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p0}, LL0/a;->c()F

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    move-object/from16 v15, p0

    .line 6
    .line 7
    iget-object v0, v15, LL0/a;->a:LS0/d;

    .line 8
    .line 9
    iget-object v3, v0, LS0/d;->g:LS0/e;

    .line 10
    .line 11
    iget v6, v0, LS0/d;->l:I

    .line 12
    .line 13
    iget-object v14, v0, LS0/d;->i:LM0/e;

    .line 14
    .line 15
    iget-object v0, v0, LS0/d;->b:LL0/F;

    .line 16
    .line 17
    sget-object v1, LS0/b;->a:LS0/a;

    .line 18
    .line 19
    iget-object v0, v0, LL0/F;->c:LL0/t;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, LL0/t;->a:LL0/s;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-boolean v0, v0, LL0/s;->a:Z

    .line 28
    .line 29
    :goto_0
    move v7, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    goto :goto_0

    .line 33
    :goto_1
    new-instance v0, LM0/j;

    .line 34
    .line 35
    move/from16 v4, p1

    .line 36
    .line 37
    move/from16 v13, p2

    .line 38
    .line 39
    move-object/from16 v5, p3

    .line 40
    .line 41
    move/from16 v8, p4

    .line 42
    .line 43
    move/from16 v12, p5

    .line 44
    .line 45
    move/from16 v9, p6

    .line 46
    .line 47
    move/from16 v10, p7

    .line 48
    .line 49
    move/from16 v11, p8

    .line 50
    .line 51
    move-object/from16 v1, p9

    .line 52
    .line 53
    invoke-direct/range {v0 .. v14}, LM0/j;-><init>(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IZIIIIIILM0/e;)V

    .line 54
    .line 55
    .line 56
    return-object v0
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, LL0/a;->d:LM0/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LM0/j;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    return v0
.end method

.method public final c()F
    .locals 2

    .line 1
    iget-wide v0, p0, LL0/a;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, LW0/a;->h(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    return v0
.end method

.method public final d(Lj0/m;)V
    .locals 5

    .line 1
    invoke-static {p1}, Lj0/c;->a(Lj0/m;)Landroid/graphics/Canvas;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, LL0/a;->d:LM0/j;

    .line 6
    .line 7
    iget-boolean v1, v0, LM0/j;->d:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, LL0/a;->c()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0}, LL0/a;->b()F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {p1, v2, v2, v1, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    iget v1, v0, LM0/j;->g:I

    .line 27
    .line 28
    iget-object v3, v0, LM0/j;->o:Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    if-eqz v1, :cond_2

    .line 38
    .line 39
    int-to-float v3, v1

    .line 40
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 41
    .line 42
    .line 43
    :cond_2
    sget-object v3, LM0/k;->a:LM0/i;

    .line 44
    .line 45
    iput-object p1, v3, LM0/i;->a:Landroid/graphics/Canvas;

    .line 46
    .line 47
    iget-object v4, v0, LM0/j;->e:Landroid/text/Layout;

    .line 48
    .line 49
    invoke-virtual {v4, v3}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 50
    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    const/4 v3, -0x1

    .line 55
    int-to-float v3, v3

    .line 56
    int-to-float v1, v1

    .line 57
    mul-float/2addr v3, v1

    .line 58
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_0
    iget-boolean v0, v0, LM0/j;->d:Z

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 66
    .line 67
    .line 68
    :cond_4
    return-void
.end method
