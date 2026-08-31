.class public final synthetic LC0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LC0/m;->q:I

    iput-object p2, p0, LC0/m;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 39

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LC0/m;->q:I

    .line 4
    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x1

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->t:Landroid/widget/EditText;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lv4/j;

    .line 24
    .line 25
    iget-object v2, v0, Lv4/j;->h:Landroid/widget/AutoCompleteTextView;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {v0, v2}, Lv4/j;->t(Z)V

    .line 32
    .line 33
    .line 34
    iput-boolean v2, v0, Lv4/j;->m:Z

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lv4/d;

    .line 40
    .line 41
    invoke-virtual {v0, v5}, Lv4/d;->t(Z)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_2
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lc4/f;

    .line 48
    .line 49
    iput-boolean v4, v0, Lc4/f;->c:Z

    .line 50
    .line 51
    iget-object v2, v0, Lc4/f;->e:Li1/b;

    .line 52
    .line 53
    check-cast v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 54
    .line 55
    iget-object v4, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:LD1/d;

    .line 56
    .line 57
    if-eqz v4, :cond_0

    .line 58
    .line 59
    invoke-virtual {v4}, LD1/d;->f()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_0

    .line 64
    .line 65
    iget v2, v0, Lc4/f;->b:I

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Lc4/f;->a(I)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    iget v4, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 72
    .line 73
    if-ne v4, v3, :cond_1

    .line 74
    .line 75
    iget v0, v0, Lc4/f;->b:I

    .line 76
    .line 77
    invoke-virtual {v2, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    .line 78
    .line 79
    .line 80
    :cond_1
    :goto_0
    return-void

    .line 81
    :pswitch_3
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Landroid/webkit/WebView;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    const/4 v3, -0x1

    .line 90
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 91
    .line 92
    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_4
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, LU4/r;

    .line 99
    .line 100
    iget-object v2, v0, LU4/r;->b:LR4/k1;

    .line 101
    .line 102
    iget-object v3, v2, LR4/k1;->k:Landroid/webkit/WebView;

    .line 103
    .line 104
    if-eqz v3, :cond_2

    .line 105
    .line 106
    iget v2, v2, LR4/k1;->Z:I

    .line 107
    .line 108
    invoke-virtual {v3, v4, v2}, Landroid/view/View;->scrollTo(II)V

    .line 109
    .line 110
    .line 111
    :cond_2
    iget-object v0, v0, LU4/r;->b:LR4/k1;

    .line 112
    .line 113
    iput-boolean v5, v0, LR4/k1;->a0:Z

    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_5
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 117
    .line 118
    move-object v2, v0

    .line 119
    check-cast v2, Landroid/app/Activity;

    .line 120
    .line 121
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-nez v0, :cond_c

    .line 126
    .line 127
    sget-object v3, Lk1/b;->g:Landroid/os/Handler;

    .line 128
    .line 129
    sget-object v0, Lk1/b;->f:Ljava/lang/reflect/Method;

    .line 130
    .line 131
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 132
    .line 133
    const/16 v7, 0x1c

    .line 134
    .line 135
    if-lt v6, v7, :cond_3

    .line 136
    .line 137
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_5

    .line 141
    .line 142
    :cond_3
    const/16 v7, 0x1a

    .line 143
    .line 144
    const/16 v8, 0x1b

    .line 145
    .line 146
    if-eq v6, v7, :cond_4

    .line 147
    .line 148
    if-ne v6, v8, :cond_5

    .line 149
    .line 150
    :cond_4
    if-nez v0, :cond_5

    .line 151
    .line 152
    goto/16 :goto_4

    .line 153
    .line 154
    :cond_5
    sget-object v9, Lk1/b;->e:Ljava/lang/reflect/Method;

    .line 155
    .line 156
    if-nez v9, :cond_6

    .line 157
    .line 158
    sget-object v9, Lk1/b;->d:Ljava/lang/reflect/Method;

    .line 159
    .line 160
    if-nez v9, :cond_6

    .line 161
    .line 162
    goto/16 :goto_4

    .line 163
    .line 164
    :cond_6
    :try_start_0
    sget-object v9, Lk1/b;->c:Ljava/lang/reflect/Field;

    .line 165
    .line 166
    invoke-virtual {v9, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    if-nez v10, :cond_7

    .line 171
    .line 172
    goto/16 :goto_4

    .line 173
    .line 174
    :cond_7
    sget-object v9, Lk1/b;->b:Ljava/lang/reflect/Field;

    .line 175
    .line 176
    invoke-virtual {v9, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    if-nez v9, :cond_8

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_8
    invoke-virtual {v2}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    new-instance v12, Lk1/a;

    .line 188
    .line 189
    invoke-direct {v12, v2}, Lk1/a;-><init>(Landroid/app/Activity;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v11, v12}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 193
    .line 194
    .line 195
    new-instance v13, LI4/a;

    .line 196
    .line 197
    const/16 v14, 0x19

    .line 198
    .line 199
    invoke-direct {v13, v14, v12, v10}, LI4/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3, v13}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 203
    .line 204
    .line 205
    if-eq v6, v7, :cond_a

    .line 206
    .line 207
    if-ne v6, v8, :cond_9

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_9
    move v5, v4

    .line 211
    :cond_a
    :goto_1
    if-eqz v5, :cond_b

    .line 212
    .line 213
    :try_start_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v13

    .line 217
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 218
    .line 219
    const/4 v15, 0x0

    .line 220
    const/16 v16, 0x0

    .line 221
    .line 222
    move-object v4, v11

    .line 223
    const/4 v11, 0x0

    .line 224
    move-object v5, v12

    .line 225
    const/4 v12, 0x0

    .line 226
    move-object/from16 v17, v14

    .line 227
    .line 228
    move-object/from16 v18, v14

    .line 229
    .line 230
    :try_start_2
    filled-new-array/range {v10 .. v18}, [Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    invoke-virtual {v0, v9, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :catchall_0
    move-exception v0

    .line 239
    goto :goto_3

    .line 240
    :catchall_1
    move-exception v0

    .line 241
    move-object v4, v11

    .line 242
    move-object v5, v12

    .line 243
    goto :goto_3

    .line 244
    :cond_b
    move-object v4, v11

    .line 245
    move-object v5, v12

    .line 246
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 247
    .line 248
    .line 249
    :goto_2
    :try_start_3
    new-instance v0, LI4/a;

    .line 250
    .line 251
    invoke-direct {v0, v7, v4, v5}, LI4/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 255
    .line 256
    .line 257
    goto :goto_5

    .line 258
    :goto_3
    new-instance v6, LI4/a;

    .line 259
    .line 260
    invoke-direct {v6, v7, v4, v5}, LI4/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 264
    .line 265
    .line 266
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 267
    :catchall_2
    :goto_4
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V

    .line 268
    .line 269
    .line 270
    :cond_c
    :goto_5
    return-void

    .line 271
    :pswitch_6
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 274
    .line 275
    invoke-virtual {v0}, Ld2/G;->l0()V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :pswitch_7
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v0, Le0/c;

    .line 282
    .line 283
    invoke-virtual {v0}, Le0/c;->i()Z

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    iget-object v7, v0, Le0/c;->B:Lr/v;

    .line 288
    .line 289
    iget-object v8, v0, Le0/c;->q:LC0/A;

    .line 290
    .line 291
    if-nez v6, :cond_d

    .line 292
    .line 293
    goto/16 :goto_1d

    .line 294
    .line 295
    :cond_d
    invoke-virtual {v8, v5}, LC0/A;->z(Z)V

    .line 296
    .line 297
    .line 298
    iget-object v5, v7, Lr/k;->b:[I

    .line 299
    .line 300
    iget-object v6, v7, Lr/k;->a:[J

    .line 301
    .line 302
    array-length v9, v6

    .line 303
    sub-int/2addr v9, v3

    .line 304
    const/4 v14, 0x7

    .line 305
    const/16 v15, 0x8

    .line 306
    .line 307
    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    if-ltz v9, :cond_12

    .line 313
    .line 314
    move v10, v4

    .line 315
    const-wide/16 v18, 0x80

    .line 316
    .line 317
    const-wide/16 v20, 0xff

    .line 318
    .line 319
    :goto_6
    aget-wide v12, v6, v10

    .line 320
    .line 321
    move/from16 v22, v3

    .line 322
    .line 323
    not-long v2, v12

    .line 324
    shl-long/2addr v2, v14

    .line 325
    and-long/2addr v2, v12

    .line 326
    and-long v2, v2, v16

    .line 327
    .line 328
    cmp-long v2, v2, v16

    .line 329
    .line 330
    if-eqz v2, :cond_11

    .line 331
    .line 332
    sub-int v2, v10, v9

    .line 333
    .line 334
    not-int v2, v2

    .line 335
    ushr-int/lit8 v2, v2, 0x1f

    .line 336
    .line 337
    rsub-int/lit8 v2, v2, 0x8

    .line 338
    .line 339
    move v3, v4

    .line 340
    :goto_7
    if-ge v3, v2, :cond_10

    .line 341
    .line 342
    and-long v23, v12, v20

    .line 343
    .line 344
    cmp-long v23, v23, v18

    .line 345
    .line 346
    if-gez v23, :cond_f

    .line 347
    .line 348
    shl-int/lit8 v23, v10, 0x3

    .line 349
    .line 350
    add-int v23, v23, v3

    .line 351
    .line 352
    aget v11, v5, v23

    .line 353
    .line 354
    move/from16 v23, v14

    .line 355
    .line 356
    invoke-virtual {v0}, Le0/c;->h()Lr/k;

    .line 357
    .line 358
    .line 359
    move-result-object v14

    .line 360
    invoke-virtual {v14, v11}, Lr/k;->a(I)Z

    .line 361
    .line 362
    .line 363
    move-result v14

    .line 364
    if-nez v14, :cond_e

    .line 365
    .line 366
    iget-object v14, v0, Le0/c;->t:Ljava/util/ArrayList;

    .line 367
    .line 368
    new-instance v24, Le0/d;

    .line 369
    .line 370
    move-object/from16 v30, v5

    .line 371
    .line 372
    iget-wide v4, v0, Le0/c;->A:J

    .line 373
    .line 374
    sget-object v28, Le0/e;->r:Le0/e;

    .line 375
    .line 376
    const/16 v29, 0x0

    .line 377
    .line 378
    move-wide/from16 v26, v4

    .line 379
    .line 380
    move/from16 v25, v11

    .line 381
    .line 382
    invoke-direct/range {v24 .. v29}, Le0/d;-><init>(IJLe0/e;Lk3/c;)V

    .line 383
    .line 384
    .line 385
    move-object/from16 v4, v24

    .line 386
    .line 387
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    iget-object v4, v0, Le0/c;->x:LO5/e;

    .line 391
    .line 392
    sget-object v5, Lm5/y;->a:Lm5/y;

    .line 393
    .line 394
    invoke-interface {v4, v5}, LO5/w;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    goto :goto_8

    .line 398
    :cond_e
    move-object/from16 v30, v5

    .line 399
    .line 400
    goto :goto_8

    .line 401
    :cond_f
    move-object/from16 v30, v5

    .line 402
    .line 403
    move/from16 v23, v14

    .line 404
    .line 405
    :goto_8
    shr-long/2addr v12, v15

    .line 406
    add-int/lit8 v3, v3, 0x1

    .line 407
    .line 408
    move/from16 v14, v23

    .line 409
    .line 410
    move-object/from16 v5, v30

    .line 411
    .line 412
    const/4 v4, 0x0

    .line 413
    goto :goto_7

    .line 414
    :cond_10
    move-object/from16 v30, v5

    .line 415
    .line 416
    move/from16 v23, v14

    .line 417
    .line 418
    if-ne v2, v15, :cond_13

    .line 419
    .line 420
    goto :goto_9

    .line 421
    :cond_11
    move-object/from16 v30, v5

    .line 422
    .line 423
    move/from16 v23, v14

    .line 424
    .line 425
    :goto_9
    if-eq v10, v9, :cond_13

    .line 426
    .line 427
    add-int/lit8 v10, v10, 0x1

    .line 428
    .line 429
    move/from16 v3, v22

    .line 430
    .line 431
    move/from16 v14, v23

    .line 432
    .line 433
    move-object/from16 v5, v30

    .line 434
    .line 435
    const/4 v4, 0x0

    .line 436
    goto :goto_6

    .line 437
    :cond_12
    move/from16 v22, v3

    .line 438
    .line 439
    move/from16 v23, v14

    .line 440
    .line 441
    const-wide/16 v18, 0x80

    .line 442
    .line 443
    const-wide/16 v20, 0xff

    .line 444
    .line 445
    :cond_13
    invoke-virtual {v8}, LC0/A;->getSemanticsOwner()LI0/n;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-virtual {v2}, LI0/n;->a()LI0/m;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    iget-object v3, v0, Le0/c;->C:LC0/V0;

    .line 454
    .line 455
    invoke-virtual {v0, v2, v3}, Le0/c;->k(LI0/m;LC0/V0;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0}, Le0/c;->h()Lr/k;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    iget-object v3, v2, Lr/k;->b:[I

    .line 463
    .line 464
    iget-object v4, v2, Lr/k;->a:[J

    .line 465
    .line 466
    array-length v5, v4

    .line 467
    add-int/lit8 v5, v5, -0x2

    .line 468
    .line 469
    if-ltz v5, :cond_2a

    .line 470
    .line 471
    const/4 v6, 0x0

    .line 472
    :goto_a
    aget-wide v9, v4, v6

    .line 473
    .line 474
    not-long v11, v9

    .line 475
    shl-long v11, v11, v23

    .line 476
    .line 477
    and-long/2addr v11, v9

    .line 478
    and-long v11, v11, v16

    .line 479
    .line 480
    cmp-long v11, v11, v16

    .line 481
    .line 482
    if-eqz v11, :cond_29

    .line 483
    .line 484
    sub-int v11, v6, v5

    .line 485
    .line 486
    not-int v11, v11

    .line 487
    ushr-int/lit8 v11, v11, 0x1f

    .line 488
    .line 489
    rsub-int/lit8 v11, v11, 0x8

    .line 490
    .line 491
    const/4 v12, 0x0

    .line 492
    :goto_b
    if-ge v12, v11, :cond_28

    .line 493
    .line 494
    and-long v13, v9, v20

    .line 495
    .line 496
    cmp-long v13, v13, v18

    .line 497
    .line 498
    if-gez v13, :cond_27

    .line 499
    .line 500
    shl-int/lit8 v13, v6, 0x3

    .line 501
    .line 502
    add-int/2addr v13, v12

    .line 503
    aget v13, v3, v13

    .line 504
    .line 505
    invoke-virtual {v7, v13}, Lr/k;->b(I)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v14

    .line 509
    check-cast v14, LC0/V0;

    .line 510
    .line 511
    invoke-virtual {v2, v13}, Lr/k;->b(I)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v13

    .line 515
    check-cast v13, LC0/W0;

    .line 516
    .line 517
    if-eqz v13, :cond_14

    .line 518
    .line 519
    iget-object v13, v13, LC0/W0;->a:LI0/m;

    .line 520
    .line 521
    goto :goto_c

    .line 522
    :cond_14
    const/4 v13, 0x0

    .line 523
    :goto_c
    if-eqz v13, :cond_26

    .line 524
    .line 525
    move/from16 v24, v15

    .line 526
    .line 527
    iget v15, v13, LI0/m;->g:I

    .line 528
    .line 529
    iget-object v13, v13, LI0/m;->d:LI0/i;

    .line 530
    .line 531
    iget-object v13, v13, LI0/i;->q:Lr/G;

    .line 532
    .line 533
    if-nez v14, :cond_1c

    .line 534
    .line 535
    iget-object v14, v13, Lr/G;->b:[Ljava/lang/Object;

    .line 536
    .line 537
    move-object/from16 v25, v2

    .line 538
    .line 539
    iget-object v2, v13, Lr/G;->a:[J

    .line 540
    .line 541
    move-object/from16 v26, v3

    .line 542
    .line 543
    array-length v3, v2

    .line 544
    add-int/lit8 v3, v3, -0x2

    .line 545
    .line 546
    if-ltz v3, :cond_1b

    .line 547
    .line 548
    move-object/from16 v27, v2

    .line 549
    .line 550
    move-object/from16 v28, v8

    .line 551
    .line 552
    move-wide/from16 v30, v9

    .line 553
    .line 554
    const/4 v2, 0x0

    .line 555
    :goto_d
    aget-wide v8, v27, v2

    .line 556
    .line 557
    move-object v10, v4

    .line 558
    move/from16 v29, v5

    .line 559
    .line 560
    not-long v4, v8

    .line 561
    shl-long v4, v4, v23

    .line 562
    .line 563
    and-long/2addr v4, v8

    .line 564
    and-long v4, v4, v16

    .line 565
    .line 566
    cmp-long v4, v4, v16

    .line 567
    .line 568
    if-eqz v4, :cond_1a

    .line 569
    .line 570
    sub-int v4, v2, v3

    .line 571
    .line 572
    not-int v4, v4

    .line 573
    ushr-int/lit8 v4, v4, 0x1f

    .line 574
    .line 575
    rsub-int/lit8 v4, v4, 0x8

    .line 576
    .line 577
    const/4 v5, 0x0

    .line 578
    :goto_e
    if-ge v5, v4, :cond_19

    .line 579
    .line 580
    and-long v32, v8, v20

    .line 581
    .line 582
    cmp-long v32, v32, v18

    .line 583
    .line 584
    if-gez v32, :cond_17

    .line 585
    .line 586
    shl-int/lit8 v32, v2, 0x3

    .line 587
    .line 588
    add-int v32, v32, v5

    .line 589
    .line 590
    aget-object v32, v14, v32

    .line 591
    .line 592
    move/from16 v33, v5

    .line 593
    .line 594
    move-object/from16 v5, v32

    .line 595
    .line 596
    check-cast v5, LI0/s;

    .line 597
    .line 598
    move-wide/from16 v34, v8

    .line 599
    .line 600
    sget-object v8, LI0/p;->y:LI0/s;

    .line 601
    .line 602
    invoke-static {v5, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    move-result v5

    .line 606
    if-eqz v5, :cond_18

    .line 607
    .line 608
    invoke-virtual {v13, v8}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v5

    .line 612
    if-nez v5, :cond_15

    .line 613
    .line 614
    const/4 v5, 0x0

    .line 615
    :cond_15
    check-cast v5, Ljava/util/List;

    .line 616
    .line 617
    if-eqz v5, :cond_16

    .line 618
    .line 619
    invoke-static {v5}, Ln5/l;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v5

    .line 623
    check-cast v5, LL0/d;

    .line 624
    .line 625
    goto :goto_f

    .line 626
    :cond_16
    const/4 v5, 0x0

    .line 627
    :goto_f
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v5

    .line 631
    invoke-virtual {v0, v15, v5}, Le0/c;->l(ILjava/lang/String;)V

    .line 632
    .line 633
    .line 634
    goto :goto_10

    .line 635
    :cond_17
    move/from16 v33, v5

    .line 636
    .line 637
    move-wide/from16 v34, v8

    .line 638
    .line 639
    :cond_18
    :goto_10
    shr-long v8, v34, v24

    .line 640
    .line 641
    add-int/lit8 v5, v33, 0x1

    .line 642
    .line 643
    goto :goto_e

    .line 644
    :cond_19
    move/from16 v5, v24

    .line 645
    .line 646
    if-ne v4, v5, :cond_25

    .line 647
    .line 648
    :cond_1a
    if-eq v2, v3, :cond_25

    .line 649
    .line 650
    add-int/lit8 v2, v2, 0x1

    .line 651
    .line 652
    move-object v4, v10

    .line 653
    move/from16 v5, v29

    .line 654
    .line 655
    const/16 v24, 0x8

    .line 656
    .line 657
    goto :goto_d

    .line 658
    :cond_1b
    move/from16 v29, v5

    .line 659
    .line 660
    move-object/from16 v28, v8

    .line 661
    .line 662
    move-wide/from16 v30, v9

    .line 663
    .line 664
    move-object v10, v4

    .line 665
    goto/16 :goto_17

    .line 666
    .line 667
    :cond_1c
    move-object/from16 v25, v2

    .line 668
    .line 669
    move-object/from16 v26, v3

    .line 670
    .line 671
    move/from16 v29, v5

    .line 672
    .line 673
    move-object/from16 v28, v8

    .line 674
    .line 675
    move-wide/from16 v30, v9

    .line 676
    .line 677
    move-object v10, v4

    .line 678
    iget-object v2, v13, Lr/G;->b:[Ljava/lang/Object;

    .line 679
    .line 680
    iget-object v3, v13, Lr/G;->a:[J

    .line 681
    .line 682
    array-length v4, v3

    .line 683
    add-int/lit8 v4, v4, -0x2

    .line 684
    .line 685
    if-ltz v4, :cond_25

    .line 686
    .line 687
    const/4 v5, 0x0

    .line 688
    :goto_11
    aget-wide v8, v3, v5

    .line 689
    .line 690
    move-object/from16 v27, v2

    .line 691
    .line 692
    move-object/from16 v32, v3

    .line 693
    .line 694
    not-long v2, v8

    .line 695
    shl-long v2, v2, v23

    .line 696
    .line 697
    and-long/2addr v2, v8

    .line 698
    and-long v2, v2, v16

    .line 699
    .line 700
    cmp-long v2, v2, v16

    .line 701
    .line 702
    if-eqz v2, :cond_24

    .line 703
    .line 704
    sub-int v2, v5, v4

    .line 705
    .line 706
    not-int v2, v2

    .line 707
    ushr-int/lit8 v2, v2, 0x1f

    .line 708
    .line 709
    const/16 v24, 0x8

    .line 710
    .line 711
    rsub-int/lit8 v2, v2, 0x8

    .line 712
    .line 713
    const/4 v3, 0x0

    .line 714
    :goto_12
    if-ge v3, v2, :cond_23

    .line 715
    .line 716
    and-long v33, v8, v20

    .line 717
    .line 718
    cmp-long v33, v33, v18

    .line 719
    .line 720
    if-gez v33, :cond_22

    .line 721
    .line 722
    shl-int/lit8 v33, v5, 0x3

    .line 723
    .line 724
    add-int v33, v33, v3

    .line 725
    .line 726
    aget-object v33, v27, v33

    .line 727
    .line 728
    move/from16 v34, v3

    .line 729
    .line 730
    move-object/from16 v3, v33

    .line 731
    .line 732
    check-cast v3, LI0/s;

    .line 733
    .line 734
    move-wide/from16 v35, v8

    .line 735
    .line 736
    sget-object v8, LI0/p;->y:LI0/s;

    .line 737
    .line 738
    invoke-static {v3, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    move-result v3

    .line 742
    if-eqz v3, :cond_21

    .line 743
    .line 744
    iget-object v3, v14, LC0/V0;->a:LI0/i;

    .line 745
    .line 746
    iget-object v3, v3, LI0/i;->q:Lr/G;

    .line 747
    .line 748
    invoke-virtual {v3, v8}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v3

    .line 752
    if-nez v3, :cond_1d

    .line 753
    .line 754
    const/4 v3, 0x0

    .line 755
    :cond_1d
    check-cast v3, Ljava/util/List;

    .line 756
    .line 757
    if-eqz v3, :cond_1e

    .line 758
    .line 759
    invoke-static {v3}, Ln5/l;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v3

    .line 763
    check-cast v3, LL0/d;

    .line 764
    .line 765
    goto :goto_13

    .line 766
    :cond_1e
    const/4 v3, 0x0

    .line 767
    :goto_13
    invoke-virtual {v13, v8}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v8

    .line 771
    if-nez v8, :cond_1f

    .line 772
    .line 773
    const/4 v8, 0x0

    .line 774
    :cond_1f
    check-cast v8, Ljava/util/List;

    .line 775
    .line 776
    if-eqz v8, :cond_20

    .line 777
    .line 778
    invoke-static {v8}, Ln5/l;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v8

    .line 782
    check-cast v8, LL0/d;

    .line 783
    .line 784
    goto :goto_14

    .line 785
    :cond_20
    const/4 v8, 0x0

    .line 786
    :goto_14
    invoke-static {v3, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    move-result v3

    .line 790
    if-nez v3, :cond_21

    .line 791
    .line 792
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v3

    .line 796
    invoke-virtual {v0, v15, v3}, Le0/c;->l(ILjava/lang/String;)V

    .line 797
    .line 798
    .line 799
    :cond_21
    :goto_15
    const/16 v3, 0x8

    .line 800
    .line 801
    goto :goto_16

    .line 802
    :cond_22
    move/from16 v34, v3

    .line 803
    .line 804
    move-wide/from16 v35, v8

    .line 805
    .line 806
    goto :goto_15

    .line 807
    :goto_16
    shr-long v8, v35, v3

    .line 808
    .line 809
    add-int/lit8 v24, v34, 0x1

    .line 810
    .line 811
    move/from16 v3, v24

    .line 812
    .line 813
    goto :goto_12

    .line 814
    :cond_23
    const/16 v3, 0x8

    .line 815
    .line 816
    if-ne v2, v3, :cond_25

    .line 817
    .line 818
    :cond_24
    if-eq v5, v4, :cond_25

    .line 819
    .line 820
    add-int/lit8 v5, v5, 0x1

    .line 821
    .line 822
    move-object/from16 v2, v27

    .line 823
    .line 824
    move-object/from16 v3, v32

    .line 825
    .line 826
    goto/16 :goto_11

    .line 827
    .line 828
    :cond_25
    :goto_17
    const/16 v3, 0x8

    .line 829
    .line 830
    goto :goto_18

    .line 831
    :cond_26
    const-string v0, "no value for specified key"

    .line 832
    .line 833
    invoke-static {v0}, LC0/S;->i(Ljava/lang/String;)LC2/e;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    throw v0

    .line 838
    :cond_27
    move-object/from16 v25, v2

    .line 839
    .line 840
    move-object/from16 v26, v3

    .line 841
    .line 842
    move/from16 v29, v5

    .line 843
    .line 844
    move-object/from16 v28, v8

    .line 845
    .line 846
    move-wide/from16 v30, v9

    .line 847
    .line 848
    move-object v10, v4

    .line 849
    move v3, v15

    .line 850
    :goto_18
    shr-long v4, v30, v3

    .line 851
    .line 852
    add-int/lit8 v12, v12, 0x1

    .line 853
    .line 854
    move-wide/from16 v37, v4

    .line 855
    .line 856
    move-object v4, v10

    .line 857
    move-wide/from16 v9, v37

    .line 858
    .line 859
    move v15, v3

    .line 860
    move-object/from16 v2, v25

    .line 861
    .line 862
    move-object/from16 v3, v26

    .line 863
    .line 864
    move-object/from16 v8, v28

    .line 865
    .line 866
    move/from16 v5, v29

    .line 867
    .line 868
    goto/16 :goto_b

    .line 869
    .line 870
    :cond_28
    move-object/from16 v25, v2

    .line 871
    .line 872
    move-object/from16 v26, v3

    .line 873
    .line 874
    move-object v10, v4

    .line 875
    move/from16 v29, v5

    .line 876
    .line 877
    move-object/from16 v28, v8

    .line 878
    .line 879
    move v3, v15

    .line 880
    if-ne v11, v3, :cond_2b

    .line 881
    .line 882
    move/from16 v5, v29

    .line 883
    .line 884
    goto :goto_19

    .line 885
    :cond_29
    move-object/from16 v25, v2

    .line 886
    .line 887
    move-object/from16 v26, v3

    .line 888
    .line 889
    move-object v10, v4

    .line 890
    move-object/from16 v28, v8

    .line 891
    .line 892
    :goto_19
    if-eq v6, v5, :cond_2b

    .line 893
    .line 894
    add-int/lit8 v6, v6, 0x1

    .line 895
    .line 896
    move-object v4, v10

    .line 897
    move-object/from16 v2, v25

    .line 898
    .line 899
    move-object/from16 v3, v26

    .line 900
    .line 901
    move-object/from16 v8, v28

    .line 902
    .line 903
    const/16 v15, 0x8

    .line 904
    .line 905
    goto/16 :goto_a

    .line 906
    .line 907
    :cond_2a
    move-object/from16 v28, v8

    .line 908
    .line 909
    :cond_2b
    invoke-virtual {v7}, Lr/v;->c()V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v0}, Le0/c;->h()Lr/k;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    iget-object v3, v2, Lr/k;->b:[I

    .line 917
    .line 918
    iget-object v4, v2, Lr/k;->c:[Ljava/lang/Object;

    .line 919
    .line 920
    iget-object v2, v2, Lr/k;->a:[J

    .line 921
    .line 922
    array-length v5, v2

    .line 923
    add-int/lit8 v5, v5, -0x2

    .line 924
    .line 925
    if-ltz v5, :cond_2f

    .line 926
    .line 927
    const/4 v6, 0x0

    .line 928
    :goto_1a
    aget-wide v8, v2, v6

    .line 929
    .line 930
    not-long v10, v8

    .line 931
    shl-long v10, v10, v23

    .line 932
    .line 933
    and-long/2addr v10, v8

    .line 934
    and-long v10, v10, v16

    .line 935
    .line 936
    cmp-long v10, v10, v16

    .line 937
    .line 938
    if-eqz v10, :cond_2e

    .line 939
    .line 940
    sub-int v10, v6, v5

    .line 941
    .line 942
    not-int v10, v10

    .line 943
    ushr-int/lit8 v10, v10, 0x1f

    .line 944
    .line 945
    const/16 v24, 0x8

    .line 946
    .line 947
    rsub-int/lit8 v15, v10, 0x8

    .line 948
    .line 949
    const/4 v10, 0x0

    .line 950
    :goto_1b
    if-ge v10, v15, :cond_2d

    .line 951
    .line 952
    and-long v11, v8, v20

    .line 953
    .line 954
    cmp-long v11, v11, v18

    .line 955
    .line 956
    if-gez v11, :cond_2c

    .line 957
    .line 958
    shl-int/lit8 v11, v6, 0x3

    .line 959
    .line 960
    add-int/2addr v11, v10

    .line 961
    aget v12, v3, v11

    .line 962
    .line 963
    aget-object v11, v4, v11

    .line 964
    .line 965
    check-cast v11, LC0/W0;

    .line 966
    .line 967
    new-instance v13, LC0/V0;

    .line 968
    .line 969
    iget-object v11, v11, LC0/W0;->a:LI0/m;

    .line 970
    .line 971
    invoke-virtual {v0}, Le0/c;->h()Lr/k;

    .line 972
    .line 973
    .line 974
    move-result-object v14

    .line 975
    invoke-direct {v13, v11, v14}, LC0/V0;-><init>(LI0/m;Lr/k;)V

    .line 976
    .line 977
    .line 978
    invoke-virtual {v7, v12, v13}, Lr/v;->h(ILjava/lang/Object;)V

    .line 979
    .line 980
    .line 981
    :cond_2c
    const/16 v11, 0x8

    .line 982
    .line 983
    shr-long/2addr v8, v11

    .line 984
    add-int/lit8 v10, v10, 0x1

    .line 985
    .line 986
    goto :goto_1b

    .line 987
    :cond_2d
    const/16 v11, 0x8

    .line 988
    .line 989
    if-ne v15, v11, :cond_2f

    .line 990
    .line 991
    goto :goto_1c

    .line 992
    :cond_2e
    const/16 v11, 0x8

    .line 993
    .line 994
    :goto_1c
    if-eq v6, v5, :cond_2f

    .line 995
    .line 996
    add-int/lit8 v6, v6, 0x1

    .line 997
    .line 998
    goto :goto_1a

    .line 999
    :cond_2f
    new-instance v2, LC0/V0;

    .line 1000
    .line 1001
    invoke-virtual/range {v28 .. v28}, LC0/A;->getSemanticsOwner()LI0/n;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v3

    .line 1005
    invoke-virtual {v3}, LI0/n;->a()LI0/m;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v3

    .line 1009
    invoke-virtual {v0}, Le0/c;->h()Lr/k;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v4

    .line 1013
    invoke-direct {v2, v3, v4}, LC0/V0;-><init>(LI0/m;Lr/k;)V

    .line 1014
    .line 1015
    .line 1016
    iput-object v2, v0, Le0/c;->C:LC0/V0;

    .line 1017
    .line 1018
    const/4 v2, 0x0

    .line 1019
    iput-boolean v2, v0, Le0/c;->D:Z

    .line 1020
    .line 1021
    :goto_1d
    return-void

    .line 1022
    :pswitch_8
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1023
    .line 1024
    check-cast v0, Lcom/google/firebase/installations/FirebaseInstallations;

    .line 1025
    .line 1026
    invoke-static {v0}, Lcom/google/firebase/installations/FirebaseInstallations;->d(Lcom/google/firebase/installations/FirebaseInstallations;)V

    .line 1027
    .line 1028
    .line 1029
    return-void

    .line 1030
    :pswitch_9
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1031
    .line 1032
    check-cast v0, Lcom/google/android/material/timepicker/e;

    .line 1033
    .line 1034
    invoke-virtual {v0}, Lcom/google/android/material/timepicker/e;->l()V

    .line 1035
    .line 1036
    .line 1037
    return-void

    .line 1038
    :pswitch_a
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1039
    .line 1040
    check-cast v0, Lb/m;

    .line 1041
    .line 1042
    invoke-static {v0}, Lb/m;->c(Lb/m;)V

    .line 1043
    .line 1044
    .line 1045
    return-void

    .line 1046
    :pswitch_b
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1047
    .line 1048
    check-cast v0, Lb/h;

    .line 1049
    .line 1050
    iget-object v2, v0, Lb/h;->r:Ljava/lang/Runnable;

    .line 1051
    .line 1052
    if-eqz v2, :cond_30

    .line 1053
    .line 1054
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 1055
    .line 1056
    .line 1057
    const/4 v11, 0x0

    .line 1058
    iput-object v11, v0, Lb/h;->r:Ljava/lang/Runnable;

    .line 1059
    .line 1060
    :cond_30
    return-void

    .line 1061
    :pswitch_c
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1062
    .line 1063
    check-cast v0, LM5/b0;

    .line 1064
    .line 1065
    invoke-static {v0}, Landroidx/work/ListenableFutureKt;->e(LM5/b0;)V

    .line 1066
    .line 1067
    .line 1068
    return-void

    .line 1069
    :pswitch_d
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1070
    .line 1071
    check-cast v0, Landroidx/lifecycle/O;

    .line 1072
    .line 1073
    iget-object v2, v0, Landroidx/lifecycle/O;->v:Landroidx/lifecycle/z;

    .line 1074
    .line 1075
    iget v3, v0, Landroidx/lifecycle/O;->r:I

    .line 1076
    .line 1077
    if-nez v3, :cond_31

    .line 1078
    .line 1079
    iput-boolean v5, v0, Landroidx/lifecycle/O;->s:Z

    .line 1080
    .line 1081
    sget-object v3, Landroidx/lifecycle/o;->ON_PAUSE:Landroidx/lifecycle/o;

    .line 1082
    .line 1083
    invoke-virtual {v2, v3}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 1084
    .line 1085
    .line 1086
    :cond_31
    iget v3, v0, Landroidx/lifecycle/O;->q:I

    .line 1087
    .line 1088
    if-nez v3, :cond_32

    .line 1089
    .line 1090
    iget-boolean v3, v0, Landroidx/lifecycle/O;->s:Z

    .line 1091
    .line 1092
    if-eqz v3, :cond_32

    .line 1093
    .line 1094
    sget-object v3, Landroidx/lifecycle/o;->ON_STOP:Landroidx/lifecycle/o;

    .line 1095
    .line 1096
    invoke-virtual {v2, v3}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 1097
    .line 1098
    .line 1099
    iput-boolean v5, v0, Landroidx/lifecycle/O;->t:Z

    .line 1100
    .line 1101
    :cond_32
    return-void

    .line 1102
    :pswitch_e
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1103
    .line 1104
    check-cast v0, La5/y;

    .line 1105
    .line 1106
    invoke-virtual {v0, v5}, La5/y;->c(Z)V

    .line 1107
    .line 1108
    .line 1109
    return-void

    .line 1110
    :pswitch_f
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1111
    .line 1112
    check-cast v0, La3/F;

    .line 1113
    .line 1114
    invoke-virtual {v0}, La3/F;->c()V

    .line 1115
    .line 1116
    .line 1117
    return-void

    .line 1118
    :pswitch_10
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1119
    .line 1120
    check-cast v0, Ljava/io/ByteArrayInputStream;

    .line 1121
    .line 1122
    invoke-static {v0}, Ln3/i;->b(Ljava/io/Closeable;)V

    .line 1123
    .line 1124
    .line 1125
    return-void

    .line 1126
    :pswitch_11
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1127
    .line 1128
    check-cast v0, Landroid/app/NotificationManager;

    .line 1129
    .line 1130
    invoke-virtual {v0, v5}, Landroid/app/NotificationManager;->cancel(I)V

    .line 1131
    .line 1132
    .line 1133
    return-void

    .line 1134
    :pswitch_12
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1135
    .line 1136
    check-cast v0, LR4/s0;

    .line 1137
    .line 1138
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1139
    .line 1140
    const/16 v3, 0x1e

    .line 1141
    .line 1142
    if-lt v2, v3, :cond_33

    .line 1143
    .line 1144
    invoke-virtual {v0}, LR4/s0;->d()V

    .line 1145
    .line 1146
    .line 1147
    goto :goto_1e

    .line 1148
    :cond_33
    invoke-virtual {v0}, LR4/s0;->c()V

    .line 1149
    .line 1150
    .line 1151
    :goto_1e
    return-void

    .line 1152
    :pswitch_13
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1153
    .line 1154
    check-cast v0, LR4/k;

    .line 1155
    .line 1156
    const/4 v2, 0x0

    .line 1157
    iput-boolean v2, v0, LR4/k;->c:Z

    .line 1158
    .line 1159
    return-void

    .line 1160
    :pswitch_14
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1161
    .line 1162
    check-cast v0, LL/k;

    .line 1163
    .line 1164
    invoke-static {v0}, LL/k;->a(LL/k;)V

    .line 1165
    .line 1166
    .line 1167
    return-void

    .line 1168
    :pswitch_15
    move/from16 v22, v3

    .line 1169
    .line 1170
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1171
    .line 1172
    move-object v2, v0

    .line 1173
    check-cast v2, LE1/v;

    .line 1174
    .line 1175
    const-string v0, "fetchFonts result is not OK. ("

    .line 1176
    .line 1177
    iget-object v3, v2, LE1/v;->d:Ljava/lang/Object;

    .line 1178
    .line 1179
    monitor-enter v3

    .line 1180
    :try_start_4
    iget-object v4, v2, LE1/v;->h:Ll6/d;

    .line 1181
    .line 1182
    if-nez v4, :cond_34

    .line 1183
    .line 1184
    monitor-exit v3

    .line 1185
    goto/16 :goto_25

    .line 1186
    .line 1187
    :catchall_3
    move-exception v0

    .line 1188
    goto/16 :goto_27

    .line 1189
    .line 1190
    :cond_34
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 1191
    :try_start_5
    invoke-virtual {v2}, LE1/v;->c()Ls1/h;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v3

    .line 1195
    iget v4, v3, Ls1/h;->e:I

    .line 1196
    .line 1197
    move/from16 v5, v22

    .line 1198
    .line 1199
    if-ne v4, v5, :cond_35

    .line 1200
    .line 1201
    iget-object v5, v2, LE1/v;->d:Ljava/lang/Object;

    .line 1202
    .line 1203
    monitor-enter v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1204
    :try_start_6
    monitor-exit v5

    .line 1205
    goto :goto_1f

    .line 1206
    :catchall_4
    move-exception v0

    .line 1207
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 1208
    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 1209
    :catchall_5
    move-exception v0

    .line 1210
    goto/16 :goto_23

    .line 1211
    .line 1212
    :cond_35
    :goto_1f
    if-nez v4, :cond_38

    .line 1213
    .line 1214
    :try_start_8
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 1215
    .line 1216
    sget v4, Lr1/g;->a:I

    .line 1217
    .line 1218
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1219
    .line 1220
    .line 1221
    iget-object v0, v2, LE1/v;->c:Ls4/e;

    .line 1222
    .line 1223
    iget-object v4, v2, LE1/v;->a:Landroid/content/Context;

    .line 1224
    .line 1225
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1226
    .line 1227
    .line 1228
    filled-new-array {v3}, [Ls1/h;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v0

    .line 1232
    sget-object v5, Ln1/e;->a:LQ2/g;

    .line 1233
    .line 1234
    const-string v5, "TypefaceCompat.createFromFontInfo"

    .line 1235
    .line 1236
    invoke-static {v5}, LE3/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v5

    .line 1240
    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 1241
    .line 1242
    .line 1243
    :try_start_9
    sget-object v5, Ln1/e;->a:LQ2/g;

    .line 1244
    .line 1245
    const/4 v6, 0x0

    .line 1246
    invoke-virtual {v5, v4, v0, v6}, LQ2/g;->t(Landroid/content/Context;[Ls1/h;I)Landroid/graphics/Typeface;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1250
    :try_start_a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1251
    .line 1252
    .line 1253
    iget-object v4, v2, LE1/v;->a:Landroid/content/Context;

    .line 1254
    .line 1255
    iget-object v3, v3, Ls1/h;->a:Landroid/net/Uri;

    .line 1256
    .line 1257
    invoke-static {v4, v3}, La/a;->I(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 1261
    if-eqz v3, :cond_37

    .line 1262
    .line 1263
    if-eqz v0, :cond_37

    .line 1264
    .line 1265
    :try_start_b
    const-string v4, "EmojiCompat.MetadataRepo.create"

    .line 1266
    .line 1267
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1268
    .line 1269
    .line 1270
    new-instance v4, LE/c0;

    .line 1271
    .line 1272
    invoke-static {v3}, Ly4/b;->y(Ljava/nio/MappedByteBuffer;)LF1/b;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v3

    .line 1276
    invoke-direct {v4, v0, v3}, LE/c0;-><init>(Landroid/graphics/Typeface;LF1/b;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 1277
    .line 1278
    .line 1279
    :try_start_c
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 1280
    .line 1281
    .line 1282
    :try_start_d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1283
    .line 1284
    .line 1285
    iget-object v3, v2, LE1/v;->d:Ljava/lang/Object;

    .line 1286
    .line 1287
    monitor-enter v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 1288
    :try_start_e
    iget-object v0, v2, LE1/v;->h:Ll6/d;

    .line 1289
    .line 1290
    if-eqz v0, :cond_36

    .line 1291
    .line 1292
    invoke-virtual {v0, v4}, Ll6/d;->A(LE/c0;)V

    .line 1293
    .line 1294
    .line 1295
    goto :goto_20

    .line 1296
    :catchall_6
    move-exception v0

    .line 1297
    goto :goto_21

    .line 1298
    :cond_36
    :goto_20
    monitor-exit v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 1299
    :try_start_f
    invoke-virtual {v2}, LE1/v;->b()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 1300
    .line 1301
    .line 1302
    goto :goto_25

    .line 1303
    :goto_21
    :try_start_10
    monitor-exit v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 1304
    :try_start_11
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    .line 1305
    :catchall_7
    move-exception v0

    .line 1306
    :try_start_12
    sget v3, Lr1/g;->a:I

    .line 1307
    .line 1308
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1309
    .line 1310
    .line 1311
    throw v0

    .line 1312
    :cond_37
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1313
    .line 1314
    const-string v3, "Unable to open file."

    .line 1315
    .line 1316
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1317
    .line 1318
    .line 1319
    throw v0

    .line 1320
    :catchall_8
    move-exception v0

    .line 1321
    goto :goto_22

    .line 1322
    :catchall_9
    move-exception v0

    .line 1323
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1324
    .line 1325
    .line 1326
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 1327
    :goto_22
    :try_start_13
    sget v3, Lr1/g;->a:I

    .line 1328
    .line 1329
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1330
    .line 1331
    .line 1332
    throw v0

    .line 1333
    :cond_38
    new-instance v3, Ljava/lang/RuntimeException;

    .line 1334
    .line 1335
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1336
    .line 1337
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1338
    .line 1339
    .line 1340
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1341
    .line 1342
    .line 1343
    const-string v0, ")"

    .line 1344
    .line 1345
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1346
    .line 1347
    .line 1348
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v0

    .line 1352
    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1353
    .line 1354
    .line 1355
    throw v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    .line 1356
    :goto_23
    iget-object v4, v2, LE1/v;->d:Ljava/lang/Object;

    .line 1357
    .line 1358
    monitor-enter v4

    .line 1359
    :try_start_14
    iget-object v3, v2, LE1/v;->h:Ll6/d;

    .line 1360
    .line 1361
    if-eqz v3, :cond_39

    .line 1362
    .line 1363
    invoke-virtual {v3, v0}, Ll6/d;->z(Ljava/lang/Throwable;)V

    .line 1364
    .line 1365
    .line 1366
    goto :goto_24

    .line 1367
    :catchall_a
    move-exception v0

    .line 1368
    goto :goto_26

    .line 1369
    :cond_39
    :goto_24
    monitor-exit v4
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    .line 1370
    invoke-virtual {v2}, LE1/v;->b()V

    .line 1371
    .line 1372
    .line 1373
    :goto_25
    return-void

    .line 1374
    :goto_26
    :try_start_15
    monitor-exit v4
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 1375
    throw v0

    .line 1376
    :goto_27
    :try_start_16
    monitor-exit v3
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    .line 1377
    throw v0

    .line 1378
    :pswitch_16
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1379
    .line 1380
    check-cast v0, LC0/I;

    .line 1381
    .line 1382
    const-string v2, "measureAndLayout"

    .line 1383
    .line 1384
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1385
    .line 1386
    .line 1387
    :try_start_17
    iget-object v2, v0, LC0/I;->d:LC0/A;

    .line 1388
    .line 1389
    invoke-virtual {v2, v5}, LC0/A;->z(Z)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_c

    .line 1390
    .line 1391
    .line 1392
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1393
    .line 1394
    .line 1395
    const-string v2, "checkForSemanticsChanges"

    .line 1396
    .line 1397
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1398
    .line 1399
    .line 1400
    :try_start_18
    invoke-virtual {v0}, LC0/I;->n()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_b

    .line 1401
    .line 1402
    .line 1403
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1404
    .line 1405
    .line 1406
    const/4 v2, 0x0

    .line 1407
    iput-boolean v2, v0, LC0/I;->L:Z

    .line 1408
    .line 1409
    return-void

    .line 1410
    :catchall_b
    move-exception v0

    .line 1411
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1412
    .line 1413
    .line 1414
    throw v0

    .line 1415
    :catchall_c
    move-exception v0

    .line 1416
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1417
    .line 1418
    .line 1419
    throw v0

    .line 1420
    :pswitch_17
    iget-object v0, v1, LC0/m;->r:Ljava/lang/Object;

    .line 1421
    .line 1422
    check-cast v0, LC0/A;

    .line 1423
    .line 1424
    const/4 v2, 0x0

    .line 1425
    iput-boolean v2, v0, LC0/A;->M0:Z

    .line 1426
    .line 1427
    iget-object v2, v0, LC0/A;->G0:Landroid/view/MotionEvent;

    .line 1428
    .line 1429
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 1430
    .line 1431
    .line 1432
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 1433
    .line 1434
    .line 1435
    move-result v3

    .line 1436
    const/16 v4, 0xa

    .line 1437
    .line 1438
    if-ne v3, v4, :cond_3a

    .line 1439
    .line 1440
    invoke-virtual {v0, v2}, LC0/A;->N(Landroid/view/MotionEvent;)I

    .line 1441
    .line 1442
    .line 1443
    return-void

    .line 1444
    :cond_3a
    const-string v0, "The ACTION_HOVER_EXIT event was not cleared."

    .line 1445
    .line 1446
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 1447
    .line 1448
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1449
    .line 1450
    .line 1451
    throw v2

    .line 1452
    nop

    .line 1453
    :pswitch_data_0
    .packed-switch 0x0
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
