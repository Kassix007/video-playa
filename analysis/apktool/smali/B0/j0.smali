.class public final LB0/j0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LB0/j0;->q:I

    iput-object p3, p0, LB0/j0;->r:Ljava/lang/Object;

    iput-object p4, p0, LB0/j0;->s:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, LB0/j0;->q:I

    iput-object p2, p0, LB0/j0;->r:Ljava/lang/Object;

    iput-object p3, p0, LB0/j0;->s:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LB0/j0;->q:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    sget-object v6, Lm5/y;->a:Lm5/y;

    .line 10
    .line 11
    iget-object v7, v0, LB0/j0;->s:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v8, v0, LB0/j0;->r:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, LP/o;

    .line 21
    .line 22
    move-object/from16 v2, p2

    .line 23
    .line 24
    check-cast v2, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 27
    .line 28
    .line 29
    check-cast v8, Lc0/m;

    .line 30
    .line 31
    check-cast v7, LB5/e;

    .line 32
    .line 33
    invoke-static {v5}, LP/b;->w(I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-static {v8, v7, v1, v2}, Lz0/O;->a(Lc0/m;LB5/e;LP/o;I)V

    .line 38
    .line 39
    .line 40
    return-object v6

    .line 41
    :pswitch_0
    move-object/from16 v1, p1

    .line 42
    .line 43
    check-cast v1, LP/o;

    .line 44
    .line 45
    move-object/from16 v9, p2

    .line 46
    .line 47
    check-cast v9, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    and-int/lit8 v10, v9, 0x3

    .line 54
    .line 55
    if-eq v10, v3, :cond_0

    .line 56
    .line 57
    move v3, v5

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v3, v4

    .line 60
    :goto_0
    and-int/2addr v5, v9

    .line 61
    invoke-virtual {v1, v5, v3}, LP/o;->K(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_6

    .line 66
    .line 67
    check-cast v8, Lz0/r;

    .line 68
    .line 69
    iget-object v3, v8, Lz0/r;->f:LP/f0;

    .line 70
    .line 71
    invoke-virtual {v3}, LP/f0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    check-cast v7, LB5/e;

    .line 82
    .line 83
    invoke-virtual {v1, v3}, LP/o;->V(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v5}, LP/o;->h(Z)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v5, :cond_1

    .line 91
    .line 92
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-interface {v7, v1, v3}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_1
    iget v5, v1, LP/o;->k:I

    .line 101
    .line 102
    if-nez v5, :cond_2

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    const-string v5, "No nodes can be emitted before calling dactivateToEndGroup"

    .line 106
    .line 107
    invoke-static {v5}, LP/p;->c(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :goto_1
    iget-boolean v5, v1, LP/o;->O:Z

    .line 111
    .line 112
    if-nez v5, :cond_4

    .line 113
    .line 114
    if-nez v3, :cond_3

    .line 115
    .line 116
    invoke-virtual {v1}, LP/o;->M()V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    iget-object v3, v1, LP/o;->F:LP/z0;

    .line 121
    .line 122
    iget v5, v3, LP/z0;->g:I

    .line 123
    .line 124
    iget v3, v3, LP/z0;->h:I

    .line 125
    .line 126
    iget-object v7, v1, LP/o;->L:LQ/b;

    .line 127
    .line 128
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7, v4}, LQ/b;->d(Z)V

    .line 132
    .line 133
    .line 134
    iget-object v7, v7, LQ/b;->b:LQ/a;

    .line 135
    .line 136
    iget-object v7, v7, LQ/a;->o:LQ/K;

    .line 137
    .line 138
    sget-object v8, LQ/i;->c:LQ/i;

    .line 139
    .line 140
    invoke-virtual {v7, v8}, LQ/K;->W(LQ/I;)V

    .line 141
    .line 142
    .line 143
    iget-object v7, v1, LP/o;->r:Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-static {v7, v5, v3}, LP/p;->a(Ljava/util/List;II)V

    .line 146
    .line 147
    .line 148
    iget-object v3, v1, LP/o;->F:LP/z0;

    .line 149
    .line 150
    invoke-virtual {v3}, LP/z0;->q()V

    .line 151
    .line 152
    .line 153
    :cond_4
    :goto_2
    iget-boolean v3, v1, LP/o;->x:Z

    .line 154
    .line 155
    if-eqz v3, :cond_5

    .line 156
    .line 157
    iget-object v3, v1, LP/o;->F:LP/z0;

    .line 158
    .line 159
    iget v3, v3, LP/z0;->i:I

    .line 160
    .line 161
    iget v5, v1, LP/o;->y:I

    .line 162
    .line 163
    if-ne v3, v5, :cond_5

    .line 164
    .line 165
    iput v2, v1, LP/o;->y:I

    .line 166
    .line 167
    iput-boolean v4, v1, LP/o;->x:Z

    .line 168
    .line 169
    :cond_5
    invoke-virtual {v1, v4}, LP/o;->p(Z)V

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_6
    invoke-virtual {v1}, LP/o;->N()V

    .line 174
    .line 175
    .line 176
    :goto_3
    return-object v6

    .line 177
    :pswitch_1
    move-object/from16 v1, p1

    .line 178
    .line 179
    check-cast v1, Lv0/l;

    .line 180
    .line 181
    move-object/from16 v2, p2

    .line 182
    .line 183
    check-cast v2, Li0/b;

    .line 184
    .line 185
    iget-wide v2, v2, Li0/b;->a:J

    .line 186
    .line 187
    check-cast v8, LO3/l;

    .line 188
    .line 189
    invoke-static {v8, v1}, Lcom/google/android/gms/internal/measurement/P1;->d(LO3/l;Lv0/l;)V

    .line 190
    .line 191
    .line 192
    check-cast v7, Lw/C;

    .line 193
    .line 194
    iget-object v1, v7, Lw/C;->K:LO5/e;

    .line 195
    .line 196
    if-eqz v1, :cond_7

    .line 197
    .line 198
    new-instance v4, Lw/p;

    .line 199
    .line 200
    invoke-direct {v4, v2, v3}, Lw/p;-><init>(J)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v1, v4}, LO5/w;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    :cond_7
    return-object v6

    .line 207
    :pswitch_2
    move-object/from16 v1, p1

    .line 208
    .line 209
    check-cast v1, LP/o;

    .line 210
    .line 211
    move-object/from16 v2, p2

    .line 212
    .line 213
    check-cast v2, Ljava/lang/Number;

    .line 214
    .line 215
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 216
    .line 217
    .line 218
    check-cast v8, Lc0/m;

    .line 219
    .line 220
    check-cast v7, LB5/c;

    .line 221
    .line 222
    invoke-static {v5}, LP/b;->w(I)I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    invoke-static {v8, v7, v1, v2}, Ln5/A;->b(Lc0/m;LB5/c;LP/o;I)V

    .line 227
    .line 228
    .line 229
    return-object v6

    .line 230
    :pswitch_3
    move-object/from16 v1, p1

    .line 231
    .line 232
    check-cast v1, LP/o;

    .line 233
    .line 234
    move-object/from16 v2, p2

    .line 235
    .line 236
    check-cast v2, Ljava/lang/Number;

    .line 237
    .line 238
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 239
    .line 240
    .line 241
    check-cast v8, Lu/v0;

    .line 242
    .line 243
    invoke-static {v5}, LP/b;->w(I)I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    invoke-virtual {v8, v2, v1, v7}, Lu/v0;->a(ILP/o;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    return-object v6

    .line 251
    :pswitch_4
    move-object/from16 v1, p1

    .line 252
    .line 253
    check-cast v1, Ljava/lang/Number;

    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    move-object/from16 v2, p2

    .line 260
    .line 261
    check-cast v2, LI0/m;

    .line 262
    .line 263
    check-cast v7, Le0/c;

    .line 264
    .line 265
    check-cast v8, LC0/V0;

    .line 266
    .line 267
    iget-object v3, v8, LC0/V0;->b:Lr/w;

    .line 268
    .line 269
    iget v4, v2, LI0/m;->g:I

    .line 270
    .line 271
    invoke-virtual {v3, v4}, Lr/w;->b(I)Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-nez v3, :cond_8

    .line 276
    .line 277
    invoke-virtual {v7, v1, v2}, Le0/c;->m(ILI0/m;)V

    .line 278
    .line 279
    .line 280
    iget-object v1, v7, Le0/c;->x:LO5/e;

    .line 281
    .line 282
    invoke-interface {v1, v6}, LO5/w;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    :cond_8
    return-object v6

    .line 286
    :pswitch_5
    move-object/from16 v1, p1

    .line 287
    .line 288
    check-cast v1, Ljava/lang/Number;

    .line 289
    .line 290
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    move-object/from16 v2, p2

    .line 295
    .line 296
    check-cast v2, Ljava/lang/Number;

    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    check-cast v8, LN/o;

    .line 303
    .line 304
    iget-object v3, v8, LN/o;->a:LN/r;

    .line 305
    .line 306
    iget-object v4, v3, LN/r;->j:LP/b0;

    .line 307
    .line 308
    invoke-virtual {v4, v1}, LP/b0;->f(F)V

    .line 309
    .line 310
    .line 311
    iget-object v3, v3, LN/r;->k:LP/b0;

    .line 312
    .line 313
    invoke-virtual {v3, v2}, LP/b0;->f(F)V

    .line 314
    .line 315
    .line 316
    check-cast v7, Lkotlin/jvm/internal/v;

    .line 317
    .line 318
    iput v1, v7, Lkotlin/jvm/internal/v;->q:F

    .line 319
    .line 320
    return-object v6

    .line 321
    :pswitch_6
    move-object/from16 v1, p1

    .line 322
    .line 323
    check-cast v1, LP/o;

    .line 324
    .line 325
    move-object/from16 v2, p2

    .line 326
    .line 327
    check-cast v2, Ljava/lang/Number;

    .line 328
    .line 329
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 330
    .line 331
    .line 332
    check-cast v8, LL0/F;

    .line 333
    .line 334
    check-cast v7, LX/e;

    .line 335
    .line 336
    invoke-static {v5}, LP/b;->w(I)I

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    invoke-static {v8, v7, v1, v2}, LM/N0;->a(LL0/F;LX/e;LP/o;I)V

    .line 341
    .line 342
    .line 343
    return-object v6

    .line 344
    :pswitch_7
    move-object/from16 v1, p1

    .line 345
    .line 346
    check-cast v1, LP/o;

    .line 347
    .line 348
    move-object/from16 v2, p2

    .line 349
    .line 350
    check-cast v2, Ljava/lang/Number;

    .line 351
    .line 352
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    and-int/lit8 v2, v2, 0x3

    .line 357
    .line 358
    if-ne v2, v3, :cond_a

    .line 359
    .line 360
    invoke-virtual {v1}, LP/o;->x()Z

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    if-nez v2, :cond_9

    .line 365
    .line 366
    goto :goto_4

    .line 367
    :cond_9
    invoke-virtual {v1}, LP/o;->N()V

    .line 368
    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_a
    :goto_4
    check-cast v8, LM/O0;

    .line 372
    .line 373
    iget-object v2, v8, LM/O0;->j:LL0/F;

    .line 374
    .line 375
    check-cast v7, LX/e;

    .line 376
    .line 377
    invoke-static {v2, v7, v1, v4}, LM/N0;->a(LL0/F;LX/e;LP/o;I)V

    .line 378
    .line 379
    .line 380
    :goto_5
    return-object v6

    .line 381
    :pswitch_8
    move-object/from16 v1, p1

    .line 382
    .line 383
    check-cast v1, Ljava/lang/Number;

    .line 384
    .line 385
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    move-object/from16 v2, p2

    .line 390
    .line 391
    check-cast v2, Ljava/lang/Number;

    .line 392
    .line 393
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 394
    .line 395
    .line 396
    check-cast v8, Lkotlin/jvm/internal/v;

    .line 397
    .line 398
    iget v2, v8, Lkotlin/jvm/internal/v;->q:F

    .line 399
    .line 400
    sub-float/2addr v1, v2

    .line 401
    check-cast v7, LF/E;

    .line 402
    .line 403
    iget-object v2, v7, LF/E;->b:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v2, Lw/i0;

    .line 406
    .line 407
    invoke-interface {v2, v1}, Lw/i0;->a(F)F

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    iget v2, v8, Lkotlin/jvm/internal/v;->q:F

    .line 412
    .line 413
    add-float/2addr v2, v1

    .line 414
    iput v2, v8, Lkotlin/jvm/internal/v;->q:F

    .line 415
    .line 416
    return-object v6

    .line 417
    :pswitch_9
    move-object/from16 v1, p1

    .line 418
    .line 419
    check-cast v1, LP/o;

    .line 420
    .line 421
    move-object/from16 v2, p2

    .line 422
    .line 423
    check-cast v2, Ljava/lang/Number;

    .line 424
    .line 425
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    and-int/lit8 v9, v2, 0x3

    .line 430
    .line 431
    if-eq v9, v3, :cond_b

    .line 432
    .line 433
    move v3, v5

    .line 434
    goto :goto_6

    .line 435
    :cond_b
    move v3, v4

    .line 436
    :goto_6
    and-int/2addr v2, v5

    .line 437
    invoke-virtual {v1, v2, v3}, LP/o;->K(IZ)Z

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    if-eqz v2, :cond_c

    .line 442
    .line 443
    check-cast v8, LX/e;

    .line 444
    .line 445
    check-cast v7, LE/W;

    .line 446
    .line 447
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    invoke-virtual {v8, v7, v1, v2}, LX/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    goto :goto_7

    .line 455
    :cond_c
    invoke-virtual {v1}, LP/o;->N()V

    .line 456
    .line 457
    .line 458
    :goto_7
    return-object v6

    .line 459
    :pswitch_a
    move-object/from16 v1, p1

    .line 460
    .line 461
    check-cast v1, Lz0/T;

    .line 462
    .line 463
    move-object/from16 v2, p2

    .line 464
    .line 465
    check-cast v2, LW0/a;

    .line 466
    .line 467
    iget-wide v2, v2, LW0/a;->a:J

    .line 468
    .line 469
    new-instance v4, LE/A;

    .line 470
    .line 471
    check-cast v8, LE/u;

    .line 472
    .line 473
    invoke-direct {v4, v8, v1}, LE/A;-><init>(LE/u;Lz0/T;)V

    .line 474
    .line 475
    .line 476
    check-cast v7, LB5/e;

    .line 477
    .line 478
    new-instance v1, LW0/a;

    .line 479
    .line 480
    invoke-direct {v1, v2, v3}, LW0/a;-><init>(J)V

    .line 481
    .line 482
    .line 483
    invoke-interface {v7, v4, v1}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    check-cast v1, Lz0/D;

    .line 488
    .line 489
    return-object v1

    .line 490
    :pswitch_b
    move-object/from16 v11, p1

    .line 491
    .line 492
    check-cast v11, LP/o;

    .line 493
    .line 494
    move-object/from16 v1, p2

    .line 495
    .line 496
    check-cast v1, Ljava/lang/Number;

    .line 497
    .line 498
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 499
    .line 500
    .line 501
    move-result v1

    .line 502
    check-cast v8, LE/u;

    .line 503
    .line 504
    move-object v13, v7

    .line 505
    check-cast v13, LE/t;

    .line 506
    .line 507
    and-int/lit8 v7, v1, 0x3

    .line 508
    .line 509
    if-eq v7, v3, :cond_d

    .line 510
    .line 511
    move v3, v5

    .line 512
    goto :goto_8

    .line 513
    :cond_d
    move v3, v4

    .line 514
    :goto_8
    and-int/2addr v1, v5

    .line 515
    invoke-virtual {v11, v1, v3}, LP/o;->K(IZ)Z

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    if-eqz v1, :cond_13

    .line 520
    .line 521
    iget-object v1, v8, LE/u;->b:LC/j;

    .line 522
    .line 523
    invoke-virtual {v1}, LC/j;->invoke()Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    move-object v7, v1

    .line 528
    check-cast v7, LE/x;

    .line 529
    .line 530
    iget v1, v13, LE/t;->c:I

    .line 531
    .line 532
    iget-object v3, v13, LE/t;->a:Ljava/lang/Object;

    .line 533
    .line 534
    invoke-interface {v7}, LE/x;->a()I

    .line 535
    .line 536
    .line 537
    move-result v5

    .line 538
    if-ge v1, v5, :cond_f

    .line 539
    .line 540
    invoke-interface {v7, v1}, LE/x;->b(I)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v5

    .line 544
    invoke-virtual {v5, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result v5

    .line 548
    if-nez v5, :cond_e

    .line 549
    .line 550
    goto :goto_a

    .line 551
    :cond_e
    :goto_9
    move v9, v1

    .line 552
    goto :goto_b

    .line 553
    :cond_f
    :goto_a
    invoke-interface {v7, v3}, LE/x;->d(Ljava/lang/Object;)I

    .line 554
    .line 555
    .line 556
    move-result v1

    .line 557
    if-eq v1, v2, :cond_e

    .line 558
    .line 559
    iput v1, v13, LE/t;->c:I

    .line 560
    .line 561
    goto :goto_9

    .line 562
    :goto_b
    if-eq v9, v2, :cond_10

    .line 563
    .line 564
    const v1, -0x275cf883

    .line 565
    .line 566
    .line 567
    invoke-virtual {v11, v1}, LP/o;->S(I)V

    .line 568
    .line 569
    .line 570
    iget-object v8, v8, LE/u;->a:LZ/c;

    .line 571
    .line 572
    iget-object v10, v13, LE/t;->a:Ljava/lang/Object;

    .line 573
    .line 574
    const/4 v12, 0x0

    .line 575
    invoke-static/range {v7 .. v12}, LE/C;->d(LE/x;Ljava/lang/Object;ILjava/lang/Object;LP/o;I)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v11, v4}, LP/o;->p(Z)V

    .line 579
    .line 580
    .line 581
    goto :goto_c

    .line 582
    :cond_10
    const v1, -0x2759648f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v11, v1}, LP/o;->S(I)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v11, v4}, LP/o;->p(Z)V

    .line 589
    .line 590
    .line 591
    :goto_c
    invoke-virtual {v11, v13}, LP/o;->i(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-result v1

    .line 595
    invoke-virtual {v11}, LP/o;->H()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    if-nez v1, :cond_11

    .line 600
    .line 601
    sget-object v1, LP/k;->a:LP/S;

    .line 602
    .line 603
    if-ne v2, v1, :cond_12

    .line 604
    .line 605
    :cond_11
    new-instance v2, LB0/a;

    .line 606
    .line 607
    const/16 v1, 0x9

    .line 608
    .line 609
    invoke-direct {v2, v1, v13}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v11, v2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    :cond_12
    check-cast v2, LB5/c;

    .line 616
    .line 617
    invoke-static {v3, v2, v11}, LP/b;->c(Ljava/lang/Object;LB5/c;LP/o;)V

    .line 618
    .line 619
    .line 620
    goto :goto_d

    .line 621
    :cond_13
    invoke-virtual {v11}, LP/o;->N()V

    .line 622
    .line 623
    .line 624
    :goto_d
    return-object v6

    .line 625
    :pswitch_c
    move-object/from16 v13, p1

    .line 626
    .line 627
    check-cast v13, LW0/c;

    .line 628
    .line 629
    move-object/from16 v1, p2

    .line 630
    .line 631
    check-cast v1, LW0/a;

    .line 632
    .line 633
    iget-wide v1, v1, LW0/a;->a:J

    .line 634
    .line 635
    invoke-static {v1, v2}, LW0/a;->h(J)I

    .line 636
    .line 637
    .line 638
    move-result v3

    .line 639
    const v6, 0x7fffffff

    .line 640
    .line 641
    .line 642
    if-eq v3, v6, :cond_14

    .line 643
    .line 644
    goto :goto_e

    .line 645
    :cond_14
    const-string v3, "LazyVerticalGrid\'s width should be bound by parent."

    .line 646
    .line 647
    invoke-static {v3}, Lz/a;->a(Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    :goto_e
    invoke-static {v1, v2}, LW0/a;->h(J)I

    .line 651
    .line 652
    .line 653
    move-result v14

    .line 654
    check-cast v8, LD/a;

    .line 655
    .line 656
    move-object v12, v7

    .line 657
    check-cast v12, LA/e;

    .line 658
    .line 659
    invoke-interface {v12}, LA/e;->a()F

    .line 660
    .line 661
    .line 662
    move-result v1

    .line 663
    invoke-interface {v13, v1}, LW0/c;->G(F)I

    .line 664
    .line 665
    .line 666
    move-result v1

    .line 667
    iget v2, v8, LD/a;->a:I

    .line 668
    .line 669
    add-int/lit8 v3, v2, -0x1

    .line 670
    .line 671
    mul-int/2addr v3, v1

    .line 672
    sub-int v1, v14, v3

    .line 673
    .line 674
    div-int v3, v1, v2

    .line 675
    .line 676
    rem-int/2addr v1, v2

    .line 677
    new-instance v6, Ljava/util/ArrayList;

    .line 678
    .line 679
    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 680
    .line 681
    .line 682
    move v7, v4

    .line 683
    :goto_f
    if-ge v7, v2, :cond_16

    .line 684
    .line 685
    if-ge v7, v1, :cond_15

    .line 686
    .line 687
    move v8, v5

    .line 688
    goto :goto_10

    .line 689
    :cond_15
    move v8, v4

    .line 690
    :goto_10
    add-int/2addr v8, v3

    .line 691
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 692
    .line 693
    .line 694
    move-result-object v8

    .line 695
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    add-int/lit8 v7, v7, 0x1

    .line 699
    .line 700
    goto :goto_f

    .line 701
    :cond_16
    invoke-static {v6}, Ln5/l;->A0(Ljava/util/ArrayList;)[I

    .line 702
    .line 703
    .line 704
    move-result-object v15

    .line 705
    array-length v1, v15

    .line 706
    new-array v1, v1, [I

    .line 707
    .line 708
    sget-object v16, LW0/l;->q:LW0/l;

    .line 709
    .line 710
    move-object/from16 v17, v1

    .line 711
    .line 712
    invoke-interface/range {v12 .. v17}, LA/e;->c(LW0/c;I[ILW0/l;[I)V

    .line 713
    .line 714
    .line 715
    new-instance v2, LD/r;

    .line 716
    .line 717
    invoke-direct {v2, v15, v1}, LD/r;-><init>([I[I)V

    .line 718
    .line 719
    .line 720
    return-object v2

    .line 721
    :pswitch_d
    move-object/from16 v1, p1

    .line 722
    .line 723
    check-cast v1, LP/o;

    .line 724
    .line 725
    move-object/from16 v2, p2

    .line 726
    .line 727
    check-cast v2, Ljava/lang/Number;

    .line 728
    .line 729
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 730
    .line 731
    .line 732
    check-cast v8, LC0/A;

    .line 733
    .line 734
    check-cast v7, LB5/e;

    .line 735
    .line 736
    invoke-static {v5}, LP/b;->w(I)I

    .line 737
    .line 738
    .line 739
    move-result v2

    .line 740
    invoke-static {v8, v7, v1, v2}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a(LC0/A;LB5/e;LP/o;I)V

    .line 741
    .line 742
    .line 743
    return-object v6

    .line 744
    :pswitch_e
    move-object/from16 v1, p1

    .line 745
    .line 746
    check-cast v1, Lj0/m;

    .line 747
    .line 748
    move-object/from16 v2, p2

    .line 749
    .line 750
    check-cast v2, Lm0/c;

    .line 751
    .line 752
    check-cast v8, LB0/n0;

    .line 753
    .line 754
    iget-object v3, v8, LB0/n0;->B:LB0/L;

    .line 755
    .line 756
    invoke-virtual {v3}, LB0/L;->G()Z

    .line 757
    .line 758
    .line 759
    move-result v9

    .line 760
    if-eqz v9, :cond_17

    .line 761
    .line 762
    iput-object v1, v8, LB0/n0;->R:Lj0/m;

    .line 763
    .line 764
    iput-object v2, v8, LB0/n0;->Q:Lm0/c;

    .line 765
    .line 766
    invoke-static {v3}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 767
    .line 768
    .line 769
    move-result-object v1

    .line 770
    check-cast v1, LC0/A;

    .line 771
    .line 772
    invoke-virtual {v1}, LC0/A;->getSnapshotObserver()LB0/v0;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    sget-object v2, LB0/n0;->W:Lj0/C;

    .line 777
    .line 778
    sget-object v2, LB0/f;->t:LB0/f;

    .line 779
    .line 780
    check-cast v7, LB0/k0;

    .line 781
    .line 782
    invoke-virtual {v1, v8, v2, v7}, LB0/v0;->a(LB0/u0;LB5/c;LB5/a;)V

    .line 783
    .line 784
    .line 785
    iput-boolean v4, v8, LB0/n0;->U:Z

    .line 786
    .line 787
    goto :goto_11

    .line 788
    :cond_17
    iput-boolean v5, v8, LB0/n0;->U:Z

    .line 789
    .line 790
    :goto_11
    return-object v6

    .line 791
    :pswitch_data_0
    .packed-switch 0x0
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
