.class public final synthetic LI5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LI5/m;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, LI5/m;->q:I

    .line 6
    .line 7
    const-string v4, "$this$Json"

    .line 8
    .line 9
    const/4 v5, 0x6

    .line 10
    const/16 v6, 0x2bc

    .line 11
    .line 12
    const-string v7, "$this$initializer"

    .line 13
    .line 14
    const-string v8, "destination"

    .line 15
    .line 16
    const-string v9, ": "

    .line 17
    .line 18
    const-string v10, "       "

    .line 19
    .line 20
    const-string v11, "<destruct>"

    .line 21
    .line 22
    sget-object v13, Lm5/y;->a:Lm5/y;

    .line 23
    .line 24
    const-string v14, "it"

    .line 25
    .line 26
    const/4 v15, 0x0

    .line 27
    const/4 v3, 0x1

    .line 28
    const/4 v12, 0x0

    .line 29
    packed-switch v2, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    check-cast v1, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v1, v14}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, LJ5/m;->n1(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "    "

    .line 46
    .line 47
    invoke-static {v2, v1}, LC0/S;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    return-object v1

    .line 52
    :pswitch_0
    check-cast v1, Ljava/util/Map$Entry;

    .line 53
    .line 54
    invoke-static {v1, v11}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Ljava/lang/String;

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/String;

    .line 68
    .line 69
    new-instance v3, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    return-object v1

    .line 88
    :pswitch_1
    check-cast v1, Ljava/util/Map$Entry;

    .line 89
    .line 90
    invoke-static {v1, v11}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Ljava/lang/String;

    .line 98
    .line 99
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Ljava/lang/String;

    .line 104
    .line 105
    new-instance v3, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    return-object v1

    .line 124
    :pswitch_2
    check-cast v1, LT1/p;

    .line 125
    .line 126
    invoke-static {v1, v14}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object v1, v1, LT1/p;->r:LW1/l;

    .line 130
    .line 131
    iget v1, v1, LW1/l;->a:I

    .line 132
    .line 133
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    return-object v1

    .line 138
    :pswitch_3
    check-cast v1, LT1/p;

    .line 139
    .line 140
    invoke-static {v1, v8}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-object v2, v1, LT1/p;->s:LT1/r;

    .line 144
    .line 145
    if-eqz v2, :cond_0

    .line 146
    .line 147
    iget-object v3, v2, LT1/r;->v:LD/u;

    .line 148
    .line 149
    iget v3, v3, LD/u;->b:I

    .line 150
    .line 151
    iget-object v1, v1, LT1/p;->r:LW1/l;

    .line 152
    .line 153
    iget v1, v1, LW1/l;->a:I

    .line 154
    .line 155
    if-ne v3, v1, :cond_0

    .line 156
    .line 157
    move-object v12, v2

    .line 158
    :cond_0
    return-object v12

    .line 159
    :pswitch_4
    check-cast v1, LT1/p;

    .line 160
    .line 161
    invoke-static {v1, v8}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    iget-object v2, v1, LT1/p;->s:LT1/r;

    .line 165
    .line 166
    if-eqz v2, :cond_1

    .line 167
    .line 168
    iget-object v3, v2, LT1/r;->v:LD/u;

    .line 169
    .line 170
    iget v3, v3, LD/u;->b:I

    .line 171
    .line 172
    iget-object v1, v1, LT1/p;->r:LW1/l;

    .line 173
    .line 174
    iget v1, v1, LW1/l;->a:I

    .line 175
    .line 176
    if-ne v3, v1, :cond_1

    .line 177
    .line 178
    move-object v12, v2

    .line 179
    :cond_1
    return-object v12

    .line 180
    :pswitch_5
    check-cast v1, LP1/c;

    .line 181
    .line 182
    invoke-static {v1, v7}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    new-instance v2, LW1/b;

    .line 186
    .line 187
    invoke-static {v1}, Landroidx/lifecycle/X;->b(LP1/c;)Landroidx/lifecycle/U;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-direct {v2, v1}, LW1/b;-><init>(Landroidx/lifecycle/U;)V

    .line 192
    .line 193
    .line 194
    return-object v2

    .line 195
    :pswitch_6
    check-cast v1, LP/F;

    .line 196
    .line 197
    const-string v2, "$this$DisposableEffect"

    .line 198
    .line 199
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    new-instance v1, LU4/f0;

    .line 203
    .line 204
    invoke-direct {v1, v15}, LU4/f0;-><init>(I)V

    .line 205
    .line 206
    .line 207
    return-object v1

    .line 208
    :pswitch_7
    check-cast v1, Ljava/lang/Boolean;

    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    return-object v13

    .line 214
    :pswitch_8
    check-cast v1, LT1/d;

    .line 215
    .line 216
    iget-object v1, v1, LT1/d;->v:Ljava/lang/String;

    .line 217
    .line 218
    return-object v1

    .line 219
    :pswitch_9
    check-cast v1, Lt/l;

    .line 220
    .line 221
    invoke-static {v6, v5, v12}, Lu/d;->p(IILu/x;)Lu/z0;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-static {v1}, Lt/z;->b(Lu/z0;)Lt/E;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    return-object v1

    .line 230
    :pswitch_a
    check-cast v1, Lt/l;

    .line 231
    .line 232
    invoke-virtual {v1}, Lt/l;->c()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    check-cast v1, LT1/d;

    .line 237
    .line 238
    iget-object v1, v1, LT1/d;->r:LT1/p;

    .line 239
    .line 240
    const-string v2, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination"

    .line 241
    .line 242
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    check-cast v1, LU1/h;

    .line 246
    .line 247
    sget v2, LT1/p;->u:I

    .line 248
    .line 249
    invoke-static {v1}, Ln5/A;->u(LT1/p;)LI5/i;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-interface {v1}, LI5/i;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-eqz v2, :cond_4

    .line 262
    .line 263
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    check-cast v2, LT1/p;

    .line 268
    .line 269
    instance-of v3, v2, LU1/h;

    .line 270
    .line 271
    if-eqz v3, :cond_3

    .line 272
    .line 273
    check-cast v2, LU1/h;

    .line 274
    .line 275
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    goto :goto_0

    .line 279
    :cond_3
    instance-of v3, v2, LU1/f;

    .line 280
    .line 281
    if-eqz v3, :cond_2

    .line 282
    .line 283
    check-cast v2, LU1/f;

    .line 284
    .line 285
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    goto :goto_0

    .line 289
    :cond_4
    return-object v12

    .line 290
    :pswitch_b
    check-cast v1, Lt/l;

    .line 291
    .line 292
    invoke-static {v6, v5, v12}, Lu/d;->p(IILu/x;)Lu/z0;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-static {v1}, Lt/z;->a(Lu/z0;)Lt/D;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    return-object v1

    .line 301
    :pswitch_c
    check-cast v1, LP1/c;

    .line 302
    .line 303
    new-instance v2, LU1/a;

    .line 304
    .line 305
    invoke-static {v1}, Landroidx/lifecycle/X;->b(LP1/c;)Landroidx/lifecycle/U;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-direct {v2, v1}, LU1/a;-><init>(Landroidx/lifecycle/U;)V

    .line 310
    .line 311
    .line 312
    return-object v2

    .line 313
    :pswitch_d
    check-cast v1, LT1/p;

    .line 314
    .line 315
    invoke-static {v1, v14}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    instance-of v2, v1, LT1/r;

    .line 319
    .line 320
    if-eqz v2, :cond_5

    .line 321
    .line 322
    check-cast v1, LT1/r;

    .line 323
    .line 324
    iget-object v1, v1, LT1/r;->v:LD/u;

    .line 325
    .line 326
    iget v2, v1, LD/u;->b:I

    .line 327
    .line 328
    invoke-virtual {v1, v2}, LD/u;->n(I)LT1/p;

    .line 329
    .line 330
    .line 331
    move-result-object v12

    .line 332
    :cond_5
    return-object v12

    .line 333
    :pswitch_e
    check-cast v1, LT1/p;

    .line 334
    .line 335
    invoke-static {v1, v14}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    iget-object v1, v1, LT1/p;->s:LT1/r;

    .line 339
    .line 340
    return-object v1

    .line 341
    :pswitch_f
    check-cast v1, LP1/c;

    .line 342
    .line 343
    invoke-static {v1, v7}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    new-instance v1, LT1/i;

    .line 347
    .line 348
    invoke-direct {v1}, LT1/i;-><init>()V

    .line 349
    .line 350
    .line 351
    return-object v1

    .line 352
    :pswitch_10
    check-cast v1, Landroid/content/Context;

    .line 353
    .line 354
    invoke-static {v1, v14}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 358
    .line 359
    if-eqz v2, :cond_6

    .line 360
    .line 361
    check-cast v1, Landroid/content/ContextWrapper;

    .line 362
    .line 363
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 364
    .line 365
    .line 366
    move-result-object v12

    .line 367
    :cond_6
    return-object v12

    .line 368
    :pswitch_11
    check-cast v1, Landroid/content/Context;

    .line 369
    .line 370
    invoke-static {v1, v14}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 374
    .line 375
    if-eqz v2, :cond_7

    .line 376
    .line 377
    check-cast v1, Landroid/content/ContextWrapper;

    .line 378
    .line 379
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 380
    .line 381
    .line 382
    move-result-object v12

    .line 383
    :cond_7
    return-object v12

    .line 384
    :pswitch_12
    check-cast v1, La6/h;

    .line 385
    .line 386
    invoke-static {v1, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    iput-boolean v3, v1, La6/h;->b:Z

    .line 390
    .line 391
    return-object v13

    .line 392
    :pswitch_13
    check-cast v1, La6/h;

    .line 393
    .line 394
    invoke-static {v1, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    iput-boolean v3, v1, La6/h;->b:Z

    .line 398
    .line 399
    return-object v13

    .line 400
    :pswitch_14
    check-cast v1, Lq5/f;

    .line 401
    .line 402
    instance-of v2, v1, LM5/s;

    .line 403
    .line 404
    if-eqz v2, :cond_8

    .line 405
    .line 406
    move-object v12, v1

    .line 407
    check-cast v12, LM5/s;

    .line 408
    .line 409
    :cond_8
    return-object v12

    .line 410
    :pswitch_15
    check-cast v1, Ljava/lang/Character;

    .line 411
    .line 412
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    const/16 v2, 0x30

    .line 417
    .line 418
    if-gt v2, v1, :cond_9

    .line 419
    .line 420
    const/16 v2, 0x3a

    .line 421
    .line 422
    if-ge v1, v2, :cond_9

    .line 423
    .line 424
    move v15, v3

    .line 425
    :cond_9
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    return-object v1

    .line 430
    :pswitch_16
    const/16 v2, 0x3a

    .line 431
    .line 432
    check-cast v1, Ljava/lang/Character;

    .line 433
    .line 434
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    if-ne v1, v2, :cond_a

    .line 439
    .line 440
    move v15, v3

    .line 441
    :cond_a
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    return-object v1

    .line 446
    :pswitch_17
    const/16 v2, 0x3a

    .line 447
    .line 448
    check-cast v1, Ljava/lang/Character;

    .line 449
    .line 450
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    .line 451
    .line 452
    .line 453
    move-result v1

    .line 454
    if-ne v1, v2, :cond_b

    .line 455
    .line 456
    move v15, v3

    .line 457
    :cond_b
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    return-object v1

    .line 462
    :pswitch_18
    check-cast v1, Ljava/lang/Character;

    .line 463
    .line 464
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    const/16 v2, 0x54

    .line 469
    .line 470
    if-eq v1, v2, :cond_c

    .line 471
    .line 472
    const/16 v2, 0x74

    .line 473
    .line 474
    if-ne v1, v2, :cond_d

    .line 475
    .line 476
    :cond_c
    move v15, v3

    .line 477
    :cond_d
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    return-object v1

    .line 482
    :pswitch_19
    check-cast v1, Ljava/lang/Character;

    .line 483
    .line 484
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    .line 485
    .line 486
    .line 487
    move-result v1

    .line 488
    const/16 v2, 0x2d

    .line 489
    .line 490
    if-ne v1, v2, :cond_e

    .line 491
    .line 492
    move v15, v3

    .line 493
    :cond_e
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    return-object v1

    .line 498
    :pswitch_1a
    const/16 v2, 0x2d

    .line 499
    .line 500
    check-cast v1, Ljava/lang/Character;

    .line 501
    .line 502
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    .line 503
    .line 504
    .line 505
    move-result v1

    .line 506
    if-ne v1, v2, :cond_f

    .line 507
    .line 508
    move v15, v3

    .line 509
    :cond_f
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    return-object v1

    .line 514
    :pswitch_1b
    if-nez v1, :cond_10

    .line 515
    .line 516
    move v15, v3

    .line 517
    :cond_10
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    return-object v1

    .line 522
    :pswitch_1c
    invoke-static {v1, v14}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    const/high16 v1, 0x7fff0000

    .line 526
    .line 527
    sget-object v2, LE5/c;->a:LE5/a;

    .line 528
    .line 529
    invoke-virtual {v2, v1}, LE5/c;->a(I)I

    .line 530
    .line 531
    .line 532
    move-result v1

    .line 533
    const/high16 v2, 0x10000

    .line 534
    .line 535
    add-int/2addr v1, v2

    .line 536
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    return-object v1

    .line 541
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
