.class public final Lx/e;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:Lkotlin/jvm/internal/v;

.field public r:I

.field public final synthetic s:Lx/h;

.field public final synthetic t:F

.field public final synthetic u:LB5/c;

.field public final synthetic v:Lw/i0;


# direct methods
.method public constructor <init>(Lx/h;FLB5/c;Lw/i0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx/e;->s:Lx/h;

    .line 2
    .line 3
    iput p2, p0, Lx/e;->t:F

    .line 4
    .line 5
    iput-object p3, p0, Lx/e;->u:LB5/c;

    .line 6
    .line 7
    iput-object p4, p0, Lx/e;->v:Lw/i0;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ls5/i;-><init>(ILq5/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, Lx/e;

    .line 2
    .line 3
    iget-object v3, p0, Lx/e;->u:LB5/c;

    .line 4
    .line 5
    iget-object v4, p0, Lx/e;->v:Lw/i0;

    .line 6
    .line 7
    iget-object v1, p0, Lx/e;->s:Lx/h;

    .line 8
    .line 9
    iget v2, p0, Lx/e;->t:F

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lx/e;-><init>(Lx/h;FLB5/c;Lw/i0;Lq5/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lx/e;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lx/e;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lx/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v0, v5, Lx/e;->s:Lx/h;

    .line 4
    .line 5
    iget-object v6, v0, Lx/h;->a:Lv3/l;

    .line 6
    .line 7
    iget v1, v5, Lx/e;->r:I

    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v8, 0x2

    .line 11
    iget-object v9, v5, Lx/e;->u:LB5/c;

    .line 12
    .line 13
    const/4 v10, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    sget-object v11, Lr5/a;->q:Lr5/a;

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    if-eq v1, v2, :cond_1

    .line 20
    .line 21
    if-ne v1, v8, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :cond_1
    iget-object v1, v5, Lx/e;->q:Lkotlin/jvm/internal/v;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move/from16 v16, v10

    .line 41
    .line 42
    move-object v10, v1

    .line 43
    move-object/from16 v1, p1

    .line 44
    .line 45
    goto/16 :goto_3

    .line 46
    .line 47
    :cond_2
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, v0, Lx/h;->b:Lu/v;

    .line 51
    .line 52
    sget-object v3, Lu/A0;->a:LZ/m;

    .line 53
    .line 54
    new-instance v3, LE/c0;

    .line 55
    .line 56
    iget-object v1, v1, Lu/v;->a:Li3/a;

    .line 57
    .line 58
    invoke-direct {v3, v1}, LE/c0;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance v1, Lu/m;

    .line 62
    .line 63
    invoke-direct {v1, v10}, Lu/m;-><init>(F)V

    .line 64
    .line 65
    .line 66
    new-instance v4, Lu/m;

    .line 67
    .line 68
    iget v12, v5, Lx/e;->t:F

    .line 69
    .line 70
    invoke-direct {v4, v12}, Lu/m;-><init>(F)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v1, v4}, LE/c0;->t(Lu/q;Lu/q;)Lu/q;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Lu/m;

    .line 78
    .line 79
    iget v1, v1, Lu/m;->a:F

    .line 80
    .line 81
    iget-object v3, v6, Lv3/l;->r:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v3, LF/e;

    .line 84
    .line 85
    invoke-virtual {v3}, LF/N;->m()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    iget-object v13, v3, LF/N;->p:LP/f0;

    .line 90
    .line 91
    invoke-virtual {v13}, LP/f0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v13

    .line 95
    check-cast v13, LF/B;

    .line 96
    .line 97
    iget v13, v13, LF/B;->c:I

    .line 98
    .line 99
    add-int/2addr v13, v4

    .line 100
    if-nez v13, :cond_3

    .line 101
    .line 102
    move v1, v10

    .line 103
    move/from16 v16, v1

    .line 104
    .line 105
    move-object/from16 v17, v11

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    cmpg-float v4, v12, v10

    .line 109
    .line 110
    if-gez v4, :cond_4

    .line 111
    .line 112
    iget v4, v3, LF/N;->e:I

    .line 113
    .line 114
    add-int/2addr v4, v2

    .line 115
    goto :goto_0

    .line 116
    :cond_4
    iget v4, v3, LF/N;->e:I

    .line 117
    .line 118
    :goto_0
    int-to-float v14, v13

    .line 119
    div-float/2addr v1, v14

    .line 120
    float-to-int v1, v1

    .line 121
    add-int/2addr v1, v4

    .line 122
    invoke-virtual {v3}, LF/e;->l()I

    .line 123
    .line 124
    .line 125
    move-result v14

    .line 126
    invoke-static {v1, v7, v14}, LD5/a;->q(III)I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    invoke-virtual {v3}, LF/N;->m()I

    .line 131
    .line 132
    .line 133
    iget-object v14, v3, LF/N;->p:LP/f0;

    .line 134
    .line 135
    invoke-virtual {v14}, LP/f0;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v14

    .line 139
    check-cast v14, LF/B;

    .line 140
    .line 141
    iget v14, v14, LF/B;->c:I

    .line 142
    .line 143
    int-to-long v14, v4

    .line 144
    move/from16 v16, v10

    .line 145
    .line 146
    move-object/from16 v17, v11

    .line 147
    .line 148
    int-to-long v10, v2

    .line 149
    sub-long v18, v14, v10

    .line 150
    .line 151
    const-wide/16 v20, 0x0

    .line 152
    .line 153
    cmp-long v22, v18, v20

    .line 154
    .line 155
    move-object/from16 p1, v3

    .line 156
    .line 157
    if-gez v22, :cond_5

    .line 158
    .line 159
    move-wide/from16 v2, v20

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    move-wide/from16 v2, v18

    .line 163
    .line 164
    :goto_1
    long-to-int v2, v2

    .line 165
    add-long/2addr v14, v10

    .line 166
    const-wide/32 v10, 0x7fffffff

    .line 167
    .line 168
    .line 169
    cmp-long v3, v14, v10

    .line 170
    .line 171
    if-lez v3, :cond_6

    .line 172
    .line 173
    move-wide v14, v10

    .line 174
    :cond_6
    long-to-int v3, v14

    .line 175
    invoke-static {v1, v2, v3}, LD5/a;->q(III)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    invoke-virtual/range {p1 .. p1}, LF/e;->l()I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    invoke-static {v1, v7, v2}, LD5/a;->q(III)I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    sub-int/2addr v1, v4

    .line 188
    mul-int/2addr v1, v13

    .line 189
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    sub-int/2addr v1, v13

    .line 194
    if-gez v1, :cond_7

    .line 195
    .line 196
    move v1, v7

    .line 197
    :cond_7
    if-nez v1, :cond_8

    .line 198
    .line 199
    int-to-float v1, v1

    .line 200
    goto :goto_2

    .line 201
    :cond_8
    int-to-float v1, v1

    .line 202
    invoke-static {v12}, Ljava/lang/Math;->signum(F)F

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    mul-float/2addr v1, v2

    .line 207
    :goto_2
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_9

    .line 212
    .line 213
    const-string v2, "calculateApproachOffset returned NaN. Please use a valid value."

    .line 214
    .line 215
    invoke-static {v2}, Lz/a;->c(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    :cond_9
    new-instance v10, Lkotlin/jvm/internal/v;

    .line 219
    .line 220
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    invoke-static {v12}, Ljava/lang/Math;->signum(F)F

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    mul-float/2addr v2, v1

    .line 232
    iput v2, v10, Lkotlin/jvm/internal/v;->q:F

    .line 233
    .line 234
    new-instance v1, Ljava/lang/Float;

    .line 235
    .line 236
    invoke-direct {v1, v2}, Ljava/lang/Float;-><init>(F)V

    .line 237
    .line 238
    .line 239
    invoke-interface {v9, v1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    iget v2, v10, Lkotlin/jvm/internal/v;->q:F

    .line 243
    .line 244
    new-instance v4, Lx/d;

    .line 245
    .line 246
    const/4 v1, 0x1

    .line 247
    invoke-direct {v4, v10, v9, v1}, Lx/d;-><init>(Lkotlin/jvm/internal/v;LB5/c;I)V

    .line 248
    .line 249
    .line 250
    iput-object v10, v5, Lx/e;->q:Lkotlin/jvm/internal/v;

    .line 251
    .line 252
    iput v1, v5, Lx/e;->r:I

    .line 253
    .line 254
    iget-object v1, v5, Lx/e;->v:Lw/i0;

    .line 255
    .line 256
    iget v3, v5, Lx/e;->t:F

    .line 257
    .line 258
    invoke-static/range {v0 .. v5}, Lx/h;->b(Lx/h;Lw/i0;FFLx/d;Ls5/c;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    move-object/from16 v11, v17

    .line 263
    .line 264
    if-ne v1, v11, :cond_a

    .line 265
    .line 266
    goto/16 :goto_a

    .line 267
    .line 268
    :cond_a
    :goto_3
    check-cast v1, Lu/l;

    .line 269
    .line 270
    invoke-virtual {v1}, Lu/l;->b()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    check-cast v2, Ljava/lang/Number;

    .line 275
    .line 276
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    iget-object v3, v6, Lv3/l;->r:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v3, LF/e;

    .line 283
    .line 284
    invoke-virtual {v3}, LF/N;->k()LF/B;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    iget-object v4, v4, LF/B;->m:Lx/m;

    .line 289
    .line 290
    invoke-virtual {v3}, LF/N;->k()LF/B;

    .line 291
    .line 292
    .line 293
    move-result-object v12

    .line 294
    iget-object v12, v12, LF/B;->a:Ljava/util/List;

    .line 295
    .line 296
    move-object v13, v12

    .line 297
    check-cast v13, Ljava/util/Collection;

    .line 298
    .line 299
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 300
    .line 301
    .line 302
    move-result v13

    .line 303
    move v14, v7

    .line 304
    const/high16 p1, -0x800000    # Float.NEGATIVE_INFINITY

    .line 305
    .line 306
    const/high16 v17, -0x800000    # Float.NEGATIVE_INFINITY

    .line 307
    .line 308
    const/high16 v18, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 309
    .line 310
    :goto_4
    if-ge v14, v13, :cond_d

    .line 311
    .line 312
    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v19

    .line 316
    const/high16 v20, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 317
    .line 318
    move-object/from16 v15, v19

    .line 319
    .line 320
    check-cast v15, LF/l;

    .line 321
    .line 322
    invoke-virtual {v3}, LF/N;->k()LF/B;

    .line 323
    .line 324
    .line 325
    move-result-object v19

    .line 326
    invoke-static/range {v19 .. v19}, LQ2/g;->F(LF/B;)I

    .line 327
    .line 328
    .line 329
    invoke-virtual {v3}, LF/N;->k()LF/B;

    .line 330
    .line 331
    .line 332
    move-result-object v8

    .line 333
    iget v8, v8, LF/B;->f:I

    .line 334
    .line 335
    invoke-virtual {v3}, LF/N;->k()LF/B;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    iget v8, v8, LF/B;->d:I

    .line 340
    .line 341
    invoke-virtual {v3}, LF/N;->k()LF/B;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    iget v8, v8, LF/B;->b:I

    .line 346
    .line 347
    iget v8, v15, LF/l;->l:I

    .line 348
    .line 349
    invoke-virtual {v3}, LF/e;->l()I

    .line 350
    .line 351
    .line 352
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    int-to-float v15, v7

    .line 356
    int-to-float v8, v8

    .line 357
    sub-float/2addr v8, v15

    .line 358
    cmpg-float v15, v8, v16

    .line 359
    .line 360
    if-gtz v15, :cond_b

    .line 361
    .line 362
    cmpl-float v15, v8, v17

    .line 363
    .line 364
    if-lez v15, :cond_b

    .line 365
    .line 366
    move/from16 v17, v8

    .line 367
    .line 368
    :cond_b
    cmpl-float v15, v8, v16

    .line 369
    .line 370
    if-ltz v15, :cond_c

    .line 371
    .line 372
    cmpg-float v15, v8, v18

    .line 373
    .line 374
    if-gez v15, :cond_c

    .line 375
    .line 376
    move/from16 v18, v8

    .line 377
    .line 378
    :cond_c
    add-int/lit8 v14, v14, 0x1

    .line 379
    .line 380
    const/4 v8, 0x2

    .line 381
    goto :goto_4

    .line 382
    :cond_d
    const/high16 v20, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 383
    .line 384
    cmpg-float v4, v17, p1

    .line 385
    .line 386
    if-nez v4, :cond_e

    .line 387
    .line 388
    move/from16 v17, v18

    .line 389
    .line 390
    :cond_e
    cmpg-float v4, v18, v20

    .line 391
    .line 392
    if-nez v4, :cond_f

    .line 393
    .line 394
    move/from16 v18, v17

    .line 395
    .line 396
    :cond_f
    invoke-virtual {v3}, LF/N;->c()Z

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    if-nez v4, :cond_11

    .line 401
    .line 402
    invoke-static {v3, v2}, LE3/h;->F(LF/e;F)Z

    .line 403
    .line 404
    .line 405
    move-result v4

    .line 406
    if-eqz v4, :cond_10

    .line 407
    .line 408
    move/from16 v17, v16

    .line 409
    .line 410
    move/from16 v18, v17

    .line 411
    .line 412
    goto :goto_5

    .line 413
    :cond_10
    move/from16 v18, v16

    .line 414
    .line 415
    :cond_11
    :goto_5
    invoke-virtual {v3}, LF/N;->a()Z

    .line 416
    .line 417
    .line 418
    move-result v4

    .line 419
    if-nez v4, :cond_13

    .line 420
    .line 421
    invoke-static {v3, v2}, LE3/h;->F(LF/e;F)Z

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    if-nez v3, :cond_12

    .line 426
    .line 427
    move/from16 v3, v16

    .line 428
    .line 429
    move v4, v3

    .line 430
    goto :goto_7

    .line 431
    :cond_12
    move/from16 v3, v16

    .line 432
    .line 433
    :goto_6
    move/from16 v4, v18

    .line 434
    .line 435
    goto :goto_7

    .line 436
    :cond_13
    move/from16 v3, v17

    .line 437
    .line 438
    goto :goto_6

    .line 439
    :goto_7
    iget-object v6, v6, Lv3/l;->s:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v6, LF/p;

    .line 442
    .line 443
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 448
    .line 449
    .line 450
    move-result-object v8

    .line 451
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 452
    .line 453
    .line 454
    move-result-object v12

    .line 455
    invoke-virtual {v6, v2, v8, v12}, LF/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    check-cast v2, Ljava/lang/Number;

    .line 460
    .line 461
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    cmpg-float v6, v2, v3

    .line 466
    .line 467
    if-nez v6, :cond_14

    .line 468
    .line 469
    goto :goto_8

    .line 470
    :cond_14
    cmpg-float v6, v2, v4

    .line 471
    .line 472
    if-nez v6, :cond_15

    .line 473
    .line 474
    goto :goto_8

    .line 475
    :cond_15
    cmpg-float v6, v2, v16

    .line 476
    .line 477
    if-nez v6, :cond_16

    .line 478
    .line 479
    goto :goto_8

    .line 480
    :cond_16
    new-instance v6, Ljava/lang/StringBuilder;

    .line 481
    .line 482
    const-string v8, "Final Snapping Offset Should Be one of "

    .line 483
    .line 484
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    const-string v3, ", "

    .line 491
    .line 492
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    const-string v3, " or 0.0"

    .line 499
    .line 500
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    invoke-static {v3}, Lz/a;->c(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    :goto_8
    cmpg-float v3, v2, v20

    .line 511
    .line 512
    if-nez v3, :cond_17

    .line 513
    .line 514
    goto :goto_9

    .line 515
    :cond_17
    cmpg-float v3, v2, p1

    .line 516
    .line 517
    if-nez v3, :cond_18

    .line 518
    .line 519
    :goto_9
    move/from16 v2, v16

    .line 520
    .line 521
    :cond_18
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 522
    .line 523
    .line 524
    move-result v3

    .line 525
    if-eqz v3, :cond_19

    .line 526
    .line 527
    const-string v3, "calculateSnapOffset returned NaN. Please use a valid value."

    .line 528
    .line 529
    invoke-static {v3}, Lz/a;->c(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    :cond_19
    iput v2, v10, Lkotlin/jvm/internal/v;->q:F

    .line 533
    .line 534
    const/16 v3, 0x1e

    .line 535
    .line 536
    move/from16 v4, v16

    .line 537
    .line 538
    invoke-static {v1, v4, v4, v3}, Lu/d;->k(Lu/l;FFI)Lu/l;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    iget-object v4, v0, Lx/h;->c:Lu/f0;

    .line 543
    .line 544
    new-instance v0, Lx/d;

    .line 545
    .line 546
    invoke-direct {v0, v10, v9, v7}, Lx/d;-><init>(Lkotlin/jvm/internal/v;LB5/c;I)V

    .line 547
    .line 548
    .line 549
    const/4 v1, 0x0

    .line 550
    iput-object v1, v5, Lx/e;->q:Lkotlin/jvm/internal/v;

    .line 551
    .line 552
    const/4 v1, 0x2

    .line 553
    iput v1, v5, Lx/e;->r:I

    .line 554
    .line 555
    move-object v1, v0

    .line 556
    iget-object v0, v5, Lx/e;->v:Lw/i0;

    .line 557
    .line 558
    move-object v5, v1

    .line 559
    move v1, v2

    .line 560
    move-object/from16 v6, p0

    .line 561
    .line 562
    invoke-static/range {v0 .. v6}, Lx/l;->c(Lw/i0;FFLu/l;Lu/f0;LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    if-ne v0, v11, :cond_1a

    .line 567
    .line 568
    :goto_a
    return-object v11

    .line 569
    :cond_1a
    return-object v0
.end method
