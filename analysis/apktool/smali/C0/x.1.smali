.class public final LC0/x;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LC0/A;


# direct methods
.method public synthetic constructor <init>(LC0/A;I)V
    .locals 0

    .line 1
    iput p2, p0, LC0/x;->q:I

    iput-object p1, p0, LC0/x;->r:LC0/A;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, LC0/x;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LB5/a;

    .line 7
    .line 8
    iget-object v0, p0, LC0/x;->r:LC0/A;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    :goto_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-ne v1, v2, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    new-instance v1, LC0/z;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-direct {v1, p1, v2}, LC0/z;-><init>(LB5/a;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 48
    .line 49
    return-object p1

    .line 50
    :pswitch_0
    check-cast p1, Lt0/b;

    .line 51
    .line 52
    iget-object p1, p1, Lt0/b;->a:Landroid/view/KeyEvent;

    .line 53
    .line 54
    iget-object v0, p0, LC0/x;->r:LC0/A;

    .line 55
    .line 56
    iget-object v1, v0, LC0/A;->h0:[I

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-static {v2}, LQ2/g;->d(I)J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    sget-wide v4, Lt0/a;->g:J

    .line 67
    .line 68
    invoke-static {v2, v3, v4, v5}, Lt0/a;->a(JJ)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const/4 v5, 0x2

    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v7, 0x1

    .line 75
    if-eqz v4, :cond_4

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_3

    .line 82
    .line 83
    move v2, v5

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    move v2, v7

    .line 86
    :goto_2
    new-instance v3, Lh0/c;

    .line 87
    .line 88
    invoke-direct {v3, v2}, Lh0/c;-><init>(I)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_8

    .line 92
    .line 93
    :cond_4
    sget-wide v8, Lt0/a;->e:J

    .line 94
    .line 95
    invoke-static {v2, v3, v8, v9}, Lt0/a;->a(JJ)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_5

    .line 100
    .line 101
    new-instance v3, Lh0/c;

    .line 102
    .line 103
    const/4 v2, 0x4

    .line 104
    invoke-direct {v3, v2}, Lh0/c;-><init>(I)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_8

    .line 108
    .line 109
    :cond_5
    sget-wide v8, Lt0/a;->d:J

    .line 110
    .line 111
    invoke-static {v2, v3, v8, v9}, Lt0/a;->a(JJ)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_6

    .line 116
    .line 117
    new-instance v3, Lh0/c;

    .line 118
    .line 119
    const/4 v2, 0x3

    .line 120
    invoke-direct {v3, v2}, Lh0/c;-><init>(I)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_8

    .line 124
    .line 125
    :cond_6
    sget-wide v8, Lt0/a;->b:J

    .line 126
    .line 127
    invoke-static {v2, v3, v8, v9}, Lt0/a;->a(JJ)Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-eqz v4, :cond_7

    .line 132
    .line 133
    move v4, v7

    .line 134
    goto :goto_3

    .line 135
    :cond_7
    sget-wide v8, Lt0/a;->k:J

    .line 136
    .line 137
    invoke-static {v2, v3, v8, v9}, Lt0/a;->a(JJ)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    :goto_3
    if-eqz v4, :cond_8

    .line 142
    .line 143
    new-instance v3, Lh0/c;

    .line 144
    .line 145
    const/4 v2, 0x5

    .line 146
    invoke-direct {v3, v2}, Lh0/c;-><init>(I)V

    .line 147
    .line 148
    .line 149
    goto :goto_8

    .line 150
    :cond_8
    sget-wide v8, Lt0/a;->c:J

    .line 151
    .line 152
    invoke-static {v2, v3, v8, v9}, Lt0/a;->a(JJ)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_9

    .line 157
    .line 158
    move v4, v7

    .line 159
    goto :goto_4

    .line 160
    :cond_9
    sget-wide v8, Lt0/a;->l:J

    .line 161
    .line 162
    invoke-static {v2, v3, v8, v9}, Lt0/a;->a(JJ)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    :goto_4
    if-eqz v4, :cond_a

    .line 167
    .line 168
    new-instance v3, Lh0/c;

    .line 169
    .line 170
    const/4 v2, 0x6

    .line 171
    invoke-direct {v3, v2}, Lh0/c;-><init>(I)V

    .line 172
    .line 173
    .line 174
    goto :goto_8

    .line 175
    :cond_a
    sget-wide v8, Lt0/a;->f:J

    .line 176
    .line 177
    invoke-static {v2, v3, v8, v9}, Lt0/a;->a(JJ)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-eqz v4, :cond_b

    .line 182
    .line 183
    move v4, v7

    .line 184
    goto :goto_5

    .line 185
    :cond_b
    sget-wide v8, Lt0/a;->i:J

    .line 186
    .line 187
    invoke-static {v2, v3, v8, v9}, Lt0/a;->a(JJ)Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    :goto_5
    if-eqz v4, :cond_c

    .line 192
    .line 193
    move v4, v7

    .line 194
    goto :goto_6

    .line 195
    :cond_c
    sget-wide v8, Lt0/a;->m:J

    .line 196
    .line 197
    invoke-static {v2, v3, v8, v9}, Lt0/a;->a(JJ)Z

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    :goto_6
    if-eqz v4, :cond_d

    .line 202
    .line 203
    new-instance v3, Lh0/c;

    .line 204
    .line 205
    const/4 v2, 0x7

    .line 206
    invoke-direct {v3, v2}, Lh0/c;-><init>(I)V

    .line 207
    .line 208
    .line 209
    goto :goto_8

    .line 210
    :cond_d
    sget-wide v8, Lt0/a;->a:J

    .line 211
    .line 212
    invoke-static {v2, v3, v8, v9}, Lt0/a;->a(JJ)Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-eqz v4, :cond_e

    .line 217
    .line 218
    move v2, v7

    .line 219
    goto :goto_7

    .line 220
    :cond_e
    sget-wide v8, Lt0/a;->j:J

    .line 221
    .line 222
    invoke-static {v2, v3, v8, v9}, Lt0/a;->a(JJ)Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    :goto_7
    if-eqz v2, :cond_f

    .line 227
    .line 228
    new-instance v3, Lh0/c;

    .line 229
    .line 230
    const/16 v2, 0x8

    .line 231
    .line 232
    invoke-direct {v3, v2}, Lh0/c;-><init>(I)V

    .line 233
    .line 234
    .line 235
    goto :goto_8

    .line 236
    :cond_f
    move-object v3, v6

    .line 237
    :goto_8
    if-eqz v3, :cond_22

    .line 238
    .line 239
    iget v2, v3, Lh0/c;->a:I

    .line 240
    .line 241
    invoke-static {p1}, LE3/h;->C(Landroid/view/KeyEvent;)I

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    const/4 v4, 0x0

    .line 246
    if-ne p1, v5, :cond_10

    .line 247
    .line 248
    move p1, v7

    .line 249
    goto :goto_9

    .line 250
    :cond_10
    move p1, v4

    .line 251
    :goto_9
    if-nez p1, :cond_11

    .line 252
    .line 253
    goto/16 :goto_12

    .line 254
    .line 255
    :cond_11
    invoke-static {v2}, Lh0/d;->D(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-virtual {v0}, LC0/A;->D()Li0/c;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    invoke-virtual {v0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    new-instance v10, LC0/w;

    .line 268
    .line 269
    const/4 v11, 0x1

    .line 270
    invoke-direct {v10, v3, v11}, LC0/w;-><init>(Lh0/c;I)V

    .line 271
    .line 272
    .line 273
    check-cast v9, Lh0/h;

    .line 274
    .line 275
    invoke-virtual {v9, v2, v8, v10}, Lh0/h;->d(ILi0/c;LB5/c;)Ljava/lang/Boolean;

    .line 276
    .line 277
    .line 278
    move-result-object v9

    .line 279
    if-eqz v9, :cond_12

    .line 280
    .line 281
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 282
    .line 283
    .line 284
    move-result v9

    .line 285
    goto :goto_a

    .line 286
    :cond_12
    move v9, v7

    .line 287
    :goto_a
    if-eqz v9, :cond_13

    .line 288
    .line 289
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 290
    .line 291
    goto/16 :goto_13

    .line 292
    .line 293
    :cond_13
    if-ne v2, v7, :cond_14

    .line 294
    .line 295
    :goto_b
    move v5, v7

    .line 296
    goto :goto_c

    .line 297
    :cond_14
    if-ne v2, v5, :cond_15

    .line 298
    .line 299
    goto :goto_b

    .line 300
    :cond_15
    move v5, v4

    .line 301
    :goto_c
    if-nez v5, :cond_16

    .line 302
    .line 303
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 304
    .line 305
    goto/16 :goto_13

    .line 306
    .line 307
    :cond_16
    if-eqz p1, :cond_1f

    .line 308
    .line 309
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    move-object v10, v0

    .line 318
    :cond_17
    :goto_d
    if-eqz v10, :cond_1a

    .line 319
    .line 320
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 321
    .line 322
    .line 323
    move-result-object v11

    .line 324
    const-string v12, "null cannot be cast to non-null type android.view.ViewGroup"

    .line 325
    .line 326
    invoke-static {v11, v12}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    check-cast v11, Landroid/view/ViewGroup;

    .line 330
    .line 331
    invoke-virtual {v9, v11, v10, v5}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 332
    .line 333
    .line 334
    move-result-object v10

    .line 335
    if-eqz v10, :cond_17

    .line 336
    .line 337
    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v11

    .line 341
    if-eqz v11, :cond_18

    .line 342
    .line 343
    goto :goto_f

    .line 344
    :cond_18
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 345
    .line 346
    .line 347
    move-result-object v11

    .line 348
    :goto_e
    if-eqz v11, :cond_1b

    .line 349
    .line 350
    if-ne v11, v0, :cond_19

    .line 351
    .line 352
    goto :goto_d

    .line 353
    :cond_19
    invoke-interface {v11}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 354
    .line 355
    .line 356
    move-result-object v11

    .line 357
    goto :goto_e

    .line 358
    :cond_1a
    move-object v10, v6

    .line 359
    :cond_1b
    :goto_f
    invoke-static {v10, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    if-nez v5, :cond_1c

    .line 364
    .line 365
    goto :goto_10

    .line 366
    :cond_1c
    move-object v10, v6

    .line 367
    :goto_10
    if-eqz v10, :cond_1f

    .line 368
    .line 369
    if-eqz v8, :cond_1d

    .line 370
    .line 371
    invoke-static {v8}, Lj0/B;->u(Li0/c;)Landroid/graphics/Rect;

    .line 372
    .line 373
    .line 374
    move-result-object v5

    .line 375
    goto :goto_11

    .line 376
    :cond_1d
    move-object v5, v6

    .line 377
    :goto_11
    if-eqz v5, :cond_1e

    .line 378
    .line 379
    invoke-virtual {v10, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 380
    .line 381
    .line 382
    aget v8, v1, v4

    .line 383
    .line 384
    aget v9, v1, v7

    .line 385
    .line 386
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 387
    .line 388
    .line 389
    aget v11, v1, v4

    .line 390
    .line 391
    aget v1, v1, v7

    .line 392
    .line 393
    sub-int/2addr v11, v8

    .line 394
    sub-int/2addr v1, v9

    .line 395
    invoke-virtual {v5, v11, v1}, Landroid/graphics/Rect;->offset(II)V

    .line 396
    .line 397
    .line 398
    invoke-static {v10, p1, v5}, Lh0/d;->z(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z

    .line 399
    .line 400
    .line 401
    move-result p1

    .line 402
    if-eqz p1, :cond_1f

    .line 403
    .line 404
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 405
    .line 406
    goto :goto_13

    .line 407
    :cond_1e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 408
    .line 409
    const-string v0, "Invalid rect"

    .line 410
    .line 411
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw p1

    .line 415
    :cond_1f
    invoke-virtual {v0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 416
    .line 417
    .line 418
    move-result-object p1

    .line 419
    check-cast p1, Lh0/h;

    .line 420
    .line 421
    invoke-virtual {p1, v2, v4, v4}, Lh0/h;->b(IZZ)Z

    .line 422
    .line 423
    .line 424
    move-result p1

    .line 425
    if-nez p1, :cond_20

    .line 426
    .line 427
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 428
    .line 429
    goto :goto_13

    .line 430
    :cond_20
    invoke-virtual {v0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    new-instance v0, LC0/w;

    .line 435
    .line 436
    const/4 v1, 0x0

    .line 437
    invoke-direct {v0, v3, v1}, LC0/w;-><init>(Lh0/c;I)V

    .line 438
    .line 439
    .line 440
    check-cast p1, Lh0/h;

    .line 441
    .line 442
    invoke-virtual {p1, v2, v6, v0}, Lh0/h;->d(ILi0/c;LB5/c;)Ljava/lang/Boolean;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    if-eqz p1, :cond_21

    .line 447
    .line 448
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 449
    .line 450
    .line 451
    move-result v7

    .line 452
    :cond_21
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    goto :goto_13

    .line 457
    :cond_22
    :goto_12
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 458
    .line 459
    :goto_13
    return-object p1

    .line 460
    nop

    .line 461
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
