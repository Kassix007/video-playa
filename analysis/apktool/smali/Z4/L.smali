.class public abstract LZ4/L;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:F

.field public static b:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x12c

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, LZ4/L;->a:F

    .line 5
    .line 6
    const/16 v0, 0x1f4

    .line 7
    .line 8
    int-to-float v0, v0

    .line 9
    sput v0, LZ4/L;->b:F

    .line 10
    .line 11
    return-void
.end method

.method public static final a(LZ4/i;LB5/a;LP/o;I)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const v3, 0x39889d0d

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v3}, LP/o;->U(I)LP/o;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v3, 0x2

    .line 22
    :goto_0
    or-int v3, p3, v3

    .line 23
    .line 24
    invoke-virtual {v2, v1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    const/16 v4, 0x20

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/16 v4, 0x10

    .line 34
    .line 35
    :goto_1
    or-int/2addr v3, v4

    .line 36
    and-int/lit8 v4, v3, 0x13

    .line 37
    .line 38
    const/16 v6, 0x12

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    if-eq v4, v6, :cond_2

    .line 42
    .line 43
    const/4 v4, 0x1

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move v4, v8

    .line 46
    :goto_2
    and-int/lit8 v6, v3, 0x1

    .line 47
    .line 48
    invoke-virtual {v2, v6, v4}, LP/o;->K(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_13

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iget-object v6, v0, LZ4/i;->c:Ljava/lang/String;

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_3
    const/4 v6, 0x0

    .line 60
    :goto_3
    if-eqz v6, :cond_4

    .line 61
    .line 62
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-nez v6, :cond_5

    .line 67
    .line 68
    :cond_4
    move v1, v8

    .line 69
    goto/16 :goto_d

    .line 70
    .line 71
    :cond_5
    const v6, -0x69848936

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v6}, LP/o;->S(I)V

    .line 75
    .line 76
    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    :try_start_0
    iget-object v6, v0, LZ4/i;->b:Ljava/lang/String;

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/4 v6, 0x0

    .line 83
    :goto_4
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    invoke-static {v6}, Lj0/B;->b(I)J

    .line 88
    .line 89
    .line 90
    move-result-wide v9

    .line 91
    if-eqz v0, :cond_7

    .line 92
    .line 93
    iget-object v6, v0, LZ4/i;->a:Ljava/lang/String;

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_7
    const/4 v6, 0x0

    .line 97
    :goto_5
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-static {v6}, Lj0/B;->b(I)J

    .line 102
    .line 103
    .line 104
    move-result-wide v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    goto :goto_6

    .line 106
    :catch_0
    const-string v6, "#ffffff"

    .line 107
    .line 108
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    invoke-static {v6}, Lj0/B;->b(I)J

    .line 113
    .line 114
    .line 115
    move-result-wide v9

    .line 116
    const-string v6, "#000000"

    .line 117
    .line 118
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    invoke-static {v6}, Lj0/B;->b(I)J

    .line 123
    .line 124
    .line 125
    move-result-wide v11

    .line 126
    :goto_6
    sget-object v6, Lc0/b;->x:Lc0/e;

    .line 127
    .line 128
    sget-object v13, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 129
    .line 130
    const/16 v14, 0x14

    .line 131
    .line 132
    int-to-float v15, v14

    .line 133
    const/16 v18, 0x7

    .line 134
    .line 135
    move/from16 v16, v14

    .line 136
    .line 137
    const/4 v14, 0x0

    .line 138
    move/from16 v17, v15

    .line 139
    .line 140
    const/4 v15, 0x0

    .line 141
    move/from16 v19, v16

    .line 142
    .line 143
    const/16 v16, 0x0

    .line 144
    .line 145
    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/b;->d(Lc0/m;FFFFI)Lc0/m;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    invoke-static {v6, v8}, LA/n;->d(Lc0/e;Z)Lz0/C;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    iget v14, v2, LP/o;->P:I

    .line 154
    .line 155
    invoke-virtual {v2}, LP/o;->m()LP/i0;

    .line 156
    .line 157
    .line 158
    move-result-object v15

    .line 159
    invoke-static {v2, v13}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    sget-object v16, LB0/k;->a:LB0/j;

    .line 164
    .line 165
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    sget-object v4, LB0/j;->b:LB0/D;

    .line 169
    .line 170
    invoke-virtual {v2}, LP/o;->W()V

    .line 171
    .line 172
    .line 173
    iget-boolean v7, v2, LP/o;->O:Z

    .line 174
    .line 175
    if-eqz v7, :cond_8

    .line 176
    .line 177
    invoke-virtual {v2, v4}, LP/o;->l(LB5/a;)V

    .line 178
    .line 179
    .line 180
    goto :goto_7

    .line 181
    :cond_8
    invoke-virtual {v2}, LP/o;->g0()V

    .line 182
    .line 183
    .line 184
    :goto_7
    sget-object v7, LB0/j;->e:LB0/i;

    .line 185
    .line 186
    invoke-static {v7, v2, v6}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    sget-object v6, LB0/j;->d:LB0/i;

    .line 190
    .line 191
    invoke-static {v6, v2, v15}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    sget-object v15, LB0/j;->f:LB0/i;

    .line 195
    .line 196
    iget-boolean v5, v2, LP/o;->O:Z

    .line 197
    .line 198
    if-nez v5, :cond_9

    .line 199
    .line 200
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    invoke-static {v5, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-nez v5, :cond_a

    .line 213
    .line 214
    :cond_9
    invoke-static {v14, v2, v14, v15}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 215
    .line 216
    .line 217
    :cond_a
    sget-object v5, LB0/j;->c:LB0/i;

    .line 218
    .line 219
    invoke-static {v5, v2, v13}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    if-eqz v0, :cond_b

    .line 223
    .line 224
    iget-object v8, v0, LZ4/i;->c:Ljava/lang/String;

    .line 225
    .line 226
    move-object/from16 v16, v8

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_b
    const/16 v16, 0x0

    .line 230
    .line 231
    :goto_8
    if-nez v16, :cond_c

    .line 232
    .line 233
    const v3, -0x40a0b021

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v3}, LP/o;->S(I)V

    .line 237
    .line 238
    .line 239
    const/4 v3, 0x0

    .line 240
    invoke-virtual {v2, v3}, LP/o;->p(Z)V

    .line 241
    .line 242
    .line 243
    move v1, v3

    .line 244
    const/4 v0, 0x1

    .line 245
    goto/16 :goto_b

    .line 246
    .line 247
    :cond_c
    const v8, -0x40a0b020

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v8}, LP/o;->S(I)V

    .line 251
    .line 252
    .line 253
    const/16 v8, 0x46

    .line 254
    .line 255
    int-to-float v8, v8

    .line 256
    const/16 v13, 0x1e

    .line 257
    .line 258
    int-to-float v13, v13

    .line 259
    const/16 v14, 0xc

    .line 260
    .line 261
    invoke-static {v14}, Lcom/google/android/gms/internal/measurement/n2;->y(I)J

    .line 262
    .line 263
    .line 264
    move-result-wide v21

    .line 265
    sget-object v14, Lc0/j;->q:Lc0/j;

    .line 266
    .line 267
    invoke-static {v14, v8}, Landroidx/compose/foundation/layout/c;->e(Lc0/m;F)Lc0/m;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    invoke-static {v8, v13}, Landroidx/compose/foundation/layout/c;->a(Lc0/m;F)Lc0/m;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    sget-object v13, Lj0/B;->a:LO3/D;

    .line 276
    .line 277
    invoke-static {v8, v9, v10, v13}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 278
    .line 279
    .line 280
    move-result-object v8

    .line 281
    invoke-static/range {v19 .. v19}, LH/e;->a(I)LH/d;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    invoke-static {v8, v9}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 286
    .line 287
    .line 288
    move-result-object v8

    .line 289
    and-int/lit8 v3, v3, 0x70

    .line 290
    .line 291
    const/16 v9, 0x20

    .line 292
    .line 293
    if-ne v3, v9, :cond_d

    .line 294
    .line 295
    const/4 v3, 0x1

    .line 296
    goto :goto_9

    .line 297
    :cond_d
    const/4 v3, 0x0

    .line 298
    :goto_9
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v9

    .line 302
    if-nez v3, :cond_e

    .line 303
    .line 304
    sget-object v3, LP/k;->a:LP/S;

    .line 305
    .line 306
    if-ne v9, v3, :cond_f

    .line 307
    .line 308
    :cond_e
    new-instance v9, LZ4/E;

    .line 309
    .line 310
    const/4 v3, 0x0

    .line 311
    invoke-direct {v9, v1, v3}, LZ4/E;-><init>(LB5/a;I)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2, v9}, LP/o;->d0(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    :cond_f
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 318
    .line 319
    sget-object v3, Lm5/y;->a:Lm5/y;

    .line 320
    .line 321
    invoke-static {v8, v3, v9}, Lv0/u;->a(Lc0/m;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lc0/m;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    sget-object v8, Lc0/b;->u:Lc0/e;

    .line 326
    .line 327
    const/4 v9, 0x0

    .line 328
    invoke-static {v8, v9}, LA/n;->d(Lc0/e;Z)Lz0/C;

    .line 329
    .line 330
    .line 331
    move-result-object v8

    .line 332
    iget v10, v2, LP/o;->P:I

    .line 333
    .line 334
    invoke-virtual {v2}, LP/o;->m()LP/i0;

    .line 335
    .line 336
    .line 337
    move-result-object v13

    .line 338
    invoke-static {v2, v3}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    invoke-virtual {v2}, LP/o;->W()V

    .line 343
    .line 344
    .line 345
    iget-boolean v14, v2, LP/o;->O:Z

    .line 346
    .line 347
    if-eqz v14, :cond_10

    .line 348
    .line 349
    invoke-virtual {v2, v4}, LP/o;->l(LB5/a;)V

    .line 350
    .line 351
    .line 352
    goto :goto_a

    .line 353
    :cond_10
    invoke-virtual {v2}, LP/o;->g0()V

    .line 354
    .line 355
    .line 356
    :goto_a
    invoke-static {v7, v2, v8}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    invoke-static {v6, v2, v13}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    iget-boolean v4, v2, LP/o;->O:Z

    .line 363
    .line 364
    if-nez v4, :cond_11

    .line 365
    .line 366
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v4

    .line 370
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    invoke-static {v4, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    if-nez v4, :cond_12

    .line 379
    .line 380
    :cond_11
    invoke-static {v10, v2, v10, v15}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 381
    .line 382
    .line 383
    :cond_12
    invoke-static {v5, v2, v3}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    move-wide/from16 v6, v21

    .line 387
    .line 388
    const/16 v21, 0x0

    .line 389
    .line 390
    const v22, 0x1fff2

    .line 391
    .line 392
    .line 393
    const/4 v3, 0x0

    .line 394
    const/4 v8, 0x0

    .line 395
    move/from16 v20, v9

    .line 396
    .line 397
    const-wide/16 v9, 0x0

    .line 398
    .line 399
    move-wide v4, v11

    .line 400
    const/4 v11, 0x0

    .line 401
    const-wide/16 v12, 0x0

    .line 402
    .line 403
    const/4 v14, 0x0

    .line 404
    const/4 v15, 0x0

    .line 405
    move-object/from16 v2, v16

    .line 406
    .line 407
    const/16 v16, 0x0

    .line 408
    .line 409
    const/16 v18, 0x1

    .line 410
    .line 411
    const/16 v17, 0x0

    .line 412
    .line 413
    move/from16 v19, v18

    .line 414
    .line 415
    const/16 v18, 0x0

    .line 416
    .line 417
    move/from16 v23, v20

    .line 418
    .line 419
    const/16 v20, 0xc00

    .line 420
    .line 421
    move/from16 v0, v19

    .line 422
    .line 423
    move/from16 v1, v23

    .line 424
    .line 425
    move-object/from16 v19, p2

    .line 426
    .line 427
    invoke-static/range {v2 .. v22}, LM/N0;->b(Ljava/lang/String;Lc0/m;JJLO0/j;JLV0/k;JIZIILL0/F;LP/o;III)V

    .line 428
    .line 429
    .line 430
    move-object/from16 v2, v19

    .line 431
    .line 432
    invoke-virtual {v2, v0}, LP/o;->p(Z)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2, v1}, LP/o;->p(Z)V

    .line 436
    .line 437
    .line 438
    :goto_b
    invoke-virtual {v2, v0}, LP/o;->p(Z)V

    .line 439
    .line 440
    .line 441
    :goto_c
    invoke-virtual {v2, v1}, LP/o;->p(Z)V

    .line 442
    .line 443
    .line 444
    goto :goto_e

    .line 445
    :goto_d
    const v0, -0x6aab5e19

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v0}, LP/o;->S(I)V

    .line 449
    .line 450
    .line 451
    goto :goto_c

    .line 452
    :cond_13
    invoke-virtual {v2}, LP/o;->N()V

    .line 453
    .line 454
    .line 455
    :goto_e
    invoke-virtual {v2}, LP/o;->r()LP/o0;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    if-eqz v0, :cond_14

    .line 460
    .line 461
    new-instance v1, LR4/Z;

    .line 462
    .line 463
    const/4 v2, 0x7

    .line 464
    move-object/from16 v3, p0

    .line 465
    .line 466
    move-object/from16 v4, p1

    .line 467
    .line 468
    move/from16 v5, p3

    .line 469
    .line 470
    invoke-direct {v1, v5, v2, v3, v4}, LR4/Z;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    iput-object v1, v0, LP/o0;->d:LB5/e;

    .line 474
    .line 475
    :cond_14
    return-void
.end method

.method public static final b(LZ4/o;LB5/a;LP/o;I)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v12, p3

    .line 8
    .line 9
    const v2, 0x22f8845b

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v2}, LP/o;->U(I)LP/o;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v9, v0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x2

    .line 24
    :goto_0
    or-int/2addr v2, v12

    .line 25
    invoke-virtual {v9, v1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/16 v4, 0x20

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    move v3, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v3, 0x10

    .line 36
    .line 37
    :goto_1
    or-int/2addr v2, v3

    .line 38
    and-int/lit8 v3, v2, 0x13

    .line 39
    .line 40
    const/16 v5, 0x12

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v13, 0x1

    .line 44
    if-eq v3, v5, :cond_2

    .line 45
    .line 46
    move v3, v13

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move v3, v6

    .line 49
    :goto_2
    and-int/lit8 v5, v2, 0x1

    .line 50
    .line 51
    invoke-virtual {v9, v5, v3}, LP/o;->K(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_e

    .line 56
    .line 57
    sget-object v3, Lc0/b;->s:Lc0/e;

    .line 58
    .line 59
    sget-object v14, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 60
    .line 61
    const/16 v5, 0xa

    .line 62
    .line 63
    int-to-float v5, v5

    .line 64
    const/16 v18, 0x0

    .line 65
    .line 66
    const/16 v19, 0x9

    .line 67
    .line 68
    const/4 v15, 0x0

    .line 69
    move/from16 v17, v5

    .line 70
    .line 71
    move/from16 v16, v5

    .line 72
    .line 73
    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/b;->d(Lc0/m;FFFFI)Lc0/m;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {v3, v6}, LA/n;->d(Lc0/e;Z)Lz0/C;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    iget v7, v9, LP/o;->P:I

    .line 82
    .line 83
    invoke-virtual {v9}, LP/o;->m()LP/i0;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    invoke-static {v9, v5}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    sget-object v10, LB0/k;->a:LB0/j;

    .line 92
    .line 93
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    sget-object v10, LB0/j;->b:LB0/D;

    .line 97
    .line 98
    invoke-virtual {v9}, LP/o;->W()V

    .line 99
    .line 100
    .line 101
    iget-boolean v11, v9, LP/o;->O:Z

    .line 102
    .line 103
    if-eqz v11, :cond_3

    .line 104
    .line 105
    invoke-virtual {v9, v10}, LP/o;->l(LB5/a;)V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_3
    invoke-virtual {v9}, LP/o;->g0()V

    .line 110
    .line 111
    .line 112
    :goto_3
    sget-object v10, LB0/j;->e:LB0/i;

    .line 113
    .line 114
    invoke-static {v10, v9, v3}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    sget-object v3, LB0/j;->d:LB0/i;

    .line 118
    .line 119
    invoke-static {v3, v9, v8}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-object v3, LB0/j;->f:LB0/i;

    .line 123
    .line 124
    iget-boolean v8, v9, LP/o;->O:Z

    .line 125
    .line 126
    if-nez v8, :cond_4

    .line 127
    .line 128
    invoke-virtual {v9}, LP/o;->H()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    invoke-static {v8, v10}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    if-nez v8, :cond_5

    .line 141
    .line 142
    :cond_4
    invoke-static {v7, v9, v7, v3}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 143
    .line 144
    .line 145
    :cond_5
    sget-object v3, LB0/j;->c:LB0/i;

    .line 146
    .line 147
    invoke-static {v3, v9, v5}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    const/4 v3, 0x0

    .line 151
    if-eqz v0, :cond_6

    .line 152
    .line 153
    :try_start_0
    iget-object v5, v0, LZ4/o;->b:LZ4/c;

    .line 154
    .line 155
    if-eqz v5, :cond_6

    .line 156
    .line 157
    iget-object v5, v5, LZ4/c;->b:LZ4/i;

    .line 158
    .line 159
    if-eqz v5, :cond_6

    .line 160
    .line 161
    iget-object v5, v5, LZ4/i;->a:Ljava/lang/String;

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_6
    move-object v5, v3

    .line 165
    :goto_4
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    invoke-static {v5}, Lj0/B;->b(I)J

    .line 170
    .line 171
    .line 172
    move-result-wide v7

    .line 173
    if-eqz v0, :cond_7

    .line 174
    .line 175
    iget-object v5, v0, LZ4/o;->b:LZ4/c;

    .line 176
    .line 177
    if-eqz v5, :cond_7

    .line 178
    .line 179
    iget-object v5, v5, LZ4/c;->b:LZ4/i;

    .line 180
    .line 181
    if-eqz v5, :cond_7

    .line 182
    .line 183
    iget-object v3, v5, LZ4/i;->b:Ljava/lang/String;

    .line 184
    .line 185
    :cond_7
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    invoke-static {v3}, Lj0/B;->b(I)J

    .line 190
    .line 191
    .line 192
    move-result-wide v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 193
    goto :goto_5

    .line 194
    :catch_0
    const-string v3, "#ffffff"

    .line 195
    .line 196
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    invoke-static {v3}, Lj0/B;->b(I)J

    .line 201
    .line 202
    .line 203
    move-result-wide v7

    .line 204
    const-string v3, "#000000"

    .line 205
    .line 206
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    invoke-static {v3}, Lj0/B;->b(I)J

    .line 211
    .line 212
    .line 213
    move-result-wide v10

    .line 214
    :goto_5
    const/16 v3, 0x19

    .line 215
    .line 216
    int-to-float v3, v3

    .line 217
    sget-object v5, Lc0/j;->q:Lc0/j;

    .line 218
    .line 219
    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/c;->c(Lc0/m;F)Lc0/m;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    sget-object v14, LH/e;->a:LH/d;

    .line 224
    .line 225
    invoke-static {v3, v14}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    sget-object v14, Lj0/B;->a:LO3/D;

    .line 230
    .line 231
    invoke-static {v3, v7, v8, v14}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    and-int/lit8 v2, v2, 0x70

    .line 236
    .line 237
    if-ne v2, v4, :cond_8

    .line 238
    .line 239
    move v2, v13

    .line 240
    goto :goto_6

    .line 241
    :cond_8
    move v2, v6

    .line 242
    :goto_6
    invoke-virtual {v9}, LP/o;->H()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    if-nez v2, :cond_9

    .line 247
    .line 248
    sget-object v2, LP/k;->a:LP/S;

    .line 249
    .line 250
    if-ne v4, v2, :cond_a

    .line 251
    .line 252
    :cond_9
    new-instance v4, LZ4/E;

    .line 253
    .line 254
    const/4 v2, 0x1

    .line 255
    invoke-direct {v4, v1, v2}, LZ4/E;-><init>(LB5/a;I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v9, v4}, LP/o;->d0(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    :cond_a
    check-cast v4, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 262
    .line 263
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 264
    .line 265
    invoke-static {v3, v2, v4}, Lv0/u;->a(Lc0/m;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lc0/m;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    sget-object v3, Lc0/b;->q:Lc0/e;

    .line 270
    .line 271
    invoke-static {v3, v6}, LA/n;->d(Lc0/e;Z)Lz0/C;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    iget v4, v9, LP/o;->P:I

    .line 276
    .line 277
    invoke-virtual {v9}, LP/o;->m()LP/i0;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    invoke-static {v9, v2}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    sget-object v8, LB0/k;->a:LB0/j;

    .line 286
    .line 287
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    sget-object v8, LB0/j;->b:LB0/D;

    .line 291
    .line 292
    invoke-virtual {v9}, LP/o;->W()V

    .line 293
    .line 294
    .line 295
    iget-boolean v14, v9, LP/o;->O:Z

    .line 296
    .line 297
    if-eqz v14, :cond_b

    .line 298
    .line 299
    invoke-virtual {v9, v8}, LP/o;->l(LB5/a;)V

    .line 300
    .line 301
    .line 302
    goto :goto_7

    .line 303
    :cond_b
    invoke-virtual {v9}, LP/o;->g0()V

    .line 304
    .line 305
    .line 306
    :goto_7
    sget-object v8, LB0/j;->e:LB0/i;

    .line 307
    .line 308
    invoke-static {v8, v9, v3}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    sget-object v3, LB0/j;->d:LB0/i;

    .line 312
    .line 313
    invoke-static {v3, v9, v7}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    sget-object v3, LB0/j;->f:LB0/i;

    .line 317
    .line 318
    iget-boolean v7, v9, LP/o;->O:Z

    .line 319
    .line 320
    if-nez v7, :cond_c

    .line 321
    .line 322
    invoke-virtual {v9}, LP/o;->H()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 327
    .line 328
    .line 329
    move-result-object v8

    .line 330
    invoke-static {v7, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v7

    .line 334
    if-nez v7, :cond_d

    .line 335
    .line 336
    :cond_c
    invoke-static {v4, v9, v4, v3}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 337
    .line 338
    .line 339
    :cond_d
    sget-object v3, LB0/j;->c:LB0/i;

    .line 340
    .line 341
    invoke-static {v3, v9, v2}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    const v2, 0x7f070089

    .line 345
    .line 346
    .line 347
    invoke-static {v2, v9, v6}, Lcom/google/android/gms/internal/measurement/n2;->F(ILP/o;I)Lo0/b;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    const/4 v3, 0x3

    .line 352
    int-to-float v3, v3

    .line 353
    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/b;->a(Lc0/m;F)Lc0/m;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    new-instance v8, Lj0/j;

    .line 358
    .line 359
    const/4 v3, 0x5

    .line 360
    invoke-direct {v8, v10, v11, v3}, Lj0/j;-><init>(JI)V

    .line 361
    .line 362
    .line 363
    const/16 v10, 0x1b0

    .line 364
    .line 365
    const/16 v11, 0x38

    .line 366
    .line 367
    const-string v3, "closeBtn"

    .line 368
    .line 369
    const/4 v5, 0x0

    .line 370
    const/4 v6, 0x0

    .line 371
    const/4 v7, 0x0

    .line 372
    invoke-static/range {v2 .. v11}, LD5/a;->c(Lo0/b;Ljava/lang/String;Lc0/m;Lc0/e;Lz0/j;FLj0/j;LP/o;II)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v9, v13}, LP/o;->p(Z)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v9, v13}, LP/o;->p(Z)V

    .line 379
    .line 380
    .line 381
    goto :goto_8

    .line 382
    :cond_e
    invoke-virtual {v9}, LP/o;->N()V

    .line 383
    .line 384
    .line 385
    :goto_8
    invoke-virtual {v9}, LP/o;->r()LP/o0;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    if-eqz v2, :cond_f

    .line 390
    .line 391
    new-instance v3, LR4/Z;

    .line 392
    .line 393
    const/4 v4, 0x6

    .line 394
    invoke-direct {v3, v12, v4, v0, v1}, LR4/Z;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    iput-object v3, v2, LP/o0;->d:LB5/e;

    .line 398
    .line 399
    :cond_f
    return-void
.end method

.method public static final c(Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;JLB5/c;LP/o;I)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v9, p6

    .line 6
    .line 7
    const v0, -0x6d9f5932

    .line 8
    .line 9
    .line 10
    invoke-virtual {v9, v0}, LP/o;->U(I)LP/o;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v9, v1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x2

    .line 22
    :goto_0
    or-int v0, p7, v0

    .line 23
    .line 24
    invoke-virtual {v9, v2}, LP/o;->g(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    const/16 v4, 0x20

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/16 v4, 0x10

    .line 34
    .line 35
    :goto_1
    or-int/2addr v0, v4

    .line 36
    move-object/from16 v12, p2

    .line 37
    .line 38
    invoke-virtual {v9, v12}, LP/o;->g(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    const/16 v4, 0x100

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v4, 0x80

    .line 48
    .line 49
    :goto_2
    or-int/2addr v0, v4

    .line 50
    move-wide/from16 v7, p3

    .line 51
    .line 52
    invoke-virtual {v9, v7, v8}, LP/o;->f(J)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    const/16 v4, 0x800

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const/16 v4, 0x400

    .line 62
    .line 63
    :goto_3
    or-int/2addr v0, v4

    .line 64
    move-object/from16 v4, p5

    .line 65
    .line 66
    invoke-virtual {v9, v4}, LP/o;->i(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    if-eqz v11, :cond_4

    .line 71
    .line 72
    const/16 v11, 0x4000

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_4
    const/16 v11, 0x2000

    .line 76
    .line 77
    :goto_4
    or-int/2addr v0, v11

    .line 78
    and-int/lit16 v11, v0, 0x2493

    .line 79
    .line 80
    const/16 v14, 0x2492

    .line 81
    .line 82
    const/16 v18, 0x0

    .line 83
    .line 84
    const/16 v19, 0x1

    .line 85
    .line 86
    if-eq v11, v14, :cond_5

    .line 87
    .line 88
    move/from16 v11, v19

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_5
    move/from16 v11, v18

    .line 92
    .line 93
    :goto_5
    and-int/lit8 v14, v0, 0x1

    .line 94
    .line 95
    invoke-virtual {v9, v14, v11}, LP/o;->K(IZ)Z

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    if-eqz v11, :cond_e

    .line 100
    .line 101
    invoke-virtual {v9}, LP/o;->H()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    sget-object v14, LP/k;->a:LP/S;

    .line 106
    .line 107
    if-ne v11, v14, :cond_6

    .line 108
    .line 109
    const/4 v11, 0x0

    .line 110
    invoke-static {v11}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    invoke-virtual {v9, v11}, LP/o;->d0(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_6
    move-object/from16 v20, v11

    .line 118
    .line 119
    check-cast v20, LP/W;

    .line 120
    .line 121
    sget-object v11, LC0/t0;->h:LP/T0;

    .line 122
    .line 123
    invoke-virtual {v9, v11}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    check-cast v11, LW0/c;

    .line 128
    .line 129
    sget-object v15, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:LP/z;

    .line 130
    .line 131
    invoke-virtual {v9, v15}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v15

    .line 135
    check-cast v15, Landroid/content/res/Configuration;

    .line 136
    .line 137
    const/16 v16, 0x2

    .line 138
    .line 139
    iget v3, v15, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 140
    .line 141
    div-int/lit8 v3, v3, 0x2

    .line 142
    .line 143
    int-to-float v3, v3

    .line 144
    iget v15, v15, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 145
    .line 146
    div-int/lit8 v15, v15, 0x2

    .line 147
    .line 148
    int-to-float v15, v15

    .line 149
    invoke-interface/range {v20 .. v20}, LP/S0;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v16

    .line 153
    check-cast v16, Landroid/widget/ImageView;

    .line 154
    .line 155
    if-eqz v16, :cond_7

    .line 156
    .line 157
    invoke-interface/range {v20 .. v20}, LP/S0;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v16

    .line 161
    move-object/from16 v10, v16

    .line 162
    .line 163
    check-cast v10, Landroid/widget/ImageView;

    .line 164
    .line 165
    invoke-static {v10}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 169
    .line 170
    .line 171
    move-result-object v16

    .line 172
    invoke-static/range {v16 .. v16}, Lt2/a;->a(Landroid/content/Context;)Lt2/l;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    new-instance v5, LD2/h;

    .line 177
    .line 178
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    invoke-direct {v5, v13}, LD2/h;-><init>(Landroid/content/Context;)V

    .line 183
    .line 184
    .line 185
    iput-object v2, v5, LD2/h;->c:Ljava/lang/Object;

    .line 186
    .line 187
    new-instance v13, LF2/a;

    .line 188
    .line 189
    invoke-direct {v13, v10}, LF2/a;-><init>(Landroid/widget/ImageView;)V

    .line 190
    .line 191
    .line 192
    iput-object v13, v5, LD2/h;->d:LF2/b;

    .line 193
    .line 194
    invoke-virtual {v5}, LD2/h;->b()V

    .line 195
    .line 196
    .line 197
    new-instance v10, LZ4/F;

    .line 198
    .line 199
    move-wide/from16 v21, v7

    .line 200
    .line 201
    move-object v7, v14

    .line 202
    move v14, v15

    .line 203
    move-wide/from16 v15, v21

    .line 204
    .line 205
    move v13, v3

    .line 206
    move-object/from16 v17, v4

    .line 207
    .line 208
    const/16 v3, 0x4000

    .line 209
    .line 210
    const/16 v4, 0x800

    .line 211
    .line 212
    invoke-direct/range {v10 .. v17}, LZ4/F;-><init>(LW0/c;Ljava/lang/String;FFJLB5/c;)V

    .line 213
    .line 214
    .line 215
    iput-object v10, v5, LD2/h;->e:LD2/i;

    .line 216
    .line 217
    invoke-virtual {v5}, LD2/h;->a()LD2/j;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-virtual {v6, v5}, Lt2/l;->b(LD2/j;)LD2/l;

    .line 222
    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_7
    move-object v7, v14

    .line 226
    const/16 v3, 0x4000

    .line 227
    .line 228
    const/16 v4, 0x800

    .line 229
    .line 230
    :goto_6
    invoke-virtual {v9, v1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    and-int/lit8 v6, v0, 0x70

    .line 235
    .line 236
    const/16 v8, 0x20

    .line 237
    .line 238
    if-ne v6, v8, :cond_8

    .line 239
    .line 240
    move/from16 v6, v19

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_8
    move/from16 v6, v18

    .line 244
    .line 245
    :goto_7
    or-int/2addr v5, v6

    .line 246
    invoke-virtual {v9, v11}, LP/o;->g(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    or-int/2addr v5, v6

    .line 251
    and-int/lit16 v6, v0, 0x380

    .line 252
    .line 253
    const/16 v8, 0x100

    .line 254
    .line 255
    if-ne v6, v8, :cond_9

    .line 256
    .line 257
    move/from16 v6, v19

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_9
    move/from16 v6, v18

    .line 261
    .line 262
    :goto_8
    or-int/2addr v5, v6

    .line 263
    and-int/lit16 v6, v0, 0x1c00

    .line 264
    .line 265
    if-ne v6, v4, :cond_a

    .line 266
    .line 267
    move/from16 v4, v19

    .line 268
    .line 269
    goto :goto_9

    .line 270
    :cond_a
    move/from16 v4, v18

    .line 271
    .line 272
    :goto_9
    or-int/2addr v4, v5

    .line 273
    const v5, 0xe000

    .line 274
    .line 275
    .line 276
    and-int/2addr v0, v5

    .line 277
    if-ne v0, v3, :cond_b

    .line 278
    .line 279
    move/from16 v18, v19

    .line 280
    .line 281
    :cond_b
    or-int v0, v4, v18

    .line 282
    .line 283
    invoke-virtual {v9}, LP/o;->H()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    if-nez v0, :cond_c

    .line 288
    .line 289
    if-ne v3, v7, :cond_d

    .line 290
    .line 291
    :cond_c
    new-instance v0, LZ4/x;

    .line 292
    .line 293
    move-object/from16 v5, p2

    .line 294
    .line 295
    move-wide/from16 v6, p3

    .line 296
    .line 297
    move-object/from16 v8, p5

    .line 298
    .line 299
    move-object v4, v11

    .line 300
    move-object/from16 v3, v20

    .line 301
    .line 302
    invoke-direct/range {v0 .. v8}, LZ4/x;-><init>(Lcom/web2native/MainActivity;Ljava/lang/String;LP/W;LW0/c;Ljava/lang/String;JLB5/c;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v9, v0}, LP/o;->d0(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    move-object v3, v0

    .line 309
    :cond_d
    move-object v0, v3

    .line 310
    check-cast v0, LB5/c;

    .line 311
    .line 312
    const/4 v4, 0x0

    .line 313
    const/4 v5, 0x6

    .line 314
    const/4 v1, 0x0

    .line 315
    const/4 v2, 0x0

    .line 316
    move-object v3, v9

    .line 317
    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/viewinterop/a;->b(LB5/c;Lc0/m;LB5/c;LP/o;II)V

    .line 318
    .line 319
    .line 320
    goto :goto_a

    .line 321
    :cond_e
    invoke-virtual/range {p6 .. p6}, LP/o;->N()V

    .line 322
    .line 323
    .line 324
    :goto_a
    invoke-virtual/range {p6 .. p6}, LP/o;->r()LP/o0;

    .line 325
    .line 326
    .line 327
    move-result-object v8

    .line 328
    if-eqz v8, :cond_f

    .line 329
    .line 330
    new-instance v0, LZ4/y;

    .line 331
    .line 332
    move-object/from16 v1, p0

    .line 333
    .line 334
    move-object/from16 v2, p1

    .line 335
    .line 336
    move-object/from16 v3, p2

    .line 337
    .line 338
    move-wide/from16 v4, p3

    .line 339
    .line 340
    move-object/from16 v6, p5

    .line 341
    .line 342
    move/from16 v7, p7

    .line 343
    .line 344
    invoke-direct/range {v0 .. v7}, LZ4/y;-><init>(Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;JLB5/c;I)V

    .line 345
    .line 346
    .line 347
    iput-object v0, v8, LP/o0;->d:LB5/e;

    .line 348
    .line 349
    :cond_f
    return-void
.end method

.method public static final d(Lcom/web2native/MainActivity;Landroid/webkit/WebView;Lcom/web2native/MainActivity;LZ4/M;LP/o;I)V
    .locals 34

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v0, p4

    sget-object v1, Lc0/b;->u:Lc0/e;

    const v5, -0x5e66308e

    .line 1
    invoke-virtual {v0, v5}, LP/o;->U(I)LP/o;

    move-object/from16 v5, p0

    invoke-virtual {v0, v5}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int v6, p5, v6

    invoke-virtual {v0, v2}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/16 v7, 0x20

    goto :goto_1

    :cond_1
    const/16 v7, 0x10

    :goto_1
    or-int/2addr v6, v7

    invoke-virtual {v0, v3}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x100

    goto :goto_2

    :cond_2
    const/16 v7, 0x80

    :goto_2
    or-int/2addr v6, v7

    invoke-virtual {v0, v4}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x800

    goto :goto_3

    :cond_3
    const/16 v7, 0x400

    :goto_3
    or-int/2addr v6, v7

    and-int/lit16 v7, v6, 0x493

    const/16 v8, 0x492

    if-eq v7, v8, :cond_4

    const/4 v7, 0x1

    goto :goto_4

    :cond_4
    const/4 v7, 0x0

    :goto_4
    and-int/lit8 v8, v6, 0x1

    invoke-virtual {v0, v8, v7}, LP/o;->K(IZ)Z

    move-result v7

    if-eqz v7, :cond_3e

    .line 2
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v7

    .line 3
    sget-object v8, LP/k;->a:LP/S;

    if-ne v7, v8, :cond_5

    .line 4
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    move-result-object v7

    .line 5
    invoke-virtual {v0, v7}, LP/o;->d0(Ljava/lang/Object;)V

    .line 6
    :cond_5
    check-cast v7, LP/W;

    .line 7
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v11

    const/4 v12, 0x0

    if-ne v11, v8, :cond_6

    .line 8
    invoke-static {v12}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    move-result-object v11

    .line 9
    invoke-virtual {v0, v11}, LP/o;->d0(Ljava/lang/Object;)V

    .line 10
    :cond_6
    check-cast v11, LP/W;

    if-eqz v4, :cond_7

    .line 11
    iget-object v13, v4, LZ4/M;->c:LP5/D;

    goto :goto_5

    :cond_7
    move-object v13, v12

    .line 12
    :goto_5
    invoke-static {v13}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    invoke-static {v13, v0}, LP/b;->j(LP5/P;LP/o;)LP/W;

    move-result-object v13

    .line 13
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v8, :cond_8

    .line 14
    invoke-static {v12}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    move-result-object v14

    .line 15
    invoke-virtual {v0, v14}, LP/o;->d0(Ljava/lang/Object;)V

    .line 16
    :cond_8
    check-cast v14, LP/W;

    .line 17
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v8, :cond_9

    .line 18
    invoke-static {v12}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    move-result-object v15

    .line 19
    invoke-virtual {v0, v15}, LP/o;->d0(Ljava/lang/Object;)V

    .line 20
    :cond_9
    check-cast v15, LP/W;

    .line 21
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v9

    .line 22
    const-string v10, "IMAGE"

    if-ne v9, v8, :cond_a

    .line 23
    invoke-static {v10}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    move-result-object v9

    .line 24
    invoke-virtual {v0, v9}, LP/o;->d0(Ljava/lang/Object;)V

    .line 25
    :cond_a
    check-cast v9, LP/W;

    move-object/from16 v18, v12

    .line 26
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v20, v1

    .line 27
    const-string v1, "SMALL"

    if-ne v12, v8, :cond_b

    .line 28
    invoke-static {v1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    move-result-object v12

    .line 29
    invoke-virtual {v0, v12}, LP/o;->d0(Ljava/lang/Object;)V

    .line 30
    :cond_b
    check-cast v12, LP/W;

    .line 31
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_c

    .line 32
    const-string v5, "RIGHT"

    invoke-static {v5}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    move-result-object v5

    .line 33
    invoke-virtual {v0, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 34
    :cond_c
    check-cast v5, LP/W;

    move-object/from16 v19, v5

    .line 35
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_d

    .line 36
    new-instance v5, LP/c0;

    move/from16 v21, v6

    const/16 v6, 0xa

    invoke-direct {v5, v6}, LP/c0;-><init>(I)V

    .line 37
    invoke-virtual {v0, v5}, LP/o;->d0(Ljava/lang/Object;)V

    goto :goto_6

    :cond_d
    move/from16 v21, v6

    .line 38
    :goto_6
    check-cast v5, LP/c0;

    .line 39
    sget-object v6, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:LP/z;

    .line 40
    invoke-virtual {v0, v6}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    move-result-object v6

    .line 41
    check-cast v6, Landroid/content/res/Configuration;

    .line 42
    iget v6, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    move-object/from16 v22, v5

    .line 43
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_e

    .line 44
    invoke-static/range {v18 .. v18}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    move-result-object v5

    .line 45
    invoke-virtual {v0, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 46
    :cond_e
    check-cast v5, LP/W;

    move-object/from16 v23, v5

    .line 47
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_f

    .line 48
    invoke-static/range {v18 .. v18}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    move-result-object v5

    .line 49
    invoke-virtual {v0, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 50
    :cond_f
    check-cast v5, LP/W;

    move-object/from16 v24, v5

    .line 51
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_10

    .line 52
    const-string v5, "#000000"

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    move-object/from16 v26, v9

    move-object/from16 v25, v10

    invoke-static {v5}, Lj0/B;->b(I)J

    move-result-wide v9

    .line 53
    new-instance v5, Lj0/o;

    invoke-direct {v5, v9, v10}, Lj0/o;-><init>(J)V

    .line 54
    invoke-static {v5}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    move-result-object v5

    .line 55
    invoke-virtual {v0, v5}, LP/o;->d0(Ljava/lang/Object;)V

    goto :goto_7

    :cond_10
    move-object/from16 v26, v9

    move-object/from16 v25, v10

    .line 56
    :goto_7
    check-cast v5, LP/W;

    if-eqz v4, :cond_11

    .line 57
    iget-object v9, v4, LZ4/M;->e:LP5/S;

    goto :goto_8

    :cond_11
    move-object/from16 v9, v18

    :goto_8
    if-nez v9, :cond_12

    const v9, -0x55dacfa1

    .line 58
    invoke-virtual {v0, v9}, LP/o;->S(I)V

    const/4 v10, 0x0

    .line 59
    invoke-virtual {v0, v10}, LP/o;->p(Z)V

    move-object/from16 v27, v18

    goto :goto_9

    :cond_12
    const v10, -0x5d9bb41e

    .line 60
    invoke-virtual {v0, v10}, LP/o;->S(I)V

    invoke-static {v9, v0}, LP/b;->j(LP5/P;LP/o;)LP/W;

    move-result-object v9

    const/4 v10, 0x0

    .line 61
    invoke-virtual {v0, v10}, LP/o;->p(Z)V

    move-object/from16 v27, v9

    .line 62
    :goto_9
    invoke-interface {v13}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 63
    invoke-virtual {v0, v13}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v17

    invoke-virtual {v0, v3}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v28

    or-int v17, v17, v28

    invoke-virtual {v0, v4}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v28

    or-int v17, v17, v28

    invoke-virtual {v0, v6}, LP/o;->e(I)Z

    move-result v28

    or-int v17, v17, v28

    .line 64
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v10

    if-nez v17, :cond_14

    if-ne v10, v8, :cond_13

    goto :goto_a

    :cond_13
    move-object v13, v4

    move-object/from16 v17, v5

    move-object v14, v7

    move-object v2, v9

    move-object/from16 v16, v12

    move-object/from16 v11, v22

    move-object/from16 v12, v23

    move-object/from16 v22, v1

    move-object v1, v8

    goto :goto_b

    .line 65
    :cond_14
    :goto_a
    new-instance v3, LZ4/H;

    move-object v10, v8

    move-object v8, v14

    move-object/from16 v14, v19

    const/16 v19, 0x0

    move-object/from16 v17, v5

    move-object v2, v9

    move-object v9, v15

    move-object/from16 v15, v22

    move-object/from16 v18, v23

    move-object/from16 v16, v26

    move-object/from16 v5, p2

    move-object/from16 v22, v1

    move-object v1, v10

    move-object v10, v7

    move-object v7, v11

    move v11, v6

    move-object v6, v4

    move-object v4, v13

    move-object v13, v12

    move-object/from16 v12, v24

    invoke-direct/range {v3 .. v19}, LZ4/H;-><init>(LP/W;Lcom/web2native/MainActivity;LZ4/M;LP/W;LP/W;LP/W;LP/W;ILP/W;LP/W;LP/W;LP/c0;LP/W;LP/W;LP/W;Lq5/c;)V

    move-object/from16 v19, v14

    move-object v11, v15

    move-object/from16 v12, v18

    move-object v15, v9

    move-object v14, v10

    move-object/from16 v16, v13

    move-object v13, v6

    .line 66
    invoke-virtual {v0, v3}, LP/o;->d0(Ljava/lang/Object;)V

    move-object v10, v3

    .line 67
    :goto_b
    check-cast v10, LB5/e;

    invoke-static {v10, v0, v2}, LP/b;->e(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 68
    invoke-interface {v14}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const v3, -0x5617aef0

    if-eqz v2, :cond_3d

    const v2, -0x55af6965

    .line 69
    invoke-virtual {v0, v2}, LP/o;->S(I)V

    .line 70
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_15

    .line 71
    invoke-static {}, Landroidx/compose/foundation/layout/c;->h()Lc0/m;

    move-result-object v2

    invoke-static {v2}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    move-result-object v2

    .line 72
    invoke-virtual {v0, v2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 73
    :cond_15
    check-cast v2, LP/W;

    .line 74
    invoke-interface/range {v26 .. v26}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    move-object/from16 v5, v25

    .line 75
    invoke-static {v4, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_19

    const v4, -0x55af1045

    invoke-virtual {v0, v4}, LP/o;->S(I)V

    .line 76
    invoke-interface {v15}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LZ4/o;

    if-eqz v4, :cond_16

    .line 77
    iget-object v4, v4, LZ4/o;->c:LZ4/f;

    if-eqz v4, :cond_16

    .line 78
    iget-object v4, v4, LZ4/f;->d:LZ4/l;

    if-eqz v4, :cond_16

    .line 79
    iget-object v4, v4, LZ4/l;->b:Ljava/lang/String;

    goto :goto_c

    :cond_16
    const/4 v4, 0x0

    .line 80
    :goto_c
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 81
    invoke-interface/range {v16 .. v16}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    move-object/from16 v25, v5

    move-object v5, v6

    .line 82
    invoke-static/range {v17 .. v17}, LZ4/L;->f(LP/W;)J

    move-result-wide v6

    .line 83
    invoke-virtual {v0, v13}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v8

    .line 84
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_17

    if-ne v9, v1, :cond_18

    .line 85
    :cond_17
    new-instance v9, LR4/y2;

    const/4 v8, 0x2

    invoke-direct {v9, v13, v2, v12, v8}, LR4/y2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 86
    invoke-virtual {v0, v9}, LP/o;->d0(Ljava/lang/Object;)V

    .line 87
    :cond_18
    move-object v8, v9

    check-cast v8, LB5/c;

    and-int/lit8 v10, v21, 0xe

    move-object/from16 v3, p0

    move-object v9, v0

    move-object/from16 v0, v25

    .line 88
    invoke-static/range {v3 .. v10}, LZ4/L;->c(Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;JLB5/c;LP/o;I)V

    move-object v10, v9

    const/4 v3, 0x0

    .line 89
    invoke-virtual {v10, v3}, LP/o;->p(Z)V

    const/4 v3, 0x1

    goto :goto_d

    :cond_19
    move-object v10, v0

    move-object v0, v5

    const/4 v3, 0x0

    const v4, -0x55a90207

    .line 90
    invoke-virtual {v10, v4}, LP/o;->S(I)V

    .line 91
    invoke-virtual {v10, v3}, LP/o;->p(Z)V

    const/4 v3, 0x1

    if-eqz v13, :cond_1a

    .line 92
    invoke-virtual {v13, v3}, LZ4/M;->c(Z)V

    :cond_1a
    :goto_d
    if-eqz v27, :cond_1b

    .line 93
    invoke-interface/range {v27 .. v27}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    goto :goto_e

    :cond_1b
    const/4 v4, 0x0

    :goto_e
    if-eqz v4, :cond_3c

    const v4, -0x55a5b1c4

    invoke-virtual {v10, v4}, LP/o;->S(I)V

    .line 94
    invoke-interface/range {v16 .. v16}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 95
    const-string v5, "FULL_SCREEN"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1c

    .line 96
    iget-object v4, v13, LZ4/M;->f:LP5/S;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v7, 0x0

    .line 97
    invoke-virtual {v4, v7, v6}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_f

    :cond_1c
    const/4 v7, 0x0

    .line 98
    :goto_f
    sget-object v4, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 99
    const-string v6, "#88222222"

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-static {v6}, Lj0/B;->b(I)J

    move-result-wide v8

    .line 100
    sget-object v6, Lj0/B;->a:LO3/D;

    invoke-static {v4, v8, v9, v6}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    move-result-object v8

    .line 101
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_1d

    .line 102
    sget-object v9, LZ4/I;->q:LZ4/I;

    invoke-virtual {v10, v9}, LP/o;->d0(Ljava/lang/Object;)V

    .line 103
    :cond_1d
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    sget-object v3, Lm5/y;->a:Lm5/y;

    invoke-static {v8, v3, v9}, Lv0/u;->a(Lc0/m;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lc0/m;

    move-result-object v8

    .line 104
    sget-object v9, Lc0/b;->q:Lc0/e;

    move-object/from16 v23, v2

    const/4 v7, 0x0

    .line 105
    invoke-static {v9, v7}, LA/n;->d(Lc0/e;Z)Lz0/C;

    move-result-object v2

    .line 106
    iget v7, v10, LP/o;->P:I

    move-object/from16 v25, v9

    .line 107
    invoke-virtual {v10}, LP/o;->m()LP/i0;

    move-result-object v9

    .line 108
    invoke-static {v10, v8}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    move-result-object v8

    .line 109
    sget-object v27, LB0/k;->a:LB0/j;

    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v27, v11

    .line 110
    sget-object v11, LB0/j;->b:LB0/D;

    .line 111
    invoke-virtual {v10}, LP/o;->W()V

    move-object/from16 v29, v12

    .line 112
    iget-boolean v12, v10, LP/o;->O:Z

    if-eqz v12, :cond_1e

    .line 113
    invoke-virtual {v10, v11}, LP/o;->l(LB5/a;)V

    goto :goto_10

    .line 114
    :cond_1e
    invoke-virtual {v10}, LP/o;->g0()V

    .line 115
    :goto_10
    sget-object v12, LB0/j;->e:LB0/i;

    .line 116
    invoke-static {v12, v10, v2}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 117
    sget-object v2, LB0/j;->d:LB0/i;

    .line 118
    invoke-static {v2, v10, v9}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 119
    sget-object v9, LB0/j;->f:LB0/i;

    move-object/from16 v30, v0

    .line 120
    iget-boolean v0, v10, LP/o;->O:Z

    if-nez v0, :cond_1f

    .line 121
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v31, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_11

    :cond_1f
    move-object/from16 v31, v3

    .line 122
    :goto_11
    invoke-static {v7, v10, v7, v9}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 123
    :cond_20
    sget-object v0, LB0/j;->c:LB0/i;

    .line 124
    invoke-static {v0, v10, v8}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 125
    invoke-interface/range {v16 .. v16}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 126
    invoke-static {v3, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_21

    .line 127
    invoke-static/range {v17 .. v17}, LZ4/L;->f(LP/W;)J

    move-result-wide v7

    .line 128
    invoke-static {v4, v7, v8, v6}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    move-result-object v3

    .line 129
    invoke-virtual/range {v27 .. v27}, LP/c0;->e()I

    move-result v4

    int-to-float v4, v4

    .line 130
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/b;->a(Lc0/m;F)Lc0/m;

    move-result-object v3

    goto :goto_12

    .line 131
    :cond_21
    invoke-virtual/range {v27 .. v27}, LP/c0;->e()I

    move-result v3

    int-to-float v3, v3

    .line 132
    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/b;->a(Lc0/m;F)Lc0/m;

    move-result-object v3

    .line 133
    :goto_12
    invoke-interface/range {v16 .. v16}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    move-object/from16 v6, v22

    .line 134
    invoke-static {v4, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_23

    .line 135
    invoke-interface/range {v19 .. v19}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 136
    const-string v6, "LEFT"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_22

    sget-object v4, Lc0/b;->w:Lc0/e;

    :goto_13
    const/4 v7, 0x0

    goto :goto_14

    :cond_22
    sget-object v4, Lc0/b;->y:Lc0/e;

    goto :goto_13

    .line 137
    :cond_23
    const-string v6, "FULL_WIDTH"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_24

    sget-object v4, Lc0/b;->x:Lc0/e;

    goto :goto_13

    :cond_24
    move-object/from16 v4, v20

    goto :goto_13

    .line 138
    :goto_14
    invoke-static {v4, v7}, LA/n;->d(Lc0/e;Z)Lz0/C;

    move-result-object v4

    .line 139
    iget v6, v10, LP/o;->P:I

    .line 140
    invoke-virtual {v10}, LP/o;->m()LP/i0;

    move-result-object v7

    .line 141
    invoke-static {v10, v3}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    move-result-object v3

    .line 142
    invoke-virtual {v10}, LP/o;->W()V

    .line 143
    iget-boolean v8, v10, LP/o;->O:Z

    if-eqz v8, :cond_25

    .line 144
    invoke-virtual {v10, v11}, LP/o;->l(LB5/a;)V

    goto :goto_15

    .line 145
    :cond_25
    invoke-virtual {v10}, LP/o;->g0()V

    .line 146
    :goto_15
    invoke-static {v12, v10, v4}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 147
    invoke-static {v2, v10, v7}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 148
    iget-boolean v4, v10, LP/o;->O:Z

    if-nez v4, :cond_26

    .line 149
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_27

    .line 150
    :cond_26
    invoke-static {v6, v10, v6, v9}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 151
    :cond_27
    invoke-static {v0, v10, v3}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 152
    invoke-interface/range {v29 .. v29}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc0/m;

    .line 153
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    .line 154
    invoke-virtual {v10, v4}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v10, v13}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    .line 155
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_28

    if-ne v7, v1, :cond_29

    .line 156
    :cond_28
    new-instance v7, LZ4/J;

    invoke-direct {v7, v15, v4, v13, v14}, LZ4/J;-><init>(LP/W;Landroid/webkit/WebView;LZ4/M;LP/W;)V

    .line 157
    invoke-virtual {v10, v7}, LP/o;->d0(Ljava/lang/Object;)V

    .line 158
    :cond_29
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    move-object/from16 v6, v31

    invoke-static {v3, v6, v7}, Lv0/u;->a(Lc0/m;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lc0/m;

    move-result-object v3

    move-object/from16 v6, v20

    const/4 v7, 0x0

    .line 159
    invoke-static {v6, v7}, LA/n;->d(Lc0/e;Z)Lz0/C;

    move-result-object v6

    .line 160
    iget v7, v10, LP/o;->P:I

    .line 161
    invoke-virtual {v10}, LP/o;->m()LP/i0;

    move-result-object v8

    .line 162
    invoke-static {v10, v3}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    move-result-object v3

    .line 163
    invoke-virtual {v10}, LP/o;->W()V

    .line 164
    iget-boolean v4, v10, LP/o;->O:Z

    if-eqz v4, :cond_2a

    .line 165
    invoke-virtual {v10, v11}, LP/o;->l(LB5/a;)V

    goto :goto_16

    .line 166
    :cond_2a
    invoke-virtual {v10}, LP/o;->g0()V

    .line 167
    :goto_16
    invoke-static {v12, v10, v6}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 168
    invoke-static {v2, v10, v8}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 169
    iget-boolean v4, v10, LP/o;->O:Z

    if-nez v4, :cond_2b

    .line 170
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2c

    .line 171
    :cond_2b
    invoke-static {v7, v10, v7, v9}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 172
    :cond_2c
    invoke-static {v0, v10, v3}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 173
    invoke-interface/range {v26 .. v26}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v4, v30

    .line 174
    invoke-static {v3, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2e

    const v3, -0x61c92932

    invoke-virtual {v10, v3}, LP/o;->S(I)V

    .line 175
    invoke-interface {v15}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZ4/o;

    if-eqz v3, :cond_2d

    .line 176
    iget-object v3, v3, LZ4/o;->c:LZ4/f;

    if-eqz v3, :cond_2d

    .line 177
    iget-object v3, v3, LZ4/f;->d:LZ4/l;

    if-eqz v3, :cond_2d

    .line 178
    iget-object v3, v3, LZ4/l;->b:Ljava/lang/String;

    goto :goto_17

    :cond_2d
    const/4 v3, 0x0

    .line 179
    :goto_17
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    invoke-static {v3, v10}, Lu2/u;->e(Ljava/lang/Object;LP/o;)Lu2/n;

    move-result-object v3

    .line 180
    invoke-interface/range {v23 .. v23}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc0/m;

    move-object v6, v11

    const/16 v11, 0x6030

    move-object v7, v12

    const/16 v12, 0x68

    move-object v8, v5

    move-object v5, v4

    const/4 v4, 0x0

    move-object/from16 v17, v6

    const/4 v6, 0x0

    move-object/from16 v19, v7

    .line 181
    sget-object v7, Lz0/i;->d:Lz0/F;

    move-object/from16 v20, v8

    const/4 v8, 0x0

    move-object/from16 v21, v9

    const/4 v9, 0x0

    move-object/from16 v13, p1

    move-object/from16 v18, v0

    move-object/from16 v32, v19

    move-object/from16 v33, v21

    const/4 v0, 0x1

    const/16 v22, 0x0

    move-object/from16 v19, v2

    move-object/from16 v2, v20

    move-object/from16 v20, v17

    invoke-static/range {v3 .. v12}, LD5/a;->c(Lo0/b;Ljava/lang/String;Lc0/m;Lc0/e;Lz0/j;FLj0/j;LP/o;II)V

    const/4 v7, 0x0

    .line 182
    invoke-virtual {v10, v7}, LP/o;->p(Z)V

    move-object/from16 v4, p3

    goto :goto_18

    :cond_2e
    move-object/from16 v13, p1

    move-object/from16 v18, v0

    move-object/from16 v19, v2

    move-object v2, v5

    move-object/from16 v33, v9

    move-object/from16 v20, v11

    move-object/from16 v32, v12

    const/4 v0, 0x1

    const/16 v22, 0x0

    const v3, -0x61c26cb3

    .line 183
    invoke-virtual {v10, v3}, LP/o;->S(I)V

    .line 184
    invoke-interface/range {v24 .. v24}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    .line 185
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 186
    invoke-interface/range {v16 .. v16}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/lang/String;

    .line 187
    invoke-static/range {v17 .. v17}, LZ4/L;->f(LP/W;)J

    move-result-wide v6

    .line 188
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_2f

    .line 189
    new-instance v3, LU4/m;

    const/4 v8, 0x3

    move-object/from16 v12, v29

    invoke-direct {v3, v12, v8}, LU4/m;-><init>(LP/W;I)V

    .line 190
    invoke-virtual {v10, v3}, LP/o;->d0(Ljava/lang/Object;)V

    .line 191
    :cond_2f
    move-object v9, v3

    check-cast v9, LB5/c;

    const/high16 v3, 0x30000

    and-int/lit8 v8, v21, 0xe

    or-int/2addr v3, v8

    const v8, 0xe000

    shl-int/lit8 v11, v21, 0x3

    and-int/2addr v8, v11

    or-int v11, v3, v8

    move-object/from16 v3, p0

    move-object/from16 v8, p3

    invoke-static/range {v3 .. v11}, LZ4/L;->g(Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;JLZ4/M;LB5/c;LP/o;I)V

    move-object v4, v8

    const/4 v7, 0x0

    .line 192
    invoke-virtual {v10, v7}, LP/o;->p(Z)V

    .line 193
    :goto_18
    invoke-interface {v15}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZ4/o;

    if-eqz v3, :cond_30

    .line 194
    iget-object v3, v3, LZ4/o;->b:LZ4/c;

    if-eqz v3, :cond_30

    .line 195
    iget-object v12, v3, LZ4/c;->b:LZ4/i;

    goto :goto_19

    :cond_30
    move-object/from16 v12, v22

    .line 196
    :goto_19
    invoke-virtual {v10, v13}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v10, v4}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    .line 197
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_31

    if-ne v5, v1, :cond_32

    .line 198
    :cond_31
    new-instance v5, LZ4/z;

    invoke-direct {v5, v15, v13, v4, v14}, LZ4/z;-><init>(LP/W;Landroid/webkit/WebView;LZ4/M;LP/W;)V

    .line 199
    invoke-virtual {v10, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 200
    :cond_32
    check-cast v5, LB5/a;

    const/4 v7, 0x0

    invoke-static {v12, v5, v10, v7}, LZ4/L;->a(LZ4/i;LB5/a;LP/o;I)V

    .line 201
    invoke-interface/range {v16 .. v16}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 202
    invoke-static {v3, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_35

    const v3, -0x61b4c345

    invoke-virtual {v10, v3}, LP/o;->S(I)V

    .line 203
    invoke-interface {v15}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZ4/o;

    .line 204
    invoke-virtual {v10, v4}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v5

    .line 205
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_33

    if-ne v6, v1, :cond_34

    .line 206
    :cond_33
    new-instance v6, LZ4/A;

    const/4 v5, 0x0

    invoke-direct {v6, v4, v14, v5}, LZ4/A;-><init>(LZ4/M;LP/W;I)V

    .line 207
    invoke-virtual {v10, v6}, LP/o;->d0(Ljava/lang/Object;)V

    .line 208
    :cond_34
    check-cast v6, LB5/a;

    const/4 v7, 0x0

    invoke-static {v3, v6, v10, v7}, LZ4/L;->b(LZ4/o;LB5/a;LP/o;I)V

    .line 209
    :goto_1a
    invoke-virtual {v10, v7}, LP/o;->p(Z)V

    goto :goto_1b

    :cond_35
    const/4 v7, 0x0

    const v3, -0x625e07f1

    .line 210
    invoke-virtual {v10, v3}, LP/o;->S(I)V

    goto :goto_1a

    .line 211
    :goto_1b
    invoke-virtual {v10, v0}, LP/o;->p(Z)V

    .line 212
    invoke-interface/range {v16 .. v16}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 213
    invoke-static {v3, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3b

    const v2, -0xb2c6c86

    invoke-virtual {v10, v2}, LP/o;->S(I)V

    move-object/from16 v2, v25

    .line 214
    invoke-static {v2, v7}, LA/n;->d(Lc0/e;Z)Lz0/C;

    move-result-object v2

    .line 215
    iget v3, v10, LP/o;->P:I

    .line 216
    invoke-virtual {v10}, LP/o;->m()LP/i0;

    move-result-object v5

    .line 217
    sget-object v6, Lc0/j;->q:Lc0/j;

    invoke-static {v10, v6}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    move-result-object v6

    .line 218
    invoke-virtual {v10}, LP/o;->W()V

    .line 219
    iget-boolean v7, v10, LP/o;->O:Z

    if-eqz v7, :cond_36

    move-object/from16 v7, v20

    .line 220
    invoke-virtual {v10, v7}, LP/o;->l(LB5/a;)V

    :goto_1c
    move-object/from16 v7, v32

    goto :goto_1d

    .line 221
    :cond_36
    invoke-virtual {v10}, LP/o;->g0()V

    goto :goto_1c

    .line 222
    :goto_1d
    invoke-static {v7, v10, v2}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    move-object/from16 v2, v19

    .line 223
    invoke-static {v2, v10, v5}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 224
    iget-boolean v2, v10, LP/o;->O:Z

    if-nez v2, :cond_37

    .line 225
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_38

    :cond_37
    move-object/from16 v2, v33

    goto :goto_1f

    :cond_38
    :goto_1e
    move-object/from16 v2, v18

    goto :goto_20

    .line 226
    :goto_1f
    invoke-static {v3, v10, v3, v2}, Lk1/i;->o(ILP/o;ILB0/i;)V

    goto :goto_1e

    .line 227
    :goto_20
    invoke-static {v2, v10, v6}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 228
    invoke-interface {v15}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LZ4/o;

    .line 229
    invoke-virtual {v10, v4}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v3

    .line 230
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_39

    if-ne v5, v1, :cond_3a

    .line 231
    :cond_39
    new-instance v5, LZ4/A;

    const/4 v1, 0x1

    invoke-direct {v5, v4, v14, v1}, LZ4/A;-><init>(LZ4/M;LP/W;I)V

    .line 232
    invoke-virtual {v10, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 233
    :cond_3a
    check-cast v5, LB5/a;

    const/4 v7, 0x0

    invoke-static {v2, v5, v10, v7}, LZ4/L;->b(LZ4/o;LB5/a;LP/o;I)V

    .line 234
    invoke-virtual {v10, v0}, LP/o;->p(Z)V

    .line 235
    :goto_21
    invoke-virtual {v10, v7}, LP/o;->p(Z)V

    goto :goto_22

    :cond_3b
    const v1, -0xbdd0417

    .line 236
    invoke-virtual {v10, v1}, LP/o;->S(I)V

    goto :goto_21

    .line 237
    :goto_22
    invoke-virtual {v10, v0}, LP/o;->p(Z)V

    .line 238
    invoke-virtual {v10, v0}, LP/o;->p(Z)V

    .line 239
    :goto_23
    invoke-virtual {v10, v7}, LP/o;->p(Z)V

    goto :goto_24

    :cond_3c
    move-object v4, v13

    const v0, -0x5617aef0

    const/4 v7, 0x0

    move-object/from16 v13, p1

    .line 240
    invoke-virtual {v10, v0}, LP/o;->S(I)V

    goto :goto_23

    .line 241
    :goto_24
    invoke-virtual {v10, v7}, LP/o;->p(Z)V

    goto :goto_25

    :cond_3d
    move-object v10, v0

    move v0, v3

    move-object v4, v13

    const/4 v7, 0x0

    move-object/from16 v13, p1

    .line 242
    invoke-virtual {v10, v0}, LP/o;->S(I)V

    goto :goto_24

    :cond_3e
    move-object v10, v0

    move-object v13, v2

    .line 243
    invoke-virtual {v10}, LP/o;->N()V

    .line 244
    :goto_25
    invoke-virtual {v10}, LP/o;->r()LP/o0;

    move-result-object v6

    if-eqz v6, :cond_3f

    new-instance v0, LU4/Q;

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v5, p5

    move-object v2, v13

    invoke-direct/range {v0 .. v5}, LU4/Q;-><init>(Lcom/web2native/MainActivity;Landroid/webkit/WebView;Lcom/web2native/MainActivity;LZ4/M;I)V

    .line 245
    iput-object v0, v6, LP/o0;->d:LB5/e;

    :cond_3f
    return-void
.end method

.method public static final e(LP/W;Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final f(LP/W;)J
    .locals 2

    .line 1
    invoke-interface {p0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lj0/o;

    .line 6
    .line 7
    iget-wide v0, p0, Lj0/o;->a:J

    .line 8
    .line 9
    return-wide v0
.end method

.method public static final g(Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;JLZ4/M;LB5/c;LP/o;I)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p5

    .line 4
    .line 5
    move-object/from16 v10, p7

    .line 6
    .line 7
    move/from16 v0, p8

    .line 8
    .line 9
    const v2, 0xc003c17

    .line 10
    .line 11
    .line 12
    invoke-virtual {v10, v2}, LP/o;->U(I)LP/o;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v10, v1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v3

    .line 25
    :goto_0
    or-int/2addr v2, v0

    .line 26
    move-object/from16 v4, p1

    .line 27
    .line 28
    invoke-virtual {v10, v4}, LP/o;->g(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    const/16 v5, 0x20

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/16 v5, 0x10

    .line 38
    .line 39
    :goto_1
    or-int/2addr v2, v5

    .line 40
    move-object/from16 v13, p2

    .line 41
    .line 42
    invoke-virtual {v10, v13}, LP/o;->g(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    const/16 v5, 0x100

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v5, 0x80

    .line 52
    .line 53
    :goto_2
    or-int/2addr v2, v5

    .line 54
    move-wide/from16 v7, p3

    .line 55
    .line 56
    invoke-virtual {v10, v7, v8}, LP/o;->f(J)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_3

    .line 61
    .line 62
    const/16 v5, 0x800

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    const/16 v5, 0x400

    .line 66
    .line 67
    :goto_3
    or-int/2addr v2, v5

    .line 68
    and-int/lit16 v5, v0, 0x6000

    .line 69
    .line 70
    if-nez v5, :cond_5

    .line 71
    .line 72
    invoke-virtual {v10, v6}, LP/o;->i(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_4

    .line 77
    .line 78
    const/16 v5, 0x4000

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_4
    const/16 v5, 0x2000

    .line 82
    .line 83
    :goto_4
    or-int/2addr v2, v5

    .line 84
    :cond_5
    const v5, 0x12493

    .line 85
    .line 86
    .line 87
    and-int/2addr v5, v2

    .line 88
    const v9, 0x12492

    .line 89
    .line 90
    .line 91
    const/4 v11, 0x1

    .line 92
    const/4 v12, 0x0

    .line 93
    if-eq v5, v9, :cond_6

    .line 94
    .line 95
    move v5, v11

    .line 96
    goto :goto_5

    .line 97
    :cond_6
    move v5, v12

    .line 98
    :goto_5
    and-int/2addr v2, v11

    .line 99
    invoke-virtual {v10, v2, v5}, LP/o;->K(IZ)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_e

    .line 104
    .line 105
    sget-object v2, LN1/a;->a:LP/l0;

    .line 106
    .line 107
    invoke-virtual {v10, v2}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Landroidx/lifecycle/x;

    .line 112
    .line 113
    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:LP/z;

    .line 114
    .line 115
    invoke-virtual {v10, v5}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    check-cast v5, Landroid/content/res/Configuration;

    .line 120
    .line 121
    iget v9, v5, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 122
    .line 123
    div-int/2addr v9, v3

    .line 124
    int-to-float v14, v9

    .line 125
    iget v5, v5, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 126
    .line 127
    div-int/2addr v5, v3

    .line 128
    int-to-float v15, v5

    .line 129
    sget-object v3, LC0/t0;->h:LP/T0;

    .line 130
    .line 131
    invoke-virtual {v10, v3}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, LW0/c;

    .line 136
    .line 137
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    sget-object v9, LP/k;->a:LP/S;

    .line 142
    .line 143
    if-ne v5, v9, :cond_7

    .line 144
    .line 145
    new-instance v5, LP/c0;

    .line 146
    .line 147
    invoke-direct {v5, v12}, LP/c0;-><init>(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v10, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_7
    check-cast v5, LP/c0;

    .line 154
    .line 155
    invoke-virtual {v10, v2}, LP/o;->i(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v12

    .line 163
    if-nez v11, :cond_8

    .line 164
    .line 165
    if-ne v12, v9, :cond_9

    .line 166
    .line 167
    :cond_8
    new-instance v12, LN5/d;

    .line 168
    .line 169
    const/16 v11, 0x8

    .line 170
    .line 171
    invoke-direct {v12, v11, v2, v5}, LN5/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v10, v12}, LP/o;->d0(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_9
    check-cast v12, LB5/c;

    .line 178
    .line 179
    invoke-static {v2, v12, v10}, LP/b;->c(Ljava/lang/Object;LB5/c;LP/o;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v5}, LP/c0;->e()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    invoke-virtual {v10, v2}, LP/o;->e(I)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    if-nez v2, :cond_a

    .line 195
    .line 196
    if-ne v5, v9, :cond_b

    .line 197
    .line 198
    :cond_a
    new-instance v2, Landroid/widget/VideoView;

    .line 199
    .line 200
    invoke-direct {v2, v1}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V

    .line 201
    .line 202
    .line 203
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    invoke-virtual {v2, v5}, Landroid/view/View;->setId(I)V

    .line 208
    .line 209
    .line 210
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-virtual {v2, v5}, Landroid/widget/VideoView;->setVideoURI(Landroid/net/Uri;)V

    .line 215
    .line 216
    .line 217
    new-instance v11, LZ4/B;

    .line 218
    .line 219
    move-object/from16 v19, p6

    .line 220
    .line 221
    move-object/from16 v18, v2

    .line 222
    .line 223
    move-object v12, v3

    .line 224
    move-wide/from16 v16, v7

    .line 225
    .line 226
    invoke-direct/range {v11 .. v19}, LZ4/B;-><init>(LW0/c;Ljava/lang/String;FFJLandroid/widget/VideoView;LB5/c;)V

    .line 227
    .line 228
    .line 229
    move-object/from16 v5, v18

    .line 230
    .line 231
    invoke-virtual {v5, v11}, Landroid/widget/VideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 232
    .line 233
    .line 234
    new-instance v2, LZ4/C;

    .line 235
    .line 236
    invoke-direct {v2, v6}, LZ4/C;-><init>(LZ4/M;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5, v2}, Landroid/widget/VideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 240
    .line 241
    .line 242
    new-instance v2, LZ4/v;

    .line 243
    .line 244
    invoke-direct {v2, v5}, LZ4/v;-><init>(Landroid/widget/VideoView;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v5, v2}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v10, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :cond_b
    check-cast v5, Landroid/widget/VideoView;

    .line 254
    .line 255
    invoke-virtual {v10, v5}, LP/o;->i(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    if-nez v2, :cond_c

    .line 264
    .line 265
    if-ne v3, v9, :cond_d

    .line 266
    .line 267
    :cond_c
    new-instance v3, LJ5/i;

    .line 268
    .line 269
    const/4 v2, 0x7

    .line 270
    invoke-direct {v3, v2, v5}, LJ5/i;-><init>(ILjava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v10, v3}, LP/o;->d0(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    :cond_d
    move-object v7, v3

    .line 277
    check-cast v7, LB5/c;

    .line 278
    .line 279
    const/4 v11, 0x0

    .line 280
    const/4 v12, 0x6

    .line 281
    const/4 v8, 0x0

    .line 282
    const/4 v9, 0x0

    .line 283
    invoke-static/range {v7 .. v12}, Landroidx/compose/ui/viewinterop/a;->b(LB5/c;Lc0/m;LB5/c;LP/o;II)V

    .line 284
    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_e
    invoke-virtual/range {p7 .. p7}, LP/o;->N()V

    .line 288
    .line 289
    .line 290
    :goto_6
    invoke-virtual/range {p7 .. p7}, LP/o;->r()LP/o0;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    if-eqz v9, :cond_f

    .line 295
    .line 296
    new-instance v0, LZ4/w;

    .line 297
    .line 298
    move-object/from16 v3, p2

    .line 299
    .line 300
    move-object/from16 v7, p6

    .line 301
    .line 302
    move/from16 v8, p8

    .line 303
    .line 304
    move-object v2, v4

    .line 305
    move-wide/from16 v4, p3

    .line 306
    .line 307
    invoke-direct/range {v0 .. v8}, LZ4/w;-><init>(Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;JLZ4/M;LB5/c;I)V

    .line 308
    .line 309
    .line 310
    iput-object v0, v9, LP/o0;->d:LB5/e;

    .line 311
    .line 312
    :cond_f
    return-void
.end method
